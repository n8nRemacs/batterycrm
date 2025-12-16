package androidx.compose.material3;

import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.z5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22010z5 extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.grid.I0 f37841l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f37842m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22010z5(androidx.compose.foundation.lazy.grid.I0 i02, kotlinx.coroutines.T t12) {
        super(0);
        this.f37841l = i02;
        this.f37842m = t12;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        boolean z12;
        androidx.compose.foundation.lazy.grid.I0 i02 = this.f37841l;
        if (i02.b()) {
            C43259k.d(this.f37842m, null, null, new C21988y5(i02, null), 3);
            z12 = true;
        } else {
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }
}
