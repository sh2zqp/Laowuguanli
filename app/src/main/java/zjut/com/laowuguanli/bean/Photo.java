package zjut.com.laowuguanli.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Photo {
    private static final String JSON_FILENAME = "filename";
    private String mFilename;

    public Photo(String filename) {
        mFilename = filename;
    }

    public Photo(JSONObject jsonObject) throws JSONException {
        mFilename = jsonObject.getString(JSON_FILENAME);
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(JSON_FILENAME,mFilename);
        return jsonObject;
    }

    public String getFilename() {
        return mFilename;
    }
}
