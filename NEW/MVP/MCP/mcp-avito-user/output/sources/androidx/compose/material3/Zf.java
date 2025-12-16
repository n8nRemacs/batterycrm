package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Zf extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Xf f35998l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zf(Xf xf2) {
        super(0);
        this.f35998l = xf2;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        this.f35998l.dismiss();
        return Boolean.TRUE;
    }
}
