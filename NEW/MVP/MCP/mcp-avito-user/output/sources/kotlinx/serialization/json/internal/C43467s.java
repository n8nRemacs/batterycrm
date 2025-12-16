package kotlinx.serialization.json.internal;

import kotlin.C0;
import kotlin.Metadata;
import kotlin.w0;

/* compiled from: Composers.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/s;", "Lkotlinx/serialization/json/internal/q;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
@o0
/* renamed from: kotlinx.serialization.json.internal.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43467s extends C43466q {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f413128c;

    public C43467s(@Y61.k T t12, boolean z12) {
        super(t12);
        this.f413128c = z12;
    }

    @Override // kotlinx.serialization.json.internal.C43466q
    public final void d(byte b12) {
        if (this.f413128c) {
            int i12 = kotlin.o0.f406874c;
            j(String.valueOf(b12 & 255));
        } else {
            int i13 = kotlin.o0.f406874c;
            h(String.valueOf(b12 & 255));
        }
    }

    @Override // kotlinx.serialization.json.internal.C43466q
    public final void f(int i12) {
        if (this.f413128c) {
            int i13 = kotlin.s0.f410475c;
            j(Integer.toUnsignedString(i12));
        } else {
            int i14 = kotlin.s0.f410475c;
            h(Integer.toUnsignedString(i12));
        }
    }

    @Override // kotlinx.serialization.json.internal.C43466q
    public final void g(long j12) {
        if (this.f413128c) {
            int i12 = w0.f410662c;
            j(Long.toUnsignedString(j12));
        } else {
            int i13 = w0.f410662c;
            h(Long.toUnsignedString(j12));
        }
    }

    @Override // kotlinx.serialization.json.internal.C43466q
    public final void i(short s5) {
        if (this.f413128c) {
            int i12 = C0.f406602c;
            j(String.valueOf(s5 & 65535));
        } else {
            int i13 = C0.f406602c;
            h(String.valueOf(s5 & 65535));
        }
    }
}
