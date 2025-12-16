package com.avito.android.mortgage.document_upload.interactor;

import Y41.p;
import android.content.ContentResolver;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.J0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.di.B;
import com.avito.android.mortgage.document_upload.mvi.entity.DocumentUploadInternalAction;
import com.avito.android.util.R0;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import d00.C39479c;
import d00.d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.t1;

/* compiled from: FilesInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/document_upload/interactor/f;", "", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@B
/* loaded from: classes15.dex */
public final class f {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f199229g = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f199230a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ContentResolver f199231b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.document_upload.interactor.d f199232c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f199233d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f199234e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap f199235f = new ConcurrentHashMap();

    /* compiled from: FilesInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mortgage/document_upload/interactor/f$a;", "", "<init>", "()V", "", "UPDATE_STATUS_DELAY_MS", "J", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FilesInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$filterAndAddFiles$1", f = "FilesInteractor.kt", i = {0, 0, 1, 1}, l = {82, 91, 94}, m = "invokeSuspend", n = {"$this$channelFlow", "filteredFiles", "$this$channelFlow", "filteredFiles"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class b extends SuspendLambda implements p<I0<? super DocumentUploadInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ String f199236A;

        /* renamed from: q, reason: collision with root package name */
        public List f199237q;

        /* renamed from: r, reason: collision with root package name */
        public int f199238r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f199239s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List<Uri> f199240t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f199241u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f199242v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ f f199243w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f199244x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f199245y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f199246z;

        /* compiled from: FilesInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$filterAndAddFiles$1$2", f = "FilesInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f199247q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ List<C39479c> f199248r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ f f199249s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f199250t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ String f199251u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f199252v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ String f199253w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ I0<DocumentUploadInternalAction> f199254x;

            /* compiled from: FilesInteractor.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$filterAndAddFiles$1$2$1$uploadingJob$1", f = "FilesInteractor.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$b$a$a, reason: collision with other inner class name */
            public static final class C5876a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f199255q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ f f199256r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ C39479c f199257s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ String f199258t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ String f199259u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ String f199260v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ String f199261w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ I0<DocumentUploadInternalAction> f199262x;

                /* compiled from: FilesInteractor.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "it", "Lkotlin/G0;", "<anonymous>", "(Ld00/d;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$filterAndAddFiles$1$2$1$uploadingJob$1$1", f = "FilesInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$b$a$a$a, reason: collision with other inner class name */
                public static final class C5877a extends SuspendLambda implements p<d00.d, Continuation<? super G0>, Object> {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f199263q;

                    /* renamed from: r, reason: collision with root package name */
                    public final /* synthetic */ f f199264r;

                    /* renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ C39479c f199265s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C5877a(f fVar, C39479c c39479c, Continuation<? super C5877a> continuation) {
                        super(2, continuation);
                        this.f199264r = fVar;
                        this.f199265s = c39479c;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.k
                    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                        C5877a c5877a = new C5877a(this.f199264r, this.f199265s, continuation);
                        c5877a.f199263q = obj;
                        return c5877a;
                    }

                    @Override // Y41.p
                    public final Object invoke(d00.d dVar, Continuation<? super G0> continuation) {
                        return ((C5877a) create(dVar, continuation)).invokeSuspend(G0.f406611a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        C42729a0.b(obj);
                        this.f199264r.f199235f.put(Boxing.boxLong(this.f199265s.f393604a), (d00.d) this.f199263q);
                        return G0.f406611a;
                    }
                }

                /* compiled from: FilesInteractor.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "it", "Lkotlin/G0;", "<anonymous>", "(Ld00/d;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$filterAndAddFiles$1$2$1$uploadingJob$1$2", f = "FilesInteractor.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$b$a$a$b, reason: collision with other inner class name */
                public static final class C5878b extends SuspendLambda implements p<d00.d, Continuation<? super G0>, Object> {

                    /* renamed from: q, reason: collision with root package name */
                    public int f199266q;

                    public C5878b() {
                        throw null;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.k
                    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                        return new C5878b(2, continuation);
                    }

