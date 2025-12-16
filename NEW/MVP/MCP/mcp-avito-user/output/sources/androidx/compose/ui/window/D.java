package androidx.compose.ui.window;

import android.window.OnBackInvokedDispatcher;
import j.X;
import kotlin.Metadata;

/* compiled from: AndroidPopup.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/window/D;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes.dex */
final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f43009a = 0;

    static {
        new D();
    }

    @X41.n
    public static final void a(@Y61.k L l12, @Y61.l C c12) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (c12 == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = l12.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, c12);
    }

    @X41.n
    public static final void b(@Y61.k L l12, @Y61.l C c12) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (c12 == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = l12.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(c12);
    }
}
