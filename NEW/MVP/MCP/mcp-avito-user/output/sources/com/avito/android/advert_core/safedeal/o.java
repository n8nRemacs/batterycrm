package com.avito.android.advert_core.safedeal;

import com.avito.android.lib.design.list_item.ListItemSwitcher;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: MyAdvertSafeDealServicesView.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class o extends N implements Y41.l<Q<? extends String, ? extends Boolean>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f84225l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h hVar) {
        super(1);
        this.f84225l = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Q<? extends String, ? extends Boolean> q12) {
        Q<? extends String, ? extends Boolean> q13 = q12;
        String str = (String) q13.f406619b;
        boolean zBooleanValue = ((Boolean) q13.f406620c).booleanValue();
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) this.f84225l.f84211f.get(str);
        if (listItemSwitcher != null) {
            listItemSwitcher.setChecked(zBooleanValue);
        }
        return G0.f406611a;
    }
}
