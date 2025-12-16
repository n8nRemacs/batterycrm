package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.work.G;
import kotlin.Metadata;

/* compiled from: BroadcastReceiverConstraintTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/trackers/e;", "T", "Landroidx/work/impl/constraints/trackers/g;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes10.dex */
public abstract class e<T> extends g<T> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a f55713f;

    /* compiled from: BroadcastReceiverConstraintTracker.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/work/impl/constraints/trackers/e$a", "Landroid/content/BroadcastReceiver;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<T> f55714a;

        public a(e<T> eVar) {
            this.f55714a = eVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            this.f55714a.f(intent);
        }
    }

    public e(@Y61.k Context context, @Y61.k androidx.work.impl.utils.taskexecutor.b bVar) {
        super(context, bVar);
        this.f55713f = new a(this);
    }

    @Override // androidx.work.impl.constraints.trackers.g
    public final void c() {
        G gA2 = G.a();
        int i12 = f.f55715a;
        getClass().getSimpleName().concat(": registering receiver");
        gA2.getClass();
        this.f55717b.registerReceiver(this.f55713f, e());
    }

    @Override // androidx.work.impl.constraints.trackers.g
    public final void d() {
        G gA2 = G.a();
        int i12 = f.f55715a;
        getClass().getSimpleName().concat(": unregistering receiver");
        gA2.getClass();
        this.f55717b.unregisterReceiver(this.f55713f);
    }

    @Y61.k
    public abstract IntentFilter e();

    public abstract void f(@Y61.k Intent intent);
}
