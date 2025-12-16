package com.avito.android.employee_stub_impl;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.squareup.anvil.annotations.ContributesBinding;
import hz.InterfaceC41196a;
import iz.C42140a;
import javax.inject.Inject;
import jz.InterfaceC42451b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import mz.InterfaceC44153a;

/* compiled from: EmployeeStubForBxContentImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_stub_impl/a;", "Lmz/a;", "_avito_employee-stub_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements InterfaceC44153a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC41196a f147578a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C4310a f147579b;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.employee_stub_impl.a$a, reason: collision with other inner class name */
    public static final class C4310a implements InterfaceC43160i<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f147580b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f147581c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.employee_stub_impl.a$a$a, reason: collision with other inner class name */
        public static final class C4311a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f147582b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f147583c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.employee_stub_impl.EmployeeStubForBxContentImpl$special$$inlined$map$1$2", f = "EmployeeStubForBxContentImpl.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.employee_stub_impl.a$a$a$a, reason: collision with other inner class name */
            public static final class C4312a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f147584q;

                /* renamed from: r, reason: collision with root package name */
                public int f147585r;

                public C4312a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f147584q = obj;
                    this.f147585r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C4311a.this.emit(null, this);
                }
            }

            public C4311a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f147582b = interfaceC43172j;
                this.f147583c = aVar;
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
                    boolean r0 = r6 instanceof com.avito.android.employee_stub_impl.a.C4310a.C4311a.C4312a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.employee_stub_impl.a$a$a$a r0 = (com.avito.android.employee_stub_impl.a.C4310a.C4311a.C4312a) r0
                    int r1 = r0.f147585r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f147585r = r1
                    goto L18
                L13:
                    com.avito.android.employee_stub_impl.a$a$a$a r0 = new com.avito.android.employee_stub_impl.a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f147584q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f147585r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L55
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    jz.b r5 = (jz.InterfaceC42451b) r5
                    com.avito.android.employee_stub_impl.a r6 = r4.f147583c
                    r6.getClass()
                    boolean r6 = r5 instanceof jz.InterfaceC42451b.a
                    if (r6 == 0) goto L41
                    r5 = 0
                    goto L46
                L41:
                    boolean r5 = r5 instanceof jz.InterfaceC42451b.C11596b
                    if (r5 == 0) goto L58
                    r5 = r3
                L46:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                    r0.f147585r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f147582b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L55
                    return r1
                L55:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                L58:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_stub_impl.a.C4310a.C4311a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C4310a(InterfaceC43160i interfaceC43160i, a aVar) {
            this.f147580b = interfaceC43160i;
            this.f147581c = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super Boolean> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f147580b.collect(new C4311a(interfaceC43172j, this.f147581c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    @Inject
    public a(@k InterfaceC41196a interfaceC41196a) {
        this.f147578a = interfaceC41196a;
        this.f147579b = new C4310a(interfaceC41196a.g(new C42140a(true, false)), this);
    }

    public final boolean a() {
        InterfaceC42451b interfaceC42451bA = this.f147578a.a();
        if (interfaceC42451bA instanceof InterfaceC42451b.a) {
            return false;
        }
        if (interfaceC42451bA instanceof InterfaceC42451b.C11596b) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
