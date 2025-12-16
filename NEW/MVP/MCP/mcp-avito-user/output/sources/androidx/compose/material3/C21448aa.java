package androidx.compose.material3;

import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.aa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21448aa extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Me f36026l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f36027m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Me f36028n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21448aa(Me me2, kotlinx.coroutines.T t12, Me me3) {
        super(0);
        this.f36026l = me2;
        this.f36027m = t12;
        this.f36028n = me3;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        if (this.f36026l.f35135c.f37492d.invoke(SheetValue.f35418c).booleanValue()) {
            C43259k.d(this.f36027m, null, null, new Z9(this.f36028n, null), 3);
        }
        return Boolean.TRUE;
    }
}
