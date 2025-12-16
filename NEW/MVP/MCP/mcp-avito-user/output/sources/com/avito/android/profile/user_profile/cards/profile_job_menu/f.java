package com.avito.android.profile.user_profile.cards.profile_job_menu;

import Ua0.InterfaceC15503a;
import com.avito.android.remote.model.user_profile.items.ProfileJobMenuItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileJobMenuItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ProfileJobMenuItem.Tile f225212l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f225213m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ProfileJobMenuItem.Tile tile, i iVar) {
        super(0);
        this.f225212l = tile;
        this.f225213m = iVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ProfileJobMenuItem.Tile tile = this.f225212l;
        if (tile != null) {
            this.f225213m.f225218b.invoke(new InterfaceC15503a.j(tile.getAction().getDeepLink()));
        }
        return G0.f406611a;
    }
}
