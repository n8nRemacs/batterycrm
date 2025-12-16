package com.avito.android.autoteka.presentation.confirmEmail.mvi;

import Jf.InterfaceC14191a;
import Jf.b;
import com.avito.android.R;
import com.avito.android.arch.mvi.a;
import com.avito.android.autoteka.domain.model.confirmEmail.ConfirmEmailDetails;
import com.avito.android.autoteka.helpers.k;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutotekaConfirmEmailActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/autoteka/presentation/confirmEmail/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LJf/a;", "LJf/b;", "LJf/d;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC14191a, Jf.b, Jf.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.order.a f97255a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ConfirmEmailDetails f97256b;

    @Inject
    public b(@Y61.k com.avito.android.autoteka.data.order.a aVar, @Y61.k ConfirmEmailDetails confirmEmailDetails) {
        this.f97255a = aVar;
        this.f97256b = confirmEmailDetails;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Jf.b> b(InterfaceC14191a interfaceC14191a, Jf.d dVar) {
        InterfaceC14191a interfaceC14191a2 = interfaceC14191a;
        if (!(interfaceC14191a2 instanceof InterfaceC14191a.b)) {
            if (interfaceC14191a2 instanceof InterfaceC14191a.C0534a) {
                return new C43210w(b.a.f9083a);
            }
            throw new NoWhenBranchMatchedException();
        }
        new com.avito.android.autoteka.helpers.k();
        Object c2871a = ((InterfaceC14191a.b) interfaceC14191a2).f9082a.length() == 0 ? new k.a.C2871a(com.avito.android.printable_text.b.c(R.string.autoteka_email_is_empty_error, new Serializable[0])) : k.a.b.f96667a;
        if (c2871a instanceof k.a.C2871a) {
            return new C43210w(new b.C0535b((k.a.C2871a) c2871a));
        }
        if (L.f(c2871a, k.a.b.f96667a)) {
            return C43175k.G(new a(this, interfaceC14191a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
