package com.avito.android.publish.screen.step.wizard.mvi;

import Pe0.InterfaceC14778b;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements InterfaceC43160i<InterfaceC14778b.d> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f242535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f242536c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f242537b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f242538c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.publish.screen.step.wizard.mvi.WizardBootstrap$observeDeeplinkResult$$inlined$mapNotNull$1$2", f = "WizardBootstrap.kt", i = {}, l = {JfifUtil.MARKER_APP1}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.publish.screen.step.wizard.mvi.f$a$a, reason: collision with other inner class name */
        public static final class C7274a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f242539q;

            /* renamed from: r, reason: collision with root package name */
            public int f242540r;

            public C7274a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f242539q = obj;
                this.f242540r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, g gVar) {
            this.f242537b = interfaceC43172j;
            this.f242538c = gVar;
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
                boolean r0 = r7 instanceof com.avito.android.publish.screen.step.wizard.mvi.f.a.C7274a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.publish.screen.step.wizard.mvi.f$a$a r0 = (com.avito.android.publish.screen.step.wizard.mvi.f.a.C7274a) r0
                int r1 = r0.f242540r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f242540r = r1
                goto L18
            L13:
                com.avito.android.publish.screen.step.wizard.mvi.f$a$a r0 = new com.avito.android.publish.screen.step.wizard.mvi.f$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f242539q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f242540r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r7)
                goto L6b
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                kv.a r6 = (kv.C43501a) r6
                Ju.c r6 = r6.f413261b
                boolean r6 = r6 instanceof com.avito.android.beduin.v2.page.m.c
                r7 = 0
                if (r6 == 0) goto L5e
                com.avito.android.publish.screen.step.wizard.mvi.g r6 = r5.f242538c
                com.avito.android.Q1 r6 = r6.f242544c
                r6.getClass()
                kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.Q1.f67448x0
                r4 = 85
                r2 = r2[r4]
                com.avito.android.A0$a r6 = r6.f67511s0
                DE0.a r6 = r6.a()
                java.lang.Object r6 = r6.invoke()
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5e
                Pe0.b$d r7 = Pe0.InterfaceC14778b.d.f13197a
            L5e:
                if (r7 == 0) goto L6b
                r0.f242540r = r3
                kotlinx.coroutines.flow.j r6 = r5.f242537b
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L6b
                return r1
            L6b:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.wizard.mvi.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public f(InterfaceC43160i interfaceC43160i, g gVar) {
        this.f242535b = interfaceC43160i;
        this.f242536c = gVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC14778b.d> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = ((AbstractC43168f) this.f242535b).collect(new a(interfaceC43172j, this.f242536c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
