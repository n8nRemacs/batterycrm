package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSettingsImageActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsImageActor$processImageClick$1", f = "ExtendedProfileSettingsImageActor.kt", i = {}, l = {194, 223, 239, 269}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class G extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f230424q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f230425r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UploadImage f230426s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B f230427t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> f230428u;

    /* compiled from: ExtendedProfileSettingsImageActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsImageActor$processImageClick$1$2", f = "ExtendedProfileSettingsImageActor.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f230429q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f230430r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f230431s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ B f230432t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ UploadImage f230433u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> f230434v;

        /* compiled from: ExtendedProfileSettingsImageActor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "error", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_settings_extended.mvi.G$a$a, reason: collision with other inner class name */
        public static final class C7009a extends kotlin.jvm.internal.N implements Y41.l<Throwable, ExtendedProfileSettingsInternalAction> {

            /* renamed from: l, reason: collision with root package name */
            public static final C7009a f230435l = new C7009a();

            public C7009a() {
                super(1);
            }

            @Override // Y41.l
            public final ExtendedProfileSettingsInternalAction invoke(Throwable th2) {
                return new ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowCommonErrorToastBar(th2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, UploadImage uploadImage, B b12, Continuation continuation) {
            super(3, continuation);
            this.f230432t = b12;
            this.f230433u = uploadImage;
            this.f230434v = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> aVar = this.f230434v;
            B b12 = this.f230432t;
            a aVar2 = new a(aVar, this.f230433u, b12, continuation);
            aVar2.f230430r = interfaceC43172j;
            aVar2.f230431s = th2;
            return aVar2.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f230429q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f230430r;
                if (this.f230431s == null) {
                    String f226678d = this.f230433u.getF226678d();
                    C7009a c7009a = C7009a.f230435l;
                    InterfaceC43160i<ExtendedProfileSettingsInternalAction> interfaceC43160iB = this.f230432t.b(f226678d, this.f230434v, c7009a);
                    this.f230430r = null;
                    this.f230429q = 1;
                    if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: ExtendedProfileSettingsImageActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Throwable, ExtendedProfileSettingsInternalAction> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f230436l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final ExtendedProfileSettingsInternalAction invoke(Throwable th2) {
            return new ExtendedProfileSettingsInternalAction.SnackbarAndDialogInternalAction.ShowCommonErrorToastBar(th2, null);
        }
    }

    /* compiled from: ExtendedProfileSettingsImageActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[UploadImage.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UploadImage.Type type = UploadImage.Type.f226690b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UploadImage.Type type2 = UploadImage.Type.f226690b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                UploadImage.Type type3 = UploadImage.Type.f226690b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                UploadImage.Type type4 = UploadImage.Type.f226690b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                UploadImage.Type type5 = UploadImage.Type.f226690b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<ExtendedProfileSettingsInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f230437b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f230438b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsImageActor$processImageClick$1$invokeSuspend$$inlined$map$1$2", f = "ExtendedProfileSettingsImageActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.profile_settings_extended.mvi.G$d$a$a, reason: collision with other inner class name */
            public static final class C7010a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f230439q;

                /* renamed from: r, reason: collision with root package name */
                public int f230440r;

                public C7010a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f230439q = obj;
                    this.f230440r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f230438b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.profile_settings_extended.mvi.G.d.a.C7010a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.profile_settings_extended.mvi.G$d$a$a r0 = (com.avito.android.profile_settings_extended.mvi.G.d.a.C7010a) r0
                    int r1 = r0.f230440r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f230440r = r1
                    goto L18
                L13:
                    com.avito.android.profile_settings_extended.mvi.G$d$a$a r0 = new com.avito.android.profile_settings_extended.mvi.G$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f230439q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f230440r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L5d
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.profile_management_core.images.a$d r5 = (com.avito.android.profile_management_core.images.a.d) r5
                    boolean r6 = r5 instanceof com.avito.android.profile_management_core.images.a.d.b
                    if (r6 == 0) goto L44
                    com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$ImagesInternalAction$ImageUpdate r6 = new com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$ImagesInternalAction$ImageUpdate
                    com.avito.android.profile_management_core.images.a$d$b r5 = (com.avito.android.profile_management_core.images.a.d.b) r5
                    com.avito.android.profile_management_core.images.entity.UploadImage$ImageFromPhotoPicker r5 = r5.f226628a
                    r6.<init>(r5)
                    goto L52
                L44:
                    boolean r6 = r5 instanceof com.avito.android.profile_management_core.images.a.d.C6880a
                    if (r6 == 0) goto L60
                    com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction$ShowCommonErrorToastBar r6 = new com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction$ShowCommonErrorToastBar
                    com.avito.android.profile_management_core.images.a$d$a r5 = (com.avito.android.profile_management_core.images.a.d.C6880a) r5
                    java.lang.Throwable r5 = r5.f226627a
                    r2 = 0
                    r6.<init>(r5, r2)
                L52:
                    r0.f230440r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f230438b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                L60:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.G.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(InterfaceC43160i interfaceC43160i) {
            this.f230437b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f230437b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements InterfaceC43160i<ExtendedProfileSettingsInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f230442b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f230443b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsImageActor$processImageClick$1$invokeSuspend$$inlined$map$2$2", f = "ExtendedProfileSettingsImageActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.profile_settings_extended.mvi.G$e$a$a, reason: collision with other inner class name */
            public static final class C7011a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f230444q;

                /* renamed from: r, reason: collision with root package name */
                public int f230445r;

                public C7011a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f230444q = obj;
                    this.f230445r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f230443b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.profile_settings_extended.mvi.G.e.a.C7011a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.profile_settings_extended.mvi.G$e$a$a r0 = (com.avito.android.profile_settings_extended.mvi.G.e.a.C7011a) r0
                    int r1 = r0.f230445r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f230445r = r1
                    goto L18
                L13:
                    com.avito.android.profile_settings_extended.mvi.G$e$a$a r0 = new com.avito.android.profile_settings_extended.mvi.G$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f230444q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f230445r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L5d
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.profile_management_core.images.a$d r5 = (com.avito.android.profile_management_core.images.a.d) r5
                    boolean r6 = r5 instanceof com.avito.android.profile_management_core.images.a.d.b
                    if (r6 == 0) goto L44
                    com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$ImagesInternalAction$ImageUpdate r6 = new com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$ImagesInternalAction$ImageUpdate
                    com.avito.android.profile_management_core.images.a$d$b r5 = (com.avito.android.profile_management_core.images.a.d.b) r5
                    com.avito.android.profile_management_core.images.entity.UploadImage$ImageFromPhotoPicker r5 = r5.f226628a
                    r6.<init>(r5)
                    goto L52
                L44:
                    boolean r6 = r5 instanceof com.avito.android.profile_management_core.images.a.d.C6880a
                    if (r6 == 0) goto L60
                    com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction$ShowCommonErrorToastBar r6 = new com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction$ShowCommonErrorToastBar
                    com.avito.android.profile_management_core.images.a$d$a r5 = (com.avito.android.profile_management_core.images.a.d.C6880a) r5
                    java.lang.Throwable r5 = r5.f226627a
                    r2 = 0
                    r6.<init>(r5, r2)
                L52:
                    r0.f230445r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f230443b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                L60:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.G.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public e(InterfaceC43160i interfaceC43160i) {
            this.f230442b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f230442b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Y41.a aVar, UploadImage uploadImage, B b12, Continuation continuation) {
        super(2, continuation);
        this.f230426s = uploadImage;
        this.f230427t = b12;
        this.f230428u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        G g12 = new G(this.f230428u, this.f230426s, this.f230427t, continuation);
        g12.f230425r = obj;
        return g12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((G) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.G.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
