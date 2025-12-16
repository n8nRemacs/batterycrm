package com.avito.android.str_booking.ui.attributed_text;

import Jx0.C14258a;
import Vx0.AbstractC15725a;
import Y41.r;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.network.models.common.Prompt;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingAttributedTextView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/ui/attributed_text/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_booking/ui/attributed_text/g;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f285917b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.str_booking_attributed_text_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f285917b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.str_booking.ui.attributed_text.g
    public final void H50(@k c cVar, @k r<? super AbstractC15725a, ? super Map<String, String>, ? super Prompt, ? super C14258a, G0> rVar) {
        AttributedText attributedText = cVar.f285912b;
        kotlin.c.c(this.f285917b, attributedText != null ? kotlin.c.a(attributedText) : null, rVar, null);
    }
}
