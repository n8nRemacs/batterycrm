package L21;

import Y61.k;
import Y61.l;
import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.Metadata;

/* compiled from: TextDrawDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LL21/a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.yandex.div.internal.widget.slider.b f9759a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Rect f9760b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Paint f9761c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public String f9762d;

    /* renamed from: e, reason: collision with root package name */
    public float f9763e;

    /* renamed from: f, reason: collision with root package name */
    public float f9764f;

    public a(@k com.yandex.div.internal.widget.slider.b bVar) {
        this.f9759a = bVar;
        Paint paint = new Paint(1);
        paint.setTextSize(bVar.f370338a);
        paint.setColor(bVar.f370342e);
        paint.setTypeface(bVar.f370339b);
        paint.setStyle(Paint.Style.FILL);
        this.f9761c = paint;
    }
}
