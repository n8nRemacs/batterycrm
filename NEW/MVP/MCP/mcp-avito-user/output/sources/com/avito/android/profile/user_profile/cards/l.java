package com.avito.android.profile.user_profile.cards;

import Ua0.InterfaceC15503a;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.profile.user_profile.cards.passport.ReputationAndRatingCard;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35852n1;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import xV.C49888a;
import xV.C49890c;

/* compiled from: ProfileInfoReputationSubView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/l;", "Lcom/avito/android/profile/user_profile/cards/j;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements j {

    /* renamed from: b, reason: collision with root package name */
    public final Context f225018b;

    /* renamed from: c, reason: collision with root package name */
    public final View f225019c;

    /* renamed from: d, reason: collision with root package name */
    public final View f225020d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f225021e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f225022f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ProgressBarRe23 f225023g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f225024h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f225025i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f225026j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f225027k;

    /* renamed from: l, reason: collision with root package name */
    public final RatingBar f225028l;

    /* compiled from: ProfileInfoReputationSubView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f225029a;

        static {
            int[] iArr = new int[ReputationAndRatingCard.ProfileProReputationItemColor.values().length];
            try {
                ReputationAndRatingCard.ProfileProReputationItemColor profileProReputationItemColor = ReputationAndRatingCard.ProfileProReputationItemColor.f225127b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ReputationAndRatingCard.ProfileProReputationItemColor profileProReputationItemColor2 = ReputationAndRatingCard.ProfileProReputationItemColor.f225127b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f225029a = iArr;
        }
    }

    public l(@Y61.k View view) {
        this.f225018b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.user_profile_widget_subview);
        this.f225019c = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.reputation_widget);
        this.f225020d = viewFindViewById2;
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.profile_reputation_score);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225021e = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.profile_reputation_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225022f = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.profile_reputation_progress);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23");
        }
        this.f225023g = (ProgressBarRe23) viewFindViewById5;
        View viewFindViewById6 = viewFindViewById.findViewById(R.id.profile_reputation_badge);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f225024h = viewFindViewById6;
        View viewFindViewById7 = viewFindViewById.findViewById(R.id.rating_widget);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f225025i = viewFindViewById7;
        View viewFindViewById8 = viewFindViewById7.findViewById(R.id.profile_rating_score);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225026j = (TextView) viewFindViewById8;
        View viewFindViewById9 = viewFindViewById7.findViewById(R.id.profile_rating_title);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225027k = (TextView) viewFindViewById9;
        this.f225028l = (RatingBar) viewFindViewById7.findViewById(R.id.profile_rating_stars);
    }

    public static void a(TextView textView, boolean z12, String str) {
        if (z12) {
            textView.setMaxLines(2);
            textView.setTextAppearance(C35835l0.j(R.attr.textM1, textView.getContext()));
        } else {
            textView.setMaxLines(1);
            textView.setTextAppearance(C35835l0.j(R.attr.textM2, textView.getContext()));
        }
        textView.setTextColor(C35835l0.d(R.attr.gray64, textView.getContext()));
        com.avito.android.util.text.j.a(textView, new AttributedText(str, C42784z0.f406748b, 1), null);
    }

    @Override // com.avito.android.profile.user_profile.cards.j
    public final void FT() {
        D6.w(this.f225019c);
    }

    @Override // com.avito.android.profile.user_profile.cards.j
    public final void sZ(@Y61.k final ReputationAndRatingCard reputationAndRatingCard, @Y61.k final Y41.l<? super InterfaceC15503a, G0> lVar) {
        boolean z12;
        D6.H(this.f225019c);
        Integer num = reputationAndRatingCard.f225121d;
        boolean z13 = false;
        ProgressBarRe23 progressBarRe23 = this.f225023g;
        TextView textView = this.f225021e;
        if (num != null) {
            int iIntValue = num.intValue();
            D6.H(textView);
            D6.H(progressBarRe23);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(iIntValue);
            sb2.append('%');
            I5.a(textView, sb2.toString(), false);
            float f12 = iIntValue / 100.0f;
            ReputationAndRatingCard.ProfileProReputationItemColor profileProReputationItemColor = reputationAndRatingCard.f225122e;
            int i12 = profileProReputationItemColor == null ? -1 : a.f225029a[profileProReputationItemColor.ordinal()];
            int i13 = i12 != 1 ? i12 != 2 ? R.attr.red600 : R.attr.green700 : R.attr.orange600;
            Context context = this.f225018b;
            progressBarRe23.setState(new C49888a(new xV.d(C42745f0.U(new C49890c(f12, C35835l0.d(i13, context)), new C49890c(1.0f - f12, C35835l0.d(R.attr.warmGray16, context))))));
            z12 = false;
        } else {
            D6.w(textView);
            D6.w(progressBarRe23);
            z12 = true;
        }
        a(this.f225022f, z12, reputationAndRatingCard.f225119b);
        D6.G(this.f225024h, reputationAndRatingCard.f225120c);
        final int i14 = 0;
        this.f225020d.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.profile.user_profile.cards.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        lVar.invoke(new InterfaceC15503a.p(reputationAndRatingCard.f225123f));
                        break;
                    default:
                        lVar.invoke(new InterfaceC15503a.l(reputationAndRatingCard.f225126i));
                        break;
                }
            }
        });
        Float f13 = reputationAndRatingCard.f225125h;
        boolean z14 = f13 != null;
        TextView textView2 = this.f225026j;
        D6.G(textView2, z14);
        boolean z15 = f13 != null;
        RatingBar ratingBar = this.f225028l;
        D6.G(ratingBar, z15);
        if (f13 != null) {
            float fFloatValue = f13.floatValue();
            ratingBar.setFloatingRatingIsEnabled(true);
            ratingBar.setRating(fFloatValue);
            textView2.setText(C35852n1.a(fFloatValue));
        } else {
            z13 = true;
        }
        a(this.f225027k, z13, reputationAndRatingCard.f225124g);
        final int i15 = 1;
        this.f225025i.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.profile.user_profile.cards.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        lVar.invoke(new InterfaceC15503a.p(reputationAndRatingCard.f225123f));
                        break;
                    default:
                        lVar.invoke(new InterfaceC15503a.l(reputationAndRatingCard.f225126i));
                        break;
                }
            }
        });
    }
}
