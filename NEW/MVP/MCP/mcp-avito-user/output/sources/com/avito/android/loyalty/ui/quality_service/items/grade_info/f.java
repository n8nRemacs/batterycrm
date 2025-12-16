package com.avito.android.loyalty.ui.quality_service.items.grade_info;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.header_button.HeaderButton;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.loyalty.ui.items.quality_progress.QualityProgress;
import com.avito.android.loyalty.ui.quality_service.items.grade_info.advice.AdviceItem;
import com.avito.android.loyalty.ui.quality_service.items.grade_info.b;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GradeInfoItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/grade_info/f;", "LTV0/d;", "Lcom/avito/android/loyalty/ui/quality_service/items/grade_info/i;", "Lcom/avito/android/loyalty/ui/quality_service/items/grade_info/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements TV0.d<i, b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f183904b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f183905c;

    @Inject
    public f(@k w wVar, @k a aVar) {
        this.f183904b = wVar;
        this.f183905c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        G0 g03;
        G0 g04;
        final DeepLink deepLink;
        i iVar = (i) eVar;
        b bVar = (b) aVar;
        e eVar2 = new e(1, this.f183905c, a.class, "onProgressClick", "onProgressClick(Lcom/avito/android/loyalty/ui/quality_service/items/grade_info/GradeInfoItem;)V", 0);
        StringBuilder sb2 = new StringBuilder();
        int i13 = bVar.f183886c;
        iVar.f183916f.setText(r.t(sb2, i13, '%'));
        j.a(iVar.f183917g, bVar.f183888e, null);
        int i14 = bVar.f183887d;
        QualityProgress qualityProgress = iVar.f183918h;
        qualityProgress.setBadSectionSize(i14);
        qualityProgress.setProgress(i13);
        iVar.f183915e.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.h(12, (l) eVar2, (Object) bVar));
        boolean z12 = false;
        I5.a(iVar.f183919i, bVar.f183889f, false);
        TextView textView = iVar.f183920j;
        AttributedText attributedText = bVar.f183890g;
        j.a(textView, attributedText, null);
        final w wVar = this.f183904b;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(wVar);
        }
        TextView textView2 = iVar.f183921k;
        I5.a(textView2, bVar.f183893j, false);
        TextView textView3 = iVar.f183923m;
        AttributedText attributedText2 = bVar.f183895l;
        j.a(textView3, attributedText2, null);
        if (attributedText2 != null) {
            attributedText2.setOnDeepLinkClickListener(wVar);
        }
        b.a aVar2 = bVar.f183894k;
        String str = aVar2 != null ? aVar2.f183898a : null;
        HeaderButton headerButton = iVar.f183922l;
        com.avito.android.lib.design.button.b.a(headerButton, str, false);
        boolean z13 = bVar.f183896m;
        Context context = iVar.f183912b;
        ConstraintLayout constraintLayout = iVar.f183914d;
        if (z13) {
            D6.D(constraintLayout, R.drawable.rounded_rectangle_24dp);
            constraintLayout.setBackgroundTintList(ColorStateList.valueOf(C35835l0.d(R.attr.red200, context)));
            constraintLayout.setPadding(y6.b(20), y6.b(16), y6.b(20), y6.b(28));
            qualityProgress.setGoodSectionStart(C35835l0.d(R.attr.red400, context));
            qualityProgress.setGoodSectionEnd(C35835l0.d(R.attr.red400, context));
        } else {
            constraintLayout.setBackground(null);
            constraintLayout.setBackgroundTintList(null);
            constraintLayout.setPadding(0, 0, 0, 0);
            qualityProgress.setGoodSectionStart(-4594594);
            qualityProgress.setGoodSectionEnd(C35835l0.d(R.attr.green600, context));
        }
        ?? r52 = iVar.f183924n;
        r52.removeAllViews();
        List<AdviceItem> list = bVar.f183891h;
        for (AdviceItem adviceItem : list) {
            View viewInflate = iVar.f183913c.inflate(R.layout.item_advice, r52, z12);
            com.avito.android.loyalty.ui.quality_service.items.grade_info.advice.a aVar3 = new com.avito.android.loyalty.ui.quality_service.items.grade_info.advice.a(viewInflate);
            int i15 = adviceItem.f183869a;
            aVar3.f183881d.setText(String.valueOf(i15));
            aVar3.f183883f.setText(adviceItem.f183870b);
            AdviceItem.Color color = adviceItem.f183871c;
            Context context2 = aVar3.f183879b;
            int iD2 = C35835l0.d(color.f183877c, context2);
            ProgressBarRe23 progressBarRe23 = aVar3.f183882e;
            progressBarRe23.setProgressColor(iD2);
            progressBarRe23.setTrackColor(C35835l0.d(color.f183876b, context2));
            progressBarRe23.setProgress(i15 / 100.0f);
            Badge badge = aVar3.f183884g;
            D6.G(badge, false);
            badge.setTitleText("");
            r52.addView(viewInflate);
            z12 = false;
        }
        r52.setVisibility(!list.isEmpty() ? z12 : 8);
        if (aVar2 == null || (deepLink = aVar2.f183899b) == null) {
            g02 = null;
        } else {
            final int i16 = 0;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.loyalty.ui.quality_service.items.grade_info.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeepLink deepLink2 = deepLink;
                    w wVar2 = wVar;
                    switch (i16) {
                        case 0:
                            int i17 = i.f183911p;
                            wVar2.i7(deepLink2);
                            break;
                        default:
                            int i18 = i.f183911p;
                            wVar2.i7(deepLink2);
                            break;
                    }
                }
            });
            final int i17 = 1;
            headerButton.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.loyalty.ui.quality_service.items.grade_info.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeepLink deepLink2 = deepLink;
                    w wVar2 = wVar;
                    switch (i17) {
                        case 0:
                            int i172 = i.f183911p;
                            wVar2.i7(deepLink2);
                            break;
                        default:
                            int i18 = i.f183911p;
                            wVar2.i7(deepLink2);
                            break;
                    }
                }
            });
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            g03 = null;
            textView2.setOnClickListener(null);
        } else {
            g03 = null;
        }
        Button button = iVar.f183925o;
        b.a aVar4 = bVar.f183892i;
        if (aVar4 != null) {
            button.setText(aVar4.f183898a);
            button.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.h(13, aVar4, wVar));
            D6.H(button);
            g04 = G0.f406611a;
        } else {
            g04 = g03;
        }
        if (g04 == null) {
            D6.w(button);
        }
    }
}
