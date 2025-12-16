package com.avito.android.search_suggest.adapter.toggle;

import Pp0.InterfaceC14824b;
import Y41.l;
import com.avito.android.list.toggle.d;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.avito.android.remote.model.search.suggest.ToggleSuggestItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuggestTogglePresenterImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ToggleSuggestItem f264174l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f264175m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f264176n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ToggleSuggestItem toggleSuggestItem, b bVar, d dVar) {
        super(1);
        this.f264174l = toggleSuggestItem;
        this.f264175m = bVar;
        this.f264176n = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ToggleSuggestItem toggleSuggestItem = this.f264174l;
        List<SuggestAction> actions = toggleSuggestItem.getActions();
        l<InterfaceC14824b, G0> lVar = this.f264175m.f264177b;
        if (actions != null) {
            lVar.invoke(new InterfaceC14824b.C0869b(actions, this.f264176n));
        }
        lVar.invoke(new InterfaceC14824b.f(toggleSuggestItem.getId(), zBooleanValue));
        return G0.f406611a;
    }
}
