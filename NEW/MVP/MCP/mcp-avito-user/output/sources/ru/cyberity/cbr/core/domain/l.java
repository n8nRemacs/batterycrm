package ru.cyberity.cbr.core.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GetApplicantUseCase.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bJ+\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/core/domain/l;", "Lru/cyberity/cbr/core/domain/base/b;", "Lru/cyberity/cbr/core/data/model/g;", "Lru/cyberity/cbr/core/domain/l$a;", "params", "Lru/cyberity/cbr/core/domain/model/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "a", "(Lru/cyberity/cbr/core/domain/l$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "b", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class l extends ru.cyberity.cbr.core.domain.base.b<ru.cyberity.cbr.core.data.model.g, a> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* compiled from: GetApplicantUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/core/domain/l$a;", "", "", "a", "Z", "()Z", "force", "<init>", "(Z)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean force;

        public a() {
            this(false, 1, null);
        }

        /* renamed from: a, reason: from getter */
        public final boolean getForce() {
            return this.force;
        }

        public a(boolean z12) {
            this.force = z12;
        }

        public /* synthetic */ a(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: GetApplicantUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.domain.GetApplicantUseCase", f = "GetApplicantUseCase.kt", i = {0}, l = {23, AvailableCode.ERROR_NO_ACTIVITY}, m = "run", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433974a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f433975b;

        /* renamed from: d, reason: collision with root package name */
        int f433977d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f433975b = obj;
            this.f433977d |= BeduinInputModel.MIN_TEXT_VERSION;
            return l.this.a((a) null, (Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ru.cyberity.cbr.core.data.model.g>>) this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k ru.cyberity.cbr.core.domain.l.a r10, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends java.lang.Exception, ru.cyberity.cbr.core.data.model.g>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ru.cyberity.cbr.core.domain.l.b
            if (r0 == 0) goto L13
            r0 = r11
            ru.cyberity.cbr.core.domain.l$b r0 = (ru.cyberity.cbr.core.domain.l.b) r0
            int r1 = r0.f433977d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433977d = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.domain.l$b r0 = new ru.cyberity.cbr.core.domain.l$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f433975b
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f433977d
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L34
            if (r1 != r8) goto L2c
            kotlin.C42729a0.b(r11)
            goto L6d
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            java.lang.Object r10 = r0.f433974a
            ru.cyberity.cbr.core.domain.l r10 = (ru.cyberity.cbr.core.domain.l) r10
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Exception -> L3c
            goto L57
        L3c:
            r11 = move-exception
            goto L61
        L3e:
            kotlin.C42729a0.b(r11)
            ru.cyberity.cbr.core.data.source.dynamic.c r1 = r9.dataRepository     // Catch: java.lang.Exception -> L5f
            boolean r3 = r10.getForce()     // Catch: java.lang.Exception -> L5f
            r0.f433974a = r9     // Catch: java.lang.Exception -> L5f
            r0.f433977d = r2     // Catch: java.lang.Exception -> L5f
            r2 = 0
            r5 = 1
            r6 = 0
            r4 = r0
            java.lang.Object r11 = ru.cyberity.cbr.core.data.source.dynamic.c.b(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L5f
            if (r11 != r7) goto L56
            return r7
        L56:
            r10 = r9
        L57:
            ru.cyberity.cbr.core.data.model.g r11 = (ru.cyberity.cbr.core.data.model.g) r11     // Catch: java.lang.Exception -> L3c
            ru.cyberity.cbr.core.domain.model.a$b r1 = new ru.cyberity.cbr.core.domain.model.a$b     // Catch: java.lang.Exception -> L3c
            r1.<init>(r11)     // Catch: java.lang.Exception -> L3c
            return r1
        L5f:
            r11 = move-exception
            r10 = r9
        L61:
            r1 = 0
            r0.f433974a = r1
            r0.f433977d = r8
            java.lang.Object r11 = r10.a(r11, r0)
            if (r11 != r7) goto L6d
            return r7
        L6d:
            ru.cyberity.cbr.core.domain.model.a$a r10 = new ru.cyberity.cbr.core.domain.model.a$a
            r10.<init>(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.domain.l.a(ru.cyberity.cbr.core.domain.l$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.core.domain.base.b
    public /* bridge */ /* synthetic */ Object b(a aVar, Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ? extends ru.cyberity.cbr.core.data.model.g>> continuation) {
        return a(aVar, (Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, ru.cyberity.cbr.core.data.model.g>>) continuation);
    }
}
