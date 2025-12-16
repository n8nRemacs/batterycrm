package e11;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.beduin.common.component.input.BeduinInputModel;

/* renamed from: e11.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39856c extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39875i0 f394554b;

    /* renamed from: c, reason: collision with root package name */
    public int f394555c;

    /* renamed from: d, reason: collision with root package name */
    public int f394556d;

    public C39856c(@j.N Context context) {
        super(context, null, 0);
        C39875i0 c39875i0 = new C39875i0(context);
        this.f394554b = c39875i0;
        int iC2 = C39924z.c(2, context);
        c39875i0.setPadding(iC2, iC2, iC2, iC2);
        c39875i0.setFixedHeight(C39924z.c(17, context));
        addView(c39875i0);
    }

    @j.N
    public C39875i0 getAdChoicesView() {
        return this.f394554b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int i14 = this.f394555c;
        if (i14 > 0 && this.f394556d > 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i14, BeduinInputModel.MIN_TEXT_VERSION);
            i13 = View.MeasureSpec.makeMeasureSpec(this.f394556d, 1073741824);
        }
        super.onMeasure(i12, i13);
    }
}
