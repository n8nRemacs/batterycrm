package com.avito.android.search.filter;

import java.util.Set;
import kotlin.Metadata;

/* compiled from: FiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/conveyor_item/a;", "it", "", "invoke", "(Lcom/avito/conveyor_item/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.search.filter.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34580k0 extends kotlin.jvm.internal.N implements Y41.l<com.avito.conveyor_item.a, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Set<String> f263368l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34580k0(Set<String> set) {
        super(1);
        this.f263368l = set;
    }

    @Override // Y41.l
    public final Boolean invoke(com.avito.conveyor_item.a aVar) {
        return Boolean.valueOf(this.f263368l.contains(aVar.getF250782b()));
    }
}
