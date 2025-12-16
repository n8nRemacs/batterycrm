package ru.cyberity.cbr.domain;

import Y41.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43225h;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.IdentitySide;
import ru.cyberity.cbr.core.data.model.o;
import ru.cyberity.cbr.domain.l;

/* compiled from: UploadDocumentImagesUseCase.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ3\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lru/cyberity/cbr/domain/m;", "Lru/cyberity/cbr/domain/l;", "Lru/cyberity/cbr/domain/m$a;", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/applicant/b;", "applicantRepository", "Lru/cyberity/cbr/core/data/source/settings/b;", "settingsRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/applicant/b;Lru/cyberity/cbr/core/data/source/settings/b;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "Lru/cyberity/cbr/core/b;", "serviceLocator", "(Lru/cyberity/cbr/core/b;)V", "params", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "", "country", "", "Lru/cyberity/cbr/core/data/model/remote/k;", "b", "(Lru/cyberity/cbr/domain/m$a;Lru/cyberity/cbr/core/data/model/g;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applicantId", "Lru/cyberity/cbr/core/data/model/Document;", "documents", "Lkotlin/G0;", "a", "(Ljava/lang/String;Ljava/util/List;Lru/cyberity/cbr/domain/m$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class m extends l<a> {

    /* compiled from: UploadDocumentImagesUseCase.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/domain/m$a;", "Lru/cyberity/cbr/domain/l$a;", "", "Lru/cyberity/cbr/core/data/model/o;", "d", "Ljava/util/List;", "()Ljava/util/List;", "results", "", "e", "Z", "()Z", "skipOldImageDeleting", "Lru/cyberity/cbr/core/data/model/Document;", "document", "", "country", "parallelUpload", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;Ljava/lang/String;Ljava/util/List;ZZ)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends l.a {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final List<o> results;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean skipOldImageDeleting;

        public /* synthetic */ a(Document document, String str, List list, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(document, str, list, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? false : z13);
        }

        @Y61.k
        public final List<o> d() {
            return this.results;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getSkipOldImageDeleting() {
            return this.skipOldImageDeleting;
        }

        public a(@Y61.k Document document, @Y61.l String str, @Y61.k List<o> list, boolean z12, boolean z13) {
            super(document, str, z12);
            this.results = list;
            this.skipOldImageDeleting = z13;
        }
    }

    /* compiled from: UploadDocumentImagesUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.domain.UploadDocumentImagesUseCase", f = "UploadDocumentImagesUseCase.kt", i = {0, 0, 0, 0, 0}, l = {82}, m = "syncUpload", n = {"this", "params", "applicant", "country", "uploaded"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434372a;

        /* renamed from: b, reason: collision with root package name */
        Object f434373b;

        /* renamed from: c, reason: collision with root package name */
        Object f434374c;

        /* renamed from: d, reason: collision with root package name */
        Object f434375d;

        /* renamed from: e, reason: collision with root package name */
        Object f434376e;

        /* renamed from: f, reason: collision with root package name */
        Object f434377f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f434378g;

        /* renamed from: i, reason: collision with root package name */
        int f434380i;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434378g = obj;
            this.f434380i |= BeduinInputModel.MIN_TEXT_VERSION;
            return m.this.a((a) null, (ru.cyberity.cbr.core.data.model.g) null, (String) null, (Continuation<? super List<ru.cyberity.cbr.core.data.model.remote.k>>) this);
        }
    }

    /* compiled from: UploadDocumentImagesUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "Lru/cyberity/cbr/core/data/model/remote/k;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/List;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.domain.UploadDocumentImagesUseCase$upload$2", f = "UploadDocumentImagesUseCase.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super List<? extends ru.cyberity.cbr.core.data.model.remote.k>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434381a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f434382b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f434383c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m f434384d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.cyberity.cbr.core.data.model.g f434385e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f434386f;

        /* compiled from: UploadDocumentImagesUseCase.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lru/cyberity/cbr/core/data/model/remote/k;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lru/cyberity/cbr/core/data/model/remote/k;"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.domain.UploadDocumentImagesUseCase$upload$2$2$1", f = "UploadDocumentImagesUseCase.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super ru.cyberity.cbr.core.data.model.remote.k>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f434387a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f434388b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ru.cyberity.cbr.core.data.model.g f434389c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f434390d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ o f434391e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f434392f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m mVar, ru.cyberity.cbr.core.data.model.g gVar, String str, o oVar, a aVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f434388b = mVar;
                this.f434389c = gVar;
                this.f434390d = str;
                this.f434391e = oVar;
                this.f434392f = aVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super ru.cyberity.cbr.core.data.model.remote.k> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f434388b, this.f434389c, this.f434390d, this.f434391e, this.f434392f, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f434387a;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ru.cyberity.cbr.core.data.source.applicant.b applicantRepository = this.f434388b.getApplicantRepository();
                    String id2 = this.f434389c.getId();
                    String str = this.f434390d;
                    File raw = this.f434391e.getRaw();
                    String type = this.f434391e.getType();
                    IdentitySide side = this.f434391e.getSide();
                    DocumentType type2 = this.f434392f.getDocument().getType();
                    this.f434387a = 1;
                    obj = ru.cyberity.cbr.core.data.source.applicant.b.a(applicantRepository, id2, str, raw, type, side, null, type2, this, 32, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar, m mVar, ru.cyberity.cbr.core.data.model.g gVar, String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f434383c = aVar;
            this.f434384d = mVar;
            this.f434385e = gVar;
            this.f434386f = str;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super List<ru.cyberity.cbr.core.data.model.remote.k>> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f434383c, this.f434384d, this.f434385e, this.f434386f, continuation);
            cVar.f434382b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434381a;
            int i13 = 1;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return obj;
            }
            C42729a0.b(obj);
            T t12 = (T) this.f434382b;
            List<o> listD = this.f434383c.d();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listD) {
                if (!((o) obj2).getSent()) {
                    arrayList.add(obj2);
                }
            }
            m mVar = this.f434384d;
            ru.cyberity.cbr.core.data.model.g gVar = this.f434385e;
            String str = this.f434386f;
            a aVar = this.f434383c;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                Iterator it2 = it;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(C43259k.b(t12, C43262l0.f411947c, new a(mVar, gVar, str, oVar, aVar, null), 2));
                mVar = mVar;
                arrayList2 = arrayList3;
                it = it2;
                i13 = 1;
            }
            this.f434381a = i13;
            Object objA = C43225h.a(arrayList2, this);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        }
    }

    public m(@Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.applicant.b bVar, @Y61.k ru.cyberity.cbr.core.data.source.settings.b bVar2, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        super(aVar, bVar, bVar2, cVar);
    }

    @Override // ru.cyberity.cbr.domain.l
    public /* bridge */ /* synthetic */ Object a(String str, List list, l.a aVar, Continuation continuation) {
        return a(str, (List<Document>) list, (a) aVar, (Continuation<? super G0>) continuation);
    }

    @Override // ru.cyberity.cbr.domain.l
    public /* bridge */ /* synthetic */ Object b(l.a aVar, ru.cyberity.cbr.core.data.model.g gVar, String str, Continuation continuation) {
        return b((a) aVar, gVar, str, (Continuation<? super List<ru.cyberity.cbr.core.data.model.remote.k>>) continuation);
    }

    public m(@Y61.k ru.cyberity.cbr.core.b bVar) {
        this(bVar.k(), bVar.e(), bVar.z(), bVar.m());
    }

    @Override // ru.cyberity.cbr.domain.l
    public /* bridge */ /* synthetic */ Object a(l.a aVar, ru.cyberity.cbr.core.data.model.g gVar, String str, Continuation continuation) {
        return a((a) aVar, gVar, str, (Continuation<? super List<ru.cyberity.cbr.core.data.model.remote.k>>) continuation);
    }

    @Y61.l
    public Object b(@Y61.k a aVar, @Y61.k ru.cyberity.cbr.core.data.model.g gVar, @Y61.k String str, @Y61.k Continuation<? super List<ru.cyberity.cbr.core.data.model.remote.k>> continuation) {
        return U.c(new c(aVar, this, gVar, str, null), continuation);
    }

    @Y61.l
    public Object a(@Y61.k String str, @Y61.k List<Document> list, @Y61.k a aVar, @Y61.k Continuation<? super G0> continuation) {
        if (!aVar.getSkipOldImageDeleting()) {
            Object objA = super.a(str, list, (List<Document>) aVar, continuation);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
        }
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0130 -> B:33:0x013a). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k ru.cyberity.cbr.domain.m.a r25, @Y61.k ru.cyberity.cbr.core.data.model.g r26, @Y61.k java.lang.String r27, @Y61.k kotlin.coroutines.Continuation<? super java.util.List<ru.cyberity.cbr.core.data.model.remote.k>> r28) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.domain.m.a(ru.cyberity.cbr.domain.m$a, ru.cyberity.cbr.core.data.model.g, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
