package com.avito.android.profile_phones.add_phone;

import Cd.C13243a;
import ae.C19873a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.N1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.authorization.auth.C28629h;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile_phones.add_phone.di.a;
import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationViewModel;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.H2;
import com.avito.android.util.K2;
import com.jakewharton.rxbinding4.view.C37722i;
import cv.InterfaceC39417a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.maybe.C41916j;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import nb0.C44373c;
import nb0.InterfaceC44371a;
import nb0.InterfaceC44372b;
import ru.avito.component.toolbar.AppBarLayoutWithIconAction;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;
import z1.AbstractC50339a;

/* compiled from: AddPhoneFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/AddPhoneFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AddPhoneFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public static final a f226797F0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public InterfaceC30274a f226798A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<InterfaceC44372b.c> f226799B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<InterfaceC44372b.f> f226800C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<InterfaceC44372b.d> f226801D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<InterfaceC44372b.e> f226802E0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f226803n0;

    /* renamed from: o0, reason: collision with root package name */
    public AppBarLayoutWithIconAction f226804o0;

    /* renamed from: p0, reason: collision with root package name */
    public Button f226805p0;

    /* renamed from: q0, reason: collision with root package name */
    public ComponentContainer f226806q0;

    /* renamed from: r0, reason: collision with root package name */
    public Input f226807r0;

    /* renamed from: s0, reason: collision with root package name */
    public View f226808s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public H2 f226809t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public s f226810u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final O0 f226811v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f226812w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.phone_reverification_info.d f226813x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public N1 f226814y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f226815z0;

    /* compiled from: AddPhoneFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/AddPhoneFragment$a;", "", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: AddPhoneFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.profile_phones.add_phone.AddPhoneFragment$a$a, reason: collision with other inner class name */
        public static final class C6885a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f226816l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f226817m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ String f226818n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f226819o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6885a(String str, String str2, String str3, String str4) {
                super(1);
                this.f226816l = str;
                this.f226817m = str2;
                this.f226818n = str3;
                this.f226819o = str4;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putString("key.title", this.f226816l);
                bundle2.putString("key.subtitle", this.f226817m);
                bundle2.putString("key.source", this.f226818n);
                bundle2.putString("key.prefilledPhone", this.f226819o);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static AddPhoneFragment a(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
            AddPhoneFragment addPhoneFragment = new AddPhoneFragment();
            C35966w1.a(addPhoneFragment, -1, new C6885a(str, str2, str3, str4));
            return addPhoneFragment;
        }

        public a() {
        }
    }

    /* compiled from: AddPhoneFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC44372b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC44372b interfaceC44372b) {
            C41916j c41916jD;
            Action action;
            f.c cVarB;
            InterfaceC44372b interfaceC44372b2 = interfaceC44372b;
            AddPhoneFragment addPhoneFragment = (AddPhoneFragment) this.receiver;
            a aVar = AddPhoneFragment.f226797F0;
            addPhoneFragment.getClass();
            Intent intent = null;
            if (interfaceC44372b2 instanceof InterfaceC44372b.d) {
                InterfaceC28373a interfaceC28373a = addPhoneFragment.f226815z0;
                (interfaceC28373a != null ? interfaceC28373a : null).c(new C19873a(((InterfaceC44372b.d) interfaceC44372b2).f415203a, CodeConfirmationSource.f92760h));
                addPhoneFragment.f226801D0.b(interfaceC44372b2);
            } else if (interfaceC44372b2 instanceof InterfaceC44372b.e) {
                addPhoneFragment.f226802E0.b(interfaceC44372b2);
                InterfaceC28373a interfaceC28373a2 = addPhoneFragment.f226815z0;
                (interfaceC28373a2 != null ? interfaceC28373a2 : null).c(new C19873a(((InterfaceC44372b.e) interfaceC44372b2).f415205a, CodeConfirmationSource.f92760h));
            } else if (interfaceC44372b2 instanceof InterfaceC44372b.C11864b) {
                ActivityC22955m activityC22955mRequireActivity = addPhoneFragment.requireActivity();
                K2.c(activityC22955mRequireActivity);
                activityC22955mRequireActivity.setResult(0);
                activityC22955mRequireActivity.finish();
            } else if (interfaceC44372b2 instanceof InterfaceC44372b.a) {
                ActivityC22955m activityC22955mRequireActivity2 = addPhoneFragment.requireActivity();
                InterfaceC44372b.a aVar2 = (InterfaceC44372b.a) interfaceC44372b2;
                PrintableText printableText = aVar2.f415197a;
                if (printableText != null) {
                    intent = new Intent();
                    intent.putExtra("result_message", printableText.k0(addPhoneFragment.requireContext()));
                    String str = aVar2.f415198b;
                    if (str != null) {
                        intent.putExtra("extra_result_phone", str);
                    }
                }
                activityC22955mRequireActivity2.setResult(-1, intent);
                activityC22955mRequireActivity2.finish();
            } else if (interfaceC44372b2 instanceof InterfaceC44372b.c) {
                addPhoneFragment.f226799B0.b(interfaceC44372b2);
            } else if (interfaceC44372b2 instanceof InterfaceC44372b.f) {
                addPhoneFragment.f226800C0.b(interfaceC44372b2);
            } else if (interfaceC44372b2 instanceof InterfaceC44372b.g) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                View view = addPhoneFragment.f226808s0;
                View view2 = view == null ? null : view;
                InterfaceC44372b.g gVar = (InterfaceC44372b.g) interfaceC44372b2;
                ToastBarPosition toastBarPosition = ToastBarPosition.f181045c;
                Throwable th2 = gVar.f415210b;
                if (th2 != null) {
                    cVarB = new f.c(th2);
                } else {
                    f.c.f125255c.getClass();
                    cVarB = f.c.a.b();
                }
                com.avito.android.component.toast.c.b(cVar, view2, gVar.f415209a, null, null, null, cVarB, 0, toastBarPosition, null, false, false, null, null, 4014);
            } else if (interfaceC44372b2 instanceof InterfaceC44372b.h) {
                UserDialog userDialog = ((InterfaceC44372b.h) interfaceC44372b2).f415211a;
                List<Action> actions = userDialog.getActions();
                String title = (actions == null || (action = (Action) C42745f0.G(actions)) == null) ? null : action.getTitle();
                if (title != null) {
                    InterfaceC30274a interfaceC30274a = addPhoneFragment.f226798A0;
                    c41916jD = (interfaceC30274a != null ? interfaceC30274a : null).e(userDialog.getTitle(), userDialog.getMessage(), title, null, true);
                } else {
                    InterfaceC30274a interfaceC30274a2 = addPhoneFragment.f226798A0;
                    c41916jD = (interfaceC30274a2 != null ? interfaceC30274a2 : null).d(userDialog.getMessage(), userDialog.getTitle());
                }
                addPhoneFragment.f226803n0.b(c41916jD.n(io.reactivex.rxjava3.internal.functions.a.f401994d, io.reactivex.rxjava3.internal.functions.a.f401996f, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AddPhoneFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnb0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lnb0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C44373c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C44373c c44373c) {
            C44373c c44373c2 = c44373c;
            a aVar = AddPhoneFragment.f226797F0;
            AddPhoneFragment addPhoneFragment = AddPhoneFragment.this;
            if (c44373c2.f415215c != null) {
                Input input = addPhoneFragment.f226807r0;
                if (input == null) {
                    input = null;
                }
                Input.f179303W.getClass();
                input.setState(Input.f179305b0);
                ComponentContainer componentContainer = addPhoneFragment.f226806q0;
                if (componentContainer == null) {
                    componentContainer = null;
                }
                Input input2 = addPhoneFragment.f226807r0;
                if (input2 == null) {
                    input2 = null;
                }
                ComponentContainer.l(componentContainer, new int[]{input2.getId()}, c44373c2.f415215c, 4);
            } else {
                Input input3 = addPhoneFragment.f226807r0;
                if (input3 == null) {
                    input3 = null;
                }
                Input.f179303W.getClass();
                input3.setState(Input.f179304a0);
            }
            Button button = addPhoneFragment.f226805p0;
            if (button == null) {
                button = null;
            }
            boolean z12 = c44373c2.f415214b;
            button.setEnabled(!z12);
            Button button2 = addPhoneFragment.f226805p0;
            (button2 != null ? button2 : null).setLoading(z12);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f226821l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f226821l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f226821l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return AddPhoneFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f226823l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f226823l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f226823l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f226824l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f226824l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f226824l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f226825l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f226825l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f226825l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AddPhoneFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/r;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/profile_phones/add_phone/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<r> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final r invoke() {
            s sVar = AddPhoneFragment.this.f226810u0;
            if (sVar == null) {
                sVar = null;
            }
            return (r) sVar.get();
        }
    }

    public AddPhoneFragment() {
        super(0, 1, null);
        this.f226803n0 = new io.reactivex.rxjava3.disposables.c();
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f226811v0 = new O0(m0.f406844a.b(r.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f226799B0 = registerForActivityResult(new com.avito.android.profile_phones.add_phone.d(this), new C28629h(2));
        this.f226800C0 = registerForActivityResult(new com.avito.android.profile_phones.add_phone.c(this), new C28629h(2));
        this.f226801D0 = registerForActivityResult(new com.avito.android.profile_phones.add_phone.a(this), new C28629h(2));
        this.f226802E0 = registerForActivityResult(new com.avito.android.profile_phones.add_phone.b(this), new C28629h(2));
    }

    public static final void q5(AddPhoneFragment addPhoneFragment, int i12, Intent intent) {
        LandlinePhoneVerificationViewModel.ResultStatus resultStatus;
        Object serializableExtra;
        if (i12 != -1) {
            return;
        }
        r rVarS5 = addPhoneFragment.s5();
        String stringExtra = intent != null ? intent.getStringExtra("extra_phone") : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializableExtra = intent.getSerializableExtra("extra_result_status", LandlinePhoneVerificationViewModel.ResultStatus.class);
            } else {
                Object serializableExtra2 = intent.getSerializableExtra("extra_result_status");
                if (!(serializableExtra2 instanceof LandlinePhoneVerificationViewModel.ResultStatus)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (LandlinePhoneVerificationViewModel.ResultStatus) serializableExtra2;
            }
            resultStatus = (LandlinePhoneVerificationViewModel.ResultStatus) serializableExtra;
        } else {
            resultStatus = null;
        }
        rVarS5.accept(new InterfaceC44371a.c(stringExtra, resultStatus != null ? resultStatus : null));
    }

    public static final void r5(AddPhoneFragment addPhoneFragment, int i12, Intent intent) {
        if (i12 != -1) {
            addPhoneFragment.s5().accept(InterfaceC44371a.e.f415196a);
            return;
        }
        com.avito.android.phone_reverification_info.d dVar = addPhoneFragment.f226813x0;
        if (dVar == null) {
            dVar = null;
        }
        String strA = dVar.a(intent);
        if (strA != null) {
            addPhoneFragment.s5().accept(new InterfaceC44371a.d(strA));
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        LandlinePhoneVerificationViewModel.ResultStatus resultStatus;
        Object serializableExtra;
        super.onActivityResult(i12, i13, intent);
        if (i12 != 10) {
            if (i12 != 20) {
                return;
            }
            if (i13 != -1) {
                s5().accept(InterfaceC44371a.e.f415196a);
                return;
            }
            com.avito.android.phone_reverification_info.d dVar = this.f226813x0;
            String strA = (dVar != null ? dVar : null).a(intent);
            if (strA != null) {
                s5().accept(new InterfaceC44371a.d(strA));
                return;
            }
            return;
        }
        if (i13 != -1) {
            return;
        }
        r rVarS5 = s5();
        String stringExtra = intent != null ? intent.getStringExtra("extra_phone") : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializableExtra = intent.getSerializableExtra("extra_result_status", LandlinePhoneVerificationViewModel.ResultStatus.class);
            } else {
                Object serializableExtra2 = intent.getSerializableExtra("extra_result_status");
                if (!(serializableExtra2 instanceof LandlinePhoneVerificationViewModel.ResultStatus)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (LandlinePhoneVerificationViewModel.ResultStatus) serializableExtra2;
            }
            resultStatus = (LandlinePhoneVerificationViewModel.ResultStatus) serializableExtra;
        } else {
            resultStatus = null;
        }
        rVarS5.accept(new InterfaceC44371a.c(stringExtra, resultStatus != null ? resultStatus : null));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f226812w0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.add_phone, viewGroup, false);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f226812w0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, s5(), new b(1, this, AddPhoneFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneOneTimeEvent;)V", 0), new c());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        H2 h22 = this.f226809t0;
        if (h22 != null) {
            h22.dispose();
        }
        Input input = this.f226807r0;
        if (input == null) {
            input = null;
        }
        input.f();
        this.f226803n0.e();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("key.title") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("key.subtitle") : null;
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString("key.prefilledPhone") : null;
        View viewFindViewById = view.findViewById(R.id.add_phone_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f226805p0 = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.anchor_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f226808s0 = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.phone_input_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f226806q0 = (ComponentContainer) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.app_bar);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.avito.component.toolbar.AppBarLayoutWithIconAction");
        }
        AppBarLayoutWithIconAction appBarLayoutWithIconAction = (AppBarLayoutWithIconAction) viewFindViewById4;
        this.f226804o0 = appBarLayoutWithIconAction;
        if (string != null) {
            appBarLayoutWithIconAction.setTitle(string);
            AppBarLayoutWithIconAction appBarLayoutWithIconAction2 = this.f226804o0;
            if (appBarLayoutWithIconAction2 == null) {
                appBarLayoutWithIconAction2 = null;
            }
            appBarLayoutWithIconAction2.setShortTitle(string);
        }
        if (string2 != null) {
            AppBarLayoutWithIconAction appBarLayoutWithIconAction3 = this.f226804o0;
            if (appBarLayoutWithIconAction3 == null) {
                appBarLayoutWithIconAction3 = null;
            }
            appBarLayoutWithIconAction3.setSubTitle(string2);
        }
        View viewFindViewById5 = view.findViewById(R.id.phone_input);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById5;
        this.f226807r0 = input;
        FormatterType.f179288e.getClass();
        input.setFormatterType(FormatterType.f179290g);
        if (string3 != null) {
            Input input2 = this.f226807r0;
            if (input2 == null) {
                input2 = null;
            }
            Input.t(input2, string3, false, 4);
        }
        Input input3 = this.f226807r0;
        if (input3 == null) {
            input3 = null;
        }
        input3.v();
        Button button = this.f226805p0;
        if (button == null) {
            button = null;
        }
        z<G0> zVarA = C37722i.a(button);
        Input input4 = this.f226807r0;
        if (input4 == null) {
            input4 = null;
        }
        this.f226803n0.b(z.g0(zVarA, com.avito.android.lib.design.input.n.a(input4, 6).d0(com.avito.android.profile_phones.add_phone.f.f226873b)).d0(new com.avito.android.profile_phones.add_phone.g(this)).N(com.avito.android.profile_phones.add_phone.h.f226875b).v0(new com.avito.android.profile_phones.add_phone.i(this), j.f226877b, io.reactivex.rxjava3.internal.functions.a.f401993c));
        AppBarLayoutWithIconAction appBarLayoutWithIconAction4 = this.f226804o0;
        if (appBarLayoutWithIconAction4 == null) {
            appBarLayoutWithIconAction4 = null;
        }
        CollapsingTitleAppBarLayout.m(appBarLayoutWithIconAction4, R.drawable.ic_close_24);
        AppBarLayoutWithIconAction appBarLayoutWithIconAction5 = this.f226804o0;
        if (appBarLayoutWithIconAction5 == null) {
            appBarLayoutWithIconAction5 = null;
        }
        appBarLayoutWithIconAction5.setClickListener(new k(this));
        int i12 = getResources().getConfiguration().orientation;
        if (i12 == 1) {
            AppBarLayoutWithIconAction appBarLayoutWithIconAction6 = this.f226804o0;
            if (appBarLayoutWithIconAction6 == null) {
                appBarLayoutWithIconAction6 = null;
            }
            appBarLayoutWithIconAction6.postDelayed(new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 21), 200L);
        } else if (i12 == 2) {
            ActivityC22955m activityC22955mL1 = l1();
            this.f226809t0 = activityC22955mL1 != null ? K2.a(activityC22955mL1, new com.avito.android.profile_phones.add_phone.e(this)) : null;
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f226812w0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC6886a interfaceC6886aA = com.avito.android.profile_phones.add_phone.di.h.a();
        com.avito.android.profile_phones.add_phone.di.b bVar = (com.avito.android.profile_phones.add_phone.di.b) C29972i.a(C29972i.b(this), com.avito.android.profile_phones.add_phone.di.b.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        Bundle arguments = getArguments();
        interfaceC6886aA.a(bVar, interfaceC39417aB, arguments != null ? arguments.getString("key.source") : null, getResources(), requireActivity(), com.avito.android.analytics.screens.s.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f226812w0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final r s5() {
        return (r) this.f226811v0.getValue();
    }
}
