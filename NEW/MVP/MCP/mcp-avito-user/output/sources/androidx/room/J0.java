package androidx.room;

import android.annotation.SuppressLint;
import androidx.view.AbstractC22991Y;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* compiled from: RoomTrackingLiveData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/J0;", "T", "Landroidx/lifecycle/Y;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"RestrictedApi"})
/* loaded from: classes10.dex */
public final class J0<T> extends AbstractC22991Y<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RoomDatabase f54273a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final X f54274b;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Callable<T> f54276d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final I0 f54277e;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f54275c = true;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f54278f = new AtomicBoolean(true);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f54279g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f54280h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final H0 f54281i = new H0(this, 0);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final H0 f54282j = new H0(this, 1);

    public J0(@Y61.k RoomDatabase roomDatabase, @Y61.k X x12, @Y61.k Callable callable, @Y61.k String[] strArr) {
        this.f54273a = roomDatabase;
        this.f54274b = x12;
        this.f54276d = callable;
        this.f54277e = new I0(strArr, this);
    }

    @Override // androidx.view.AbstractC22991Y
    public final void onActive() {
        Executor executor;
        super.onActive();
        this.f54274b.f54341b.add(this);
        Executor executor2 = null;
        boolean z12 = this.f54275c;
        RoomDatabase roomDatabase = this.f54273a;
        if (!z12 ? (executor = roomDatabase.f54298b) != null : (executor = roomDatabase.f54299c) != null) {
            executor2 = executor;
        }
        executor2.execute(this.f54281i);
    }

    @Override // androidx.view.AbstractC22991Y
    public final void onInactive() {
        super.onInactive();
        this.f54274b.f54341b.remove(this);
    }
}
