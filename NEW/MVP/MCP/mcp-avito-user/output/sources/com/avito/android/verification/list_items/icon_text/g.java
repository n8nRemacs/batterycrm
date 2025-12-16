package com.avito.android.verification.list_items.icon_text;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: IconTextItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/list_items/icon_text/g;", "LJM0/a;", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends JM0.a {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f324809c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f324810d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f324811e;

    public g(@k View view) {
        super(view);
        this.f324809c = (TextView) view.findViewById(R.id.text_icon_item_icon);
        this.f324810d = (TextView) view.findViewById(R.id.text_icon_item_title);
        this.f324811e = (TextView) view.findViewById(R.id.text_icon_item_body);
    }
}
