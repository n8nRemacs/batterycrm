package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: DateMidnight.java */
@Deprecated
/* renamed from: org.joda.time.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C44855b extends org.joda.time.base.g implements I, Serializable {
    private static final long serialVersionUID = 156371964018738L;

    /* compiled from: DateMidnight.java */
    /* renamed from: org.joda.time.b$a */
    public static final class a extends org.joda.time.field.b {
        private static final long serialVersionUID = 257629620;

        /* renamed from: b, reason: collision with root package name */
        public C44855b f420460b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC44864f f420461c;

        private void readObject(ObjectInputStream objectInputStream) {
            this.f420460b = (C44855b) objectInputStream.readObject();
            this.f420461c = ((AbstractC44865g) objectInputStream.readObject()).b(this.f420460b.f420463c);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f420460b);
            objectOutputStream.writeObject(this.f420461c.y());
        }

        @Override // org.joda.time.field.b
        public final AbstractC44854a a() {
            return this.f420460b.f420463c;
        }

        @Override // org.joda.time.field.b
        public final AbstractC44864f b() {
            return this.f420461c;
        }

        @Override // org.joda.time.field.b
        public final long c() {
            return this.f420460b.f420462b;
        }
    }

    @Override // org.joda.time.base.g
    public final long f(long j12, AbstractC44854a abstractC44854a) {
        return abstractC44854a.e().F(j12);
    }
}
