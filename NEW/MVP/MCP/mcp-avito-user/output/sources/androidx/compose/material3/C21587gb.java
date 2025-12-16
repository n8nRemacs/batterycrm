package androidx.compose.material3;

import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: NavigationDrawer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.gb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21587gb extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q6 f36425l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f36426m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21587gb(Q6 q62, kotlinx.coroutines.T t12) {
        super(0);
        this.f36425l = q62;
        this.f36426m = t12;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        Q6 q62 = this.f36425l;
        if (q62.f35344a.f37492d.invoke(DrawerValue.f34644b).booleanValue()) {
            C43259k.d(this.f36426m, null, null, new C21564fb(q62, null), 3);
        }
        return Boolean.TRUE;
    }
}
