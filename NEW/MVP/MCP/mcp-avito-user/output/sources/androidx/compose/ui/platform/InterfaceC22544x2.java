package androidx.compose.ui.platform;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: ViewConfiguration.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/x2;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22544x2 {

    /* compiled from: ViewConfiguration.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.x2$a */
    public static final class a {
    }

    default float a() {
        return 16.0f;
    }

    long b();

    long c();

    default float d() {
        return 2.0f;
    }

    float e();

    default long f() {
        float f12 = 48;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return androidx.compose.ui.unit.i.a(f12, f12);
    }

    default float g() {
        return Float.MAX_VALUE;
    }
}
