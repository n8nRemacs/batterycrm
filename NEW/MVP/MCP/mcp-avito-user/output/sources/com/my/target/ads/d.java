package com.my.target.ads;

import com.my.target.Z;
import com.my.target.p1;
import e11.AbstractC39858c1;
import e11.D1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class d implements Z.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f364687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f364688c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1.a f364689d;

    public /* synthetic */ d(e eVar, p1.a aVar, int i12) {
        this.f364687b = i12;
        this.f364688c = eVar;
        this.f364689d = aVar;
    }

    @Override // com.my.target.Z.b
    public final void c(AbstractC39858c1 abstractC39858c1, String str) {
        p1.a aVar = this.f364689d;
        e eVar = this.f364688c;
        D1 d12 = (D1) abstractC39858c1;
        switch (this.f364687b) {
            case 0:
                int i12 = e.f364690j;
                eVar.a(d12, str, aVar);
                break;
            default:
                int i13 = e.f364690j;
                eVar.a(d12, str, aVar);
                break;
        }
    }
}
