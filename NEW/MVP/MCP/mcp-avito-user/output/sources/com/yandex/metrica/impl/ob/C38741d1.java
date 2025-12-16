package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.ConfigProvider;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;

/* renamed from: com.yandex.metrica.impl.ob.d1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38741d1 implements ConfigProvider {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC42726C f380355a = C42727D.c(new a());

    /* renamed from: b, reason: collision with root package name */
    private final L3 f380356b;

    /* renamed from: com.yandex.metrica.impl.ob.d1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Lg> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public Lg invoke() {
            return C38741d1.this.f380356b.m();
        }
    }

    public C38741d1(@Y61.k L3 l32) {
        this.f380356b = l32;
    }

    @Y61.k
    public Lg a() {
        return (Lg) this.f380355a.getValue();
    }

    @Override // com.yandex.metrica.networktasks.api.ConfigProvider
    public Object getConfig() {
        return (Lg) this.f380355a.getValue();
    }
}
