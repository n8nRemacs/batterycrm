package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;

/* compiled from: AndroidAccessibilityManager.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/t0;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* renamed from: androidx.compose.ui.platform.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22526t0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22526t0 f41602a = new C22526t0();

    public static int a(@Y61.k AccessibilityManager accessibilityManager, int i12, int i13) {
        return accessibilityManager.getRecommendedTimeoutMillis(i12, i13);
    }
}
