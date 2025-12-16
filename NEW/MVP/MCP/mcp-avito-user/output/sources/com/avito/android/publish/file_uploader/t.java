package com.avito.android.publish.file_uploader;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.mandatory_verification.items.uploader.a;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.InterfaceC33678b;
import com.avito.android.publish.details.ItemDetailsView;
import com.avito.android.publish.details.S0;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.publish.details.w2;
import com.avito.android.remote.model.category_parameters.FileState;
import com.avito.android.remote.model.category_parameters.FileUploadApiConfig;
import com.avito.android.remote.model.category_parameters.FileUploadApiValue;
import com.avito.android.remote.model.category_parameters.FileUploadParameterValue;
import com.avito.android.remote.model.category_parameters.FileUploaderParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import fe0.C40408a;
import fe0.InterfaceC40409b;
import io.reactivex.rxjava3.internal.operators.observable.C41957i0;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: FileUploaderViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/file_uploader/t;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/publish/details/w2;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class t extends M0 implements w2 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f235707E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final S0 f235708J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33678b f235709K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33853a f235710L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final o f235711M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f235712N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final R0 f235713O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C43238h f235714P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f235715Q;

    /* renamed from: R, reason: collision with root package name */
    public int f235716R;

    /* compiled from: FileUploaderViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            Q q12 = (Q) obj;
            t.le(t.this, (String) q12.f406619b, ((Boolean) q12.f406620c).booleanValue());
        }
    }

    /* compiled from: FileUploaderViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            Q q12 = (Q) obj;
            t.le(t.this, (String) q12.f406619b, ((Boolean) q12.f406620c).booleanValue());
        }
    }

    /* compiled from: FileUploaderViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.file_uploader.FileUploaderViewModel$3", f = "FileUploaderViewModel.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f235719q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.items.file_uploader_redesign.e f235720r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ t f235721s;

        /* compiled from: FileUploaderViewModel.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mandatory_verification/items/uploader/a$a;", "action", "Lkotlin/G0;", "emit", "(Lcom/avito/android/mandatory_verification/items/uploader/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f235722b;

            public a(t tVar) {
                this.f235722b = tVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                a.C5423a c5423a = (a.C5423a) obj;
                t.le(this.f235722b, c5423a.f184687a, c5423a.f184688b);
                return G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC43160i<com.avito.android.mandatory_verification.items.uploader.a> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f235723b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f235724b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.publish.file_uploader.FileUploaderViewModel$3$invokeSuspend$$inlined$filter$1$2", f = "FileUploaderViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.publish.file_uploader.t$c$b$a$a, reason: collision with other inner class name */
                public static final class C7104a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f235725q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f235726r;

                    public C7104a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f235725q = obj;
                        this.f235726r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j) {
                    this.f235724b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.publish.file_uploader.t.c.b.a.C7104a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.publish.file_uploader.t$c$b$a$a r0 = (com.avito.android.publish.file_uploader.t.c.b.a.C7104a) r0
                        int r1 = r0.f235726r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f235726r = r1
                        goto L18
                    L13:
                        com.avito.android.publish.file_uploader.t$c$b$a$a r0 = new com.avito.android.publish.file_uploader.t$c$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f235725q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f235726r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L46
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        r6 = r5
                        com.avito.android.mandatory_verification.items.uploader.a r6 = (com.avito.android.mandatory_verification.items.uploader.a) r6
                        boolean r6 = r6 instanceof com.avito.android.mandatory_verification.items.uploader.a.C5423a
                        if (r6 == 0) goto L46
                        r0.f235726r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f235724b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L46
                        return r1
                    L46:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.file_uploader.t.c.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(InterfaceC43160i interfaceC43160i) {
                this.f235723b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super com.avito.android.mandatory_verification.items.uploader.a> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f235723b.collect(new a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.file_uploader.t$c$c, reason: collision with other inner class name */
        public static final class C7105c implements InterfaceC43160i<a.C5423a> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f235728b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.publish.file_uploader.t$c$c$a */
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f235729b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.publish.file_uploader.FileUploaderViewModel$3$invokeSuspend$$inlined$map$1$2", f = "FileUploaderViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.publish.file_uploader.t$c$c$a$a, reason: collision with other inner class name */
                public static final class C7106a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f235730q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f235731r;

                    public C7106a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f235730q = obj;
                        this.f235731r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j) {
                    this.f235729b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.publish.file_uploader.t.c.C7105c.a.C7106a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.publish.file_uploader.t$c$c$a$a r0 = (com.avito.android.publish.file_uploader.t.c.C7105c.a.C7106a) r0
                        int r1 = r0.f235731r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f235731r = r1
                        goto L18
                    L13:
                        com.avito.android.publish.file_uploader.t$c$c$a$a r0 = new com.avito.android.publish.file_uploader.t$c$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f235730q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f235731r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        com.avito.android.mandatory_verification.items.uploader.a r5 = (com.avito.android.mandatory_verification.items.uploader.a) r5
                        com.avito.android.mandatory_verification.items.uploader.a$a r5 = (com.avito.android.mandatory_verification.items.uploader.a.C5423a) r5
                        r0.f235731r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f235729b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.file_uploader.t.c.C7105c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public C7105c(b bVar) {
                this.f235728b = bVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super a.C5423a> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f235728b.collect(new a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.publish.items.file_uploader_redesign.e eVar, t tVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f235720r = eVar;
            this.f235721s = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(this.f235720r, this.f235721s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f235719q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C7105c c7105c = new C7105c(new b(this.f235720r.getF236837c()));
                t tVar = this.f235721s;
                InterfaceC43160i interfaceC43160iI = C43175k.I(tVar.f235713O.b(), c7105c);
                a aVar = new a(tVar);
                this.f235719q = 1;
                if (interfaceC43160iI.collect(aVar, this) == coroutine_suspended) {
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

    @Inject
    public t(@Y61.k com.avito.android.publish.items.file_uploader.d dVar, @Y61.k com.avito.android.publish.slots.cpa_ddu_upload.e eVar, @Y61.k com.avito.android.publish.items.file_uploader_redesign.e eVar2, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k S0 s02, @Y61.k InterfaceC33678b interfaceC33678b, @Y61.k InterfaceC33853a interfaceC33853a, @Y61.k o oVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k R0 r02) {
        this.f235707E = interfaceC33535v;
        this.f235708J = s02;
        this.f235709K = interfaceC33678b;
        this.f235710L = interfaceC33853a;
        this.f235711M = oVar;
        this.f235712N = interfaceC35745a5;
        this.f235713O = r02;
        C43238h c43238hA = U.a(r02.a());
        this.f235714P = c43238hA;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f235715Q = cVar;
        cVar.b(dVar.getF236813e().x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).t0(new a()));
        cVar.b(eVar.getF243358e().x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).t0(new b()));
        C43259k.d(c43238hA, null, null, new c(eVar2, this, null), 3);
    }

    public static final void ke(t tVar, InterfaceC40409b interfaceC40409b) {
        tVar.getClass();
        boolean z12 = interfaceC40409b instanceof InterfaceC40409b.c;
        o oVar = tVar.f235711M;
        InterfaceC33678b interfaceC33678b = tVar.f235709K;
        if (z12) {
            InterfaceC40409b.c cVar = (InterfaceC40409b.c) interfaceC40409b;
            FileUploaderParameter fileUploaderParameterNe = tVar.ne();
            List<? extends FileUploadParameterValue> value = fileUploaderParameterNe.getValue();
            if (value == null) {
                value = C42784z0.f406748b;
            }
            C40408a c40408a = cVar.f395997a;
            ArrayList arrayListI0 = C42745f0.i0(new FileUploadParameterValue(c40408a.f395990b, c40408a.f395993e, c40408a.f395992d, Long.valueOf(c40408a.f395991c), pe(cVar), Boolean.FALSE), value);
            if (!L.f(fileUploaderParameterNe.getValue(), arrayListI0)) {
                fileUploaderParameterNe.setValue(arrayListI0);
                fileUploaderParameterNe.setError(null);
            }
            interfaceC33678b.B9(PublishDetailsFlowTracker.FlowContext.f233438d);
            oVar.a(0.0f, cVar.f395997a.f395990b);
            return;
        }
        if (interfaceC40409b instanceof InterfaceC40409b.d) {
            InterfaceC40409b.d dVar = (InterfaceC40409b.d) interfaceC40409b;
            oVar.a(dVar.f396002b, dVar.f396001a);
            return;
        }
        if (interfaceC40409b instanceof InterfaceC40409b.e) {
            InterfaceC40409b.e eVar = (InterfaceC40409b.e) interfaceC40409b;
            oVar.a(1.0f, eVar.f396003a);
            FileUploaderParameter fileUploaderParameterNe2 = tVar.ne();
            List<? extends FileUploadParameterValue> value2 = fileUploaderParameterNe2.getValue();
            if (value2 == null) {
                value2 = C42784z0.f406748b;
            }
            List<? extends FileUploadParameterValue> list = value2;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (FileUploadParameterValue fileUploadParameterValueCopy$default : list) {
                if (L.f(fileUploadParameterValueCopy$default.getId(), eVar.f396003a)) {
                    fileUploadParameterValueCopy$default = FileUploadParameterValue.copy$default(fileUploadParameterValueCopy$default, eVar.f396004b.getId(), null, null, null, pe(eVar), Boolean.TRUE, 14, null);
                }
                arrayList.add(fileUploadParameterValueCopy$default);
            }
            if (!L.f(fileUploaderParameterNe2.getValue(), arrayList)) {
                fileUploaderParameterNe2.setValue(arrayList);
                fileUploaderParameterNe2.setError(null);
            }
            interfaceC33678b.B9(PublishDetailsFlowTracker.FlowContext.f233438d);
            return;
        }
        if (interfaceC40409b instanceof InterfaceC40409b.a) {
            tVar.me(((InterfaceC40409b.a) interfaceC40409b).f395994a);
            return;
        }
        if (interfaceC40409b instanceof InterfaceC40409b.C11163b) {
            InterfaceC40409b.C11163b c11163b = (InterfaceC40409b.C11163b) interfaceC40409b;
            FileUploaderParameter fileUploaderParameterNe3 = tVar.ne();
            List<? extends FileUploadParameterValue> value3 = fileUploaderParameterNe3.getValue();
            if (value3 == null) {
                value3 = C42784z0.f406748b;
            }
            List<? extends FileUploadParameterValue> list2 = value3;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            for (FileUploadParameterValue fileUploadParameterValueCopy$default2 : list2) {
                if (L.f(fileUploadParameterValueCopy$default2.getId(), c11163b.f395995a)) {
                    fileUploadParameterValueCopy$default2 = FileUploadParameterValue.copy$default(fileUploadParameterValueCopy$default2, c11163b.f395995a, null, null, null, pe(c11163b), null, 46, null);
                }
                arrayList2.add(fileUploadParameterValueCopy$default2);
            }
            if (!L.f(fileUploaderParameterNe3.getValue(), arrayList2)) {
                fileUploaderParameterNe3.setValue(arrayList2);
                fileUploaderParameterNe3.setError(null);
            }
            interfaceC33678b.B9(PublishDetailsFlowTracker.FlowContext.f233438d);
        }
    }

    public static final void le(t tVar, String str, boolean z12) {
        FileUploaderParameter.Widget.Config config;
        FileUploadApiConfig api;
        if (!z12) {
            tVar.me(str);
            return;
        }
        FileUploaderParameter.Widget widget = tVar.ne().getWidget();
        FileUploadApiValue remove = (widget == null || (config = widget.getConfig()) == null || (api = config.getApi()) == null) ? null : api.getRemove();
        String path = remove != null ? remove.getPath() : null;
        String defaultErrorMessage = remove != null ? remove.getDefaultErrorMessage() : null;
        if (path == null || defaultErrorMessage == null) {
            tVar.qe(path == null ? "removeFilePath" : "errorMessage");
            return;
        }
        I0 i0C = tVar.f235710L.c(str, defaultErrorMessage, path);
        InterfaceC35745a5 interfaceC35745a5 = tVar.f235712N;
        tVar.f235715Q.b(i0C.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new u(tVar), new v(tVar, str, defaultErrorMessage), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public static FileState pe(InterfaceC40409b interfaceC40409b) {
        FileState error;
        if (interfaceC40409b instanceof InterfaceC40409b.c.C11164b) {
            return new FileState.Loading(0.0f);
        }
        if (interfaceC40409b instanceof InterfaceC40409b.c.a) {
            error = new FileState.Error(((InterfaceC40409b.c.a) interfaceC40409b).f395999c);
        } else if (interfaceC40409b instanceof InterfaceC40409b.d) {
            error = new FileState.Loading(((InterfaceC40409b.d) interfaceC40409b).f396002b);
        } else {
            if (interfaceC40409b instanceof InterfaceC40409b.e) {
                return FileState.Idle.INSTANCE;
            }
            if (interfaceC40409b instanceof InterfaceC40409b.a) {
                return FileState.Idle.INSTANCE;
            }
            if (!(interfaceC40409b instanceof InterfaceC40409b.C11163b)) {
                throw new NoWhenBranchMatchedException();
            }
            error = new FileState.Error(((InterfaceC40409b.C11163b) interfaceC40409b).f395996b);
        }
        return error;
    }

    @Override // com.avito.android.publish.details.w2
    public final void e0() {
        this.f235715Q.e();
        U.b(this.f235714P, null);
    }

    public final void me(String str) {
        FileUploaderParameter fileUploaderParameterNe = ne();
        List<? extends FileUploadParameterValue> value = fileUploaderParameterNe.getValue();
        if (value == null) {
            value = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (!L.f(((FileUploadParameterValue) obj).getId(), str)) {
                arrayList.add(obj);
            }
        }
        if (!L.f(fileUploaderParameterNe.getValue(), arrayList)) {
            fileUploaderParameterNe.setValue(arrayList);
            fileUploaderParameterNe.setError(null);
        }
        this.f235709K.B9(PublishDetailsFlowTracker.FlowContext.f233438d);
    }

    public final FileUploaderParameter ne() {
        ParametersTree parametersTreeWa = this.f235708J.wa();
        FileUploaderParameter fileUploaderParameter = parametersTreeWa != null ? (FileUploaderParameter) parametersTreeWa.getFirstParameterOfType(FileUploaderParameter.class) : null;
        if (fileUploaderParameter != null) {
            return fileUploaderParameter;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void oe(@Y61.k ArrayList arrayList) {
        List<? extends FileUploadParameterValue> value = ne().getValue();
        this.f235716R = value != null ? value.size() : 0;
        C41957i0 c41957i0X = io.reactivex.rxjava3.core.z.X(arrayList);
        InterfaceC35745a5 interfaceC35745a5 = this.f235712N;
        this.f235715Q.b(c41957i0X.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).K(new y(this)).s0());
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void qe(String str) {
        InterfaceC33535v.a.b(this.f235707E, "FileUploader widget configuration contains errors", new IllegalArgumentException(AK.c.k("Required ", str, " was null.")), 4);
    }

    @Override // com.avito.android.publish.details.w2
    public final void p2(@Y61.k ItemDetailsView itemDetailsView) {
    }
}
