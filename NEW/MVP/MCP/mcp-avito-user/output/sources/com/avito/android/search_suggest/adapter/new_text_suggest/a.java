package com.avito.android.search_suggest.adapter.new_text_suggest;

import Pp0.InterfaceC14824b;
import com.avito.android.remote.model.search.suggest.RedesignTextSuggestItem;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NewTextSuggestItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RedesignTextSuggestItem f264159l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f264160m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.list.new_text_suggest.a f264161n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RedesignTextSuggestItem redesignTextSuggestItem, b bVar, com.avito.android.list.new_text_suggest.a aVar) {
        super(0);
        this.f264159l = redesignTextSuggestItem;
        this.f264160m = bVar;
        this.f264161n = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        List<SuggestAction> actions = this.f264159l.getActions();
        if (actions != null) {
            this.f264160m.f264162b.invoke(new InterfaceC14824b.C0869b(actions, this.f264161n));
        }
        return G0.f406611a;
    }
}
