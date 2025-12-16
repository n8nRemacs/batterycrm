package androidx.compose.material3;

import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: DateRangePicker.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.u6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21901u6 extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.w0 f37410l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f37411m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21901u6(androidx.compose.foundation.lazy.w0 w0Var, kotlinx.coroutines.T t12) {
        super(0);
        this.f37410l = w0Var;
        this.f37411m = t12;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        boolean z12;
        androidx.compose.foundation.lazy.w0 w0Var = this.f37410l;
        if (w0Var.d()) {
            C43259k.d(this.f37411m, null, null, new C21879t6(w0Var, null), 3);
            z12 = true;
        } else {
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }
}
