package com.avito.android.vas_performance.ui.items.attributed_text;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AttributedTextView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/attributed_text/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/vas_performance/ui/items/attributed_text/f;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f321591b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.single_description);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f321591b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.vas_performance.ui.items.attributed_text.f
    public final void m0(@k AttributedText attributedText) {
        j.c(this.f321591b, attributedText, null);
    }
}
