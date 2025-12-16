package com.avito.android.contact_access.contact_access_service.mvi;

import Er.AbstractC13522a;
import Er.b;
import com.avito.android.arch.mvi.a;
import com.avito.android.contact_access.contact_access_service.mvi.entity.ContactAccessServiceState;
import com.avito.android.deeplink_handler.handler.b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ContactAccessServiceActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/contact_access/contact_access_service/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LEr/a;", "LEr/b;", "Lcom/avito/android/contact_access/contact_access_service/mvi/entity/ContactAccessServiceState;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<AbstractC13522a, Er.b, ContactAccessServiceState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f125980a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.contact_access.contact_access_service.domain.a f125981b;

    @Inject
    public a(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.contact_access.contact_access_service.domain.a aVar2) {
        this.f125980a = aVar;
        this.f125981b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Er.b> b(AbstractC13522a abstractC13522a, ContactAccessServiceState contactAccessServiceState) {
        AbstractC13522a abstractC13522a2 = abstractC13522a;
        ContactAccessServiceState contactAccessServiceState2 = contactAccessServiceState;
        boolean z12 = abstractC13522a2 instanceof AbstractC13522a.b;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f125980a;
        if (z12) {
            if (contactAccessServiceState2 instanceof ContactAccessServiceState.Content) {
                b.a.a(aVar, ((ContactAccessServiceState.Content) contactAccessServiceState2).f125994i, null, null, 6);
            }
            return C43175k.w();
        }
        if (abstractC13522a2 instanceof AbstractC13522a.c) {
            b.a.a(aVar, ((AbstractC13522a.c) abstractC13522a2).f4347a, null, null, 6);
            G0 g02 = G0.f406611a;
            return C43175k.w();
        }
        if (abstractC13522a2 instanceof AbstractC13522a.e) {
            return new C43210w(new b.f(((AbstractC13522a.e) abstractC13522a2).f4349a));
        }
        if (abstractC13522a2 instanceof AbstractC13522a.C0261a) {
            return new C43210w(b.a.f4350a);
        }
        if (abstractC13522a2.equals(AbstractC13522a.d.f4348a)) {
            return this.f125981b.a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
