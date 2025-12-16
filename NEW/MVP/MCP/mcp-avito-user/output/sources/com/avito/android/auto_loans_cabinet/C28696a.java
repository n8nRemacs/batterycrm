package com.avito.android.auto_loans_cabinet;

import com.avito.android.auto_loans_cabinet.mvi.entity.BannerType;
import com.avito.android.auto_loans_cabinet.mvi.entity.Item;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutoLoanCabinetBannerItem.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.auto_loans_cabinet.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28696a extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<BannerType, G0> f95337l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Item.Banner f95338m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28696a(Y41.l<? super BannerType, G0> lVar, Item.Banner banner) {
        super(0);
        this.f95337l = lVar;
        this.f95338m = banner;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f95337l.invoke(this.f95338m.f95479b);
        return G0.f406611a;
    }
}
