package com.avito.android.photo_gallery.autoteka_teaser.v2;

import android.widget.FrameLayout;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaTeaserV2GalleryInsightListViewFullScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class f extends N implements Y41.a<FrameLayout> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutotekaTeaserV2GalleryInsightListViewFullScreen f216850l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AutotekaTeaserV2GalleryInsightListViewFullScreen autotekaTeaserV2GalleryInsightListViewFullScreen) {
        super(0);
        this.f216850l = autotekaTeaserV2GalleryInsightListViewFullScreen;
    }

    @Override // Y41.a
    public final FrameLayout invoke() {
        return (FrameLayout) this.f216850l.findViewById(R.id.more_link);
    }
}
