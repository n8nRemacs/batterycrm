package com.avito.android.design.widget;

import android.view.GestureDetector;
import com.avito.android.design.widget.ClickableGalleryPager.a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ClickableGalleryPager.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/GestureDetector;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class a extends N implements Y41.a<GestureDetector> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ClickableGalleryPager f135891l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ClickableGalleryPager clickableGalleryPager) {
        super(0);
        this.f135891l = clickableGalleryPager;
    }

    @Override // Y41.a
    public final GestureDetector invoke() {
        ClickableGalleryPager clickableGalleryPager = this.f135891l;
        return new GestureDetector(clickableGalleryPager.getContext(), clickableGalleryPager.new a());
    }
}
