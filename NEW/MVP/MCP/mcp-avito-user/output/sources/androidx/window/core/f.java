package androidx.window.core;

import androidx.window.core.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* compiled from: ConsumerAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/core/f;", "Landroidx/window/core/e$b;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements e.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f55187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f55188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55189c;

    public f(Object obj, Object obj2, Method method) {
        this.f55187a = method;
        this.f55188b = obj;
        this.f55189c = obj2;
    }

    @Override // androidx.window.core.e.b
    public final void dispose() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f55187a.invoke(this.f55188b, this.f55189c);
    }
}
