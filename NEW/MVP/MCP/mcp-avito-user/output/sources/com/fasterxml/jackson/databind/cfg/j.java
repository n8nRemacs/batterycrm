package com.fasterxml.jackson.databind.cfg;

import java.security.PrivilegedAction;
import java.util.ServiceLoader;

/* compiled from: MapperBuilder.java */
/* loaded from: classes4.dex */
final class j implements PrivilegedAction<ServiceLoader<Object>> {
    @Override // java.security.PrivilegedAction
    public final ServiceLoader<Object> run() {
        return ServiceLoader.load(null);
    }
}
