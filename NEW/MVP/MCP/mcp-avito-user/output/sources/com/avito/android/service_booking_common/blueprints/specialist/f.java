package com.avito.android.service_booking_common.blueprints.specialist;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SbSpecialistItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/specialist/f;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f276489b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f276490c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f276491d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f276492e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f276493f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f276494g;

    public f(@k View view) {
        super(view);
        this.f276489b = view;
        View viewFindViewById = view.findViewById(R.id.specialist_name);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f276490c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.specialist_speciality);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f276491d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.specialist_avatar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f276492e = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.specialist_rating);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f276493f = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.specialist_rating_and_reviews);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f276494g = (TextView) viewFindViewById5;
    }
}
