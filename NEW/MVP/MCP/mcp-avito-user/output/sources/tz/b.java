package TZ;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CustomHeaderBottomSheet.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTZ/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public class b extends d {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f15701G = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final Context f15702E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f15703F;

    public /* synthetic */ b(Context context, Integer num, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : num);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.d, androidx.appcompat.app.A, android.app.Dialog
    public final void setTitle(@l CharSequence charSequence) {
        TextView textView = this.f15703F;
        if (textView == null) {
            textView = null;
        }
        I5.a(textView, charSequence, false);
    }

    public b(@k Context context, @l Integer num) {
        super(context, 0, 2, null);
        this.f15702E = context;
        d.M(this, null, false, true, 7);
        View viewInflate = View.inflate(context, R.layout.bottom_sheet_header_layout, null);
        View viewFindViewById = viewInflate.findViewById(R.id.bottom_sheet_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f15703F = (TextView) viewFindViewById;
        if (num != null) {
            int iIntValue = num.intValue();
            TextView textView = this.f15703F;
            (textView != null ? textView : null).setTextAppearance(C35835l0.j(iIntValue, viewInflate.getContext()));
        }
        View viewFindViewById2 = viewInflate.findViewById(R.id.close_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ((ImageView) viewFindViewById2).setOnClickListener(new a(this, 0));
        H(viewInflate);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.d, androidx.appcompat.app.A, android.app.Dialog
    public final void setTitle(int i12) {
        TextView textView = this.f15703F;
        if (textView == null) {
            textView = null;
        }
        I5.a(textView, this.f15702E.getText(i12), false);
    }
}
