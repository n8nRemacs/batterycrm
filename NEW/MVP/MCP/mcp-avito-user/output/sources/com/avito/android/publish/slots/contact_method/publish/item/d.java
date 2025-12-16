package com.avito.android.publish.slots.contact_method.publish.item;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.util.D6;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PublishContactMethodItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/contact_method/publish/item/d;", "LHj/c;", "Lcom/avito/android/publish/slots/contact_method/publish/item/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends Hj.c implements c {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Object f243342m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public Y41.l<? super ContactMethodType, G0> f243343n;

    public d(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view, R.layout.contact_method_slot_publish_content, aVar);
        Map mapG = P0.g(new Q((ListItemCheckmark) this.f7656e.findViewById(R.id.contact_method_all), ContactMethodType.f243323c), new Q((ListItemCheckmark) this.f7656e.findViewById(R.id.contact_method_phone), ContactMethodType.f243325e), new Q((ListItemCheckmark) this.f7656e.findViewById(R.id.contact_method_messenger), ContactMethodType.f243324d));
        this.f243342m = mapG;
        for (Map.Entry entry : mapG.entrySet()) {
            ((ListItemCheckmark) entry.getKey()).setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(29, this, (ContactMethodType) entry.getValue()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.publish.slots.contact_method.publish.item.c
    public final void d6(@l String str) {
        for (Map.Entry entry : this.f243342m.entrySet()) {
            ((ListItemCheckmark) entry.getKey()).setChecked(((ContactMethodType) entry.getValue()).f243328b.equals(str));
        }
    }

    @Override // com.avito.android.publish.slots.contact_method.publish.item.c
    public final void l0(@k Y41.l<? super ContactMethodType, G0> lVar) {
        this.f243343n = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.publish.slots.contact_method.publish.item.c
    public final void u60(@k List<ContactMethodSelect> list) {
        Object next;
        for (Map.Entry entry : this.f243342m.entrySet()) {
            ListItemCheckmark listItemCheckmark = (ListItemCheckmark) entry.getKey();
            ContactMethodType contactMethodType = (ContactMethodType) entry.getValue();
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (L.f(((ContactMethodSelect) next).f243320b, contactMethodType.f243328b)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ContactMethodSelect contactMethodSelect = (ContactMethodSelect) next;
            D6.G(listItemCheckmark, contactMethodSelect != null);
            if (contactMethodSelect != null) {
                listItemCheckmark.setTitle(contactMethodSelect.f243321c);
                listItemCheckmark.setEnabled(contactMethodSelect.f243322d);
            }
        }
    }
}
