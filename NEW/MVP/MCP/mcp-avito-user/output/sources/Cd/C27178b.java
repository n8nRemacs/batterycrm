package cd;

import Y61.k;
import com.avito.android.util.C;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RootChecker_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcd/b;", "Ldagger/internal/h;", "Lcd/a;", "a", "_common_antifraud_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cd.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C27178b implements h<C27177a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f58052b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C> f58053a;

    /* compiled from: RootChecker_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcd/b$a;", "", "<init>", "()V", "_common_antifraud_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cd.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C27178b(@k Provider<C> provider) {
        this.f58053a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f58053a.get();
        f58052b.getClass();
        return new C27177a(c12);
    }
}
