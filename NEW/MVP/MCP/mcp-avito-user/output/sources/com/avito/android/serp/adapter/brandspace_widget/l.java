package com.avito.android.serp.adapter.brandspace_widget;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.brandspace_widget.BrandspaceWidgetItem;
import js0.d;
import kotlin.Metadata;
import rn0.InterfaceC47691c;

/* compiled from: BrandspaceWidgetItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f269057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f269058c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BrandspaceWidgetItem f269059d;

    public l(n nVar, int i12, BrandspaceWidgetItem brandspaceWidgetItem) {
        this.f269057b = nVar;
        this.f269058c = i12;
        this.f269059d = brandspaceWidgetItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        n nVar = this.f269057b;
        Integer numValueOf = Integer.valueOf(this.f269058c);
        BrandspaceWidgetItem brandspaceWidgetItem = this.f269059d;
        d.a.a(nVar.f269063d, numValueOf, "brandspaceWidget", null, null, null, null, null, brandspaceWidgetItem.f269028k, 124);
        BrandspaceWidgetItem.Action action = brandspaceWidgetItem.f269026i;
        DeepLink deepLink = action != null ? action.f269034c : null;
        if (deepLink != null) {
            InterfaceC47691c.a.b(nVar.f269062c.get(), deepLink, 6);
        }
    }
}
