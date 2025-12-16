package com.avito.android.mortgage.person_form.list.items.verification_banner;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.content.res.i;
import coil.j;
import coil.request.p;
import coil.view.C27251e;
import coil.view.C27253g;
import coil.view.Scale;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/verification_banner/g;", "LC00/a;", "Lcom/avito/android/mortgage/person_form/list/items/verification_banner/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends C00.a implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f200837b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f200838c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f200839d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f200840e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Spinner f200841f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.a<G0> f200842g;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f200837b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f200838c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f200839d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.action);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById4;
        this.f200840e = button;
        View viewFindViewById5 = view.findViewById(R.id.waiting_spinner);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f200841f = (Spinner) viewFindViewById5;
        button.setOnClickListener(new ViewOnClickListenerC31873b(this, 19));
    }

    @Override // com.avito.android.mortgage.person_form.list.items.verification_banner.f
    public final void A2(@l String str) {
        ImageView imageView = this.f200837b;
        if (str == null) {
            D6.w(imageView);
            return;
        }
        D6.G(imageView, true);
        j jVarA = coil.d.a(imageView.getContext());
        p.a aVar = new p.a(imageView.getContext());
        aVar.f58691c = str;
        aVar.f58692d = new K2.b(imageView);
        aVar.b();
        aVar.f58714z = new C27251e(C27253g.f58764c);
        aVar.b();
        aVar.f58685A = Scale.f58756c;
        jVarA.b(aVar.a());
    }

    @Override // com.avito.android.mortgage.person_form.list.items.verification_banner.f
    public final void EI(boolean z12) {
        this.f200840e.setEnabled(z12);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.verification_banner.f
    public final void Th(@l String str, boolean z12) throws Resources.NotFoundException {
        Drawable drawable;
        Button button = this.f200840e;
        com.avito.android.lib.design.button.b.a(button, str, false);
        Spinner spinner = this.f200841f;
        if (str == null || str.length() == 0) {
            D6.w(spinner);
            return;
        }
        if (z12) {
            Resources resources = button.getResources();
            Resources.Theme theme = button.getContext().getTheme();
            ThreadLocal<TypedValue> threadLocal = i.f44673a;
            drawable = resources.getDrawable(R.drawable.ic_transparent_16, theme);
        } else {
            drawable = null;
        }
        Button.g(this.f200840e, drawable, null, false, null, 14);
        D6.G(spinner, z12);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.verification_banner.f
    public final void U(@k Y41.a<G0> aVar) {
        this.f200842g = aVar;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.verification_banner.f
    public final void n(@l String str) {
        I5.a(this.f200839d, str, false);
    }

    @Override // C00.a, C00.c
    public final void setEnabled(boolean z12) {
        this.f200840e.setEnabled(z12);
        Spinner spinner = this.f200841f;
        TextView textView = this.f200839d;
        TextView textView2 = this.f200838c;
        ImageView imageView = this.f200837b;
        if (z12) {
            imageView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            spinner.setAlpha(1.0f);
            return;
        }
        imageView.setAlpha(0.4f);
        textView2.setAlpha(0.4f);
        textView.setAlpha(0.4f);
        spinner.setAlpha(0.4f);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.verification_banner.f
    public final void setTitle(@k String str) {
        this.f200838c.setText(str);
    }
}
