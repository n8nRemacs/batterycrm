package com.avito.android.language_selector.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import aR.InterfaceC19809a;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.util.R0;
import jJ.InterfaceC42261a;
import jJ.InterfaceC42262b;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import ur.InterfaceC49101b;

/* compiled from: LanguageSyncUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/language_selector/domain/h;", "Lcom/avito/android/language_selector/domain/g;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC19809a f174916a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42262b f174917b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42261a f174918c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final E f174919d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final R0 f174920e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC49101b f174921f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C43238h f174922g;

    /* compiled from: LanguageSyncUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.language_selector.domain.LanguageSyncUseCaseImpl$execute$1", f = "LanguageSyncUseCase.kt", i = {}, l = {36, 40}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f174923q;

        /* compiled from: LanguageSyncUseCase.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.language_selector.domain.LanguageSyncUseCaseImpl$execute$1$1$1", f = "LanguageSyncUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.language_selector.domain.h$a$a, reason: collision with other inner class name */
        public static final class C5155a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ h f174925q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ String f174926r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5155a(h hVar, String str, Continuation<? super C5155a> continuation) {
                super(2, continuation);
                this.f174925q = hVar;
                this.f174926r = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C5155a(this.f174925q, this.f174926r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C5155a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                this.f174925q.f174917b.b(Locale.forLanguageTag(this.f174926r));
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return h.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:6:0x0010, B:12:0x0020, B:19:0x003a, B:21:0x0040, B:23:0x004e, B:26:0x0055, B:28:0x0065, B:31:0x007a, B:33:0x007e, B:34:0x008f, B:35:0x0090, B:36:0x0095, B:16:0x002f), top: B:40:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:6:0x0010, B:12:0x0020, B:19:0x003a, B:21:0x0040, B:23:0x004e, B:26:0x0055, B:28:0x0065, B:31:0x007a, B:33:0x007e, B:34:0x008f, B:35:0x0090, B:36:0x0095, B:16:0x002f), top: B:40:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) throws com.avito.android.util.ApiException {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f174923q
                r2 = 2
                r3 = 1
                com.avito.android.language_selector.domain.h r4 = com.avito.android.language_selector.domain.h.this
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.C42729a0.b(r7)     // Catch: java.lang.Exception -> L15
                goto L9f
            L15:
                r7 = move-exception
                goto L96
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                kotlin.C42729a0.b(r7)     // Catch: java.lang.Exception -> L15
                goto L3a
            L24:
                kotlin.C42729a0.b(r7)
                com.avito.android.account.E r7 = r4.f174919d
                boolean r7 = r7.b()
                if (r7 == 0) goto L9f
                aR.a r7 = r4.f174916a     // Catch: java.lang.Exception -> L15
                r6.f174923q = r3     // Catch: java.lang.Exception -> L15
                java.lang.Object r7 = r7.b(r6)     // Catch: java.lang.Exception -> L15
                if (r7 != r0) goto L3a
                return r0
            L3a:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7     // Catch: java.lang.Exception -> L15
                boolean r1 = r7 instanceof com.avito.android.remote.model.TypedResult.Success     // Catch: java.lang.Exception -> L15
                if (r1 == 0) goto L7a
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7     // Catch: java.lang.Exception -> L15
                java.lang.Object r7 = r7.getResult()     // Catch: java.lang.Exception -> L15
                bR.a r7 = (bR.C25548a) r7     // Catch: java.lang.Exception -> L15
                java.lang.String r7 = r7.getLanguage()     // Catch: java.lang.Exception -> L15
                if (r7 == 0) goto L9f
                int r1 = r7.length()     // Catch: java.lang.Exception -> L15
                if (r1 != 0) goto L55
                goto L9f
            L55:
                jJ.a r1 = r4.f174918c     // Catch: java.lang.Exception -> L15
                java.util.Locale r1 = r1.P4()     // Catch: java.lang.Exception -> L15
                java.lang.String r1 = r1.getLanguage()     // Catch: java.lang.Exception -> L15
                boolean r1 = r7.equals(r1)     // Catch: java.lang.Exception -> L15
                if (r1 != 0) goto L9f
                com.avito.android.util.R0 r1 = r4.f174920e     // Catch: java.lang.Exception -> L15
                kotlinx.coroutines.d1 r1 = r1.b()     // Catch: java.lang.Exception -> L15
                com.avito.android.language_selector.domain.h$a$a r3 = new com.avito.android.language_selector.domain.h$a$a     // Catch: java.lang.Exception -> L15
                r5 = 0
                r3.<init>(r4, r7, r5)     // Catch: java.lang.Exception -> L15
                r6.f174923q = r2     // Catch: java.lang.Exception -> L15
                java.lang.Object r7 = kotlinx.coroutines.C43259k.g(r1, r3, r6)     // Catch: java.lang.Exception -> L15
                if (r7 != r0) goto L9f
                return r0
            L7a:
                boolean r0 = r7 instanceof com.avito.android.remote.model.TypedResult.Error     // Catch: java.lang.Exception -> L15
                if (r0 == 0) goto L90
                r0 = r7
                com.avito.android.remote.model.TypedResult$Error r0 = (com.avito.android.remote.model.TypedResult.Error) r0     // Catch: java.lang.Exception -> L15
                com.avito.android.remote.error.ApiError r0 = r0.getError()     // Catch: java.lang.Exception -> L15
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7     // Catch: java.lang.Exception -> L15
                java.lang.Throwable r7 = r7.getCause()     // Catch: java.lang.Exception -> L15
                com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r0, r7)     // Catch: java.lang.Exception -> L15
                throw r7     // Catch: java.lang.Exception -> L15
            L90:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L15
                r7.<init>()     // Catch: java.lang.Exception -> L15
                throw r7     // Catch: java.lang.Exception -> L15
            L96:
                com.avito.android.util.V2 r0 = com.avito.android.util.V2.f318762a
                java.lang.String r1 = "DEFAULT_TAG"
                java.lang.String r2 = "Language sync exception"
                r0.a(r1, r2, r7)
            L9f:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.language_selector.domain.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public h(@k InterfaceC19809a interfaceC19809a, @k InterfaceC42262b interfaceC42262b, @k InterfaceC42261a interfaceC42261a, @k E e12, @k R0 r02, @k InterfaceC49101b interfaceC49101b) {
        this.f174916a = interfaceC19809a;
        this.f174917b = interfaceC42262b;
        this.f174918c = interfaceC42261a;
        this.f174919d = e12;
        this.f174920e = r02;
        this.f174921f = interfaceC49101b;
        this.f174922g = U.a(r02.a());
    }

    @Override // com.avito.android.language_selector.domain.g
    public final void execute() {
        if (this.f174921f.c()) {
            C43259k.d(this.f174922g, null, null, new a(null), 3);
        }
    }
}
