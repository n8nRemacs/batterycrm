package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.D3;

/* renamed from: com.yandex.metrica.impl.ob.d4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38744d4 extends L3 {

    /* renamed from: A, reason: collision with root package name */
    private final String f380358A;

    /* renamed from: B, reason: collision with root package name */
    private final C39112s2 f380359B;

    public C38744d4(@j.N Context context, @j.N I3 i32, @j.N D3.a aVar, @j.N C39112s2 c39112s2, @j.N C39057pi c39057pi, @j.N AbstractC39200vi abstractC39200vi) {
        this(context, i32, new B3(), new C39232x2(), new M3(context, i32, aVar, abstractC39200vi, c39057pi, new C38694b4(c39112s2), F0.g().q().d(), A2.b(context, i32.b()), F0.g().h()), c39112s2);
    }

    @Override // com.yandex.metrica.impl.ob.L3, com.yandex.metrica.impl.ob.S3
    public synchronized void a(@j.N D3.a aVar) {
        super.a(aVar);
        this.f380359B.a(this.f380358A, aVar.f377943l);
    }

    @j.k0
    public C38744d4(@j.N Context context, @j.N I3 i32, @j.N B3 b32, @j.N C39232x2 c39232x2, @j.N M3 m32, @j.N C39112s2 c39112s2) {
        super(context, i32, b32, c39232x2, m32);
        this.f380358A = i32.a();
        this.f380359B = c39112s2;
    }
}
