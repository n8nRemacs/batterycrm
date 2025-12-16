package com.avito.android.verification.list_items.attributed_text;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AttributedTextItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/list_items/attributed_text/g;", "LJM0/a;", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends JM0.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f324778c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f324779d;

    public g(@k View view) {
        super(view);
        this.f324778c = (TextView) view.findViewById(R.id.verification_item_attributed_text_bullet);
        this.f324779d = (TextView) view.findViewById(R.id.verification_item_attributed_text_view);
    }
}
