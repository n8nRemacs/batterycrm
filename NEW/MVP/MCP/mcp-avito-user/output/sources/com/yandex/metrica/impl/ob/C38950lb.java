package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.lb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38950lb implements InterfaceC38975mb, InterfaceC39000nb {

    /* renamed from: a, reason: collision with root package name */
    private final Set<Integer> f380967a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicLong f380968b;

    public C38950lb(@j.N L7 l72) {
        HashSet hashSet = new HashSet();
        this.f380967a = hashSet;
        hashSet.add(Integer.valueOf(EnumC38666a1.EVENT_TYPE_FIRST_ACTIVATION.b()));
        hashSet.add(Integer.valueOf(EnumC38666a1.EVENT_TYPE_APP_UPDATE.b()));
        hashSet.add(Integer.valueOf(EnumC38666a1.EVENT_TYPE_INIT.b()));
        hashSet.add(Integer.valueOf(EnumC38666a1.EVENT_TYPE_IDENTITY.b()));
        hashSet.add(Integer.valueOf(EnumC38666a1.EVENT_TYPE_SEND_REFERRER.b()));
        l72.a(this);
        this.f380968b = new AtomicLong(l72.a(hashSet));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38975mb
    public boolean a() {
        return this.f380968b.get() > 0;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39000nb
    public void b(@j.N List<Integer> list) {
        int i12 = 0;
        for (Integer num : list) {
            num.intValue();
            if (this.f380967a.contains(num)) {
                i12++;
            }
        }
        this.f380968b.addAndGet(-i12);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39000nb
    public void a(@j.N List<Integer> list) {
        int i12 = 0;
        for (Integer num : list) {
            num.intValue();
            if (this.f380967a.contains(num)) {
                i12++;
            }
        }
        this.f380968b.addAndGet(i12);
    }
}
