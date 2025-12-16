package bG0;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoStrContentPlaceholder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbG0/e;", "Landroid/widget/FrameLayout;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final LinearLayout f57023b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f57024c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final TextView f57025d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final View f57026e;

    public /* synthetic */ e(Context context, View view, View.OnClickListener onClickListener, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : view, (i12 & 4) != 0 ? null : onClickListener);
    }

    @j
    public e(@k Context context, @l View view, @l View.OnClickListener onClickListener) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.trx_promo_str_network_problem_view, (ViewGroup) this, true);
        this.f57023b = (LinearLayout) findViewById(R.id.trx_promo_str_network_problem_container);
        this.f57024c = (TextView) findViewById(R.id.trx_promo_str_network_problem_error_title);
        this.f57025d = (TextView) findViewById(R.id.trx_promo_str_network_problem_error_text);
        this.f57026e = view;
        Button button = (Button) findViewById(R.id.trx_promo_str_network_problem_retry_button);
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }
}
