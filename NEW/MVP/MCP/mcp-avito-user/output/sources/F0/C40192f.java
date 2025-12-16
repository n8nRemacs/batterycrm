package f0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: PersistentHashSetIterator.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lf0/f;", "E", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40192f<E> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public Object[] f395521a;

    /* renamed from: b, reason: collision with root package name */
    public int f395522b;

    public C40192f() {
        C40191e.f395516d.getClass();
        this.f395521a = C40191e.f395517e.f395519b;
    }

    public final boolean a() {
        int i12 = this.f395522b;
        Object[] objArr = this.f395521a;
        return i12 < objArr.length && !(objArr[i12] instanceof C40191e);
    }
}
