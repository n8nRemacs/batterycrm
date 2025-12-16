package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.f1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36639f1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.r f349113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36648i1 f349114c;

    public RunnableC36639f1(C36648i1 c36648i1, com.google.android.gms.common.api.r rVar) {
        this.f349114c = c36648i1;
        this.f349113b = rVar;
    }

    @Override // java.lang.Runnable
    @j.l0
    public final void run() {
        com.google.android.gms.common.api.r rVar = this.f349113b;
        C36648i1 c36648i1 = this.f349114c;
        try {
            try {
                ThreadLocal threadLocal = BasePendingResult.f348966o;
                threadLocal.set(Boolean.TRUE);
                com.google.android.gms.common.api.u uVar = c36648i1.f349137a;
                C36729v.j(uVar);
                com.google.android.gms.common.api.m mVarA = uVar.a();
                HandlerC36642g1 handlerC36642g1 = c36648i1.f349143g;
                handlerC36642g1.sendMessage(handlerC36642g1.obtainMessage(0, mVarA));
                threadLocal.set(Boolean.FALSE);
                C36648i1.e(rVar);
                com.google.android.gms.common.api.i iVar = (com.google.android.gms.common.api.i) c36648i1.f349142f.get();
                if (iVar != null) {
                    iVar.m(c36648i1);
                }
            } catch (RuntimeException e12) {
                HandlerC36642g1 handlerC36642g12 = c36648i1.f349143g;
                handlerC36642g12.sendMessage(handlerC36642g12.obtainMessage(1, e12));
                BasePendingResult.f348966o.set(Boolean.FALSE);
                C36648i1.e(rVar);
                com.google.android.gms.common.api.i iVar2 = (com.google.android.gms.common.api.i) c36648i1.f349142f.get();
                if (iVar2 != null) {
                    iVar2.m(c36648i1);
                }
            }
        } catch (Throwable th2) {
            BasePendingResult.f348966o.set(Boolean.FALSE);
            C36648i1.e(rVar);
            com.google.android.gms.common.api.i iVar3 = (com.google.android.gms.common.api.i) c36648i1.f349142f.get();
            if (iVar3 != null) {
                iVar3.m(c36648i1);
            }
            throw th2;
        }
    }
}
