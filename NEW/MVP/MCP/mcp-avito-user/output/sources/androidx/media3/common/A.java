package androidx.media3.common;

import java.util.HashSet;

/* compiled from: MediaLibraryInfo.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f47108a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    public static String f47109b = "media3.common";

    public static synchronized void a(String str) {
        if (f47108a.add(str)) {
            f47109b += ", " + str;
        }
    }
}
