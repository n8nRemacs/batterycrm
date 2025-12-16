package androidx.compose.material3;

import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.ca, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21494ca extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Me f36135l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f36136m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21494ca(Me me2, kotlinx.coroutines.T t12) {
        super(0);
        this.f36135l = me2;
        this.f36136m = t12;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        Me me2 = this.f36135l;
        if (me2.f35135c.f37492d.invoke(SheetValue.f35419d).booleanValue()) {
            C43259k.d(this.f36136m, null, null, new C21471ba(me2, null), 3);
        }
        return Boolean.TRUE;
    }
}
