package com.avito.android.advert_core.information_about;

import Y61.k;
import Y61.l;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.util.q;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InformationAboutView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/information_about/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/information_about/g;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f83698f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f83699b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f83700c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f83701d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f83702e;

    public h(@k View view) {
        super(view);
        this.f83699b = view;
        this.f83700c = (ImageView) view.findViewById(R.id.icon);
        this.f83701d = (TextView) view.findViewById(R.id.title);
        TextView textView = (TextView) view.findViewById(R.id.about);
        this.f83702e = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.advert_core.information_about.g
    public final void MO(@k Y41.a<G0> aVar) {
        this.f83702e.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(11, aVar));
    }

    @Override // com.avito.android.advert_core.information_about.g
    public final void b(@l String str) {
        I5.a(this.f83701d, str, false);
    }

    @Override // com.avito.android.advert_core.information_about.g
    public final void hL(@k SpannableString spannableString) {
        I5.a(this.f83702e, spannableString, false);
    }

    @Override // com.avito.android.advert_core.information_about.g
    public final void rc(@l String str, @l String str2) {
        Integer numA;
        Integer numA2;
        this.f83700c.setImageDrawable(C35835l0.m(this.f83699b.getContext(), (str == null || (numA2 = q.a(str)) == null) ? R.attr.ic_rub20 : numA2.intValue(), (str2 == null || (numA = com.avito.android.lib.util.e.a(str2)) == null) ? R.attr.black : numA.intValue()));
    }
}
