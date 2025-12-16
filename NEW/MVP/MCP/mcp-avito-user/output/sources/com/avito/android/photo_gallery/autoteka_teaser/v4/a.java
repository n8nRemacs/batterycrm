package com.avito.android.photo_gallery.autoteka_teaser.v4;

import android.widget.LinearLayout;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaTeaserGalleryViewV4.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class a extends N implements Y41.a<LinearLayout> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutotekaTeaserGalleryViewV4 f216888l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AutotekaTeaserGalleryViewV4 autotekaTeaserGalleryViewV4) {
        super(0);
        this.f216888l = autotekaTeaserGalleryViewV4;
    }

    @Override // Y41.a
    public final LinearLayout invoke() {
        return (LinearLayout) this.f216888l.findViewById(R.id.buttonContainer);
    }
}
