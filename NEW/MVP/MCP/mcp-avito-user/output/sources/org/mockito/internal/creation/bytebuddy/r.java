package org.mockito.internal.creation.bytebuddy;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: MockMethodInterceptor.java */
/* loaded from: classes7.dex */
public class r implements Serializable {
    private static final long serialVersionUID = 7152947254057253027L;

    /* renamed from: b, reason: collision with root package name */
    public final e81.h f421580b;

    /* compiled from: MockMethodInterceptor.java */
    public static class a {
    }

    /* compiled from: MockMethodInterceptor.java */
    public static class b {
    }

    /* compiled from: MockMethodInterceptor.java */
    public static final class c {
    }

    /* compiled from: MockMethodInterceptor.java */
    public static final class d {
    }

    public r(N71.a aVar, e81.h hVar) {
        new ThreadLocal();
        this.f421580b = hVar;
        new C44922a();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        new ThreadLocal();
    }
}
