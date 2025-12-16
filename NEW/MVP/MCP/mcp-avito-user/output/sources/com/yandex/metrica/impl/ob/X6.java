package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.core.api.ProtobufConverter;
import java.util.List;

/* loaded from: classes7.dex */
public class X6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final W6 f379868a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final J6 f379869b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final L6 f379870c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final T6 f379871d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Q6 f379872e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final R6 f379873f;

    public X6() {
        this(new W6(), new J6(new V6()), new L6(), new T6(), new Q6(), new R6());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38830gf fromModel(@j.N H6 h62) {
        C38830gf c38830gf = new C38830gf();
        F6 f62 = h62.f378242a;
        if (f62 != null) {
            c38830gf.f380638a = this.f379868a.fromModel(f62);
        }
        C39212w6 c39212w6 = h62.f378243b;
        if (c39212w6 != null) {
            c38830gf.f380639b = this.f379869b.fromModel(c39212w6);
        }
        List<D6> list = h62.f378244c;
        if (list != null) {
            c38830gf.f380642e = this.f379871d.fromModel(list);
        }
        String str = h62.f378248g;
        if (str != null) {
            c38830gf.f380640c = str;
        }
        c38830gf.f380641d = this.f379870c.a(h62.f378249h);
        if (!TextUtils.isEmpty(h62.f378245d)) {
            c38830gf.f380645h = this.f379872e.fromModel(h62.f378245d);
        }
        if (!TextUtils.isEmpty(h62.f378246e)) {
            c38830gf.f380646i = h62.f378246e.getBytes();
        }
        if (!A2.b(h62.f378247f)) {
            c38830gf.f380647j = this.f379873f.fromModel(h62.f378247f);
        }
        return c38830gf;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public X6(@j.N W6 w62, @j.N J6 j62, @j.N L6 l62, @j.N T6 t62, @j.N Q6 q62, @j.N R6 r62) {
        this.f379869b = j62;
        this.f379868a = w62;
        this.f379870c = l62;
        this.f379871d = t62;
        this.f379872e = q62;
        this.f379873f = r62;
    }
}
