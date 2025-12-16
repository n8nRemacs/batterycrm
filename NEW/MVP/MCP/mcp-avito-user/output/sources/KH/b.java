package Kh;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.bar_chart.BarChartTextSettings;
import com.avito.android.beduin.common.component.bar_chart.column.ColumnView;
import com.avito.android.beduin.common.component.bar_chart.j;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.util.f;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: BarChartValueDetailsDecoration.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKh/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f9600b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final BarChartTextSettings f9601c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f9602d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9603e = y6.a(3.0f);

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Paint f9604f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RectF f9605g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public LinearLayout f9606h;

    public b(@k String str, @l BarChartTextSettings barChartTextSettings, @k String str2) {
        this.f9600b = str;
        this.f9601c = barChartTextSettings;
        this.f9602d = str2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.f9604f = paint;
        this.f9605g = new RectF();
    }

    public final LinearLayout c(RecyclerView recyclerView) {
        String style;
        LinearLayout linearLayout = this.f9606h;
        if (linearLayout == null) {
            linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.beduin_bar_chart_tip_value, (ViewGroup) null);
            TextView textView = (TextView) linearLayout.findViewById(R.id.tv_value);
            textView.setText(this.f9602d);
            BarChartTextSettings barChartTextSettings = this.f9601c;
            if (barChartTextSettings == null || (style = barChartTextSettings.getStyle()) == null) {
                style = "xs10";
            }
            Integer numQ = f.q(style);
            if (numQ != null) {
                textView.setTextAppearance(C35835l0.j(numQ.intValue(), textView.getContext()));
            }
            textView.setTextColor(C48063a.f437606a.a(textView.getContext(), j.a(barChartTextSettings)));
            linearLayout.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), BeduinInputModel.MIN_TEXT_VERSION));
            linearLayout.layout(0, 0, linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
            this.f9606h = linearLayout;
        }
        return linearLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        if (L.f(view.getTag(), this.f9600b)) {
            recyclerView.getClass();
            int iU2 = RecyclerView.U(view);
            int iB2 = zVar.b() - 1;
            int measuredWidth = (c(recyclerView).getMeasuredWidth() - view.getWidth()) / 2;
            if (iU2 == 0) {
                rect.left = measuredWidth;
            } else if (iU2 == iB2) {
                rect.right = measuredWidth;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDrawOver(@k Canvas canvas, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.onDrawOver(canvas, recyclerView, zVar);
        LinearLayout linearLayout = (LinearLayout) recyclerView.findViewWithTag(this.f9600b);
        if (linearLayout == null) {
            return;
        }
        Paint paint = this.f9604f;
        paint.setColor(C35835l0.d(R.attr.black, recyclerView.getContext()));
        LinearLayout linearLayoutC = c(recyclerView);
        ColumnView columnView = (ColumnView) linearLayout.findViewById(R.id.column);
        int width = (linearLayout.getWidth() / 2) + linearLayout.getLeft();
        RectF rectF = this.f9605g;
        float f12 = width;
        float f13 = this.f9603e / 2.0f;
        rectF.set(f12 - f13, 0.0f, f13 + f12, columnView.getTop());
        canvas.drawRect(rectF, paint);
        canvas.save();
        canvas.translate(f12 - (linearLayoutC.getMeasuredWidth() / 2.0f), 0.0f);
        linearLayoutC.draw(canvas);
        canvas.restore();
    }
}
