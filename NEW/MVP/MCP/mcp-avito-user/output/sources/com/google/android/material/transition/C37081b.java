package com.google.android.material.transition;

/* compiled from: FadeModeEvaluators.java */
/* renamed from: com.google.android.material.transition.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37081b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f357750a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final C10647b f357751b = new C10647b();

    /* compiled from: FadeModeEvaluators.java */
    /* renamed from: com.google.android.material.transition.b$a */
    public class a implements InterfaceC37080a {
        @Override // com.google.android.material.transition.InterfaceC37080a
        public final C37082c a(float f12, float f13, float f14) {
            return new C37082c(255, D.e(f13, f14, f12, 0, 255), true);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* renamed from: com.google.android.material.transition.b$b, reason: collision with other inner class name */
    public class C10647b implements InterfaceC37080a {
        @Override // com.google.android.material.transition.InterfaceC37080a
        public final C37082c a(float f12, float f13, float f14) {
            return new C37082c(D.e(f13, f14, f12, 255, 0), 255, false);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* renamed from: com.google.android.material.transition.b$c */
    public class c implements InterfaceC37080a {
        @Override // com.google.android.material.transition.InterfaceC37080a
        public final C37082c a(float f12, float f13, float f14) {
            return new C37082c(D.e(f13, f14, f12, 255, 0), D.e(f13, f14, f12, 0, 255), false);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* renamed from: com.google.android.material.transition.b$d */
    public class d implements InterfaceC37080a {
        @Override // com.google.android.material.transition.InterfaceC37080a
        public final C37082c a(float f12, float f13, float f14) {
            float fC2 = androidx.appcompat.app.r.c(f14, f13, 0.35f, f13);
            return new C37082c(D.e(f13, fC2, f12, 255, 0), D.e(fC2, f14, f12, 0, 255), false);
        }
    }

    static {
        new c();
        new d();
    }
}
