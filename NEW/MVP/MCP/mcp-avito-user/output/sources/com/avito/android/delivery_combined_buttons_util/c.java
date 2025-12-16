package com.avito.android.delivery_combined_buttons_util;

import Ev.InterfaceC13530a;
import Ev.InterfaceC13531b;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.C23494e;
import androidx.transition.C23503n;
import androidx.transition.L;
import androidx.transition.Q;
import androidx.transition.T;
import com.avito.android.R;
import com.avito.android.delivery_combined_buttons_public.BuyButton;
import com.avito.android.delivery_combined_buttons_public.CartButton;
import com.avito.android.delivery_combined_buttons_public.WidthStrategy;
import com.avito.android.delivery_combined_buttons_util.l;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.stepper.Stepper;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.R5;
import com.avito.android.util.y6;
import j.r;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryCombinedButtonsView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_combined_buttons_util/c;", "Lcom/avito/android/delivery_combined_buttons_util/a;", "a", "b", "_avito_delivery-combined-buttons_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.delivery_combined_buttons_util.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f134970b;

    /* renamed from: c, reason: collision with root package name */
    public final int f134971c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f134972d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ContextThemeWrapper f134973e;

    /* compiled from: DeliveryCombinedButtonsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_combined_buttons_util/c$a;", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_delivery-combined-buttons_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final b f134974b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f134975c;

        /* compiled from: DeliveryCombinedButtonsView.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.delivery_combined_buttons_util.c$a$a, reason: collision with other inner class name */
        public static final class C4076a extends N implements Y41.a<G0> {

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Button f134977m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4076a(Button button) {
                super(0);
                this.f134977m = button;
            }

            @Override // Y41.a
            public final G0 invoke() {
                a aVar = a.this;
                aVar.f134975c.invoke();
                this.f134977m.removeOnAttachStateChangeListener(aVar);
                return G0.f406611a;
            }
        }

        public a(@Y61.k b bVar, @Y61.k Y41.a<G0> aVar) {
            this.f134974b = bVar;
            this.f134975c = aVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            if (view instanceof Button) {
                Button button = (Button) view;
                button.addOnLayoutChangeListener(this.f134974b);
                if (button.isLaidOut()) {
                    C4076a c4076a = new C4076a(button);
                    if (button.d()) {
                        c4076a.invoke();
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            view.removeOnLayoutChangeListener(this.f134974b);
        }
    }

    /* compiled from: DeliveryCombinedButtonsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_combined_buttons_util/c$b;", "Landroid/view/View$OnLayoutChangeListener;", "_avito_delivery-combined-buttons_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f134978b;

        /* compiled from: DeliveryCombinedButtonsView.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.a<G0> {

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Button f134980m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Button button) {
                super(0);
                this.f134980m = button;
            }

            @Override // Y41.a
            public final G0 invoke() {
                b bVar = b.this;
                ((C4077c) bVar.f134978b).invoke();
                this.f134980m.removeOnLayoutChangeListener(bVar);
                return G0.f406611a;
            }
        }

        public b(@Y61.k Y41.a<G0> aVar) {
            this.f134978b = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            if (view instanceof Button) {
                Button button = (Button) view;
                a aVar = new a((Button) view);
                if (button.d()) {
                    aVar.invoke();
                }
            }
        }
    }

    /* compiled from: DeliveryCombinedButtonsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.delivery_combined_buttons_util.c$c, reason: collision with other inner class name */
    public static final class C4077c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Button f134981l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f134982m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4077c(Button button, Y41.l<? super InterfaceC13531b, G0> lVar) {
            super(0);
            this.f134981l = button;
            this.f134982m = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f134981l.post(new com.avito.android.delivery_combined_buttons_util.d(this.f134982m, 0));
            return G0.f406611a;
        }
    }

    /* compiled from: DeliveryCombinedButtonsView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newQuantity", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f134983l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f134984m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f134985n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i12, int i13, Y41.l lVar) {
            super(1);
            this.f134983l = lVar;
            this.f134984m = i12;
            this.f134985n = i13;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [Y41.l, java.lang.Object] */
        @Override // Y41.l
        public final G0 invoke(Integer num) {
            this.f134983l.invoke(new InterfaceC13531b.c(this.f134984m, num.intValue(), this.f134985n));
            return G0.f406611a;
        }
    }

    public c(@Y61.k ConstraintLayout constraintLayout, @r int i12, boolean z12) {
        this.f134970b = constraintLayout;
        this.f134971c = i12;
        this.f134972d = z12;
        this.f134973e = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, constraintLayout.getContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23));
        constraintLayout.setTag("DeliveryCombinedButtonsView");
    }

    public static void c(Button button, InterfaceC13530a interfaceC13530a, View.OnClickListener onClickListener) {
        button.setAppearanceFromAttr(com.avito.android.lib.util.f.d(interfaceC13530a.getF134944b()));
        button.setText(interfaceC13530a.getF134946d());
        String subtitle = interfaceC13530a.getF134947e();
        if (subtitle == null) {
            subtitle = "";
        }
        button.setSubtitle(subtitle);
        button.setOnClickListener(onClickListener);
        Boolean boolIsLoading = interfaceC13530a.getF134948f();
        boolean zBooleanValue = boolIsLoading != null ? boolIsLoading.booleanValue() : false;
        button.setLoading(zBooleanValue);
        button.setClickable(!zBooleanValue);
    }

    public final void a(l lVar, boolean z12) {
        androidx.constraintlayout.widget.d dVar;
        boolean z13 = lVar instanceof l.a;
        int i12 = this.f134971c;
        int i13 = R.id.combined_cart_button;
        if (z13) {
            l.a aVar = (l.a) lVar;
            dVar = new androidx.constraintlayout.widget.d();
            WidthStrategy widthStrategy = aVar.f134998b;
            int i14 = widthStrategy == null ? -1 : l.a.C4078a.f135000a[widthStrategy.ordinal()];
            boolean z14 = aVar.f134999c;
            if (i14 == -1) {
                dVar.l(R.id.combined_buy_button, 0);
                dVar.k(R.id.combined_buy_button, -2);
                dVar.k(R.id.combined_cart_button, -2);
                if (z12) {
                    dVar.l(R.id.combined_cart_button, 0);
                    int[] iArr = {R.id.combined_buy_button, R.id.combined_cart_button};
                    float[] fArr = {1.56f, 1.0f};
                    if (z14) {
                        fArr[0] = 1.0f;
                        fArr[1] = 1.56f;
                        G0 g02 = G0.f406611a;
                    }
                    dVar.n(0, fArr, iArr);
                } else {
                    dVar.l(R.id.combined_cart_button, -2);
                    l.f134997a.getClass();
                    dVar.p(R.id.combined_cart_button).f44269e.f44317c0 = l.b.f135002b;
                    int[] iArr2 = {R.id.combined_buy_button, R.id.combined_cart_button};
                    if (z14) {
                        C42756l.Y(iArr2);
                        G0 g03 = G0.f406611a;
                    }
                    dVar.n(0, null, iArr2);
                }
            } else if (i14 == 1) {
                dVar.l(R.id.combined_buy_button, 0);
                dVar.l(R.id.combined_cart_button, 0);
                dVar.k(R.id.combined_buy_button, -2);
                dVar.k(R.id.combined_cart_button, -2);
                int[] iArr3 = {R.id.combined_buy_button, R.id.combined_cart_button};
                if (z14) {
                    C42756l.Y(iArr3);
                    G0 g04 = G0.f406611a;
                }
                dVar.n(0, new float[]{1.0f, 1.0f}, iArr3);
            }
            dVar.i(R.id.combined_buy_button, 3, 0, 3);
            dVar.i(R.id.combined_cart_button, 3, 0, 3);
            if (!z14) {
                i13 = R.id.combined_buy_button;
            }
            dVar.z(i13, 2, y6.d(i12));
        } else {
            if (!(lVar instanceof l.c)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = new androidx.constraintlayout.widget.d();
            dVar.l(R.id.combined_stepper, -2);
            dVar.l(R.id.combined_stepper_message, -2);
            dVar.l(R.id.combined_cart_button, 0);
            l.f134997a.getClass();
            dVar.p(R.id.combined_stepper).f44269e.f44317c0 = l.b.f135002b;
            dVar.k(R.id.combined_stepper, 0);
            dVar.k(R.id.combined_cart_button, -2);
            int[] iArr4 = {R.id.combined_stepper, R.id.combined_cart_button};
            boolean z15 = ((l.c) lVar).f135003b;
            if (z15) {
                C42756l.Y(iArr4);
                G0 g05 = G0.f406611a;
            }
            dVar.n(0, null, iArr4);
            dVar.i(R.id.combined_stepper, 3, 0, 3);
            dVar.i(R.id.combined_stepper, 4, R.id.combined_cart_button, 4);
            dVar.i(R.id.combined_stepper_message, 3, R.id.combined_stepper, 4);
            dVar.i(R.id.combined_cart_button, 3, 0, 3);
            if (!z15) {
                i13 = R.id.combined_stepper;
            }
            dVar.z(i13, 2, y6.d(i12));
            dVar.z(R.id.combined_stepper_message, 3, y6.d(6));
        }
        R5 r52 = new R5(new T());
        r52.f318733e.Q(0);
        r52.e(new C23503n(), f.f134992l);
        r52.e(new C23494e(), g.f134993l);
        L lC2 = r52.c();
        ConstraintLayout constraintLayout = this.f134970b;
        Q.a(constraintLayout, lC2);
        dVar.c(constraintLayout);
    }

    public final void b(final int i12, final int i13, boolean z12, @Y61.l WidthStrategy widthStrategy, @Y61.k BuyButton buyButton, @Y61.k CartButton.AddToCartButton addToCartButton, @Y61.k CartButton.GoToCartButton goToCartButton, @Y61.k final Y41.l<? super InterfaceC13531b, G0> lVar, boolean z13) {
        Button button;
        Button button2;
        Stepper stepper;
        TextView aVar;
        l cVar;
        ConstraintLayout constraintLayout = this.f134970b;
        D6.H(constraintLayout);
        if (constraintLayout.getChildCount() == 0) {
            ContextThemeWrapper contextThemeWrapper = this.f134973e;
            button = new Button(contextThemeWrapper, null, 0, 0, 14, null);
            button.setId(R.id.combined_buy_button);
            if (this.f134972d && widthStrategy != null) {
                C4077c c4077c = new C4077c(button, lVar);
                b bVar = new b(c4077c);
                a aVar2 = new a(bVar, c4077c);
                if (button.isAttachedToWindow()) {
                    button.addOnLayoutChangeListener(bVar);
                    if (button.isLaidOut()) {
                        e eVar = new e(button, bVar, aVar2, c4077c);
                        if (button.d()) {
                            eVar.invoke();
                        }
                    }
                } else {
                    button.addOnAttachStateChangeListener(aVar2);
                }
            }
            button2 = new Button(contextThemeWrapper, null, 0, 0, 14, null);
            button2.setId(R.id.combined_cart_button);
            stepper = new Stepper(contextThemeWrapper, null, 0, 0, 14, null);
            stepper.setId(R.id.combined_stepper);
            stepper.setAllowOverrideConstraints(true);
            stepper.setLayoutParams(new ConstraintLayout.b(-1, -2));
            stepper.setAppearanceFromAttr(R.attr.stepperLarge);
            h hVar = new h(this, stepper);
            stepper.setOnMinusClickListener(hVar);
            stepper.setOnPlusClickListener(hVar);
            aVar = new com.avito.android.lib.design.text_view.a(contextThemeWrapper, null, 0, 0, 14, null);
            aVar.setId(R.id.combined_stepper_message);
            aVar.setTextAppearance(C35835l0.j(R.attr.textS10, aVar.getContext()));
            aVar.setTextColor(C35835l0.d(R.attr.red600, aVar.getContext()));
            Iterator it = C42745f0.U(button, button2, stepper, aVar).iterator();
            while (it.hasNext()) {
                constraintLayout.addView((View) it.next());
            }
        } else {
            View viewFindViewById = constraintLayout.findViewById(R.id.combined_buy_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            button = (Button) viewFindViewById;
            View viewFindViewById2 = constraintLayout.findViewById(R.id.combined_cart_button);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            button2 = (Button) viewFindViewById2;
            View viewFindViewById3 = constraintLayout.findViewById(R.id.combined_stepper);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.stepper.Stepper");
            }
            stepper = (Stepper) viewFindViewById3;
            View viewFindViewById4 = constraintLayout.findViewById(R.id.combined_stepper_message);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            aVar = (TextView) viewFindViewById4;
        }
        if (i12 == 0) {
            cVar = new l.a(widthStrategy, z12);
        } else {
            if (i12 <= 0) {
                throw new IllegalStateException("The state of combined buttons is not supported");
            }
            cVar = new l.c(z12);
        }
        if (cVar instanceof l.a) {
            a(cVar, z13);
            D6.H(button);
            D6.w(stepper);
            D6.w(aVar);
            c(button, buyButton, new com.avito.android.crm_candidates.view.dialogs.f(9, lVar, buyButton));
            c(button2, addToCartButton, new View.OnClickListener() { // from class: com.avito.android.delivery_combined_buttons_util.b
                /* JADX WARN: Type inference failed for: r0v3, types: [Y41.l, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f134966b.getClass();
                    if (Build.VERSION.SDK_INT >= 30) {
                        view.performHapticFeedback(16);
                    }
                    lVar.invoke(new InterfaceC13531b.c(i12, 1, i13));
                }
            });
            return;
        }
        if (cVar instanceof l.c) {
            a(cVar, false);
            D6.w(button);
            D6.H(stepper);
            d dVar = new d(i12, i13, lVar);
            stepper.setOnValueChangeListener(i.f134996l);
            stepper.setMaxValue(i13);
            stepper.setMinValue(0);
            stepper.setValue(i12);
            stepper.setOnValueChangeListener(dVar);
            if (i12 > i13) {
                stepper.setCurrentState(Stepper.State.f180597d);
                aVar.setText(stepper.getContext().getResources().getQuantityString(R.plurals.combined_stepper_error_message, i13, Integer.valueOf(i13)));
                D6.H(aVar);
            } else {
                stepper.setCurrentState(Stepper.State.f180596c);
                D6.w(aVar);
            }
            c(button2, goToCartButton, new com.avito.android.crm_candidates.view.dialogs.f(10, lVar, goToCartButton));
        }
    }

    public /* synthetic */ c(ConstraintLayout constraintLayout, int i12, boolean z12, int i13, C42822w c42822w) {
        this(constraintLayout, i12, (i13 & 4) != 0 ? true : z12);
    }
}
