package com.avito.android.contact_access.contact_access_package.mvi;

import Dr.AbstractC13435b;
import com.avito.android.arch.mvi.a;
import com.avito.android.contact_access.contact_access_package.mvi.entity.ContactAccessPackageState;
import com.avito.android.util.InterfaceC35741a1;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ContactAccessPackageActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/contact_access/contact_access_package/mvi/h;", "Lcom/avito/android/arch/mvi/a;", "LDr/b;", "LDr/c;", "Lcom/avito/android/contact_access/contact_access_package/mvi/entity/ContactAccessPackageState;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements com.avito.android.arch.mvi.a<AbstractC13435b, Dr.c, ContactAccessPackageState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.contact_access.contact_access_package.domain.a f125902a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f125903b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f125904c;

    @Inject
    public h(@Y61.k com.avito.android.contact_access.contact_access_package.domain.a aVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Named("WITH_TOAST_TAG") boolean z12) {
        this.f125902a = aVar;
        this.f125903b = interfaceC35741a1;
        this.f125904c = z12;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Dr.c> b(AbstractC13435b abstractC13435b, ContactAccessPackageState contactAccessPackageState) {
        return C43175k.G(new g(abstractC13435b, contactAccessPackageState, this, null));
    }
}
