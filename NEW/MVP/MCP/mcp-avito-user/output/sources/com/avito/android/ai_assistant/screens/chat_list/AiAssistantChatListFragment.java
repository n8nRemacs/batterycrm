package com.avito.android.ai_assistant.screens.chat_list;

import Cd.C13243a;
import Wb.InterfaceC15738a;
import Wb.b;
import Wb.c;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23487e;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.ai_assistant.AssistantChatArguments;
import com.avito.android.ai_assistant.components.placeholder.AiAssistantPlaceholderView;
import com.avito.android.ai_assistant.components.placeholder.a;
import com.avito.android.ai_assistant.screens.chat_list.c;
import com.avito.android.ai_assistant.screens.chat_list.mvi.s;
import com.avito.android.ai_assistant.screens.chat_list.mvi.t;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: AiAssistantChatListFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/AiAssistantChatListFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AiAssistantChatListFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f89567s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public t f89568n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f89569o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f89570p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f89571q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public com.avito.android.ai_assistant.screens.chat_list.e f89572r0;

    /* compiled from: AiAssistantChatListFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/AiAssistantChatListFragment$a;", "", "<init>", "()V", "", "ARGS", "Ljava/lang/String;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: AiAssistantChatListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.ai_assistant.screens.chat_list.AiAssistantChatListFragment$a$a, reason: collision with other inner class name */
        public static final class C2662a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ AssistantChatListArguments f89573l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2662a(AssistantChatListArguments assistantChatListArguments) {
                super(1);
                this.f89573l = assistantChatListArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key.buyer_assistant_chat_list_args", this.f89573l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static AiAssistantChatListFragment a(@Y61.k AssistantChatListArguments assistantChatListArguments) {
            AiAssistantChatListFragment aiAssistantChatListFragment = new AiAssistantChatListFragment();
            C35966w1.a(aiAssistantChatListFragment, -1, new C2662a(assistantChatListArguments));
            return aiAssistantChatListFragment;
        }

        public a() {
        }
    }

    /* compiled from: AiAssistantChatListFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Wb.b, G0> {
        @Override // Y41.l
        public final G0 invoke(Wb.b bVar) {
            Wb.b bVar2 = bVar;
            AiAssistantChatListFragment aiAssistantChatListFragment = (AiAssistantChatListFragment) this.receiver;
            a aVar = AiAssistantChatListFragment.f89567s0;
            aiAssistantChatListFragment.getClass();
            if (bVar2 instanceof b.C1274b) {
                b.C1274b c1274b = (b.C1274b) bVar2;
                String str = c1274b.f17968a;
                if (str == null) {
                    str = "";
                }
                AssistantChatArguments assistantChatArguments = new AssistantChatArguments(str, c1274b.f17969b, false);
                InterfaceC23487e parentFragment = aiAssistantChatListFragment.getParentFragment();
                com.avito.android.ai_assistant.screens.c cVar = parentFragment instanceof com.avito.android.ai_assistant.screens.c ? (com.avito.android.ai_assistant.screens.c) parentFragment : null;
                if (cVar != null) {
                    cVar.q4(assistantChatArguments);
                }
            } else if (L.f(bVar2, b.a.f17967a)) {
                aiAssistantChatListFragment.getParentFragmentManager().Y();
            } else if (bVar2 instanceof b.c) {
                a.i.C4057a.d(aiAssistantChatListFragment.f5(), ((b.c) bVar2).f17970a, null, null, null, 0, null, null, null, 2046);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AiAssistantChatListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LWb/c;", "it", "Lkotlin/G0;", "invoke", "(LWb/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Wb.c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Wb.c cVar) {
            Wb.c cVar2 = cVar;
            com.avito.android.ai_assistant.screens.chat_list.e eVar = AiAssistantChatListFragment.this.f89572r0;
            if (eVar != null) {
                boolean z12 = cVar2 instanceof c.b;
                eVar.f89595d.setVisibility((z12 && (((c.b) cVar2).f17972b instanceof c.a)) ? 0 : 8);
                AiAssistantPlaceholderView aiAssistantPlaceholderView = eVar.f89596e;
                if (z12) {
                    com.avito.android.ai_assistant.screens.chat_list.c cVar3 = ((c.b) cVar2).f17972b;
                    if (cVar3 instanceof c.a) {
                        c.a aVar = (c.a) cVar3;
                        aiAssistantPlaceholderView.setState(a.C2623a.f88931a);
                        eVar.a(aVar.f89585a);
                        eVar.f89592a.l(aVar.f89586b, null);
                    } else if (cVar3 instanceof c.b) {
                        c.b bVar = (c.b) cVar3;
                        eVar.a(bVar.f89587a);
                        PrintableText printableTextF = com.avito.android.printable_text.b.f(bVar.f89589c);
                        a.c.b.C2626a c2626a = new a.c.b.C2626a(bVar.f89590d);
                        UniversalImage universalImage = bVar.f89588b;
                        aiAssistantPlaceholderView.setState(new a.c(printableTextF, c2626a, universalImage != null ? new a.c.InterfaceC2624a.b(universalImage) : null, null, null, 24, null));
                    }
                } else if (cVar2.equals(c.a.f17971b)) {
                    aiAssistantPlaceholderView.setState(new a.c(com.avito.android.printable_text.b.c(R.string.ai_assistant_placeholder_chat_list_title, new Serializable[0]), new a.c.b.C2627b(com.avito.android.printable_text.b.c(R.string.ai_assistant_placeholder_chat_list_subtitle, new Serializable[0])), new a.c.InterfaceC2624a.C2625a(), com.avito.android.printable_text.b.c(R.string.ai_assistant_placeholder_chat_list_button, new Serializable[0]), new com.avito.android.ai_assistant.screens.chat_list.d(eVar)));
                } else if (cVar2.equals(c.C1275c.f17975b)) {
                    aiAssistantPlaceholderView.setState(a.b.f88932a);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AiAssistantChatListFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC15738a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC15738a interfaceC15738a) {
            ((s) this.receiver).accept(interfaceC15738a);
            return G0.f406611a;
        }
    }

    /* compiled from: AiAssistantChatListFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/ai_assistant/screens/chat_list/AiAssistantChatListFragment$e", "Lcom/avito/android/ai_assistant/adapter/append/f;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements com.avito.android.ai_assistant.adapter.append.f {
        public e() {
        }

        @Override // com.avito.android.ai_assistant.adapter.append.f
        public final void a() {
            a aVar = AiAssistantChatListFragment.f89567s0;
            AiAssistantChatListFragment.this.q5().accept(InterfaceC15738a.d.f17964a);
        }

        @Override // com.avito.android.ai_assistant.adapter.append.f
        public final void b() {
            a aVar = AiAssistantChatListFragment.f89567s0;
            AiAssistantChatListFragment.this.q5().accept(InterfaceC15738a.e.f17965a);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f89576l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f89576l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f89576l);
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
            return AiAssistantChatListFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f89578l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f89578l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f89578l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f89579l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f89579l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f89579l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f89580l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f89580l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f89580l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AiAssistantChatListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/s;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/ai_assistant/screens/chat_list/mvi/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<s> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final s invoke() {
            t tVar = AiAssistantChatListFragment.this.f89568n0;
            if (tVar == null) {
                tVar = null;
            }
            return (s) tVar.get();
        }
    }

    public AiAssistantChatListFragment() {
        super(R.layout.ai_assistant_chat_list_fragment);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f89571q0 = new O0(m0.f406844a.b(s.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f89569o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f89569o0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new b(1, this, AiAssistantChatListFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListOneTimeEvent;)V", 0), new c());
        return layoutInflater.inflate(R.layout.ai_assistant_chat_list_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.d dVar = this.f89570p0;
        if (dVar == null) {
            dVar = null;
        }
        this.f89572r0 = new com.avito.android.ai_assistant.screens.chat_list.e(new d(1, q5(), s.class, "accept", "accept(Ljava/lang/Object;)V", 0), view, dVar);
        ScreenPerformanceTracker screenPerformanceTracker = this.f89569o0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.avito.android.ai_assistant.screens.chat_list.a] */
    @Override // com.avito.android.ui.fragments.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p5(@Y61.l android.os.Bundle r10) {
        /*
            r9 = this;
            com.avito.android.analytics.screens.D$a r10 = com.avito.android.analytics.screens.D.f90335a
            r10.getClass()
            com.avito.android.analytics.screens.F r10 = com.avito.android.analytics.screens.D.a.a()
            com.avito.android.ai_assistant.di.chat_list.a$a r0 = com.avito.android.ai_assistant.di.chat_list.e.a()
            android.os.Bundle r1 = r9.getArguments()
            r7 = 0
            if (r1 == 0) goto L2e
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r2 < r3) goto L21
            java.lang.Object r1 = com.avito.android.actions_sheet.b.D(r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            goto L27
        L21:
            java.lang.String r2 = "key.buyer_assistant_chat_list_args"
            android.os.Parcelable r1 = r1.getParcelable(r2)
        L27:
            com.avito.android.ai_assistant.screens.chat_list.AssistantChatListArguments r1 = (com.avito.android.ai_assistant.screens.chat_list.AssistantChatListArguments) r1
            if (r1 != 0) goto L2c
            goto L2e
        L2c:
            r3 = r1
            goto L35
        L2e:
            com.avito.android.ai_assistant.screens.chat_list.AssistantChatListArguments r1 = new com.avito.android.ai_assistant.screens.chat_list.AssistantChatListArguments
            r2 = 3
            r1.<init>(r7, r7, r2, r7)
            goto L2c
        L35:
            com.avito.android.K r1 = com.avito.android.di.C29972i.b(r9)
            java.lang.Class<com.avito.android.ai_assistant.di.chat_list.b> r2 = com.avito.android.ai_assistant.di.chat_list.b.class
            com.avito.android.di.h r1 = com.avito.android.di.C29972i.a(r1, r2)
            com.avito.android.ai_assistant.di.chat_list.b r1 = (com.avito.android.ai_assistant.di.chat_list.b) r1
            cv.a r2 = cv.c.b(r9)
            com.avito.android.analytics.screens.k r4 = new com.avito.android.analytics.screens.k
            com.avito.android.analytics.screens.AiAssistantChatListScreen r5 = com.avito.android.analytics.screens.AiAssistantChatListScreen.f90281d
            com.avito.android.analytics.screens.r r6 = com.avito.android.analytics.screens.s.c(r9)
            java.lang.String r8 = "assistantMessages"
            r4.<init>(r5, r6, r8)
            com.avito.android.ai_assistant.screens.chat_list.a r5 = new com.avito.android.ai_assistant.screens.chat_list.a
            r5.<init>()
            com.avito.android.ai_assistant.screens.chat_list.AiAssistantChatListFragment$e r6 = new com.avito.android.ai_assistant.screens.chat_list.AiAssistantChatListFragment$e
            r6.<init>()
            com.avito.android.ai_assistant.di.chat_list.a r0 = r0.a(r1, r2, r3, r4, r5, r6)
            r0.a(r9)
            com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker r0 = r9.f89569o0
            if (r0 == 0) goto L68
            goto L69
        L68:
            r0 = r7
        L69:
            long r1 = r10.b()
            r0.a(r1)
            com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker r10 = r9.f89569o0
            if (r10 == 0) goto L75
            r7 = r10
        L75:
            com.avito.android.memory.consumption.f$a r10 = r9.g5()
            r7.c(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ai_assistant.screens.chat_list.AiAssistantChatListFragment.p5(android.os.Bundle):void");
    }

    public final s q5() {
        return (s) this.f89571q0.getValue();
    }
}
