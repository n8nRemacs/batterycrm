package com.google.android.material.transition.platform;

import j.X;

/* compiled from: FadeModeEvaluators.java */
@X
/* renamed from: com.google.android.material.transition.platform.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37086b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f357856a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final C10648b f357857b = new C10648b();

    /* compiled from: FadeModeEvaluators.java */
    /* renamed from: com.google.android.material.transition.platform.b$a */
    public class a implements InterfaceC37085a {
        @Override // com.google.android.material.transition.platform.InterfaceC37085a
        public final C37087c a(float f12, float f13, float f14) {
            return new C37087c(255, H.e(f13, f14, f12, 0, 255), true);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* renamed from: com.google.android.material.transition.platform.b$b, reason: collision with other inner class name */
    public class C10648b implements InterfaceC37085a {
        @Override // com.google.android.material.transition.platform.InterfaceC37085a
        public final C37087c a(float f12, float f13, float f14) {
            return new C37087c(H.e(f13, f14, f12, 255, 0), 255, false);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* renamed from: com.google.android.material.transition.platform.b$c */
    public class c implements InterfaceC37085a {
        @Override // com.google.android.material.transition.platform.InterfaceC37085a
        public final C37087c a(float f12, float f13, float f14) {
            return new C37087c(H.e(f13, f14, f12, 255, 0), H.e(f13, f14, f12, 0, 255), false);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* renamed from: com.google.android.material.transition.platform.b$d */
    public class d implements InterfaceC37085a {
        @Override // com.google.android.material.transition.platform.InterfaceC37085a
        public final C37087c a(float f12, float f13, float f14) {
            float fC2 = androidx.appcompat.app.r.c(f14, f13, 0.35f, f13);
            return new C37087c(H.e(f13, fC2, f12, 255, 0), H.e(fC2, f14, f12, 0, 255), false);
        }
    }

    static {
        new c();
        new d();
    }
}
