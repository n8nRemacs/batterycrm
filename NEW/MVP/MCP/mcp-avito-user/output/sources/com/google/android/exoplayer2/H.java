package com.google.android.exoplayer2;

import java.util.HashSet;

/* compiled from: ExoPlayerLibraryInfo.java */
/* loaded from: classes6.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f343454a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    public static String f343455b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f343454a.add(str)) {
            f343455b += ", " + str;
        }
    }
}
