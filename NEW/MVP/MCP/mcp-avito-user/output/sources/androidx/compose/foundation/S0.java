package androidx.compose.foundation;

import android.view.ViewConfiguration;
import kotlin.Metadata;

/* compiled from: EdgeEffectCompat.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26838a = ViewConfiguration.getScrollFriction();

    /* renamed from: b, reason: collision with root package name */
    public static final double f26839b;

    /* renamed from: c, reason: collision with root package name */
    public static final double f26840c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f26839b = dLog;
        f26840c = dLog - 1.0d;
    }
}
