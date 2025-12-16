package com.avito.android.messenger.conversation.mvi.data;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.conversation.mvi.data.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C32025n implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f190481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f190482c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f190483d;

    public /* synthetic */ C32025n(d0 d0Var, LocalMessage localMessage, int i12) {
        this.f190481b = i12;
        this.f190482c = d0Var;
        this.f190483d = localMessage;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f190481b) {
            case 0:
                d0 d0Var = this.f190482c;
                d0Var.f190454a.w(d0Var.f190458e.a(this.f190483d));
                break;
            default:
                d0 d0Var2 = this.f190482c;
                d0Var2.f190454a.j(d0Var2.f190458e.a(this.f190483d));
                break;
        }
    }
}
