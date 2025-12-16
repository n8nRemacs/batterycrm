package com.avito.android.authorization.confirm_3fa.adapter.email;

import ge.InterfaceC40665a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EmailItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f93566l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ EmailItem f93567m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, EmailItem emailItem) {
        super(0);
        this.f93566l = eVar;
        this.f93567m = emailItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f93566l.f93568b.invoke(new InterfaceC40665a.C11215a(this.f93567m));
        return G0.f406611a;
    }
}
