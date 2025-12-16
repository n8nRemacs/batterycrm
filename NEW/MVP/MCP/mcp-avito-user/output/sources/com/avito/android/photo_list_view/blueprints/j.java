package com.avito.android.photo_list_view.blueprints;

import com.avito.android.image.enhancement.InterfaceC30978i;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiStatePhotoItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class j extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f218137l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(1);
        this.f218137l = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        Boolean bool2 = bool;
        boolean zBooleanValue = bool2.booleanValue();
        k kVar = this.f218137l;
        InterfaceC30978i interfaceC30978i = kVar.f218142f;
        if (interfaceC30978i != null && interfaceC30978i.H0(zBooleanValue)) {
            kVar.f218144h.onNext(bool2);
        }
        return G0.f406611a;
    }
}
