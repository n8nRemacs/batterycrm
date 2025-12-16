package com.avito.android.account;

import A3.a;
import com.avito.android.remote.model.ProfileInfo;
import com.avito.android.remote.model.Session;
import java.util.Iterator;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class S implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProfileInfo f68072c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U f68073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Session f68074e;

    public /* synthetic */ S(ProfileInfo profileInfo, U u12, Session session, int i12) {
        this.f68071b = i12;
        this.f68072c = profileInfo;
        this.f68073d = u12;
        this.f68074e = session;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f68071b) {
            case 0:
                ProfileInfo profileInfo = this.f68072c;
                String email = profileInfo.getEmail();
                U u12 = this.f68073d;
                if (email != null) {
                    u12.f68080e.a(email);
                }
                a.InterfaceC0003a.c cVar = new a.InterfaceC0003a.c(profileInfo.getUserId(), profileInfo.getUserHashId(), this.f68074e.getAccessToken());
                Iterator<T> it = u12.j().iterator();
                while (it.hasNext()) {
                    ((A3.b) it.next()).e(cVar);
                }
                break;
            default:
                ProfileInfo profileInfo2 = this.f68072c;
                String email2 = profileInfo2.getEmail();
                U u13 = this.f68073d;
                if (email2 != null) {
                    u13.f68080e.a(email2);
                }
                u13.c(new a.InterfaceC0003a.b(profileInfo2.getUserId(), profileInfo2.getUserHashId(), this.f68074e.getAccessToken()));
                break;
        }
    }
}
