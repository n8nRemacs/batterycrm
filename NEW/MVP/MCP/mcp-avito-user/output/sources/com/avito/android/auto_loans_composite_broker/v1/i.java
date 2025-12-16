package com.avito.android.auto_loans_composite_broker.v1;

import android.net.Uri;
import com.avito.android.credits.calculator.C29615b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.parse.adapter.CompositeBrokerCalculator;
import com.avito.android.remote.parse.adapter.CompositeBrokerEventParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsCompositeBrokerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v1/i;", "Lcom/avito/android/auto_loans_composite_broker/v1/r;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f95548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CompositeBrokerCalculator f95549c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f95550d;

    public i(l lVar, CompositeBrokerCalculator compositeBrokerCalculator, j jVar) {
        this.f95548b = lVar;
        this.f95549c = compositeBrokerCalculator;
        this.f95550d = jVar;
    }

    @Override // com.avito.android.auto_loans_composite_broker.v1.r, com.avito.android.credits.p
    public final void K7(int i12) {
        l lVar = this.f95548b;
        lVar.f95574o = lVar.f95561b.format(Integer.valueOf(i12));
        lVar.f95573n = i12;
        j jVar = this.f95550d;
        l lVarL0 = jVar.f95553d.L0();
        if (lVarL0 != null) {
            lVarL0.a();
            j.k(lVarL0, jVar.f95554e);
        }
    }

    @Override // com.avito.android.auto_loans_composite_broker.v1.r, com.avito.android.credits.p
    public final void b4(@Y61.k DeepLink deepLink) {
        j jVar = this.f95550d;
        jVar.f95552c.d(this.f95549c.getDeepLink());
    }

    @Override // com.avito.android.auto_loans_composite_broker.v1.r, com.avito.android.credits.p
    public final void j9(@Y61.k Uri uri) {
        this.f95550d.f95552c.N(uri);
    }

    @Override // com.avito.android.auto_loans_composite_broker.v1.r, com.avito.android.credits.p
    public final void q8() {
        Me.i iVar = this.f95550d.f95551b;
        CompositeBrokerEventParams clickEventParams = this.f95549c.getClickEventParams();
        iVar.f(clickEventParams != null ? clickEventParams.getFromPage() : null);
    }

    @Override // com.avito.android.auto_loans_composite_broker.v1.r, com.avito.android.credits.p
    public final void s7() {
        l lVar = this.f95548b;
        Map<String, String> mapG = P0.g(new Q("sum", String.valueOf(lVar.f95573n)), new Q("period_month", String.valueOf(lVar.f95565f)));
        CompositeBrokerCalculator compositeBrokerCalculator = this.f95549c;
        CompositeBrokerEventParams clickEventParams = compositeBrokerCalculator.getClickEventParams();
        j jVar = this.f95550d;
        if (clickEventParams != null) {
            jVar.f95551b.g(clickEventParams.getFromPage(), mapG);
        }
        jVar.f95552c.d(compositeBrokerCalculator.getDeepLink());
    }

    @Override // com.avito.android.auto_loans_composite_broker.v1.r, com.avito.android.credits.p
    public final void yd(boolean z12) {
        Boolean boolValueOf = Boolean.valueOf(z12);
        j jVar = this.f95550d;
        if (boolValueOf.equals(jVar.f95555f)) {
            return;
        }
        jVar.f95555f = Boolean.valueOf(z12);
        if (z12) {
            C29615b c29615b = jVar.f95554e;
            if (c29615b != null) {
                c29615b.tJ();
            }
            Me.i iVar = jVar.f95551b;
            CompositeBrokerEventParams clickEventParams = this.f95549c.getClickEventParams();
            iVar.f(clickEventParams != null ? clickEventParams.getFromPage() : null);
        }
    }

    @Override // com.avito.android.auto_loans_composite_broker.v1.r, com.avito.android.credits.p
    public final void z2(int i12) {
        this.f95548b.f95565f = i12;
        j jVar = this.f95550d;
        l lVarL0 = jVar.f95553d.L0();
        if (lVarL0 != null) {
            lVarL0.a();
            j.k(lVarL0, jVar.f95554e);
        }
    }
}
