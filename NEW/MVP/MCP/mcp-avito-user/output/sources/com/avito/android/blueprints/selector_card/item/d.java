package com.avito.android.blueprints.selector_card.item;

import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: SelectorCardView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/selector_card/item/d;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends com.avito.konveyor.adapter.b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f106623e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayout f106624b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f106625c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f106626d;

    public d(@k View view) {
        super(view);
        this.f106624b = (LinearLayout) view.findViewById(R.id.selector_card);
        this.f106625c = (TextView) view.findViewById(R.id.selector_card_title);
        this.f106626d = (SimpleDraweeView) view.findViewById(R.id.selector_card_image);
    }
}
