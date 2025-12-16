package DV;

import Y61.k;
import Y61.l;
import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.material.shape.q;
import com.google.android.material.shape.r;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ShapeStrokePainter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDV/a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public q f3179a = new q.b().a();

    /* renamed from: b, reason: collision with root package name */
    @l
    @InterfaceC42156l
    public Integer f3180b;

    /* renamed from: c, reason: collision with root package name */
    public float f3181c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Paint f3182d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final r f3183e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Path f3184f;

    public a() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(0);
        paint.setStrokeWidth(0.0f);
        this.f3182d = paint;
        this.f3183e = new r();
        this.f3184f = new Path();
    }
}
