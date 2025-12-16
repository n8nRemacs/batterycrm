package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import java.util.List;
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
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsImageActor$processSelectedGalleryImage$1", f = "ExtendedProfileSettingsImageActor.kt", i = {0, 1, 1}, l = {380, 388, 392}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "pickedImages"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes16.dex */
final class J extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public List f230463q;

    /* renamed from: r, reason: collision with root package name */
    public int f230464r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f230465s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> f230466t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B f230467u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f230468v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f230469w;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<ExtendedProfileSettingsInternalAction.ImagesInternalAction.ImageUpdate> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f230470b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.profile_settings_extended.mvi.J$a$a, reason: collision with other inner class name */
        public static final class C7014a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f230471b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsImageActor$processSelectedGalleryImage$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "ExtendedProfileSettingsImageActor.kt", i = {}, l = {222}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.profile_settings_extended.mvi.J$a$a$a, reason: collision with other inner class name */
            public static final class C7015a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f230472q;

                /* renamed from: r, reason: collision with root package name */
                public int f230473r;

                public C7015a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f230472q = obj;
                    this.f230473r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C7014a.this.emit(null, this);
                }
            }

            public C7014a(InterfaceC43172j interfaceC43172j) {
                this.f230471b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.profile_settings_extended.mvi.J.a.C7014a.C7015a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.profile_settings_extended.mvi.J$a$a$a r0 = (com.avito.android.profile_settings_extended.mvi.J.a.C7014a.C7015a) r0
                    int r1 = r0.f230473r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f230473r = r1
                    goto L18
                L13:
                    com.avito.android.profile_settings_extended.mvi.J$a$a$a r0 = new com.avito.android.profile_settings_extended.mvi.J$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f230472q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f230473r
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
                    r0.f230473r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f230471b
                    java.lang.Object r5 = r5.emit(r2, r0)
                    if (r5 != r1) goto L55
                    return r1
                L55:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.J.a.C7014a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i) {
            this.f230470b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super ExtendedProfileSettingsInternalAction.ImagesInternalAction.ImageUpdate> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f230470b.collect(new C7014a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> aVar, B b12, String str, boolean z12, Continuation<? super J> continuation) {
        super(2, continuation);
        this.f230466t = aVar;
        this.f230467u = b12;
        this.f230468v = str;
        this.f230469w = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        J j12 = new J(this.f230466t, this.f230467u, this.f230468v, this.f230469w, continuation);
        j12.f230465s = obj;
        return j12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((J) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.f230464r
            r2 = 0
            java.lang.String r3 = r12.f230468v
            r4 = 3
            r5 = 2
            r6 = 1
            com.avito.android.profile_settings_extended.mvi.B r7 = r12.f230467u
            if (r1 == 0) goto L38
            if (r1 == r6) goto L30
            if (r1 == r5) goto L23
            if (r1 != r4) goto L1b
            kotlin.C42729a0.b(r13)
            goto Lc7
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            java.util.List r1 = r12.f230463q
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r12.f230465s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r13)
            goto Laf
        L30:
            java.lang.Object r1 = r12.f230465s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r13)
            goto L60
        L38:
            kotlin.C42729a0.b(r13)
            java.lang.Object r13 = r12.f230465s
            kotlinx.coroutines.flow.j r13 = (kotlinx.coroutines.flow.InterfaceC43172j) r13
            Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> r1 = r12.f230466t
            java.lang.Object r1 = r1.invoke()
            com.avito.android.profile_settings_extended.mvi.entity.a r1 = (com.avito.android.profile_settings_extended.mvi.entity.a) r1
            yc0.r r1 = r1.f230666g
            if (r1 != 0) goto L4e
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        L4e:
            com.avito.android.profile_management_core.images.a r8 = r7.f230382a
            r12.f230465s = r13
            r12.f230464r = r6
            com.avito.android.profile_management_core.images.entity.UploadImage$Type r1 = r1.f443331b
            java.lang.Object r1 = r8.i(r3, r1, r2, r12)
            if (r1 != r0) goto L5d
            return r0
        L5d:
            r11 = r1
            r1 = r13
            r13 = r11
        L60:
            java.util.List r13 = (java.util.List) r13
            boolean r6 = r13.isEmpty()
            if (r6 == 0) goto L6b
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        L6b:
            boolean r6 = r12.f230469w
            if (r6 == 0) goto L98
            com.avito.android.profile_management_core.images.a r6 = r7.f230382a
            r8 = r13
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = kotlin.collections.C42745f0.q(r8, r10)
            r9.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
        L83:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L95
            java.lang.Object r10 = r8.next()
            com.avito.android.profile_management_core.images.entity.UploadImage$ImageFromPhotoPicker r10 = (com.avito.android.profile_management_core.images.entity.UploadImage.ImageFromPhotoPicker) r10
            android.net.Uri r10 = r10.f226689j
            r9.add(r10)
            goto L83
        L95:
            r6.d(r9)
        L98:
            com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$ImagesInternalAction$AppendGalleryImages r6 = new com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$ImagesInternalAction$AppendGalleryImages
            r6.<init>(r3, r13)
            r12.f230465s = r1
            r3 = r13
            java.util.List r3 = (java.util.List) r3
            r12.f230463q = r3
            r12.f230464r = r5
            java.lang.Object r3 = r1.emit(r6, r12)
            if (r3 != r0) goto Lad
            return r0
        Lad:
            r3 = r1
            r1 = r13
        Laf:
            com.avito.android.profile_management_core.images.a r13 = r7.f230382a
            kotlinx.coroutines.flow.internal.m r13 = r13.j(r1)
            com.avito.android.profile_settings_extended.mvi.J$a r1 = new com.avito.android.profile_settings_extended.mvi.J$a
            r1.<init>(r13)
            r12.f230465s = r2
            r12.f230463q = r2
            r12.f230464r = r4
            java.lang.Object r13 = kotlinx.coroutines.flow.C43175k.u(r12, r1, r3)
            if (r13 != r0) goto Lc7
            return r0
        Lc7:
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.J.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
