package ru.cyberity.cbr.core.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GetConfigUseCase.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J+\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/domain/m;", "Lru/cyberity/cbr/core/domain/base/b;", "Lru/cyberity/cbr/core/data/model/e;", "Lru/cyberity/cbr/core/domain/m$a;", "params", "Lru/cyberity/cbr/core/domain/model/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "a", "(Lru/cyberity/cbr/core/domain/m$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "b", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "Lru/cyberity/cbr/core/b;", "serviceLocator", "(Lru/cyberity/cbr/core/b;)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class m extends ru.cyberity.cbr.core.domain.base.b<ru.cyberity.cbr.core.data.model.e, a> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* compiled from: GetConfigUseCase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/domain/m$a;", "", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
    }

    /* compiled from: GetConfigUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.domain.GetConfigUseCase", f = "GetConfigUseCase.kt", i = {0}, l = {23, AvailableCode.ERROR_NO_ACTIVITY}, m = "run", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433979a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f433980b;

        /* renamed from: d, reason: collision with root package name */
        int f433982d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433980b = obj;
            this.f433982d |= BeduinInputModel.MIN_TEXT_VERSION;
            return m.this.a((a) null, (Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ru.cyberity.cbr.core.data.model.e>>) this);
        }
    }

    public m(@Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        super(aVar);
        this.dataRepository = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k ru.cyberity.cbr.core.domain.m.a r6, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends java.lang.Exception, ru.cyberity.cbr.core.data.model.e>> r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof ru.cyberity.cbr.core.domain.m.b
            if (r6 == 0) goto L13
            r6 = r7
            ru.cyberity.cbr.core.domain.m$b r6 = (ru.cyberity.cbr.core.domain.m.b) r6
            int r0 = r6.f433982d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f433982d = r0
            goto L18
        L13:
            ru.cyberity.cbr.core.domain.m$b r6 = new ru.cyberity.cbr.core.domain.m$b
            r6.<init>(r7)
        L18:
            java.lang.Object r7 = r6.f433980b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f433982d
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2d
            kotlin.C42729a0.b(r7)
            goto L66
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            java.lang.Object r1 = r6.f433979a
            ru.cyberity.cbr.core.domain.m r1 = (ru.cyberity.cbr.core.domain.m) r1
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Exception -> L3d
            goto L51
        L3d:
            r7 = move-exception
            goto L5b
        L3f:
            kotlin.C42729a0.b(r7)
            ru.cyberity.cbr.core.data.source.dynamic.c r7 = r5.dataRepository     // Catch: java.lang.Exception -> L59
            r6.f433979a = r5     // Catch: java.lang.Exception -> L59
            r6.f433982d = r4     // Catch: java.lang.Exception -> L59
            r1 = 0
            java.lang.Object r7 = ru.cyberity.cbr.core.data.source.dynamic.c.c(r7, r1, r6, r4, r2)     // Catch: java.lang.Exception -> L59
            if (r7 != r0) goto L50
            return r0
        L50:
            r1 = r5
        L51:
            ru.cyberity.cbr.core.data.model.e r7 = (ru.cyberity.cbr.core.data.model.e) r7     // Catch: java.lang.Exception -> L3d
            ru.cyberity.cbr.core.domain.model.a$b r4 = new ru.cyberity.cbr.core.domain.model.a$b     // Catch: java.lang.Exception -> L3d
            r4.<init>(r7)     // Catch: java.lang.Exception -> L3d
            return r4
        L59:
            r7 = move-exception
            r1 = r5
        L5b:
            r6.f433979a = r2
            r6.f433982d = r3
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r0) goto L66
            return r0
        L66:
            ru.cyberity.cbr.core.domain.model.a$a r6 = new ru.cyberity.cbr.core.domain.model.a$a
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.domain.m.a(ru.cyberity.cbr.core.domain.m$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.core.domain.base.b
    public /* bridge */ /* synthetic */ Object b(a aVar, Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ? extends ru.cyberity.cbr.core.data.model.e>> continuation) {
        return a(aVar, (Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ru.cyberity.cbr.core.data.model.e>>) continuation);
    }

    public m(@Y61.k ru.cyberity.cbr.core.b bVar) {
        this(bVar.k(), bVar.m());
    }
}
