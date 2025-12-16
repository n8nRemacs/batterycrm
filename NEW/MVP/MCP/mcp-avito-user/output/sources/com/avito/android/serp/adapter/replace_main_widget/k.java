package com.avito.android.serp.adapter.replace_main_widget;

import com.avito.android.serp.adapter.replace_main_widget.ReplaceMainWidgetItem;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import rn0.InterfaceC47691c;

/* compiled from: ReplaceMainWidgetPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ReplaceMainWidgetItem f270689l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f270690m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ReplaceMainWidgetItem replaceMainWidgetItem, l lVar) {
        super(0);
        this.f270689l = replaceMainWidgetItem;
        this.f270690m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ReplaceMainWidgetItem replaceMainWidgetItem = this.f270689l;
        boolean z12 = replaceMainWidgetItem instanceof ReplaceMainWidgetItem.ReplaceMain;
        l lVar = this.f270690m;
        if (z12) {
            lVar.f270693d.K5(replaceMainWidgetItem);
        } else if (replaceMainWidgetItem instanceof ReplaceMainWidgetItem.ShowAvito) {
            InterfaceC47691c.a.a(lVar.f270692c.get(), ((ReplaceMainWidgetItem.ShowAvito) replaceMainWidgetItem).f270674e.f254595c, null, 14);
        }
        d.a.a(lVar.f270691b, null, null, null, null, null, null, null, replaceMainWidgetItem.getF270675f(), 127);
        return G0.f406611a;
    }
}
