package com.avito.android.virtual_deal_room_invite.invite.view;

import Y41.l;
import Y61.k;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.deeplink_handler.view.impl.i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.g;
import com.avito.android.util.C35835l0;
import com.avito.android.virtual_deal_room_invite.invite.model.CounterColor;
import iO0.C41327b;
import j.e0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import nO0.InterfaceC44300a;

/* compiled from: InviteView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/view/c;", "Lcom/avito/android/virtual_deal_room_invite/invite/view/a;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.virtual_deal_room_invite.invite.view.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f327103a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC44300a, G0> f327104b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final i f327105c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FragmentManager f327106d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f327107e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f327108f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f327109g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InviteInfoView f327110h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InviteInfoView f327111i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f327112j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Button f327113k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Button f327114l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Button f327115m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final ScrollView f327116n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final View f327117o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public com.avito.android.virtual_deal_room_invite.invite.dialog.b f327118p;

    /* compiled from: InviteView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            c.this.f327104b.invoke(InterfaceC44300a.d.f415099a);
            return G0.f406611a;
        }
    }

    public c(@k View view, @k l lVar, @k i iVar, @k FragmentManager fragmentManager) {
        this.f327103a = view;
        this.f327104b = lVar;
        this.f327105c = iVar;
        this.f327106d = fragmentManager;
        View viewFindViewById = view.findViewById(R.id.close_icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.invite_error);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f327107e = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.invite_no_internet);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f327108f = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.invite_content);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f327109g = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.invite_widget);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.virtual_deal_room_invite.invite.view.InviteInfoView");
        }
        this.f327110h = (InviteInfoView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.invite_widget_scrollable);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.virtual_deal_room_invite.invite.view.InviteInfoView");
        }
        this.f327111i = (InviteInfoView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.time_invite);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f327112j = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.go_main_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById8;
        this.f327113k = button;
        View viewFindViewById9 = view.findViewById(R.id.accept_button);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button2 = (Button) viewFindViewById9;
        this.f327114l = button2;
        View viewFindViewById10 = view.findViewById(R.id.decline_button);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button3 = (Button) viewFindViewById10;
        this.f327115m = button3;
        View viewFindViewById11 = view.findViewById(R.id.invite_scroll_container);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ScrollView");
        }
        this.f327116n = (ScrollView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.invite_loading);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f327117o = viewFindViewById12;
        final int i12 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.virtual_deal_room_invite.invite.view.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f327102c;

            {
                this.f327102c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.b.f415097a);
                        break;
                    case 1:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.c.f415098a);
                        break;
                    case 2:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.e.f415100a);
                        break;
                    case 3:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.e.f415100a);
                        break;
                    case 4:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.C11857a.f415096a);
                        break;
                    default:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.f.f415101a);
                        break;
                }
            }
        });
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.virtual_deal_room_invite.invite.view.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f327102c;

            {
                this.f327102c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.b.f415097a);
                        break;
                    case 1:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.c.f415098a);
                        break;
                    case 2:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.e.f415100a);
                        break;
                    case 3:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.e.f415100a);
                        break;
                    case 4:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.C11857a.f415096a);
                        break;
                    default:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.f.f415101a);
                        break;
                }
            }
        });
        View viewFindViewById13 = viewFindViewById2.findViewById(R.id.update_button);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        final int i14 = 2;
        ((Button) viewFindViewById13).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.virtual_deal_room_invite.invite.view.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f327102c;

            {
                this.f327102c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.b.f415097a);
                        break;
                    case 1:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.c.f415098a);
                        break;
                    case 2:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.e.f415100a);
                        break;
                    case 3:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.e.f415100a);
                        break;
                    case 4:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.C11857a.f415096a);
                        break;
                    default:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.f.f415101a);
                        break;
                }
            }
        });
        View viewFindViewById14 = viewFindViewById3.findViewById(R.id.reload_button);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        final int i15 = 3;
        ((Button) viewFindViewById14).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.virtual_deal_room_invite.invite.view.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f327102c;

            {
                this.f327102c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.b.f415097a);
                        break;
                    case 1:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.c.f415098a);
                        break;
                    case 2:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.e.f415100a);
                        break;
                    case 3:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.e.f415100a);
                        break;
                    case 4:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.C11857a.f415096a);
                        break;
                    default:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.f.f415101a);
                        break;
                }
            }
        });
        final int i16 = 4;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.virtual_deal_room_invite.invite.view.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f327102c;

            {
                this.f327102c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.b.f415097a);
                        break;
                    case 1:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.c.f415098a);
                        break;
                    case 2:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.e.f415100a);
                        break;
                    case 3:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.e.f415100a);
                        break;
                    case 4:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.C11857a.f415096a);
                        break;
                    default:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.f.f415101a);
                        break;
                }
            }
        });
        final int i17 = 5;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.virtual_deal_room_invite.invite.view.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f327102c;

            {
                this.f327102c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.b.f415097a);
                        break;
                    case 1:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.c.f415098a);
                        break;
                    case 2:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.e.f415100a);
                        break;
                    case 3:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.e.f415100a);
                        break;
                    case 4:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.C11857a.f415096a);
                        break;
                    default:
                        this.f327102c.f327104b.invoke(InterfaceC44300a.f.f415101a);
                        break;
                }
            }
        });
    }

    public final String a(@e0 int i12) {
        return this.f327103a.getContext().getText(i12).toString();
    }

    public final SpannableString b(String str, String str2, CounterColor counterColor) {
        SpannableString spannableString = new SpannableString(str);
        int I12 = C43066x.I(str, str2, 0, false, 6);
        if (I12 != -1) {
            spannableString.setSpan(new ForegroundColorSpan(C35835l0.d(counterColor.f327041b, this.f327103a.getContext())), I12, str.length(), 33);
        }
        return spannableString;
    }

    public final void c(@k C41327b c41327b) {
        com.avito.android.virtual_deal_room_invite.invite.dialog.b bVar = this.f327118p;
        if (bVar != null) {
            bVar.dismiss();
        }
        com.avito.android.virtual_deal_room_invite.invite.dialog.b bVar2 = new com.avito.android.virtual_deal_room_invite.invite.dialog.b(this.f327103a.getContext(), c41327b, new a());
        g.a(bVar2);
        this.f327118p = bVar2;
    }
}
