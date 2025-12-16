package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.joda.time.C44866h;
import org.joda.time.chrono.AbstractC44857a;

/* compiled from: DateTime.java */
/* renamed from: org.joda.time.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C44856c extends org.joda.time.base.g implements I, Serializable {
    private static final long serialVersionUID = -5171125899451703815L;

    /* compiled from: DateTime.java */
    /* renamed from: org.joda.time.c$a */
    public static final class a extends org.joda.time.field.b {
        private static final long serialVersionUID = -6983323811635733510L;

        /* renamed from: b, reason: collision with root package name */
        public C44856c f420470b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC44864f f420471c;

        private void readObject(ObjectInputStream objectInputStream) {
            this.f420470b = (C44856c) objectInputStream.readObject();
            this.f420471c = ((AbstractC44865g) objectInputStream.readObject()).b(this.f420470b.f420463c);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f420470b);
            objectOutputStream.writeObject(this.f420471c.y());
        }

        @Override // org.joda.time.field.b
        public final AbstractC44854a a() {
            return this.f420470b.f420463c;
        }

        @Override // org.joda.time.field.b
        public final AbstractC44864f b() {
            return this.f420471c;
        }

        @Override // org.joda.time.field.b
        public final long c() {
            return this.f420470b.f420462b;
        }
    }

    public C44856c() {
    }

    public C44856c(AbstractC44857a abstractC44857a) {
        C44866h.b bVar = C44866h.f420908a;
        this.f420463c = abstractC44857a;
        this.f420462b = this.f420463c.m(1, 1, 1, 0, 0, 0, 0);
        e();
    }

    @Override // org.joda.time.base.c
    public final C44856c a() {
        return this;
    }
}
