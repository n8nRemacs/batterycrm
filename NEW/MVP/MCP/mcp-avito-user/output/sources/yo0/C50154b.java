package yO0;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.e0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RubricatorAbTestsImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LyO0/b;", "Ldagger/internal/h;", "LyO0/a;", "a", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yO0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50154b implements dagger.internal.h<C50153a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f443089c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC27642e> f443090a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e0 f443091b;

    /* compiled from: RubricatorAbTestsImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyO0/b$a;", "", "<init>", "()V", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yO0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C50154b(@k Provider provider, @k e0 e0Var) {
        this.f443090a = provider;
        this.f443091b = e0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC27642e interfaceC27642e = this.f443090a.get();
        c0 c0Var = (c0) this.f443091b.get();
        f443089c.getClass();
        return new C50153a(interfaceC27642e, c0Var);
    }
}
