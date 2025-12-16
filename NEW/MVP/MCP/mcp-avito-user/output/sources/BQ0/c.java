package BQ0;

import Y61.k;
import Y61.l;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StunMessageAttribute.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LBQ0/c;", "LBQ0/a;", "<init>", "()V", "a", "LBQ0/c$a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class c implements BQ0.a {

    /* compiled from: StunMessageAttribute.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBQ0/c$a;", "LBQ0/c;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final byte[] f1383a;

        /* renamed from: b, reason: collision with root package name */
        public final short f1384b;

        public a(@k byte[] bArr) {
            super(null);
            this.f1383a = bArr;
            this.f1384b = (short) 6;
        }

        @Override // BQ0.c
        /* renamed from: a, reason: from getter */
        public final short getF1384b() {
            return this.f1384b;
        }

        @Override // BQ0.c
        @k
        /* renamed from: b, reason: from getter */
        public final byte[] getF1383a() {
            return this.f1383a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f1383a, ((a) obj).f1383a);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f1383a);
        }

        @k
        public final String toString() {
            return "UserName(value=" + Arrays.toString(this.f1383a) + ')';
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    /* renamed from: a */
    public abstract short getF1384b();

    @k
    /* renamed from: b */
    public abstract byte[] getF1383a();

    public c() {
    }
}
