package com.avito.android.publish.items.iac_for_pro;

import Y41.l;
import com.avito.android.publish.items.iac_for_pro.IacForProItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacForProItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f236918l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IacForProItem f236919m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, IacForProItem iacForProItem) {
        super(1);
        this.f236918l = gVar;
        this.f236919m = iacForProItem;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        com.jakewharton.rxrelay3.c<IacForProItem.b> cVar = this.f236918l.f236921b;
        IacForProItem iacForProItem = this.f236919m;
        String str = iacForProItem.f236903b;
        boolean z12 = iacForProItem.f236909h;
        boolean z13 = iacForProItem.f236910i;
        cVar.accept(new IacForProItem.b.a(new IacForProItem(zBooleanValue, str, iacForProItem.f236905d, iacForProItem.f236908g, z12, z13, iacForProItem.f236906e, iacForProItem.f236907f)));
        return G0.f406611a;
    }
}
