package ru.cyberity.cbr.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SetApplicantLanguageUseCase.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lru/cyberity/cbr/domain/h;", "", "", "language", "Lkotlin/Z;", "Lkotlin/G0;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/common/a;", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "b", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.common.a commonRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* compiled from: SetApplicantLanguageUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.domain.SetApplicantLanguageUseCase", f = "SetApplicantLanguageUseCase.kt", i = {0, 0, 1}, l = {15, 16}, m = "invoke-gIAlu-s", n = {"this", "language", "this"}, s = {"L$0", "L$1", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434325a;

        /* renamed from: b, reason: collision with root package name */
        Object f434326b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f434327c;

        /* renamed from: e, reason: collision with root package name */
        int f434329e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434327c = obj;
            this.f434329e |= BeduinInputModel.MIN_TEXT_VERSION;
            Object objA = h.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v6 */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r11, @Y61.k kotlin.coroutines.Continuation<? super kotlin.Z<kotlin.G0>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof ru.cyberity.cbr.domain.h.a
            if (r0 == 0) goto L13
            r0 = r12
            ru.cyberity.cbr.domain.h$a r0 = (ru.cyberity.cbr.domain.h.a) r0
            int r1 = r0.f434329e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f434329e = r1
            goto L18
        L13:
            ru.cyberity.cbr.domain.h$a r0 = new ru.cyberity.cbr.domain.h$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f434327c
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f434329e
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L4d
            if (r1 == r2) goto L3a
            if (r1 != r8) goto L32
            java.lang.Object r11 = r0.f434325a
            ru.cyberity.cbr.domain.h r11 = (ru.cyberity.cbr.domain.h) r11
            kotlin.C42729a0.b(r12)     // Catch: java.lang.Exception -> L30
            goto L7d
        L30:
            r12 = move-exception
            goto L84
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            java.lang.Object r11 = r0.f434326b
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r0.f434325a
            ru.cyberity.cbr.domain.h r1 = (ru.cyberity.cbr.domain.h) r1
            kotlin.C42729a0.b(r12)     // Catch: java.lang.Exception -> L4a
            r9 = r12
            r12 = r11
            r11 = r1
            r1 = r9
            goto L67
        L4a:
            r12 = move-exception
            r11 = r1
            goto L84
        L4d:
            kotlin.C42729a0.b(r12)
            ru.cyberity.cbr.core.data.source.dynamic.c r1 = r10.dataRepository     // Catch: java.lang.Exception -> L82
            r0.f434325a = r10     // Catch: java.lang.Exception -> L82
            r0.f434326b = r11     // Catch: java.lang.Exception -> L82
            r0.f434329e = r2     // Catch: java.lang.Exception -> L82
            r2 = 0
            r3 = 0
            r5 = 1
            r6 = 0
            r4 = r0
            java.lang.Object r12 = ru.cyberity.cbr.core.data.source.dynamic.c.b(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L82
            if (r12 != r7) goto L64
            return r7
        L64:
            r1 = r12
            r12 = r11
            r11 = r10
        L67:
            ru.cyberity.cbr.core.data.model.g r1 = (ru.cyberity.cbr.core.data.model.g) r1     // Catch: java.lang.Exception -> L30
            ru.cyberity.cbr.core.data.source.common.a r2 = r11.commonRepository     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = r1.getId()     // Catch: java.lang.Exception -> L30
            r0.f434325a = r11     // Catch: java.lang.Exception -> L30
            r3 = 0
            r0.f434326b = r3     // Catch: java.lang.Exception -> L30
            r0.f434329e = r8     // Catch: java.lang.Exception -> L30
            java.lang.Object r12 = r2.a(r1, r12, r0)     // Catch: java.lang.Exception -> L30
            if (r12 != r7) goto L7d
            return r7
        L7d:
            int r12 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L30
            kotlin.G0 r11 = kotlin.G0.f406611a     // Catch: java.lang.Exception -> L30
            goto L92
        L82:
            r12 = move-exception
            r11 = r10
        L84:
            int r0 = kotlin.Z.f406624c
            ru.cyberity.cbr.core.data.source.common.a r11 = r11.commonRepository
            java.lang.Exception r11 = ru.cyberity.cbr.core.domain.base.d.a(r11, r12)
            kotlin.Z$b r12 = new kotlin.Z$b
            r12.<init>(r11)
            r11 = r12
        L92:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.domain.h.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
