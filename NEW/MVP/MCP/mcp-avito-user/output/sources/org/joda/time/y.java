package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.joda.time.C44866h;

/* compiled from: MutableDateTime.java */
/* loaded from: classes7.dex */
public class y extends org.joda.time.base.g implements E, Cloneable, Serializable {
    private static final long serialVersionUID = 2852608688135209575L;

    /* compiled from: MutableDateTime.java */
    public static final class a extends org.joda.time.field.b {
        private static final long serialVersionUID = -4481126543819298617L;

        /* renamed from: b, reason: collision with root package name */
        public y f421033b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC44864f f421034c;

        private void readObject(ObjectInputStream objectInputStream) {
            this.f421033b = (y) objectInputStream.readObject();
            this.f421034c = ((AbstractC44865g) objectInputStream.readObject()).b(this.f421033b.f420463c);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f421033b);
            objectOutputStream.writeObject(this.f421034c.y());
        }

        @Override // org.joda.time.field.b
        public final AbstractC44854a a() {
            return this.f421033b.f420463c;
        }

        @Override // org.joda.time.field.b
        public final AbstractC44864f b() {
            return this.f421034c;
        }

        @Override // org.joda.time.field.b
        public final long c() {
            return this.f421033b.f420462b;
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public final void i(AbstractC44868j abstractC44868j) {
        C44866h.b bVar = C44866h.f420908a;
        if (abstractC44868j == null) {
            abstractC44868j = AbstractC44868j.e();
        }
        AbstractC44868j abstractC44868jO = y().o();
        if (abstractC44868jO == null) {
            abstractC44868jO = AbstractC44868j.e();
        }
        if (abstractC44868j == abstractC44868jO) {
            return;
        }
        long jF2 = abstractC44868jO.f(this.f420462b, abstractC44868j);
        AbstractC44854a abstractC44854aO = this.f420463c.O(abstractC44868j);
        if (abstractC44854aO == null) {
            abstractC44854aO = org.joda.time.chrono.x.V();
        }
        this.f420463c = abstractC44854aO;
        this.f420462b = jF2;
    }
}
