package com.avito.android.gallery.ui.adapter;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class g extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ GalleryFragment f159274l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(GalleryFragment galleryFragment) {
        super(0);
        this.f159274l = galleryFragment;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        com.avito.android.connection_quality.connectivity.a aVar = this.f159274l.f159257v0;
        if (aVar == null) {
            aVar = null;
        }
        return Boolean.valueOf(aVar.c());
    }
}
