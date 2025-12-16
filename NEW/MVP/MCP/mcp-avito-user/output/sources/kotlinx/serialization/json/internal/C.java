package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: JsonElementMarker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/C;", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlinx.serialization.internal.H f413000a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f413001b;

    /* compiled from: JsonElementMarker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<SerialDescriptor, Integer, Boolean> {
        @Override // Y41.p
        public final Boolean invoke(SerialDescriptor serialDescriptor, Integer num) {
            SerialDescriptor serialDescriptor2 = serialDescriptor;
            int iIntValue = num.intValue();
            C c12 = (C) this.receiver;
            c12.getClass();
            boolean z12 = !serialDescriptor2.i(iIntValue) && serialDescriptor2.h(iIntValue).b();
            c12.f413001b = z12;
            return Boolean.valueOf(z12);
        }
    }

    public C(@Y61.k SerialDescriptor serialDescriptor) {
        this.f413000a = new kotlinx.serialization.internal.H(serialDescriptor, new a(2, this, C.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}
