package com.avito.android.verification.verification_fetch_invoice;

import OM0.b;
import Y41.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.remote.model.common.VerificationAction;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import xM0.C49864d;

/* compiled from: VerificationFetchInvoiceView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/g;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f325176a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f325177b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f325178c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l<OM0.b, G0> f325179d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final NavBar f325180e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C49864d f325181f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f325182g;

    /* compiled from: VerificationFetchInvoiceView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.this.f325179d.invoke(b.C0787b.f12207a);
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationFetchInvoiceView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f325184a;

        static {
            int[] iArr = new int[VerificationAction.Style.values().length];
            try {
                iArr[VerificationAction.Style.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationAction.Style.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationAction.Style.SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f325184a = iArr;
        }
    }

    /* compiled from: VerificationFetchInvoiceView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<View> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return g.this.f325176a.findViewById(R.id.verification_fetch_invoice_content_container);
        }
    }

    public g(@Y61.k l lVar, @Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.adapter.j jVar) {
        this.f325176a = view;
        this.f325177b = jVar;
        this.f325178c = aVar;
        this.f325179d = lVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.verification_fetch_invoice_list);
        NavBar navBar = (NavBar) view.findViewById(R.id.verification_fetch_invoice_navbar);
        this.f325180e = navBar;
        C49864d c49864d = new C49864d((ViewGroup) view.findViewById(R.id.verification_fetch_invoice_progress_root), new c(), 0, 4, null);
        this.f325181f = c49864d;
        this.f325182g = (Button) view.findViewById(R.id.verification_fetch_invoice_primary_button);
        final int i12 = 0;
        final int i13 = 1;
        c49864d.a(new View.OnClickListener(this) { // from class: com.avito.android.verification.verification_fetch_invoice.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f325175c;

            {
                this.f325175c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f325175c.f325179d.invoke(b.f.f12211a);
                        break;
                    default:
                        g gVar = this.f325175c;
                        gVar.f325179d.invoke(new b.d(gVar.f325181f.f442450h));
                        break;
                }
            }
        }, new View.OnClickListener(this) { // from class: com.avito.android.verification.verification_fetch_invoice.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f325175c;

            {
                this.f325175c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f325175c.f325179d.invoke(b.f.f12211a);
                        break;
                    default:
                        g gVar = this.f325175c;
                        gVar.f325179d.invoke(new b.d(gVar.f325181f.f442450h));
                        break;
                }
            }
        });
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(C35835l0.h(R.attr.ic_close24, view.getContext()), new a(), false, null, null, null, null, 124, null));
        recyclerView.setAdapter(jVar);
        recyclerView.l(new PV.a(0, y6.b(16), 0, 0, 12, null), -1);
    }
}
