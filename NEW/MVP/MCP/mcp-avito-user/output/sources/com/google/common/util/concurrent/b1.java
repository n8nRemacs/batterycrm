package com.google.common.util.concurrent;

import com.google.common.base.InterfaceC37276u;
import java.util.Map;

/* compiled from: ServiceManager.java */
/* loaded from: classes6.dex */
class b1 implements InterfaceC37276u<Map.Entry<Service, Long>, Long> {
    @Override // com.google.common.base.InterfaceC37276u
    public final Object apply(Object obj) {
        return (Long) ((Map.Entry) obj).getValue();
    }
}
