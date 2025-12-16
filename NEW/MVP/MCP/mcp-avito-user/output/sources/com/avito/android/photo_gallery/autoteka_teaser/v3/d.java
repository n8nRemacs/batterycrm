package com.avito.android.photo_gallery.autoteka_teaser.v3;

import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaTeaserV3GalleryViewFullScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class d extends N implements Y41.a<TextView> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutotekaTeaserV3GalleryViewFullScreen f216867l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AutotekaTeaserV3GalleryViewFullScreen autotekaTeaserV3GalleryViewFullScreen) {
        super(0);
        this.f216867l = autotekaTeaserV3GalleryViewFullScreen;
    }

    @Override // Y41.a
    public final TextView invoke() {
        return (TextView) this.f216867l.findViewById(R.id.title);
    }
}
