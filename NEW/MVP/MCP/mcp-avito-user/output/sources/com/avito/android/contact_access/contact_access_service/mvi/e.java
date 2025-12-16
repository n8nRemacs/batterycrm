package com.avito.android.contact_access.contact_access_service.mvi;

import Er.b;
import Er.c;
import com.avito.android.arch.mvi.t;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.K5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ContactAccessServiceEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/contact_access/contact_access_service/mvi/e;", "Lcom/avito/android/arch/mvi/t;", "LEr/b;", "LEr/c;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements t<Er.b, Er.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f125986b;

    @Inject
    public e(@Y61.k InterfaceC35741a1 interfaceC35741a1) {
        this.f125986b = interfaceC35741a1;
    }

    @Override // com.avito.android.arch.mvi.t
    public final Er.c b(Er.b bVar) {
        Er.c c0263c;
        Er.b bVar2 = bVar;
        if (bVar2.equals(b.a.f4350a)) {
            return c.a.f4356a;
        }
        if (bVar2 instanceof b.C0262b) {
            Throwable th2 = ((b.C0262b) bVar2).f4351a;
            if (!K5.e(th2)) {
                c0263c = new c.d(InterfaceC35741a1.a.a(this.f125986b, th2, null, null, 6));
                return c0263c;
            }
            return null;
        }
        if (bVar2.equals(b.e.f4354a)) {
            return c.b.f4357a;
        }
        if (bVar2 instanceof b.f) {
            c0263c = new c.C0263c(((b.f) bVar2).f4355a);
            return c0263c;
        }
        return null;
    }
}
