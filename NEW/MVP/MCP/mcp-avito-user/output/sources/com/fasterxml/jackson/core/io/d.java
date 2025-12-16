package com.fasterxml.jackson.core.io;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.util.Objects;

/* compiled from: ContentReference.java */
/* loaded from: classes3.dex */
public class d implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final d f341155f = new d(-1, null, false);
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final transient Object f341156b;

    /* renamed from: c, reason: collision with root package name */
    public final int f341157c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final int f341158d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f341159e;

    public d(int i12, Object obj, boolean z12) {
        this.f341159e = z12;
        this.f341156b = obj;
        this.f341158d = i12;
    }

    public static void a(int i12, int[] iArr) {
        int i13 = iArr[0];
        if (i13 < 0) {
            i13 = 0;
        } else if (i13 >= i12) {
            i13 = i12;
        }
        iArr[0] = i13;
        int i14 = iArr[1];
        int i15 = i12 - i13;
        if (i14 < 0 || i14 > i15) {
            iArr[1] = i15;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f341157c != dVar.f341157c || this.f341158d != dVar.f341158d) {
            return false;
        }
        Object obj2 = dVar.f341156b;
        Object obj3 = this.f341156b;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return ((obj3 instanceof File) || (obj3 instanceof URL) || (obj3 instanceof URI)) ? obj3.equals(obj2) : obj3 == obj2;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f341156b);
    }

    public Object readResolve() {
        return f341155f;
    }

    private void readObject(ObjectInputStream objectInputStream) {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
    }
}
