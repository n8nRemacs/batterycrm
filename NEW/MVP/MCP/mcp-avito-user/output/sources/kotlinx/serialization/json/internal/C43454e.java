package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: TreeJsonEncoder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/e;", "Lkotlinx/serialization/encoding/b;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.internal.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43454e extends kotlinx.serialization.encoding.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC43453d f413075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f413076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SerialDescriptor f413077c;

    public C43454e(AbstractC43453d abstractC43453d, String str, SerialDescriptor serialDescriptor) {
        this.f413075a = abstractC43453d;
        this.f413076b = str;
        this.f413077c = serialDescriptor;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @Y61.k
    /* renamed from: a */
    public final kotlinx.serialization.modules.f getF413080a() {
        return this.f413075a.f413070b.f412956b;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public final void b(@Y61.k String str) {
        this.f413075a.a0(this.f413076b, new kotlinx.serialization.json.w(str, false, this.f413077c));
    }
}
