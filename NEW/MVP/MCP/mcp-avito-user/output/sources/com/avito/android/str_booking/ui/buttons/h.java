package com.avito.android.str_booking.ui.buttons;

import Jx0.C14258a;
import Vx0.AbstractC15725a;
import Y41.r;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.str_booking.network.models.common.Button;
import com.avito.android.str_booking.network.models.common.Prompt;
import java.util.List;
import java.util.Map;
import kotlin.Function4;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingButtonsView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/ui/buttons/h;", "Lcom/avito/android/str_booking/ui/buttons/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f285948b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayout f285949c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public r<? super AbstractC15725a, ? super Map<String, String>, ? super Prompt, ? super C14258a, G0> f285950d;

    public h(@k View view) {
        super(view);
        this.f285948b = view;
        View viewFindViewById = view.findViewById(R.id.buttons_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f285949c = (LinearLayout) viewFindViewById;
    }

    @Override // com.avito.android.str_booking.ui.buttons.g
    public final void cG(@k List<Button> list) {
        Function4.b(this.f285949c, list, this.f285948b, this.f285950d);
    }

    @Override // com.avito.android.str_booking.ui.buttons.g
    public final void f50(@l r<? super AbstractC15725a, ? super Map<String, String>, ? super Prompt, ? super C14258a, G0> rVar) {
        this.f285950d = rVar;
    }
}
