package com.avito.android.app.task;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class Q0 implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f91499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C28582o1 f91500c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28598u0 f91501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f91502e;

    public /* synthetic */ Q0(C28582o1 c28582o1, InterfaceC28598u0 interfaceC28598u0, LocalMessage localMessage, int i12) {
        this.f91499b = i12;
        this.f91500c = c28582o1;
        this.f91501d = interfaceC28598u0;
        this.f91502e = localMessage;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f91499b) {
            case 0:
                this.f91500c.c(this.f91501d, this.f91502e, 0, null);
                break;
            default:
                this.f91500c.c(this.f91501d, this.f91502e, 0, null);
                break;
        }
    }
}
