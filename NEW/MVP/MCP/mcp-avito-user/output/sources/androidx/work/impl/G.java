package androidx.work.impl;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.ExistingWorkPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: WorkContinuationImpl.java */
@RestrictTo
/* loaded from: classes10.dex */
public class G extends androidx.work.a0 {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f55525j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Y f55526a;

    /* renamed from: b, reason: collision with root package name */
    public final String f55527b;

    /* renamed from: c, reason: collision with root package name */
    public final ExistingWorkPolicy f55528c;

    /* renamed from: d, reason: collision with root package name */
    public final List<? extends androidx.work.c0> f55529d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f55530e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f55531f;

    /* renamed from: g, reason: collision with root package name */
    public final List<G> f55532g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f55533h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.work.L f55534i;

    static {
        androidx.work.G.b("WorkContinuationImpl");
    }

    public G() {
        throw null;
    }

    public G(@j.N Y y12, @j.P String str, @j.N ExistingWorkPolicy existingWorkPolicy, @j.N List<? extends androidx.work.c0> list, @j.P List<G> list2) {
        this.f55526a = y12;
        this.f55527b = str;
        this.f55528c = existingWorkPolicy;
        this.f55529d = list;
        this.f55532g = list2;
        this.f55530e = new ArrayList(list.size());
        this.f55531f = new ArrayList();
        if (list2 != null) {
            Iterator<G> it = list2.iterator();
            while (it.hasNext()) {
                this.f55531f.addAll(it.next().f55531f);
            }
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (existingWorkPolicy == ExistingWorkPolicy.f55375b && list.get(i12).f55479b.f55815u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String string = list.get(i12).f55478a.toString();
            this.f55530e.add(string);
            this.f55531f.add(string);
        }
    }

    @RestrictTo
    public static boolean b(@j.N G g12, @j.N HashSet hashSet) {
        hashSet.addAll(g12.f55530e);
        HashSet hashSetC = c(g12);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetC.contains((String) it.next())) {
                return true;
            }
        }
        List<G> list = g12.f55532g;
        if (list != null && !list.isEmpty()) {
            Iterator<G> it2 = list.iterator();
            while (it2.hasNext()) {
                if (b(it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(g12.f55530e);
        return false;
    }

    @j.N
    @RestrictTo
    public static HashSet c(@j.N G g12) {
        HashSet hashSet = new HashSet();
        List<G> list = g12.f55532g;
        if (list != null && !list.isEmpty()) {
            Iterator<G> it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().f55530e);
            }
        }
        return hashSet;
    }

    @Override // androidx.work.a0
    @j.N
    public final androidx.work.L a() {
        if (this.f55533h) {
            androidx.work.G gA2 = androidx.work.G.a();
            TextUtils.join(", ", this.f55530e);
            gA2.getClass();
        } else {
            Y y12 = this.f55526a;
            this.f55534i = androidx.work.P.a(y12.f55558c.f55462p, "EnqueueRunnable_" + this.f55528c.name(), y12.f55560e.f56028a, new F(this, 0));
        }
        return this.f55534i;
    }
}
