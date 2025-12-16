package zC0;

import Y61.k;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.tariff_cpt.info.deeplink.TariffCptInfoMonthsLink;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CptInfoMonthsDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzC0/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zC0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogC50437b extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ int f443956F = 0;

    /* renamed from: E, reason: collision with root package name */
    public final int f443957E;

    public DialogC50437b(@k Context context, @k List<TariffCptInfoMonthsLink.MonthData> list, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        super(context, 0, 2, null);
        this.f443957E = y6.b(16);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        D(R.layout.cpt_info_months_dialog, true);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.cpt_info_months_dialog_container);
        for (TariffCptInfoMonthsLink.MonthData monthData : list) {
            ListItemCheckmark listItemCheckmark = new ListItemCheckmark(context, null);
            int i12 = this.f443957E;
            listItemCheckmark.setPadding(i12, listItemCheckmark.getPaddingTop(), i12, listItemCheckmark.getPaddingBottom());
            listItemCheckmark.setTitle(monthData.getTitle());
            listItemCheckmark.setChecked(monthData.getIsSelected());
            listItemCheckmark.setOnClickListener(new ViewOnClickListenerC50436a(monthData, aVar, this, 0));
            if (linearLayout != null) {
                linearLayout.addView(listItemCheckmark);
            }
        }
    }
}
