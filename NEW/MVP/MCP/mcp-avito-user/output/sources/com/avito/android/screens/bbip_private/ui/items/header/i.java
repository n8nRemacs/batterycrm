package com.avito.android.screens.bbip_private.ui.items.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: BbipPrivateHeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/header/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/screens/bbip_private/ui/items/header/h;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f260875b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f260876c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f260877d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f260878e;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f260875b = aVar;
        this.f260876c = (TextView) view.findViewById(R.id.bbip_private_header_title);
        this.f260877d = (TextView) view.findViewById(R.id.bbip_private_header_subtitle);
        this.f260878e = (TextView) view.findViewById(R.id.bbip_private_header_description);
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.header.h
    public final void g(@l AttributedText attributedText) {
        j.a(this.f260878e, attributedText, this.f260875b);
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.header.h
    public final void n0(@l String str) {
        I5.a(this.f260877d, str, false);
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.header.h
    public final void setTitle(@k String str) {
        this.f260876c.setText(str);
    }
}
