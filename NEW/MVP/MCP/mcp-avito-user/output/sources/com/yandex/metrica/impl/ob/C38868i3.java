package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.i3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38868i3 implements InterfaceC39011nm<Thread, E6> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC39011nm
    @j.N
    public E6 a(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id2 = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new E6(name, priority, id2, threadGroup != null ? threadGroup.getName() : "", null, null);
    }
}
