package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.AbstractC39260y6;

/* loaded from: classes7.dex */
public class C6 extends AbstractC39260y6 {

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private C39256y2 f377890d;

    public C6(@j.N Context context, @j.N C39256y2 c39256y2, @j.N AbstractC39260y6.a aVar, @j.P com.yandex.metrica.d dVar) {
        this(c39256y2, aVar, dVar, new A0(context));
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39260y6
    public void a(@j.N H6 h62) {
        this.f377890d.a().a(h62);
    }

    @j.k0
    public C6(@j.N C39256y2 c39256y2, @j.N AbstractC39260y6.a aVar, @j.P com.yandex.metrica.d dVar, @j.N A0 a02) {
        super(aVar, dVar, a02);
        this.f377890d = c39256y2;
    }
}
