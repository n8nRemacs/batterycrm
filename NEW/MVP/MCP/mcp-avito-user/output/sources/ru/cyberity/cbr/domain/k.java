package ru.cyberity.cbr.domain;

import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.L;

/* compiled from: UploadApplicantDataUseCase.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018J+\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lru/cyberity/cbr/domain/k;", "Lru/cyberity/cbr/core/domain/base/b;", "Lru/cyberity/cbr/core/data/model/g;", "Lru/cyberity/cbr/domain/k$a;", "params", "Lru/cyberity/cbr/core/domain/model/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "a", "(Lru/cyberity/cbr/domain/k$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/applicant/b;", "b", "Lru/cyberity/cbr/core/data/source/applicant/b;", "applicantRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "c", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/applicant/b;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "Lru/cyberity/cbr/core/b;", "serviceLocator", "(Lru/cyberity/cbr/core/b;)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class k extends ru.cyberity.cbr.core.domain.base.b<ru.cyberity.cbr.core.data.model.g, a> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.applicant.b applicantRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* compiled from: UploadApplicantDataUseCase.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006!"}, d2 = {"Lru/cyberity/cbr/domain/k$a;", "", "", "", LocalPublishState.FIELDS, "", "unsetFields", "Lru/cyberity/cbr/core/data/model/remote/e;", "customFields", "unsetCoreFields", "<init>", "(Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "b", "Ljava/util/List;", "h", "()Ljava/util/List;", "c", "e", "d", "g", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final Map<String, Object> fields;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final List<String> unsetFields;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final List<ru.cyberity.cbr.core.data.model.remote.e> customFields;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final List<String> unsetCoreFields;

        public a(@Y61.k Map<String, ? extends Object> map, @Y61.l List<String> list, @Y61.k List<ru.cyberity.cbr.core.data.model.remote.e> list2, @Y61.l List<String> list3) {
            this.fields = map;
            this.unsetFields = list;
            this.customFields = list2;
            this.unsetCoreFields = list3;
        }

        @Y61.k
        public final List<ru.cyberity.cbr.core.data.model.remote.e> e() {
            return this.customFields;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return L.f(this.fields, aVar.fields) && L.f(this.unsetFields, aVar.unsetFields) && L.f(this.customFields, aVar.customFields) && L.f(this.unsetCoreFields, aVar.unsetCoreFields);
        }

        @Y61.k
        public final Map<String, Object> f() {
            return this.fields;
        }

        @Y61.l
        public final List<String> g() {
            return this.unsetCoreFields;
        }

        @Y61.l
        public final List<String> h() {
            return this.unsetFields;
        }

        public int hashCode() {
            int iHashCode = this.fields.hashCode() * 31;
            List<String> list = this.unsetFields;
            int iE2 = H.e((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.customFields);
            List<String> list2 = this.unsetCoreFields;
            return iE2 + (list2 != null ? list2.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Params(fields=");
            sb2.append(this.fields);
            sb2.append(", unsetFields=");
            sb2.append(this.unsetFields);
            sb2.append(", customFields=");
            sb2.append(this.customFields);
            sb2.append(", unsetCoreFields=");
            return H.p(sb2, this.unsetCoreFields, ')');
        }
    }

    /* compiled from: UploadApplicantDataUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.domain.UploadApplicantDataUseCase", f = "UploadApplicantDataUseCase.kt", i = {0, 0, 1, 1, 1, 1}, l = {30, 45, 52}, m = "run", n = {"this", "params", "this", "params", "applicant", "applicantId"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434344a;

        /* renamed from: b, reason: collision with root package name */
        Object f434345b;

        /* renamed from: c, reason: collision with root package name */
        Object f434346c;

        /* renamed from: d, reason: collision with root package name */
        Object f434347d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f434348e;

        /* renamed from: g, reason: collision with root package name */
        int f434350g;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434348e = obj;
            this.f434350g |= BeduinInputModel.MIN_TEXT_VERSION;
            return k.this.a((a) null, (Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ru.cyberity.cbr.core.data.model.g>>) this);
        }
    }

    public k(@Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.applicant.b bVar, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        super(aVar);
        this.applicantRepository = bVar;
        this.dataRepository = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x013d A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:14:0x0034, B:79:0x01fb, B:21:0x0054, B:61:0x0132, B:63:0x013d, B:64:0x014c, B:66:0x0152, B:67:0x0169, B:68:0x016c, B:69:0x0174, B:71:0x017a, B:72:0x018c, B:73:0x01bf, B:75:0x01c5, B:76:0x01e0, B:24:0x0061, B:31:0x0085, B:32:0x009c, B:34:0x00a2, B:36:0x00b4, B:37:0x00c0, B:39:0x00cd, B:42:0x00d3, B:43:0x00dc, B:45:0x00e2, B:47:0x00ea, B:49:0x00ef, B:51:0x00f7, B:53:0x0105, B:55:0x010b, B:56:0x0116, B:57:0x0119, B:27:0x006e), top: B:83:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017a A[Catch: Exception -> 0x0039, LOOP:1: B:69:0x0174->B:71:0x017a, LOOP_END, TryCatch #0 {Exception -> 0x0039, blocks: (B:14:0x0034, B:79:0x01fb, B:21:0x0054, B:61:0x0132, B:63:0x013d, B:64:0x014c, B:66:0x0152, B:67:0x0169, B:68:0x016c, B:69:0x0174, B:71:0x017a, B:72:0x018c, B:73:0x01bf, B:75:0x01c5, B:76:0x01e0, B:24:0x0061, B:31:0x0085, B:32:0x009c, B:34:0x00a2, B:36:0x00b4, B:37:0x00c0, B:39:0x00cd, B:42:0x00d3, B:43:0x00dc, B:45:0x00e2, B:47:0x00ea, B:49:0x00ef, B:51:0x00f7, B:53:0x0105, B:55:0x010b, B:56:0x0116, B:57:0x0119, B:27:0x006e), top: B:83:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c5 A[Catch: Exception -> 0x0039, LOOP:2: B:73:0x01bf->B:75:0x01c5, LOOP_END, TryCatch #0 {Exception -> 0x0039, blocks: (B:14:0x0034, B:79:0x01fb, B:21:0x0054, B:61:0x0132, B:63:0x013d, B:64:0x014c, B:66:0x0152, B:67:0x0169, B:68:0x016c, B:69:0x0174, B:71:0x017a, B:72:0x018c, B:73:0x01bf, B:75:0x01c5, B:76:0x01e0, B:24:0x0061, B:31:0x0085, B:32:0x009c, B:34:0x00a2, B:36:0x00b4, B:37:0x00c0, B:39:0x00cd, B:42:0x00d3, B:43:0x00dc, B:45:0x00e2, B:47:0x00ea, B:49:0x00ef, B:51:0x00f7, B:53:0x0105, B:55:0x010b, B:56:0x0116, B:57:0x0119, B:27:0x006e), top: B:83:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k ru.cyberity.cbr.domain.k.a r18, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends java.lang.Exception, ru.cyberity.cbr.core.data.model.g>> r19) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.domain.k.a(ru.cyberity.cbr.domain.k$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.core.domain.base.b
    public /* bridge */ /* synthetic */ Object b(a aVar, Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ? extends ru.cyberity.cbr.core.data.model.g>> continuation) {
        return a(aVar, (Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ru.cyberity.cbr.core.data.model.g>>) continuation);
    }

    public k(@Y61.k ru.cyberity.cbr.core.b bVar) {
        this(bVar.k(), bVar.e(), bVar.m());
    }
}
