package com.avito.android.ai_assistant.screens.chat;

import Cd.C13243a;
import HV.a;
import SK0.b;
import Vb.InterfaceC15661a;
import Vb.h;
import Xb.C16986a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.ai_assistant.AssistantChatArguments;
import com.avito.android.ai_assistant.model.ReactionState;
import com.avito.android.ai_assistant.screens.chat.AiAssistantChatFragment;
import com.avito.android.analytics.screens.AiAssistantScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.K2;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import z1.AbstractC50339a;

/* compiled from: AiAssistantChatFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/AiAssistantChatFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AiAssistantChatFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final a f89144v0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public t f89145n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f89146o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f89147p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f89148q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f89149r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public Xb.d f89150s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.ai_assistant.adapter.assistant_text_message.f f89151t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f89152u0;

    /* compiled from: AiAssistantChatFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/AiAssistantChatFragment$a;", "", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: AiAssistantChatFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.ai_assistant.screens.chat.AiAssistantChatFragment$a$a, reason: collision with other inner class name */
        public static final class C2644a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ AssistantChatArguments f89153l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2644a(AssistantChatArguments assistantChatArguments) {
                super(1);
                this.f89153l = assistantChatArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("chat_arguments", this.f89153l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static AiAssistantChatFragment a(@Y61.k AssistantChatArguments assistantChatArguments) {
            AiAssistantChatFragment aiAssistantChatFragment = new AiAssistantChatFragment();
            C35966w1.a(aiAssistantChatFragment, -1, new C2644a(assistantChatArguments));
            return aiAssistantChatFragment;
        }

        public a() {
        }
    }

    /* compiled from: AiAssistantChatFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Vb.h, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(Vb.h hVar) throws Resources.NotFoundException {
            String string;
            Vb.h hVar2 = hVar;
            AiAssistantChatFragment aiAssistantChatFragment = (AiAssistantChatFragment) this.receiver;
            a aVar = AiAssistantChatFragment.f89144v0;
            aiAssistantChatFragment.getClass();
            if (hVar2 instanceof h.a) {
                for (Tb.e eVar : ((h.a) hVar2).f17236a) {
                    if (eVar.f15742b) {
                        com.avito.android.deeplink_handler.handler.composite.a aVar2 = aiAssistantChatFragment.f89148q0;
                        if (aVar2 == null) {
                            aVar2 = null;
                        }
                        b.a.a(aVar2, eVar.f15741a, null, null, 6);
                    }
                }
                Fragment parentFragment = aiAssistantChatFragment.getParentFragment();
                com.avito.android.ai_assistant.screens.c cVar = parentFragment instanceof com.avito.android.ai_assistant.screens.c ? (com.avito.android.ai_assistant.screens.c) parentFragment : null;
                if (cVar != null) {
                    cVar.close();
                }
            } else if (hVar2 instanceof h.e) {
                h.e eVar2 = (h.e) hVar2;
                if (eVar2.f17243b) {
                    K2.e(aiAssistantChatFragment);
                }
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = aiAssistantChatFragment.f89148q0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                b.a.a(aVar3, eVar2.f17242a, null, null, 6);
            } else if (hVar2 instanceof h.d) {
                Xb.d dVar = aiAssistantChatFragment.f89150s0;
                if (dVar == null) {
                    dVar = null;
                }
                h.d dVar2 = (h.d) hVar2;
                String str = dVar2.f17241b;
                dVar.getClass();
                C16986a c16986a = C16986a.f18948a;
                SK0.f fVar = new SK0.f();
                fVar.a("chat_id", str);
                G0 g02 = G0.f406611a;
                b.a.a(dVar.f18950a, c16986a, null, fVar, new Xb.c(), 2);
                K2.e(aiAssistantChatFragment);
                com.avito.android.deeplink_handler.handler.composite.a aVar4 = aiAssistantChatFragment.f89148q0;
                if (aVar4 == null) {
                    aVar4 = null;
                }
                b.a.a(aVar4, dVar2.f17240a, null, null, 6);
            } else if (hVar2 instanceof h.g) {
                com.avito.android.deeplink_handler.handler.composite.a aVar5 = aiAssistantChatFragment.f89148q0;
                if (aVar5 == null) {
                    aVar5 = null;
                }
                b.a.a(aVar5, ((h.g) hVar2).f17245a, null, null, 6);
            } else if (hVar2 instanceof h.b) {
                K2.e(aiAssistantChatFragment);
            } else if (hVar2 instanceof h.i) {
                View viewFindViewById = aiAssistantChatFragment.requireActivity().findViewById(R.id.content);
                View view = aiAssistantChatFragment.getView();
                Context context = view != null ? view.getContext() : null;
                if (context == null) {
                    context = aiAssistantChatFragment.requireContext();
                }
                FV.a aVar6 = FV.a.f4720a;
                String string2 = aiAssistantChatFragment.getResources().getString(com.avito.android.R.string.ai_assistant_no_internet);
                aVar6.getClass();
                ToastBarState toastBarState = new ToastBarState(com.avito.android.printable_text.b.e(FV.a.i(string2, context, com.avito.android.R.attr.textIconWifi, 8)), null, null, null, null, null, null, 0, false, false, null, null, 4094, null);
                a.C0407a c0407a = HV.a.f7100w;
                int iJ2 = C35835l0.j(com.avito.android.R.attr.toastBarError, context);
                c0407a.getClass();
                IV.a.d(viewFindViewById, toastBarState, a.C0407a.b(iJ2, context));
            } else if (hVar2 instanceof h.C1191h) {
                View viewFindViewById2 = aiAssistantChatFragment.requireActivity().findViewById(R.id.content);
                View view2 = aiAssistantChatFragment.getView();
                Context context2 = view2 != null ? view2.getContext() : null;
                if (context2 == null) {
                    context2 = aiAssistantChatFragment.requireContext();
                }
                PrintableText printableText = ((h.C1191h) hVar2).f17246a;
                if (printableText == null || (string = printableText.k0(context2)) == null) {
                    string = aiAssistantChatFragment.getResources().getString(com.avito.android.R.string.ai_assistant_something_went_wrong);
                }
                ToastBarState toastBarState2 = new ToastBarState(com.avito.android.printable_text.b.f(string), null, null, null, null, null, null, 0, false, false, null, null, 4094, null);
                a.C0407a c0407a2 = HV.a.f7100w;
                int iJ3 = C35835l0.j(com.avito.android.R.attr.toastBarError, context2);
                c0407a2.getClass();
                IV.a.d(viewFindViewById2, toastBarState2, a.C0407a.b(iJ3, context2));
            } else if (hVar2 instanceof h.c) {
                Fragment parentFragment2 = aiAssistantChatFragment.getParentFragment();
                com.avito.android.ai_assistant.screens.c cVar2 = parentFragment2 instanceof com.avito.android.ai_assistant.screens.c ? (com.avito.android.ai_assistant.screens.c) parentFragment2 : null;
                if (cVar2 != null) {
                    h.c cVar3 = (h.c) hVar2;
                    cVar2.y4(cVar3.f17238a, cVar3.f17239b);
                }
            } else if (hVar2 instanceof h.j) {
                View viewFindViewById3 = aiAssistantChatFragment.requireView().findViewById(com.avito.android.R.id.content_container);
                viewFindViewById3.postDelayed(new J11.c(24, hVar2, viewFindViewById3), 300L);
            } else if (hVar2 instanceof h.f) {
                Fragment parentFragment3 = aiAssistantChatFragment.getParentFragment();
                com.avito.android.ai_assistant.screens.c cVar4 = parentFragment3 instanceof com.avito.android.ai_assistant.screens.c ? (com.avito.android.ai_assistant.screens.c) parentFragment3 : null;
                if (cVar4 != null) {
                    cVar4.q4(new AssistantChatArguments(((h.f) hVar2).f17244a, null, false, 6, null));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AiAssistantChatFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVb/i;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LVb/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Vb.i, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q f89154l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AiAssistantChatFragment f89155m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q qVar, AiAssistantChatFragment aiAssistantChatFragment) {
            super(1);
            this.f89154l = qVar;
            this.f89155m = aiAssistantChatFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:68:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0157  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(Vb.i r27) {
            /*
                Method dump skipped, instructions count: 592
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ai_assistant.screens.chat.AiAssistantChatFragment.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AiAssistantChatFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.AiAssistantChatFragment$onViewCreated$3", f = "AiAssistantChatFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f89156q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = AiAssistantChatFragment.this.new d(continuation);
            dVar.f89156q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f89156q;
            a aVar = AiAssistantChatFragment.f89144v0;
            C43259k.d(t12, null, null, new com.avito.android.ai_assistant.screens.chat.e(AiAssistantChatFragment.this, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: AiAssistantChatFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.AiAssistantChatFragment$onViewCreated$4", f = "AiAssistantChatFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f89158q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ q f89160s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q qVar, Continuation continuation) {
            super(2, continuation);
            this.f89160s = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = AiAssistantChatFragment.this.new e(this.f89160s, continuation);
            eVar.f89158q = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f89158q;
            a aVar = AiAssistantChatFragment.f89144v0;
            C43259k.d(t12, null, null, new com.avito.android.ai_assistant.screens.chat.d(this.f89160s, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: AiAssistantChatFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/ai_assistant/screens/chat/AiAssistantChatFragment$f", "Lcom/avito/android/ai_assistant/adapter/append/f;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements com.avito.android.ai_assistant.adapter.append.f {
        public f() {
        }

        @Override // com.avito.android.ai_assistant.adapter.append.f
        public final void a() {
            a aVar = AiAssistantChatFragment.f89144v0;
            AiAssistantChatFragment.this.q5().accept(new InterfaceC15661a.f(true));
        }

        @Override // com.avito.android.ai_assistant.adapter.append.f
        public final void b() {
            a aVar = AiAssistantChatFragment.f89144v0;
            AiAssistantChatFragment.this.q5().accept(new InterfaceC15661a.f(false));
        }
    }

    /* compiled from: AiAssistantChatFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/ai_assistant/screens/chat/AiAssistantChatFragment$g", "Lcom/avito/android/ai_assistant/adapter/message_actions/h;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements com.avito.android.ai_assistant.adapter.message_actions.h {
        public g() {
        }

        @Override // com.avito.android.ai_assistant.adapter.message_actions.h
        public final void a(@Y61.k String str, @Y61.k ReactionState reactionState, @Y61.k Tb.f fVar) {
            a aVar = AiAssistantChatFragment.f89144v0;
            AiAssistantChatFragment.this.q5().accept(new InterfaceC15661a.h(str, reactionState, fVar));
        }

        @Override // com.avito.android.ai_assistant.adapter.message_actions.h
        public final void b(@Y61.k DeepLink deepLink) {
            a aVar = AiAssistantChatFragment.f89144v0;
            AiAssistantChatFragment.this.q5().accept(new InterfaceC15661a.C1189a(deepLink));
        }
    }

    /* compiled from: AiAssistantChatFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/ai_assistant/screens/chat/AiAssistantChatFragment$h", "Lcom/avito/android/ai_assistant/adapter/simple_snippet/e;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements com.avito.android.ai_assistant.adapter.simple_snippet.e {
        public h() {
        }

        @Override // com.avito.android.ai_assistant.adapter.simple_snippet.e
        public final void a(@Y61.k com.avito.android.ai_assistant.adapter.simple_snippet.c cVar) {
            a aVar = AiAssistantChatFragment.f89144v0;
            AiAssistantChatFragment.this.q5().accept(new InterfaceC15661a.b(cVar.f88887k));
        }

        @Override // com.avito.android.ai_assistant.adapter.simple_snippet.e
        public final void b(@Y61.k com.avito.android.ai_assistant.adapter.simple_snippet.c cVar) {
            a aVar = AiAssistantChatFragment.f89144v0;
            AiAssistantChatFragment.this.q5().accept(new InterfaceC15661a.k(cVar));
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f89164l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f89164l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f89164l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return AiAssistantChatFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f89166l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f89166l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f89166l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f89167l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f89167l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f89167l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f89168l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f89168l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f89168l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AiAssistantChatFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/s;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/ai_assistant/screens/chat/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<s> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final s invoke() {
            t tVar = AiAssistantChatFragment.this.f89145n0;
            if (tVar == null) {
                tVar = null;
            }
            return (s) tVar.get();
        }
    }

    public AiAssistantChatFragment() {
        super(com.avito.android.R.layout.ai_assistant_fragment);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f89152u0 = new O0(m0.f406844a.b(s.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final a.i f5() {
        return new com.avito.android.deeplink_handler.view.impl.l(requireContext(), requireView().findViewById(com.avito.android.R.id.content_container), requireView().findViewById(com.avito.android.R.id.navbar), ToastBarPosition.f181047e, null, 16, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(com.avito.android.R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f89146o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        com.avito.android.util.text.a aVar = this.f89149r0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.ai_assistant.screens.chat.f fVar = new com.avito.android.ai_assistant.screens.chat.f(1, q5(), s.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        com.avito.konveyor.adapter.d dVar = this.f89147p0;
        if (dVar == null) {
            dVar = null;
        }
        q qVar = new q(viewGroup, aVar, dVar, fVar);
        ScreenPerformanceTracker screenPerformanceTracker = this.f89146o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker, q5(), new b(1, this, AiAssistantChatFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantOneTimeEvent;)V", 0), new c(qVar, this));
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.ai_assistant.screens.chat.c(this, Lifecycle.State.f46682e, new d(null), null), 3);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.ai_assistant.screens.chat.c(this, Lifecycle.State.f46683f, new e(qVar, null), null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f89146o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.avito.android.ai_assistant.screens.chat.b] */
    @Override // com.avito.android.ui.fragments.BaseFragment
    @SuppressLint({"HardcodeStringDetector"})
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle bundleRequireArguments = requireArguments();
        AssistantChatArguments assistantChatArguments = (AssistantChatArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("chat_arguments", AssistantChatArguments.class) : bundleRequireArguments.getParcelable("chat_arguments"));
        if (assistantChatArguments == null) {
            throw new IllegalArgumentException("chat_arguments should be provided");
        }
        com.avito.android.ai_assistant.di.chat.l.a().a((com.avito.android.ai_assistant.di.chat.b) C29972i.a(C29972i.b(this), com.avito.android.ai_assistant.di.chat.b.class), cv.c.b(this), new C28478k(AiAssistantScreen.f90282d, com.avito.android.analytics.screens.s.c(this), "assistantMessages"), new AssistantChatArguments(assistantChatArguments.f88716b, assistantChatArguments.f88717c, bundle == null), new com.avito.android.ai_assistant.screens.chat.a(this, 0), new f(), new g(), new com.avito.android.ai_assistant.screens.chat.g(this), new h(), new com.avito.android.ai_assistant.adapter.repeat_button.e() { // from class: com.avito.android.ai_assistant.screens.chat.b
            @Override // com.avito.android.ai_assistant.adapter.repeat_button.e
            public final void onClick() {
                AiAssistantChatFragment.a aVar = AiAssistantChatFragment.f89144v0;
                this.f89172a.q5().accept(InterfaceC15661a.i.f17223a);
            }
        }).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f89146o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f89146o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final s q5() {
        return (s) this.f89152u0.getValue();
    }
}
