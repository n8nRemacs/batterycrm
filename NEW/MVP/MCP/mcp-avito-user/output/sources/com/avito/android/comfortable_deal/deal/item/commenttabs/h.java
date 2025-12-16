package com.avito.android.comfortable_deal.deal.item.commenttabs;

import Ep.InterfaceC13517a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CommentTabsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectedTabPosition", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f121323l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f121324m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f121325n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, j jVar, f fVar) {
        super(1);
        this.f121323l = lVar;
        this.f121324m = jVar;
        this.f121325n = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        f fVar = this.f121325n;
        CommentTab commentTab = fVar.f121321c.get(iIntValue);
        j jVar = this.f121324m;
        jVar.getClass();
        this.f121323l.RV(commentTab == CommentTab.f121308c || commentTab == CommentTab.f121309d);
        jVar.f121327b.invoke(new InterfaceC13517a.i(fVar.f121321c.get(iIntValue)));
        return G0.f406611a;
    }
}
