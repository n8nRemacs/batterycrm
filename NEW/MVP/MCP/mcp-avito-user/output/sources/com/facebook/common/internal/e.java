package com.facebook.common.internal;

import com.facebook.infer.annotation.Nullsafe;
import j.k0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Closeables.java */
@Nullsafe
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k0
    public static final Logger f339818a = Logger.getLogger(e.class.getName());

    public static void a(@I41.h Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e12) {
            f339818a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e12);
        }
    }

    public static void b(@I41.h InputStream inputStream) {
        try {
            a(inputStream);
        } catch (IOException e12) {
            throw new AssertionError(e12);
        }
    }
}
