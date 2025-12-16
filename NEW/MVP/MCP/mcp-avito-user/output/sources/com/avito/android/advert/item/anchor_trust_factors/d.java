package com.avito.android.advert.item.anchor_trust_factors;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.anchor_trust_factors.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.anchors.AnchorTrustFactors;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsAnchorTrustFactorsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/anchor_trust_factors/d;", "Lcom/avito/android/advert/item/anchor_trust_factors/c;", "a", "b", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements com.avito.android.advert.item.anchor_trust_factors.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f72806b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public AnchorTrustFactors f72807c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Integer f72808d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<? super AnchorTrustFactors.Item, G0> f72809e = new c();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.l<? super AnchorTrustFactors, G0> f72810f = new C2190d();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.l<? super Integer, G0> f72811g = new e();

    /* compiled from: AdvertDetailsAnchorTrustFactorsPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/anchor_trust_factors/d$a;", "Lcom/avito/android/advert/item/anchor_trust_factors/f$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements f.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final f f72812a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AnchorTrustFactors f72813b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y41.l<AnchorTrustFactors, G0> f72814c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Y41.l<Integer, G0> f72815d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final l f72816e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k f fVar, @Y61.k AnchorTrustFactors anchorTrustFactors, @Y61.k Y41.l<? super AnchorTrustFactors, G0> lVar, @Y61.k Y41.l<? super Integer, G0> lVar2, @Y61.k l lVar3) {
            this.f72812a = fVar;
            this.f72813b = anchorTrustFactors;
            this.f72814c = lVar;
            this.f72815d = lVar2;
            this.f72816e = lVar3;
        }
    }

    /* compiled from: AdvertDetailsAnchorTrustFactorsPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/anchor_trust_factors/d$b;", "Lcom/avito/android/advert/item/anchor_trust_factors/f$c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements f.c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final f f72817a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AnchorTrustFactors f72818b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y41.l<Integer, G0> f72819c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k f fVar, @Y61.k AnchorTrustFactors anchorTrustFactors, @Y61.k Y41.l<? super Integer, G0> lVar) {
            this.f72817a = fVar;
            this.f72818b = anchorTrustFactors;
            this.f72819c = lVar;
        }
    }

    /* compiled from: AdvertDetailsAnchorTrustFactorsPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/anchors/AnchorTrustFactors$Item;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/anchors/AnchorTrustFactors$Item;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<AnchorTrustFactors.Item, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AnchorTrustFactors.Item item) {
            AnchorTrustFactors.Item item2 = item;
            d dVar = d.this;
            dVar.f72806b.f(item2);
            DeepLink onTapDeepLink = item2.getOnTapDeepLink();
            if (onTapDeepLink != null) {
                dVar.f72806b.g(onTapDeepLink);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsAnchorTrustFactorsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/anchors/AnchorTrustFactors;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/anchors/AnchorTrustFactors;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.anchor_trust_factors.d$d, reason: collision with other inner class name */
    public static final class C2190d extends N implements Y41.l<AnchorTrustFactors, G0> {
        public C2190d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AnchorTrustFactors anchorTrustFactors) {
            d.this.f72807c = anchorTrustFactors;
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsAnchorTrustFactorsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<Integer, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            d.this.f72808d = Integer.valueOf(num.intValue());
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k l lVar) {
        this.f72806b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AdvertDetailsAnchorTrustFactorsItem advertDetailsAnchorTrustFactorsItem = (AdvertDetailsAnchorTrustFactorsItem) aVar;
        AnchorTrustFactors anchorTrustFactors = this.f72807c;
        if (anchorTrustFactors == null) {
            anchorTrustFactors = advertDetailsAnchorTrustFactorsItem.f72796d;
        }
        fVar.q6(this.f72809e);
        AnchorTrustFactors.ExpandConfig expandConfig = anchorTrustFactors.getExpandConfig();
        Y41.l<? super Integer, G0> lVar = this.f72811g;
        fVar.mj(expandConfig != null ? new a(fVar, anchorTrustFactors, this.f72810f, lVar, this.f72806b) : null);
        fVar.G30(this.f72808d == null ? new b(fVar, anchorTrustFactors, lVar) : null);
        fVar.hI(anchorTrustFactors, this.f72808d);
    }
}
