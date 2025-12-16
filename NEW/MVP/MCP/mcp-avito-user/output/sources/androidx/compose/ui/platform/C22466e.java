package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import kotlin.Metadata;

/* compiled from: AndroidClipboard.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/e;", "Landroidx/compose/ui/platform/M0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22466e implements M0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C22470f f41431a;

    public C22466e(@Y61.k C22470f c22470f) {
        this.f41431a = c22470f;
    }

    @Override // androidx.compose.ui.platform.M0
    @Y61.l
    public final K0 a() {
        ClipData primaryClip = this.f41431a.f41442a.getPrimaryClip();
        if (primaryClip != null) {
            return new K0(primaryClip);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.M0
    @Y61.l
    public final kotlin.G0 b(@Y61.l K0 k02) {
        ClipboardManager clipboardManager = this.f41431a.f41442a;
        if (k02 != null) {
            clipboardManager.setPrimaryClip(k02.f41152a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            int i12 = C22522s0.f41592a;
            clipboardManager.clearPrimaryClip();
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
        return kotlin.G0.f406611a;
    }
}
