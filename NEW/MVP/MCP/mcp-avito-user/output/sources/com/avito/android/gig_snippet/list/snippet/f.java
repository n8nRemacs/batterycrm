package com.avito.android.gig_snippet.list.snippet;

import Y41.l;
import Y61.k;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig_timer_widget.GigSnippetTimerView;
import com.avito.android.lib.design.avatar.Avatar;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GigShiftSnippetItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_snippet/list/snippet/f;", "Lcom/avito/android/gig_snippet/list/snippet/b;", "Lcom/avito/konveyor/adapter/b;", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f extends com.avito.konveyor.adapter.b implements b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f161059l = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f161060b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f161061c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f161062d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f161063e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f161064f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f161065g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Avatar f161066h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Button f161067i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Button f161068j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final GigSnippetTimerView f161069k;

    public f(@k View view) {
        super(view);
        this.f161060b = view;
        this.f161061c = view;
        View viewFindViewById = view.findViewById(R.id.item_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f161062d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.working_hours);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f161063e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.address);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f161064f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.seller_name);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f161065g = (TextView) viewFindViewById4;
        this.f161066h = (Avatar) view.findViewById(R.id.logo);
        View viewFindViewById5 = view.findViewById(R.id.primary_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f161067i = (Button) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.secondary_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f161068j = (Button) viewFindViewById6;
        this.f161069k = (GigSnippetTimerView) view.findViewById(R.id.gig_snippet_timer_view);
    }

    @Override // com.avito.android.gig_snippet.list.snippet.b
    public final void A40(@k GigShiftSnippetListItem gigShiftSnippetListItem, @k l<? super DeepLink, G0> lVar, @k l<? super DeepLink, G0> lVar2, @Y61.l Y41.a<G0> aVar) {
        Uri uri;
        String str = gigShiftSnippetListItem.f161030c;
        TextView textView = this.f161062d;
        I5.a(textView, str, false);
        TextView textView2 = this.f161063e;
        I5.a(textView2, gigShiftSnippetListItem.f161032e, false);
        I5.a(this.f161064f, gigShiftSnippetListItem.f161036i, false);
        TextView textView3 = this.f161065g;
        I5.a(textView3, gigShiftSnippetListItem.f161034g, false);
        GigShiftSnippetButton gigShiftSnippetButton = gigShiftSnippetListItem.f161037j;
        String str2 = gigShiftSnippetButton != null ? gigShiftSnippetButton.f161020b : null;
        Button button = this.f161067i;
        com.avito.android.lib.design.button.b.a(button, str2, false);
        GigShiftSnippetButton gigShiftSnippetButton2 = gigShiftSnippetListItem.f161038k;
        String str3 = gigShiftSnippetButton2 != null ? gigShiftSnippetButton2.f161020b : null;
        Button button2 = this.f161068j;
        com.avito.android.lib.design.button.b.a(button2, str3, false);
        GigSnippetTimerView gigSnippetTimerView = this.f161069k;
        gigSnippetTimerView.e();
        GigShiftSnippetTimer gigShiftSnippetTimer = gigShiftSnippetListItem.f161033f;
        if (gigShiftSnippetTimer != null) {
            D6.H(gigSnippetTimerView);
            gigSnippetTimerView.c(gigShiftSnippetTimer.f161043b, gigShiftSnippetTimer.f161044c);
            gigSnippetTimerView.setOnFinishListener(new e(this, gigShiftSnippetListItem, aVar));
            gigSnippetTimerView.setTitle(gigShiftSnippetTimer.f161045d);
            gigSnippetTimerView.setColor(gigShiftSnippetTimer.f161046e);
        } else {
            GigShiftSnippetHeader gigShiftSnippetHeader = gigShiftSnippetListItem.f161039l;
            if (gigShiftSnippetHeader != null) {
                D6.H(gigSnippetTimerView);
                gigSnippetTimerView.setTitle(gigShiftSnippetHeader.f161022b);
                gigSnippetTimerView.setColor(gigShiftSnippetHeader.f161023c);
            } else {
                D6.w(gigSnippetTimerView);
            }
        }
        String str4 = gigShiftSnippetListItem.f161035h;
        int i12 = str4 == null ? 8 : 0;
        Avatar avatar = this.f161066h;
        avatar.setVisibility(i12);
        if (str4 != null && (uri = Uri.parse(str4)) != null) {
            com.bumptech.glide.b.c(avatar).l(uri).B(new d(avatar, this));
        }
        this.itemView.setOnClickListener(new c(lVar2, gigShiftSnippetListItem));
        button.setOnClickListener(new c(gigShiftSnippetListItem, lVar, 1));
        button2.setOnClickListener(new c(gigShiftSnippetListItem, lVar, 2));
        View view = this.f161061c;
        int iD2 = C35835l0.d(R.attr.gray54, view.getContext());
        int iD3 = C35835l0.d(R.attr.black, view.getContext());
        if (gigShiftSnippetListItem.f161040m) {
            textView.setTextColor(iD2);
            textView2.setTextColor(iD2);
            textView3.setTextColor(iD2);
        } else {
            textView.setTextColor(iD3);
            textView2.setTextColor(iD3);
            textView3.setTextColor(iD3);
        }
        boolean z12 = gigShiftSnippetListItem.f161041n;
        View view2 = this.f161060b;
        if (z12) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = -1;
            view2.setLayoutParams(layoutParams);
        }
        if (gigShiftSnippetListItem.f161042o) {
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = -2;
            view2.setLayoutParams(layoutParams2);
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), y6.b(20));
        }
    }
}
