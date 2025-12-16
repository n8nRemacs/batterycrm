package com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import com.avito.android.verification.verification_input_inn.o;
import com.avito.android.work_profile.domain.entity.AppliesToVacancyAction;
import com.avito.android.work_profile.domain.entity.ApplyAction;
import com.avito.android.work_profile.domain.entity.BadgeBar;
import com.avito.android.work_profile.domain.entity.Employer;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AppliesToVacancyView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/ui/items/applies_to_vacancy/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/work_profile/profile/applies/ui/items/applies_to_vacancy/j;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f330979q = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f330980b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f330981c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f330982d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f330983e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f330984f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f330985g;

    /* renamed from: h, reason: collision with root package name */
    public final CompactFlexibleLayout f330986h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f330987i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f330988j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f330989k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f330990l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final CompactFlexibleLayout f330991m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f330992n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Button f330993o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Button f330994p;

    public l(@Y61.k View view) {
        super(view);
        this.f330980b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.created_date);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f330981c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.vacancy_info);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f330982d = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.status_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f330983e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.vacancy_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f330984f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.salary);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f330985g = (TextView) viewFindViewById5;
        this.f330986h = (CompactFlexibleLayout) view.findViewById(R.id.locations_container);
        View viewFindViewById6 = view.findViewById(R.id.company_profile_info);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f330987i = (ConstraintLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.company_avatar);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f330988j = (SimpleDraweeView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.company_name);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f330989k = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.company_date);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f330990l = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.badge_bar);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout");
        }
        this.f330991m = (CompactFlexibleLayout) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.contact_bar);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f330992n = (ConstraintLayout) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.call_button);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f330993o = (Button) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.write_button);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f330994p = (Button) viewFindViewById13;
    }

    @Override // com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.j
    public final void NI(@Y61.k Employer employer, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        G0 g02;
        Image logo = employer.getLogo();
        SimpleDraweeView simpleDraweeView = this.f330988j;
        if (logo != null) {
            D6.c(this.f330991m, Integer.valueOf(y6.b(10)), null, null, null, 14);
            D6.c(this.f330990l, Integer.valueOf(y6.b(10)), null, null, null, 14);
            D6.c(this.f330989k, Integer.valueOf(y6.b(10)), null, null, null, 14);
            C35949t5.c(this.f330988j, com.avito.android.image_loader.b.b(employer.getLogo()), null, null, null, 14);
            D6.H(simpleDraweeView);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(simpleDraweeView);
            D6.c(this.f330991m, Integer.valueOf(y6.b(0)), null, null, null, 14);
            D6.c(this.f330990l, Integer.valueOf(y6.b(0)), null, null, null, 14);
            D6.c(this.f330989k, Integer.valueOf(y6.b(0)), null, null, null, 14);
        }
        I5.a(this.f330989k, employer.getName(), false);
        BadgeBar badgeBar = employer.getBadgeBar();
        List<SerpBadge> badges = badgeBar != null ? badgeBar.getBadges() : null;
        boolean zA2 = O2.a(badges);
        TextView textView = this.f330990l;
        CompactFlexibleLayout compactFlexibleLayout = this.f330991m;
        if (zA2) {
            D6.H(compactFlexibleLayout);
            Q81.b.a(compactFlexibleLayout, badges, 0);
            D6.w(textView);
        } else {
            D6.w(compactFlexibleLayout);
            D6.H(textView);
            textView.setText(employer.getDescription());
        }
        this.f330987i.setOnClickListener(new o(9, lVar, employer));
    }

    @Override // com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.j
    public final void aF(@Y61.k String str) {
        I5.a(this.f330981c, str, false);
    }

    @Override // com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.j
    public final void cm(@Y61.l final ApplyAction applyAction, @Y61.l final Y41.l<? super DeepLink, G0> lVar, @Y61.l final ApplyAction applyAction2, @Y61.l final Y41.l<? super DeepLink, G0> lVar2) {
        AppliesToVacancyAction value;
        AppliesToVacancyAction value2;
        String title = null;
        String title2 = (applyAction == null || (value2 = applyAction.getValue()) == null) ? null : value2.getTitle();
        Button button = this.f330993o;
        com.avito.android.lib.design.button.b.a(button, title2, false);
        if (applyAction != null) {
            final int i12 = 0;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ApplyAction applyAction3 = applyAction;
                    Y41.l lVar3 = lVar;
                    switch (i12) {
                        case 0:
                            int i13 = l.f330979q;
                            if (lVar3 != null) {
                                lVar3.invoke(applyAction3.getValue().getUri());
                                break;
                            }
                            break;
                        default:
                            int i14 = l.f330979q;
                            if (lVar3 != null) {
                                lVar3.invoke(applyAction3.getValue().getUri());
                                break;
                            }
                            break;
                    }
                }
            });
        }
        if (applyAction2 != null && (value = applyAction2.getValue()) != null) {
            title = value.getTitle();
        }
        Button button2 = this.f330994p;
        com.avito.android.lib.design.button.b.a(button2, title, false);
        if (applyAction2 != null) {
            final int i13 = 1;
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ApplyAction applyAction3 = applyAction2;
                    Y41.l lVar3 = lVar2;
                    switch (i13) {
                        case 0:
                            int i132 = l.f330979q;
                            if (lVar3 != null) {
                                lVar3.invoke(applyAction3.getValue().getUri());
                                break;
                            }
                            break;
                        default:
                            int i14 = l.f330979q;
                            if (lVar3 != null) {
                                lVar3.invoke(applyAction3.getValue().getUri());
                                break;
                            }
                            break;
                    }
                }
            });
        }
        D6.G(this.f330992n, (applyAction2 == null && applyAction == null) ? false : true);
        if (applyAction2 != null && applyAction != null) {
            D6.c(this.f330993o, Integer.valueOf(y6.b(0)), null, Integer.valueOf(y6.b(6)), null, 10);
            D6.c(this.f330994p, Integer.valueOf(y6.b(6)), null, 0, null, 10);
        } else if (applyAction2 == null && applyAction != null) {
            D6.c(this.f330993o, null, null, Integer.valueOf(y6.b(0)), null, 11);
        } else {
            if (applyAction2 == null || applyAction != null) {
                return;
            }
            D6.c(this.f330994p, Integer.valueOf(y6.b(0)), null, null, null, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    @Override // com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void jF(@Y61.k com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.VacancyInfo r21, @Y61.k Y41.l<? super com.avito.android.deep_linking.links.DeepLink, kotlin.G0> r22) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.l.jF(com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.VacancyInfo, Y41.l):void");
    }
}
