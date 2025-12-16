package ru.cyberity.cbr.geo.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.AbstractC43443a;

/* compiled from: GetLocationUseCase.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JH\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0086Bø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lru/cyberity/cbr/geo/domain/b;", "", "Lru/cyberity/cbr/core/data/source/applicant/b;", "applicantRepository", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lkotlinx/serialization/json/a;", "json", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/b;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;Lkotlinx/serialization/json/a;)V", "", "applicantId", "documentType", "Lkotlin/G0;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "latitude", "longitude", "", "accuracy", "Lkotlin/Z;", "", "Lru/cyberity/cbr/geo/model/a;", "(Ljava/lang/String;DDFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/applicant/b;", "b", "Lru/cyberity/cbr/core/data/source/common/a;", "c", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "d", "Lkotlinx/serialization/json/a;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.applicant.b applicantRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.common.a commonRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final AbstractC43443a json;

    /* compiled from: GetLocationUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.geo.domain.GetLocationUseCase", f = "GetLocationUseCase.kt", i = {0, 0, 0, 1, 1}, l = {65, 67}, m = "clearImagesIfNeeded", n = {"this", "applicantId", "documentType", "this", "applicantId"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434403a;

        /* renamed from: b, reason: collision with root package name */
        Object f434404b;

        /* renamed from: c, reason: collision with root package name */
        Object f434405c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f434406d;

        /* renamed from: f, reason: collision with root package name */
        int f434408f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f434406d = obj;
            this.f434408f |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.a(null, null, this);
        }
    }

    /* compiled from: GetLocationUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.geo.domain.GetLocationUseCase", f = "GetLocationUseCase.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {31, 47, 49}, m = "invoke-yxL6bBk", n = {"this", "documentType", "latitude", "longitude", "accuracy", "this", "documentType", "applicantId", LocalPublishState.FIELDS, "this", LocalPublishState.FIELDS, AddressParameter.TYPE}, s = {"L$0", "L$1", "D$0", "D$1", "F$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    /* renamed from: ru.cyberity.cbr.geo.domain.b$b, reason: collision with other inner class name */
    public static final class C12493b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434409a;

        /* renamed from: b, reason: collision with root package name */
        Object f434410b;

        /* renamed from: c, reason: collision with root package name */
        Object f434411c;

        /* renamed from: d, reason: collision with root package name */
        Object f434412d;

        /* renamed from: e, reason: collision with root package name */
        double f434413e;

        /* renamed from: f, reason: collision with root package name */
        double f434414f;

        /* renamed from: g, reason: collision with root package name */
        float f434415g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f434416h;

        /* renamed from: j, reason: collision with root package name */
        int f434418j;

        public C12493b(Continuation<? super C12493b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f434416h = obj;
            this.f434418j |= BeduinInputModel.MIN_TEXT_VERSION;
            Object objA = b.this.a(null, 0.0d, 0.0d, 0.0f, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
        }
    }

    public b(@k ru.cyberity.cbr.core.data.source.applicant.b bVar, @k ru.cyberity.cbr.core.data.source.common.a aVar, @k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @k AbstractC43443a abstractC43443a) {
        this.applicantRepository = bVar;
        this.commonRepository = aVar;
        this.dataRepository = cVar;
        this.json = abstractC43443a;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[Catch: Exception -> 0x00fb, TryCatch #1 {Exception -> 0x00fb, blocks: (B:34:0x00b3, B:35:0x00c5, B:37:0x00cb, B:39:0x00e1, B:41:0x00e9, B:46:0x00fd, B:72:0x01e9, B:73:0x01f0), top: B:80:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r21, double r22, double r24, float r26, @Y61.k kotlin.coroutines.Continuation<? super kotlin.Z<? extends java.util.List<ru.cyberity.cbr.geo.model.a>>> r27) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.geo.domain.b.a(java.lang.String, double, double, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7 A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0035, B:41:0x00b1, B:43:0x00b7, B:20:0x0052, B:27:0x006c, B:28:0x007c, B:30:0x0082, B:33:0x0098, B:35:0x009c, B:37:0x00a2, B:40:0x00aa, B:39:0x00a8), top: B:51:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, ru.cyberity.cbr.geo.domain.b] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, java.lang.String r10, kotlin.coroutines.Continuation<? super kotlin.G0> r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.geo.domain.b.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
