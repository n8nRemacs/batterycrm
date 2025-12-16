package com.avito.android.contact_access.contact_access_service.domain;

import Ae.InterfaceC13022a;
import Zw0.InterfaceC19615a;
import cP.InterfaceC27082a;
import com.avito.android.contact_access.contact_access_service.mvi.l;
import com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.rx3.y;

/* compiled from: ContactAccessServiceInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/contact_access/contact_access_service/domain/f;", "Lcom/avito/android/contact_access/contact_access_service/domain/a;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19615a f125967a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27082a f125968b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13022a f125969c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ContactAccessServiceArguments f125970d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final l f125971e;

    @Inject
    public f(@Y61.k InterfaceC19615a interfaceC19615a, @Y61.k InterfaceC27082a interfaceC27082a, @Y61.k InterfaceC13022a interfaceC13022a, @Y61.k ContactAccessServiceArguments contactAccessServiceArguments, @Y61.k l lVar) {
        this.f125967a = interfaceC19615a;
        this.f125968b = interfaceC27082a;
        this.f125969c = interfaceC13022a;
        this.f125970d = contactAccessServiceArguments;
        this.f125971e = lVar;
    }

    @Override // com.avito.android.contact_access.contact_access_service.domain.a
    @Y61.k
    public final C43152f0 a() {
        return new C43152f0(new c(new C43137a0(new d(2, null), C43175k.Y(y.a(this.f125967a.a()), new b(null, this)))), new e(3, null));
    }
}
