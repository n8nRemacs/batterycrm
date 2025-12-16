package com.avito.android.section.action;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SectionActionItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/action/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/section/action/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f264616b;

    public f(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.action_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f264616b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.section.action.a
    public final void D3(@k String str, @k Y41.a<G0> aVar) {
        TextView textView = this.f264616b;
        textView.setText(str);
        I5.c(textView, aVar);
    }

    @Override // com.avito.android.section.action.a
    public final void Gi(boolean z12) {
        D6.G(this.f264616b, z12);
    }
}
