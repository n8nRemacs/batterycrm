package ru.cyberity.cbr.domain;

import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.model.Document;

/* compiled from: GetApplicantDataAndUpdateStatusIfNeededUseCase.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0010B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\r\u001a\u00020\fH\u0086Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/domain/e;", "", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/applicant/b;", "applicantRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "", "logTagSuffix", "<init>", "(Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/applicant/b;Lru/cyberity/cbr/core/data/source/dynamic/c;Ljava/lang/String;)V", "", "reload", "Lkotlin/Z;", "Lru/cyberity/cbr/domain/e$a;", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/common/a;", "b", "Lru/cyberity/cbr/core/data/source/applicant/b;", "c", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "d", "Ljava/lang/String;", "logTag", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.common.a commonRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.applicant.b applicantRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String logTag;

    /* compiled from: GetApplicantDataAndUpdateStatusIfNeededUseCase.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/domain/e$a;", "", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "", "Lru/cyberity/cbr/core/data/model/Document;", "documents", "<init>", "(Lru/cyberity/cbr/core/data/model/g;Ljava/util/List;)V", "a", "()Lru/cyberity/cbr/core/data/model/g;", "b", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/data/model/g;", "c", "Ljava/util/List;", "d", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final ru.cyberity.cbr.core.data.model.g applicant;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final List<Document> documents;

        public a(@Y61.k ru.cyberity.cbr.core.data.model.g gVar, @Y61.k List<Document> list) {
            this.applicant = gVar;
            this.documents = list;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final ru.cyberity.cbr.core.data.model.g getApplicant() {
            return this.applicant;
        }

        @Y61.k
        public final List<Document> b() {
            return this.documents;
        }

        @Y61.k
        public final ru.cyberity.cbr.core.data.model.g c() {
            return this.applicant;
        }

        @Y61.k
        public final List<Document> d() {
            return this.documents;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return L.f(this.applicant, aVar.applicant) && L.f(this.documents, aVar.documents);
        }

        public int hashCode() {
            return this.documents.hashCode() + (this.applicant.hashCode() * 31);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CBRApplicantData(applicant=");
            sb2.append(this.applicant);
            sb2.append(", documents=");
            return H.p(sb2, this.documents, ')');
        }
    }

    /* compiled from: GetApplicantDataAndUpdateStatusIfNeededUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.domain.GetApplicantDataAndUpdateStatusIfNeededUseCase", f = "GetApplicantDataAndUpdateStatusIfNeededUseCase.kt", i = {0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5}, l = {AvailableCode.HMS_IS_SPOOF, 30, 34, 37, 42, 50}, m = "invoke-gIAlu-s", n = {"this", "reload", "this", "applicant", "this", "applicant", "documents", "applicantId", "this", "applicant", "documents", "applicantId", "this", "applicant", "applicantId", "sortedDocuments", "this", "applicant", "sortedDocuments"}, s = {"L$0", "Z$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434285a;

        /* renamed from: b, reason: collision with root package name */
        Object f434286b;

        /* renamed from: c, reason: collision with root package name */
        Object f434287c;

        /* renamed from: d, reason: collision with root package name */
        Object f434288d;

        /* renamed from: e, reason: collision with root package name */
        boolean f434289e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f434290f;

        /* renamed from: h, reason: collision with root package name */
        int f434292h;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434290f = obj;
            this.f434292h |= BeduinInputModel.MIN_TEXT_VERSION;
            Object objA = e.this.a(false, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
        }
    }

    public e(@Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.applicant.b bVar, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @Y61.k String str) {
        this.commonRepository = aVar;
        this.applicantRepository = bVar;
        this.dataRepository = cVar;
        this.logTag = "GetApplUptStat_".concat(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141 A[Catch: Exception -> 0x019b, TryCatch #1 {Exception -> 0x019b, blocks: (B:83:0x020d, B:85:0x0213, B:86:0x0218, B:18:0x0056, B:56:0x017d, B:59:0x0188, B:61:0x0190, B:63:0x0194, B:75:0x01b7, B:68:0x019e, B:69:0x01a2, B:71:0x01a8, B:21:0x0070, B:52:0x0159, B:25:0x0088, B:47:0x0131, B:49:0x0141), top: B:94:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0190 A[Catch: Exception -> 0x019b, TryCatch #1 {Exception -> 0x019b, blocks: (B:83:0x020d, B:85:0x0213, B:86:0x0218, B:18:0x0056, B:56:0x017d, B:59:0x0188, B:61:0x0190, B:63:0x0194, B:75:0x01b7, B:68:0x019e, B:69:0x01a2, B:71:0x01a8, B:21:0x0070, B:52:0x0159, B:25:0x0088, B:47:0x0131, B:49:0x0141), top: B:94:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f5 A[Catch: Exception -> 0x0043, TRY_LEAVE, TryCatch #3 {Exception -> 0x0043, blocks: (B:13:0x003e, B:79:0x01ed, B:81:0x01f5), top: B:97:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0213 A[Catch: Exception -> 0x019b, TryCatch #1 {Exception -> 0x019b, blocks: (B:83:0x020d, B:85:0x0213, B:86:0x0218, B:18:0x0056, B:56:0x017d, B:59:0x0188, B:61:0x0190, B:63:0x0194, B:75:0x01b7, B:68:0x019e, B:69:0x01a2, B:71:0x01a8, B:21:0x0070, B:52:0x0159, B:25:0x0088, B:47:0x0131, B:49:0x0141), top: B:94:0x0027 }] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, ru.cyberity.cbr.domain.e] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r22, @Y61.k kotlin.coroutines.Continuation<? super kotlin.Z<ru.cyberity.cbr.domain.e.a>> r23) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.domain.e.a(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object a(e eVar, boolean z12, Continuation continuation, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = false;
        }
        return eVar.a(z12, continuation);
    }
}
