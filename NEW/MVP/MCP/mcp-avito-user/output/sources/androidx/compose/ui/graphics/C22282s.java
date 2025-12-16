package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import kotlin.Metadata;

/* compiled from: AndroidPathIterator.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/s;", "Landroidx/compose/ui/graphics/PathIterator;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22282s implements PathIterator {

    /* compiled from: AndroidPathIterator.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.s$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PathIterator.ConicEvaluation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PathIterator.ConicEvaluation[] conicEvaluationArr = PathIterator.ConicEvaluation.f39307b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PathSegment.Type.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PathSegment.Type type = PathSegment.Type.f39312b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PathSegment.Type type2 = PathSegment.Type.f39312b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PathSegment.Type type3 = PathSegment.Type.f39312b;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                PathSegment.Type type4 = PathSegment.Type.f39312b;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final PathSegment next() {
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
