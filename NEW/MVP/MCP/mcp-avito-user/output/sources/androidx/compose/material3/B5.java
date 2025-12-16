package androidx.compose.material3;

import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class B5 extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.grid.I0 f34539l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f34540m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5(androidx.compose.foundation.lazy.grid.I0 i02, kotlinx.coroutines.T t12) {
        super(0);
        this.f34539l = i02;
        this.f34540m = t12;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        boolean z12;
        androidx.compose.foundation.lazy.grid.I0 i02 = this.f34539l;
        if (i02.d()) {
            C43259k.d(this.f34540m, null, null, new A5(i02, null), 3);
            z12 = true;
        } else {
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }
}
