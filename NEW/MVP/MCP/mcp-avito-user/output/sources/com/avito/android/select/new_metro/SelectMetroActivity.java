package com.avito.android.select.new_metro;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.select.new_metro.SelectMetroFragment;
import com.avito.android.select.new_metro.di.c;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectMetroActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/select/new_metro/SelectMetroActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectMetroActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        c.a aVarA = com.avito.android.select.new_metro.di.a.a();
        aVarA.a((com.avito.android.select.new_metro.di.d) C29972i.a(C29972i.b(this), com.avito.android.select.new_metro.di.d.class));
        aVarA.build();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Theme_DesignSystem_Re23);
        if (bundle == null) {
            Intent intent = getIntent();
            Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("new_metro_arguments", SelectMetroParams.class) : intent.getParcelableExtra("new_metro_arguments");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            SelectMetroFragment.f265914C0.getClass();
            SelectMetroFragment selectMetroFragmentA = SelectMetroFragment.a.a((SelectMetroParams) parcelableExtra);
            H hE2 = getSupportFragmentManager().e();
            hE2.n(R.id.fragment_container, selectMetroFragmentA, "select_dialog_tag");
            hE2.f();
        }
    }
}
