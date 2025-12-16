package com.bumptech.glide.load;

import com.adjust.sdk.Constants;
import j.N;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: Key.java */
/* loaded from: classes5.dex */
public interface h {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f339193a = Charset.forName(Constants.ENCODING);

    void b(@N MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
