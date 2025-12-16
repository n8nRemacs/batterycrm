package androidx.compose.foundation.layout;

import android.view.ViewConfiguration;
import kotlin.Metadata;

/* compiled from: WindowInsetsConnection.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D2 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f28229a = ViewConfiguration.getScrollFriction();

    /* renamed from: b, reason: collision with root package name */
    public static final double f28230b;

    /* renamed from: c, reason: collision with root package name */
    public static final double f28231c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f28230b = dLog;
        f28231c = dLog - 1.0d;
    }
}
