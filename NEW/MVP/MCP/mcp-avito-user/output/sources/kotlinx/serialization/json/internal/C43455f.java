package kotlinx.serialization.json.internal;

import kotlin.C0;
import kotlin.Metadata;
import kotlin.w0;

/* compiled from: TreeJsonEncoder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/f;", "Lkotlinx/serialization/encoding/b;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.internal.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43455f extends kotlinx.serialization.encoding.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlinx.serialization.modules.f f413080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC43453d f413081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f413082c;

    public C43455f(AbstractC43453d abstractC43453d, String str) {
        this.f413081b = abstractC43453d;
        this.f413082c = str;
        this.f413080a = abstractC43453d.f413070b.f412956b;
    }

    public final void J(@Y61.k String str) {
        this.f413081b.a0(this.f413082c, new kotlinx.serialization.json.w(str, false, null, 4, null));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final kotlinx.serialization.modules.f getF413080a() {
        return this.f413080a;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public final void i(short s5) {
        int i12 = C0.f406602c;
        J(String.valueOf(s5 & 65535));
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public final void m(int i12) {
        int i13 = kotlin.s0.f410475c;
        J(Integer.toUnsignedString(i12));
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public final void r(long j12) {
        int i12 = w0.f410662c;
        J(Long.toUnsignedString(j12));
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public final void w(byte b12) {
        int i12 = kotlin.o0.f406874c;
        J(String.valueOf(b12 & 255));
    }
}
