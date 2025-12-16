package androidx.compose.ui.text.style;

import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextGeometricTransform.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/style/n;", "", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f42702c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final n f42703d = new n(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f42704a;

    /* renamed from: b, reason: collision with root package name */
    public final float f42705b;

    /* compiled from: TextGeometricTransform.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/n$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n() {
        float f12 = 0.0f;
        this(f12, f12, 3, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f42704a == nVar.f42704a && this.f42705b == nVar.f42705b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f42705b) + (Float.hashCode(this.f42704a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f42704a);
        sb2.append(", skewX=");
        return androidx.appcompat.app.r.k(')', this.f42705b, sb2);
    }

    public n(float f12, float f13) {
        this.f42704a = f12;
        this.f42705b = f13;
    }

    public /* synthetic */ n(float f12, float f13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 1.0f : f12, (i12 & 2) != 0 ? 0.0f : f13);
    }
}
