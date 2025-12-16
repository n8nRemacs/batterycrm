package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C23563e;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.work.impl.utils.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class CallableC23597g implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f56013c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f56014d;

    public /* synthetic */ CallableC23597g(int i12, int i13, Object obj) {
        this.f56012b = i13;
        this.f56014d = obj;
        this.f56013c = i12;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f56012b) {
            case 0:
                C23598h c23598h = (C23598h) this.f56014d;
                WorkDatabase workDatabase = c23598h.f56015a;
                Long lB2 = workDatabase.v().b("next_job_scheduler_id");
                int i12 = 0;
                int iLongValue = lB2 != null ? (int) lB2.longValue() : 0;
                workDatabase.v().a(new C23563e("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                if (iLongValue < 0 || iLongValue > this.f56013c) {
                    c23598h.f56015a.v().a(new C23563e("next_job_scheduler_id", Long.valueOf(1)));
                } else {
                    i12 = iLongValue;
                }
                return Integer.valueOf(i12);
            default:
                return ((com.avito.android.analytics.clickstream.Q) this.f56014d).f89760b.e(this.f56013c);
        }
    }
}
