package com.avito.android.services_realty_sheet.link;

import com.avito.android.services_realty_sheet.link.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import pv0.C47152a;

/* compiled from: ServicesRealtySheetLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f280422l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f280423m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, String str) {
        super(0);
        this.f280422l = eVar;
        this.f280423m = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f280422l;
        eVar.f280434j.c(new C47152a(this.f280423m));
        eVar.f280433i.b();
        eVar.j(h.b.f280442b);
        return G0.f406611a;
    }
}
