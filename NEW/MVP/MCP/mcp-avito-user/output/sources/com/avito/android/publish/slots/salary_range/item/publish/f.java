package com.avito.android.publish.slots.salary_range.item.publish;

import Y41.l;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishSalaryRangePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.publish.slots.salary_range.item.c f244829l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f244830m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.avito.android.publish.slots.salary_range.item.c cVar, g gVar) {
        super(1);
        this.f244829l = cVar;
        this.f244830m = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        com.avito.android.publish.slots.salary_range.item.c cVar = this.f244829l;
        cVar.f244800g.f244786a = str;
        this.f244830m.f244831b.accept(cVar);
        return G0.f406611a;
    }
}
