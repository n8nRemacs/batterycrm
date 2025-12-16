package com.avito.android.advert_core.auto_select_parameters_v2.advantage;

import Y41.l;
import Y61.k;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSelectExpandableAdvantageView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/auto_select_parameters_v2/advantage/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/auto_select_parameters_v2/advantage/h;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f82973h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f82974b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayout f82975c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f82976d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f82977e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f82978f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ImageView f82979g;

    public i(@k View view) {
        super(view);
        this.f82974b = view;
        View viewFindViewById = view.findViewById(R.id.collapsed_advantage_panel);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f82975c = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.icon_image_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f82976d = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f82977e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.auto_select_expandable_advantage_description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f82978f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.arrow_image_view);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f82979g = (ImageView) viewFindViewById5;
    }

    @Override // com.avito.android.advert_core.auto_select_parameters_v2.advantage.h
    public final void Lq(@k l lVar, @k AttributedText attributedText) {
        attributedText.setOnDeepLinkClickListener(new SE0.a(6, lVar));
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f82978f;
        textView.setMovementMethod(linkMovementMethod);
        j.c(textView, attributedText, null);
    }

    @Override // com.avito.android.advert_core.auto_select_parameters_v2.advantage.h
    public final void QH(@k Y41.a<G0> aVar) {
        this.f82975c.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(4, aVar));
    }

    @Override // com.avito.android.advert_core.auto_select_parameters_v2.advantage.h
    public final void Z(@k String str) {
        int length = str.length();
        ImageView imageView = this.f82976d;
        if (length <= 0) {
            D6.w(imageView);
            return;
        }
        D6.H(imageView);
        imageView.setColorFilter(new PorterDuffColorFilter(C35835l0.d(R.attr.black, imageView.getContext()), PorterDuff.Mode.SRC_IN));
        Integer numA = q.a(str);
        if (numA != null) {
            imageView.setImageDrawable(C35835l0.h(numA.intValue(), imageView.getContext()));
        }
    }

    @Override // com.avito.android.advert_core.auto_select_parameters_v2.advantage.h
    public final void setTitle(@k String str) {
        this.f82977e.setText(str);
    }

    @Override // com.avito.android.advert_core.auto_select_parameters_v2.advantage.h
    public final void y5(boolean z12) {
        TextView textView = this.f82978f;
        ImageView imageView = this.f82979g;
        if (z12) {
            imageView.animate().rotation(0.0f).start();
            D6.w(textView);
        } else {
            imageView.animate().rotation(180.0f).start();
            D6.H(textView);
        }
    }
}
