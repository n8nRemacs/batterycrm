package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;
import org.joda.time.C44866h;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.M;
import org.joda.time.chrono.x;

/* compiled from: BasePartial.java */
/* loaded from: classes7.dex */
public abstract class k extends e implements M, Serializable {
    private static final long serialVersionUID = 2353678632973660L;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC44854a f420465b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f420466c;

    public k() {
        long jA2 = C44866h.a();
        x xVarV = x.V();
        this.f420465b = x.f420650N;
        int size = size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = I(i12).b(xVarV).c(jA2);
        }
        this.f420466c = iArr;
    }

    @Override // org.joda.time.M
    public final int g(int i12) {
        return this.f420466c[i12];
    }

    @Override // org.joda.time.M
    public final AbstractC44854a y() {
        return this.f420465b;
    }

    public k(int[] iArr) {
        C44866h.b bVar = C44866h.f420908a;
        x.V();
        this.f420465b = x.f420650N;
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            AbstractC44864f abstractC44864fB = b(i12);
            if (i13 >= abstractC44864fB.s()) {
                if (i13 > abstractC44864fB.n()) {
                    throw new IllegalFieldValueException(abstractC44864fB.y(), Integer.valueOf(i13), null, Integer.valueOf(abstractC44864fB.n()));
                }
            } else {
                throw new IllegalFieldValueException(abstractC44864fB.y(), Integer.valueOf(i13), Integer.valueOf(abstractC44864fB.s()), null);
            }
        }
        for (int i14 = 0; i14 < size; i14++) {
            int i15 = iArr[i14];
            AbstractC44864f abstractC44864fB2 = b(i14);
            if (i15 >= abstractC44864fB2.v(this, iArr)) {
                if (i15 > abstractC44864fB2.q(this, iArr)) {
                    throw new IllegalFieldValueException(abstractC44864fB2.y(), Integer.valueOf(i15), null, Integer.valueOf(abstractC44864fB2.q(this, iArr)));
                }
            } else {
                throw new IllegalFieldValueException(abstractC44864fB2.y(), Integer.valueOf(i15), Integer.valueOf(abstractC44864fB2.v(this, iArr)), null);
            }
        }
        this.f420466c = iArr;
    }

    public k(k kVar, AbstractC44854a abstractC44854a) {
        this.f420465b = abstractC44854a.N();
        this.f420466c = kVar.f420466c;
    }
}
