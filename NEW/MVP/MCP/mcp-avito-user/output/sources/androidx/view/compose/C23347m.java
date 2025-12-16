package androidx.view.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.snapshots.D;
import androidx.view.C23395u;
import java.util.Collection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DialogHost.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.compose.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23347m extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D f52972l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Collection<C23395u> f52973m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23347m(D d12, Collection collection, int i12) {
        super(2);
        this.f52972l = d12;
        this.f52973m = collection;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(65);
        C23340f.b(this.f52972l, this.f52973m, a12, iA2);
        return G0.f406611a;
    }
}
