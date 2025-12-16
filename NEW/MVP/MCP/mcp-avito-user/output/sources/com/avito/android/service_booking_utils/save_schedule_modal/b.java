package com.avito.android.service_booking_utils.save_schedule_modal;

import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SaveScheduleInfoButtonsView.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_utils/save_schedule_modal/b;", "Landroid/widget/LinearLayout;", "", "isLoading", "Lkotlin/G0;", "setViewLoading", "(Z)V", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f278386d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f278387b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f278388c;

    public b(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.buttons_modal_save_schedule_info, this);
        View viewFindViewById = viewInflate.findViewById(R.id.modal_first_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f278387b = (Button) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.modal_second_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f278388c = (Button) viewFindViewById2;
    }

    public final void setViewLoading(boolean isLoading) {
        Button button = this.f278387b;
        button.setLoading(isLoading);
        button.setClickable(!isLoading);
        D6.F(this.f278388c, !isLoading);
    }
}
