package androidx.window.layout.adapter.extensions;

import Fc1.G3;
import Y61.k;
import android.content.Context;
import androidx.core.util.InterfaceC22791e;
import androidx.window.layout.n;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import m2.InterfaceC43864a;

/* compiled from: ExtensionWindowBackendApi0.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/layout/adapter/extensions/b;", "Lm2/a;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements InterfaceC43864a {
    @Override // m2.InterfaceC43864a
    public final void b(@k Context context, @k Executor executor, @k InterfaceC22791e<n> interfaceC22791e) {
        executor.execute(new G3(interfaceC22791e, 15));
    }

    @Override // m2.InterfaceC43864a
    public final void a(@k InterfaceC22791e<n> interfaceC22791e) {
    }
}
