package com.avito.android.profile_settings_extended.adapter.toggle;

import Au.C13079a;
import Rb0.C15027c;
import Rb0.InterfaceC15026b;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ToggleItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/toggle/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/toggle/g;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g, InterfaceC15026b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C15027c f229882b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f229883c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ListItemSwitcher f229884d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.l<? super Boolean, G0> f229885e;

    public h(@k View view) {
        super(view);
        this.f229882b = new C15027c(view);
        View viewFindViewById = view.findViewById(R.id.switcher_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229883c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.switcher);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        this.f229884d = (ListItemSwitcher) viewFindViewById2;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.toggle.g
    public final void cX(@k ToggleItem toggleItem, @k Y41.l<? super Boolean, G0> lVar) {
        I5.a(this.f229883c, toggleItem.getF229864d().f229868b, false);
        String str = toggleItem.getF229864d().f229869c;
        ListItemSwitcher listItemSwitcher = this.f229884d;
        listItemSwitcher.setTitle(str);
        listItemSwitcher.setSubtitle(toggleItem.getF229864d().f229870d);
        listItemSwitcher.setEnabled(toggleItem.getF229864d().f229872f);
        this.f229885e = lVar;
        boolean z12 = toggleItem.getF229864d().f229871e;
        listItemSwitcher.i();
        listItemSwitcher.setChecked(z12);
        listItemSwitcher.e(new C13079a(this, 8));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f229884d.i();
        this.f229885e = null;
    }

    @Override // Rb0.InterfaceC15026b
    public final void xT(boolean z12) {
        this.f229882b.xT(z12);
    }
}
