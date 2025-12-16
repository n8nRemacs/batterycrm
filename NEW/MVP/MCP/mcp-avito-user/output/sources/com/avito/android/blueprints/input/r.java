package com.avito.android.blueprints.input;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: MultiStateInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isFocused", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class r extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f105980l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.items.d f105981m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(e eVar, com.avito.android.items.d dVar) {
        super(1);
        this.f105980l = eVar;
        this.f105981m = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        e eVar = this.f105980l;
        com.avito.android.html_editor.c cVar = eVar.f105964v.f106261b;
        cVar.f164130a.clear();
        cVar.f164131b = true;
        eVar.f105952j.accept(new Q<>(bool2, this.f105981m));
        return G0.f406611a;
    }
}
