package com.avito.android.extended_profile_widgets.adapter.selections.adapter;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import oB.C44614A;

/* compiled from: SelectionItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectionItem f154878l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f154879m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SelectionItem selectionItem, f fVar) {
        super(0);
        this.f154878l = selectionItem;
        this.f154879m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f154878l.f154874f;
        if (deepLink != null) {
            f fVar = this.f154879m;
            fVar.f154880b.invoke(new C44614A(deepLink));
        }
        return G0.f406611a;
    }
}
