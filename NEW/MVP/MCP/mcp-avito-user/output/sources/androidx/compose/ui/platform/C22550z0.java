package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;
import kotlin.Metadata;

/* compiled from: AndroidWindowInfo.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/z0;", "Landroidx/compose/ui/platform/u0;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* renamed from: androidx.compose.ui.platform.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22550z0 implements InterfaceC22530u0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22550z0 f41668b = new C22550z0();

    @Override // androidx.compose.ui.platform.InterfaceC22530u0
    @Y61.k
    public final Rect a(@Y61.k Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
