package Cb1;

import Y61.k;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.compose.runtime.internal.P;
import j.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.J;

@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LCb1/c;", "", "<init>", "()V", "a", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f2294b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public int f2295a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCb1/c$a;", "", "<init>", "()V", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    public c() {
        int i12 = J.f406821a;
        this.f2295a = 0;
    }

    public c(@k TypedArray typedArray, @g0 int i12, float f12) {
        this();
        this.f2295a = (int) (typedArray.getDimension(i12, f12) / Resources.getSystem().getDisplayMetrics().density);
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }
}
