package com.avito.android.verification.links.tinkoff_finish;

import com.avito.android.verification.verification_input_inn.w;
import l41.InterfaceC43543a;
import ru.avito.messenger.internal.connection.C47754g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class g implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f324584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f324585c;

    public /* synthetic */ g(Object obj, int i12) {
        this.f324584b = i12;
        this.f324585c = obj;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f324584b) {
            case 0:
                ((i) this.f324585c).a();
                break;
            case 1:
                com.avito.android.verification.links.tinkoff_finish_web.d dVar = (com.avito.android.verification.links.tinkoff_finish_web.d) this.f324585c;
                dVar.f324607g.g(dVar.d(), false);
                break;
            case 2:
                ((w) this.f324585c).f325656T.setValue(Boolean.FALSE);
                break;
            default:
                ((C47754g) this.f324585c).f431311f.b("Config saved");
                break;
        }
    }
}
