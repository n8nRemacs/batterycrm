package com.avito.android.personal_banner.feature.mvi;

import com.avito.android.personal_banner.feature.mvi.entity.BannerState;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BannerFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/t;", "Lcom/avito/android/arch/mvi/q;", "LZ60/a;", "LZ60/c;", "Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState;", "LZ60/b;", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t extends com.avito.android.arch.mvi.q<Z60.a, Z60.c, BannerState, Z60.b> {

    /* compiled from: BannerFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LZ60/a;", "LZ60/c;", "Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState;", "LZ60/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<com.avito.android.arch.mvi.q<Z60.a, Z60.c, BannerState, Z60.b>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.personal_banner.feature.mvi.a f215693l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f215694m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ q f215695n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ R0 f215696o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.personal_banner.feature.mvi.a aVar, v vVar, q qVar, R0 r02) {
            super(1);
            this.f215693l = aVar;
            this.f215694m = vVar;
            this.f215695n = qVar;
            this.f215696o = r02;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.arch.mvi.q<Z60.a, Z60.c, BannerState, Z60.b> qVar) {
            com.avito.android.arch.mvi.q<Z60.a, Z60.c, BannerState, Z60.b> qVar2 = qVar;
            qVar2.f92009e = this.f215693l;
            qVar2.f92011g = this.f215694m;
            qVar2.f92010f = this.f215695n;
            qVar2.f92013i = this.f215696o.c();
            return G0.f406611a;
        }
    }

    @Inject
    public t(@Y61.k W60.a aVar, @Y61.k d70.d dVar, @Y61.k com.avito.android.personal_banner.feature.mvi.a aVar2, @Y61.k v vVar, @Y61.k q qVar, @Y61.k R0 r02) {
        super("PersonalBannerFeature:" + aVar.f17750b, new BannerState(aVar.f17749a, dVar.f393708a, null, null, 12, null), new a(aVar2, vVar, qVar, r02));
    }
}
