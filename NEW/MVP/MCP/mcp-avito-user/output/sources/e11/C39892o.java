package e11;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;

/* renamed from: e11.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39892o extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final TextView f394691b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final V f394692c;

    /* renamed from: d, reason: collision with root package name */
    public final int f394693d;

    /* renamed from: e, reason: collision with root package name */
    public final int f394694e;

    public C39892o(@j.N Context context) {
        super(context);
        C39924z c39924z = new C39924z(context);
        TextView textView = new TextView(context);
        this.f394691b = textView;
        V v12 = new V(context);
        this.f394692c = v12;
        v12.setLines(1);
        textView.setTextSize(2, 18.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(-1);
        this.f394693d = c39924z.a(4);
        this.f394694e = c39924z.a(2);
        C39924z.m(textView, "title_text");
        C39924z.m(v12, "age_bordering");
        addView(textView);
        addView(v12);
    }

    @j.N
    public TextView getLeftText() {
        return this.f394691b;
    }

    @j.N
    public V getRightBorderedView() {
        return this.f394692c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        TextView textView = this.f394691b;
        int measuredWidth = textView.getMeasuredWidth();
        int measuredHeight = textView.getMeasuredHeight();
        V v12 = this.f394692c;
        int measuredWidth2 = v12.getMeasuredWidth();
        int measuredHeight2 = v12.getMeasuredHeight();
        int measuredHeight3 = getMeasuredHeight();
        int i16 = (measuredHeight3 - measuredHeight) / 2;
        int i17 = (measuredHeight3 - measuredHeight2) / 2;
        int i18 = this.f394693d + measuredWidth;
        textView.layout(0, i16, measuredWidth, measuredHeight + i16);
        v12.layout(i18, i17, measuredWidth2 + i18, measuredHeight2 + i17);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, BeduinInputModel.MIN_TEXT_VERSION);
        int i14 = this.f394694e;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - (i14 * 2), BeduinInputModel.MIN_TEXT_VERSION);
        V v12 = this.f394692c;
        v12.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int i15 = size / 2;
        if (v12.getMeasuredWidth() > i15) {
            v12.measure(View.MeasureSpec.makeMeasureSpec(i15, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(size2 - (i14 * 2), BeduinInputModel.MIN_TEXT_VERSION));
        }
        TextView textView = this.f394691b;
        int measuredWidth = size - v12.getMeasuredWidth();
        int i16 = this.f394693d;
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - i16, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(size2 - (i14 * 2), BeduinInputModel.MIN_TEXT_VERSION));
        setMeasuredDimension(v12.getMeasuredWidth() + textView.getMeasuredWidth() + i16, Math.max(textView.getMeasuredHeight(), v12.getMeasuredHeight()));
    }
}
