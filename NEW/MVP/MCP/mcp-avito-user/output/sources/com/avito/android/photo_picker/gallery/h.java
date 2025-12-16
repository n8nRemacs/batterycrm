package com.avito.android.photo_picker.gallery;

import Y61.k;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.permissions.G;
import com.avito.android.permissions.x;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;
import q80.InterfaceC47255b;

/* compiled from: GalleryPickerViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/gallery/h;", "Landroidx/lifecycle/P0$c;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x f219564a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f219565b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC47255b f219566c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.photo_picker.gallery.gallery_list.c f219567d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final G f219568e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f219569f;

    @Inject
    public h(@k x xVar, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC47255b interfaceC47255b, @k com.avito.android.photo_picker.gallery.gallery_list.c cVar, @k G g12, boolean z12) {
        this.f219564a = xVar;
        this.f219565b = interfaceC35745a5;
        this.f219566c = interfaceC47255b;
        this.f219567d = cVar;
        this.f219568e = g12;
        this.f219569f = z12;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        if (!cls.isAssignableFrom(e.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        G g12 = this.f219568e;
        return cls.cast(new e(this.f219564a, this.f219565b, this.f219566c, this.f219567d, g12, this.f219569f));
    }
}
