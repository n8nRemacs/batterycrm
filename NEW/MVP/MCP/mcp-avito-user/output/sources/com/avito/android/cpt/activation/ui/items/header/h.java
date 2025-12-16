package com.avito.android.cpt.activation.ui.items.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: CptActivationHeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/activation/ui/items/header/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/cpt/activation/ui/items/header/g;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f126409b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f126410c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f126411d;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f126409b = aVar;
        this.f126410c = (TextView) view.findViewById(R.id.cpt_activation_header_title);
        this.f126411d = (TextView) view.findViewById(R.id.cpt_activation_header_description);
    }

    @Override // com.avito.android.cpt.activation.ui.items.header.g
    public final void e(@k AttributedText attributedText) {
        j.c(this.f126410c, attributedText, this.f126409b);
    }

    @Override // com.avito.android.cpt.activation.ui.items.header.g
    public final void g(@l AttributedText attributedText) {
        j.a(this.f126411d, attributedText, this.f126409b);
    }
}
