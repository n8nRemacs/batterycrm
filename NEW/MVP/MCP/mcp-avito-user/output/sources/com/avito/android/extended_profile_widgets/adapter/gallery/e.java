package com.avito.android.extended_profile_widgets.adapter.gallery;

import Y41.l;
import android.os.Parcelable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oB.m;

/* compiled from: GalleryItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Parcelable;", "bundle", "Lkotlin/G0;", "invoke", "(Landroid/os/Parcelable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements l<Parcelable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f154402l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ GalleryItem f154403m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, GalleryItem galleryItem) {
        super(1);
        this.f154402l = fVar;
        this.f154403m = galleryItem;
    }

    @Override // Y41.l
    public final G0 invoke(Parcelable parcelable) {
        f fVar = this.f154402l;
        fVar.f154404b.invoke(new m(this.f154403m, parcelable));
        return G0.f406611a;
    }
}
