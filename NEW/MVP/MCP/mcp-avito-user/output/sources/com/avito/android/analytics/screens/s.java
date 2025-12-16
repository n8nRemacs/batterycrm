package com.avito.android.analytics.screens;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.ui.fragments.BaseFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScreenMaskExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_base-component_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s {
    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static final <T extends com.avito.android.ui.activity.a & InterfaceC28477j.b> r a(@Y61.k T t12) {
        return new r((Activity) t12, Long.valueOf(t12.f304537b), (String) null, 4, (C42822w) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static final <T extends BaseDialogFragment & InterfaceC28477j.b> r b(@Y61.k T t12) {
        return new r((Fragment) t12, Long.valueOf(t12.f304594f0), (String) null, 4, (C42822w) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static final <T extends BaseFragment & InterfaceC28477j.b> r c(@Y61.k T t12) {
        return new r((Fragment) t12, Long.valueOf(t12.f304596f0), (String) null, 4, (C42822w) null);
    }
}
