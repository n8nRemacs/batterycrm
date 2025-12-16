package com.avito.android.imv_goods_poll.items.check_box;

import Y41.l;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class j implements ListItemCompoundButton.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f170648b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.Adapter f170649c;

    public /* synthetic */ j(RecyclerView.Adapter adapter, int i12, int i13) {
        this.f170647a = i13;
        this.f170649c = adapter;
        this.f170648b = i12;
    }

    @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
    public final void a(ListItemCompoundButton listItemCompoundButton, boolean z12) {
        switch (this.f170647a) {
            case 0:
                k kVar = (k) this.f170649c;
                l<String, G0> lVar = kVar.f170651d;
                if (lVar != null) {
                    lVar.invoke(kVar.f170650c.get(this.f170648b).getSlug());
                    break;
                }
                break;
            default:
                com.avito.android.imv_goods_poll.items.list_radio_button.j jVar = (com.avito.android.imv_goods_poll.items.list_radio_button.j) this.f170649c;
                l<String, G0> lVar2 = jVar.f170668d;
                if (lVar2 != null) {
                    lVar2.invoke(jVar.f170667c.get(this.f170648b).getSlug());
                    break;
                }
                break;
        }
    }
}
