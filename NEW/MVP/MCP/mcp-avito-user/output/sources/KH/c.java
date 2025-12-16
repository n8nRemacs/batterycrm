package Kh;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.bar_chart.BarChartTextSettings;
import com.avito.android.beduin.common.component.bar_chart.BarChartVerticalAxis;
import com.avito.android.beduin.common.component.bar_chart.BeduinBarChartModel;
import com.avito.android.beduin.common.component.bar_chart.VerticalAxisPosition;
import com.avito.android.beduin.common.component.bar_chart.j;
import com.avito.android.beduin_shared.model.adapter.BeduinHorizontalIndent;
import com.avito.android.lib.util.f;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: BarChartVerticalAxisDecoration.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKh/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f9607b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9608c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BarChartVerticalAxis f9609d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9610e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9611f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9612g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9613h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public FrameLayout f9614i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public PaintDrawable f9615j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public Drawable f9616k;

    /* compiled from: BarChartVerticalAxisDecoration.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9617a;

        static {
            int[] iArr = new int[VerticalAxisPosition.values().length];
            try {
                iArr[VerticalAxisPosition.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerticalAxisPosition.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9617a = iArr;
        }
    }

    public c(@k BeduinBarChartModel beduinBarChartModel, int i12) {
        this.f9607b = i12;
        this.f9608c = beduinBarChartModel.getShowFade();
        this.f9609d = beduinBarChartModel.getVerticalAxis();
        BeduinHorizontalIndent padding = beduinBarChartModel.getPadding();
        this.f9610e = y6.b(padding != null ? padding.getLeftIndent() : 0);
        BeduinHorizontalIndent padding2 = beduinBarChartModel.getPadding();
        this.f9611f = y6.b(padding2 != null ? padding2.getRightIndent() : 0);
        this.f9612g = y6.b(16);
        this.f9613h = y6.a(2.0f);
    }

    public final FrameLayout c(RecyclerView recyclerView) {
        int i12;
        String style;
        FrameLayout frameLayout = this.f9614i;
        if (frameLayout == null) {
            BarChartVerticalAxis barChartVerticalAxis = this.f9609d;
            List<String> items = barChartVerticalAxis.getItems();
            if (items == null || items.isEmpty()) {
                frameLayout = null;
            } else {
                FrameLayout frameLayout2 = (FrameLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.beduin_bar_chart_vertical_axis, (ViewGroup) null);
                int iG2 = y6.g(this.f9607b / barChartVerticalAxis.getItems().size());
                TextView textView = (TextView) frameLayout2.findViewById(R.id.tv_value);
                int i13 = a.f9617a[barChartVerticalAxis.getPosition().ordinal()];
                if (i13 == 1) {
                    textView.setPadding(this.f9610e, textView.getPaddingTop(), 0, textView.getPaddingBottom());
                    i12 = 8388691;
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textView.setPadding(0, textView.getPaddingTop(), this.f9611f, textView.getPaddingBottom());
                    i12 = 8388693;
                }
                BarChartTextSettings textSettings = barChartVerticalAxis.getTextSettings();
                if (textSettings == null || (style = textSettings.getStyle()) == null) {
                    style = "xs10";
                }
                Integer numQ = f.q(style);
                if (numQ != null) {
                    textView.setTextAppearance(C35835l0.j(numQ.intValue(), textView.getContext()));
                }
                textView.setTextColor(C48063a.f437606a.a(textView.getContext(), j.a(barChartVerticalAxis.getTextSettings())));
                textView.setGravity(i12);
                textView.setLayoutParams(new FrameLayout.LayoutParams(recyclerView.getWidth(), -1, i12));
                frameLayout2.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 0), View.MeasureSpec.makeMeasureSpec(iG2, 0));
                frameLayout2.layout(0, 0, recyclerView.getWidth(), iG2);
                frameLayout = frameLayout2;
            }
            this.f9614i = frameLayout;
        }
        return frameLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@k Canvas canvas, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        FrameLayout frameLayoutC;
        super.onDraw(canvas, recyclerView, zVar);
        BarChartVerticalAxis barChartVerticalAxis = this.f9609d;
        List<String> items = barChartVerticalAxis.getItems();
        if (items == null || items.isEmpty()) {
            return;
        }
        Drawable drawable = this.f9616k;
        if (drawable == null) {
            drawable = androidx.core.content.d.getDrawable(recyclerView.getContext(), R.drawable.dash_line);
            this.f9616k = drawable;
        }
        if (drawable == null || (frameLayoutC = c(recyclerView)) == null) {
            return;
        }
        int size = barChartVerticalAxis.getItems().size();
        int height = this.f9607b;
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = this.f9613h;
            drawable.setBounds(0, height - (i13 / 2), recyclerView.getWidth(), (i13 / 2) + height);
            drawable.draw(canvas);
            height -= frameLayoutC.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDrawOver(@k Canvas canvas, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        FrameLayout frameLayoutC;
        super.onDrawOver(canvas, recyclerView, zVar);
        if (this.f9608c) {
            PaintDrawable paintDrawable = this.f9615j;
            if (paintDrawable == null) {
                d dVar = new d(recyclerView);
                PaintDrawable paintDrawable2 = new PaintDrawable();
                paintDrawable2.setShape(new RectShape());
                paintDrawable2.setShaderFactory(dVar);
                this.f9615j = paintDrawable2;
                paintDrawable = paintDrawable2;
            }
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int iH1 = linearLayoutManager.H1();
                int i12 = this.f9612g;
                if (iH1 != 0) {
                    canvas.save();
                    paintDrawable.setBounds(0, 0, i12, recyclerView.getHeight());
                    paintDrawable.draw(canvas);
                    canvas.restore();
                }
                if (linearLayoutManager.L1() != zVar.b() - 1) {
                    canvas.save();
                    float f12 = 2;
                    canvas.rotate(180.0f, recyclerView.getWidth() / f12, recyclerView.getHeight() / f12);
                    paintDrawable.setBounds(0, 0, i12, recyclerView.getHeight());
                    paintDrawable.draw(canvas);
                    canvas.restore();
                }
            }
        }
        BarChartVerticalAxis barChartVerticalAxis = this.f9609d;
        List<String> items = barChartVerticalAxis.getItems();
        if (items == null || items.isEmpty() || (frameLayoutC = c(recyclerView)) == null) {
            return;
        }
        Iterator<T> it = barChartVerticalAxis.getItems().iterator();
        float height = 0.0f;
        while (it.hasNext()) {
            ((TextView) frameLayoutC.findViewById(R.id.tv_value)).setText((String) it.next());
            canvas.save();
            canvas.translate(0.0f, height);
            frameLayoutC.draw(canvas);
            canvas.restore();
            height += frameLayoutC.getHeight();
        }
    }
}
