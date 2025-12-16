package com.avito.android.profile.pro.impl.screen.item.reputation;

import D90.a;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.profile.pro.impl.screen.item.reputation.ProfileProReputationItem;
import com.avito.android.profile.pro.impl.screen.item.reputation.g;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35771d0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35852n1;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import xV.C49888a;
import yV.C50177a;

/* compiled from: ProfileProReputationPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/reputation/d;", "Lcom/avito/android/profile/pro/impl/screen/item/reputation/c;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<D90.a, G0> f223460b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super D90.a, G0> lVar) {
        this.f223460b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        final int i13 = 1;
        Object[] objArr = 0;
        g gVar = (g) eVar;
        final ProfileProReputationItem profileProReputationItem = (ProfileProReputationItem) aVar;
        TextView textView = gVar.f223469e;
        Integer num = profileProReputationItem.f223444e;
        ProgressBarRe23 progressBarRe23 = gVar.f223470f;
        TextView textView2 = gVar.f223468d;
        if (num != null) {
            int iIntValue = num.intValue();
            D6.H(textView2);
            D6.H(progressBarRe23);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(iIntValue);
            sb2.append('%');
            I5.a(textView2, sb2.toString(), false);
            progressBarRe23.setState(new C49888a(new xV.e(iIntValue / 100.0f)));
            Context context = progressBarRe23.getContext();
            ProfileProReputationItem.ProfileProReputationItemColor profileProReputationItemColor = profileProReputationItem.f223445f;
            int i14 = profileProReputationItemColor == null ? -1 : g.a.f223476a[profileProReputationItemColor.ordinal()];
            progressBarRe23.setStyle(C50177a.a(gVar.f223466b, null, C35771d0.b(C35835l0.e(i14 != 1 ? i14 != 2 ? R.attr.red600 : R.attr.green700 : R.attr.orange600, context)), 61));
            textView.setMaxLines(1);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(textView2);
            D6.w(progressBarRe23);
            textView.setMaxLines(2);
        }
        C42784z0 c42784z0 = C42784z0.f406748b;
        j.a(textView, new AttributedText(profileProReputationItem.f223442c, c42784z0, 1), null);
        D6.G(gVar.f223471g, profileProReputationItem.f223443d);
        final l<D90.a, G0> lVar = this.f223460b;
        final Object[] objArr2 = objArr == true ? 1 : 0;
        gVar.f223467c.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.profile.pro.impl.screen.item.reputation.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l lVar2 = lVar;
                ProfileProReputationItem profileProReputationItem2 = profileProReputationItem;
                switch (objArr2) {
                    case 0:
                        int i15 = g.f223465l;
                        lVar2.invoke(new a.h(profileProReputationItem2.f223446g));
                        break;
                    default:
                        int i16 = g.f223465l;
                        lVar2.invoke(new a.t(profileProReputationItem2.f223449j));
                        break;
                }
            }
        });
        Float f12 = profileProReputationItem.f223448i;
        boolean z12 = f12 != null;
        TextView textView3 = gVar.f223473i;
        D6.G(textView3, z12);
        boolean z13 = f12 != null;
        RatingBar ratingBar = gVar.f223475k;
        D6.G(ratingBar, z13);
        TextView textView4 = gVar.f223474j;
        if (f12 != null) {
            float fFloatValue = f12.floatValue();
            ratingBar.setFloatingRatingIsEnabled(true);
            ratingBar.setRating(fFloatValue);
            textView3.setText(C35852n1.a(fFloatValue));
            textView4.setMaxLines(1);
            G0 g03 = G0.f406611a;
        } else {
            new h(gVar);
        }
        j.a(textView4, new AttributedText(profileProReputationItem.f223447h, c42784z0, 1), null);
        gVar.f223472h.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.profile.pro.impl.screen.item.reputation.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l lVar2 = lVar;
                ProfileProReputationItem profileProReputationItem2 = profileProReputationItem;
                switch (i13) {
                    case 0:
                        int i15 = g.f223465l;
                        lVar2.invoke(new a.h(profileProReputationItem2.f223446g));
                        break;
                    default:
                        int i16 = g.f223465l;
                        lVar2.invoke(new a.t(profileProReputationItem2.f223449j));
                        break;
                }
            }
        });
    }
}
