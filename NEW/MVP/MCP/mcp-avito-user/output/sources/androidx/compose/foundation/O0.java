package androidx.compose.foundation;

import android.content.res.Configuration;
import androidx.compose.runtime.InterfaceC22029a2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* compiled from: DarkTheme.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O0 {
    @InterfaceC22029a2
    @InterfaceC22132o
    public static final boolean a(@Y61.l androidx.compose.runtime.A a12) {
        return (((Configuration) a12.o(AndroidCompositionLocals_androidKt.f41068a)).uiMode & 48) == 32;
    }
}
