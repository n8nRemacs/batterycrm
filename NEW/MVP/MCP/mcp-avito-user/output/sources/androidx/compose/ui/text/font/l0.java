package androidx.compose.ui.text.font;

import android.os.Build;
import kotlin.Metadata;

/* compiled from: PlatformFontFamilyTypefaceAdapter.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/l0;", "Landroidx/compose/ui/text/font/P;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l0 implements P {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final o0 f42273a;

    public l0() {
        this.f42273a = Build.VERSION.SDK_INT >= 28 ? new p0() : new q0();
    }
}
