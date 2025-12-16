package com.avito.android.extended_profile_widgets.adapter.info;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TextItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/info/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/info/g;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f154479g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f154480b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f154481c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f154482d;

    /* renamed from: e, reason: collision with root package name */
    public final int f154483e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f154484f;

    public h(@k View view, boolean z12) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.extended_text_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154480b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_text_body);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154481c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.expand_label);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154482d = (TextView) viewFindViewById3;
        this.f154483e = z12 ? 2 : 6;
        this.f154484f = view.getContext().getString(R.string.extended_profile_expand_info_label);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f154482d.setOnClickListener(null);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.info.g
    public final void lf(@k TextItem textItem, @l Y41.a<G0> aVar) {
        I5.a(this.f154480b, textItem.f154463e, false);
        boolean z12 = textItem.f154466h;
        TextView textView = this.f154481c;
        if (z12) {
            Integer num = textItem.f154464f;
            textView.setMaxLines(num != null ? num.intValue() : this.f154483e);
        } else {
            textView.setMaxLines(Integer.MAX_VALUE);
        }
        I5.a(textView, textItem.f154462d, false);
        textView.post(new com.avito.android.app.coldstart.d(this, 24));
        String str = textItem.f154465g;
        if (str == null) {
            str = this.f154484f;
        }
        TextView textView2 = this.f154482d;
        I5.a(textView2, str, false);
        textView2.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(6, aVar));
    }
}
