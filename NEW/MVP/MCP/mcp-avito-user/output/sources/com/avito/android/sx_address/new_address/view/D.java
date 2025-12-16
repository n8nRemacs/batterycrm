package com.avito.android.sx_address.new_address.view;

import com.avito.android.lib.design.chips.Chips;
import com.avito.android.sx_address.new_address.analytics.FormInputFieldName;
import com.avito.android.sx_address.new_address.domain.AddressType;
import com.avito.android.sx_address.new_address.view.B;
import com.avito.android.sx_address.new_address.view.r;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TypeItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/D;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class D implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f293862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f293863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<FormInputFieldName, G0> f293864c;

    /* JADX WARN: Multi-variable type inference failed */
    public D(List<AddressType> list, B b12, Y41.l<? super FormInputFieldName, G0> lVar) {
        this.f293862a = list;
        this.f293863b = b12;
        this.f293864c = lVar;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        Object obj = null;
        if ((hVar instanceof B.a ? (B.a) hVar : null) != null) {
            Iterator it = ((Iterable) this.f293862a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(((AddressType) next).f293603c, hVar.getF262141c())) {
                    obj = next;
                    break;
                }
            }
            AddressType addressType = (AddressType) obj;
            B b12 = this.f293863b;
            b12.a((B.a) hVar);
            if (addressType != null) {
                b12.f293854d.K5(AddressType.a(addressType, false));
            }
            ((r.j) this.f293864c).invoke(FormInputFieldName.f293567d);
        }
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        Object obj = null;
        if ((hVar instanceof B.a ? (B.a) hVar : null) != null) {
            Iterator it = ((Iterable) this.f293862a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(((AddressType) next).f293603c, hVar.getF262141c())) {
                    obj = next;
                    break;
                }
            }
            AddressType addressType = (AddressType) obj;
            B b12 = this.f293863b;
            if (addressType != null) {
                b12.f293854d.K5(AddressType.a(addressType, true));
            }
            Y41.a<Boolean> aVar = b12.f293856f;
            if (aVar != null) {
            }
            b12.a((B.a) hVar);
            ((r.j) this.f293864c).invoke(FormInputFieldName.f293567d);
        }
    }
}
