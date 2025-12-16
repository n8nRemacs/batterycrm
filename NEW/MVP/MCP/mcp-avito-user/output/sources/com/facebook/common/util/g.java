package com.facebook.common.util;

import I41.h;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.adjust.sdk.Constants;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: UriUtil.java */
@Nullsafe
/* loaded from: classes5.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f339869a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    @h
    public static String a(@h Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static boolean b(Uri uri) {
        String string = uri.toString();
        return string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean c(@h Uri uri) {
        String strA = a(uri);
        return Constants.SCHEME.equals(strA) || "http".equals(strA);
    }
}
