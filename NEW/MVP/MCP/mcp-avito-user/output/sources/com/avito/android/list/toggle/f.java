package com.avito.android.list.toggle;

import Y41.l;
import com.avito.android.C31100l2;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.avito.android.remote.model.search.suggest.ToggleSuggestItem;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestTogglePresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ToggleSuggestItem f181664l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f181665m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ToggleSuggestItem toggleSuggestItem, g gVar) {
        super(1);
        this.f181664l = toggleSuggestItem;
        this.f181665m = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        ToggleSuggestItem toggleSuggestItem = this.f181664l;
        List<SuggestAction> actions = toggleSuggestItem.getActions();
        C31100l2 c31100l2 = this.f181665m.f181666b;
        if (actions != null) {
            c31100l2.h(actions);
        }
        String id2 = toggleSuggestItem.getId();
        String str = c31100l2.f174875o;
        if (str == null) {
            str = "";
        }
        c31100l2.g(str, Collections.singletonMap(id2, bool2));
        return G0.f406611a;
    }
}
