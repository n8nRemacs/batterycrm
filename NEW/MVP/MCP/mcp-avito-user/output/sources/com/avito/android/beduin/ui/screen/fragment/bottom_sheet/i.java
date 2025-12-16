package com.avito.android.beduin.ui.screen.fragment.bottom_sheet;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.chips.Chips;
import kotlin.G0;
import kotlin.Metadata;
import ui.C49063a;

/* compiled from: BottomSheetScreenFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/bottom_sheet/i;", "Lcom/avito/android/lib/design/chips/Chips$f;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements Chips.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetScreenFragment f104189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f104190c;

    public i(BottomSheetScreenFragment bottomSheetScreenFragment, String str) {
        this.f104189b = bottomSheetScreenFragment;
        this.f104190c = str;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        num.intValue();
        InterfaceC28373a interfaceC28373a = this.f104189b.f104122q0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        interfaceC28373a.c(new C49063a(this.f104190c, "scroll_horizontal"));
        return G0.f406611a;
    }
}
