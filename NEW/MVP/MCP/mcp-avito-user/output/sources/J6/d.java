package J6;

import Y61.k;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SalaryDrawingDelegate.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ6/d;", "LJ6/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public String f8774a = "";

    /* renamed from: b, reason: collision with root package name */
    public float f8775b;

    /* renamed from: c, reason: collision with root package name */
    public float f8776c;

    /* renamed from: d, reason: collision with root package name */
    public float f8777d;

    /* renamed from: e, reason: collision with root package name */
    public int f8778e;

    /* renamed from: f, reason: collision with root package name */
    public float f8779f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.text_view.a f8780g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Paint f8781h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final RectF f8782i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Rect f8783j;

    public d(@k Context context) {
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(context, null, 0, 0, 14, null);
        aVar.setTextAppearance(C35835l0.j(R.attr.textH70, context));
        aVar.getPaint().setColor(C35835l0.d(R.attr.white, context));
        this.f8780g = aVar;
        this.f8781h = new Paint(1);
        this.f8782i = new RectF();
        this.f8783j = new Rect();
    }

    @Override // J6.a
    public final void a(@k RectF rectF, float f12, float f13) {
        this.f8782i.set(rectF);
    }

    public final int b() {
        return (y6.a(this.f8775b) * 2) + this.f8783j.width();
    }
}
