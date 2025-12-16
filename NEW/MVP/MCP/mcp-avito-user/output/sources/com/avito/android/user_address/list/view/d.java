package com.avito.android.user_address.list.view;

import XG0.a;
import XG0.d;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.overlay.SpinnerOverlay;
import com.avito.android.user_address.CompositeLocationTextView;
import com.avito.android.user_address.list.h;
import com.avito.android.user_address.list.view.recycler.address.a;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.konveyor.adapter.j;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: UserAddressListView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/list/view/d;", "Lcom/avito/android/user_address/list/view/a;", "a", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.user_address.list.view.a {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f307434s = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f307435a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f307436b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f307437c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.user_address.list.e f307438d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC28373a f307439e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.user_address.a f307440f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final RecyclerView f307441g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final SingleAddressItemView f307442h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ConstraintLayout f307443i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final com.avito.android.lib.design.bottom_sheet.d f307444j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Button f307445k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final SpinnerOverlay f307446l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final LinearLayout f307447m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final ImageView f307448n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final TextView f307449o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final TextView f307450p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final TextView f307451q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f307452r;

    /* compiled from: UserAddressListView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_address/list/view/d$a;", "", "<init>", "()V", "", "ADDRESS_INFO_BLOCK_SHOW_FROM_PAGE", "Ljava/lang/String;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public d(@k View view, @k h hVar, @k j jVar, @k com.avito.konveyor.adapter.a aVar, @k com.avito.android.user_address.list.e eVar, @k InterfaceC28373a interfaceC28373a, @k com.avito.android.user_address.a aVar2, @l Toolbar toolbar) {
        TextView textView;
        this.f307435a = hVar;
        this.f307436b = jVar;
        this.f307437c = aVar;
        this.f307438d = eVar;
        this.f307439e = interfaceC28373a;
        this.f307440f = aVar2;
        View viewFindViewById = view.findViewById(R.id.address_list_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setAdapter(jVar);
        this.f307441g = recyclerView;
        if (toolbar != null) {
            View viewFindViewById2 = toolbar.findViewById(R.id.toolbar_title);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            textView = (TextView) viewFindViewById2;
        } else {
            textView = null;
        }
        this.f307451q = textView;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        RecyclerView recyclerView2 = this.f307441g;
        if (recyclerView2 != null) {
            recyclerView2.o(new e(this));
        }
        View viewFindViewById3 = view.findViewById(R.id.single_address_view);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.user_address.list.view.SingleAddressItemView");
        }
        this.f307442h = (SingleAddressItemView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.single_address_banner);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById4;
        this.f307443i = constraintLayout;
        View viewFindViewById5 = constraintLayout.findViewById(R.id.faq_banner);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        final int i12 = 2;
        ((LinearLayout) viewFindViewById5).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.user_address.list.view.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f307430c;

            {
                this.f307430c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f307430c.f307435a.accept(a.e.f18788a);
                        break;
                    case 1:
                        this.f307430c.f307435a.accept(a.C1324a.f18783a);
                        break;
                    default:
                        d dVar = this.f307430c;
                        dVar.f307439e.c(new SG0.a(dVar.f307440f.getF307189a()));
                        dVar.f307435a.accept(a.d.f18787a);
                        break;
                }
            }
        });
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(view.getContext(), 0, 2, null);
        dVar.D(R.layout.address_list_bottom_layout, true);
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, eVar.getF307373h(), false, y6.b(24), 0, 0, 118);
        this.f307444j = dVar;
        View viewFindViewById6 = view.findViewById(R.id.add_address_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById6;
        this.f307445k = button;
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.user_address.list.view.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f307430c;

            {
                this.f307430c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f307430c.f307435a.accept(a.e.f18788a);
                        break;
                    case 1:
                        this.f307430c.f307435a.accept(a.C1324a.f18783a);
                        break;
                    default:
                        d dVar2 = this.f307430c;
                        dVar2.f307439e.c(new SG0.a(dVar2.f307440f.getF307189a()));
                        dVar2.f307435a.accept(a.d.f18787a);
                        break;
                }
            }
        });
        View viewFindViewById7 = view.findViewById(R.id.spinner_overlay);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.overlay.SpinnerOverlay");
        }
        this.f307446l = (SpinnerOverlay) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.error_layout);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById8;
        this.f307447m = linearLayout;
        View viewFindViewById9 = linearLayout.findViewById(R.id.error_icon);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f307448n = (ImageView) viewFindViewById9;
        View viewFindViewById10 = linearLayout.findViewById(R.id.error_title);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f307449o = (TextView) viewFindViewById10;
        View viewFindViewById11 = linearLayout.findViewById(R.id.error_subtitle);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f307450p = (TextView) viewFindViewById11;
        View viewFindViewById12 = linearLayout.findViewById(R.id.retry_button);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        final int i14 = 0;
        ((Button) viewFindViewById12).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.user_address.list.view.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f307430c;

            {
                this.f307430c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f307430c.f307435a.accept(a.e.f18788a);
                        break;
                    case 1:
                        this.f307430c.f307435a.accept(a.C1324a.f18783a);
                        break;
                    default:
                        d dVar2 = this.f307430c;
                        dVar2.f307439e.c(new SG0.a(dVar2.f307440f.getF307189a()));
                        dVar2.f307435a.accept(a.d.f18787a);
                        break;
                }
            }
        });
        D6.w(this.f307447m);
    }

    public final void a() {
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f307444j;
        if (dVar != null) {
            Button button = (Button) dVar.findViewById(R.id.accept);
            button.setLoading(false);
            button.setClickable(true);
        }
        com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f307444j;
        if (dVar2 != null) {
            dVar2.r();
        }
    }

    public final void b(@k XG0.d dVar) {
        boolean z12 = dVar instanceof d.c;
        com.avito.android.user_address.list.e eVar = this.f307438d;
        if (!z12) {
            if (dVar instanceof d.e) {
                D6.H(this.f307446l);
                D6.w(this.f307441g);
                D6.w(this.f307442h);
                D6.w(this.f307443i);
                D6.w(this.f307447m);
                return;
            }
            if (dVar instanceof d.C1326d) {
                D6.w(this.f307441g);
                D6.w(this.f307442h);
                D6.w(this.f307446l);
                D6.w(this.f307447m);
                c();
                D6.H(this.f307445k);
                return;
            }
            if (dVar instanceof d.a) {
                D6.w(this.f307441g);
                D6.w(this.f307442h);
                D6.w(this.f307443i);
                D6.w(this.f307446l);
                D6.H(this.f307447m);
                ImageView imageView = this.f307448n;
                if (imageView != null) {
                    eVar.getClass();
                    imageView.setImageResource(R.drawable.img_unknown_error_216_160);
                }
                TextView textView = this.f307449o;
                if (textView != null) {
                    textView.setText(eVar.getF307366a());
                }
                TextView textView2 = this.f307450p;
                if (textView2 != null) {
                    textView2.setText(eVar.getF307367b());
                }
                D6.w(this.f307445k);
                a();
                return;
            }
            if (dVar instanceof d.f) {
                D6.w(this.f307441g);
                D6.w(this.f307442h);
                D6.w(this.f307443i);
                D6.w(this.f307446l);
                D6.H(this.f307447m);
                ImageView imageView2 = this.f307448n;
                if (imageView2 != null) {
                    imageView2.setImageResource(eVar.getF307368c());
                }
                TextView textView3 = this.f307449o;
                if (textView3 != null) {
                    textView3.setText(eVar.getF307369d());
                }
                TextView textView4 = this.f307450p;
                if (textView4 != null) {
                    textView4.setText(eVar.getF307370e());
                }
                D6.w(this.f307445k);
                a();
                return;
            }
            return;
        }
        D6.w(this.f307446l);
        Button button = this.f307445k;
        if (button != null) {
            boolean z13 = ((d.c) dVar).f18805f;
            button.setEnabled(z13);
            if (z13) {
                com.avito.android.lib.design.button.b.a(button, eVar.getF307374i(), false);
            } else {
                com.avito.android.lib.design.button.b.a(button, eVar.getF307375j(), false);
            }
        }
        d.c cVar = (d.c) dVar;
        ArrayList arrayList = cVar.f18803d;
        int size = arrayList.size();
        boolean z14 = cVar.f18806g;
        if (size > 2) {
            RecyclerView recyclerView = this.f307441g;
            this.f307437c.c(new UV0.c(arrayList));
            this.f307436b.notifyDataSetChanged();
            D6.H(recyclerView);
            if (z14) {
                c();
            } else {
                D6.w(this.f307443i);
            }
            D6.w(this.f307442h);
            D6.w(this.f307446l);
            D6.H(this.f307445k);
        } else {
            D6.w(this.f307441g);
            SingleAddressItemView singleAddressItemView = this.f307442h;
            if (singleAddressItemView != null) {
                Object obj = arrayList.get(1);
                com.avito.android.user_address.list.view.recycler.address.a aVar = obj instanceof com.avito.android.user_address.list.view.recycler.address.a ? (com.avito.android.user_address.list.view.recycler.address.a) obj : null;
                if (aVar != null) {
                    a.C9447a c9447a = aVar.f307460f;
                    String str = c9447a.f307461a;
                    f fVar = new f(this, aVar);
                    String str2 = c9447a.f307462b;
                    String str3 = c9447a.f307463c;
                    String str4 = aVar.f307459e;
                    TextView textView5 = singleAddressItemView.f307427c;
                    CompositeLocationTextView compositeLocationTextView = singleAddressItemView.f307426b;
                    String strConcat = "";
                    if (str4 == null || C43066x.K(str4)) {
                        compositeLocationTextView.setState(CompositeLocationTextView.State.f307092c);
                        if (str2 != null && !C43066x.K(str2)) {
                            strConcat = ", ".concat(str2);
                        }
                        compositeLocationTextView.setFirstText(str);
                        compositeLocationTextView.setSecondText(strConcat);
                        textView5.setVisibility((str3 == null || C43066x.K(str3)) ? 8 : 0);
                        textView5.setText(str3);
                    } else {
                        compositeLocationTextView.setState(CompositeLocationTextView.State.f307091b);
                        compositeLocationTextView.setFirstText(str4);
                        textView5.setVisibility(0);
                        String strConcat2 = (str2 == null || C43066x.K(str2)) ? "" : ", ".concat(str2);
                        if (str3 != null && !C43066x.K(str3)) {
                            strConcat = "\n".concat(str3);
                        }
                        textView5.setText(str + strConcat2 + strConcat);
                    }
                    singleAddressItemView.f307428d.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(7, fVar));
                    D6.H(singleAddressItemView);
                }
            }
            if (z14) {
                c();
            } else {
                D6.w(this.f307443i);
            }
            D6.w(this.f307446l);
            D6.H(this.f307445k);
        }
        String f307376k = cVar.f18804e;
        if (f307376k == null) {
            f307376k = eVar.getF307376k();
        }
        TextView textView6 = this.f307451q;
        if (textView6 == null) {
            return;
        }
        textView6.setText(f307376k);
    }

    public final void c() {
        D6.H(this.f307443i);
        if (this.f307452r) {
            return;
        }
        this.f307439e.c(new SG0.b(this.f307440f.getF307189a()));
        this.f307452r = true;
    }
}
