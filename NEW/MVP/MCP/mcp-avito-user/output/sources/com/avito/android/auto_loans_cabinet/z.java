package com.avito.android.auto_loans_cabinet;

import Ke.InterfaceC14305a;
import com.avito.android.auto_loans_cabinet.mvi.entity.BannerType;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutoLoanCabinetScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/BannerType;", "bannerType", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/auto_loans_cabinet/mvi/entity/BannerType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class z extends kotlin.jvm.internal.N implements Y41.l<BannerType, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC14305a, G0> f95529l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(Y41.l<? super InterfaceC14305a, G0> lVar) {
        super(1);
        this.f95529l = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(BannerType bannerType) {
        ((J) this.f95529l).invoke(new InterfaceC14305a.c(bannerType));
        return G0.f406611a;
    }
}
