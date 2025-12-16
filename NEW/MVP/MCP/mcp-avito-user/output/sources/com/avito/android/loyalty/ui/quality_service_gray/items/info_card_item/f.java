package com.avito.android.loyalty.ui.quality_service_gray.items.info_card_item;

import Y61.k;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InfoCardItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service_gray/items/info_card_item/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    public final Context f184089b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f184090c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f184091d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f184092e;

    public f(@k View view) {
        super(view);
        this.f184089b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.info_card_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f184090c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.info_card_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f184091d = textView;
        View viewFindViewById3 = view.findViewById(R.id.info_card_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f184092e = (SimpleDraweeView) viewFindViewById3;
    }
}
