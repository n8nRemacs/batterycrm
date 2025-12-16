package com.facebook.cache.common;

import android.util.Base64;
import com.adjust.sdk.Constants;
import com.facebook.infer.annotation.Nullsafe;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* compiled from: CacheKeyUtil.java */
@Nullsafe
/* loaded from: classes5.dex */
public final class d {
    public static ArrayList a(c cVar) {
        try {
            if (cVar instanceof g) {
                ((g) cVar).getClass();
                throw null;
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(cVar.b() ? cVar.a() : b(cVar));
            return arrayList;
        } catch (UnsupportedEncodingException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static String b(c cVar) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bytes = cVar.a().getBytes(Constants.ENCODING);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes, 0, bytes.length);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException e12) {
            throw new RuntimeException(e12);
        }
    }
}
