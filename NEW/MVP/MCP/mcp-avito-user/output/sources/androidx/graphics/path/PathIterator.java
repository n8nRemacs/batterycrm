package androidx.graphics.path;

import Y61.k;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import androidx.graphics.path.PathSegment;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PathIterator.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/graphics/path/PathIterator;", "", "Landroidx/graphics/path/PathSegment;", "ConicEvaluation", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PathIterator implements Iterator<PathSegment>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f46619b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PathIterator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/graphics/path/PathIterator$ConicEvaluation;", "", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ConicEvaluation {

        /* renamed from: b, reason: collision with root package name */
        public static final ConicEvaluation f46620b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ ConicEvaluation[] f46621c;

        /* JADX INFO: Fake field, exist only in values array */
        ConicEvaluation EF0;

        static {
            ConicEvaluation conicEvaluation = new ConicEvaluation("AsConic", 0);
            ConicEvaluation conicEvaluation2 = new ConicEvaluation("AsQuadratics", 1);
            f46620b = conicEvaluation2;
            f46621c = new ConicEvaluation[]{conicEvaluation, conicEvaluation2};
        }

        public ConicEvaluation() {
            throw null;
        }

        public static ConicEvaluation valueOf(String str) {
            return (ConicEvaluation) Enum.valueOf(ConicEvaluation.class, str);
        }

        public static ConicEvaluation[] values() {
            return (ConicEvaluation[]) f46621c.clone();
        }
    }

    public PathIterator(Path path, ConicEvaluation conicEvaluation, float f12, int i12, C42822w c42822w) {
        conicEvaluation = (i12 & 2) != 0 ? ConicEvaluation.f46620b : conicEvaluation;
        f12 = (i12 & 4) != 0 ? 0.25f : f12;
        this.f46619b = Build.VERSION.SDK_INT >= 34 ? new a(path, conicEvaluation, f12) : new PathIteratorPreApi34Impl(path, conicEvaluation, f12);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46619b.a();
    }

    @Override // java.util.Iterator
    public final PathSegment next() {
        PointF[] pointFArr;
        PointF[] pointFArr2;
        b bVar = this.f46619b;
        float[] fArr = bVar.f46638c;
        PathSegment.Type typeB = bVar.b(fArr);
        if (typeB == PathSegment.Type.f46632h) {
            return d.f46640a;
        }
        if (typeB == PathSegment.Type.f46631g) {
            return d.f46641b;
        }
        float f12 = typeB == PathSegment.Type.f46629e ? fArr[6] : 0.0f;
        int iOrdinal = typeB.ordinal();
        if (iOrdinal == 0) {
            pointFArr = new PointF[]{new PointF(fArr[0], fArr[1])};
        } else if (iOrdinal == 1) {
            pointFArr = new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3])};
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                pointFArr2 = iOrdinal != 4 ? new PointF[0] : new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5]), new PointF(fArr[6], fArr[7])};
                return new PathSegment(typeB, pointFArr2, f12);
            }
            pointFArr = new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5])};
        }
        pointFArr2 = pointFArr;
        return new PathSegment(typeB, pointFArr2, f12);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
