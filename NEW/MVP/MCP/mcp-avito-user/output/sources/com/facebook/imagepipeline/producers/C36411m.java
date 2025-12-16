package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.io.ByteArrayInputStream;

/* compiled from: DataFetchProducer.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C36411m extends M {
    @Override // com.facebook.imagepipeline.producers.M
    public final YW0.d d(ImageRequest imageRequest) {
        boolean zEquals;
        byte[] bytes;
        String string = imageRequest.f340782b.toString();
        if (!string.substring(0, 5).equals("data:")) {
            throw new IllegalArgumentException();
        }
        int iIndexOf = string.indexOf(44);
        String strSubstring = string.substring(iIndexOf + 1, string.length());
        String strSubstring2 = string.substring(0, iIndexOf);
        if (strSubstring2.contains(";")) {
            zEquals = strSubstring2.split(";")[r5.length - 1].equals("base64");
        } else {
            zEquals = false;
        }
        if (zEquals) {
            bytes = Base64.decode(strSubstring, 0);
        } else {
            String strDecode = Uri.decode(strSubstring);
            strDecode.getClass();
            bytes = strDecode.getBytes();
        }
        return c(bytes.length, new ByteArrayInputStream(bytes));
    }

    @Override // com.facebook.imagepipeline.producers.M
    public final String e() {
        return "DataFetchProducer";
    }
}
