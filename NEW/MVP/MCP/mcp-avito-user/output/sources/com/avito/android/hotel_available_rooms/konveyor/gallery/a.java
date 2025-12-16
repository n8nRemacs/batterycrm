package com.avito.android.hotel_available_rooms.konveyor.gallery;

import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import lE.C43624b;

/* compiled from: HotelRoomGalleryBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/hotel_available_rooms/konveyor/gallery/o;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/hotel_available_rooms/konveyor/gallery/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class a extends N implements p<ViewGroup, View, o> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C43624b f162930l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f162931m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C43624b c43624b, b bVar) {
        super(2);
        this.f162930l = c43624b;
        this.f162931m = bVar;
    }

    @Override // Y41.p
    public final o invoke(ViewGroup viewGroup, View view) {
        C43624b c43624b = this.f162930l;
        c43624b.getClass();
        kotlin.reflect.n<Object> nVar = C43624b.f413639o[12];
        return new o(view, ((Boolean) c43624b.f413652n.a().invoke()).booleanValue(), (com.avito.konveyor.adapter.d) this.f162931m.f162933b.get());
    }
}
