package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.core.api.ProtobufConverter;
import java.util.List;

/* loaded from: classes7.dex */
public class S6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final W6 f379351a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final J6 f379352b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final L6 f379353c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final T6 f379354d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Q6 f379355e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final R6 f379356f;

    public S6() {
        this(new W6(), new J6(new V6()), new L6(), new T6(), new Q6(), new R6());
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38855hf fromModel(@j.N B6 b62) {
        C38855hf c38855hf = new C38855hf();
        String str = b62.f377819a;
        String str2 = c38855hf.f380711f;
        if (str == null) {
            str = str2;
        }
        c38855hf.f380711f = str;
        H6 h62 = b62.f377820b;
        if (h62 != null) {
            F6 f62 = h62.f378242a;
            if (f62 != null) {
                c38855hf.f380706a = this.f379351a.fromModel(f62);
            }
            C39212w6 c39212w6 = h62.f378243b;
            if (c39212w6 != null) {
                c38855hf.f380707b = this.f379352b.fromModel(c39212w6);
            }
            List<D6> list = h62.f378244c;
            if (list != null) {
                c38855hf.f380710e = this.f379354d.fromModel(list);
            }
            String str3 = h62.f378248g;
            String str4 = c38855hf.f380708c;
            if (str3 == null) {
                str3 = str4;
            }
            c38855hf.f380708c = str3;
            c38855hf.f380709d = this.f379353c.a(h62.f378249h);
            if (!TextUtils.isEmpty(h62.f378245d)) {
                c38855hf.f380714i = this.f379355e.fromModel(h62.f378245d);
            }
            if (!TextUtils.isEmpty(h62.f378246e)) {
                c38855hf.f380715j = h62.f378246e.getBytes();
            }
            if (!A2.b(h62.f378247f)) {
                c38855hf.f380716k = this.f379356f.fromModel(h62.f378247f);
            }
        }
        return c38855hf;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public S6(@j.N W6 w62, @j.N J6 j62, @j.N L6 l62, @j.N T6 t62, @j.N Q6 q62, @j.N R6 r62) {
        this.f379351a = w62;
        this.f379352b = j62;
        this.f379353c = l62;
        this.f379354d = t62;
        this.f379355e = q62;
        this.f379356f = r62;
    }
}
