package com.avito.android.photo_gallery_carousel.items.image;

import com.avito.android.R;
import com.avito.android.photo_gallery_carousel.gallery_view.a;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryImageItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f217961l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f217962m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, int i12) {
        super(0);
        this.f217961l = iVar;
        this.f217962m = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        i iVar = this.f217961l;
        iVar.f217963b.invoke(iVar.f217964c.c() ? new a.e(this.f217962m) : new a.f(com.avito.android.printable_text.b.c(R.string.advert_core_network_unavailable_message, new Serializable[0])));
        return G0.f406611a;
    }
}
