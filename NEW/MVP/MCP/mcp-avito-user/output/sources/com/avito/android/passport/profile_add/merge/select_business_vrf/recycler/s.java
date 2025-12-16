package com.avito.android.passport.profile_add.merge.select_business_vrf.recycler;

import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PassportSelectBusinessItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/recycler/s;", "LTV0/f;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/recycler/A;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/recycler/PassportSelectBusinessItem;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s implements TV0.f<A, PassportSelectBusinessItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, G0> f213529b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public s(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f213529b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        A a12 = (A) eVar;
        PassportSelectBusinessItem passportSelectBusinessItem = (PassportSelectBusinessItem) aVar;
        a12.e(passportSelectBusinessItem.f213500b);
        a12.setChecked(passportSelectBusinessItem.f213502d);
        a12.j4(passportSelectBusinessItem.f213503e);
        a12.a(new r(this, passportSelectBusinessItem));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        A a12 = (A) eVar;
        PassportSelectBusinessItem passportSelectBusinessItem = (PassportSelectBusinessItem) aVar;
        Iterator it = list.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null ? next instanceof o : true) {
                obj = next;
            }
        }
        o oVar = (o) (obj instanceof o ? obj : null);
        if (oVar != null) {
            a12.e(oVar.f213523a);
            a12.setChecked(oVar.f213524b);
            a12.j4(oVar.f213525c);
        } else {
            a12.e(passportSelectBusinessItem.f213500b);
            a12.setChecked(passportSelectBusinessItem.f213502d);
            a12.j4(passportSelectBusinessItem.f213503e);
            a12.a(new r(this, passportSelectBusinessItem));
        }
    }
}
