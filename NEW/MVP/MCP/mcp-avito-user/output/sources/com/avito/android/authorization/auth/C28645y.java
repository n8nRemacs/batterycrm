package com.avito.android.authorization.auth;

import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.authorization.auth.y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C28645y implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f93064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f93065c;

    public /* synthetic */ C28645y(A a12, int i12) {
        this.f93064b = i12;
        this.f93065c = a12;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f93064b) {
            case 0:
                A a12 = this.f93065c;
                h0 h0Var = a12.f92787p;
                if (h0Var != null) {
                    h0Var.g();
                }
                a12.f92789r = null;
                break;
            case 1:
                A a13 = this.f93065c;
                h0 h0Var2 = a13.f92787p;
                if (h0Var2 != null) {
                    h0Var2.h();
                }
                a13.j();
                break;
            case 2:
                A a14 = this.f93065c;
                h0 h0Var3 = a14.f92787p;
                if (h0Var3 != null) {
                    h0Var3.g();
                }
                a14.f92789r = null;
                break;
            case 3:
                h0 h0Var4 = this.f93065c.f92787p;
                if (h0Var4 != null) {
                    h0Var4.h();
                    break;
                }
                break;
            case 4:
                this.f93065c.f92792u = FastLoginState.f92854d;
                break;
            default:
                h0 h0Var5 = this.f93065c.f92787p;
                if (h0Var5 != null) {
                    h0Var5.h();
                    break;
                }
                break;
        }
    }
}
