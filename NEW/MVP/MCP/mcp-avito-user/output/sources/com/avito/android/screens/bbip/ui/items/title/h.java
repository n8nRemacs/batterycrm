package com.avito.android.screens.bbip.ui.items.title;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TitleItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip/ui/items/title/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/screens/bbip/ui/items/title/g;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f260398b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f260399c;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.bbip_title_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f260398b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.bbip_subtitle_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f260399c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.screens.bbip.ui.items.title.g
    public final void n0(@l String str) {
        I5.a(this.f260399c, str, false);
    }

    @Override // com.avito.android.screens.bbip.ui.items.title.g
    public final void setTitle(@k String str) {
        this.f260398b.setText(str);
    }
}
