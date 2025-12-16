package com.avito.android.email.email_update.mvi;

import Fy.C13855c;
import Fy.InterfaceC13853a;
import Gy.InterfaceC13928a;
import com.avito.android.account.G;
import com.avito.android.arch.mvi.a;
import com.avito.android.email.email_update.mvi.entity.EmailUpdateInternalAction;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EmailUpdateActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/email/email_update/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LFy/a;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction;", "LFy/c;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC13853a, EmailUpdateInternalAction, C13855c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13928a f147217a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f147218b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final G f147219c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f147220d;

    @Inject
    public d(@Y61.k InterfaceC13928a interfaceC13928a, @Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k G g12, @Y61.k R0 r02) {
        this.f147217a = interfaceC13928a;
        this.f147218b = interfaceC34401z0;
        this.f147219c = g12;
        this.f147220d = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.email.email_update.mvi.d r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof com.avito.android.email.email_update.mvi.c
            if (r0 == 0) goto L16
            r0 = r8
            com.avito.android.email.email_update.mvi.c r0 = (com.avito.android.email.email_update.mvi.c) r0
            int r1 = r0.f147216t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f147216t = r1
            goto L1b
        L16:
            com.avito.android.email.email_update.mvi.c r0 = new com.avito.android.email.email_update.mvi.c
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f147214r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f147216t
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3f
            if (r2 == r3) goto L39
            if (r2 != r4) goto L31
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L7c
        L2f:
            r7 = move-exception
            goto L84
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            com.avito.android.email.email_update.mvi.d r7 = r0.f147213q
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L53
        L3f:
            kotlin.C42729a0.b(r8)
            com.avito.android.remote.z0 r8 = r7.f147218b     // Catch: java.lang.Throwable -> L2f
            io.reactivex.rxjava3.core.I r8 = r8.o()     // Catch: java.lang.Throwable -> L2f
            r0.f147213q = r7     // Catch: java.lang.Throwable -> L2f
            r0.f147216t = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = kotlinx.coroutines.rx3.C43292o.b(r8, r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L53
            goto L92
        L53:
            com.avito.android.remote.model.ProfileShort r8 = (com.avito.android.remote.model.ProfileShort) r8     // Catch: java.lang.Throwable -> L2f
            com.avito.android.account.G r7 = r7.f147219c     // Catch: java.lang.Throwable -> L2f
            com.avito.android.remote.model.ProfileInfo r2 = new com.avito.android.remote.model.ProfileInfo     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r8.getUserId()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = r8.getUserHashId()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = r8.getName()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = r8.getEmail()     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r3, r5, r6, r8)     // Catch: java.lang.Throwable -> L2f
            r8 = 0
            io.reactivex.rxjava3.internal.operators.completable.g r7 = r7.h(r2, r8)     // Catch: java.lang.Throwable -> L2f
            r0.f147213q = r8     // Catch: java.lang.Throwable -> L2f
            r0.f147216t = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = kotlinx.coroutines.rx3.C43292o.a(r7, r0)     // Catch: java.lang.Throwable -> L2f
            if (r7 != r1) goto L7c
            goto L92
        L7c:
            kotlin.G0 r7 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L2f
            com.avito.android.arch.mvi.utils.c$c r8 = new com.avito.android.arch.mvi.utils.c$c     // Catch: java.lang.Throwable -> L2f
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            goto L90
        L84:
            kotlin.coroutines.CoroutineContext r8 = r0.getF411960f()
            kotlinx.coroutines.Q0.e(r8)
            com.avito.android.arch.mvi.utils.c$b r8 = new com.avito.android.arch.mvi.utils.c$b
            r8.<init>(r7)
        L90:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.email.email_update.mvi.d.c(com.avito.android.email.email_update.mvi.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<EmailUpdateInternalAction> b(InterfaceC13853a interfaceC13853a, C13855c c13855c) {
        InterfaceC13853a interfaceC13853a2 = interfaceC13853a;
        C13855c c13855c2 = c13855c;
        if (!(interfaceC13853a2 instanceof InterfaceC13853a.C0314a)) {
            throw new NoWhenBranchMatchedException();
        }
        C13855c.b bVar = c13855c2.f6097b;
        C13855c.b.a aVar = bVar instanceof C13855c.b.a ? (C13855c.b.a) bVar : null;
        if (aVar == null) {
            return C43175k.w();
        }
        if (aVar.f6101d) {
            return C43175k.w();
        }
        return C43175k.I(this.f147220d.a(), new C43152f0(C43175k.G(new a(aVar.f6098a == null, this, interfaceC13853a2, null)), new b(3, null)));
    }
}
