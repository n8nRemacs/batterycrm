package com.avito.android.employee_mode_impl.manager.state;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import jz.C42450a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
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
/* loaded from: classes13.dex */
public final class f implements InterfaceC43160i<Q<? extends C42450a, ? extends C42450a>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f147474b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f147475b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$skipProfileChange$$inlined$filter$1$2", f = "EmployeeModeInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.employee_mode_impl.manager.state.f$a$a, reason: collision with other inner class name */
        public static final class C4304a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f147476q;

            /* renamed from: r, reason: collision with root package name */
            public int f147477r;

            public C4304a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f147476q = obj;
                this.f147477r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f147475b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.avito.android.employee_mode_impl.manager.state.f.a.C4304a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.employee_mode_impl.manager.state.f$a$a r0 = (com.avito.android.employee_mode_impl.manager.state.f.a.C4304a) r0
                int r1 = r0.f147477r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f147477r = r1
                goto L18
            L13:
                com.avito.android.employee_mode_impl.manager.state.f$a$a r0 = new com.avito.android.employee_mode_impl.manager.state.f$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f147476q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f147477r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r8)
                goto L69
            L29:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L31:
                kotlin.C42729a0.b(r8)
                r8 = r7
                kotlin.Q r8 = (kotlin.Q) r8
                A r2 = r8.f406619b
                jz.a r2 = (jz.C42450a) r2
                B r8 = r8.f406620c
                jz.a r8 = (jz.C42450a) r8
                if (r2 != 0) goto L42
                goto L5e
            L42:
                java.lang.String r4 = r8.f405964b
                java.lang.String r5 = r2.f405964b
                boolean r4 = kotlin.jvm.internal.L.f(r5, r4)
                if (r4 == 0) goto L69
                jz.c r2 = r2.f405963a
                jz.b r2 = r2.getF405972a()
                jz.c r8 = r8.f405963a
                jz.b r8 = r8.getF405972a()
                boolean r8 = kotlin.jvm.internal.L.f(r2, r8)
                if (r8 != 0) goto L69
            L5e:
                r0.f147477r = r3
                kotlinx.coroutines.flow.j r8 = r6.f147475b
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L69
                return r1
            L69:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_mode_impl.manager.state.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public f(InterfaceC43160i interfaceC43160i) {
        this.f147474b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Q<? extends C42450a, ? extends C42450a>> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f147474b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
