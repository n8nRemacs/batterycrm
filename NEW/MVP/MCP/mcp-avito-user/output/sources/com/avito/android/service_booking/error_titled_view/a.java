package com.avito.android.service_booking.error_titled_view;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingTitledErrorView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/button/Button;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class a extends N implements Y41.a<Button> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f274283l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(0);
        this.f274283l = view;
    }

    @Override // Y41.a
    public final Button invoke() {
        View viewFindViewById = this.f274283l.findViewById(R.id.retry_button);
        if (viewFindViewById != null) {
            return (Button) viewFindViewById;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
    }
}
