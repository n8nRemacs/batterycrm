package com.avito.android.profile.user_profile.cards.silent_update;

import N90.r;
import Ua0.InterfaceC15503a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.promoblock.TnsPromoBlockItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SilentUpdatePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f225525l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CardItem.SilentUpdateItem f225526m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, CardItem.SilentUpdateItem silentUpdateItem) {
        super(0);
        this.f225525l = iVar;
        this.f225526m = silentUpdateItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink f229144f;
        i iVar = this.f225525l;
        iVar.f225531b.c(new r());
        TnsPromoBlockItem.Button button = this.f225526m.f224581c.f224508l;
        if (button != null && (f229144f = button.getF229144f()) != null) {
            iVar.f225532c.invoke(new InterfaceC15503a.C1130a(f229144f, false, 2, null));
        }
        return G0.f406611a;
    }
}
