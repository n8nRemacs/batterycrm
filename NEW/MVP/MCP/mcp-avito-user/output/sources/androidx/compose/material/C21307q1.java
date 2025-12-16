package androidx.compose.material;

import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21307q1 extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J1 f33981l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f33982m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21307q1(J1 j12, kotlinx.coroutines.T t12) {
        super(0);
        this.f33981l = j12;
        this.f33982m = t12;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        J1 j12 = this.f33981l;
        if (j12.f32790a.f34350d.invoke(BottomSheetValue.f32455c).booleanValue()) {
            C43259k.d(this.f33982m, null, null, new C21294p1(j12, null), 3);
        }
        return Boolean.TRUE;
    }
}
