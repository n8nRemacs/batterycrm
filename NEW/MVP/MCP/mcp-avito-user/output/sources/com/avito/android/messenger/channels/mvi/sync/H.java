package com.avito.android.messenger.channels.mvi.sync;

import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsBackendNotificationsHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "event", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/g;", "com/avito/android/messenger/channels/mvi/sync/I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class H<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188333b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f188334c;

    public H(MessengerUserHashInfo messengerUserHashInfo, J j12) {
        this.f188333b = messengerUserHashInfo;
        this.f188334c = j12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    @Override // l41.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object apply(java.lang.Object r14) {
        /*
            r13 = this;
            X81.e r14 = (X81.e) r14
            com.avito.android.messenger.channels.mvi.sync.J r0 = r13.f188334c
            com.avito.android.messenger.channels.mvi.sync.f0 r1 = r0.f188346g
            java.util.Map<java.lang.String, X81.d> r2 = r14.channels
            java.util.Set r2 = r2.keySet()
            java.util.Collection r2 = (java.util.Collection) r2
            com.avito.android.messenger.channels.mvi.data.r r3 = r1.f188473b
            ru.avito.messenger.MessengerUserHashInfo r4 = r13.f188333b
            io.reactivex.rxjava3.core.z r2 = r3.m(r4, r2)
            io.reactivex.rxjava3.internal.operators.observable.T r2 = r2.S()
            com.avito.android.util.a5 r5 = r1.f188472a
            io.reactivex.rxjava3.core.H r5 = r5.c()
            io.reactivex.rxjava3.internal.operators.single.S r2 = r2.s(r5)
            com.avito.android.messenger.channels.mvi.sync.d0 r5 = new com.avito.android.messenger.channels.mvi.sync.d0
            r5.<init>(r1, r14)
            io.reactivex.rxjava3.internal.operators.single.y r2 = r2.n(r5)
            com.avito.android.messenger.channels.mvi.sync.e0 r5 = new com.avito.android.messenger.channels.mvi.sync.e0
            r5.<init>(r1, r4)
            io.reactivex.rxjava3.core.a r1 = r2.o(r5)
            java.util.Map<java.lang.String, X81.d> r2 = r14.channels
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L45:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto La4
            java.lang.Object r6 = r2.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.getValue()
            X81.d r6 = (X81.d) r6
            java.util.List<java.lang.String> r6 = r6.removedTags
            if (r6 == 0) goto L9c
            r8 = r6
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L6b
            goto L6c
        L6b:
            r6 = 0
        L6c:
            if (r6 == 0) goto L9c
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.C42745f0.q(r6, r9)
            r8.<init>(r9)
            java.util.Iterator r6 = r6.iterator()
        L7f:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L9e
            java.lang.Object r9 = r6.next()
            java.lang.String r9 = (java.lang.String) r9
            ru.avito.messenger.MessengerUserType r10 = r4.f430681c
            com.avito.android.persistence.messenger.UserEntityType r10 = com.avito.android.messenger.util.i.g(r10)
            com.avito.android.persistence.messenger.m0 r11 = new com.avito.android.persistence.messenger.m0
            java.lang.String r12 = r4.f430682d
            r11.<init>(r10, r12, r7, r9)
            r8.add(r11)
            goto L7f
        L9c:
            kotlin.collections.z0 r8 = kotlin.collections.C42784z0.f406748b
        L9e:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            kotlin.collections.C42745f0.h(r8, r5)
            goto L45
        La4:
            io.reactivex.rxjava3.core.a r2 = r3.c(r5)
            io.reactivex.rxjava3.internal.operators.completable.b r3 = new io.reactivex.rxjava3.internal.operators.completable.b
            r3.<init>(r1, r2)
            java.util.Map<java.lang.String, X81.d> r14 = r14.channels
            java.util.Set r14 = r14.keySet()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r14 = r14.iterator()
        Lbe:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto Ld3
            java.lang.Object r2 = r14.next()
            java.lang.String r2 = (java.lang.String) r2
            IY.a$b r4 = new IY.a$b
            r4.<init>(r2)
            r1.add(r4)
            goto Lbe
        Ld3:
            kotlin.G0 r14 = kotlin.G0.f406611a
            io.reactivex.rxjava3.internal.operators.completable.T r14 = r3.B(r14)
            io.reactivex.rxjava3.core.H r2 = r0.f188344e
            com.avito.android.mvi.rx3.locks.j<IY.a> r0 = r0.f188343d
            java.lang.String r3 = "handleChannelsUpdatedEvent"
            io.reactivex.rxjava3.core.I r14 = r0.t(r14, r3, r1, r2)
            io.reactivex.rxjava3.internal.operators.completable.v r0 = new io.reactivex.rxjava3.internal.operators.completable.v
            r0.<init>(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.sync.H.apply(java.lang.Object):java.lang.Object");
    }
}
