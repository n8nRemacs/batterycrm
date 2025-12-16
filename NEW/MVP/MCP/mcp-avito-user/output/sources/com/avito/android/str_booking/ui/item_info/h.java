package com.avito.android.str_booking.ui.item_info;

import Jx0.C14258a;
import Vx0.AbstractC15725a;
import Y41.r;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.str_booking.network.models.common.Prompt;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingItemInfoView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/ui/item_info/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_booking/ui/item_info/g;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f286086g = 0;

    /* renamed from: b, reason: collision with root package name */
    @l
    public c f286087b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ConstraintLayout f286088c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f286089d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f286090e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f286091f;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.str_booking_item_info_section);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f286088c = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.str_booking_item_info_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f286089d = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.str_booking_item_info_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f286090e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.str_booking_item_info_address);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f286091f = (TextView) viewFindViewById4;
    }

    @Override // com.avito.android.str_booking.ui.item_info.g
    public final void jS(@k c cVar) {
        this.f286087b = cVar;
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(this.f286089d));
        aVar.f(Uri.parse(cVar.f286078b));
        aVar.f169485c = Integer.valueOf(R.drawable.bg_stub_radius_10);
        aVar.f169486d = true;
        aVar.e(y6.b(10));
        aVar.c();
        I5.a(this.f286090e, cVar.f286079c, false);
        I5.a(this.f286091f, cVar.f286080d, false);
    }

    @Override // com.avito.android.str_booking.ui.item_info.g
    public final void qq(@k r<? super AbstractC15725a, ? super Map<String, String>, ? super Prompt, ? super C14258a, G0> rVar) {
        String str;
        c cVar = this.f286087b;
        if (cVar == null || (str = cVar.f286081e) == null) {
            return;
        }
        this.f286088c.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(22, rVar, kotlin.c.d(str)));
    }
}
