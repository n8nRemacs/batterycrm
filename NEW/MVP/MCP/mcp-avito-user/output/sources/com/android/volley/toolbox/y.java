package com.android.volley.toolbox;

import com.android.volley.ParseError;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonObjectRequest.java */
/* loaded from: classes10.dex */
public class y extends z<JSONObject> {
    @Override // com.android.volley.Request
    public final com.android.volley.w<JSONObject> m(com.android.volley.r rVar) {
        try {
            return new com.android.volley.w<>(new JSONObject(new String(rVar.f67100b, n.c("utf-8", rVar.f67101c))), n.b(rVar));
        } catch (UnsupportedEncodingException e12) {
            return new com.android.volley.w<>(new ParseError(e12));
        } catch (JSONException e13) {
            return new com.android.volley.w<>(new ParseError(e13));
        }
    }
}
