package com.avito.android.mortgage.root.list.items.issue;

import com.avito.android.mortgage.api.model.ActionButton;
import com.avito.android.mortgage.root.list.payloads.p;
import f10.InterfaceC40199a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IssuePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p.a f202647l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f202648m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p.a aVar, f fVar) {
        super(0);
        this.f202647l = aVar;
        this.f202648m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ActionButton actionButton = this.f202647l.f202917a;
        if (actionButton != null) {
            this.f202648m.f202649b.invoke(new InterfaceC40199a.C40215q(actionButton.getLink()));
        }
        return G0.f406611a;
    }
}
