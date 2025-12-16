package ru.avito.messenger.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MessengerConnectionHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/avito/messenger/internal/connection/c;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/E;", "Lru/avito/messenger/internal/state_machine/g$a;", "Lru/avito/messenger/internal/connection/d$b;", "apply", "(Lru/avito/messenger/internal/connection/c;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class X<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C47754g f431272b;

    public X(C47754g c47754g) {
        this.f431272b = c47754g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // l41.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object apply(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            ru.avito.messenger.internal.connection.c r9 = (ru.avito.messenger.internal.connection.C47750c) r9
            ru.avito.messenger.internal.connection.b r2 = r9.f431285b
            boolean r3 = r2.f431277a
            ru.avito.messenger.internal.connection.g r4 = r8.f431272b
            if (r3 == 0) goto La8
            java.lang.String r3 = r2.f431278b
            int r5 = r3.length()
            if (r5 <= 0) goto La8
            boolean r5 = r2.f431280d
            if (r5 == 0) goto La8
            ru.avito.messenger.internal.connection.b r9 = r9.f431284a
            ru.avito.messenger.l0 r5 = r9.f431279c
            boolean r6 = r5.d()
            if (r6 == 0) goto L32
            ru.avito.messenger.l0 r6 = r2.f431279c
            boolean r7 = r6.d()
            if (r7 == 0) goto L32
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L32
            r5 = r0
            goto L33
        L32:
            r5 = r1
        L33:
            java.lang.String r9 = r9.f431278b
            int r6 = r9.length()
            if (r6 <= 0) goto L49
            int r6 = r3.length()
            if (r6 <= 0) goto L49
            boolean r9 = r9.equals(r3)
            if (r9 != 0) goto L49
            r9 = r0
            goto L4a
        L49:
            r9 = r1
        L4a:
            if (r5 != 0) goto L4e
            if (r9 == 0) goto L54
        L4e:
            boolean r9 = r4.f431324s
            if (r9 == 0) goto L54
            r9 = r0
            goto L55
        L54:
            r9 = r1
        L55:
            ru.avito.messenger.internal.state_machine.g<ru.avito.messenger.internal.connection.d$b> r5 = r4.f431306a
            io.reactivex.rxjava3.internal.operators.observable.L r5 = r5.M0()
            com.avito.android.util.a5 r6 = r4.f431312g
            io.reactivex.rxjava3.core.H r6 = r6.c()
            io.reactivex.rxjava3.internal.operators.observable.I0 r5 = r5.j0(r6)
            r6 = 1
            io.reactivex.rxjava3.core.z r5 = r5.q0(r6)
            ru.avito.messenger.internal.connection.y<T> r6 = ru.avito.messenger.internal.connection.C47771y.f431386b
            io.reactivex.rxjava3.internal.operators.observable.W r5 = r5.N(r6)
            ru.avito.messenger.internal.connection.z<T, R> r6 = ru.avito.messenger.internal.connection.C47772z.f431387b
            io.reactivex.rxjava3.internal.operators.observable.L r5 = r5.D(r6)
            ru.avito.messenger.internal.connection.I r6 = new ru.avito.messenger.internal.connection.I
            r6.<init>(r4, r3)
            io.reactivex.rxjava3.core.z r3 = r5.y0(r6)
            ru.avito.messenger.internal.connection.J r5 = new ru.avito.messenger.internal.connection.J
            r5.<init>(r4)
            io.reactivex.rxjava3.internal.operators.observable.O r3 = r3.K(r5)
            ru.avito.messenger.internal.connection.g$a r5 = new ru.avito.messenger.internal.connection.g$a
            ru.avito.messenger.internal.connection.T r6 = new ru.avito.messenger.internal.connection.T
            r6.<init>(r4, r2)
            ru.avito.messenger.internal.connection.U r2 = new ru.avito.messenger.internal.connection.U
            r2.<init>(r4)
            r5.<init>(r0, r6, r2, r9)
            io.reactivex.rxjava3.internal.operators.observable.x0 r9 = io.reactivex.rxjava3.core.z.c0(r5)
            r2 = 2
            io.reactivex.rxjava3.core.E[] r2 = new io.reactivex.rxjava3.core.E[r2]
            r2[r1] = r9
            r2[r0] = r3
            io.reactivex.rxjava3.core.z r9 = io.reactivex.rxjava3.core.z.q(r2)
            goto Lbb
        La8:
            ru.avito.messenger.internal.connection.g$a r9 = new ru.avito.messenger.internal.connection.g$a
            ru.avito.messenger.internal.connection.V r0 = new ru.avito.messenger.internal.connection.V
            r0.<init>(r4, r2)
            ru.avito.messenger.internal.connection.W r2 = new ru.avito.messenger.internal.connection.W
            r2.<init>(r4)
            r9.<init>(r1, r0, r2, r1)
            io.reactivex.rxjava3.internal.operators.observable.x0 r9 = io.reactivex.rxjava3.core.z.c0(r9)
        Lbb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.avito.messenger.internal.connection.X.apply(java.lang.Object):java.lang.Object");
    }
}
