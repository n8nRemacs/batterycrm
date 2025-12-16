package com.avito.android.passport.profile_add.create_flow.select_specific.recycler;

import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Specific.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/recycler/y;", "Lcom/avito/android/passport/profile_add/create_flow/select_specific/recycler/w;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class y implements w {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<T50.a, G0> f211804b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public y(@Y61.k Y41.l<? super T50.a, G0> lVar) {
        this.f211804b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        A a12 = (A) eVar;
        u uVar = (u) aVar;
        a12.setTitle(uVar.f211795b.f211654c);
        a12.setChecked(uVar.f211796c);
        a12.a4(uVar.f211797d);
        a12.a(new x(this, uVar));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        A a12 = (A) eVar;
        u uVar = (u) aVar;
        Iterator it = list.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null ? next instanceof v : true) {
                obj = next;
            }
        }
        v vVar = (v) (obj instanceof v ? obj : null);
        if (vVar != null) {
            a12.setChecked(vVar.f211799a);
            if (vVar.f211800b) {
                a12.a4(vVar.f211801c);
                return;
            }
            return;
        }
        a12.setTitle(uVar.f211795b.f211654c);
        a12.setChecked(uVar.f211796c);
        a12.a4(uVar.f211797d);
        a12.a(new x(this, uVar));
    }
}
