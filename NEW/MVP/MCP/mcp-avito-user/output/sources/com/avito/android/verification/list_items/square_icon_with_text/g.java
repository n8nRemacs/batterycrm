package com.avito.android.verification.list_items.square_icon_with_text;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SquareIconWithTextItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/list_items/square_icon_with_text/g;", "LJM0/a;", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends JM0.a {

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f324840c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f324841d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f324842e;

    public g(@k View view) {
        super(view);
        this.f324840c = (ImageView) view.findViewById(R.id.square_icon_with_text_item_icon);
        this.f324841d = (TextView) view.findViewById(R.id.square_icon_with_text_item_title);
        this.f324842e = (TextView) view.findViewById(R.id.square_icon_with_text_item_body);
    }
}
