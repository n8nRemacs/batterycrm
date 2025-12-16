package com.avito.android.hotel_available_rooms.konveyor.gallery;

import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.RunnableC22211b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.C35976x4;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomGalleryView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/gallery/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_available_rooms/konveyor/gallery/n;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f162950g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f162951b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f162952c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f162953d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f162954e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f162955f;

    public o(@Y61.k View view, boolean z12, @Y61.k com.avito.konveyor.adapter.d dVar) {
        super(view);
        this.f162951b = dVar;
        View viewFindViewById = view.findViewById(R.id.gallery);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f162952c = recyclerView;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f162953d = linearLayoutManager;
        SV.a aVar = new SV.a(8388611, z12 ? y6.b(16) : y6.b(16));
        recyclerView.setAdapter(dVar);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(null);
        C35976x4.a(recyclerView);
        recyclerView.l(new e(z12), -1);
        aVar.b(recyclerView);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.gallery.n
    public final void G0(@Y61.k List<? extends TV0.a> list) {
        Y41.a<G0> aVar = this.f162955f;
        this.f162951b.l(list, aVar != null ? new RunnableC22211b(10, aVar) : null);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.gallery.n
    @Y61.l
    public final Parcelable d0() {
        return this.f162953d.Y0();
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.gallery.n
    public final void gb(@Y61.k Parcelable parcelable) {
        RecyclerView.m layoutManager = this.f162952c.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.X0(parcelable);
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f162954e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.gallery.n
    public final void s4(int i12) {
        this.f162952c.A0(i12);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.gallery.n
    public final void t(@Y61.k Y41.a<G0> aVar) {
        this.f162954e = aVar;
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.gallery.n
    public final void y40(@Y61.k Y41.a<G0> aVar) {
        this.f162955f = aVar;
    }
}
