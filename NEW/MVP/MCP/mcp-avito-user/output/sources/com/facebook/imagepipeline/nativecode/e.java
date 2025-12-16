package com.facebook.imagepipeline.nativecode;

import com.facebook.infer.annotation.Nullsafe;
import iX0.C41358a;

/* compiled from: NativeJpegTranscoderSoLoader.java */
@Nullsafe
/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f340503a;

    public static synchronized void a() {
        if (!f340503a) {
            C41358a.c("native-imagetranscoder");
            f340503a = true;
        }
    }
}
