package com.avito.android.auto_loans_composite_broker.v2;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsCompositeBrokerV2Blueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/e;", "LTV0/b;", "Lcom/avito/android/auto_loans_composite_broker/v2/t;", "Lcom/avito/android/auto_loans_composite_broker/v2/AdvertDetailsCompositeBrokerV2Item;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.auto_loans_composite_broker.v2.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28716e implements TV0.b<t, AdvertDetailsCompositeBrokerV2Item> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28718g f95632a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f95633b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<z> f95634c = new g.a<>(R.layout.advert_details_composite_broker_calculator, new a());

    /* compiled from: AdvertDetailsCompositeBrokerV2Blueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/auto_loans_composite_broker/v2/z;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/auto_loans_composite_broker/v2/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.auto_loans_composite_broker.v2.e$a */
    public static final class a extends N implements Y41.p<ViewGroup, View, z> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final z invoke(ViewGroup viewGroup, View view) {
            return new z(view, C28716e.this.f95633b);
        }
    }

    @Inject
    public C28716e(@Y61.k InterfaceC28718g interfaceC28718g, @Y61.k com.avito.android.util.text.a aVar) {
        this.f95632a = interfaceC28718g;
        this.f95633b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f95632a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<z> b() {
        return this.f95634c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AdvertDetailsCompositeBrokerV2Item;
    }
}
