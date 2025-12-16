package com.avito.android.lib.beduin_v2.renderer.component.gallery;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.component.scroll_container.state.d f176413l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.avito.beduin.v2.component.scroll_container.state.d dVar) {
        super(1);
        this.f176413l = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        l<Boolean, G0> lVar = this.f176413l.f336199g;
        if (lVar != null) {
            lVar.invoke(bool2);
        }
        return G0.f406611a;
    }
}
