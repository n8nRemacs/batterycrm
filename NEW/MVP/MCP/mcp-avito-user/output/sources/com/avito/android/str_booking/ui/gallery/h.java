package com.avito.android.str_booking.ui.gallery;

import Y41.p;
import Y61.k;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.gallery.ui.GalleryView;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingGalleryView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/ui/gallery/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_booking/ui/gallery/g;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f286037f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f286038b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FragmentManager f286039c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final GalleryView f286040d;

    /* renamed from: e, reason: collision with root package name */
    public c f286041e;

    public h(@k View view, @k FragmentManager fragmentManager) {
        super(view);
        this.f286038b = view;
        this.f286039c = fragmentManager;
        View viewFindViewById = view.findViewById(R.id.str_booking_gallery);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.gallery.ui.GalleryView");
        }
        this.f286040d = (GalleryView) viewFindViewById;
    }

    @Override // com.avito.android.str_booking.ui.gallery.g
    public final void Go(@k p<? super List<Image>, ? super Integer, G0> pVar) {
        int i12 = this.f286038b.getContext().getResources().getConfiguration().orientation != 2 ? 6 : 2;
        c cVar = this.f286041e;
        if (cVar == null) {
            cVar = null;
        }
        List<Image> list = cVar.f286033b;
        com.avito.android.gig_shift_action.ui.a aVar = new com.avito.android.gig_shift_action.ui.a(7, pVar, this);
        this.f286040d.a(this.f286039c, list, new C31685o(13), aVar, 0, i12);
    }

    @Override // com.avito.android.str_booking.ui.gallery.g
    public final void fR(@k c cVar) {
        this.f286041e = cVar;
    }
}
