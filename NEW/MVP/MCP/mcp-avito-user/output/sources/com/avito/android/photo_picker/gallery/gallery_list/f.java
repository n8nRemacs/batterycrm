package com.avito.android.photo_picker.gallery.gallery_list;

import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GalleryItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/gallery/gallery_list/f;", "Lcom/avito/android/photo_picker/gallery/gallery_list/c;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList<h> f219535b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f219536c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f219537d;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f219536c = cVar;
        this.f219537d = cVar;
    }

    @Override // com.avito.android.photo_picker.gallery.gallery_list.c
    @Y61.k
    /* renamed from: F6, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF219537d() {
        return this.f219537d;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        k kVar = (k) aVar;
        this.f219535b.add(hVar);
        hVar.M4(kVar.f219545e);
        hVar.s(kVar.f219549i);
        hVar.Qf(kVar.f219548h);
        hVar.sO(kVar.f219552l);
        hVar.c(new d(this, kVar));
        hVar.d(new e(this, hVar));
    }
}
