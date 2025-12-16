package com.avito.android.mortgage.person_form.list.items.input;

import E00.b;
import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InputPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f200711l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InputItem f200712m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, InputItem inputItem) {
        super(1);
        this.f200711l = eVar;
        this.f200712m = inputItem;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        e eVar = this.f200711l;
        InputItem inputItem = this.f200712m;
        l<E00.b, G0> lVar = eVar.f200713b;
        if (zBooleanValue) {
            lVar.invoke(new b.i(inputItem.f200688b));
        } else {
            lVar.invoke(new b.j(inputItem.f200688b));
        }
        return G0.f406611a;
    }
}
