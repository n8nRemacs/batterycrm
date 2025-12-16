package com.avito.android.publish.slots.salary_range.item;

import Y41.l;
import com.avito.android.items.ItemWithState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SalaryRangePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f244810l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f244811m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, j jVar) {
        super(1);
        this.f244810l = cVar;
        this.f244811m = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(String str) {
        c cVar = this.f244810l;
        cVar.f244800g.f244786a = str;
        cVar.f244801h = new ItemWithState.State.Normal(null, 1, 0 == true ? 1 : 0);
        this.f244811m.f244812b.accept(cVar);
        return G0.f406611a;
    }
}
