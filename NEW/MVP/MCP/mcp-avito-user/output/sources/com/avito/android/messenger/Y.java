package com.avito.android.messenger;

import com.avito.android.remote.model.ProfileShort;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: MessengerUserIdInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/ProfileInfo;", "profileInfo", "Lio/reactivex/rxjava3/core/E;", "", "apply", "(Lcom/avito/android/remote/model/ProfileInfo;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class Y<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f186181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicReference<ProfileShort> f186182c;

    public Y(g0 g0Var, AtomicReference<ProfileShort> atomicReference) {
        this.f186181b = g0Var;
        this.f186182c = atomicReference;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    @Override // l41.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object apply(java.lang.Object r6) {
        /*
            r5 = this;
            com.avito.android.remote.model.ProfileInfo r6 = (com.avito.android.remote.model.ProfileInfo) r6
            com.avito.android.messenger.g0 r0 = r5.f186181b
            com.avito.android.e1 r1 = r0.f196362d
            r1.getClass()
            kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.C30277e1.f144946d1
            r3 = 26
            r2 = r2[r3]
            com.avito.android.A0$a r1 = r1.f144947A
            DE0.a r1 = r1.a()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L28
            com.avito.android.account.G r1 = r0.f196359a
            boolean r1 = r1.b()
            goto L29
        L28:
            r1 = 1
        L29:
            java.lang.String r2 = r6.getUserHashId()
            if (r2 == 0) goto L35
            boolean r2 = kotlin.text.C43066x.K(r2)
            if (r2 == 0) goto L7d
        L35:
            java.util.concurrent.atomic.AtomicReference<com.avito.android.remote.model.ProfileShort> r2 = r5.f186182c
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L55
            java.lang.String r3 = r6.getUserId()
            java.lang.Object r4 = r2.get()
            com.avito.android.remote.model.ProfileShort r4 = (com.avito.android.remote.model.ProfileShort) r4
            if (r4 == 0) goto L4e
            java.lang.String r4 = r4.getUserId()
            goto L4f
        L4e:
            r4 = 0
        L4f:
            boolean r3 = kotlin.jvm.internal.L.f(r3, r4)
            if (r3 != 0) goto L7d
        L55:
            if (r1 == 0) goto L7d
            h31.e<com.avito.android.remote.z0> r6 = r0.f196360b
            java.lang.Object r6 = r6.get()
            com.avito.android.remote.z0 r6 = (com.avito.android.remote.InterfaceC34401z0) r6
            io.reactivex.rxjava3.core.I r6 = r6.o()
            com.avito.android.messenger.W r1 = new com.avito.android.messenger.W
            r1.<init>(r0, r2)
            io.reactivex.rxjava3.core.a r6 = r6.o(r1)
            io.reactivex.rxjava3.internal.operators.completable.A r1 = new io.reactivex.rxjava3.internal.operators.completable.A
            io.reactivex.rxjava3.internal.operators.single.A r6 = (io.reactivex.rxjava3.internal.operators.single.A) r6
            r1.<init>(r6)
            com.avito.android.messenger.X r6 = new com.avito.android.messenger.X
            r6.<init>(r0)
            io.reactivex.rxjava3.core.z r6 = r1.p(r6)
            goto L89
        L7d:
            java.lang.String r6 = r6.getUserHashId()
            if (r6 != 0) goto L85
            java.lang.String r6 = ""
        L85:
            io.reactivex.rxjava3.internal.operators.observable.x0 r6 = io.reactivex.rxjava3.core.z.c0(r6)
        L89:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.Y.apply(java.lang.Object):java.lang.Object");
    }
}
