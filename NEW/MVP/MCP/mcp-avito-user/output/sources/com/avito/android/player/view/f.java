package com.avito.android.player.view;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PlayerGalleryFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class f extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PlayerGalleryFragment f220309l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PlayerGalleryFragment playerGalleryFragment) {
        super(0);
        this.f220309l = playerGalleryFragment;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        com.avito.android.connection_quality.connectivity.a aVar = this.f220309l.f220279r0;
        if (aVar == null) {
            aVar = null;
        }
        return Boolean.valueOf(aVar.c());
    }
}
