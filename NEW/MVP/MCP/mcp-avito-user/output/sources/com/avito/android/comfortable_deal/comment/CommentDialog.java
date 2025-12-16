package com.avito.android.comfortable_deal.comment;

import Cd.C13243a;
import Y41.p;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.comfortable_deal.ComfortableDealCommentScreen;
import com.avito.android.comfortable_deal.comment.model.CommentArguments;
import com.avito.android.comfortable_deal.comment.model.CommentResult;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.L5;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import lp.C43812a;
import mp.InterfaceC44113a;
import mp.InterfaceC44115c;
import mp.InterfaceC44117e;
import z1.AbstractC50339a;

/* compiled from: CommentDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/comment/CommentDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CommentDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final a f120477l0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.comfortable_deal.comment.h f120478h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f120479i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f120480j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.comfortable_deal.comment.d f120481k0;

    /* compiled from: CommentDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/comment/CommentDialog$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: CommentDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.comfortable_deal.comment.CommentDialog$a$a, reason: collision with other inner class name */
        public static final class C3540a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ CommentArguments f120482l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3540a(CommentArguments commentArguments) {
                super(1);
                this.f120482l = commentArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("COMMENT_ARGUMENTS", this.f120482l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static CommentDialog a(@Y61.k CommentArguments commentArguments) {
            CommentDialog commentDialog = new CommentDialog();
            C35966w1.a(commentDialog, -1, new C3540a(commentArguments));
            return commentDialog;
        }

        public a() {
        }
    }

    /* compiled from: CommentDialog.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/comfortable_deal/comment/CommentDialog$b", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.lib.design.bottom_sheet.d {
        public b(Context context) {
            super(context, 0, 2, null);
        }

        @Override // androidx.view.r, android.app.Dialog
        @InterfaceC42830m
        public final void onBackPressed() {
            ((com.avito.android.comfortable_deal.comment.g) CommentDialog.this.f120479i0.getValue()).accept(InterfaceC44113a.b.f414749a);
            super.onBackPressed();
        }
    }

    /* compiled from: CommentDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            ((com.avito.android.comfortable_deal.comment.b) this.receiver).a(view);
            return G0.f406611a;
        }
    }

    /* compiled from: CommentDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            ((com.avito.android.comfortable_deal.comment.b) this.receiver).b(view);
            return G0.f406611a;
        }
    }

    /* compiled from: CommentDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ((com.avito.android.comfortable_deal.comment.g) CommentDialog.this.f120479i0.getValue()).accept(InterfaceC44113a.b.f414749a);
            return G0.f406611a;
        }
    }

    /* compiled from: CommentDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.comment.CommentDialog$onCreateDialog$2$4", f = "CommentDialog.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f120485q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b f120486r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ CommentDialog f120487s;

        /* compiled from: CommentDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.comfortable_deal.comment.CommentDialog$onCreateDialog$2$4$1", f = "CommentDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f120488q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ CommentDialog f120489r;

            /* compiled from: CommentDialog.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.comfortable_deal.comment.CommentDialog$onCreateDialog$2$4$1$1", f = "CommentDialog.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.comfortable_deal.comment.CommentDialog$f$a$a, reason: collision with other inner class name */
            public static final class C3541a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f120490q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CommentDialog f120491r;

                /* compiled from: CommentDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.comfortable_deal.comment.CommentDialog$f$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C3542a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.comfortable_deal.comment.b f120492b;

                    public C3542a(com.avito.android.comfortable_deal.comment.b bVar) {
                        this.f120492b = bVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f120492b.c((InterfaceC44117e) obj);
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
                        return new C42801a(2, this.f120492b, com.avito.android.comfortable_deal.comment.b.class, "renderState", "renderState(Lcom/avito/android/comfortable_deal/comment/mvi/entity/CommentViewState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.comfortable_deal.comment.CommentDialog$f$a$a$b */
                public static final class b implements InterfaceC43160i<InterfaceC44117e> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n2 f120493b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ C43812a f120494c;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.comfortable_deal.comment.CommentDialog$f$a$a$b$a, reason: collision with other inner class name */
                    public static final class C3543a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f120495b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ C43812a f120496c;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.comfortable_deal.comment.CommentDialog$onCreateDialog$2$4$1$1$invokeSuspend$$inlined$map$1$2", f = "CommentDialog.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.comfortable_deal.comment.CommentDialog$f$a$a$b$a$a, reason: collision with other inner class name */
                        public static final class C3544a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f120497q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f120498r;

                            public C3544a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@Y61.k Object obj) {
                                this.f120497q = obj;
                                this.f120498r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C3543a.this.emit(null, this);
                            }
                        }

                        public C3543a(InterfaceC43172j interfaceC43172j, C43812a c43812a) {
                            this.f120495b = interfaceC43172j;
                            this.f120496c = c43812a;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.InterfaceC43172j
                        @Y61.l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof com.avito.android.comfortable_deal.comment.CommentDialog.f.a.C3541a.b.C3543a.C3544a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.comfortable_deal.comment.CommentDialog$f$a$a$b$a$a r0 = (com.avito.android.comfortable_deal.comment.CommentDialog.f.a.C3541a.b.C3543a.C3544a) r0
                                int r1 = r0.f120498r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f120498r = r1
                                goto L18
                            L13:
                                com.avito.android.comfortable_deal.comment.CommentDialog$f$a$a$b$a$a r0 = new com.avito.android.comfortable_deal.comment.CommentDialog$f$a$a$b$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f120497q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f120498r
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.C42729a0.b(r6)
                                goto L62
                            L29:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L31:
                                kotlin.C42729a0.b(r6)
                                mp.d r5 = (mp.C44116d) r5
                                lp.a r6 = r4.f120496c
                                r6.getClass()
                                boolean r6 = r5.f414759b
                                if (r6 == 0) goto L42
                                mp.e$b r5 = mp.InterfaceC44117e.b.f414764a
                                goto L57
                            L42:
                                mp.e$a r6 = new mp.e$a
                                java.lang.String r5 = r5.f414761d
                                if (r5 == 0) goto L51
                                boolean r2 = kotlin.text.C43066x.K(r5)
                                if (r2 == 0) goto L4f
                                goto L51
                            L4f:
                                r2 = 0
                                goto L52
                            L51:
                                r2 = r3
                            L52:
                                r2 = r2 ^ r3
                                r6.<init>(r5, r2)
                                r5 = r6
                            L57:
                                r0.f120498r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f120495b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L62
                                return r1
                            L62:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.comment.CommentDialog.f.a.C3541a.b.C3543a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public b(n2 n2Var, C43812a c43812a) {
                        this.f120493b = n2Var;
                        this.f120494c = c43812a;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC44117e> interfaceC43172j, @Y61.k Continuation continuation) {
                        Object objCollect = this.f120493b.collect(new C3543a(interfaceC43172j, this.f120494c), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3541a(CommentDialog commentDialog, Continuation<? super C3541a> continuation) {
                    super(2, continuation);
                    this.f120491r = commentDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3541a(this.f120491r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3541a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f120490q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        CommentDialog commentDialog = this.f120491r;
                        InterfaceC43160i interfaceC43160iR = C43175k.r(new b(((com.avito.android.comfortable_deal.comment.g) commentDialog.f120479i0.getValue()).getState(), C43812a.f414214a));
                        com.avito.android.comfortable_deal.comment.d dVar = commentDialog.f120481k0;
                        if (dVar == null) {
                            dVar = null;
                        }
                        C3542a c3542a = new C3542a(dVar);
                        this.f120490q = 1;
                        if (interfaceC43160iR.collect(c3542a, this) == coroutine_suspended) {
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

            /* compiled from: CommentDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.comfortable_deal.comment.CommentDialog$onCreateDialog$2$4$1$2", f = "CommentDialog.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f120500q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CommentDialog f120501r;

                /* compiled from: CommentDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.comfortable_deal.comment.CommentDialog$f$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C3545a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CommentDialog f120502b;

                    public C3545a(CommentDialog commentDialog) {
                        this.f120502b = commentDialog;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC44115c interfaceC44115c = (InterfaceC44115c) obj;
                        a aVar = CommentDialog.f120477l0;
                        CommentDialog commentDialog = this.f120502b;
                        if (interfaceC44115c instanceof InterfaceC44115c.a) {
                            CommentResult commentResult = ((InterfaceC44115c.a) interfaceC44115c).f414756a;
                            FragmentManager parentFragmentManager = commentDialog.getParentFragmentManager();
                            CommentArguments commentArguments = (CommentArguments) commentDialog.requireArguments().getParcelable("COMMENT_ARGUMENTS");
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("result.key", commentResult);
                            G0 g02 = G0.f406611a;
                            parentFragmentManager.o0(bundle, commentArguments.f120534b);
                            commentDialog.dismiss();
                        } else if (interfaceC44115c instanceof InterfaceC44115c.b) {
                            String strK0 = ((InterfaceC44115c.b) interfaceC44115c).f414757a.k0(commentDialog.requireContext());
                            Context context = commentDialog.getContext();
                            if (context != null) {
                                L5.b(context, strK0, 0);
                            }
                        }
                        G0 g03 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g03;
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
                        return new C42801a(2, this.f120502b, CommentDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/comfortable_deal/comment/mvi/entity/CommentOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(CommentDialog commentDialog, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f120501r = commentDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f120501r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f120500q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        CommentDialog commentDialog = this.f120501r;
                        InterfaceC43160i<InterfaceC44115c> events = ((com.avito.android.comfortable_deal.comment.g) commentDialog.f120479i0.getValue()).getEvents();
                        C3545a c3545a = new C3545a(commentDialog);
                        this.f120500q = 1;
                        if (events.collect(c3545a, this) == coroutine_suspended) {
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
            public a(CommentDialog commentDialog, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f120489r = commentDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f120489r, continuation);
                aVar.f120488q = obj;
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
                T t12 = (T) this.f120488q;
                CommentDialog commentDialog = this.f120489r;
                C43259k.d(t12, null, null, new C3541a(commentDialog, null), 3);
                C43259k.d(t12, null, null, new b(commentDialog, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b bVar, CommentDialog commentDialog, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f120486r = bVar;
            this.f120487s = commentDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new f(this.f120486r, this.f120487s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f120485q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                a aVar = new a(this.f120487s, null);
                this.f120485q = 1;
                if (C23056p0.b(this.f120486r, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: CommentDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmp/a;", "it", "Lkotlin/G0;", "invoke", "(Lmp/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<InterfaceC44113a, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC44113a interfaceC44113a) {
            ((com.avito.android.comfortable_deal.comment.g) CommentDialog.this.f120479i0.getValue()).accept(interfaceC44113a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f120504l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f120504l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f120504l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CommentDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f120506l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f120506l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f120506l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f120507l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f120507l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f120507l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f120508l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f120508l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f120508l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CommentDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/comment/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/comfortable_deal/comment/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.comfortable_deal.comment.g> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.comfortable_deal.comment.g invoke() {
            com.avito.android.comfortable_deal.comment.h hVar = CommentDialog.this.f120478h0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.comfortable_deal.comment.g) hVar.get();
        }
    }

    public CommentDialog() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f120479i0 = new O0(m0.f406844a.b(com.avito.android.comfortable_deal.comment.g.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.comfortable_deal.comment.di.c.a().a((com.avito.android.comfortable_deal.di.a) C29972i.a(C29972i.b(this), com.avito.android.comfortable_deal.di.a.class), new C28478k(ComfortableDealCommentScreen.f119737d, s.b(this), null, 4, null), (CommentArguments) requireArguments().getParcelable("COMMENT_ARGUMENTS"), new g()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f120480j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f120480j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        b bVar = new b(requireContext());
        com.avito.android.comfortable_deal.comment.d dVar = this.f120481k0;
        c cVar = new c(1, dVar != null ? dVar : null, com.avito.android.comfortable_deal.comment.b.class, "attachContentView", "attachContentView(Landroid/view/View;)V", 0);
        com.avito.android.comfortable_deal.comment.d dVar2 = this.f120481k0;
        bVar.B(R.layout.comment_dialog, R.layout.common_comment_dialog_footer, cVar, new d(1, dVar2 != null ? dVar2 : null, com.avito.android.comfortable_deal.comment.b.class, "attachFooterView", "attachFooterView(Landroid/view/View;)V", 0), false);
        com.avito.android.lib.design.bottom_sheet.d.M(bVar, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(bVar, true);
        bVar.f178527u = true;
        bVar.R(new e());
        C43259k.d(C22981N.a(bVar.getLifecycle()), null, null, new f(bVar, this, null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f120480j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return bVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.avito.android.comfortable_deal.comment.d dVar = this.f120481k0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.f120512b = null;
        dVar.f120513c = null;
    }
}
