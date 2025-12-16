package com.avito.android.list.new_text_suggest;

import com.avito.android.remote.model.search.suggest.RedesignTextSuggestItem;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: NewTextSuggestItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RedesignTextSuggestItem f181621l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f181622m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RedesignTextSuggestItem redesignTextSuggestItem, g gVar) {
        super(0);
        this.f181621l = redesignTextSuggestItem;
        this.f181622m = gVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        List<SuggestAction> actions = this.f181621l.getActions();
        if (actions != null) {
            this.f181622m.f181623b.h(actions);
        }
        return G0.f406611a;
    }
}
