package com.avito.android.review_gallery.adapter;

import Y41.l;
import android.os.Bundle;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReviewGalleryFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class d extends N implements l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Image f255472l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f255473m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Image image, float f12) {
        super(1);
        this.f255472l = image;
        this.f255473m = f12;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putParcelable("image", this.f255472l);
        bundle2.putFloat("ratio", this.f255473m);
        return G0.f406611a;
    }
}
