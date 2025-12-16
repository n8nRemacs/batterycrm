package com.avito.android.messenger.conversation.mvi.data;

import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.conversation.mvi.data.q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C32028q implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f190494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f190495c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f190496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q1 f190497e;

    public /* synthetic */ C32028q(d0 d0Var, LocalMessage localMessage, Q1 q12, int i12) {
        this.f190494b = i12;
        this.f190495c = d0Var;
        this.f190496d = localMessage;
        this.f190497e = q12;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f190494b) {
            case 0:
                d0 d0Var = this.f190495c;
                d0Var.f190454a.p(d0Var.f190458e.a(this.f190496d), this.f190497e);
                break;
            case 1:
                d0 d0Var2 = this.f190495c;
                d0Var2.f190454a.p(d0Var2.f190458e.a(this.f190496d), this.f190497e);
                break;
            default:
                d0 d0Var3 = this.f190495c;
                d0Var3.f190454a.p(d0Var3.f190458e.a(this.f190496d), this.f190497e);
                break;
        }
    }
}
