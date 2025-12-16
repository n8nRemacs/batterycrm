package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;
import kotlin.Metadata;

/* compiled from: AndroidViewConfiguration.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/m0;", "Landroidx/compose/ui/platform/x2;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22499m0 implements InterfaceC22544x2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewConfiguration f41492a;

    public C22499m0(@Y61.k ViewConfiguration viewConfiguration) {
        this.f41492a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.InterfaceC22544x2
    public final float a() {
        if (Build.VERSION.SDK_INT < 34) {
            return 16.0f;
        }
        C22507o0.f41520a.getClass();
        return this.f41492a.getScaledHandwritingGestureLineMargin();
    }

    @Override // androidx.compose.ui.platform.InterfaceC22544x2
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.InterfaceC22544x2
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.InterfaceC22544x2
    public final float d() {
        if (Build.VERSION.SDK_INT < 34) {
            return 2.0f;
        }
        C22507o0.f41520a.getClass();
        return this.f41492a.getScaledHandwritingSlop();
    }

    @Override // androidx.compose.ui.platform.InterfaceC22544x2
    public final float e() {
        return this.f41492a.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.InterfaceC22544x2
    public final float g() {
        return this.f41492a.getScaledMaximumFlingVelocity();
    }
}
