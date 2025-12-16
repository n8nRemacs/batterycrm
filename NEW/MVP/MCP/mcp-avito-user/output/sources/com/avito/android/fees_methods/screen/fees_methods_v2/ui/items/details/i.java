package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.details;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.util.C35949t5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FeesMethodsV2DetailsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/details/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/details/h;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f158339e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f158340b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f158341c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f158342d;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.fees_methods_v2_details_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f158340b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.fees_methods_v2_details_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f158341c = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.fees_methods_v2_details_action);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f158342d = (TextView) viewFindViewById3;
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.details.h
    public final void A5(@l wZ.l lVar) {
        C35949t5.c(this.f158341c, com.avito.android.image_loader.b.b(lVar != null ? lVar.a(this.itemView.getContext()) : null), null, null, null, 14);
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.details.h
    public final void P(@l String str, @k Y41.a<G0> aVar) {
        TextView textView = this.f158342d;
        textView.setText(str);
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        textView.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(28, aVar));
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.details.h
    public final void setTitle(@k String str) {
        this.f158340b.setText(str);
    }
}
