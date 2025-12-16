package androidx.view;

import androidx.view.C23037g;
import androidx.view.Lifecycle;
import j.N;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* compiled from: ReflectiveGenericLifecycleObserver.java */
@Deprecated
/* renamed from: androidx.lifecycle.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C23054o0 implements InterfaceC22979L {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC22982O f46838b;

    /* renamed from: c, reason: collision with root package name */
    public final C23037g.a f46839c;

    public C23054o0(InterfaceC22982O interfaceC22982O) {
        this.f46838b = interfaceC22982O;
        C23037g c23037g = C23037g.f46793c;
        Class<?> cls = interfaceC22982O.getClass();
        C23037g.a aVar = (C23037g.a) c23037g.f46794a.get(cls);
        this.f46839c = aVar == null ? c23037g.a(cls, null) : aVar;
    }

    @Override // androidx.view.InterfaceC22979L
    public final void HH(@N InterfaceC22983P interfaceC22983P, @N Lifecycle.Event event) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        HashMap map = this.f46839c.f46796a;
        List list = (List) map.get(event);
        InterfaceC22982O interfaceC22982O = this.f46838b;
        C23037g.a.a(list, interfaceC22983P, event, interfaceC22982O);
        C23037g.a.a((List) map.get(Lifecycle.Event.ON_ANY), interfaceC22983P, event, interfaceC22982O);
    }
}
