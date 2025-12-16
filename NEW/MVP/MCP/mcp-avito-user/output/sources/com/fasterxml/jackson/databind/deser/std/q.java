package com.fasterxml.jackson.databind.deser.std;

import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: JdkDeserializers.java */
/* loaded from: classes4.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f341822a = new HashSet<>();

    static {
        Class[] clsArr = {UUID.class, AtomicBoolean.class, AtomicInteger.class, AtomicLong.class, StackTraceElement.class, ByteBuffer.class, Void.class};
        for (int i12 = 0; i12 < 7; i12++) {
            f341822a.add(clsArr[i12].getName());
        }
        int i13 = p.f341820e;
        Class[] clsArr2 = {File.class, URL.class, URI.class, Class.class, com.fasterxml.jackson.databind.h.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, InetAddress.class, InetSocketAddress.class, StringBuilder.class, StringBuffer.class};
        for (int i14 = 0; i14 < 14; i14++) {
            f341822a.add(clsArr2[i14].getName());
        }
    }
}
