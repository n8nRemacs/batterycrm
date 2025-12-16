package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidAccessibilityManager.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/d;", "Landroidx/compose/ui/platform/c;", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22462d implements InterfaceC22458c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AccessibilityManager f41427a;

    /* compiled from: AndroidAccessibilityManager.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/d$a;", "", "<init>", "()V", "", "FlagContentControls", "I", "FlagContentIcons", "FlagContentText", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public C22462d(@Y61.k Context context) {
        this.f41427a = (AccessibilityManager) context.getSystemService("accessibility");
    }

    @Override // androidx.compose.ui.platform.InterfaceC22458c
    public final long a(long j12, boolean z12) {
        if (j12 >= 2147483647L) {
            return j12;
        }
        int i12 = z12 ? 7 : 3;
        int i13 = Build.VERSION.SDK_INT;
        AccessibilityManager accessibilityManager = this.f41427a;
        if (i13 >= 29) {
            C22526t0.f41602a.getClass();
            int iA2 = C22526t0.a(accessibilityManager, (int) j12, i12);
            if (iA2 != Integer.MAX_VALUE) {
                return iA2;
            }
        } else if (!z12 || !accessibilityManager.isTouchExplorationEnabled()) {
            return j12;
        }
        return Long.MAX_VALUE;
    }
}
