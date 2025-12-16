package VU;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.util.C35835l0;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShadowParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LVU/d;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f17172e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f17173a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17174b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17175c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17176d;

    /* compiled from: ShadowParams.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LVU/d$a;", "LLV/c;", "LVU/d;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LV.c<d> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static d b(@f0 int i12, @k Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f179007z0);
            d dVar = new d(typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0), typedArrayObtainStyledAttributes.getColor(1, C35835l0.d(R.attr.black, context)), typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public a() {
        }
    }

    public d() {
        this(0, 0, 0, 0, 15, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f17173a == dVar.f17173a && this.f17174b == dVar.f17174b && this.f17175c == dVar.f17175c && this.f17176d == dVar.f17176d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17176d) + r.e(this.f17175c, r.e(this.f17174b, Integer.hashCode(this.f17173a) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowParams(offsetX=");
        sb2.append(this.f17173a);
        sb2.append(", offsetY=");
        sb2.append(this.f17174b);
        sb2.append(", shadowColor=");
        sb2.append(this.f17175c);
        sb2.append(", blurRadius=");
        return r.t(sb2, this.f17176d, ')');
    }

    public d(int i12, int i13, int i14, int i15) {
        this.f17173a = i12;
        this.f17174b = i13;
        this.f17175c = i14;
        this.f17176d = i15;
    }

    public /* synthetic */ d(int i12, int i13, int i14, int i15, int i16, C42822w c42822w) {
        this((i16 & 1) != 0 ? 0 : i12, (i16 & 2) != 0 ? 0 : i13, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15);
    }
}
