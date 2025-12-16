package com.avito.android.profile_settings_basic;

import Za0.InterfaceC19524a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_basic.InterfaceC33459d;
import com.avito.android.profile_settings_basic.InterfaceC33466k;
import com.avito.android.remote.D0;
import com.avito.android.util.R0;
import com.yandex.metrica.YandexMetricaDefaultValues;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;

/* compiled from: AvatarInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/f;", "Lcom/avito/android/profile_settings_basic/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_settings_basic.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33461f implements InterfaceC33460e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<D0> f228811a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC19524a> f228812b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f228813c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_picker.converter.f f228814d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33456a f228815e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public volatile N0 f228816f;

    /* compiled from: AvatarInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_basic/k;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_basic.AvatarInteractorImpl$deleteAllAvatars$1", f = "AvatarInteractor.kt", i = {0, 1}, l = {106, 107, 109}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.profile_settings_basic.f$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC33466k>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f228817q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f228818r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = C33461f.this.new a(continuation);
            aVar.f228818r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC33466k> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) throws com.avito.android.util.ApiException {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f228817q
                com.avito.android.profile_settings_basic.f r2 = com.avito.android.profile_settings_basic.C33461f.this
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L31
                if (r1 == r6) goto L29
                if (r1 == r5) goto L21
                if (r1 != r4) goto L19
                kotlin.C42729a0.b(r8)
                goto L8e
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.f228818r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L64
            L29:
                java.lang.Object r1 = r7.f228818r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L51
            L31:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f228818r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                kotlinx.coroutines.N0 r1 = r2.f228816f
                if (r1 == 0) goto L41
                kotlinx.coroutines.V0 r1 = (kotlinx.coroutines.V0) r1
                r1.c(r3)
            L41:
                r2.f228816f = r3
                com.avito.android.profile_settings_basic.k$b r1 = com.avito.android.profile_settings_basic.InterfaceC33466k.b.f228857a
                r7.f228818r = r8
                r7.f228817q = r6
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L50
                return r0
            L50:
                r1 = r8
            L51:
                h31.e<Za0.a> r8 = r2.f228812b
                java.lang.Object r8 = r8.get()
                Za0.a r8 = (Za0.InterfaceC19524a) r8
                r7.f228818r = r1
                r7.f228817q = r5
                java.lang.Object r8 = r8.c(r7)
                if (r8 != r0) goto L64
                return r0
            L64:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r2 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r2 == 0) goto L91
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                bb0.b r8 = (bb0.C25621b) r8
                com.avito.android.profile_settings_basic.k$c r2 = new com.avito.android.profile_settings_basic.k$c
                bb0.a r8 = r8.getAvatar()
                if (r8 == 0) goto L7f
                com.avito.android.remote.model.Image r8 = r8.getImage()
                goto L80
            L7f:
                r8 = r3
            L80:
                r2.<init>(r8)
                r7.f228818r = r3
                r7.f228817q = r4
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto L8e
                return r0
            L8e:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            L91:
                boolean r0 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r0 == 0) goto La4
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r0 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r0, r8)
                throw r8
            La4:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_basic.C33461f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AvatarInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_basic/k;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_basic.AvatarInteractorImpl$deleteAllAvatars$2", f = "AvatarInteractor.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile_settings_basic.f$b */
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InterfaceC33466k>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f228820q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f228821r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f228822s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InterfaceC33466k> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f228821r = interfaceC43172j;
            bVar.f228822s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f228820q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f228821r;
                InterfaceC33466k.a aVar = new InterfaceC33466k.a(this.f228822s);
                this.f228821r = null;
                this.f228820q = 1;
                if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
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

    /* compiled from: AvatarInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_basic/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_basic.AvatarInteractorImpl$deleteAvatar$1", f = "AvatarInteractor.kt", i = {0, 1}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS, 91, 94}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.profile_settings_basic.f$c */
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC33459d>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f228823q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f228824r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f228826t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f228826t = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = C33461f.this.new c(this.f228826t, continuation);
            cVar.f228824r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC33459d> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) throws com.avito.android.util.ApiException {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f228823q
                boolean r2 = r8.f228826t
                com.avito.android.profile_settings_basic.f r3 = com.avito.android.profile_settings_basic.C33461f.this
                r4 = 0
                r5 = 3
                r6 = 2
                r7 = 1
                if (r1 == 0) goto L32
                if (r1 == r7) goto L2a
                if (r1 == r6) goto L22
                if (r1 != r5) goto L1a
                kotlin.C42729a0.b(r9)
                goto L89
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                java.lang.Object r1 = r8.f228824r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L68
            L2a:
                java.lang.Object r1 = r8.f228824r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L55
            L32:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f228824r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                kotlinx.coroutines.N0 r1 = r3.f228816f
                if (r1 == 0) goto L42
                kotlinx.coroutines.V0 r1 = (kotlinx.coroutines.V0) r1
                r1.c(r4)
            L42:
                r3.f228816f = r4
                com.avito.android.profile_settings_basic.d$b r1 = new com.avito.android.profile_settings_basic.d$b
                r1.<init>(r2)
                r8.f228824r = r9
                r8.f228823q = r7
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L54
                return r0
            L54:
                r1 = r9
            L55:
                h31.e<Za0.a> r9 = r3.f228812b
                java.lang.Object r9 = r9.get()
                Za0.a r9 = (Za0.InterfaceC19524a) r9
                r8.f228824r = r1
                r8.f228823q = r6
                java.lang.Object r9 = r9.i(r2, r8)
                if (r9 != r0) goto L68
                return r0
            L68:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                boolean r2 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r2 == 0) goto L94
                com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
                java.lang.Object r9 = r9.getResult()
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L8c
                com.avito.android.profile_settings_basic.d$c r9 = com.avito.android.profile_settings_basic.InterfaceC33459d.c.f228738a
                r8.f228824r = r4
                r8.f228823q = r5
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto L89
                return r0
            L89:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            L8c:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Failed requirement."
                r9.<init>(r0)
                throw r9
            L94:
                boolean r0 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r0 == 0) goto La7
                com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
                com.avito.android.remote.error.ApiError r0 = r9.getError()
                java.lang.Throwable r9 = r9.getCause()
                com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r0, r9)
                throw r9
            La7:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_basic.C33461f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AvatarInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_basic/d;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_basic.AvatarInteractorImpl$deleteAvatar$2", f = "AvatarInteractor.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile_settings_basic.f$d */
    public static final class d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InterfaceC33459d>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f228827q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f228828r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f228829s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f228830t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z12, Continuation<? super d> continuation) {
            super(3, continuation);
            this.f228830t = z12;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InterfaceC33459d> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = new d(this.f228830t, continuation);
            dVar.f228828r = interfaceC43172j;
            dVar.f228829s = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f228827q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f228828r;
                InterfaceC33459d.a aVar = new InterfaceC33459d.a(this.f228829s, this.f228830t);
                this.f228828r = null;
                this.f228827q = 1;
                if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
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
    public C33461f(@Y61.k h31.e<D0> eVar, @Y61.k h31.e<InterfaceC19524a> eVar2, @Y61.k R0 r02, @Y61.k com.avito.android.photo_picker.converter.f fVar, @Y61.k InterfaceC33456a interfaceC33456a) {
        this.f228811a = eVar;
        this.f228812b = eVar2;
        this.f228813c = r02;
        this.f228814d = fVar;
        this.f228815e = interfaceC33456a;
    }

    @Override // com.avito.android.profile_settings_basic.InterfaceC33460e
    @Y61.k
    public final InterfaceC43160i<InterfaceC33459d> a(boolean z12) {
        return C43175k.I(this.f228813c.a(), new C43152f0(C43175k.G(new c(z12, null)), new d(z12, null)));
    }

    @Override // com.avito.android.profile_settings_basic.InterfaceC33460e
    @Y61.k
    public final X b(@Y61.k Uri uri) {
        return new X(C43175k.G(new C33462g(this, uri, null)), new C33463h(this, null));
    }

    @Override // com.avito.android.profile_settings_basic.InterfaceC33460e
    @Y61.k
    public final InterfaceC43160i<InterfaceC33466k> c() {
        return C43175k.I(this.f228813c.a(), new C43152f0(C43175k.G(new a(null)), new b(3, null)));
    }
}
