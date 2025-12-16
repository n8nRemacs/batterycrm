package com.avito.android.soa_stat.profile_settings.mvi;

import Vw0.InterfaceC15722a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
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
/* loaded from: classes3.dex */
public final class l implements InterfaceC43160i<InterfaceC15722a.c> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f284190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f284191c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f284192b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a f284193c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.soa_stat.profile_settings.mvi.SoaStatSettingActor$processToggleActions$$inlined$filter$1$2", f = "SoaStatSettingActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.soa_stat.profile_settings.mvi.l$a$a, reason: collision with other inner class name */
        public static final class C8487a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f284194q;

            /* renamed from: r, reason: collision with root package name */
            public int f284195r;

            public C8487a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f284194q = obj;
                this.f284195r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, Y41.a aVar) {
            this.f284192b = interfaceC43172j;
            this.f284193c = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.avito.android.soa_stat.profile_settings.mvi.l.a.C8487a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.soa_stat.profile_settings.mvi.l$a$a r0 = (com.avito.android.soa_stat.profile_settings.mvi.l.a.C8487a) r0
                int r1 = r0.f284195r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f284195r = r1
                goto L18
            L13:
                com.avito.android.soa_stat.profile_settings.mvi.l$a$a r0 = new com.avito.android.soa_stat.profile_settings.mvi.l$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f284194q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f284195r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r7)
                goto L58
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                r7 = r6
                Vw0.a$c r7 = (Vw0.InterfaceC15722a.c) r7
                Y41.a r2 = r5.f284193c
                java.lang.Object r2 = r2.invoke()
                Vw0.c r2 = (Vw0.c) r2
                Vw0.c$a r2 = r2.f17506b
                boolean r4 = r2 instanceof Vw0.c.a.b
                if (r4 == 0) goto L58
                Vw0.c$a$b r2 = (Vw0.c.a.b) r2
                boolean r2 = r2.f17512d
                boolean r7 = r7.f17503a
                if (r2 == r7) goto L58
                r0.f284195r = r3
                kotlinx.coroutines.flow.j r7 = r5.f284192b
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L58
                return r1
            L58:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.soa_stat.profile_settings.mvi.l.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public l(Y41.a aVar, InterfaceC43160i interfaceC43160i) {
        this.f284190b = interfaceC43160i;
        this.f284191c = aVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC15722a.c> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f284190b.collect(new a(interfaceC43172j, this.f284191c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
