package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.InterfaceC38800fa;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.c3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38718c3 implements InterfaceC38988n {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ProtobufStateStorage f380278a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private X2 f380279b;

    public C38718c3(@j.N Context context) {
        this(InterfaceC38800fa.b.a(X2.class).a(context));
    }

    public void a(@j.N List<T21.a> list, boolean z12) {
        for (T21.a aVar : list) {
        }
        X2 x22 = new X2(list, z12);
        this.f380279b = x22;
        this.f380278a.save(x22);
    }

    public boolean b() {
        return this.f380279b.f379841b;
    }

    @j.k0
    public C38718c3(@j.N ProtobufStateStorage protobufStateStorage) {
        this.f380278a = protobufStateStorage;
        this.f380279b = (X2) protobufStateStorage.read();
    }

    @j.N
    public List<T21.a> a() {
        return this.f380279b.f379840a;
    }
}