                    @Override // Y41.p
                    public final Object invoke(d00.d dVar, Continuation<? super G0> continuation) {
                        return ((C5878b) create(dVar, continuation)).invokeSuspend(G0.f406611a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i12 = this.f199266q;
                        if (i12 == 0) {
                            C42729a0.b(obj);
                            this.f199266q = 1;
                            if (C43131e0.b(200L, this) == coroutine_suspended) {
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

                /* compiled from: FilesInteractor.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$FileUpdated;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$FileUpdated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$b$a$a$c */
                public static final class c<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ I0<DocumentUploadInternalAction> f199267b;

                    /* JADX WARN: Multi-variable type inference failed */
                    public c(I0<? super DocumentUploadInternalAction> i02) {
                        this.f199267b = i02;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        Object objSend = this.f199267b.send((DocumentUploadInternalAction.FileUpdated) obj, continuation);
                        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : G0.f406611a;
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$b$a$a$d */
                public static final class d implements InterfaceC43160i<C39479c> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ C43197r1 f199268b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ C39479c f199269c;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$b$a$a$d$a, reason: collision with other inner class name */
                    public static final class C5879a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f199270b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ C39479c f199271c;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$filterAndAddFiles$1$2$1$uploadingJob$1$invokeSuspend$$inlined$map$1$2", f = "FilesInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$b$a$a$d$a$a, reason: collision with other inner class name */
                        public static final class C5880a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f199272q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f199273r;

                            public C5880a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@Y61.k Object obj) {
                                this.f199272q = obj;
                                this.f199273r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C5879a.this.emit(null, this);
                            }
                        }

                        public C5879a(InterfaceC43172j interfaceC43172j, C39479c c39479c) {
                            this.f199270b = interfaceC43172j;
                            this.f199271c = c39479c;
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
                                boolean r0 = r6 instanceof com.avito.android.mortgage.document_upload.interactor.f.b.a.C5876a.d.C5879a.C5880a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.mortgage.document_upload.interactor.f$b$a$a$d$a$a r0 = (com.avito.android.mortgage.document_upload.interactor.f.b.a.C5876a.d.C5879a.C5880a) r0
                                int r1 = r0.f199273r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f199273r = r1
                                goto L18
                            L13:
                                com.avito.android.mortgage.document_upload.interactor.f$b$a$a$d$a$a r0 = new com.avito.android.mortgage.document_upload.interactor.f$b$a$a$d$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f199272q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f199273r
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.C42729a0.b(r6)
                                goto L47
                            L29:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L31:
                                kotlin.C42729a0.b(r6)
                                d00.d r5 = (d00.d) r5
                                d00.c r6 = r4.f199271c
                                d00.c r5 = d00.C39479c.a(r6, r5)
                                r0.f199273r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f199270b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L47
                                return r1
                            L47:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.document_upload.interactor.f.b.a.C5876a.d.C5879a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public d(C43197r1 c43197r1, C39479c c39479c) {
                        this.f199268b = c43197r1;
                        this.f199269c = c39479c;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@Y61.k InterfaceC43172j<? super C39479c> interfaceC43172j, @Y61.k Continuation continuation) {
                        Object objCollect = this.f199268b.collect(new C5879a(interfaceC43172j, this.f199269c), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$b$a$a$e */
                public static final class e implements InterfaceC43160i<DocumentUploadInternalAction.FileUpdated> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f199275b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$b$a$a$e$a, reason: collision with other inner class name */
                    public static final class C5881a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f199276b;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$filterAndAddFiles$1$2$1$uploadingJob$1$invokeSuspend$$inlined$map$2$2", f = "FilesInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$b$a$a$e$a$a, reason: collision with other inner class name */
                        public static final class C5882a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f199277q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f199278r;

                            public C5882a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@Y61.k Object obj) {
                                this.f199277q = obj;
                                this.f199278r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C5881a.this.emit(null, this);
                            }
                        }

                        public C5881a(InterfaceC43172j interfaceC43172j) {
                            this.f199276b = interfaceC43172j;
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
                                boolean r0 = r6 instanceof com.avito.android.mortgage.document_upload.interactor.f.b.a.C5876a.e.C5881a.C5882a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.mortgage.document_upload.interactor.f$b$a$a$e$a$a r0 = (com.avito.android.mortgage.document_upload.interactor.f.b.a.C5876a.e.C5881a.C5882a) r0
                                int r1 = r0.f199278r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f199278r = r1
                                goto L18
                            L13:
                                com.avito.android.mortgage.document_upload.interactor.f$b$a$a$e$a$a r0 = new com.avito.android.mortgage.document_upload.interactor.f$b$a$a$e$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f199277q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f199278r
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
                                d00.c r5 = (d00.C39479c) r5
                                com.avito.android.mortgage.document_upload.mvi.entity.DocumentUploadInternalAction$FileUpdated r6 = new com.avito.android.mortgage.document_upload.mvi.entity.DocumentUploadInternalAction$FileUpdated
                                r6.<init>(r5)
                                r0.f199278r = r3
                                kotlinx.coroutines.flow.j r5 = r4.f199276b
                                java.lang.Object r5 = r5.emit(r6, r0)
                                if (r5 != r1) goto L46
                                return r1
                            L46:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.document_upload.interactor.f.b.a.C5876a.e.C5881a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public e(d dVar) {
                        this.f199275b = dVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@Y61.k InterfaceC43172j<? super DocumentUploadInternalAction.FileUpdated> interfaceC43172j, @Y61.k Continuation continuation) {
                        Object objCollect = this.f199275b.collect(new C5881a(interfaceC43172j), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C5876a(f fVar, C39479c c39479c, String str, String str2, String str3, String str4, I0<? super DocumentUploadInternalAction> i02, Continuation<? super C5876a> continuation) {
                    super(2, continuation);
                    this.f199256r = fVar;
                    this.f199257s = c39479c;
                    this.f199258t = str;
                    this.f199259u = str2;
                    this.f199260v = str3;
                    this.f199261w = str4;
                    this.f199262x = i02;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C5876a(this.f199256r, this.f199257s, this.f199258t, this.f199259u, this.f199260v, this.f199261w, this.f199262x, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C5876a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f199255q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        f fVar = this.f199256r;
                        com.avito.android.mortgage.document_upload.interactor.d dVar = fVar.f199232c;
                        dVar.getClass();
                        InterfaceC43160i interfaceC43160iH = C43175k.h(new com.avito.android.mortgage.document_upload.interactor.c(this.f199257s, dVar, this.f199258t, this.f199259u, this.f199260v, this.f199261w, null));
                        C39479c c39479c = this.f199257s;
                        e eVar = new e(new d(new C43197r1(new C5878b(2, null), C43175k.c(new C43197r1(new C5877a(fVar, c39479c, null), interfaceC43160iH), -1, 2)), c39479c));
                        c cVar = new c(this.f199262x);
                        this.f199255q = 1;
                        if (eVar.collect(cVar, this) == coroutine_suspended) {
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
            /* JADX WARN: Multi-variable type inference failed */
            public a(List<C39479c> list, f fVar, String str, String str2, String str3, String str4, I0<? super DocumentUploadInternalAction> i02, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f199248r = list;
                this.f199249s = fVar;
                this.f199250t = str;
                this.f199251u = str2;
                this.f199252v = str3;
                this.f199253w = str4;
                this.f199254x = i02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f199248r, this.f199249s, this.f199250t, this.f199251u, this.f199252v, this.f199253w, this.f199254x, continuation);
                aVar.f199247q = obj;
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
                T t12 = (T) this.f199247q;
                for (C39479c c39479c : this.f199248r) {
                    f fVar = this.f199249s;
                    fVar.f199234e.put(Boxing.boxLong(c39479c.f393604a), C43259k.d(t12, fVar.f199233d.a(), null, new C5876a(fVar, c39479c, this.f199250t, this.f199251u, this.f199252v, this.f199253w, this.f199254x, null), 2));
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends Uri> list, int i12, long j12, f fVar, String str, String str2, String str3, String str4, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f199240t = list;
            this.f199241u = i12;
            this.f199242v = j12;
            this.f199243w = fVar;
            this.f199244x = str;
            this.f199245y = str2;
            this.f199246z = str3;
            this.f199236A = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f199240t, this.f199241u, this.f199242v, this.f199243w, this.f199244x, this.f199245y, this.f199246z, this.f199236A, continuation);
            bVar.f199239s = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(I0<? super DocumentUploadInternalAction> i02, Continuation<? super G0> continuation) {
            return ((b) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:55:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01a9 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 429
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.document_upload.interactor.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FilesInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$removeLocalFile$1", f = "FilesInteractor.kt", i = {0, 0}, l = {143, 151}, m = "invokeSuspend", n = {"$this$flow", "remoteDeleteSuccess"}, s = {"L$0", "L$1"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super DocumentUploadInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public l0.h f199280q;

        /* renamed from: r, reason: collision with root package name */
        public int f199281r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f199282s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C39479c f199284u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f199285v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f199286w;

        /* compiled from: FilesInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ l0.h<Boolean> f199287l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l0.h<Boolean> hVar) {
                super(0);
                this.f199287l = hVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Boolean] */
            @Override // Y41.a
            public final G0 invoke() {
                this.f199287l.f406842b = Boolean.FALSE;
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C39479c c39479c, String str, String str2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f199284u = c39479c;
            this.f199285v = str;
            this.f199286w = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = f.this.new c(this.f199284u, this.f199285v, this.f199286w, continuation);
            cVar.f199282s = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DocumentUploadInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
            /*
                r16 = this;
                r7 = r16
                java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r7.f199281r
                d00.c r1 = r7.f199284u
                r9 = 0
                r10 = 2
                r2 = 1
                com.avito.android.mortgage.document_upload.interactor.f r11 = com.avito.android.mortgage.document_upload.interactor.f.this
                long r12 = r1.f393604a
                if (r0 == 0) goto L2e
                if (r0 == r2) goto L24
                if (r0 != r10) goto L1c
                kotlin.C42729a0.b(r17)
                goto La5
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L24:
                kotlin.jvm.internal.l0$h r0 = r7.f199280q
                java.lang.Object r1 = r7.f199282s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r17)
                goto L84
            L2e:
                kotlin.C42729a0.b(r17)
                java.lang.Object r0 = r7.f199282s
                r14 = r0
                kotlinx.coroutines.flow.j r14 = (kotlinx.coroutines.flow.InterfaceC43172j) r14
                java.util.LinkedHashMap r0 = r11.f199234e
                java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r12)
                java.lang.Object r0 = r0.get(r1)
                kotlinx.coroutines.N0 r0 = (kotlinx.coroutines.N0) r0
                if (r0 == 0) goto L47
                r0.c(r9)
            L47:
                java.util.concurrent.ConcurrentHashMap r0 = r11.f199235f
                java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r12)
                java.lang.Object r0 = r0.get(r1)
                d00.d r0 = (d00.d) r0
                kotlin.jvm.internal.l0$h r15 = new kotlin.jvm.internal.l0$h
                r15.<init>()
                boolean r1 = r0 instanceof d00.d.b
                if (r1 == 0) goto L86
                d00.d$b r0 = (d00.d.b) r0
                com.avito.android.mortgage.api.model.RemoteFile r0 = r0.f393610a
                java.lang.String r3 = r0.getId()
                com.avito.android.mortgage.document_upload.interactor.f$c$a r5 = new com.avito.android.mortgage.document_upload.interactor.f$c$a
                r5.<init>(r15)
                r7.f199282s = r14
                r7.f199280q = r15
                r7.f199281r = r2
                java.lang.String r4 = r7.f199285v
                java.lang.String r6 = r7.f199286w
                com.avito.android.mortgage.document_upload.interactor.f r0 = com.avito.android.mortgage.document_upload.interactor.f.this
                r1 = r14
                r2 = r3
                r3 = r4
                r4 = r6
                r6 = r16
                java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5, r6)
                if (r0 != r8) goto L82
                return r8
            L82:
                r1 = r14
                r0 = r15
            L84:
                r15 = r0
                r14 = r1
            L86:
                T r0 = r15.f406842b
                r1 = 0
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
                boolean r0 = kotlin.jvm.internal.L.f(r0, r1)
                if (r0 != 0) goto Lae
                com.avito.android.mortgage.document_upload.mvi.entity.DocumentUploadInternalAction$LocalFileDeleted r0 = new com.avito.android.mortgage.document_upload.mvi.entity.DocumentUploadInternalAction$LocalFileDeleted
                r0.<init>(r12)
                r7.f199282s = r9
                r7.f199280q = r9
                r7.f199281r = r10
                java.lang.Object r0 = r14.emit(r0, r7)
                if (r0 != r8) goto La5
                return r8
            La5:
                java.util.concurrent.ConcurrentHashMap r0 = r11.f199235f
                java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r12)
                r0.remove(r1)
            Lae:
                java.util.LinkedHashMap r0 = r11.f199234e
                java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r12)
                r0.remove(r1)
                kotlin.G0 r0 = kotlin.G0.f406611a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.document_upload.interactor.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FilesInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$removeRemoteFile$1", f = "FilesInteractor.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super DocumentUploadInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f199288q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f199289r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f199291t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f199292u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f199293v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f199291t = str;
            this.f199292u = str2;
            this.f199293v = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = f.this.new d(this.f199291t, this.f199292u, this.f199293v, continuation);
            dVar.f199289r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DocumentUploadInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f199288q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f199289r;
                this.f199288q = 1;
                int i13 = f.f199229g;
                if (f.this.a(interfaceC43172j, this.f199291t, this.f199292u, this.f199293v, null, this) == coroutine_suspended) {
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

    /* compiled from: FilesInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$FileUpdated;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$retryFileUpload$1", f = "FilesInteractor.kt", i = {0}, l = {118, 120}, m = "invokeSuspend", n = {"$this$channelFlow"}, s = {"L$0"})
    public static final class e extends SuspendLambda implements p<I0<? super DocumentUploadInternalAction.FileUpdated>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f199294q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f199295r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C39479c f199296s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ f f199297t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f199298u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f199299v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f199300w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f199301x;

        /* compiled from: FilesInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$retryFileUpload$1$1", f = "FilesInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f199302q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ f f199303r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ C39479c f199304s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f199305t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ String f199306u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f199307v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ String f199308w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ I0<DocumentUploadInternalAction.FileUpdated> f199309x;

            /* compiled from: FilesInteractor.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$retryFileUpload$1$1$uploadingJob$1", f = "FilesInteractor.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$e$a$a, reason: collision with other inner class name */
            public static final class C5883a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f199310q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ f f199311r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ C39479c f199312s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ String f199313t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ String f199314u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ String f199315v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ String f199316w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ I0<DocumentUploadInternalAction.FileUpdated> f199317x;

                /* compiled from: FilesInteractor.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "it", "Lkotlin/G0;", "<anonymous>", "(Ld00/d;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$retryFileUpload$1$1$uploadingJob$1$1", f = "FilesInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$e$a$a$a, reason: collision with other inner class name */
                public static final class C5884a extends SuspendLambda implements p<d00.d, Continuation<? super G0>, Object> {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f199318q;

                    /* renamed from: r, reason: collision with root package name */
                    public final /* synthetic */ f f199319r;

                    /* renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ C39479c f199320s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C5884a(f fVar, C39479c c39479c, Continuation<? super C5884a> continuation) {
                        super(2, continuation);
                        this.f199319r = fVar;
                        this.f199320s = c39479c;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.k
                    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                        C5884a c5884a = new C5884a(this.f199319r, this.f199320s, continuation);
                        c5884a.f199318q = obj;
                        return c5884a;
                    }

                    @Override // Y41.p
                    public final Object invoke(d00.d dVar, Continuation<? super G0> continuation) {
                        return ((C5884a) create(dVar, continuation)).invokeSuspend(G0.f406611a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        C42729a0.b(obj);
                        this.f199319r.f199235f.put(Boxing.boxLong(this.f199320s.f393604a), (d00.d) this.f199318q);
                        return G0.f406611a;
                    }
                }

                /* compiled from: FilesInteractor.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "it", "Lkotlin/G0;", "<anonymous>", "(Ld00/d;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$retryFileUpload$1$1$uploadingJob$1$2", f = "FilesInteractor.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$e$a$a$b */
                public static final class b extends SuspendLambda implements p<d00.d, Continuation<? super G0>, Object> {

                    /* renamed from: q, reason: collision with root package name */
                    public int f199321q;

                    public b() {
                        throw null;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.k
                    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                        return new b(2, continuation);
                    }

                    @Override // Y41.p
                    public final Object invoke(d00.d dVar, Continuation<? super G0> continuation) {
                        return ((b) create(dVar, continuation)).invokeSuspend(G0.f406611a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i12 = this.f199321q;
                        if (i12 == 0) {
                            C42729a0.b(obj);
                            this.f199321q = 1;
                            if (C43131e0.b(200L, this) == coroutine_suspended) {
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

                /* compiled from: FilesInteractor.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$FileUpdated;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction$FileUpdated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$e$a$a$c */
                public static final class c<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ I0<DocumentUploadInternalAction.FileUpdated> f199322b;

                    /* JADX WARN: Multi-variable type inference failed */
                    public c(I0<? super DocumentUploadInternalAction.FileUpdated> i02) {
                        this.f199322b = i02;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        Object objSend = this.f199322b.send((DocumentUploadInternalAction.FileUpdated) obj, continuation);
                        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : G0.f406611a;
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$e$a$a$d */
                public static final class d implements InterfaceC43160i<C39479c> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ C43197r1 f199323b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ C39479c f199324c;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$e$a$a$d$a, reason: collision with other inner class name */
                    public static final class C5885a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f199325b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ C39479c f199326c;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$retryFileUpload$1$1$uploadingJob$1$invokeSuspend$$inlined$map$1$2", f = "FilesInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$e$a$a$d$a$a, reason: collision with other inner class name */
                        public static final class C5886a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f199327q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f199328r;

                            public C5886a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@Y61.k Object obj) {
                                this.f199327q = obj;
                                this.f199328r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C5885a.this.emit(null, this);
                            }
                        }

                        public C5885a(InterfaceC43172j interfaceC43172j, C39479c c39479c) {
                            this.f199325b = interfaceC43172j;
                            this.f199326c = c39479c;
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
                                boolean r0 = r6 instanceof com.avito.android.mortgage.document_upload.interactor.f.e.a.C5883a.d.C5885a.C5886a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.mortgage.document_upload.interactor.f$e$a$a$d$a$a r0 = (com.avito.android.mortgage.document_upload.interactor.f.e.a.C5883a.d.C5885a.C5886a) r0
                                int r1 = r0.f199328r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f199328r = r1
                                goto L18
                            L13:
                                com.avito.android.mortgage.document_upload.interactor.f$e$a$a$d$a$a r0 = new com.avito.android.mortgage.document_upload.interactor.f$e$a$a$d$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f199327q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f199328r
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.C42729a0.b(r6)
                                goto L47
                            L29:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L31:
                                kotlin.C42729a0.b(r6)
                                d00.d r5 = (d00.d) r5
                                d00.c r6 = r4.f199326c
                                d00.c r5 = d00.C39479c.a(r6, r5)
                                r0.f199328r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f199325b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L47
                                return r1
                            L47:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.document_upload.interactor.f.e.a.C5883a.d.C5885a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public d(C43197r1 c43197r1, C39479c c39479c) {
                        this.f199323b = c43197r1;
                        this.f199324c = c39479c;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@Y61.k InterfaceC43172j<? super C39479c> interfaceC43172j, @Y61.k Continuation continuation) {
                        Object objCollect = this.f199323b.collect(new C5885a(interfaceC43172j, this.f199324c), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$e$a$a$e, reason: collision with other inner class name */
                public static final class C5887e implements InterfaceC43160i<DocumentUploadInternalAction.FileUpdated> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f199330b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$e$a$a$e$a, reason: collision with other inner class name */
                    public static final class C5888a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f199331b;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.FilesInteractor$retryFileUpload$1$1$uploadingJob$1$invokeSuspend$$inlined$map$2$2", f = "FilesInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.mortgage.document_upload.interactor.f$e$a$a$e$a$a, reason: collision with other inner class name */
                        public static final class C5889a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f199332q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f199333r;

                            public C5889a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@Y61.k Object obj) {
                                this.f199332q = obj;
                                this.f199333r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C5888a.this.emit(null, this);
                            }
                        }

                        public C5888a(InterfaceC43172j interfaceC43172j) {
                            this.f199331b = interfaceC43172j;
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
                                boolean r0 = r6 instanceof com.avito.android.mortgage.document_upload.interactor.f.e.a.C5883a.C5887e.C5888a.C5889a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.mortgage.document_upload.interactor.f$e$a$a$e$a$a r0 = (com.avito.android.mortgage.document_upload.interactor.f.e.a.C5883a.C5887e.C5888a.C5889a) r0
                                int r1 = r0.f199333r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f199333r = r1
                                goto L18
                            L13:
                                com.avito.android.mortgage.document_upload.interactor.f$e$a$a$e$a$a r0 = new com.avito.android.mortgage.document_upload.interactor.f$e$a$a$e$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f199332q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f199333r
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
                                d00.c r5 = (d00.C39479c) r5
                                com.avito.android.mortgage.document_upload.mvi.entity.DocumentUploadInternalAction$FileUpdated r6 = new com.avito.android.mortgage.document_upload.mvi.entity.DocumentUploadInternalAction$FileUpdated
                                r6.<init>(r5)
                                r0.f199333r = r3
                                kotlinx.coroutines.flow.j r5 = r4.f199331b
                                java.lang.Object r5 = r5.emit(r6, r0)
                                if (r5 != r1) goto L46
                                return r1
                            L46:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.document_upload.interactor.f.e.a.C5883a.C5887e.C5888a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public C5887e(d dVar) {
                        this.f199330b = dVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@Y61.k InterfaceC43172j<? super DocumentUploadInternalAction.FileUpdated> interfaceC43172j, @Y61.k Continuation continuation) {
                        Object objCollect = this.f199330b.collect(new C5888a(interfaceC43172j), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C5883a(f fVar, C39479c c39479c, String str, String str2, String str3, String str4, I0<? super DocumentUploadInternalAction.FileUpdated> i02, Continuation<? super C5883a> continuation) {
                    super(2, continuation);
                    this.f199311r = fVar;
                    this.f199312s = c39479c;
                    this.f199313t = str;
                    this.f199314u = str2;
                    this.f199315v = str3;
                    this.f199316w = str4;
                    this.f199317x = i02;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C5883a(this.f199311r, this.f199312s, this.f199313t, this.f199314u, this.f199315v, this.f199316w, this.f199317x, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C5883a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f199310q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        f fVar = this.f199311r;
                        com.avito.android.mortgage.document_upload.interactor.d dVar = fVar.f199232c;
                        C39479c c39479c = this.f199312s;
                        dVar.getClass();
                        C5887e c5887e = new C5887e(new d(new C43197r1(new b(2, null), C43175k.c(new C43197r1(new C5884a(fVar, c39479c, null), C43175k.h(new com.avito.android.mortgage.document_upload.interactor.c(c39479c, dVar, this.f199313t, this.f199314u, this.f199315v, this.f199316w, null))), -1, 2)), c39479c));
                        c cVar = new c(this.f199317x);
                        this.f199310q = 1;
                        if (c5887e.collect(cVar, this) == coroutine_suspended) {
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
            /* JADX WARN: Multi-variable type inference failed */
            public a(f fVar, C39479c c39479c, String str, String str2, String str3, String str4, I0<? super DocumentUploadInternalAction.FileUpdated> i02, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f199303r = fVar;
                this.f199304s = c39479c;
                this.f199305t = str;
                this.f199306u = str2;
                this.f199307v = str3;
                this.f199308w = str4;
                this.f199309x = i02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f199303r, this.f199304s, this.f199305t, this.f199306u, this.f199307v, this.f199308w, this.f199309x, continuation);
                aVar.f199302q = obj;
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
                T t12 = (T) this.f199302q;
                f fVar = this.f199303r;
                kotlinx.coroutines.scheduling.b bVarA = fVar.f199233d.a();
                C39479c c39479c = this.f199304s;
                fVar.f199234e.put(Boxing.boxLong(c39479c.f393604a), C43259k.d(t12, bVarA, null, new C5883a(this.f199303r, c39479c, this.f199305t, this.f199306u, this.f199307v, this.f199308w, this.f199309x, null), 2));
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C39479c c39479c, f fVar, String str, String str2, String str3, String str4, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f199296s = c39479c;
            this.f199297t = fVar;
            this.f199298u = str;
            this.f199299v = str2;
            this.f199300w = str3;
            this.f199301x = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f199296s, this.f199297t, this.f199298u, this.f199299v, this.f199300w, this.f199301x, continuation);
            eVar.f199295r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(I0<? super DocumentUploadInternalAction.FileUpdated> i02, Continuation<? super G0> continuation) {
            return ((e) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            I0 i02;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f199294q;
            C39479c c39479c = this.f199296s;
            if (i12 == 0) {
                C42729a0.b(obj);
                I0 i03 = (I0) this.f199295r;
                DocumentUploadInternalAction.FileUpdated fileUpdated = new DocumentUploadInternalAction.FileUpdated(C39479c.a(c39479c, d.C11004d.f393612a));
                this.f199295r = i03;
                this.f199294q = 1;
                if (i03.send(fileUpdated, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i02 = i03;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                I0 i04 = (I0) this.f199295r;
                C42729a0.b(obj);
                i02 = i04;
            }
            this.f199297t.f199235f.put(Boxing.boxLong(c39479c.f393604a), d.C11004d.f393612a);
            a aVar = new a(this.f199297t, c39479c, this.f199298u, this.f199299v, this.f199300w, this.f199301x, i02, null);
            this.f199295r = null;
            this.f199294q = 2;
            if (t1.c(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f(@Y61.k J0 j02, @Y61.k ContentResolver contentResolver, @Y61.k com.avito.android.mortgage.document_upload.interactor.d dVar, @Y61.k R0 r02) {
        this.f199230a = j02;
        this.f199231b = contentResolver;
        this.f199232c = dVar;
        this.f199233d = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.InterfaceC43172j r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, Y41.a r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.document_upload.interactor.f.a(kotlinx.coroutines.flow.j, java.lang.String, java.lang.String, java.lang.String, Y41.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.k
    public final InterfaceC43160i b(int i12, long j12, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.k List list) {
        return C43175k.I(this.f199233d.d(), C43175k.h(new b(list, i12, j12, this, str, str2, str3, str4, null)));
    }

    @Y61.k
    public final InterfaceC43160i<DocumentUploadInternalAction> c(@Y61.k C39479c c39479c, @Y61.k String str, @Y61.k String str2) {
        return C43175k.I(this.f199233d.d(), C43175k.G(new c(c39479c, str, str2, null)));
    }

    @Y61.k
    public final InterfaceC43160i<DocumentUploadInternalAction> d(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        return C43175k.I(this.f199233d.d(), C43175k.G(new d(str, str2, str3, null)));
    }

    @Y61.k
    public final InterfaceC43160i<DocumentUploadInternalAction> e(@Y61.k C39479c c39479c, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4) {
        return C43175k.I(this.f199233d.d(), C43175k.h(new e(c39479c, this, str, str2, str3, str4, null)));
    }
}
