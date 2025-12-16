package org.mockito.internal.configuration.plugins;

import com.akita.compose.theme.re23.style.C0;
import i81.InterfaceC41241a;
import i81.InterfaceC41242b;
import i81.InterfaceC41244d;
import i81.InterfaceC41245e;
import i81.InterfaceC41246f;
import i81.InterfaceC41248h;
import i81.InterfaceC41249i;
import i81.InterfaceC41250j;
import i81.InterfaceC41251k;
import java.util.HashMap;

/* compiled from: DefaultMockitoPlugins.java */
/* loaded from: classes7.dex */
class a implements InterfaceC41249i {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f421498a;

    static {
        HashMap map = new HashMap();
        f421498a = map;
        map.put(InterfaceC41250j.class.getName(), b.class.getName());
        map.put(InterfaceC41246f.class.getName(), "org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker");
        map.put(InterfaceC41251k.class.getName(), "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleanerProvider");
        map.put(InterfaceC41244d.class.getName(), "org.mockito.internal.creation.instance.DefaultInstantiatorProvider");
        map.put(InterfaceC41241a.class.getName(), "org.mockito.internal.configuration.InjectingAnnotationEngine");
        map.put("mock-maker-inline", "org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker");
        map.put("mock-maker-proxy", "org.mockito.internal.creation.proxy.ProxyMockMaker");
        map.put(InterfaceC41248h.class.getName(), "org.mockito.internal.util.ConsoleMockitoLogger");
        map.put(InterfaceC41245e.class.getName(), "org.mockito.internal.util.reflection.ReflectionMemberAccessor");
        map.put("member-accessor-module", "org.mockito.internal.util.reflection.ModuleMemberAccessor");
        map.put(InterfaceC41242b.class.getName(), "org.mockito.internal.configuration.DefaultDoNotMockEnforcer");
    }

    public static Object a(Class cls) {
        String str = (String) f421498a.get(cls.getName());
        if (str == null) {
            throw new IllegalStateException(C0.f(cls, new StringBuilder("No default implementation for requested Mockito plugin type: "), "\nIs this a valid Mockito plugin type? If yes, please report this problem to Mockito team.\nOtherwise, please check if you are passing valid plugin type.\nExamples of valid plugin types: MockMaker, StackTraceCleanerProvider."));
        }
        try {
            return cls.cast(Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception e12) {
            throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.k(cls, "Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load "), e12);
        }
    }
}
