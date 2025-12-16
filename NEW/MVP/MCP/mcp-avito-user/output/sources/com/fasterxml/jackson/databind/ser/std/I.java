package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: StdJdkSerializers.java */
/* loaded from: classes4.dex */
public class I {

    /* compiled from: StdJdkSerializers.java */
    public static class a extends L<AtomicBoolean> {
        public a() {
            super(AtomicBoolean.class);
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            jsonGenerator.y(((AtomicBoolean) obj).get());
        }
    }

    /* compiled from: StdJdkSerializers.java */
    public static class b extends L<AtomicInteger> {
        public b() {
            super(AtomicInteger.class);
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            jsonGenerator.L(((AtomicInteger) obj).get());
        }
    }

    /* compiled from: StdJdkSerializers.java */
    public static class c extends L<AtomicLong> {
        public c() {
            super(AtomicLong.class);
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            jsonGenerator.M(((AtomicLong) obj).get());
        }
    }
}
