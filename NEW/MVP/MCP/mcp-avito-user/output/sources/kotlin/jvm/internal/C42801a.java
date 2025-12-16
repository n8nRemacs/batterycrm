package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.InterfaceC42733c0;

/* compiled from: AdaptedFunctionReference.java */
@InterfaceC42733c0
/* renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42801a implements E, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public C42801a(int i12, Class cls, String str, String str2, int i13) {
        this(i12, AbstractC42817q.NO_RECEIVER, cls, str, str2, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42801a)) {
            return false;
        }
        C42801a c42801a = (C42801a) obj;
        return this.isTopLevel == c42801a.isTopLevel && this.arity == c42801a.arity && this.flags == c42801a.flags && L.f(this.receiver, c42801a.receiver) && L.f(this.owner, c42801a.owner) && this.name.equals(c42801a.name) && this.signature.equals(c42801a.signature);
    }

    @Override // kotlin.jvm.internal.E
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((androidx.compose.foundation.H.d(androidx.compose.foundation.H.d((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return m0.f406844a.k(this);
    }

    public C42801a(int i12, Object obj, Class cls, String str, String str2, int i13) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i13 & 1) == 1;
        this.arity = i12;
        this.flags = i13 >> 1;
    }
}
