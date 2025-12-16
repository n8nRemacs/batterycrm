package com.avito.android.serp.adapter.search_bar;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.C31100l2;
import com.avito.android.R;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.search_view.Toolbar23SearchView;
import com.avito.android.ticket_view.a;
import com.avito.android.ticket_view.mvi.a;
import com.avito.android.util.D6;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: SearchBarItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/ticket_view/a;", "Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.serp.adapter.search_bar.SearchBarItemPresenterImpl$initTicketMenuIcon$4", f = "SearchBarItemPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.serp.adapter.search_bar.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34839s extends SuspendLambda implements Y41.p<kotlin.Q<? extends com.avito.android.ticket_view.a, ? extends InterfaceC31171n>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f271653q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C34840t f271654r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.ticket_view.mvi.n f271655s;

    /* compiled from: SearchBarItemPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "isIconVisible", "invoke", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.search_bar.s$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Boolean, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ M f271656l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f271657m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(M m12, boolean z12) {
            super(1);
            this.f271656l = m12;
            this.f271657m = z12;
        }

        @Override // Y41.l
        public final Boolean invoke(Boolean bool) {
            return Boolean.valueOf(bool.booleanValue() && !this.f271656l.f271603d.f174866f.getF264475h0() && this.f271657m);
        }
    }

    /* compiled from: SearchBarItemPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "isIconVisible", "invoke", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.search_bar.s$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Boolean, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ M f271658l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f271659m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(M m12, boolean z12) {
            super(1);
            this.f271658l = m12;
            this.f271659m = z12;
        }

        @Override // Y41.l
        public final Boolean invoke(Boolean bool) {
            return Boolean.valueOf((!bool.booleanValue() || this.f271658l.f271603d.f174866f.getF264475h0() || this.f271659m) ? false : true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34839s(C34840t c34840t, com.avito.android.ticket_view.mvi.n nVar, Continuation<? super C34839s> continuation) {
        super(2, continuation);
        this.f271654r = c34840t;
        this.f271655s = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34839s c34839s = new C34839s(this.f271654r, this.f271655s, continuation);
        c34839s.f271653q = obj;
        return c34839s;
    }

    @Override // Y41.p
    public final Object invoke(kotlin.Q<? extends com.avito.android.ticket_view.a, ? extends InterfaceC31171n> q12, Continuation<? super G0> continuation) {
        return ((C34839s) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlin.Q q12 = (kotlin.Q) this.f271653q;
        boolean z12 = q12.f406620c instanceof InterfaceC31171n.a;
        C34840t c34840t = this.f271654r;
        M m12 = c34840t.f271672m;
        if (m12 == null) {
            return G0.f406611a;
        }
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L l12 = c34840t.f271674o;
        C31100l2 c31100l2 = m12.f271603d;
        if (l12 != null) {
            View viewB = c31100l2.b();
            if (viewB == null) {
                return G0.f406611a;
            }
            com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.d.a(l12, viewB, (InterfaceC31171n) q12.f406620c, new a(m12, z12));
        }
        View viewB2 = c31100l2.b();
        boolean z13 = viewB2 != null && viewB2.getVisibility() == 0;
        boolean z14 = c34840t.f271681v;
        com.avito.android.search_view.v vVar = c31100l2.f174866f;
        Toolbar23SearchView toolbar23SearchView = vVar instanceof Toolbar23SearchView ? (Toolbar23SearchView) vVar : null;
        if (toolbar23SearchView != null) {
            toolbar23SearchView.S(z13, z14);
        }
        com.avito.android.ticket_view.g gVar = c34840t.f271675p;
        if (gVar != null) {
            View viewC80 = m12.C80();
            if (viewC80 == null) {
                return G0.f406611a;
            }
            com.avito.android.ticket_view.a aVar = (com.avito.android.ticket_view.a) q12.f406619b;
            boolean zBooleanValue = ((Boolean) new b(m12, z12).invoke(Boolean.valueOf((kotlin.jvm.internal.L.f(gVar.f301404a.getState().getValue(), a.b.f301388a) || (aVar instanceof a.b)) ? false : true))).booleanValue();
            if (zBooleanValue) {
                this.f271655s.accept(a.b.f301406a);
                TextView textView = (TextView) viewC80.findViewById(R.id.ticket_quantity_text);
                if (aVar instanceof a.C9221a) {
                    int i12 = ((a.C9221a) aVar).f301387a;
                    if (i12 == 0) {
                        str = "";
                    } else {
                        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
                        decimalFormatSymbols.setGroupingSeparator(' ');
                        str = new DecimalFormat("#,###", decimalFormatSymbols).format(Integer.valueOf(i12));
                    }
                    if (str.equals("")) {
                        D6.w(textView);
                    } else {
                        if (textView != null) {
                            textView.setText(str);
                        }
                        if (textView != null) {
                            D6.G(textView, true);
                        }
                    }
                } else if ((aVar instanceof a.b) || (aVar instanceof a.c)) {
                    D6.w(textView);
                }
            }
            D6.G(viewC80, zBooleanValue);
        }
        View viewC802 = m12.C80();
        boolean z15 = viewC802 != null && viewC802.getVisibility() == 0;
        boolean z16 = c34840t.f271681v;
        com.avito.android.search_view.v vVar2 = c31100l2.f174866f;
        Toolbar23SearchView toolbar23SearchView2 = vVar2 instanceof Toolbar23SearchView ? (Toolbar23SearchView) vVar2 : null;
        if (toolbar23SearchView2 != null) {
            boolean z17 = toolbar23SearchView2.f264483l0;
            boolean z18 = toolbar23SearchView2.f264485m0;
            boolean z19 = toolbar23SearchView2.f264487n0;
            toolbar23SearchView2.f264485m0 = z15;
            int i13 = z15 ? 0 : 8;
            ViewGroup viewGroup = toolbar23SearchView2.f264502v;
            viewGroup.setVisibility(i13);
            if ((z17 || z18 || z19) != z15) {
                toolbar23SearchView2.Q();
            }
            if (z16 && toolbar23SearchView2.f264485m0) {
                toolbar23SearchView2.O(viewGroup, toolbar23SearchView2.f264498t, null, toolbar23SearchView2.getContext().getResources().getDimensionPixelSize(R.dimen.input_height_with_search_promo_banner));
            }
        }
        return G0.f406611a;
    }
}
