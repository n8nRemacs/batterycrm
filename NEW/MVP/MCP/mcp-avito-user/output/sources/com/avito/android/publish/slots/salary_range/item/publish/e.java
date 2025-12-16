package com.avito.android.publish.slots.salary_range.item.publish;

import Y41.l;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishSalaryRangePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.publish.slots.salary_range.item.c f244827l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f244828m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.avito.android.publish.slots.salary_range.item.c cVar, g gVar) {
        super(1);
        this.f244827l = cVar;
        this.f244828m = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        com.avito.android.publish.slots.salary_range.item.c cVar = this.f244827l;
        cVar.f244799f.f244786a = str;
        this.f244828m.f244831b.accept(cVar);
        return G0.f406611a;
    }
}
