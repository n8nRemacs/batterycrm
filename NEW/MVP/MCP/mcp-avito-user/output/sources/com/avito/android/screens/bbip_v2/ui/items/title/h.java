package com.avito.android.screens.bbip_v2.ui.items.title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BbipV2TitleItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/title/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/screens/bbip_v2/ui/items/title/g;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f261680b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.bbip_v2_title_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f261680b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.screens.bbip_v2.ui.items.title.g
    public final void setTitle(@k String str) {
        this.f261680b.setText(str);
    }
}
