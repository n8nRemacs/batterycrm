package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSettingsImageActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsImageActor$processSelectedBannerImage$1", f = "ExtendedProfileSettingsImageActor.kt", i = {0, 1, 1}, l = {410, 416, 418}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "pickedImage"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes16.dex */
final class I extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public UploadImage.ImageFromPhotoPicker f230452q;

    /* renamed from: r, reason: collision with root package name */
    public int f230453r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f230454s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> f230455t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B f230456u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f230457v;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<ExtendedProfileSettingsInternalAction.ImagesInternalAction.ImageUpdate> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f230458b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.profile_settings_extended.mvi.I$a$a, reason: collision with other inner class name */
        public static final class C7012a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f230459b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsImageActor$processSelectedBannerImage$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "ExtendedProfileSettingsImageActor.kt", i = {}, l = {222}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.profile_settings_extended.mvi.I$a$a$a, reason: collision with other inner class name */
            public static final class C7013a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f230460q;

                /* renamed from: r, reason: collision with root package name */
                public int f230461r;

                public C7013a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f230460q = obj;
                    this.f230461r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C7012a.this.emit(null, this);
                }
            }

            public C7012a(InterfaceC43172j interfaceC43172j) {
                this.f230459b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.profile_settings_extended.mvi.I.a.C7012a.C7013a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.profile_settings_extended.mvi.I$a$a$a r0 = (com.avito.android.profile_settings_extended.mvi.I.a.C7012a.C7013a) r0
                    int r1 = r0.f230461r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f230461r = r1
                    goto L18
                L13:
                    com.avito.android.profile_settings_extended.mvi.I$a$a$a r0 = new com.avito.android.profile_settings_extended.mvi.I$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f230460q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f230461r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L55
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.profile_management_core.images.a$d r5 = (com.avito.android.profile_management_core.images.a.d) r5
                    boolean r6 = r5 instanceof com.avito.android.profile_management_core.images.a.d.b
                    r2 = 0
                    if (r6 == 0) goto L3e
                    com.avito.android.profile_management_core.images.a$d$b r5 = (com.avito.android.profile_management_core.images.a.d.b) r5
                    goto L3f
                L3e:
                    r5 = r2
                L3f:
                    if (r5 == 0) goto L48
                    com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$ImagesInternalAction$ImageUpdate r2 = new com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$ImagesInternalAction$ImageUpdate
                    com.avito.android.profile_management_core.images.entity.UploadImage$ImageFromPhotoPicker r5 = r5.f226628a
                    r2.<init>(r5)
                L48:
                    if (r2 == 0) goto L55
                    r0.f230461r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f230459b
                    java.lang.Object r5 = r5.emit(r2, r0)
                    if (r5 != r1) goto L55
                    return r1
                L55:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.I.a.C7012a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i) {
            this.f230458b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super ExtendedProfileSettingsInternalAction.ImagesInternalAction.ImageUpdate> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f230458b.collect(new C7012a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> aVar, B b12, String str, Continuation<? super I> continuation) {
        super(2, continuation);
        this.f230455t = aVar;
        this.f230456u = b12;
        this.f230457v = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        I i12 = new I(this.f230455t, this.f230456u, this.f230457v, continuation);
        i12.f230454s = obj;
        return i12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((I) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f230453r
            r2 = 0
            java.lang.String r3 = r10.f230457v
            r4 = 3
            r5 = 2
            r6 = 1
            com.avito.android.profile_settings_extended.mvi.B r7 = r10.f230456u
            if (r1 == 0) goto L35
            if (r1 == r6) goto L2d
            if (r1 == r5) goto L23
            if (r1 != r4) goto L1b
            kotlin.C42729a0.b(r11)
            goto La1
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            com.avito.android.profile_management_core.images.entity.UploadImage$ImageFromPhotoPicker r1 = r10.f230452q
            java.lang.Object r3 = r10.f230454s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r11)
            goto L89
        L2d:
            java.lang.Object r1 = r10.f230454s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L5d
        L35:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f230454s
            kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
            Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> r1 = r10.f230455t
            java.lang.Object r1 = r1.invoke()
            com.avito.android.profile_settings_extended.mvi.entity.a r1 = (com.avito.android.profile_settings_extended.mvi.entity.a) r1
            yc0.r r1 = r1.f230666g
            if (r1 != 0) goto L4b
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        L4b:
            com.avito.android.profile_management_core.images.a r8 = r7.f230382a
            r10.f230454s = r11
            r10.f230453r = r6
            com.avito.android.profile_management_core.images.entity.UploadImage$Type r1 = r1.f443331b
            java.lang.Object r1 = r8.i(r3, r1, r2, r10)
            if (r1 != r0) goto L5a
            return r0
        L5a:
            r9 = r1
            r1 = r11
            r11 = r9
        L5d:
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = kotlin.collections.C42745f0.S(r11)
            com.avito.android.profile_management_core.images.entity.UploadImage$ImageFromPhotoPicker r11 = (com.avito.android.profile_management_core.images.entity.UploadImage.ImageFromPhotoPicker) r11
            if (r11 != 0) goto L6a
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        L6a:
            com.avito.android.profile_management_core.images.a r6 = r7.f230382a
            android.net.Uri r8 = r11.f226689j
            java.util.List r8 = java.util.Collections.singletonList(r8)
            r6.d(r8)
            com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$ImagesInternalAction$UpdateBannerImage r6 = new com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$ImagesInternalAction$UpdateBannerImage
            r6.<init>(r3, r11)
            r10.f230454s = r1
            r10.f230452q = r11
            r10.f230453r = r5
            java.lang.Object r3 = r1.emit(r6, r10)
            if (r3 != r0) goto L87
            return r0
        L87:
            r3 = r1
            r1 = r11
        L89:
            com.avito.android.profile_management_core.images.a r11 = r7.f230382a
            kotlinx.coroutines.flow.i r11 = r11.k(r1)
            com.avito.android.profile_settings_extended.mvi.I$a r1 = new com.avito.android.profile_settings_extended.mvi.I$a
            r1.<init>(r11)
            r10.f230454s = r2
            r10.f230452q = r2
            r10.f230453r = r4
            java.lang.Object r11 = kotlinx.coroutines.flow.C43175k.u(r10, r1, r3)
            if (r11 != r0) goto La1
            return r0
        La1:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.I.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
