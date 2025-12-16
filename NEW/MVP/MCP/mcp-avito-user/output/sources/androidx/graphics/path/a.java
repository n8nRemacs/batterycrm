package androidx.graphics.path;

import Y61.k;
import android.graphics.Path;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import j.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PathIteratorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/graphics/path/a;", "Landroidx/graphics/path/b;", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final android.graphics.PathIterator f46634d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ConicConverter f46635e;

    public /* synthetic */ a(Path path, PathIterator.ConicEvaluation conicEvaluation, float f12, int i12, C42822w c42822w) {
        this(path, (i12 & 2) != 0 ? PathIterator.ConicEvaluation.f46620b : conicEvaluation, (i12 & 4) != 0 ? 0.25f : f12);
    }

    @Override // androidx.graphics.path.b
    public final boolean a() {
        return this.f46634d.hasNext();
    }

    @Override // androidx.graphics.path.b
    @k
    public final PathSegment.Type b(@k float[] fArr) {
        PathSegment.Type type;
        ConicConverter conicConverter = this.f46635e;
        int i12 = conicConverter.f46617b;
        int i13 = conicConverter.f46616a;
        PathSegment.Type type2 = PathSegment.Type.f46628d;
        if (i12 < i13) {
            conicConverter.b(fArr);
            return type2;
        }
        int next = this.f46634d.next(fArr, 0);
        PathSegment.Type[] typeArr = c.f46639a;
        PathSegment.Type type3 = PathSegment.Type.f46629e;
        switch (next) {
            case 0:
                type = PathSegment.Type.f46626b;
                break;
            case 1:
                type = PathSegment.Type.f46627c;
                break;
            case 2:
                type = type2;
                break;
            case 3:
                type = type3;
                break;
            case 4:
                type = PathSegment.Type.f46630f;
                break;
            case 5:
                type = PathSegment.Type.f46631g;
                break;
            case 6:
                type = PathSegment.Type.f46632h;
                break;
            default:
                throw new IllegalArgumentException(AK.c.g(next, "Unknown path segment type "));
        }
        if (type == type3) {
            if (this.f46636a == PathIterator.ConicEvaluation.f46620b) {
                conicConverter.a(fArr, fArr[6], this.f46637b);
                if (conicConverter.f46616a > 0) {
                    conicConverter.b(fArr);
                }
                return type2;
            }
        }
        return type;
    }

    public a(@k Path path, @k PathIterator.ConicEvaluation conicEvaluation, float f12) {
        super(conicEvaluation, f12);
        this.f46634d = path.getPathIterator();
        this.f46635e = new ConicConverter();
    }
}
