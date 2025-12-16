package com.avito.android.photo_gallery.grid_gallery.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.photo_gallery.grid_gallery.GridGalleryOpenParams;
import com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction;
import fv.C40482a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GridGalleryBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/v;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class v implements com.avito.android.arch.mvi.b<GridGalleryInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final GridGalleryOpenParams f217404a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f217405b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_gallery.grid_gallery.j f217406c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l f217407d;

    @Inject
    public v(@Y61.k GridGalleryOpenParams gridGalleryOpenParams, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.photo_gallery.grid_gallery.j jVar, @Y61.k l lVar) {
        this.f217404a = gridGalleryOpenParams;
        this.f217405b = aVar;
        this.f217406c = jVar;
        this.f217407d = lVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<GridGalleryInternalAction> a() {
        return C43175k.N(C43175k.G(new t(this, null)), new u(C40482a.b(this.f217405b), this));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
