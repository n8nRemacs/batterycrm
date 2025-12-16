package com.avito.android.publish.details.auto_description;

import com.avito.android.publish.details.ItemDetailsView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoDescriptionDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f233533l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar) {
        super(1);
        this.f233533l = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        e eVar = this.f233533l;
        eVar.f233504K.G0(zBooleanValue);
        eVar.f233510Q.a(null);
        ItemDetailsView itemDetailsView = eVar.f233509P;
        if (itemDetailsView != null) {
            itemDetailsView.q1();
        }
        return G0.f406611a;
    }
}
