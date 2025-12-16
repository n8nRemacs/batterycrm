package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.U1;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* renamed from: com.yandex.metrica.impl.ob.n6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38995n6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final B0 f381144a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38970m6 f381145b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Context f381146c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39180um f381147d;

    public C38995n6(@j.N Context context) {
        this(context, new B0(), new C38970m6(), C39180um.a(context));
    }

    public void a(@j.N U1.f fVar) {
        PrintWriter printWriter;
        File fileA = this.f381144a.a(this.f381146c, "appmetrica_crashes");
        if (this.f381145b.a(fileA)) {
            A3 a3A = fVar.a().a();
            String str = a3A.g() + "-" + a3A.h();
            C39132sm c39132smA = this.f381147d.a(str);
            try {
                c39132smA.a();
                this.f381144a.getClass();
                printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(fileA, str))));
            } catch (Throwable unused) {
                printWriter = null;
            }
            try {
                printWriter.write(new Z6(fVar.b(), fVar.a(), fVar.c()).k());
                A2.a((Closeable) printWriter);
                c39132smA.c();
            } catch (Throwable unused2) {
                A2.a((Closeable) printWriter);
                c39132smA.c();
            }
        }
    }

    @j.k0
    public C38995n6(@j.N Context context, @j.N B0 b02, @j.N C38970m6 c38970m6, @j.N C39180um c39180um) {
        this.f381146c = context;
        this.f381144a = b02;
        this.f381145b = c38970m6;
        this.f381147d = c39180um;
    }
}
