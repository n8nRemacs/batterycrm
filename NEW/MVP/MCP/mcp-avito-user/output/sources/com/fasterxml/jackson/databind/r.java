package com.fasterxml.jackson.databind;

import java.security.PrivilegedAction;
import java.util.ServiceLoader;

/* compiled from: ObjectMapper.java */
/* loaded from: classes4.dex */
final class r implements PrivilegedAction<ServiceLoader<Object>> {
    @Override // java.security.PrivilegedAction
    public final ServiceLoader<Object> run() {
        return ServiceLoader.load(null);
    }
}
