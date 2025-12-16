package ru.cyberity.cbr.core.domain.base;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BaseUseCase.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00002\u00020\u0003B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00028\u0001H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ+\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00028\u0001H\u0096Bø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ#\u0010\n\u001a\u00060\u0006j\u0002`\u00072\n\u0010\u000b\u001a\u00060\u0006j\u0002`\u0007H\u0084@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\n\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/core/domain/base/b;", "Type", "Params", "", "params", "Lru/cyberity/cbr/core/domain/model/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "exception", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/common/a;", "Lru/cyberity/cbr/core/data/source/common/a;", "()Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/common/a;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class b<Type, Params> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.common.a commonRepository;

    /* compiled from: BaseUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.domain.base.BaseUseCase", f = "BaseUseCase.kt", i = {0}, l = {12, 14}, m = "invoke$suspendImpl", n = {"$this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433893a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f433894b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<Type, Params> f433895c;

        /* renamed from: d, reason: collision with root package name */
        int f433896d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(b<? extends Type, ? super Params> bVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f433895c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f433894b = obj;
            this.f433896d |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.a(this.f433895c, null, this);
        }
    }

    public b(@k ru.cyberity.cbr.core.data.source.common.a aVar) {
        this.commonRepository = aVar;
    }

    @l
    public Object a(Params params, @k Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ? extends Type>> continuation) {
        return a(this, params, continuation);
    }

    @l
    public abstract Object b(Params params, @k Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ? extends Type>> continuation);

    @k
    /* renamed from: a, reason: from getter */
    public final ru.cyberity.cbr.core.data.source.common.a getCommonRepository() {
        return this.commonRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(ru.cyberity.cbr.core.domain.base.b r5, java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof ru.cyberity.cbr.core.domain.base.b.a
            if (r0 == 0) goto L13
            r0 = r7
            ru.cyberity.cbr.core.domain.base.b$a r0 = (ru.cyberity.cbr.core.domain.base.b.a) r0
            int r1 = r0.f433896d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433896d = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.domain.base.b$a r0 = new ru.cyberity.cbr.core.domain.base.b$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f433894b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433896d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r7)
            goto L5b
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f433893a
            ru.cyberity.cbr.core.domain.base.b r5 = (ru.cyberity.cbr.core.domain.base.b) r5
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Exception -> L3c
            goto L4c
        L3c:
            r6 = move-exception
            goto L4f
        L3e:
            kotlin.C42729a0.b(r7)
            r0.f433893a = r5     // Catch: java.lang.Exception -> L3c
            r0.f433896d = r4     // Catch: java.lang.Exception -> L3c
            java.lang.Object r7 = r5.b(r6, r0)     // Catch: java.lang.Exception -> L3c
            if (r7 != r1) goto L4c
            return r1
        L4c:
            ru.cyberity.cbr.core.domain.model.a r7 = (ru.cyberity.cbr.core.domain.model.a) r7     // Catch: java.lang.Exception -> L3c
            goto L61
        L4f:
            r7 = 0
            r0.f433893a = r7
            r0.f433896d = r3
            java.lang.Object r7 = r5.a(r6, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            ru.cyberity.cbr.core.domain.model.a$a r5 = new ru.cyberity.cbr.core.domain.model.a$a
            r5.<init>(r7)
            r7 = r5
        L61:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.domain.base.b.a(ru.cyberity.cbr.core.domain.base.b, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @l
    public final Object a(@k Exception exc, @k Continuation<? super Exception> continuation) {
        return d.a(this.commonRepository, exc);
    }
}
