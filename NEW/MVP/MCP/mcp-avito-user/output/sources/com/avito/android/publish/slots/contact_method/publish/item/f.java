package com.avito.android.publish.slots.contact_method.publish.item;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishContactMethodPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/contact_method/publish/item/ContactMethodType;", "type", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/slots/contact_method/publish/item/ContactMethodType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements l<ContactMethodType, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f243344l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f243345m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ PublishContactMethodItem f243346n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, g gVar, PublishContactMethodItem publishContactMethodItem) {
        super(1);
        this.f243344l = cVar;
        this.f243345m = gVar;
        this.f243346n = publishContactMethodItem;
    }

    @Override // Y41.l
    public final G0 invoke(ContactMethodType contactMethodType) {
        ContactMethodType contactMethodType2 = contactMethodType;
        this.f243344l.d6(contactMethodType2.f243328b);
        com.jakewharton.rxrelay3.c<PublishContactMethodItem> cVar = this.f243345m.f243347b;
        PublishContactMethodItem publishContactMethodItem = this.f243346n;
        cVar.accept(new PublishContactMethodItem(publishContactMethodItem.f243329b, publishContactMethodItem.f243330c, contactMethodType2.f243328b, publishContactMethodItem.f243332e, publishContactMethodItem.f243333f));
        return G0.f406611a;
    }
}
