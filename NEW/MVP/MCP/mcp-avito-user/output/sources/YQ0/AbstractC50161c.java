package yQ0;

import Y61.k;
import Y61.l;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StunMessageAttribute.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LyQ0/c;", "LyQ0/a;", "<init>", "()V", "a", "LyQ0/c$a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yQ0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC50161c implements InterfaceC50159a {

    /* compiled from: StunMessageAttribute.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyQ0/c$a;", "LyQ0/c;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yQ0.c$a */
    public static final /* data */ class a extends AbstractC50161c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final byte[] f443102a;

        /* renamed from: b, reason: collision with root package name */
        public final short f443103b;

        public a(@k byte[] bArr) {
            super(null);
            this.f443102a = bArr;
            this.f443103b = (short) 6;
        }

        @Override // yQ0.AbstractC50161c
        /* renamed from: a, reason: from getter */
        public final short getF443103b() {
            return this.f443103b;
        }

        @Override // yQ0.AbstractC50161c
        @k
        /* renamed from: b, reason: from getter */
        public final byte[] getF443102a() {
            return this.f443102a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f443102a, ((a) obj).f443102a);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f443102a);
        }

        @k
        public final String toString() {
            return "UserName(value=" + Arrays.toString(this.f443102a) + ')';
        }
    }

    public /* synthetic */ AbstractC50161c(C42822w c42822w) {
        this();
    }

    /* renamed from: a */
    public abstract short getF443103b();

    @k
    /* renamed from: b */
    public abstract byte[] getF443102a();

    public AbstractC50161c() {
    }
}
