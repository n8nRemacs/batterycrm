package com.avito.android.contact_access.contact_access_package.mvi;

import Dr.AbstractC13434a;
import Dr.c;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ContactAccessPackageOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/contact_access/contact_access_package/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "LDr/c;", "LDr/a;", "<init>", "()V", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements t<Dr.c, AbstractC13434a> {
    @Inject
    public l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.t
    public final AbstractC13434a b(Dr.c cVar) {
        AbstractC13434a.b bVar;
        AbstractC13434a dVar;
        boolean z12 = true;
        int i12 = 2;
        boolean z13 = false;
        Dr.c cVar2 = cVar;
        DeepLink deepLink = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        if (cVar2 instanceof c.a) {
            dVar = new AbstractC13434a.C0197a(z13, deepLink, 3, objArr9 == true ? 1 : 0);
        } else {
            if (!(cVar2 instanceof c.h)) {
                if (cVar2 instanceof c.e) {
                    bVar = new AbstractC13434a.b(((c.e) cVar2).f3485a ? C42745f0.U(AbstractC13434a.c.f3476a, new AbstractC13434a.C0197a(z12, objArr8 == true ? 1 : 0, i12, objArr7 == true ? 1 : 0)) : Collections.singletonList(new AbstractC13434a.C0197a(z12, objArr6 == true ? 1 : 0, i12, objArr5 == true ? 1 : 0)));
                } else if (cVar2 instanceof c.b) {
                    bVar = new AbstractC13434a.b(C42745f0.U(new AbstractC13434a.d(((c.b) cVar2).f3482a), new AbstractC13434a.C0197a(z12, objArr4 == true ? 1 : 0, i12, objArr3 == true ? 1 : 0)));
                } else {
                    if (!(cVar2 instanceof c.g)) {
                        if (cVar2 instanceof c.i) {
                            return new AbstractC13434a.C0197a(((c.i) cVar2).f3488a, false);
                        }
                        return null;
                    }
                    bVar = new AbstractC13434a.b(C42745f0.U(new AbstractC13434a.d(((c.g) cVar2).f3487a), new AbstractC13434a.C0197a(z12, objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0)));
                }
                return bVar;
            }
            dVar = new AbstractC13434a.d(null);
        }
        return dVar;
    }
}
