package lf;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.auto_select_core.ui.models.AutoSelectButtonStyle;
import com.avito.android.lib.design.button.Button;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Buttons.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_auto-select-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: lf.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C43763b {
    @k
    public static final Button a(@k Context context, @k String str, @k Y41.a aVar, @l AutoSelectButtonStyle autoSelectButtonStyle, int i12) {
        View viewFindViewById = LayoutInflater.from(context).inflate(R.layout.auto_select_booking_button, (ViewGroup) null).findViewById(R.id.auto_select_core_booking_action);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        button.setText(str);
        button.setOnClickListener(new A(28, aVar));
        if (autoSelectButtonStyle != null) {
            button.setAppearance(C35835l0.j(autoSelectButtonStyle.f96082b, button.getContext()));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.bottomMargin = i12;
        button.setLayoutParams(marginLayoutParams);
        return button;
    }
}
