package com.avito.android.shift_list.ui.list.shift_item;

import Y41.l;
import Y61.k;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig_snippet.list.snippet.GigShiftSnippetButton;
import com.avito.android.gig_snippet.list.snippet.GigShiftSnippetHeader;
import com.avito.android.gig_snippet.list.snippet.GigShiftSnippetTimer;
import com.avito.android.gig_timer_widget.GigSnippetTimerView;
import com.avito.android.lib.design.avatar.Avatar;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ShiftItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/shift_list/ui/list/shift_item/g;", "Lcom/avito/android/shift_list/ui/list/shift_item/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f281138k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f281139b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f281140c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f281141d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f281142e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f281143f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Avatar f281144g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Button f281145h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Button f281146i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final GigSnippetTimerView f281147j;

    public g(@k View view) {
        super(view);
        this.f281139b = view;
        View viewFindViewById = view.findViewById(R.id.item_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f281140c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.working_hours);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f281141d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.address);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f281142e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.seller_name);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f281143f = (TextView) viewFindViewById4;
        this.f281144g = (Avatar) view.findViewById(R.id.logo);
        View viewFindViewById5 = view.findViewById(R.id.primary_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f281145h = (Button) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.secondary_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f281146i = (Button) viewFindViewById6;
        this.f281147j = (GigSnippetTimerView) view.findViewById(R.id.gig_snippet_timer_view);
    }

    @Override // com.avito.android.shift_list.ui.list.shift_item.c
    public final void ij(@k ShiftItem shiftItem, @k l<? super DeepLink, G0> lVar, @k l<? super DeepLink, G0> lVar2) {
        Uri uri;
        String str = shiftItem.f281116c;
        TextView textView = this.f281140c;
        I5.a(textView, str, false);
        TextView textView2 = this.f281141d;
        I5.a(textView2, shiftItem.f281118e, false);
        I5.a(this.f281142e, shiftItem.f281122i, false);
        TextView textView3 = this.f281143f;
        I5.a(textView3, shiftItem.f281120g, false);
        GigShiftSnippetButton gigShiftSnippetButton = shiftItem.f281123j;
        String str2 = gigShiftSnippetButton != null ? gigShiftSnippetButton.f161020b : null;
        Button button = this.f281145h;
        com.avito.android.lib.design.button.b.a(button, str2, false);
        GigShiftSnippetButton gigShiftSnippetButton2 = shiftItem.f281124k;
        String str3 = gigShiftSnippetButton2 != null ? gigShiftSnippetButton2.f161020b : null;
        Button button2 = this.f281146i;
        com.avito.android.lib.design.button.b.a(button2, str3, false);
        GigSnippetTimerView gigSnippetTimerView = this.f281147j;
        gigSnippetTimerView.e();
        GigShiftSnippetTimer gigShiftSnippetTimer = shiftItem.f281119f;
        if (gigShiftSnippetTimer != null) {
            D6.H(gigSnippetTimerView);
            gigSnippetTimerView.c(gigShiftSnippetTimer.f161043b, gigShiftSnippetTimer.f161044c);
            gigSnippetTimerView.setOnFinishListener(new f(this, shiftItem));
            gigSnippetTimerView.setTitle(gigShiftSnippetTimer.f161045d);
            gigSnippetTimerView.setColor(gigShiftSnippetTimer.f161046e);
        } else {
            GigShiftSnippetHeader gigShiftSnippetHeader = shiftItem.f281125l;
            if (gigShiftSnippetHeader != null) {
                D6.H(gigSnippetTimerView);
                gigSnippetTimerView.setTitle(gigShiftSnippetHeader.f161022b);
                gigSnippetTimerView.setColor(gigShiftSnippetHeader.f161023c);
            } else {
                D6.w(gigSnippetTimerView);
            }
        }
        Avatar avatar = this.f281144g;
        avatar.setVisibility(8);
        String str4 = shiftItem.f281121h;
        if (str4 != null && (uri = Uri.parse(str4)) != null) {
            com.bumptech.glide.b.c(avatar).l(uri).B(new e(avatar, this));
        }
        this.itemView.setOnClickListener(new d(lVar2, shiftItem));
        button.setOnClickListener(new d(shiftItem, lVar, 1));
        button2.setOnClickListener(new d(shiftItem, lVar, 2));
        View view = this.f281139b;
        int iD2 = C35835l0.d(R.attr.gray54, view.getContext());
        int iD3 = C35835l0.d(R.attr.black, view.getContext());
        if (shiftItem.f281126m) {
            textView.setTextColor(iD2);
            textView2.setTextColor(iD2);
            textView3.setTextColor(iD2);
        } else {
            textView.setTextColor(iD3);
            textView2.setTextColor(iD3);
            textView3.setTextColor(iD3);
        }
    }
}
