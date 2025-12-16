package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.disclaimer;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FeesMethodsV2DisclaimerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/disclaimer/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/disclaimer/g;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f158351b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f158352c;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f158351b = aVar;
        View viewFindViewById = view.findViewById(R.id.fees_methods_v2_disclaimer_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f158352c = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.disclaimer.g
    public final void a6(@k AttributedText attributedText) {
        j.a(this.f158352c, attributedText, this.f158351b);
    }
}
