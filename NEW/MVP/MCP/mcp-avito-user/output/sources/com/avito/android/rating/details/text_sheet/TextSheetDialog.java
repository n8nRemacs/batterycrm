package com.avito.android.rating.details.text_sheet;

import Cd.C13243a;
import Dg0.InterfaceC13396a;
import Eg0.c;
import Kh0.C14315a;
import Kh0.e;
import Y61.l;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.V0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: TextSheetDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating/details/text_sheet/TextSheetDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "LKh0/d;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class TextSheetDialog extends BaseDialogFragment implements Kh0.d, InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f247525s0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.rating.details.text_sheet.e f247526h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f247527i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public C14315a f247528j0;

    /* renamed from: k0, reason: collision with root package name */
    @l
    public Kh0.c f247529k0;

    /* renamed from: l0, reason: collision with root package name */
    public TextView f247530l0;

    /* renamed from: m0, reason: collision with root package name */
    public Input f247531m0;

    /* renamed from: n0, reason: collision with root package name */
    public ComponentContainer f247532n0;

    /* renamed from: o0, reason: collision with root package name */
    public Button f247533o0;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.toast_bar.k f247534p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f247535q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f247536r0;

    /* compiled from: TextSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/rating/details/text_sheet/TextSheetDialog$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "KEY_INFO_RESULT", "REQUEST_KEY", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: TextSheetDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.rating.details.text_sheet.TextSheetDialog$a$a, reason: collision with other inner class name */
        public static final class C7424a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ TextSheetArguments f247537l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7424a(TextSheetArguments textSheetArguments) {
                super(1);
                this.f247537l = textSheetArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key_arguments", this.f247537l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static TextSheetDialog a(@Y61.k TextSheetArguments textSheetArguments) {
            TextSheetDialog textSheetDialog = new TextSheetDialog();
            C35966w1.a(textSheetDialog, -1, new C7424a(textSheetArguments));
            return textSheetDialog;
        }

        public a() {
        }
    }

    /* compiled from: TextSheetDialog.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(C35835l0.d(R.attr.gray54, TextSheetDialog.this.requireContext()));
        }
    }

    /* compiled from: TextSheetDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<View, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            View viewFindViewById = view2.findViewById(R.id.rating_details_text_sheet_title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextSheetDialog textSheetDialog = TextSheetDialog.this;
            textSheetDialog.f247530l0 = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.rating_details_text_sheet_input);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            Input input = (Input) viewFindViewById2;
            input.setInputType(147457);
            textSheetDialog.f247531m0 = input;
            View viewFindViewById3 = view2.findViewById(R.id.rating_details_text_sheet_input_container);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
            }
            textSheetDialog.f247532n0 = (ComponentContainer) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.rating_details_text_sheet_send_button);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            textSheetDialog.f247533o0 = (Button) viewFindViewById4;
            Input input2 = textSheetDialog.f247531m0;
            if (input2 == null) {
                input2 = null;
            }
            n.c(input2, new com.avito.android.rating.details.text_sheet.b(textSheetDialog));
            Button button = textSheetDialog.f247533o0;
            (button != null ? button : null).setOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(textSheetDialog, 20));
            return G0.f406611a;
        }
    }

    /* compiled from: TextSheetDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<Eg0.c, G0> {
        public final void f(@Y61.k Eg0.c cVar) {
            TextSheetDialog textSheetDialog = (TextSheetDialog) this.receiver;
            a aVar = TextSheetDialog.f247525s0;
            textSheetDialog.getClass();
            c3719a = null;
            c.a.C3719a c3719a = null;
            if (cVar instanceof c.d) {
                c.d dVar = (c.d) cVar;
                String str = dVar.f4157b;
                if (str != null && dVar.f4158c != null) {
                    c3719a = new c.a.C3719a(str, true, null, new com.avito.android.rating.details.text_sheet.a(textSheetDialog, cVar), 4, null);
                }
                com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                com.avito.android.lib.design.bottom_sheet.d dVar2 = (com.avito.android.lib.design.bottom_sheet.d) textSheetDialog.getDialog();
                PrintableText printableTextF = com.avito.android.printable_text.b.f(dVar.f4156a);
                f.c.f125255c.getClass();
                textSheetDialog.f247534p0 = com.avito.android.component.toast.c.d(cVar2, dVar2, printableTextF, C42745f0.V(c3719a), f.c.a.b(), 0, null, 1002);
                return;
            }
            if (L.f(cVar, c.C0245c.f4155a)) {
                com.avito.android.lib.design.toast_bar.k kVar = textSheetDialog.f247534p0;
                if (kVar != null) {
                    kVar.f();
                    return;
                }
                return;
            }
            if (L.f(cVar, c.b.f4154a)) {
                Input input = textSheetDialog.f247531m0;
                K2.d(input != null ? input : null, true);
            } else if (cVar instanceof c.a) {
                textSheetDialog.getParentFragmentManager().o0(C22777e.b(new Q("key_info_result", ((c.a) cVar).f4153a)), "text_sheet_request_key");
                textSheetDialog.dismiss();
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Eg0.c cVar) {
            f(cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: TextSheetDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<Eg0.d, G0> {
        @Override // Y41.l
        public final G0 invoke(Eg0.d dVar) throws Resources.NotFoundException {
            Integer num;
            Eg0.d dVar2 = dVar;
            TextSheetDialog textSheetDialog = (TextSheetDialog) this.receiver;
            TextView textView = textSheetDialog.f247530l0;
            if (textView == null) {
                textView = null;
            }
            I5.a(textView, dVar2.f4160a, false);
            Input input = textSheetDialog.f247531m0;
            if (input == null) {
                input = null;
            }
            input.setHint(dVar2.f4162c.k0(textSheetDialog.requireContext()));
            if (textSheetDialog.f247529k0 == null && (num = dVar2.f4165f) != null) {
                Kh0.c cVar = new Kh0.c(num.intValue(), textSheetDialog);
                Input input2 = textSheetDialog.f247531m0;
                if (input2 == null) {
                    input2 = null;
                }
                input2.b(cVar);
                textSheetDialog.f247529k0 = cVar;
            }
            String str = dVar2.f4163d;
            if (str != null) {
                textSheetDialog.f247535q0 = true;
                ComponentContainer componentContainer = textSheetDialog.f247532n0;
                if (componentContainer == null) {
                    componentContainer = null;
                }
                ComponentContainer.l(componentContainer, new int[]{R.id.rating_details_text_sheet_input}, str, 4);
            } else {
                textSheetDialog.f247535q0 = false;
                Kh0.c cVar2 = textSheetDialog.f247529k0;
                if (cVar2 != null) {
                    textSheetDialog.O10(cVar2.a(dVar2.f4161b));
                }
            }
            Button button = textSheetDialog.f247533o0;
            if (button == null) {
                button = null;
            }
            boolean z12 = dVar2.f4164e;
            button.setLoading(z12);
            Button button2 = textSheetDialog.f247533o0;
            (button2 != null ? button2 : null).setClickable(!z12);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f247540l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f247540l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f247540l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return TextSheetDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f247542l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f247542l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f247542l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f247543l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f247543l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f247543l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f247544l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f247544l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f247544l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TextSheetDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/rating/details/text_sheet/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/rating/details/text_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.rating.details.text_sheet.d> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.rating.details.text_sheet.d invoke() {
            com.avito.android.rating.details.text_sheet.e eVar = TextSheetDialog.this.f247526h0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.rating.details.text_sheet.d) eVar.get();
        }
    }

    public TextSheetDialog() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f247527i0 = new O0(m0.f406844a.b(com.avito.android.rating.details.text_sheet.d.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f247536r0 = C42727D.c(new b());
    }

    @Override // Kh0.d
    public final void O10(@Y61.k Kh0.e eVar) throws Resources.NotFoundException {
        if (this.f247535q0) {
            return;
        }
        if (eVar instanceof e.b) {
            C14315a c14315a = this.f247528j0;
            if (c14315a == null) {
                c14315a = null;
            }
            String string = getResources().getString(R.string.rating_text_counter_empty_state, c14315a.a(Integer.valueOf(((e.b) eVar).f9626a)));
            ComponentContainer componentContainer = this.f247532n0;
            (componentContainer != null ? componentContainer : null).o(string, new int[]{R.id.rating_details_text_sheet_input});
            return;
        }
        if (eVar instanceof e.c) {
            C14315a c14315a2 = this.f247528j0;
            if (c14315a2 == null) {
                c14315a2 = null;
            }
            e.c cVar = (e.c) eVar;
            String strA = c14315a2.a(Integer.valueOf(cVar.f9627a));
            C14315a c14315a3 = this.f247528j0;
            if (c14315a3 == null) {
                c14315a3 = null;
            }
            String string2 = getResources().getString(R.string.rating_text_counter_progress, strA, c14315a3.a(Integer.valueOf(cVar.f9628b)));
            ComponentContainer componentContainer2 = this.f247532n0;
            (componentContainer2 != null ? componentContainer2 : null).o(string2, new int[]{R.id.rating_details_text_sheet_input});
            return;
        }
        if (eVar instanceof e.a) {
            C14315a c14315a4 = this.f247528j0;
            if (c14315a4 == null) {
                c14315a4 = null;
            }
            e.a aVar = (e.a) eVar;
            String strA2 = c14315a4.a(Integer.valueOf(aVar.f9624a));
            C14315a c14315a5 = this.f247528j0;
            if (c14315a5 == null) {
                c14315a5 = null;
            }
            String string3 = getResources().getString(R.string.rating_text_counter_progress, strA2, c14315a5.a(Integer.valueOf(aVar.f9625b)));
            int length = strA2.length();
            int length2 = string3.length();
            SpannableString spannableString = new SpannableString(string3);
            spannableString.setSpan(new ForegroundColorSpan(((Number) this.f247536r0.getValue()).intValue()), length, length2, 33);
            ComponentContainer componentContainer3 = this.f247532n0;
            ComponentContainer.l(componentContainer3 != null ? componentContainer3 : null, new int[]{R.id.design_container_message}, spannableString, 4);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            TextSheetArguments textSheetArguments = (TextSheetArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("key_arguments", TextSheetArguments.class) : arguments.getParcelable("key_arguments"));
            if (textSheetArguments != null) {
                ((InterfaceC13396a.b) C29972i.a(C29972i.b(this), InterfaceC13396a.b.class)).Vh().a(getF42820b(), textSheetArguments.f247524b, cv.c.d(this)).a(this);
                return;
            }
        }
        throw new IllegalArgumentException("Arguments must be specified");
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.Design_Widget_BottomSheetDialog);
        dVar.C(R.layout.rating_details_text_sheet, new c());
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.S(getResources().getDimensionPixelOffset(R.dimen.dialog_peek_height));
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        InterfaceC22983P interfaceC22983PA;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null && (interfaceC22983PA = V0.a(decorView)) != null) {
            com.avito.android.arch.mvi.android.f.a((com.avito.android.rating.details.text_sheet.d) this.f247527i0.getValue(), interfaceC22983PA, Lifecycle.State.f46682e, new d(1, this, TextSheetDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/rating/details/text_sheet/mvi/entity/TextSheetOneTimeEvent;)V", 0), new e(1, this, TextSheetDialog.class, "render", "render(Lcom/avito/android/rating/details/text_sheet/mvi/entity/TextSheetState;)V", 0));
        }
        Input input = this.f247531m0;
        if (input == null) {
            input = null;
        }
        input.requestFocus();
    }
}
