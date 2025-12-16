package com.avito.android.important_addresses_selection.deeplink;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

/* compiled from: ImportantAddressesSelectionDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f169721l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ImportantAddressesSelectionLink f169722m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, ImportantAddressesSelectionLink importantAddressesSelectionLink) {
        super(0);
        this.f169721l = fVar;
        this.f169722m = importantAddressesSelectionLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f169721l;
        C43259k.d(fVar.f169743n, null, null, new a(fVar, this.f169722m, null), 3);
        return G0.f406611a;
    }
}
