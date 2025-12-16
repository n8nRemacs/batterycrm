package androidx.compose.material;

import kotlin.Metadata;

/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class E3 extends kotlin.jvm.internal.N implements Y41.a<Float> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f32574l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W3 f32575m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3(float f12, W3 w32) {
        super(0);
        this.f32574l = f12;
        this.f32575m = w32;
    }

    @Override // Y41.a
    public final Float invoke() {
        float fG2 = this.f32575m.f33300a.g();
        float f12 = V3.f33270a;
        float f13 = this.f32574l;
        float f14 = (fG2 - f13) / (0.0f - f13);
        float f15 = f14 >= 0.0f ? f14 : 0.0f;
        if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        return Float.valueOf(f15);
    }
}
