package com.avito.android.auto_evidence_request;

import Cd.C13243a;
import Ce.C13296d;
import Ce.InterfaceC13293a;
import Ce.InterfaceC13294b;
import De.C13389a;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.auto_evidence_request.AutoEvidenceRequestFragment;
import com.avito.android.auto_evidence_request.di.d;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deep_linking.links.x;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.validation.Validation;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.InterfaceC35845m2;
import cv.InterfaceC39417a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import z1.AbstractC50339a;

/* compiled from: AutoEvidenceRequestFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_evidence_request/AutoEvidenceRequestFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoEvidenceRequestFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f95009n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f95010o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f95011p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f95012q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f95013r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public C13389a f95014s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public r f95015t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f95016u0;

    /* renamed from: v0, reason: collision with root package name */
    public androidx.view.result.h<InterfaceC13294b.d> f95017v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public p f95018w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public ArrayList f95019x0;

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f95008z0 = {m0.f406844a.e(new Y(AutoEvidenceRequestFragment.class, "openParams", "getOpenParams()Lcom/avito/android/auto_evidence_request/AutoEvidenceRequestOpenParams;", 0))};

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f95007y0 = new a(null);

    /* compiled from: AutoEvidenceRequestFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_evidence_request/AutoEvidenceRequestFragment$a;", "", "<init>", "()V", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutoEvidenceRequestFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.auto_evidence_request.AutoEvidenceRequestFragment$onViewCreated$1", f = "AutoEvidenceRequestFragment.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f95020q;

        /* compiled from: AutoEvidenceRequestFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.auto_evidence_request.AutoEvidenceRequestFragment$onViewCreated$1$1", f = "AutoEvidenceRequestFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f95022q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ AutoEvidenceRequestFragment f95023r;

            /* compiled from: AutoEvidenceRequestFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.auto_evidence_request.AutoEvidenceRequestFragment$onViewCreated$1$1$1", f = "AutoEvidenceRequestFragment.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.auto_evidence_request.AutoEvidenceRequestFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2818a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f95024q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AutoEvidenceRequestFragment f95025r;

                /* compiled from: AutoEvidenceRequestFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LCe/d;", "it", "Lkotlin/G0;", "emit", "(LCe/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.auto_evidence_request.AutoEvidenceRequestFragment$b$a$a$a, reason: collision with other inner class name */
                public static final class C2819a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AutoEvidenceRequestFragment f95026b;

                    public C2819a(AutoEvidenceRequestFragment autoEvidenceRequestFragment) {
                        this.f95026b = autoEvidenceRequestFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        C13296d c13296d = (C13296d) obj;
                        AutoEvidenceRequestFragment autoEvidenceRequestFragment = this.f95026b;
                        p pVar = autoEvidenceRequestFragment.f95018w0;
                        if (pVar != null) {
                            final com.avito.android.auto_evidence_request.b bVar = new com.avito.android.auto_evidence_request.b(1, autoEvidenceRequestFragment.q5(), q.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                            com.avito.android.progress_overlay.l lVar = pVar.f95280f;
                            ApiError apiError = c13296d.f2572h;
                            if (apiError != null) {
                                lVar.a(apiError.getF244063c());
                                lVar.f231600j = new o(bVar);
                            } else {
                                boolean z12 = c13296d.f2569e;
                                if (z12) {
                                    lVar.k(null);
                                } else if (!z12) {
                                    lVar.j();
                                }
                            }
                            pVar.f95276b.c(new UV0.c(c13296d.f2565a));
                            pVar.f95275a.notifyDataSetChanged();
                            boolean z13 = c13296d.f2567c;
                            Button button = pVar.f95278d;
                            button.setEnabled(z13);
                            com.avito.android.lib.design.button.b.a(button, c13296d.f2566b, false);
                            button.setLoading(c13296d.f2571g);
                            final AttributedText attributedText = c13296d.f2570f;
                            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.auto_evidence_request.k
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ((b) bVar).invoke(new InterfaceC13293a.h(attributedText));
                                }
                            });
                            AttributedText attributedText2 = c13296d.f2568d;
                            if (attributedText2 != null) {
                                attributedText2.setOnDeepLinkClickListener(new w() { // from class: com.avito.android.auto_evidence_request.l
                                    @Override // com.avito.android.deep_linking.links.w
                                    public final void i7(DeepLink deepLink) {
                                        bVar.invoke(new InterfaceC13293a.b(deepLink));
                                    }
                                });
                            }
                            if (attributedText2 != null) {
                                attributedText2.setOnUrlClickListener(new x() { // from class: com.avito.android.auto_evidence_request.m
                                    @Override // com.avito.android.deep_linking.links.x
                                    public final boolean X(String str) {
                                        ((b) bVar).invoke(new InterfaceC13293a.k(str));
                                        return true;
                                    }
                                });
                            }
                            com.avito.android.util.text.j.a(pVar.f95279e, attributedText2, null);
                            pVar.f95277c.setClickListener(new n(bVar));
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2818a(AutoEvidenceRequestFragment autoEvidenceRequestFragment, Continuation<? super C2818a> continuation) {
                    super(2, continuation);
                    this.f95025r = autoEvidenceRequestFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C2818a(this.f95025r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2818a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f95024q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = AutoEvidenceRequestFragment.f95007y0;
                        AutoEvidenceRequestFragment autoEvidenceRequestFragment = this.f95025r;
                        q qVarQ5 = autoEvidenceRequestFragment.q5();
                        C2819a c2819a = new C2819a(autoEvidenceRequestFragment);
                        this.f95024q = 1;
                        if (qVarQ5.le(c2819a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* compiled from: AutoEvidenceRequestFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.auto_evidence_request.AutoEvidenceRequestFragment$onViewCreated$1$1$2", f = "AutoEvidenceRequestFragment.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.auto_evidence_request.AutoEvidenceRequestFragment$b$a$b, reason: collision with other inner class name */
            public static final class C2820b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f95027q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AutoEvidenceRequestFragment f95028r;

                /* compiled from: AutoEvidenceRequestFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.auto_evidence_request.AutoEvidenceRequestFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C2821a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AutoEvidenceRequestFragment f95029b;

                    public C2821a(AutoEvidenceRequestFragment autoEvidenceRequestFragment) {
                        this.f95029b = autoEvidenceRequestFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC13294b interfaceC13294b = (InterfaceC13294b) obj;
                        a aVar = AutoEvidenceRequestFragment.f95007y0;
                        AutoEvidenceRequestFragment autoEvidenceRequestFragment = this.f95029b;
                        if (interfaceC13294b instanceof InterfaceC13294b.c) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = autoEvidenceRequestFragment.f95012q0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, ((InterfaceC13294b.c) interfaceC13294b).f2520a, null, null, 6);
                        } else if (interfaceC13294b instanceof InterfaceC13294b.e) {
                            InterfaceC35845m2 interfaceC35845m2 = autoEvidenceRequestFragment.f95013r0;
                            autoEvidenceRequestFragment.startActivity((interfaceC35845m2 != null ? interfaceC35845m2 : null).t(((InterfaceC13294b.e) interfaceC13294b).f2525a));
                        } else if (interfaceC13294b instanceof InterfaceC13294b.d) {
                            androidx.view.result.h<InterfaceC13294b.d> hVar = autoEvidenceRequestFragment.f95017v0;
                            (hVar != null ? hVar : null).b(interfaceC13294b);
                        } else if (interfaceC13294b instanceof InterfaceC13294b.C0117b) {
                            ActivityC22955m activityC22955mRequireActivity = autoEvidenceRequestFragment.requireActivity();
                            activityC22955mRequireActivity.setResult(0);
                            activityC22955mRequireActivity.finish();
                        } else if (interfaceC13294b instanceof InterfaceC13294b.h) {
                            AttributedText attributedText = ((InterfaceC13294b.h) interfaceC13294b).f2528a;
                            autoEvidenceRequestFragment.r5(attributedText != null ? attributedText.getText() : null);
                        } else if (interfaceC13294b instanceof InterfaceC13294b.g) {
                            AttributedText attributedText2 = ((InterfaceC13294b.g) interfaceC13294b).f2527a;
                            autoEvidenceRequestFragment.r5(attributedText2 != null ? attributedText2.getText() : null);
                        } else if (interfaceC13294b instanceof InterfaceC13294b.i) {
                            autoEvidenceRequestFragment.r5(((InterfaceC13294b.i) interfaceC13294b).f2529a);
                        } else if (interfaceC13294b instanceof InterfaceC13294b.a) {
                            AttributedText attributedText3 = ((InterfaceC13294b.a) interfaceC13294b).f2518a;
                            String text = attributedText3 != null ? attributedText3.getText() : null;
                            ActivityC22955m activityC22955mRequireActivity2 = autoEvidenceRequestFragment.requireActivity();
                            activityC22955mRequireActivity2.setResult(-1, new Intent().putExtra("status_message", text));
                            activityC22955mRequireActivity2.finish();
                        } else if (interfaceC13294b instanceof InterfaceC13294b.f) {
                            autoEvidenceRequestFragment.f95019x0 = ((InterfaceC13294b.f) interfaceC13294b).f2526a;
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f95029b, AutoEvidenceRequestFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/auto_evidence_request/mvi/entity/AutoEvidenceRequestEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2820b(AutoEvidenceRequestFragment autoEvidenceRequestFragment, Continuation<? super C2820b> continuation) {
                    super(2, continuation);
                    this.f95028r = autoEvidenceRequestFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C2820b(this.f95028r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2820b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f95027q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = AutoEvidenceRequestFragment.f95007y0;
                        AutoEvidenceRequestFragment autoEvidenceRequestFragment = this.f95028r;
                        InterfaceC43160i<InterfaceC13294b> events = autoEvidenceRequestFragment.q5().getEvents();
                        C2821a c2821a = new C2821a(autoEvidenceRequestFragment);
                        this.f95027q = 1;
                        if (events.collect(c2821a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AutoEvidenceRequestFragment autoEvidenceRequestFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f95023r = autoEvidenceRequestFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f95023r, continuation);
                aVar.f95022q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f95022q;
                AutoEvidenceRequestFragment autoEvidenceRequestFragment = this.f95023r;
                C43259k.d(t12, null, null, new C2818a(autoEvidenceRequestFragment, null), 3);
                C43259k.d(t12, null, null, new C2820b(autoEvidenceRequestFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return AutoEvidenceRequestFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f95020q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                AutoEvidenceRequestFragment autoEvidenceRequestFragment = AutoEvidenceRequestFragment.this;
                a aVar = new a(autoEvidenceRequestFragment, null);
                this.f95020q = 1;
                if (C23056p0.b(autoEvidenceRequestFragment, state, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutoEvidenceRequestFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LCe/a;", "it", "Lkotlin/G0;", "invoke", "(LCe/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<InterfaceC13293a, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC13293a interfaceC13293a) {
            a aVar = AutoEvidenceRequestFragment.f95007y0;
            AutoEvidenceRequestFragment.this.q5().accept(interfaceC13293a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f95031l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f95031l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f95031l);
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
            return AutoEvidenceRequestFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f95033l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f95033l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f95033l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f95034l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f95034l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f95034l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f95035l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f95035l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f95035l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AutoEvidenceRequestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/auto_evidence_request/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/auto_evidence_request/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<q> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final q invoke() {
            r rVar = AutoEvidenceRequestFragment.this.f95015t0;
            if (rVar == null) {
                rVar = null;
            }
            return (q) rVar.get();
        }
    }

    public AutoEvidenceRequestFragment() {
        super(0, 1, null);
        this.f95009n0 = new C35968w3(this);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f95016u0 = new O0(m0.f406844a.b(q.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C13389a c13389a = this.f95014s0;
        if (c13389a == null) {
            c13389a = null;
        }
        this.f95017v0 = registerForActivityResult(c13389a, new androidx.view.result.a() { // from class: com.avito.android.auto_evidence_request.a
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                com.avito.android.auto_evidence_request.files.b bVar;
                String string;
                Validation validation;
                String string2;
                Validation validation2;
                Q q12;
                String lastPathSegment;
                com.avito.android.auto_evidence_request.files.a aVar;
                String value;
                String value2;
                Object next;
                InterfaceC13293a interfaceC13293a = (InterfaceC13293a) obj;
                AutoEvidenceRequestFragment.a aVar2 = AutoEvidenceRequestFragment.f95007y0;
                boolean z12 = interfaceC13293a instanceof InterfaceC13293a.f;
                AutoEvidenceRequestFragment autoEvidenceRequestFragment = this.f95041b;
                if (!z12) {
                    if (interfaceC13293a instanceof InterfaceC13293a.e) {
                        autoEvidenceRequestFragment.q5().accept(interfaceC13293a);
                        return;
                    }
                    return;
                }
                ArrayList arrayList = autoEvidenceRequestFragment.f95019x0;
                com.avito.android.auto_evidence_request.files.a aVar3 = null;
                arrayList = null;
                ArrayList arrayList2 = null;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (L.f(((com.avito.android.auto_evidence_request.files.b) next).f95116a, ((InterfaceC13293a.f) interfaceC13293a).f2507a)) {
                                break;
                            }
                        }
                    }
                    bVar = (com.avito.android.auto_evidence_request.files.b) next;
                } else {
                    bVar = null;
                }
                InterfaceC13293a.f fVar = (InterfaceC13293a.f) interfaceC13293a;
                Uri uri = fVar.f2508b;
                if (uri != null) {
                    com.avito.android.auto_evidence_request.files.e eVar = com.avito.android.auto_evidence_request.files.e.f95121a;
                    Context contextRequireContext = autoEvidenceRequestFragment.requireContext();
                    eVar.getClass();
                    String type = contextRequireContext.getContentResolver().getType(uri);
                    Cursor cursorQuery = contextRequireContext.getContentResolver().query(uri, null, null, null, null, null);
                    if (cursorQuery != null) {
                        Cursor cursor = cursorQuery;
                        try {
                            Cursor cursor2 = cursor;
                            int columnIndex = cursor2.getColumnIndex("_display_name");
                            int columnIndex2 = cursor2.getColumnIndex("_size");
                            q12 = (!cursor2.moveToFirst() || columnIndex < 0 || columnIndex2 < 0) ? null : new Q(cursor2.getString(columnIndex), Long.valueOf(cursor2.getLong(columnIndex2)));
                            kotlin.io.c.a(cursor, null);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                kotlin.io.c.a(cursor, th2);
                                throw th3;
                            }
                        }
                    } else {
                        q12 = null;
                    }
                    if (q12 == null || (lastPathSegment = (String) q12.f406619b) == null) {
                        lastPathSegment = uri.getLastPathSegment();
                    }
                    Long l12 = q12 != null ? (Long) q12.f406620c : null;
                    boolean z13 = true;
                    if (bVar == null) {
                        aVar = new com.avito.android.auto_evidence_request.files.a(true, true, lastPathSegment, com.avito.android.auto_evidence_request.files.e.a(l12));
                    } else {
                        Validation validation3 = bVar.f95117b;
                        if (validation3 != null && (value2 = validation3.getValue()) != null) {
                            List listF0 = C43066x.f0(C43066x.a0(C43066x.a0(C43066x.a0(value2, "[", "", false), "]", "", false), "\"", "", false), new String[]{","}, 0, 6);
                            ArrayList arrayList3 = new ArrayList(C42745f0.q(listF0, 10));
                            Iterator it2 = listF0.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(C43066x.A0((String) it2.next()).toString());
                            }
                            arrayList2 = arrayList3;
                        }
                        Validation validation4 = bVar.f95118c;
                        boolean z14 = l12 != null && l12.longValue() <= ((validation4 == null || (value = validation4.getValue()) == null) ? 0L : Long.parseLong(value));
                        if (arrayList2 != null && !C42745f0.r(arrayList2, type)) {
                            z13 = false;
                        }
                        aVar = new com.avito.android.auto_evidence_request.files.a(z14, z13, lastPathSegment, com.avito.android.auto_evidence_request.files.e.a(l12));
                    }
                    aVar3 = aVar;
                }
                String str = fVar.f2507a;
                if (aVar3 == null) {
                    q qVarQ5 = autoEvidenceRequestFragment.q5();
                    String string3 = fVar.f2509c;
                    if (string3 == null) {
                        string3 = autoEvidenceRequestFragment.getString(R.string.auto_evidence_request_error_loading_file);
                    }
                    qVarQ5.accept(new InterfaceC13293a.e(str, string3));
                }
                if (aVar3 != null) {
                    boolean z15 = aVar3.f95113b;
                    boolean z16 = aVar3.f95112a;
                    if (z16 && z15) {
                        autoEvidenceRequestFragment.q5().accept(interfaceC13293a);
                        autoEvidenceRequestFragment.q5().accept(new InterfaceC13293a.d(str, aVar3.f95114c, aVar3.f95115d));
                        return;
                    }
                    if (!z16) {
                        if (bVar == null || (validation2 = bVar.f95118c) == null || (string2 = validation2.getMessage()) == null) {
                            string2 = autoEvidenceRequestFragment.getString(R.string.auto_evidence_request_error_loading_file);
                        }
                        autoEvidenceRequestFragment.q5().accept(new InterfaceC13293a.e(str, string2));
                        return;
                    }
                    if (z15) {
                        return;
                    }
                    if (bVar == null || (validation = bVar.f95117b) == null || (string = validation.getMessage()) == null) {
                        string = autoEvidenceRequestFragment.getString(R.string.auto_evidence_request_error_loading_file);
                    }
                    autoEvidenceRequestFragment.q5().accept(new InterfaceC13293a.e(str, string));
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.auto_evidence_request_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.j jVar = this.f95010o0;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f95011p0;
        if (aVar == null) {
            aVar = null;
        }
        this.f95018w0 = new p(view, aVar, jVar);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new b(null), 3);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        d.a aVarA = com.avito.android.auto_evidence_request.di.l.a();
        com.avito.android.auto_evidence_request.di.e eVar = (com.avito.android.auto_evidence_request.di.e) C29972i.a(C29972i.b(this), com.avito.android.auto_evidence_request.di.e.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        c cVar = new c();
        kotlin.reflect.n<Object>[] nVarArr = f95008z0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        C35968w3 c35968w3 = this.f95009n0;
        aVarA.a(eVar, interfaceC39417aB, cVar, this, ((AutoEvidenceRequestOpenParams) c35968w3.getValue(this, nVar)).f95038c, ((AutoEvidenceRequestOpenParams) c35968w3.getValue(this, nVarArr[0])).f95039d, ((AutoEvidenceRequestOpenParams) c35968w3.getValue(this, nVarArr[0])).f95037b, bundle != null).a(this);
    }

    public final q q5() {
        return (q) this.f95016u0.getValue();
    }

    public final void r5(String str) {
        if (str == null || C43066x.K(str)) {
            return;
        }
        com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, this, com.avito.android.printable_text.b.f(str), null, null, null, 0, null, 1022);
    }
}
