package com.avito.android.bbl.screens.configure.ui.items.configs;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.bbl.screens.configure.ui.items.configs.BblConfigureConfigsItem;
import com.avito.android.lib.design.selector_card.r;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: BblConfigureSelectorCardContentBinder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/configure/ui/items/configs/h;", "Lcom/avito/android/lib/design/selector_card/f;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements com.avito.android.lib.design.selector_card.f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public TextView f99254a;

    @Override // com.avito.android.lib.design.selector_card.f
    public final void a(@k View view) {
        this.f99254a = (TextView) view;
    }

    @Override // com.avito.android.lib.design.selector_card.f
    public final void b(@k r rVar) {
        BblConfigureConfigsItem.Config config = (BblConfigureConfigsItem.Config) rVar;
        TextView textView = this.f99254a;
        if (textView != null) {
            j.c(textView, config.f99243c, null);
        }
    }
}
