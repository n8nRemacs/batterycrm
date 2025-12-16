package com.avito.android.btob_business_trip.screens.selectItemScreen;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "invoke", "(I)Ljava/lang/Object;", "androidx/compose/foundation/lazy/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class l extends N implements Y41.l<Integer, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l f108192l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f108193m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Y41.l lVar, List list) {
        super(1);
        this.f108192l = lVar;
        this.f108193m = list;
    }

    @Override // Y41.l
    public final Object invoke(Integer num) {
        return this.f108192l.invoke(this.f108193m.get(num.intValue()));
    }
}
