package com.avito.android.publish.slots.contact_method.item;

import androidx.compose.runtime.internal.P;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContactMethodItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/contact_method/item/g;", "Lcom/avito/android/publish/slots/contact_method/item/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ContactMethodItem> f243305b = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: c, reason: collision with root package name */
    public ContactMethodItem f243306c;

    @Inject
    public g() {
    }

    @Override // com.avito.android.publish.slots.contact_method.item.d
    /* renamed from: L, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF243305b() {
        return this.f243305b;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((i) eVar, (ContactMethodItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        ContactMethodItem contactMethodItem = (ContactMethodItem) aVar;
        this.f243306c = contactMethodItem;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof c) {
                obj = obj2;
            }
        }
        c cVar = (c) (obj instanceof c ? obj : null);
        if (cVar == null) {
            k(iVar, contactMethodItem);
            return;
        }
        String str = cVar.f243296a;
        if (str != null) {
            this.f243306c = ContactMethodItem.a(contactMethodItem, str, false, null, false, false, 253);
            iVar.dO(str);
        }
        Boolean bool = cVar.f243297b;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            this.f243306c = ContactMethodItem.a(contactMethodItem, null, zBooleanValue, null, false, false, 247);
            iVar.ot(zBooleanValue);
        }
        String str2 = cVar.f243298c;
        if (str2 != null) {
            this.f243306c = ContactMethodItem.a(contactMethodItem, null, false, str2, false, false, 239);
            iVar.Ev(str2);
        }
        Boolean bool2 = cVar.f243299d;
        if (bool2 != null) {
            boolean zBooleanValue2 = bool2.booleanValue();
            this.f243306c = ContactMethodItem.a(contactMethodItem, null, false, null, zBooleanValue2, false, 223);
            iVar.vO(zBooleanValue2);
        }
        Boolean bool3 = cVar.f243300e;
        if (bool3 != null) {
            boolean zBooleanValue3 = bool3.booleanValue();
            this.f243306c = ContactMethodItem.a(contactMethodItem, null, false, null, false, zBooleanValue3, 127);
            iVar.ge(zBooleanValue3);
        }
    }

    public final void k(@Y61.k i iVar, @Y61.k ContactMethodItem contactMethodItem) {
        this.f243306c = contactMethodItem;
        iVar.CF(contactMethodItem.f243286d);
        ContactMethodItem contactMethodItem2 = this.f243306c;
        if (contactMethodItem2 == null) {
            contactMethodItem2 = null;
        }
        iVar.dO(contactMethodItem2.f243285c);
        ContactMethodItem contactMethodItem3 = this.f243306c;
        if (contactMethodItem3 == null) {
            contactMethodItem3 = null;
        }
        iVar.ot(contactMethodItem3.f243287e);
        iVar.f80(new e(this, iVar));
        ContactMethodItem contactMethodItem4 = this.f243306c;
        if (contactMethodItem4 == null) {
            contactMethodItem4 = null;
        }
        iVar.Ev(contactMethodItem4.f243288f);
        ContactMethodItem contactMethodItem5 = this.f243306c;
        if (contactMethodItem5 == null) {
            contactMethodItem5 = null;
        }
        iVar.vO(contactMethodItem5.f243289g);
        ContactMethodItem contactMethodItem6 = this.f243306c;
        if (contactMethodItem6 == null) {
            contactMethodItem6 = null;
        }
        if (contactMethodItem6.f243290h) {
            iVar.xI();
        }
        iVar.jk(new f(this, iVar));
        ContactMethodItem contactMethodItem7 = this.f243306c;
        iVar.ge((contactMethodItem7 != null ? contactMethodItem7 : null).f243291i);
    }
}
