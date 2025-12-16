package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35688t implements InterfaceC43160i<C35670a.b.InterfaceC9754a.c> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35689u f315482b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C35670a.b f315483c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.a f315484d;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.t$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f315485b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C35670a.b f315486c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.a f315487d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$processParamsAction$$inlined$filter$1$2", f = "UserAdvertsListActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.t$a$a, reason: collision with other inner class name */
        public static final class C9770a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f315488q;

            /* renamed from: r, reason: collision with root package name */
            public int f315489r;

            public C9770a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f315488q = obj;
                this.f315489r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, C35670a.b bVar, Y41.a aVar) {
            this.f315485b = interfaceC43172j;
            this.f315486c = bVar;
            this.f315487d = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.C35688t.a.C9770a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.user_adverts.tab_screens.adverts.mvi.t$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.C35688t.a.C9770a) r0
                int r1 = r0.f315489r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f315489r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.tab_screens.adverts.mvi.t$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.mvi.t$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f315488q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f315489r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L62
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                r6 = r5
                com.avito.android.user_adverts.tab_screens.adverts.mvi.a$b$a$c r6 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a.b.InterfaceC9754a.c) r6
                com.avito.android.user_adverts.tab_screens.adverts.mvi.a$b r2 = r4.f315486c
                com.avito.android.arch.mvi.utils.o r2 = r2.f315281b
                com.avito.android.arch.mvi.utils.o$a r2 = r2.f92114c
                java.lang.Object r2 = r2.getValue()
                com.avito.android.user_adverts.tab_screens.adverts.mvi.a$b$a r2 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a.b.InterfaceC9754a) r2
                boolean r6 = kotlin.jvm.internal.L.f(r2, r6)
                if (r6 == 0) goto L57
                Y41.a r6 = r4.f315487d
                java.lang.Object r6 = r6.invoke()
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState r6 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState) r6
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState$DataState r6 = r6.f315396n
                boolean r6 = r6 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.DataState.Loaded
                if (r6 != 0) goto L62
            L57:
                r0.f315489r = r3
                kotlinx.coroutines.flow.j r6 = r4.f315485b
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L62
                return r1
            L62:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.mvi.C35688t.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C35688t(C35689u c35689u, C35670a.b bVar, Y41.a aVar) {
        this.f315482b = c35689u;
        this.f315483c = bVar;
        this.f315484d = aVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super C35670a.b.InterfaceC9754a.c> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f315482b.collect(new a(interfaceC43172j, this.f315483c, this.f315484d), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
