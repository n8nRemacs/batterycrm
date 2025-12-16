package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@j.X
/* renamed from: com.yandex.metrica.impl.ob.p6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39045p6 implements InterfaceC39020o6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<InterfaceC38986mm<String>> f381285a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39213w7 f381286b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InterfaceC38986mm<String> f381287c;

    /* renamed from: com.yandex.metrica.impl.ob.p6$a */
    public class a implements InterfaceC38986mm<String> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
        public void b(@j.N String str) {
            C39045p6.a(C39045p6.this, str);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C39045p6(@j.N Context context) {
        String str;
        String strA = C38689b.a(context);
        int i12 = X21.a.f18568a;
        File noBackupFilesDir = context.getNoBackupFilesDir();
        if (noBackupFilesDir == null) {
            str = null;
        } else {
            str = noBackupFilesDir.getAbsolutePath() + "/appmetrica_native_crashes";
        }
        this(new C39213w7(strA, str));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39020o6
    public synchronized void a(@j.N InterfaceC38986mm<String> interfaceC38986mm) {
        this.f381285a.add(interfaceC38986mm);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39020o6
    public synchronized void b(@j.N InterfaceC38986mm<String> interfaceC38986mm) {
        this.f381285a.remove(interfaceC38986mm);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38941l2
    public void a() {
        this.f381286b.a(this.f381287c);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38941l2
    public void b() {
        this.f381286b.b(this.f381287c);
    }

    public static void a(C39045p6 c39045p6, String str) {
        ArrayList arrayList;
        synchronized (c39045p6) {
            arrayList = new ArrayList(c39045p6.f381285a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC38986mm) it.next()).b(str);
        }
    }

    @j.k0
    public C39045p6(@j.N C39213w7 c39213w7) {
        this.f381285a = new ArrayList();
        this.f381287c = new a();
        this.f381286b = c39213w7;
    }
}
