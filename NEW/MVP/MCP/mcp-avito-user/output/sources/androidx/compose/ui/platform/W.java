package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.ui.text.font.D;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: AndroidFontResourceLoader.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/W;", "Landroidx/compose/ui/text/font/D$b;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes.dex */
public final class W implements D.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f41292a;

    public W(@Y61.k Context context) {
        this.f41292a = context;
    }

    @Override // androidx.compose.ui.text.font.D.b
    public final Object a(androidx.compose.ui.text.font.D d12) {
        if (!(d12 instanceof androidx.compose.ui.text.font.s0)) {
            throw new IllegalArgumentException("Unknown font type: " + d12);
        }
        X x12 = X.f41302a;
        int i12 = ((androidx.compose.ui.text.font.s0) d12).f42303a;
        x12.getClass();
        return this.f41292a.getResources().getFont(i12);
    }
}
