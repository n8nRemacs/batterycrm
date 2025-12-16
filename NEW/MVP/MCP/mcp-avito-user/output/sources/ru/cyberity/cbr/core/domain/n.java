package ru.cyberity.cbr.core.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RequestCodeUseCase.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/domain/n;", "", "Lru/cyberity/cbr/core/data/source/settings/b;", "settingsRepository", "Lru/cyberity/cbr/core/data/source/applicant/b;", "applicantRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/settings/b;Lru/cyberity/cbr/core/data/source/applicant/b;)V", "", "identifierType", "identifier", "Lkotlin/Z;", "Lru/cyberity/cbr/core/data/source/applicant/remote/x;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/settings/b;", "b", "Lru/cyberity/cbr/core/data/source/applicant/b;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.settings.b settingsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.applicant.b applicantRepository;

    /* compiled from: RequestCodeUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.domain.RequestCodeUseCase", f = "RequestCodeUseCase.kt", i = {}, l = {20}, m = "invoke-0E7RQCE", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f433993a;

        /* renamed from: c, reason: collision with root package name */
        int f433995c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433993a = obj;
            this.f433995c |= BeduinInputModel.MIN_TEXT_VERSION;
            Object objA = n.this.a(null, null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
        }
    }

    public n(@Y61.k ru.cyberity.cbr.core.data.source.settings.b bVar, @Y61.k ru.cyberity.cbr.core.data.source.applicant.b bVar2) {
        this.settingsRepository = bVar;
        this.applicantRepository = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r7, @Y61.k java.lang.String r8, @Y61.k kotlin.coroutines.Continuation<? super kotlin.Z<ru.cyberity.cbr.core.data.source.applicant.remote.x>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ru.cyberity.cbr.core.domain.n.a
            if (r0 == 0) goto L13
            r0 = r9
            ru.cyberity.cbr.core.domain.n$a r0 = (ru.cyberity.cbr.core.domain.n.a) r0
            int r1 = r0.f433995c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433995c = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.domain.n$a r0 = new ru.cyberity.cbr.core.domain.n$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f433993a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433995c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Exception -> L29
            goto L4e
        L29:
            r7 = move-exception
            goto L53
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.C42729a0.b(r9)
            ru.cyberity.cbr.core.data.source.settings.b r9 = r6.settingsRepository     // Catch: java.lang.Exception -> L29
            java.lang.String r9 = r9.a()     // Catch: java.lang.Exception -> L29
            ru.cyberity.cbr.core.data.source.applicant.b r2 = r6.applicantRepository     // Catch: java.lang.Exception -> L29
            ru.cyberity.cbr.core.data.source.applicant.remote.w r4 = new ru.cyberity.cbr.core.data.source.applicant.remote.w     // Catch: java.lang.Exception -> L29
            java.lang.String r5 = "applicant"
            r4.<init>(r5, r7, r8)     // Catch: java.lang.Exception -> L29
            r0.f433995c = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r9 = r2.a(r9, r4, r0)     // Catch: java.lang.Exception -> L29
            if (r9 != r1) goto L4e
            return r1
        L4e:
            ru.cyberity.cbr.core.data.source.applicant.remote.x r9 = (ru.cyberity.cbr.core.data.source.applicant.remote.x) r9     // Catch: java.lang.Exception -> L29
            int r7 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L29
            goto L5a
        L53:
            int r8 = kotlin.Z.f406624c
            kotlin.Z$b r9 = new kotlin.Z$b
            r9.<init>(r7)
        L5a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.domain.n.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
