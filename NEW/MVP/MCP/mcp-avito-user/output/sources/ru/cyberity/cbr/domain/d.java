package ru.cyberity.cbr.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DeleteDocumentImagesUseCase.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ6\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/domain/d;", "", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/applicant/b;", "applicantRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/dynamic/c;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/applicant/b;)V", "", "", "imageIds", "Lkotlin/Z;", "a", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "c", "()Lru/cyberity/cbr/core/data/source/dynamic/c;", "b", "Lru/cyberity/cbr/core/data/source/common/a;", "()Lru/cyberity/cbr/core/data/source/common/a;", "Lru/cyberity/cbr/core/data/source/applicant/b;", "()Lru/cyberity/cbr/core/data/source/applicant/b;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.common.a commonRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.applicant.b applicantRepository;

    /* compiled from: DeleteDocumentImagesUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.domain.DeleteDocumentImagesUseCase", f = "DeleteDocumentImagesUseCase.kt", i = {0, 0, 1, 1, 1, 1}, l = {17, 21}, m = "invoke-gIAlu-s", n = {"this", "imageIds", "this", "applicantId", "deletedIds", "imageId"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$4"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434271a;

        /* renamed from: b, reason: collision with root package name */
        Object f434272b;

        /* renamed from: c, reason: collision with root package name */
        Object f434273c;

        /* renamed from: d, reason: collision with root package name */
        Object f434274d;

        /* renamed from: e, reason: collision with root package name */
        Object f434275e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f434276f;

        /* renamed from: h, reason: collision with root package name */
        int f434278h;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws NumberFormatException {
            this.f434276f = obj;
            this.f434278h |= BeduinInputModel.MIN_TEXT_VERSION;
            Object objA = d.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
        }
    }

    public d(@Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.applicant.b bVar) {
        this.dataRepository = cVar;
        this.commonRepository = aVar;
        this.applicantRepository = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[Catch: Exception -> 0x0041, TryCatch #2 {Exception -> 0x0041, blocks: (B:13:0x003c, B:36:0x00aa, B:31:0x0085, B:33:0x008b, B:37:0x00ae), top: B:47:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[Catch: Exception -> 0x0041, TRY_LEAVE, TryCatch #2 {Exception -> 0x0041, blocks: (B:13:0x003c, B:36:0x00aa, B:31:0x0085, B:33:0x008b, B:37:0x00ae), top: B:47:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a7 -> B:36:0x00aa). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.util.List<java.lang.String> r10, @Y61.k kotlin.coroutines.Continuation<? super kotlin.Z<? extends java.util.List<java.lang.String>>> r11) throws java.lang.NumberFormatException {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ru.cyberity.cbr.domain.d.a
            if (r0 == 0) goto L13
            r0 = r11
            ru.cyberity.cbr.domain.d$a r0 = (ru.cyberity.cbr.domain.d.a) r0
            int r1 = r0.f434278h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f434278h = r1
            goto L18
        L13:
            ru.cyberity.cbr.domain.d$a r0 = new ru.cyberity.cbr.domain.d$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f434276f
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f434278h
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L5b
            if (r1 == r2) goto L4c
            if (r1 != r8) goto L44
            java.lang.Object r10 = r0.f434275e
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r1 = r0.f434274d
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r2 = r0.f434273c
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r0.f434272b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.f434271a
            ru.cyberity.cbr.domain.d r4 = (ru.cyberity.cbr.domain.d) r4
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Exception -> L41
            goto Laa
        L41:
            r10 = move-exception
            goto Lb3
        L44:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L4c:
            java.lang.Object r10 = r0.f434272b
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r1 = r0.f434271a
            ru.cyberity.cbr.domain.d r1 = (ru.cyberity.cbr.domain.d) r1
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Exception -> L58
            goto L73
        L58:
            r10 = move-exception
            r4 = r1
            goto Lb3
        L5b:
            kotlin.C42729a0.b(r11)
            ru.cyberity.cbr.core.data.source.dynamic.c r1 = r9.dataRepository     // Catch: java.lang.Exception -> Lb1
            r0.f434271a = r9     // Catch: java.lang.Exception -> Lb1
            r0.f434272b = r10     // Catch: java.lang.Exception -> Lb1
            r0.f434278h = r2     // Catch: java.lang.Exception -> Lb1
            r2 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            r4 = r0
            java.lang.Object r11 = ru.cyberity.cbr.core.data.source.dynamic.c.b(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> Lb1
            if (r11 != r7) goto L72
            return r7
        L72:
            r1 = r9
        L73:
            ru.cyberity.cbr.core.data.model.g r11 = (ru.cyberity.cbr.core.data.model.g) r11     // Catch: java.lang.Exception -> L58
            java.lang.String r11 = r11.getId()     // Catch: java.lang.Exception -> L58
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L58
            r2.<init>()     // Catch: java.lang.Exception -> L58
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Exception -> L58
            r3 = r11
            r4 = r1
            r1 = r10
        L85:
            boolean r10 = r1.hasNext()     // Catch: java.lang.Exception -> L41
            if (r10 == 0) goto Lae
            java.lang.Object r10 = r1.next()     // Catch: java.lang.Exception -> L41
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L41
            ru.cyberity.cbr.core.data.source.applicant.b r11 = r4.applicantRepository     // Catch: java.lang.Exception -> L41
            int r5 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Exception -> L41
            r0.f434271a = r4     // Catch: java.lang.Exception -> L41
            r0.f434272b = r3     // Catch: java.lang.Exception -> L41
            r0.f434273c = r2     // Catch: java.lang.Exception -> L41
            r0.f434274d = r1     // Catch: java.lang.Exception -> L41
            r0.f434275e = r10     // Catch: java.lang.Exception -> L41
            r0.f434278h = r8     // Catch: java.lang.Exception -> L41
            java.lang.Object r11 = r11.a(r3, r5, r0)     // Catch: java.lang.Exception -> L41
            if (r11 != r7) goto Laa
            return r7
        Laa:
            r2.add(r10)     // Catch: java.lang.Exception -> L41
            goto L85
        Lae:
            int r10 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L41
            return r2
        Lb1:
            r10 = move-exception
            r4 = r9
        Lb3:
            int r11 = kotlin.Z.f406624c
            ru.cyberity.cbr.core.data.source.common.a r11 = r4.commonRepository
            java.lang.Exception r10 = ru.cyberity.cbr.core.domain.base.d.a(r11, r10)
            kotlin.Z$b r11 = new kotlin.Z$b
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.domain.d.a(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
