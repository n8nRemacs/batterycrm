package com.avito.android.beduin.common.component.switcher;

import Y41.l;
import com.avito.android.beduin.common.component.switcher.a;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinSwitcherComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/list_item/ListItemSwitcher;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/list_item/ListItemSwitcher;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements l<ListItemSwitcher, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.C3079a f102744l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a.C3079a c3079a) {
        super(1);
        this.f102744l = c3079a;
    }

    @Override // Y41.l
    public final G0 invoke(ListItemSwitcher listItemSwitcher) {
        ListItemSwitcher listItemSwitcher2 = listItemSwitcher;
        a.C3079a c3079a = this.f102744l;
        Boolean bool = c3079a.f102740a;
        if (bool != null) {
            listItemSwitcher2.setEnabled(bool.booleanValue());
        }
        Boolean bool2 = c3079a.f102741b;
        if (bool2 != null) {
            listItemSwitcher2.setChecked(bool2.booleanValue());
        }
        return G0.f406611a;
    }
}
