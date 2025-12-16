package com.avito.android.photo_gallery.autoteka_teaser;

import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaTeaserGallerySingleInsightViewFullScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/button/Button;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class s extends N implements Y41.a<Button> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutotekaTeaserGallerySingleInsightViewFullScreen f216827l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AutotekaTeaserGallerySingleInsightViewFullScreen autotekaTeaserGallerySingleInsightViewFullScreen) {
        super(0);
        this.f216827l = autotekaTeaserGallerySingleInsightViewFullScreen;
    }

    @Override // Y41.a
    public final Button invoke() {
        return (Button) this.f216827l.findViewById(R.id.gallery_teaser_example);
    }
}
