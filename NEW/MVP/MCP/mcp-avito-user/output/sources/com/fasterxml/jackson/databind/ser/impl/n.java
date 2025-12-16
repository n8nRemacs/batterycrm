package com.fasterxml.jackson.databind.ser.impl;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

/* compiled from: SimpleBeanPropertyFilter.java */
/* loaded from: classes4.dex */
public class n implements com.fasterxml.jackson.databind.ser.c, com.fasterxml.jackson.databind.ser.n {

    /* compiled from: SimpleBeanPropertyFilter.java */
    public static class a extends n implements Serializable {
        private static final long serialVersionUID = 1;
    }

    /* compiled from: SimpleBeanPropertyFilter.java */
    public static class b extends n implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final Set<String> f342309b = Collections.emptySet();

        static {
            new b();
        }
    }
}
