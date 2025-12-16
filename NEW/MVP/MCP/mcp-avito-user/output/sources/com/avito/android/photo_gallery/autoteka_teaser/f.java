package com.avito.android.photo_gallery.autoteka_teaser;

import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaTeaserGalleryInsightsListView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class f extends N implements Y41.a<TextView> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutotekaTeaserGalleryInsightsListView f216812l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AutotekaTeaserGalleryInsightsListView autotekaTeaserGalleryInsightsListView) {
        super(0);
        this.f216812l = autotekaTeaserGalleryInsightsListView;
    }

    @Override // Y41.a
    public final TextView invoke() {
        return (TextView) this.f216812l.findViewById(R.id.title);
    }
}
