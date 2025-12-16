package androidx.media3.session;

import android.os.Looper;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.InterfaceC23119j;
import androidx.media3.session.BinderC23267v0;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import java.util.List;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class x1 implements InterfaceC23119j, BinderC23267v0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52673c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52674d;

    public /* synthetic */ x1(int i12, List list) {
        this.f52672b = 2;
        this.f52674d = i12;
        this.f52673c = list;
    }

    @Override // androidx.media3.session.BinderC23267v0.a
    public void a(C23229i0 c23229i0) {
        int i12 = BinderC23267v0.f52647p;
        if (c23229i0.isConnected()) {
            AbstractC37401r1<C23213d> abstractC37401r1 = c23229i0.f52506o;
            AbstractC37401r1<C23213d> abstractC37401r1B0 = C23229i0.b0((List) this.f52673c, c23229i0.f52510s, c23229i0.f52507p);
            c23229i0.f52506o = abstractC37401r1B0;
            Objects.equals(abstractC37401r1B0, abstractC37401r1);
            J jC02 = c23229i0.c0();
            jC02.getClass();
            C23110a.g(Looper.myLooper() == jC02.f52080e.getLooper());
            com.google.common.util.concurrent.D0 d0C = jC02.f52079d.c(c23229i0.f52506o);
            d0C.N(new RunnableC23220f0(c23229i0, d0C, this.f52674d), com.google.common.util.concurrent.Q0.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    @Override // androidx.media3.common.util.InterfaceC23119j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void accept(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f52674d
            java.lang.Object r1 = r6.f52673c
            r2 = 1
            r3 = -1
            int r4 = r6.f52672b
            switch(r4) {
                case 0: goto L46;
                default: goto Lb;
            }
        Lb:
            com.google.common.util.concurrent.D0 r7 = (com.google.common.util.concurrent.D0) r7
            int r4 = androidx.media3.session.A1.f51915u
            java.lang.Object r7 = r7.get()     // Catch: java.lang.InterruptedException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L1f
            androidx.media3.session.O1 r7 = (androidx.media3.session.O1) r7     // Catch: java.lang.InterruptedException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L1f
            java.lang.String r4 = "SessionResult must not be null"
            androidx.media3.common.util.C23110a.e(r7, r4)     // Catch: java.lang.InterruptedException -> L1b java.util.concurrent.ExecutionException -> L1d java.util.concurrent.CancellationException -> L1f
            goto L40
        L1b:
            r7 = move-exception
            goto L21
        L1d:
            r7 = move-exception
            goto L21
        L1f:
            r7 = move-exception
            goto L36
        L21:
            java.lang.String r2 = "Session operation failed"
            androidx.media3.common.util.s.h(r2, r7)
            androidx.media3.session.O1 r2 = new androidx.media3.session.O1
            java.lang.Throwable r7 = r7.getCause()
            boolean r7 = r7 instanceof java.lang.UnsupportedOperationException
            if (r7 == 0) goto L31
            r3 = -6
        L31:
            r2.<init>(r3)
            r7 = r2
            goto L40
        L36:
            java.lang.String r3 = "Session operation cancelled"
            androidx.media3.common.util.s.h(r3, r7)
            androidx.media3.session.O1 r7 = new androidx.media3.session.O1
            r7.<init>(r2)
        L40:
            androidx.media3.session.O0$g r1 = (androidx.media3.session.O0.g) r1
            androidx.media3.session.A1.k4(r1, r0, r7)
            return
        L46:
            androidx.media3.session.O0$g r1 = (androidx.media3.session.O0.g) r1
            com.google.common.util.concurrent.D0 r7 = (com.google.common.util.concurrent.D0) r7
            int r4 = androidx.media3.session.A1.f51915u
            r4 = 0
            java.lang.Object r7 = r7.get()     // Catch: java.lang.InterruptedException -> L59 java.util.concurrent.ExecutionException -> L5b java.util.concurrent.CancellationException -> L5d
            androidx.media3.session.q r7 = (androidx.media3.session.C23252q) r7     // Catch: java.lang.InterruptedException -> L59 java.util.concurrent.ExecutionException -> L5b java.util.concurrent.CancellationException -> L5d
            java.lang.String r5 = "LibraryResult must not be null"
            androidx.media3.common.util.C23110a.e(r7, r5)     // Catch: java.lang.InterruptedException -> L59 java.util.concurrent.ExecutionException -> L5b java.util.concurrent.CancellationException -> L5d
            goto L72
        L59:
            r7 = move-exception
            goto L5f
        L5b:
            r7 = move-exception
            goto L5f
        L5d:
            r7 = move-exception
            goto L69
        L5f:
            java.lang.String r2 = "Library operation failed"
            androidx.media3.common.util.s.h(r2, r7)
            androidx.media3.session.q r7 = androidx.media3.session.C23252q.b(r3, r4)
            goto L72
        L69:
            java.lang.String r3 = "Library operation cancelled"
            androidx.media3.common.util.s.h(r3, r7)
            androidx.media3.session.q r7 = androidx.media3.session.C23252q.b(r2, r4)
        L72:
            androidx.media3.session.O0$f r2 = r1.f52222d     // Catch: android.os.RemoteException -> L7b
            androidx.media3.common.util.C23110a.h(r2)     // Catch: android.os.RemoteException -> L7b
            r2.a(r0, r7)     // Catch: android.os.RemoteException -> L7b
            goto L8d
        L7b:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to send result to browser "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.util.s.h(r0, r7)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.x1.accept(java.lang.Object):void");
    }

    public /* synthetic */ x1(O0.g gVar, int i12, int i13) {
        this.f52672b = i13;
        this.f52673c = gVar;
        this.f52674d = i12;
    }
}
