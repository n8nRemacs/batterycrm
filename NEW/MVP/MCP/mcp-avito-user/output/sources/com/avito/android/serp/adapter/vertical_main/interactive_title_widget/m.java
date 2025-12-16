package com.avito.android.serp.adapter.vertical_main.interactive_title_widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InteractiveTitleWidgetView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/interactive_title_widget/m;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/vertical_main/interactive_title_widget/l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends com.avito.android.serp.c implements l {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f272966f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f272967b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Context f272968c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f272969d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f272970e;

    public m(@Y61.k View view) {
        super(view);
        this.f272967b = view;
        this.f272968c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.interactive_title_header);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272969d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.interactive_title_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f272970e = (ImageView) viewFindViewById2;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.interactive_title_widget.l
    public final void IL(@Y61.k InteractiveTitleWidgetItem interactiveTitleWidgetItem) {
        Integer numQ;
        TextView textView = this.f272969d;
        textView.setText(interactiveTitleWidgetItem.f272938b);
        String str = interactiveTitleWidgetItem.f272939c;
        if (str != null && (numQ = com.avito.android.lib.util.f.q(str)) != null) {
            textView.setTextAppearance(C35835l0.j(numQ.intValue(), this.f272968c));
        }
        this.f272970e.setVisibility(interactiveTitleWidgetItem.f272941e != null ? 0 : 8);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.interactive_title_widget.l
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f272967b.setOnClickListener(new com.avito.android.serp.adapter.serp_advert_card.i(15, aVar));
    }
}
