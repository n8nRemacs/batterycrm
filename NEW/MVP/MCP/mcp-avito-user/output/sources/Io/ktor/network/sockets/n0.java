package io.ktor.network.sockets;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TypeOfService.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Lio/ktor/network/sockets/n0;", "", "a", "value", "Lkotlin/o0;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class n0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f400257b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final byte f400258a;

    /* compiled from: TypeOfService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/network/sockets/n0$a;", "", "<init>", "()V", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            return this.f400258a == ((n0) obj).f400258a;
        }
        return false;
    }

    public final int hashCode() {
        int i12 = kotlin.o0.f406874c;
        return Byte.hashCode(this.f400258a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypeOfService(value=");
        int i12 = kotlin.o0.f406874c;
        sb2.append((Object) String.valueOf(this.f400258a & 255));
        sb2.append(')');
        return sb2.toString();
    }
}
