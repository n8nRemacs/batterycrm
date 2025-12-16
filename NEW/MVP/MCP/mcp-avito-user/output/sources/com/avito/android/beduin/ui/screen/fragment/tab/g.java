package com.avito.android.beduin.ui.screen.fragment.tab;

import Y61.k;
import android.os.Bundle;
import androidx.fragment.app.F;
import androidx.fragment.app.Fragment;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.BottomSheetWithTabsScreenFragment;
import com.avito.android.beduin.ui.screen.model.BeduinTabLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import yi.C50254a;

/* compiled from: BeduinTabLayoutAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tab/g;", "Landroidx/fragment/app/F;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends F {

    /* renamed from: j, reason: collision with root package name */
    @k
    public final List<C50254a> f104305j;

    public g(@k BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment, @k BeduinTabLayout beduinTabLayout) {
        super(bottomSheetWithTabsScreenFragment.getChildFragmentManager(), 1);
        this.f104305j = beduinTabLayout.f104411c;
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f104305j.size();
    }

    @Override // androidx.fragment.app.F
    @k
    public final Fragment o(int i12) {
        C50254a c50254a = this.f104305j.get(i12);
        BeduinTabOpenParams beduinTabOpenParams = new BeduinTabOpenParams(c50254a.f443471c, c50254a.f443472d, c50254a.f443473e, null, 8, null);
        BeduinTabFragment.f104278z0.getClass();
        BeduinTabFragment beduinTabFragment = new BeduinTabFragment();
        beduinTabFragment.f104286u0.setValue(beduinTabFragment, BeduinTabFragment.f104277A0[0], beduinTabOpenParams);
        Bundle arguments = beduinTabFragment.getArguments();
        if (arguments != null) {
            arguments.putInt("arg_padding", 0);
        }
        return beduinTabFragment;
    }
}
