package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import j.N;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import sZ0.InterfaceC48138b;

/* compiled from: ProtobufEncoder.java */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f361581a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f361582b;

    /* renamed from: c, reason: collision with root package name */
    public final d f361583c;

    /* compiled from: ProtobufEncoder.java */
    public static final class a implements InterfaceC48138b<a> {

        /* renamed from: d, reason: collision with root package name */
        public static final d f361584d = new d(1);

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f361585a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f361586b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final d f361587c = f361584d;

        @Override // sZ0.InterfaceC48138b
        @N
        public final InterfaceC48138b registerEncoder(@N Class cls, @N com.google.firebase.encoders.d dVar) {
            this.f361585a.put(cls, dVar);
            this.f361586b.remove(cls);
            return this;
        }
    }

    public f(HashMap map, HashMap map2, d dVar) {
        this.f361581a = map;
        this.f361582b = map2;
        this.f361583c = dVar;
    }

    public final void a(@N Object obj, @N ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = this.f361582b;
        HashMap map2 = this.f361581a;
        e eVar = new e(byteArrayOutputStream, map2, map, this.f361583c);
        if (obj == null) {
            return;
        }
        com.google.firebase.encoders.d dVar = (com.google.firebase.encoders.d) map2.get(obj.getClass());
        if (dVar != null) {
            dVar.encode(obj, eVar);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }
}
