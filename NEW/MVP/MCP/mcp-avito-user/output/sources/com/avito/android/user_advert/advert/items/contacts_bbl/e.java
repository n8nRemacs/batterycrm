package com.avito.android.user_advert.advert.items.contacts_bbl;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.circular_counter.CircularCounter;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_advert.advert.items.contacts_bbl.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: ContactsBblItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/contacts_bbl/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/contacts_bbl/d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f309329e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayout f309330b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CircularCounter f309331c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f309332d;

    public e(@k View view) {
        super(view);
        this.f309330b = (LinearLayout) view.findViewById(R.id.contacts_bbl_container);
        this.f309331c = (CircularCounter) view.findViewById(R.id.contacts_bbl_counter);
        this.f309332d = (TextView) view.findViewById(R.id.contacts_bbl_description);
    }

    @Override // com.avito.android.user_advert.advert.items.contacts_bbl.d
    public final void F(@k AttributedText attributedText) {
        j.a(this.f309332d, attributedText, null);
    }

    @Override // com.avito.android.user_advert.advert.items.contacts_bbl.d
    public final void Fa(@k Y41.a<G0> aVar) {
        this.f309330b.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(14, aVar));
    }

    @Override // com.avito.android.user_advert.advert.items.contacts_bbl.d
    public final void XX(@k a.C9484a c9484a) {
        Drawable drawableH;
        Float fValueOf = Float.valueOf(c9484a.f309322b);
        CircularCounter circularCounter = this.f309331c;
        circularCounter.setProgress(fValueOf);
        circularCounter.setCounter(Integer.valueOf(c9484a.f309321a));
        G0 g02 = null;
        String str = c9484a.f309323c;
        if (str != null) {
            Integer numA = q.a(str);
            if (numA != null) {
                drawableH = C35835l0.h(numA.intValue(), this.itemView.getContext());
            } else {
                drawableH = null;
            }
            if (drawableH != null) {
                drawableH.setTint(C35835l0.d(R.attr.black, this.itemView.getContext()));
            }
            circularCounter.setIcon(drawableH);
        }
        UniversalColor universalColor = c9484a.f309324d;
        if (universalColor != null) {
            circularCounter.setTrackColor(C48063a.f437606a.a(this.itemView.getContext(), universalColor));
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            circularCounter.setTrackColor(C35835l0.d(R.attr.green600, this.itemView.getContext()));
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f309330b.setOnClickListener(null);
    }
}
