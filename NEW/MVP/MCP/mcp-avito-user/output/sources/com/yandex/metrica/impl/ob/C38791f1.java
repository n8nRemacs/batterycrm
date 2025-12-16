package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.f1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38791f1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC39020o6 f380514a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final J2 f380515b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C f380516c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39205w f380517d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final List<InterfaceC38941l2> f380518e;

    public C38791f1(@j.N Context context, @j.N ICommonExecutor iCommonExecutor) {
        this(A2.a(21) ? new C39045p6(context) : new C39069q6(), new J2(context, iCommonExecutor), new C(context, iCommonExecutor), new C39205w());
    }

    public synchronized void a(@j.N InterfaceC38941l2 interfaceC38941l2) {
        this.f380518e.add(interfaceC38941l2);
    }

    @j.N
    public C b() {
        return this.f380516c;
    }

    @j.N
    public InterfaceC39020o6 c() {
        return this.f380514a;
    }

    @j.N
    public J2 d() {
        return this.f380515b;
    }

    public synchronized void e() {
        Iterator<InterfaceC38941l2> it = this.f380518e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public synchronized void f() {
        Iterator<InterfaceC38941l2> it = this.f380518e.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @j.N
    public C39205w a() {
        return this.f380517d;
    }

    @j.k0
    public C38791f1(@j.N InterfaceC39020o6 interfaceC39020o6, @j.N J2 j22, @j.N C c12, @j.N C39205w c39205w) {
        ArrayList arrayList = new ArrayList();
        this.f380518e = arrayList;
        this.f380514a = interfaceC39020o6;
        arrayList.add(interfaceC39020o6);
        this.f380515b = j22;
        arrayList.add(j22);
        this.f380516c = c12;
        arrayList.add(c12);
        this.f380517d = c39205w;
        arrayList.add(c39205w);
    }
}
