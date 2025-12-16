package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import kotlin.Metadata;

/* compiled from: EdgeEffectCompat.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/y;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* renamed from: androidx.compose.foundation.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21091y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C21091y f32322a = new C21091y();

    @Y61.k
    public static EdgeEffect a(@Y61.k Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(@Y61.k EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float c(@Y61.k EdgeEffect edgeEffect, float f12, float f13) {
        try {
            return edgeEffect.onPullDistance(f12, f13);
        } catch (Throwable unused) {
            edgeEffect.onPull(f12, f13);
            return 0.0f;
        }
    }
}
