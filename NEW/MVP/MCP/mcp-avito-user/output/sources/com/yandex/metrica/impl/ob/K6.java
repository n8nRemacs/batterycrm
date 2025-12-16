package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;

/* loaded from: classes7.dex */
public class K6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final J6 f378687a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final L6 f378688b;

    public K6() {
        this(new J6(new V6()), new L6());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38780ef fromModel(@j.N C39236x6 c39236x6) {
        C38780ef c38780ef = new C38780ef();
        c38780ef.f380486a = this.f378687a.fromModel(c39236x6.f382162a);
        String str = c39236x6.f382163b;
        if (str != null) {
            c38780ef.f380487b = str;
        }
        c38780ef.f380488c = this.f378688b.a(c39236x6.f382164c);
        return c38780ef;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public K6(@j.N J6 j62, @j.N L6 l62) {
        this.f378687a = j62;
        this.f378688b = l62;
    }
}
