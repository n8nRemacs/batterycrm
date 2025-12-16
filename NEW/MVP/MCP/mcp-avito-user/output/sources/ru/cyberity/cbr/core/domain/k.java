package ru.cyberity.cbr.core.domain;

import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.model.r;

/* compiled from: DocumentsUseCase.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\f\u0010B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001b\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\f\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/core/domain/k;", "Lru/cyberity/cbr/core/domain/base/a;", "Lru/cyberity/cbr/core/domain/k$b;", "Lru/cyberity/cbr/core/domain/k$a;", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "Lru/cyberity/cbr/core/b;", "serviceLocator", "(Lru/cyberity/cbr/core/b;)V", "params", "a", "(Lru/cyberity/cbr/core/domain/k$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "()Lru/cyberity/cbr/core/data/source/dynamic/c;", "b", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class k extends ru.cyberity.cbr.core.domain.base.a<b, a> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* compiled from: DocumentsUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/core/domain/k$a;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "countryKey", "b", "extraDocumentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String countryKey;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String extraDocumentType;

        public a(@Y61.l String str, @Y61.l String str2) {
            this.countryKey = str;
            this.extraDocumentType = str2;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final String getCountryKey() {
            return this.countryKey;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getExtraDocumentType() {
            return this.extraDocumentType;
        }
    }

    /* compiled from: DocumentsUseCase.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/cyberity/cbr/core/domain/k$b;", "", "", "currentCountryKey", "", "Lru/cyberity/cbr/core/data/model/r;", "documents", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String currentCountryKey;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final List<r> documents;

        public b() {
            this(null, null, 3, null);
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getCurrentCountryKey() {
            return this.currentCountryKey;
        }

        @Y61.k
        public final List<r> d() {
            return this.documents;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return L.f(this.currentCountryKey, bVar.currentCountryKey) && L.f(this.documents, bVar.documents);
        }

        public int hashCode() {
            String str = this.currentCountryKey;
            return this.documents.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Result(currentCountryKey=");
            sb2.append(this.currentCountryKey);
            sb2.append(", documents=");
            return H.p(sb2, this.documents, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.l String str, @Y61.k List<? extends r> list) {
            this.currentCountryKey = str;
            this.documents = list;
        }

        public b(String str, List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? C42784z0.f406748b : list);
        }
    }

    /* compiled from: DocumentsUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.domain.DocumentsUseCase", f = "DocumentsUseCase.kt", i = {0, 0, 1, 1, 1}, l = {17, 22}, m = "run", n = {"this", "params", "params", "documentsByCountries", "currentCountryKey"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433966a;

        /* renamed from: b, reason: collision with root package name */
        Object f433967b;

        /* renamed from: c, reason: collision with root package name */
        Object f433968c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f433969d;

        /* renamed from: f, reason: collision with root package name */
        int f433971f;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433969d = obj;
            this.f433971f |= BeduinInputModel.MIN_TEXT_VERSION;
            return k.this.a(null, this);
        }
    }

    public k(@Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        this.dataRepository = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019b  */
    /* JADX WARN: Type inference failed for: r3v28, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k ru.cyberity.cbr.core.domain.k.a r18, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.domain.k.b> r19) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.domain.k.a(ru.cyberity.cbr.core.domain.k$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public k(@Y61.k ru.cyberity.cbr.core.b bVar) {
        this(bVar.m());
    }
}
