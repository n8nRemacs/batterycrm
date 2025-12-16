package com.avito.android.app.task;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;

/* compiled from: LocalMessageSender.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.d0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28548d0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28587q0 f91579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f91580c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f91581d;

    public C28548d0(C28587q0 c28587q0, LocalMessage localMessage, Boolean bool) {
        this.f91579b = c28587q0;
        this.f91580c = localMessage;
        this.f91581d = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // l41.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r5) {
        /*
            r4 = this;
            io.reactivex.rxjava3.disposables.d r5 = (io.reactivex.rxjava3.disposables.d) r5
            com.avito.android.app.task.q0 r5 = r4.f91579b
            com.avito.android.messenger.channels.mvi.sync.z0 r5 = r5.f91706p
            com.avito.android.remote.model.messenger.message.LocalMessage r0 = r4.f91580c
            java.lang.Long r0 = r0.getSendTimestamp()
            r1 = 0
            if (r0 == 0) goto L1a
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Boolean r3 = r4.f91581d
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1a
            goto L1b
        L1a:
            r0 = r1
        L1b:
            r5.i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.app.task.C28548d0.accept(java.lang.Object):void");
    }
}
