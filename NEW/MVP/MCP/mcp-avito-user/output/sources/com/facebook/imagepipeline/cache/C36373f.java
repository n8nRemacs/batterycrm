package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.MemoryTrimType;
import com.facebook.imagepipeline.cache.H;
import com.facebook.infer.annotation.Nullsafe;
import uW0.C48986a;

/* compiled from: BitmapMemoryCacheTrimStrategy.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.cache.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C36373f implements H.a {

    /* compiled from: BitmapMemoryCacheTrimStrategy.java */
    /* renamed from: com.facebook.imagepipeline.cache.f$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f340226a;

        static {
            int[] iArr = new int[MemoryTrimType.values().length];
            f340226a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340226a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f340226a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f340226a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f340226a[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.facebook.imagepipeline.cache.H.a
    public final double a(MemoryTrimType memoryTrimType) {
        int iOrdinal = memoryTrimType.ordinal();
        if (iOrdinal == 0) {
            return 0.5d;
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            return 1.0d;
        }
        C48986a.m("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", memoryTrimType);
        return 0.0d;
    }
}
