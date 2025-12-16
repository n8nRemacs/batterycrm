package com.avito.android.comfortable_deal.clients;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0007\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "invoke", "(I)Ljava/lang/Object;", "androidx/compose/foundation/lazy/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class F extends kotlin.jvm.internal.N implements Y41.l<Integer, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l f120114l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f120115m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Y41.l lVar, List list) {
        super(1);
        this.f120114l = lVar;
        this.f120115m = list;
    }

    @Override // Y41.l
    public final Object invoke(Integer num) {
        return this.f120114l.invoke(this.f120115m.get(num.intValue()));
    }
}
