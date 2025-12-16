package com.avito.android.advert.item.consultation.view_model;

import com.avito.android.advert_core.short_term_rent.j;
import l41.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class d implements s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f74836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f74837c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f74838d;

    public /* synthetic */ d(int i12, Object obj, boolean z12) {
        this.f74836b = i12;
        this.f74838d = obj;
        this.f74837c = z12;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f74836b) {
            case 0:
                return ((e) this.f74838d).f74840J.get().d(Boolean.valueOf(this.f74837c));
            default:
                j jVar = (j) this.f74838d;
                return jVar.f84350b.get().o(this.f74837c, jVar.f84349a);
        }
    }
}
