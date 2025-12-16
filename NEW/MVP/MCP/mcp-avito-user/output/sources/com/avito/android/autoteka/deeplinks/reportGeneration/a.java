package com.avito.android.autoteka.deeplinks.reportGeneration;

import Ju.AbstractC14250d;
import android.content.Intent;
import com.avito.android.autoteka.deeplinks.AutotekaReportGenerationLink;
import com.avito.android.autoteka.presentation.reportGeneration.AutotekaReportGenerationActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaReportGenerationDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f96308l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AutotekaReportGenerationLink f96309m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, AutotekaReportGenerationLink autotekaReportGenerationLink) {
        super(0);
        this.f96308l = bVar;
        this.f96309m = autotekaReportGenerationLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = this.f96308l;
        bVar.f96311g.R(new Intent(bVar.f96310f, (Class<?>) AutotekaReportGenerationActivity.class).putExtra("ReportGenerationDetails", this.f96309m.f96233b), com.avito.android.deeplink_handler.view.b.f134588l);
        bVar.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
