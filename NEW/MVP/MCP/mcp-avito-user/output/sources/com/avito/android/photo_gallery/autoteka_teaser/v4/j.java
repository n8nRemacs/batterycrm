package com.avito.android.photo_gallery.autoteka_teaser.v4;

import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaTeaserGalleryViewV4FullScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/docking_badge/DockingBadge;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class j extends N implements Y41.a<DockingBadge> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutotekaTeaserGalleryViewV4FullScreen f216897l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AutotekaTeaserGalleryViewV4FullScreen autotekaTeaserGalleryViewV4FullScreen) {
        super(0);
        this.f216897l = autotekaTeaserGalleryViewV4FullScreen;
    }

    @Override // Y41.a
    public final DockingBadge invoke() {
        return (DockingBadge) this.f216897l.findViewById(R.id.infoBadge);
    }
}
