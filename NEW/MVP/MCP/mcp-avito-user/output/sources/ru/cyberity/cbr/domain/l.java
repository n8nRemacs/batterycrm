package ru.cyberity.cbr.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.domain.l.a;

/* compiled from: UploadBaseDocumentDataUseCase.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0014B'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0014\u001a\u001a\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u0010\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u001bJ3\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0016H¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u001fJ3\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0016H¦@ø\u0001\u0000¢\u0006\u0004\b \u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001a\u0010\u000b\u001a\u00020\n8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\r\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b#\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lru/cyberity/cbr/domain/l;", "Lru/cyberity/cbr/domain/l$a;", "P", "Lru/cyberity/cbr/core/domain/base/b;", "", "Lru/cyberity/cbr/core/data/model/remote/k;", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/applicant/b;", "applicantRepository", "Lru/cyberity/cbr/core/data/source/settings/b;", "settingsRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/applicant/b;Lru/cyberity/cbr/core/data/source/settings/b;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "params", "Lru/cyberity/cbr/core/domain/model/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "a", "(Lru/cyberity/cbr/domain/l$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "applicantId", "Lru/cyberity/cbr/core/data/model/Document;", "documents", "Lkotlin/G0;", "(Ljava/lang/String;Ljava/util/List;Lru/cyberity/cbr/domain/l$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "country", "(Lru/cyberity/cbr/domain/l$a;Lru/cyberity/cbr/core/data/model/g;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lru/cyberity/cbr/core/data/source/applicant/b;", "()Lru/cyberity/cbr/core/data/source/applicant/b;", "c", "Lru/cyberity/cbr/core/data/source/settings/b;", "d", "()Lru/cyberity/cbr/core/data/source/settings/b;", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "()Lru/cyberity/cbr/core/data/source/dynamic/c;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class l<P extends a> extends ru.cyberity.cbr.core.domain.base.b<List<? extends ru.cyberity.cbr.core.data.model.remote.k>, P> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.applicant.b applicantRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.settings.b settingsRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* compiled from: UploadBaseDocumentDataUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.domain.UploadBaseDocumentDataUseCase", f = "UploadBaseDocumentDataUseCase.kt", i = {0, 0}, l = {50}, m = "preProcessDocuments$suspendImpl", n = {"$this", "applicantId"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434357a;

        /* renamed from: b, reason: collision with root package name */
        Object f434358b;

        /* renamed from: c, reason: collision with root package name */
        Object f434359c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f434360d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<P> f434361e;

        /* renamed from: f, reason: collision with root package name */
        int f434362f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l<P> lVar, Continuation<? super b> continuation) {
            super(continuation);
            this.f434361e = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434360d = obj;
            this.f434362f |= BeduinInputModel.MIN_TEXT_VERSION;
            return l.a(this.f434361e, null, null, null, this);
        }
    }

    /* compiled from: UploadBaseDocumentDataUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.domain.UploadBaseDocumentDataUseCase", f = "UploadBaseDocumentDataUseCase.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 4}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT, 31, 34, 36, 44}, m = "run$suspendImpl", n = {"$this", "params", "$this", "params", "applicant", "$this", "params", "applicant", "country", "$this", "$this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434363a;

        /* renamed from: b, reason: collision with root package name */
        Object f434364b;

        /* renamed from: c, reason: collision with root package name */
        Object f434365c;

        /* renamed from: d, reason: collision with root package name */
        Object f434366d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f434367e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ l<P> f434368f;

        /* renamed from: g, reason: collision with root package name */
        int f434369g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l<P> lVar, Continuation<? super c> continuation) {
            super(continuation);
            this.f434368f = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434367e = obj;
            this.f434369g |= BeduinInputModel.MIN_TEXT_VERSION;
            return l.a((l) this.f434368f, (a) null, (Continuation) this);
        }
    }

    public l(@Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.applicant.b bVar, @Y61.k ru.cyberity.cbr.core.data.source.settings.b bVar2, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        super(aVar);
        this.applicantRepository = bVar;
        this.settingsRepository = bVar2;
        this.dataRepository = cVar;
    }

    @Y61.l
    public Object a(@Y61.k String str, @Y61.k List<Document> list, @Y61.k P p12, @Y61.k Continuation<? super G0> continuation) {
        return a(this, str, list, p12, continuation);
    }

    @Y61.l
    public abstract Object a(@Y61.k P p12, @Y61.k ru.cyberity.cbr.core.data.model.g gVar, @Y61.k String str, @Y61.k Continuation<? super List<ru.cyberity.cbr.core.data.model.remote.k>> continuation);

    @Override // ru.cyberity.cbr.core.domain.base.b
    public /* bridge */ /* synthetic */ Object b(Object obj, Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ? extends List<? extends ru.cyberity.cbr.core.data.model.remote.k>>> continuation) {
        return a((l<P>) obj, (Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ? extends List<ru.cyberity.cbr.core.data.model.remote.k>>>) continuation);
    }

    @Y61.l
    public abstract Object b(@Y61.k P p12, @Y61.k ru.cyberity.cbr.core.data.model.g gVar, @Y61.k String str, @Y61.k Continuation<? super List<ru.cyberity.cbr.core.data.model.remote.k>> continuation);

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final ru.cyberity.cbr.core.data.source.settings.b getSettingsRepository() {
        return this.settingsRepository;
    }

    /* compiled from: UploadBaseDocumentDataUseCase.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\nR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/domain/l$a;", "", "Lru/cyberity/cbr/core/data/model/Document;", "a", "Lru/cyberity/cbr/core/data/model/Document;", "b", "()Lru/cyberity/cbr/core/data/model/Document;", "document", "", "Ljava/lang/String;", "()Ljava/lang/String;", "country", "", "c", "Z", "()Z", "parallelUpload", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;Ljava/lang/String;Z)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final Document document;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String country;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean parallelUpload;

        public a(@Y61.k Document document, @Y61.l String str, boolean z12) {
            this.document = document;
            this.country = str;
            this.parallelUpload = z12;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final Document getDocument() {
            return this.document;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getParallelUpload() {
            return this.parallelUpload;
        }

        public /* synthetic */ a(Document document, String str, boolean z12, int i12, C42822w c42822w) {
            this(document, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? false : z12);
        }
    }

    @Y61.l
    public Object a(@Y61.k P p12, @Y61.k Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ? extends List<ru.cyberity.cbr.core.data.model.remote.k>>> continuation) {
        return a((l) this, (a) p12, (Continuation) continuation);
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final ru.cyberity.cbr.core.data.source.applicant.b getApplicantRepository() {
        return this.applicantRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4 A[Catch: Exception -> 0x003b, TryCatch #1 {Exception -> 0x003b, blocks: (B:14:0x0036, B:74:0x013e, B:75:0x0140, B:19:0x0042, B:70:0x0129, B:65:0x0111, B:67:0x0117, B:71:0x012c, B:40:0x00b2, B:42:0x00c4, B:43:0x00c8, B:45:0x00ce, B:47:0x00db, B:55:0x00e9, B:57:0x00ed, B:59:0x00f3, B:62:0x00fb, B:30:0x007f, B:36:0x009a, B:33:0x0086), top: B:83:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0117 A[Catch: Exception -> 0x003b, TryCatch #1 {Exception -> 0x003b, blocks: (B:14:0x0036, B:74:0x013e, B:75:0x0140, B:19:0x0042, B:70:0x0129, B:65:0x0111, B:67:0x0117, B:71:0x012c, B:40:0x00b2, B:42:0x00c4, B:43:0x00c8, B:45:0x00ce, B:47:0x00db, B:55:0x00e9, B:57:0x00ed, B:59:0x00f3, B:62:0x00fb, B:30:0x007f, B:36:0x009a, B:33:0x0086), top: B:83:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012c A[Catch: Exception -> 0x003b, TryCatch #1 {Exception -> 0x003b, blocks: (B:14:0x0036, B:74:0x013e, B:75:0x0140, B:19:0x0042, B:70:0x0129, B:65:0x0111, B:67:0x0117, B:71:0x012c, B:40:0x00b2, B:42:0x00c4, B:43:0x00c8, B:45:0x00ce, B:47:0x00db, B:55:0x00e9, B:57:0x00ed, B:59:0x00f3, B:62:0x00fb, B:30:0x007f, B:36:0x009a, B:33:0x0086), top: B:83:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0159 A[RETURN] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, ru.cyberity.cbr.domain.l] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, ru.cyberity.cbr.domain.l] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [ru.cyberity.cbr.core.domain.base.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(ru.cyberity.cbr.domain.l r11, ru.cyberity.cbr.domain.l.a r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.domain.l.a(ru.cyberity.cbr.domain.l, ru.cyberity.cbr.domain.l$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ru.cyberity.cbr.domain.l r6, java.lang.String r7, java.util.List r8, ru.cyberity.cbr.domain.l.a r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof ru.cyberity.cbr.domain.l.b
            if (r0 == 0) goto L13
            r0 = r10
            ru.cyberity.cbr.domain.l$b r0 = (ru.cyberity.cbr.domain.l.b) r0
            int r1 = r0.f434362f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f434362f = r1
            goto L18
        L13:
            ru.cyberity.cbr.domain.l$b r0 = new ru.cyberity.cbr.domain.l$b
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f434360d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f434362f
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f434359c
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.f434358b
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.f434357a
            ru.cyberity.cbr.domain.l r8 = (ru.cyberity.cbr.domain.l) r8
            kotlin.C42729a0.b(r10)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L82
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.C42729a0.b(r10)
            java.util.Iterator r8 = r8.iterator()
        L47:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L67
            java.lang.Object r10 = r8.next()
            r2 = r10
            ru.cyberity.cbr.core.data.model.Document r2 = (ru.cyberity.cbr.core.data.model.Document) r2
            ru.cyberity.cbr.core.data.model.DocumentType r2 = r2.getType()
            ru.cyberity.cbr.core.data.model.Document r4 = r9.getDocument()
            ru.cyberity.cbr.core.data.model.DocumentType r4 = r4.getType()
            boolean r2 = kotlin.jvm.internal.L.f(r2, r4)
            if (r2 == 0) goto L47
            goto L68
        L67:
            r10 = 0
        L68:
            ru.cyberity.cbr.core.data.model.Document r10 = (ru.cyberity.cbr.core.data.model.Document) r10
            if (r10 == 0) goto L78
            ru.cyberity.cbr.core.data.model.Document$b r8 = r10.getResult()
            if (r8 == 0) goto L78
            java.util.List r8 = r8.h()
            if (r8 != 0) goto L7a
        L78:
            kotlin.collections.z0 r8 = kotlin.collections.C42784z0.f406748b
        L7a:
            java.util.Iterator r8 = r8.iterator()
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L82:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto La3
            java.lang.Object r9 = r6.next()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            ru.cyberity.cbr.core.data.source.applicant.b r10 = r7.applicantRepository
            r0.f434357a = r7
            r0.f434358b = r8
            r0.f434359c = r6
            r0.f434362f = r3
            java.lang.Object r9 = r10.a(r8, r9, r0)
            if (r9 != r1) goto L82
            return r1
        La3:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.domain.l.a(ru.cyberity.cbr.domain.l, java.lang.String, java.util.List, ru.cyberity.cbr.domain.l$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
