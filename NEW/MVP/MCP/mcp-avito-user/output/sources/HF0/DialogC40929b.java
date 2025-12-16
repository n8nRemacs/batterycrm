package hf0;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.job.cv_info_actualization.ui.items.radio.g;
import com.avito.android.lib.design.bottom_sheet.q;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeliverySummaryFeeDetailsBottomSheetDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhf0/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hf0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class DialogC40929b extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ int f397345F = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final View f397346E;

    public DialogC40929b(@k Context context, @l e eVar, @k Y41.l<? super String, G0> lVar) {
        String str;
        String str2;
        super(context, 0, 2, null);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.delivery_summary_fee_details_bottom_sheet, (ViewGroup) null);
        this.f397346E = viewInflate;
        setContentView(viewInflate);
        if (!this.f178529w) {
            this.f178529w = true;
            q qVar = this.f178530x;
            if (qVar != null) {
                qVar.setDraggable(true);
            }
        }
        Button button = (Button) viewInflate.findViewById(R.id.fee_details_bottom_sheet_button);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fee_details_bottom_sheet_text);
        if (eVar != null && (str2 = eVar.f397350a) != null) {
            textView.setText(str2);
        }
        if (eVar != null && (str = eVar.f397352c) != null && button != null) {
            button.setText(str);
        }
        if (button != null) {
            button.setOnClickListener(new g((Object) eVar, (Object) this, (Y41.l) lVar, 25));
        }
    }
}
