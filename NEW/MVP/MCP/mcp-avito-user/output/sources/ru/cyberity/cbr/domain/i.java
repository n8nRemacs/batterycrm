package ru.cyberity.cbr.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SubmitQuestionnaireUseCase.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/domain/i;", "", "Lru/cyberity/cbr/core/data/source/applicant/b;", "applicantRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/b;)V", "Lru/cyberity/cbr/core/data/source/applicant/remote/r;", "questionnaire", "Lkotlin/Z;", "Lru/cyberity/cbr/core/data/source/applicant/remote/t;", "a", "(Lru/cyberity/cbr/core/data/source/applicant/remote/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/applicant/b;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.applicant.b applicantRepository;

    /* compiled from: SubmitQuestionnaireUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.domain.SubmitQuestionnaireUseCase", f = "SubmitQuestionnaireUseCase.kt", i = {}, l = {15}, m = "invoke-gIAlu-s", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f434331a;

        /* renamed from: c, reason: collision with root package name */
        int f434333c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434331a = obj;
            this.f434333c |= BeduinInputModel.MIN_TEXT_VERSION;
            Object objA = i.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
        }
    }

    public i(@Y61.k ru.cyberity.cbr.core.data.source.applicant.b bVar) {
        this.applicantRepository = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k ru.cyberity.cbr.core.data.source.applicant.remote.r r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.Z<ru.cyberity.cbr.core.data.source.applicant.remote.t>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ru.cyberity.cbr.domain.i.a
            if (r0 == 0) goto L13
            r0 = r6
            ru.cyberity.cbr.domain.i$a r0 = (ru.cyberity.cbr.domain.i.a) r0
            int r1 = r0.f434333c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f434333c = r1
            goto L18
        L13:
            ru.cyberity.cbr.domain.i$a r0 = new ru.cyberity.cbr.domain.i$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f434331a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f434333c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Exception -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            ru.cyberity.cbr.core.data.source.applicant.b r6 = r4.applicantRepository     // Catch: java.lang.Exception -> L29
            r0.f434333c = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = r6.a(r5, r0)     // Catch: java.lang.Exception -> L29
            if (r6 != r1) goto L41
            return r1
        L41:
            ru.cyberity.cbr.core.data.source.applicant.remote.t r6 = (ru.cyberity.cbr.core.data.source.applicant.remote.t) r6     // Catch: java.lang.Exception -> L29
            int r5 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L29
            goto L4d
        L46:
            int r6 = kotlin.Z.f406624c
            kotlin.Z$b r6 = new kotlin.Z$b
            r6.<init>(r5)
        L4d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.domain.i.a(ru.cyberity.cbr.core.data.source.applicant.remote.r, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
