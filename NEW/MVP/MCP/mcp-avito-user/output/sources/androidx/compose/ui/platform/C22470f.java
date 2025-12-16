package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import android.content.Context;
import kotlin.Metadata;

/* compiled from: AndroidClipboardManager.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/f;", "Landroidx/compose/ui/platform/O0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22470f implements O0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ClipboardManager f41442a;

    public C22470f(@Y61.k Context context) {
        this.f41442a = (ClipboardManager) context.getSystemService("clipboard");
    }
}
