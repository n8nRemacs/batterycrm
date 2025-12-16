package com.avito.android.inline_filters.dialog.select.adapter;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: InlineFiltersDialogItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f172112l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f172113m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f172114n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, i iVar, int i12) {
        super(0);
        this.f172112l = jVar;
        this.f172113m = iVar;
        this.f172114n = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        j jVar = this.f172112l;
        jVar.getClass();
        i iVar = this.f172113m;
        InlineItemType inlineItemType = iVar.f172095f;
        if (inlineItemType != InlineItemType.f172066m) {
            switch (inlineItemType.ordinal()) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    if (!iVar.f172094e) {
                    }
                    break;
                case 0:
                case 1:
                case 2:
                case 3:
                case 9:
                case 10:
                case 11:
                    iVar.f172094e = !iVar.f172094e;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        jVar.f172109b.invoke(Integer.valueOf(this.f172114n));
        return G0.f406611a;
    }
}
