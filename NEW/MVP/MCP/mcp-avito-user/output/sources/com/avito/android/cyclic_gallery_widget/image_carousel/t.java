package com.avito.android.cyclic_gallery_widget.image_carousel;

import android.net.Uri;
import com.avito.android.cyclic_gallery_widget.image_carousel.i;
import kotlin.Metadata;

/* compiled from: ImageCarouselItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class t<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f132149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f132150c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f132151d;

    public t(Uri uri, int i12, u uVar) {
        this.f132149b = uri;
        this.f132150c = i12;
        this.f132151d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        int i12 = this.f132150c;
        Uri uri = this.f132149b;
        this.f132151d.f132152b.accept(uri != null ? new i.g(uri, i12) : new i.e(i12));
    }
}
