package com.avito.android.btob_business_trip.screens.selectItemScreen;

import com.avito.android.btob_business_trip.models.SelectItemInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: B2bBusinessSelectItemsScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Long, Boolean, G0> f108189l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SelectItemInfo f108190m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(Y41.p<? super Long, ? super Boolean, G0> pVar, SelectItemInfo selectItemInfo) {
        super(1);
        this.f108189l = pVar;
        this.f108190m = selectItemInfo;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        this.f108189l.invoke(Long.valueOf(this.f108190m.f107865c), bool2);
        return G0.f406611a;
    }
}
