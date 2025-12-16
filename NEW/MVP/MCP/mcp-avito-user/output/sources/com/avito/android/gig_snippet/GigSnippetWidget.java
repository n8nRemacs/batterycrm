package com.avito.android.gig_snippet;

import Y41.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig_snippet.list.next_button.GigShiftNextButtonItem;
import com.avito.android.gig_snippet.list.snippet.GigShiftSnippetItem;
import com.avito.android.lib.design.header_button.HeaderButton;
import com.avito.android.util.I5;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GigSnippetWidget.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_snippet/GigSnippetWidget;", "Landroid/widget/FrameLayout;", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigSnippetWidget extends FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f160993i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f160994b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f160995c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final HeaderButton f160996d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f160997e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f160998f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public l<? super DeepLink, G0> f160999g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public l<? super DeepLink, G0> f161000h;

    @X41.j
    public GigSnippetWidget(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void a(@Y61.k GigShiftSnippetItem gigShiftSnippetItem, @Y61.k l<? super DeepLink, G0> lVar, @Y61.k l<? super DeepLink, G0> lVar2, @Y61.l l<? super DeepLink, G0> lVar3) {
        this.f160999g = lVar;
        this.f161000h = lVar2;
        I5.a(this.f160994b, gigShiftSnippetItem.f161024b, false);
        if (lVar3 != null) {
            DeepLink deepLink = gigShiftSnippetItem.f161027e;
            View view = this.f160995c;
            HeaderButton headerButton = this.f160996d;
            if (deepLink != null) {
                headerButton.setVisibility(0);
                view.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(19, lVar3, gigShiftSnippetItem));
            } else {
                headerButton.setVisibility(8);
                view.setOnClickListener(null);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(gigShiftSnippetItem.f161025c);
        GigShiftNextButtonItem gigShiftNextButtonItem = gigShiftSnippetItem.f161028f;
        if (gigShiftNextButtonItem != null) {
            arrayList.add(gigShiftNextButtonItem);
        }
        com.avito.konveyor.util.a.a(this.f160998f, arrayList);
        RecyclerView.Adapter adapter = this.f160997e.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public GigSnippetWidget(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) throws BlueprintCollisionException {
        super(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f160999g = j.f161008l;
        this.f161000h = k.f161009l;
        View.inflate(context, R.layout.gig_snippet_widget_layout, this);
        View viewFindViewById = findViewById(R.id.gig_shifts_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        View viewFindViewById2 = findViewById(R.id.gig_shifts_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f160994b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.gig_shifts_title_clickable_area);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f160995c = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.gig_shifts_click_marker);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.header_button.HeaderButton");
        }
        HeaderButton headerButton = (HeaderButton) viewFindViewById4;
        this.f160996d = headerButton;
        headerButton.setClickable(false);
        View viewFindViewById5 = findViewById(R.id.gig_snippet_recycler);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById5;
        this.f160997e = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        Set setL0 = C42756l.l0(new TV0.b[]{new com.avito.android.gig_snippet.list.snippet.a(new com.avito.android.gig_snippet.list.snippet.g(new g(this), new h(this), null, 4, null)), new com.avito.android.gig_snippet.list.next_button.a(new com.avito.android.gig_snippet.list.next_button.d(new i(this)))});
        a.C10493a c10493a = new a.C10493a();
        Iterator it = setL0.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f160998f = hVar;
        this.f160997e.setAdapter(new com.avito.konveyor.adapter.j(hVar, aVarA));
        this.f160997e.l(new JH.a(), -1);
    }
}
