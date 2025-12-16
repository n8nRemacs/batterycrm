package com.avito.android.publish.slots.contact_method.item;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContactMethodItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isMessengerChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f243301l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f243302m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, i iVar) {
        super(1);
        this.f243301l = gVar;
        this.f243302m = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        g gVar = this.f243301l;
        ContactMethodItem contactMethodItem = gVar.f243306c;
        if (contactMethodItem == null) {
            contactMethodItem = null;
        }
        ContactMethodItem contactMethodItemA = ContactMethodItem.a(contactMethodItem, null, zBooleanValue, null, false, false, 247);
        gVar.f243306c = contactMethodItemA;
        this.f243302m.vO(contactMethodItemA.f243289g);
        ContactMethodItem contactMethodItem2 = gVar.f243306c;
        gVar.f243305b.accept(contactMethodItem2 != null ? contactMethodItem2 : null);
        return G0.f406611a;
    }
}
