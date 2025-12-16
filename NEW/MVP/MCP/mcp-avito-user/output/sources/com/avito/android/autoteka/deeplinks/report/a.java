package com.avito.android.autoteka.deeplinks.report;

import Ju.AbstractC14250d;
import android.content.Intent;
import com.avito.android.autoteka.deeplinks.AutotekaReportLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaReportDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f96300l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AutotekaReportLink f96301m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, AutotekaReportLink autotekaReportLink) {
        super(0);
        this.f96300l = bVar;
        this.f96301m = autotekaReportLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = this.f96300l;
        Intent intentB = bVar.f96304h.b(this.f96301m.f96234b);
        intentB.addFlags(67108864);
        bVar.f96302f.R(intentB, com.avito.android.deeplink_handler.view.b.f134588l);
        bVar.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
