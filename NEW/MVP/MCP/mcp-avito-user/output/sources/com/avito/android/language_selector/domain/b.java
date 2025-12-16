package com.avito.android.language_selector.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import aR.InterfaceC19809a;
import androidx.compose.runtime.internal.P;
import com.avito.android.language_selector.presentation.Language;
import com.avito.android.language_selector.presentation.mvi.entity.LanguageSelectorInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import jJ.InterfaceC42262b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LanguageSelectUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/language_selector/domain/b;", "Lcom/avito/android/language_selector/domain/a;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.language_selector.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC19809a f174896a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42262b f174897b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f174898c;

    /* compiled from: LanguageSelectUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.language_selector.domain.LanguageSelectUseCaseImpl$invoke$1", f = "LanguageSelectUseCase.kt", i = {0, 1, 2}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF, 31, 34, 36}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Language f174899q;

        /* renamed from: r, reason: collision with root package name */
        public int f174900r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f174901s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Language f174903u;

        /* compiled from: LanguageSelectUseCase.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.language_selector.domain.LanguageSelectUseCaseImpl$invoke$1$1$1", f = "LanguageSelectUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.language_selector.domain.b$a$a, reason: collision with other inner class name */
        public static final class C5154a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ b f174904q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ Language f174905r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5154a(b bVar, Language language, Continuation<? super C5154a> continuation) {
                super(2, continuation);
                this.f174904q = bVar;
                this.f174905r = language;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C5154a(this.f174904q, this.f174905r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C5154a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                this.f174904q.f174897b.b(this.f174905r.f174937b);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Language language, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f174903u = language;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f174903u, continuation);
            aVar.f174901s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f174900r
                com.avito.android.language_selector.presentation.Language r2 = r11.f174903u
                com.avito.android.language_selector.domain.b r3 = com.avito.android.language_selector.domain.b.this
                r4 = 5
                r5 = 4
                r6 = 3
                r7 = 2
                r8 = 1
                r9 = 0
                if (r1 == 0) goto L44
                if (r1 == r8) goto L3c
                if (r1 == r7) goto L34
                if (r1 == r6) goto L2a
                if (r1 == r5) goto L25
                if (r1 != r4) goto L1d
                goto L25
            L1d:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L25:
                kotlin.C42729a0.b(r12)
                goto Lce
            L2a:
                com.avito.android.language_selector.presentation.Language r2 = r11.f174899q
                java.lang.Object r1 = r11.f174901s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L9a
            L34:
                java.lang.Object r1 = r11.f174901s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L74
            L3c:
                java.lang.Object r1 = r11.f174901s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L5c
            L44:
                kotlin.C42729a0.b(r12)
                java.lang.Object r12 = r11.f174901s
                r1 = r12
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.language_selector.presentation.mvi.entity.LanguageSelectorInternalAction$SaveNewLanguage$Started r12 = new com.avito.android.language_selector.presentation.mvi.entity.LanguageSelectorInternalAction$SaveNewLanguage$Started
                r12.<init>()
                r11.f174901s = r1
                r11.f174900r = r8
                java.lang.Object r12 = r1.emit(r12, r11)
                if (r12 != r0) goto L5c
                return r0
            L5c:
                aR.a r12 = r3.f174896a
                cR.a r8 = new cR.a
                java.util.Locale r10 = r2.f174937b
                java.lang.String r10 = r10.toLanguageTag()
                r8.<init>(r10)
                r11.f174901s = r1
                r11.f174900r = r7
                java.lang.Object r12 = r12.a(r8, r11)
                if (r12 != r0) goto L74
                return r0
            L74:
                com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
                boolean r7 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r7 == 0) goto Lac
                com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
                java.lang.Object r12 = r12.getResult()
                cR.b r12 = (cR.b) r12
                com.avito.android.util.R0 r12 = r3.f174898c
                kotlinx.coroutines.d1 r12 = r12.b()
                com.avito.android.language_selector.domain.b$a$a r4 = new com.avito.android.language_selector.domain.b$a$a
                r4.<init>(r3, r2, r9)
                r11.f174901s = r1
                r11.f174899q = r2
                r11.f174900r = r6
                java.lang.Object r12 = kotlinx.coroutines.C43259k.g(r12, r4, r11)
                if (r12 != r0) goto L9a
                return r0
            L9a:
                com.avito.android.language_selector.presentation.mvi.entity.LanguageSelectorInternalAction$SaveNewLanguage$Success r12 = new com.avito.android.language_selector.presentation.mvi.entity.LanguageSelectorInternalAction$SaveNewLanguage$Success
                r12.<init>(r2)
                r11.f174901s = r9
                r11.f174899q = r9
                r11.f174900r = r5
                java.lang.Object r12 = r1.emit(r12, r11)
                if (r12 != r0) goto Lce
                return r0
            Lac:
                boolean r2 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Ld1
                com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
                com.avito.android.remote.error.ApiError r2 = r12.getError()
                java.lang.Throwable r12 = r12.getCause()
                com.avito.android.util.ApiException r12 = com.avito.android.util.C35936s.a(r2, r12)
                com.avito.android.language_selector.presentation.mvi.entity.LanguageSelectorInternalAction$SaveNewLanguage$Failed r2 = new com.avito.android.language_selector.presentation.mvi.entity.LanguageSelectorInternalAction$SaveNewLanguage$Failed
                r2.<init>(r12)
                r11.f174901s = r9
                r11.f174900r = r4
                java.lang.Object r12 = r1.emit(r2, r11)
                if (r12 != r0) goto Lce
                return r0
            Lce:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            Ld1:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.language_selector.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k InterfaceC19809a interfaceC19809a, @k InterfaceC42262b interfaceC42262b, @k R0 r02) {
        this.f174896a = interfaceC19809a;
        this.f174897b = interfaceC42262b;
        this.f174898c = r02;
    }

    @Override // com.avito.android.language_selector.domain.a
    @k
    public final InterfaceC43160i<LanguageSelectorInternalAction> a(@k Language language) {
        return C43175k.I(this.f174898c.a(), C43175k.G(new a(language, null)));
    }
}
