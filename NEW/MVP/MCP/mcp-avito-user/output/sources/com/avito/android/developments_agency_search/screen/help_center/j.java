package com.avito.android.developments_agency_search.screen.help_center;

import Gw.InterfaceC13923a;
import Ww.C15804b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.developments_agency_search.screen.help_center.a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.T2;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: HelpCenterViewHolder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/help_center/j;", "Lcom/avito/android/developments_agency_search/screen/help_center/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f137980a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13923a, G0> f137981b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f137982c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f137983d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f137984e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f137985f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f137986g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f137987h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f137988i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f137989j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Button f137990k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final View f137991l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final View f137992m;

    public j(@Y61.k View view, @Y61.k a aVar, @Y61.k Y41.l lVar) {
        this.f137980a = aVar;
        this.f137981b = lVar;
        this.f137982c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.skeleton);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f137983d = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f137984e = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.regional_manager_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f137985f = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.section_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137986g = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.regional_manager_avatar);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f137987h = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.regional_manager_name);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137988i = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.regional_manager_phone);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137989j = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.call_manager_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f137990k = (Button) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.start_chat_button);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById9;
        FV.a aVar2 = FV.a.f4720a;
        String string = button.getContext().getString(R.string.developments_agency_search_help_center_start_chat_button);
        Context context = button.getContext();
        int iB2 = y6.b(6);
        aVar2.getClass();
        button.setState(new UU.a(FV.a.i(string, context, R.attr.textIconChat, iB2), null, false, false, false, new i(this), null, null, null, false, 990, null));
        View viewFindViewById10 = view.findViewById(R.id.call_phone_button);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button2 = (Button) viewFindViewById10;
        button2.setState(new UU.a(FV.a.i("8 804 700-05-57", button2.getContext(), R.attr.textIconCall, y6.b(6)), null, false, false, false, new f(this), null, null, null, false, 990, null));
        View viewFindViewById11 = view.findViewById(R.id.send_email_button);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button3 = (Button) viewFindViewById11;
        button3.setState(new UU.a(FV.a.i("", button3.getContext(), R.attr.textIconMail, 0), null, false, false, false, new h(this), null, null, null, false, 990, null));
        View viewFindViewById12 = view.findViewById(R.id.write_to_support_button);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button4 = (Button) viewFindViewById12;
        button4.setState(new UU.a(FV.a.i(button4.getContext().getString(R.string.developments_agency_search_help_center_contact_support), button4.getContext(), R.attr.textIconMail, y6.b(6)), null, false, false, false, new g(this), null, null, null, false, 990, null));
        View viewFindViewById13 = view.findViewById(R.id.tariff_card);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        final int i12 = 0;
        viewFindViewById13.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.developments_agency_search.screen.help_center.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f137962c;

            {
                this.f137962c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f137962c.f137981b.invoke(InterfaceC13923a.g.f6783a);
                        break;
                    default:
                        this.f137962c.f137981b.invoke(InterfaceC13923a.C0382a.f6777a);
                        break;
                }
            }
        });
        this.f137991l = viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.about_service);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        final int i13 = 1;
        viewFindViewById14.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.developments_agency_search.screen.help_center.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f137962c;

            {
                this.f137962c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f137962c.f137981b.invoke(InterfaceC13923a.g.f6783a);
                        break;
                    default:
                        this.f137962c.f137981b.invoke(InterfaceC13923a.C0382a.f6777a);
                        break;
                }
            }
        });
        this.f137992m = viewFindViewById14;
    }

    public final void a(@Y61.k Gw.d dVar) {
        D6.w(this.f137983d);
        D6.G(this.f137984e, true);
        final C15804b c15804b = (C15804b) T2.a(dVar.f6799a);
        ViewGroup viewGroup = this.f137985f;
        if (c15804b == null) {
            D6.w(viewGroup);
        } else {
            D6.H(viewGroup);
            I5.a(this.f137986g, c15804b.getTitle(), false);
            I5.a(this.f137988i, c15804b.getName(), false);
            I5.a(this.f137989j, c15804b.getPhone(), false);
            Drawable drawableA = C43852a.a(this.f137987h.getContext(), R.drawable.client_item_avatar_background);
            C35949t5.c(this.f137987h, com.avito.android.image_loader.b.b(c15804b.getAvatarUrl()), drawableA, null, null, 12);
            this.f137990k.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.developments_agency_search.screen.help_center.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C15804b c15804b2 = c15804b;
                    ((a.C4159a) this.f137974b.f137981b).invoke(new InterfaceC13923a.b(c15804b2.getName(), c15804b2.getPhone()));
                }
            });
        }
        boolean z12 = dVar.f6800b;
        a aVar = this.f137980a;
        View view = this.f137992m;
        View view2 = this.f137991l;
        if (z12) {
            D6.w(view2);
            D6.w(view);
            com.avito.android.lib.design.bottom_sheet.d.M(aVar, null, false, true, 7);
        } else {
            D6.H(view2);
            D6.H(view);
            com.avito.android.lib.design.bottom_sheet.d.M(aVar, this.f137982c.getString(R.string.developments_agency_search_help_center_title), true, true, 2);
        }
    }
}
