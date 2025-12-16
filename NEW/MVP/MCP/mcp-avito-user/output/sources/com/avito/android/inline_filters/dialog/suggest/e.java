package com.avito.android.inline_filters.dialog.suggest;

import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuggestFilterDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f172231l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f172232m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, Y41.a<G0> aVar) {
        super(0);
        this.f172231l = bVar;
        this.f172232m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = this.f172231l;
        bVar.f172216f.invoke(bVar.f172214d, new InlineFilterValue.InlineFilterSelectValue(null));
        this.f172232m.invoke();
        bVar.c();
        return G0.f406611a;
    }
}
