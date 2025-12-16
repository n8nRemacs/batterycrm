package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ac.CrashpadServiceHelper;
import java.io.File;

@j.X
/* renamed from: com.yandex.metrica.impl.ob.v7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39189v7 implements InterfaceC38797f7<C39093r7> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final L1 f382035a;

    /* renamed from: com.yandex.metrica.impl.ob.v7$a */
    public class a implements InterfaceC39011nm<String, C38715c0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39093r7 f382036a;

        public a(C39189v7 c39189v7, C39093r7 c39093r7) {
            this.f382036a = c39093r7;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39011nm
        public C38715c0 a(String str) {
            return C39278z0.a(str, Ul.b(this.f382036a.f381730b.a())).c(this.f382036a.f381731c.f378176a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.v7$b */
    public class b implements InterfaceC39011nm<String, C38715c0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39093r7 f382037a;

        public b(C39189v7 c39189v7, C39093r7 c39093r7) {
            this.f382037a = c39093r7;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39011nm
        public C38715c0 a(String str) {
            return C39278z0.b(str, Ul.b(this.f382037a.f381730b.a())).c(this.f382037a.f381731c.f378176a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.v7$c */
    public static class c implements InterfaceC38986mm<File> {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final String f382038a;

        public c(@j.N String str) {
            this.f382038a = str;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
        public void b(File file) {
            CrashpadServiceHelper.a(this.f382038a);
        }
    }

    public C39189v7(@j.N L1 l12) {
        this.f382035a = l12;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38797f7
    public void a(@j.N C39093r7 c39093r7) {
        C39093r7 c39093r72 = c39093r7;
        this.f382035a.a(c39093r72, new b(this, c39093r72));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38797f7
    public void b(@j.N C39093r7 c39093r7) {
        C39093r7 c39093r72 = c39093r7;
        this.f382035a.a(c39093r72, new a(this, c39093r72));
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public void a2(@j.N C39093r7 c39093r7) {
        this.f382035a.a(c39093r7, new a(this, c39093r7));
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    public void b2(@j.N C39093r7 c39093r7) {
        this.f382035a.a(c39093r7, new b(this, c39093r7));
    }
}
