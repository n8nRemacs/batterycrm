package ru.cyberity.cbr.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.source.applicant.remote.t;
import ru.cyberity.cbr.core.data.source.applicant.remote.v;

/* compiled from: RequestQuestionnaireUseCase.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/domain/g;", "", "Lru/cyberity/cbr/core/data/source/applicant/b;", "applicantRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/b;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "Lru/cyberity/cbr/core/b;", "serviceLocator", "(Lru/cyberity/cbr/core/b;)V", "Lkotlin/Z;", "Lru/cyberity/cbr/domain/g$a;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/applicant/b;", "b", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.applicant.b applicantRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* compiled from: RequestQuestionnaireUseCase.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/domain/g$a;", "", "Lru/cyberity/cbr/core/data/source/applicant/remote/t;", "questionnaireResponse", "Lru/cyberity/cbr/core/data/source/applicant/remote/v;", "questionnaireSubmitModel", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/remote/t;Lru/cyberity/cbr/core/data/source/applicant/remote/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/core/data/source/applicant/remote/t;", "c", "()Lru/cyberity/cbr/core/data/source/applicant/remote/t;", "b", "Lru/cyberity/cbr/core/data/source/applicant/remote/v;", "d", "()Lru/cyberity/cbr/core/data/source/applicant/remote/v;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final t questionnaireResponse;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final v questionnaireSubmitModel;

        public a(@Y61.k t tVar, @Y61.l v vVar) {
            this.questionnaireResponse = tVar;
            this.questionnaireSubmitModel = vVar;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final t getQuestionnaireResponse() {
            return this.questionnaireResponse;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final v getQuestionnaireSubmitModel() {
            return this.questionnaireSubmitModel;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return L.f(this.questionnaireResponse, aVar.questionnaireResponse) && L.f(this.questionnaireSubmitModel, aVar.questionnaireSubmitModel);
        }

        public int hashCode() {
            int iHashCode = this.questionnaireResponse.hashCode() * 31;
            v vVar = this.questionnaireSubmitModel;
            return iHashCode + (vVar == null ? 0 : vVar.hashCode());
        }

        @Y61.k
        public String toString() {
            return "QuestionnaireInfo(questionnaireResponse=" + this.questionnaireResponse + ", questionnaireSubmitModel=" + this.questionnaireSubmitModel + ')';
        }
    }

    /* compiled from: RequestQuestionnaireUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.domain.RequestQuestionnaireUseCase", f = "RequestQuestionnaireUseCase.kt", i = {0, 1, 1}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, 32}, m = "invoke-IoAF18A", n = {"this", "applicant", "applicantId"}, s = {"L$0", "L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434318a;

        /* renamed from: b, reason: collision with root package name */
        Object f434319b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f434320c;

        /* renamed from: e, reason: collision with root package name */
        int f434322e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434320c = obj;
            this.f434322e |= BeduinInputModel.MIN_TEXT_VERSION;
            Object objA = g.this.a(this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
        }
    }

    public g(@Y61.k ru.cyberity.cbr.core.data.source.applicant.b bVar, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        this.applicantRepository = bVar;
        this.dataRepository = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.Continuation<? super kotlin.Z<ru.cyberity.cbr.domain.g.a>> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof ru.cyberity.cbr.domain.g.b
            if (r0 == 0) goto L13
            r0 = r12
            ru.cyberity.cbr.domain.g$b r0 = (ru.cyberity.cbr.domain.g.b) r0
            int r1 = r0.f434322e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f434322e = r1
            goto L18
        L13:
            ru.cyberity.cbr.domain.g$b r0 = new ru.cyberity.cbr.domain.g$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f434320c
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f434322e
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L48
            if (r1 == r9) goto L40
            if (r1 != r8) goto L38
            java.lang.Object r1 = r0.f434319b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f434318a
            ru.cyberity.cbr.core.data.model.g r0 = (ru.cyberity.cbr.core.data.model.g) r0
            kotlin.C42729a0.b(r12)     // Catch: java.lang.Exception -> L35
            goto L9e
        L35:
            r12 = move-exception
            goto Lb9
        L38:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L40:
            java.lang.Object r1 = r0.f434318a
            ru.cyberity.cbr.domain.g r1 = (ru.cyberity.cbr.domain.g) r1
            kotlin.C42729a0.b(r12)     // Catch: java.lang.Exception -> L35
            goto L5e
        L48:
            kotlin.C42729a0.b(r12)
            ru.cyberity.cbr.core.data.source.dynamic.c r1 = r11.dataRepository     // Catch: java.lang.Exception -> L35
            r0.f434318a = r11     // Catch: java.lang.Exception -> L35
            r0.f434322e = r9     // Catch: java.lang.Exception -> L35
            r2 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            r4 = r0
            java.lang.Object r12 = ru.cyberity.cbr.core.data.source.dynamic.c.b(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L35
            if (r12 != r7) goto L5d
            return r7
        L5d:
            r1 = r11
        L5e:
            ru.cyberity.cbr.core.data.model.g r12 = (ru.cyberity.cbr.core.data.model.g) r12     // Catch: java.lang.Exception -> L35
            java.lang.String r2 = r12.getId()     // Catch: java.lang.Exception -> L35
            ru.cyberity.cbr.core.data.model.DocumentType r3 = new ru.cyberity.cbr.core.data.model.DocumentType     // Catch: java.lang.Exception -> L35
            java.lang.String r4 = "QUESTIONNAIRE"
            r3.<init>(r4)     // Catch: java.lang.Exception -> L35
            ru.cyberity.cbr.core.data.model.g$c$a r3 = r12.a(r3)     // Catch: java.lang.Exception -> L35
            if (r3 == 0) goto L77
            java.lang.String r4 = r3.getQuestionnaireId()     // Catch: java.lang.Exception -> L35
            if (r4 != 0) goto L7f
        L77:
            if (r3 == 0) goto L7e
            java.lang.String r4 = r3.getQuestionnaireDefId()     // Catch: java.lang.Exception -> L35
            goto L7f
        L7e:
            r4 = 0
        L7f:
            if (r4 == 0) goto L89
            int r3 = r4.length()     // Catch: java.lang.Exception -> L35
            if (r3 != 0) goto L88
            goto L89
        L88:
            r9 = 0
        L89:
            if (r9 != 0) goto Lb1
            ru.cyberity.cbr.core.data.source.applicant.b r1 = r1.applicantRepository     // Catch: java.lang.Exception -> L35
            r0.f434318a = r12     // Catch: java.lang.Exception -> L35
            r0.f434319b = r2     // Catch: java.lang.Exception -> L35
            r0.f434322e = r8     // Catch: java.lang.Exception -> L35
            java.lang.Object r0 = r1.f(r4, r0)     // Catch: java.lang.Exception -> L35
            if (r0 != r7) goto L9a
            return r7
        L9a:
            r1 = r2
            r10 = r0
            r0 = r12
            r12 = r10
        L9e:
            ru.cyberity.cbr.core.data.source.applicant.remote.t r12 = (ru.cyberity.cbr.core.data.source.applicant.remote.t) r12     // Catch: java.lang.Exception -> L35
            int r2 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L35
            ru.cyberity.cbr.domain.g$a r2 = new ru.cyberity.cbr.domain.g$a     // Catch: java.lang.Exception -> L35
            ru.cyberity.cbr.core.data.source.applicant.remote.v r3 = new ru.cyberity.cbr.core.data.source.applicant.remote.v     // Catch: java.lang.Exception -> L35
            java.util.List r0 = r0.H()     // Catch: java.lang.Exception -> L35
            r3.<init>(r1, r0)     // Catch: java.lang.Exception -> L35
            r2.<init>(r12, r3)     // Catch: java.lang.Exception -> L35
            goto Lc0
        Lb1:
            java.lang.String r12 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L35
            r0.<init>(r12)     // Catch: java.lang.Exception -> L35
            throw r0     // Catch: java.lang.Exception -> L35
        Lb9:
            int r0 = kotlin.Z.f406624c
            kotlin.Z$b r2 = new kotlin.Z$b
            r2.<init>(r12)
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.domain.g.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public g(@Y61.k ru.cyberity.cbr.core.b bVar) {
        this(bVar.e(), bVar.m());
    }
}
