package com.avito.android.search.filter.adapter.recommendation_cards;

import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RecommendationCardsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/recommendation_cards/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/search/filter/adapter/recommendation_cards/g;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f262559b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayout f262560c;

    /* renamed from: d, reason: collision with root package name */
    @U
    public final int f262561d;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f262559b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f262560c = (LinearLayout) viewFindViewById2;
        this.f262561d = com.avito.android.actions_sheet.a.d(this.itemView, R.dimen.recommendation_cards_margin);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    @Override // com.avito.android.search.filter.adapter.recommendation_cards.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T00(@Y61.k Y41.l r31, @Y61.k java.util.ArrayList r32) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search.filter.adapter.recommendation_cards.i.T00(Y41.l, java.util.ArrayList):void");
    }

    @Override // com.avito.android.search.filter.adapter.recommendation_cards.g
    public final void b(@k String str) {
        I5.a(this.f262559b, str, false);
    }
}
