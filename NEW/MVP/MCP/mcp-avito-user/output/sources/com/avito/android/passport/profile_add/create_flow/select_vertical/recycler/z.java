package com.avito.android.passport.profile_add.create_flow.select_vertical.recycler;

import com.avito.android.remote.model.text.AttributedText;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Vertical.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/recycler/z;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/recycler/w;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class z implements w {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<U50.a, G0> f212031b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public z(@Y61.k Y41.l<? super U50.a, G0> lVar) {
        this.f212031b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((B) eVar, (u) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        B b12 = (B) eVar;
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
        if (vVar == null) {
            k(b12, uVar);
            return;
        }
        b12.setChecked(vVar.f212024a);
        if (vVar.f212025b) {
            b12.a4(vVar.f212026c);
        }
    }

    public final void k(@Y61.k B b12, @Y61.k u uVar) {
        AttributedText attributedText;
        X50.e eVar = uVar.f212020b;
        b12.setTitle(eVar.f18591b);
        b12.h(eVar.f18592c);
        b12.setChecked(uVar.f212021c);
        b12.a4(uVar.f212022d);
        b12.a(new x(this, uVar));
        boolean z12 = eVar.f18595f;
        b12.setEnabled(!z12);
        if (!z12 || (attributedText = eVar.f18596g) == null) {
            b12.Xr();
        } else {
            b12.Ow(new y(this, attributedText));
        }
    }
}
