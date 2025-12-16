package com.avito.android.lib.beduin_v2.component.radio;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RadioComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.avito.component.radio.state.a f175872l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.beduin.v2.avito.component.radio.state.a aVar) {
        super(1);
        this.f175872l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        l<Boolean, G0> lVar;
        boolean zBooleanValue = bool.booleanValue();
        com.avito.beduin.v2.avito.component.radio.state.a aVar = this.f175872l;
        if (zBooleanValue && (lVar = aVar.f334881d) != null) {
            lVar.invoke(Boolean.TRUE);
        }
        Y41.a<G0> aVar2 = aVar.f334882e;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return G0.f406611a;
    }
}
