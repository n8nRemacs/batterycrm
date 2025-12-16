package androidx.compose.foundation;

import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: BasicTooltip.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class T extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f26854l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f26855m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Y y12, kotlinx.coroutines.T t12) {
        super(0);
        this.f26854l = t12;
        this.f26855m = y12;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        C43259k.d(this.f26854l, null, null, new S(this.f26855m, null), 3);
        return Boolean.TRUE;
    }
}
