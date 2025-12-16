package com.android.volley.toolbox;

import com.android.volley.Request;
import java.io.UnsupportedEncodingException;

/* compiled from: StringRequest.java */
/* loaded from: classes10.dex */
public class I extends Request<String> {
    @Override // com.android.volley.Request
    public final void c(String str) {
        throw null;
    }

    @Override // com.android.volley.Request
    public final com.android.volley.w<String> m(com.android.volley.r rVar) {
        String str;
        byte[] bArr = rVar.f67100b;
        try {
            str = new String(bArr, n.c("ISO-8859-1", rVar.f67101c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new com.android.volley.w<>(str, n.b(rVar));
    }
}
