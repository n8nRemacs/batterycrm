package ru.cyberity.cbr.core.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SendAgreementUseCase.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ2\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0086Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u000e\u0010\u0011\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/domain/o;", "", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/common/a;)V", "Lru/cyberity/cbr/core/b;", "serviceLocator", "(Lru/cyberity/cbr/core/b;)V", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "Lru/cyberity/cbr/core/data/model/b;", "agreement", "Lkotlin/Z;", "a", "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/common/a;", "()Lru/cyberity/cbr/core/data/source/common/a;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.common.a commonRepository;

    /* compiled from: SendAgreementUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.domain.SendAgreementUseCase", f = "SendAgreementUseCase.kt", i = {0}, l = {19}, m = "invoke-0E7RQCE", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433997a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f433998b;

        /* renamed from: d, reason: collision with root package name */
        int f434000d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433998b = obj;
            this.f434000d |= BeduinInputModel.MIN_TEXT_VERSION;
            Object objA = o.this.a(null, null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
        }
    }

    public o(@Y61.k ru.cyberity.cbr.core.data.source.common.a aVar) {
        this.commonRepository = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k ru.cyberity.cbr.core.data.model.g r6, @Y61.k ru.cyberity.cbr.core.data.model.b r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.Z<ru.cyberity.cbr.core.data.model.g>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ru.cyberity.cbr.core.domain.o.a
            if (r0 == 0) goto L13
            r0 = r8
            ru.cyberity.cbr.core.domain.o$a r0 = (ru.cyberity.cbr.core.domain.o.a) r0
            int r1 = r0.f434000d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f434000d = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.domain.o$a r0 = new ru.cyberity.cbr.core.domain.o$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f433998b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f434000d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f433997a
            ru.cyberity.cbr.core.domain.o r6 = (ru.cyberity.cbr.core.domain.o) r6
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Exception -> L2d
            goto L50
        L2d:
            r7 = move-exception
            goto L62
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.C42729a0.b(r8)
            int r8 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L57
            ru.cyberity.cbr.core.data.model.b r8 = r6.getAgreement()     // Catch: java.lang.Exception -> L57
            if (r8 != 0) goto L5a
            ru.cyberity.cbr.core.data.source.common.a r8 = r5.commonRepository     // Catch: java.lang.Exception -> L57
            r0.f433997a = r5     // Catch: java.lang.Exception -> L57
            r0.f434000d = r3     // Catch: java.lang.Exception -> L57
            java.lang.Object r8 = r8.a(r6, r7, r0)     // Catch: java.lang.Exception -> L57
            if (r8 != r1) goto L4f
            return r1
        L4f:
            r6 = r5
        L50:
            r7 = r8
            ru.cyberity.cbr.core.data.model.g r7 = (ru.cyberity.cbr.core.data.model.g) r7     // Catch: java.lang.Exception -> L2d
            r4 = r7
            r7 = r6
            r6 = r4
            goto L5b
        L57:
            r7 = move-exception
            r6 = r5
            goto L62
        L5a:
            r7 = r5
        L5b:
            int r7 = kotlin.Z.f406624c     // Catch: java.lang.Exception -> L5e
            goto L70
        L5e:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L62:
            int r8 = kotlin.Z.f406624c
            ru.cyberity.cbr.core.data.source.common.a r6 = r6.commonRepository
            java.lang.Exception r6 = ru.cyberity.cbr.core.domain.base.d.a(r6, r7)
            kotlin.Z$b r7 = new kotlin.Z$b
            r7.<init>(r6)
            r6 = r7
        L70:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.domain.o.a(ru.cyberity.cbr.core.data.model.g, ru.cyberity.cbr.core.data.model.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public o(@Y61.k ru.cyberity.cbr.core.b bVar) {
        this(bVar.k());
    }
}
