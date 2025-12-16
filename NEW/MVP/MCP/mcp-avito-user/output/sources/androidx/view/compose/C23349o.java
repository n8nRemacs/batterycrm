package androidx.view.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.saveable.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavBackStackEntryProvider.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.navigation.compose.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23349o extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f52976l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f52977m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23349o(l lVar, C22096n c22096n, int i12) {
        super(2);
        this.f52976l = lVar;
        this.f52977m = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            C23352r.b(this.f52976l, this.f52977m, a13, 56);
        }
        return G0.f406611a;
    }
}
