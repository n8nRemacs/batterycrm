package okio;

import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Segment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokio/Z;", "", "<init>", "()V", "a", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final byte[] f420050a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    public int f420051b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    public int f420052c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    public boolean f420053d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    public final boolean f420054e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.l
    public Z f420055f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.l
    public Z f420056g;

    /* compiled from: Segment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lokio/Z$a;", "", "<init>", "()V", "", "SHARE_MINIMUM", "I", "SIZE", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public Z() {
        this.f420050a = new byte[8192];
        this.f420054e = true;
        this.f420053d = false;
    }

    @Y61.l
    public final Z a() {
        Z z12 = this.f420055f;
        Z z13 = z12 != this ? z12 : null;
        Z z14 = this.f420056g;
        z14.f420055f = z12;
        this.f420055f.f420056g = z14;
        this.f420055f = null;
        this.f420056g = null;
        return z13;
    }

    @Y61.k
    public final void b(@Y61.k Z z12) {
        z12.f420056g = this;
        z12.f420055f = this.f420055f;
        this.f420055f.f420056g = z12;
        this.f420055f = z12;
    }

    @Y61.k
    public final Z c() {
        this.f420053d = true;
        return new Z(this.f420050a, this.f420051b, this.f420052c, true, false);
    }

    public final void d(@Y61.k Z z12, int i12) {
        if (!z12.f420054e) {
            throw new IllegalStateException("only owner can write");
        }
        int i13 = z12.f420052c;
        int i14 = i13 + i12;
        byte[] bArr = z12.f420050a;
        if (i14 > 8192) {
            if (z12.f420053d) {
                throw new IllegalArgumentException();
            }
            int i15 = z12.f420051b;
            if (i14 - i15 > 8192) {
                throw new IllegalArgumentException();
            }
            C42756l.q(bArr, bArr, i15, i13);
            z12.f420052c -= z12.f420051b;
            z12.f420051b = 0;
        }
        int i16 = z12.f420052c;
        int i17 = this.f420051b;
        C42756l.l(this.f420050a, i16, bArr, i17, i17 + i12);
        z12.f420052c += i12;
        this.f420051b += i12;
    }

    public Z(@Y61.k byte[] bArr, int i12, int i13, boolean z12, boolean z13) {
        this.f420050a = bArr;
        this.f420051b = i12;
        this.f420052c = i13;
        this.f420053d = z12;
        this.f420054e = z13;
    }
}
