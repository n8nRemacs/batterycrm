package u3;

import com.avito.android.ab_tests.c0;
import kotlin.Metadata;

/* compiled from: SingleManuallyExposedAbTestGroup.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lu3/l;", "T", "Lu3/i;", "_common_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l<T> implements i<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m<T> f439745a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c0 f439746b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f439747c;

    public l(@Y61.k m<T> mVar, @Y61.k c0 c0Var) {
        this.f439745a = mVar;
        this.f439746b = c0Var;
    }

    @Override // u3.InterfaceC48779c
    public final T a() {
        return this.f439745a.f439749b;
    }

    public final void b() {
        if (this.f439747c) {
            return;
        }
        this.f439746b.a(this.f439745a);
        this.f439747c = true;
    }
}
