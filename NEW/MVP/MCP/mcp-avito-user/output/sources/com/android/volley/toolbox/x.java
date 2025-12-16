package com.android.volley.toolbox;

import com.android.volley.ParseError;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: JsonArrayRequest.java */
/* loaded from: classes10.dex */
public class x extends z<JSONArray> {
    @Override // com.android.volley.Request
    public final com.android.volley.w<JSONArray> m(com.android.volley.r rVar) {
        try {
            return new com.android.volley.w<>(new JSONArray(new String(rVar.f67100b, n.c("utf-8", rVar.f67101c))), n.b(rVar));
        } catch (UnsupportedEncodingException e12) {
            return new com.android.volley.w<>(new ParseError(e12));
        } catch (JSONException e13) {
            return new com.android.volley.w<>(new ParseError(e13));
        }
    }
}
