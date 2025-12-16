package androidx.transition;

import java.util.ArrayList;

/* compiled from: FragmentTransitionSupport.java */
/* renamed from: androidx.transition.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23506q extends P {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f54837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f54838b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f54839c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f54840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C23505p f54841e;

    public C23506q(C23505p c23505p, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f54841e = c23505p;
        this.f54837a = obj;
        this.f54838b = arrayList;
        this.f54839c = obj2;
        this.f54840d = arrayList2;
    }

    @Override // androidx.transition.P, androidx.transition.L.f
    public final void d(@j.N L l12) {
        C23505p c23505p = this.f54841e;
        Object obj = this.f54837a;
        if (obj != null) {
            c23505p.s(obj, this.f54838b, null);
        }
        Object obj2 = this.f54839c;
        if (obj2 != null) {
            c23505p.s(obj2, this.f54840d, null);
        }
    }

    @Override // androidx.transition.P, androidx.transition.L.f
    public final void e(@j.N L l12) {
        l12.A(this);
    }
}
