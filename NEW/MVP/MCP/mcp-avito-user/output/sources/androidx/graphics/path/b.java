package androidx.graphics.path;

import Y61.k;
import android.graphics.Path;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PathIteratorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/graphics/path/b;", "", "a", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PathIterator.ConicEvaluation f46636a;

    /* renamed from: b, reason: collision with root package name */
    public final float f46637b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final float[] f46638c;

    /* compiled from: PathIteratorImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/graphics/path/b$a;", "", "<init>", "()V", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PathIteratorImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.graphics.path.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C1790b {
        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        new a(null);
        System.loadLibrary("androidx.graphics.path");
    }

    public b(@k PathIterator.ConicEvaluation conicEvaluation, float f12) {
        this.f46636a = conicEvaluation;
        this.f46637b = f12;
        this.f46638c = new float[8];
    }

    public abstract boolean a();

    @k
    public abstract PathSegment.Type b(@k float[] fArr);

    public /* synthetic */ b(Path path, PathIterator.ConicEvaluation conicEvaluation, float f12, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? PathIterator.ConicEvaluation.f46620b : conicEvaluation, (i12 & 4) != 0 ? 0.25f : f12);
    }
}
