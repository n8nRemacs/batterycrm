package com.avito.android.employee_bug_reporter_impl.task;

import AW.e;
import AW.f;
import Oy.InterfaceC14754g;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.service.short_task.n;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import j31.InterfaceC42189a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LoadEmployeeBugReporterDeeplinkShortTask.kt */
@C11.a
@InterfaceC42189a
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/task/b;", "Lcom/avito/android/service/short_task/n;", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends n {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14754g f147313a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f147314b;

    /* compiled from: LoadEmployeeBugReporterDeeplinkShortTask.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.employee_bug_reporter_impl.task.LoadEmployeeBugReporterDeeplinkShortTask", f = "LoadEmployeeBugReporterDeeplinkShortTask.kt", i = {0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "suspendedStart", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public b f147315q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f147316r;

        /* renamed from: t, reason: collision with root package name */
        public int f147318t;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f147316r = obj;
            this.f147318t |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.suspendedStart(null, this);
        }
    }

    @Inject
    public b(@k R0 r02, @k InterfaceC14754g interfaceC14754g) {
        super(r02.a());
        this.f147313a = interfaceC14754g;
        this.f147314b = new e("LoadEmployeeBugReporterDeeplinkShortTask", f.f434a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.service.short_task.n
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object suspendedStart(@Y61.k android.os.Bundle r4, @Y61.k kotlin.coroutines.Continuation<? super com.avito.android.service.short_task.ShortTask.Status> r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof com.avito.android.employee_bug_reporter_impl.task.b.a
            if (r4 == 0) goto L13
            r4 = r5
            com.avito.android.employee_bug_reporter_impl.task.b$a r4 = (com.avito.android.employee_bug_reporter_impl.task.b.a) r4
            int r0 = r4.f147318t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f147318t = r0
            goto L18
        L13:
            com.avito.android.employee_bug_reporter_impl.task.b$a r4 = new com.avito.android.employee_bug_reporter_impl.task.b$a
            r4.<init>(r5)
        L18:
            java.lang.Object r5 = r4.f147316r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f147318t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            com.avito.android.employee_bug_reporter_impl.task.b r4 = r4.f147315q
            kotlin.C42729a0.b(r5)     // Catch: java.lang.Exception -> L2b
            goto L4d
        L2b:
            r5 = move-exception
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C42729a0.b(r5)
            AW.e r5 = r3.f147314b
            java.lang.String r1 = "started"
            AW.e.a(r5, r1)
            Oy.g r5 = r3.f147313a     // Catch: java.lang.Exception -> L57
            r4.f147315q = r3     // Catch: java.lang.Exception -> L57
            r4.f147318t = r2     // Catch: java.lang.Exception -> L57
            java.lang.Object r4 = r5.f(r4)     // Catch: java.lang.Exception -> L57
            if (r4 != r0) goto L4c
            return r0
        L4c:
            r4 = r3
        L4d:
            AW.e r5 = r4.f147314b     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = "success"
            AW.e.a(r5, r0)     // Catch: java.lang.Exception -> L2b
            com.avito.android.service.short_task.ShortTask$Status r4 = com.avito.android.service.short_task.ShortTask.Status.f274030b     // Catch: java.lang.Exception -> L2b
            return r4
        L57:
            r5 = move-exception
            r4 = r3
        L59:
            AW.e r4 = r4.f147314b
            java.lang.String r0 = r4.f432a
            AW.f r4 = r4.f433b
            java.lang.String r1 = "failed"
            r4.c(r0, r1, r5)
            com.avito.android.service.short_task.ShortTask$Status r4 = com.avito.android.service.short_task.ShortTask.Status.f274031c
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_bug_reporter_impl.task.b.suspendedStart(android.os.Bundle, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
