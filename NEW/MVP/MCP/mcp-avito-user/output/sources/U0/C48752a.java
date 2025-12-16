package u0;

import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22029a2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j.InterfaceC42158n;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ColorResources.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48752a {
    @InterfaceC22029a2
    @InterfaceC22132o
    public static final long a(@l A a12, @InterfaceC42158n int i12) {
        Context context = (Context) a12.o(AndroidCompositionLocals_androidKt.f41069b);
        Resources resourcesA = h.a(a12);
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        return V.b(resourcesA.getColor(i12, theme));
    }
}
