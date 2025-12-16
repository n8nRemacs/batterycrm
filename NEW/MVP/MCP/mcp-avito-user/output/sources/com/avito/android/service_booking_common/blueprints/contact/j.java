package com.avito.android.service_booking_common.blueprints.contact;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SbContactItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/contact/j;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f276306i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f276307b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f276308c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f276309d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f276310e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f276311f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f276312g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f276313h;

    public j(@k View view) {
        super(view);
        this.f276307b = view;
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f276308c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f276309d = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.phone);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f276310e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.copy_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f276311f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.show_phone_number);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f276312g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.header);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f276313h = (TextView) viewFindViewById6;
    }

    public final void B80(@l String str, @l String str2) {
        boolean z12 = str2 == null || str2.length() == 0;
        TextView textView = this.f276312g;
        if (z12) {
            D6.w(textView);
        } else {
            I5.a(textView, str, false);
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        }
    }
}
