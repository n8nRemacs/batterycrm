package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.p;

/* compiled from: ObjectSerializer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.internal.x0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43437x0 extends kotlin.jvm.internal.N implements Y41.a<SerialDescriptor> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C43439y0<Object> f412921l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43437x0(C43439y0 c43439y0) {
        super(0);
        this.f412921l = c43439y0;
    }

    @Override // Y41.a
    public final SerialDescriptor invoke() {
        return kotlinx.serialization.descriptors.n.c("kotlin.Unit", p.d.f412754a, new SerialDescriptor[0], new C43435w0(this.f412921l));
    }
}
