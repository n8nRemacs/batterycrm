package com.avito.android.credits.broker_link.no_icon_link;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.credits.broker_link.CreditBrokerLinkItem;
import com.avito.android.remote.model.credit_broker.EntryPoint;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CreditBrokerTextWithArrowLinkBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credits/broker_link/no_icon_link/f;", "LTV0/b;", "Lcom/avito/android/credits/broker_link/no_icon_link/d;", "Lcom/avito/android/credits/broker_link/CreditBrokerLinkItem;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements TV0.b<d, CreditBrokerLinkItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f128622a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<e> f128623b = new g.a<>(R.layout.advert_details_credit_broker_text_arrow_link, a.f128624l);

    /* compiled from: CreditBrokerTextWithArrowLinkBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/credits/broker_link/no_icon_link/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/credits/broker_link/no_icon_link/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, e> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f128624l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final e invoke(ViewGroup viewGroup, View view) {
            return new e(view);
        }
    }

    @Inject
    public f(@k b bVar) {
        this.f128622a = bVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f128622a;
    }

    @Override // TV0.b
    @k
    public final g.a<e> b() {
        return this.f128623b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof CreditBrokerLinkItem) {
            if (((CreditBrokerLinkItem) aVar).f128573c == EntryPoint.CreditBrokerLinkType.TEXT_WITH_ARROW) {
                return true;
            }
        }
        return false;
    }
}
