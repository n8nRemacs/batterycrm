package com.avito.android.payment.lib;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.SimpleUserDialog;
import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* compiled from: PaymentMethodsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/lib/f;", "", "_avito_payment-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.payment.lib.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C33021f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f214654a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f214655b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f214656c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f214657d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f214658e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.l<PaymentResult, G0> f214659f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f214660g = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f214661h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f214662i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f214663j;

    /* renamed from: k, reason: collision with root package name */
    public final FrameLayout f214664k;

    /* renamed from: l, reason: collision with root package name */
    public final Button f214665l;

    /* renamed from: m, reason: collision with root package name */
    public final ImageButton f214666m;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f214667n;

    /* renamed from: o, reason: collision with root package name */
    public final Button f214668o;

    /* renamed from: p, reason: collision with root package name */
    public final ScrollingPagerIndicator f214669p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final SV.a f214670q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Boolean> f214671r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<C33016a> f214672s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public Integer f214673t;

    /* compiled from: PaymentMethodsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/payment/lib/f$a", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "_avito_payment-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.payment.lib.f$a */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f214675c;

        public a(int i12) {
            this.f214675c = i12;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C33021f c33021f = C33021f.this;
            int width = c33021f.f214662i.getWidth();
            if (width > 0) {
                RecyclerView recyclerView = c33021f.f214667n;
                int paddingLeft = recyclerView.getPaddingLeft();
                int paddingTop = recyclerView.getPaddingTop();
                int i12 = this.f214675c;
                recyclerView.setPadding(paddingLeft, paddingTop, width - (((int) ((width / 7.0f) * 4.0f)) - (i12 * 2)), recyclerView.getPaddingBottom());
                recyclerView.setAdapter(c33021f.f214656c);
                c33021f.f214670q.b(recyclerView);
                ScrollingPagerIndicator scrollingPagerIndicator = c33021f.f214669p;
                scrollingPagerIndicator.getClass();
                scrollingPagerIndicator.b(recyclerView, new ru.tinkoff.scrollingpagerindicator.e(i12 * 6));
                recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* compiled from: PaymentMethodsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.payment.lib.f$b */
    public static final class b implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f214676b;

        public b(Y41.l lVar) {
            this.f214676b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return ((InterfaceC43072x) this.f214676b).equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return (InterfaceC43072x) this.f214676b;
        }

        public final int hashCode() {
            return ((InterfaceC43072x) this.f214676b).hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, java.lang.Object] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f214676b.invoke(obj);
        }
    }

    /* compiled from: PaymentMethodsView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.payment.lib.f$c */
    public static final class c extends N implements Y41.p<a.b, DialogInterface, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ SimpleUserDialog f214677l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f214678m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C33021f f214679n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ PaymentStatusResult.PaymentStatus f214680o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f214681p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SimpleUserDialog simpleUserDialog, String str, C33021f c33021f, PaymentStatusResult.PaymentStatus paymentStatus, boolean z12) {
            super(2);
            this.f214677l = simpleUserDialog;
            this.f214678m = str;
            this.f214679n = c33021f;
            this.f214680o = paymentStatus;
            this.f214681p = z12;
        }

        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            SimpleUserDialog simpleUserDialog = this.f214677l;
            bVar2.setTitle(simpleUserDialog.getTitle());
            bVar2.setSubtitle(simpleUserDialog.getMessage());
            bVar2.setCancelable(true);
            C33021f c33021f = this.f214679n;
            PaymentStatusResult.PaymentStatus paymentStatus = this.f214680o;
            boolean z12 = this.f214681p;
            bVar2.b(new r(c33021f, paymentStatus, z12));
            bVar2.L3(this.f214678m, new s(c33021f, paymentStatus, z12));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33021f(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.k Y41.l<? super String, G0> lVar2, @Y61.k Y41.l<? super PaymentResult, G0> lVar3) {
        this.f214654a = view;
        this.f214655b = aVar;
        this.f214656c = jVar;
        this.f214657d = lVar;
        this.f214658e = lVar2;
        this.f214659f = lVar3;
        this.f214661h = (LinearLayout) view.findViewById(R.id.error);
        this.f214662i = (LinearLayout) view.findViewById(R.id.content_container);
        this.f214663j = (TextView) view.findViewById(R.id.error_text_view);
        this.f214664k = (FrameLayout) view.findViewById(R.id.loading_indicator);
        this.f214665l = (Button) view.findViewById(R.id.payment_submit_button);
        this.f214666m = (ImageButton) view.findViewById(R.id.close_payment_methods_button);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f214667n = recyclerView;
        this.f214668o = (Button) view.findViewById(R.id.error_refresh_button);
        this.f214669p = (ScrollingPagerIndicator) view.findViewById(R.id.indicator);
        this.f214670q = new SV.a(8388611, 0, 2, null);
        this.f214671r = com.jakewharton.rxrelay3.b.N0(Boolean.FALSE);
        this.f214672s = new com.jakewharton.rxrelay3.c<>();
        int iD2 = com.avito.android.actions_sheet.a.d(view, R.dimen.payment_method_list_card_material_horizontal_margin);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setHasFixedSize(true);
        jVar.setHasStableIds(true);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new a(iD2));
    }

    public final void a(SimpleUserDialog simpleUserDialog, boolean z12, PaymentStatusResult.PaymentStatus paymentStatus) {
        String string;
        Action action;
        List<Action> actions = simpleUserDialog.getActions();
        View view = this.f214654a;
        if (actions == null || (action = actions.get(0)) == null || (string = action.getTitle()) == null) {
            string = view.getContext().getString(R.string.ok);
        }
        com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, view.getContext(), new c(simpleUserDialog, string, this, paymentStatus, z12)));
    }
}
