package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C38992n3;

/* renamed from: com.yandex.metrica.impl.ob.p3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39042p3<T extends C38992n3> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC39017o3<T> f381278a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final InterfaceC38967m3<T> f381279b;

    /* renamed from: com.yandex.metrica.impl.ob.p3$b */
    public static final class b<T extends C38992n3> {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        final InterfaceC39017o3<T> f381280a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        InterfaceC38967m3<T> f381281b;

        public b(@j.N InterfaceC39017o3<T> interfaceC39017o3) {
            this.f381280a = interfaceC39017o3;
        }

        @j.N
        public b<T> a(@j.N InterfaceC38967m3<T> interfaceC38967m3) {
            this.f381281b = interfaceC38967m3;
            return this;
        }

        @j.N
        public C39042p3<T> a() {
            return new C39042p3<>(this);
        }
    }

    public final boolean a(@j.N C38992n3 c38992n3) {
        InterfaceC38967m3<T> interfaceC38967m3 = this.f381279b;
        if (interfaceC38967m3 == null) {
            return false;
        }
        return interfaceC38967m3.a(c38992n3);
    }

    public void b(@j.N C38992n3 c38992n3) {
        this.f381278a.a(c38992n3);
    }

    private C39042p3(@j.N b bVar) {
        this.f381278a = bVar.f381280a;
        this.f381279b = bVar.f381281b;
    }

    @j.N
    public static <T extends C38992n3> b<T> a(@j.N InterfaceC39017o3<T> interfaceC39017o3) {
        return new b<>(interfaceC39017o3);
    }
}
