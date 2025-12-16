package org.mockito.internal.junit;

import org.mockito.quality.Strictness;

/* compiled from: UniversalTestListener.java */
/* loaded from: classes7.dex */
public class q implements k, org.mockito.internal.listeners.a {

    /* compiled from: UniversalTestListener.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421681a;

        static {
            int[] iArr = new int[Strictness.values().length];
            f421681a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421681a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421681a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // g81.c
    public final void a(Object obj, N71.a aVar) {
        throw null;
    }
}
