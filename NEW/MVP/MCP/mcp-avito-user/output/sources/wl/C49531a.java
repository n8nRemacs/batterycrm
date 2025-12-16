package wL;

import BL.a;
import Y61.k;
import com.avito.android.iac_dialer_watcher.impl_module.logging.writing.o;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.s0;
import sL.AbstractC48067b;

/* compiled from: IacLogSavingWatcherListener.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LwL/a;", "LsL/b;", "LBL/a$b;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wL.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49531a extends AbstractC48067b<a.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final o f441402a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f441403b = "IacLogSavingWatcherListener";

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f441404c = "IacWatcher.State";

    @Inject
    public C49531a(@k o oVar) {
        this.f441402a = oVar;
    }

    @Override // sL.AbstractC48067b
    @k
    /* renamed from: a, reason: from getter */
    public final String getF441403b() {
        return this.f441403b;
    }

    @Override // sL.AbstractC48067b
    @k
    /* renamed from: c, reason: from getter */
    public final String getF441404c() {
        return this.f441404c;
    }

    @Override // sL.AbstractC48067b
    public final void d(a.b bVar, a.b bVar2) {
        o oVar;
        Set<a.C0053a> set = bVar.f1353a;
        Set<a.C0053a> set2 = bVar2.f1353a;
        Set setF = b1.f(set2, set);
        Set setF2 = b1.f(set, set2);
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar3 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        Set set3 = setF;
        String strConcat = "Calls to start logging: ".concat(C42745f0.O(set3, null, null, null, null, 63));
        String str = this.f441403b;
        bVar3.a(str, strConcat, null);
        Set set4 = setF2;
        bVar3.a(str, "Calls to stop logging: ".concat(C42745f0.O(set4, null, null, null, null, 63)), null);
        Iterator it = set3.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            oVar = this.f441402a;
            if (!zHasNext) {
                break;
            }
            a.C0053a c0053a = (a.C0053a) it.next();
            oVar.a(c0053a.f1351a, c0053a.f1352b);
        }
        Iterator it2 = set4.iterator();
        while (it2.hasNext()) {
            oVar.b(((a.C0053a) it2.next()).f1351a);
        }
    }

    @Override // sL.AbstractC48067b
    public final a.b b(a.b bVar) {
        return bVar;
    }
}
