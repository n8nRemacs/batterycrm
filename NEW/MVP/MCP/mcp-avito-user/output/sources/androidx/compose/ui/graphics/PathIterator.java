package androidx.compose.ui.graphics;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: PathIterator.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/PathIterator;", "", "Landroidx/compose/ui/graphics/PathSegment;", "ConicEvaluation", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PathIterator extends Iterator<PathSegment>, Z41.a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PathIterator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConicEvaluation {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ConicEvaluation[] f39307b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f39308c;

        static {
            ConicEvaluation[] conicEvaluationArr = {new ConicEvaluation("AsConic", 0), new ConicEvaluation("AsQuadratics", 1)};
            f39307b = conicEvaluationArr;
            f39308c = kotlin.enums.c.a(conicEvaluationArr);
        }

        public ConicEvaluation() {
            throw null;
        }

        public static ConicEvaluation valueOf(String str) {
            return (ConicEvaluation) Enum.valueOf(ConicEvaluation.class, str);
        }

        public static ConicEvaluation[] values() {
            return (ConicEvaluation[]) f39307b.clone();
        }
    }
}
