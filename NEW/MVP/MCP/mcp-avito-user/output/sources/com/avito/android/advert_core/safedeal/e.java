package com.avito.android.advert_core.safedeal;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class e implements l41.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f84192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f84193c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f84194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f84195e;

    public /* synthetic */ e(String str, boolean z12, int i12, Object obj) {
        this.f84192b = i12;
        this.f84195e = obj;
        this.f84193c = str;
        this.f84194d = z12;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f84192b) {
            case 0:
                f fVar = (f) this.f84195e;
                return fVar.f84197b.get().d(fVar.f84196a, this.f84193c, this.f84194d);
            default:
                return ((com.avito.android.user_advert.advert.delegate.auto_publish.c) this.f84195e).f308524a.get().n(this.f84193c, this.f84194d);
        }
    }
}
