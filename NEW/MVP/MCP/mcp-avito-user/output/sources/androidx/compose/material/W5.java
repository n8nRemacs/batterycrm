package androidx.compose.material;

import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class W5 extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21234k6 f33305l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f33306m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W5(C21234k6 c21234k6, kotlinx.coroutines.T t12) {
        super(0);
        this.f33305l = c21234k6;
        this.f33306m = t12;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        C21234k6 c21234k6 = this.f33305l;
        if (c21234k6.f33739c.f34350d.invoke(ModalBottomSheetValue.f32955d).booleanValue()) {
            C43259k.d(this.f33306m, null, null, new V5(c21234k6, null), 3);
        }
        return Boolean.TRUE;
    }
}
