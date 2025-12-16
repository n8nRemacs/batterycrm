package com.avito.android.account;

import A3.a;
import com.avito.android.remote.model.Session;
import java.util.Iterator;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class Q implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U f68068c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Session f68069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f68070e;

    public /* synthetic */ Q(U u12, Session session, String str, int i12) {
        this.f68067b = i12;
        this.f68068c = u12;
        this.f68069d = session;
        this.f68070e = str;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f68067b) {
            case 0:
                a.InterfaceC0003a.d dVar = new a.InterfaceC0003a.d(this.f68069d.getAccessToken(), this.f68070e);
                Iterator<T> it = this.f68068c.j().iterator();
                while (it.hasNext()) {
                    ((A3.b) it.next()).p(dVar);
                }
                break;
            default:
                this.f68068c.f68078c.b(this.f68069d, this.f68070e);
                break;
        }
    }
}
