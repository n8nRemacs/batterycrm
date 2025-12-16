package com.avito.android.component.advert_contact_bar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.component.advert_contact_bar.ContactBar;
import kotlin.Metadata;
import q50.InterfaceC47203a;

/* compiled from: ContactBar.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_ui-components_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes12.dex */
public final class Q {
    @Y61.k
    public static final <T extends View> T a(@Y61.k ContactBar.Button.Action action, @Y61.k Context context, @j.I int i12) {
        return (T) LayoutInflater.from(action.f125044h ? new androidx.appcompat.view.d(context, R.style.Theme_DesignSystem_Re23) : new androidx.appcompat.view.d(context, R.style.Theme_DesignSystem_LookAndFeel)).inflate(i12, (ViewGroup) null);
    }
}
