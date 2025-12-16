package com.avito.android.serp.adapter.vertical_main.mall_shortcuts;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item.MallShortcutItem;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MallShortcutsWidgetPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/mall_shortcut_item/MallShortcutItem;", "mallShortcutItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/mall_shortcut_item/MallShortcutItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.l<MallShortcutItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f272989l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f272990m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MallShortcutsWidgetItem f272991n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, int i12, MallShortcutsWidgetItem mallShortcutsWidgetItem) {
        super(1);
        this.f272989l = iVar;
        this.f272990m = i12;
        this.f272991n = mallShortcutsWidgetItem;
    }

    @Override // Y41.l
    public final G0 invoke(MallShortcutItem mallShortcutItem) {
        MallShortcutItem mallShortcutItem2 = mallShortcutItem;
        i iVar = this.f272989l;
        b.a.a(iVar.f272992b, mallShortcutItem2.f273001d, null, null, 6);
        d.a.a(iVar.f272993c, Integer.valueOf(this.f272990m), "mall_shortcuts_widget", mallShortcutItem2.f272999b.getText(), null, null, null, null, this.f272991n.f272975d, 120);
        return G0.f406611a;
    }
}
