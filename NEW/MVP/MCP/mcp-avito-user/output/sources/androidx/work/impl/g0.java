package androidx.work.impl;

import androidx.work.ExistingWorkPolicy;
import androidx.work.impl.utils.C23595e;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: WorkerUpdater.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes10.dex */
final class g0 extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.work.c0 f55743l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f55744m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f55745n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(androidx.work.c0 c0Var, Y y12, String str) {
        super(0);
        this.f55743l = c0Var;
        this.f55744m = y12;
        this.f55745n = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        List listSingletonList = Collections.singletonList(this.f55743l);
        C23595e.a(new G(this.f55744m, this.f55745n, ExistingWorkPolicy.f55376c, listSingletonList, null));
        return G0.f406611a;
    }
}
