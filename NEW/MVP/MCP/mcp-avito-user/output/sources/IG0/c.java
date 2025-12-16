package IG0;

import Y61.k;
import android.content.Context;
import com.avito.android.P;
import com.avito.android.S;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.InterfaceC35950u;
import dagger.internal.f;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UpdateSourceAnalytics_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LIG0/c;", "Ldagger/internal/h;", "LIG0/a;", "a", "_avito_update-source_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements h<IG0.a> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f8055e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f8056a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<InterfaceC35950u> f8057b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final S f8058c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C30102l3 f8059d;

    /* compiled from: UpdateSourceAnalytics_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIG0/c$a;", "", "<init>", "()V", "_avito_update-source_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar, @k Provider provider, @k S s5, @k C30102l3 c30102l3) {
        this.f8056a = fVar;
        this.f8057b = provider;
        this.f8058c = s5;
        this.f8059d = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f8056a.get();
        InterfaceC35950u interfaceC35950u = this.f8057b.get();
        P p12 = (P) this.f8058c.get();
        Context context = (Context) this.f8059d.get();
        f8055e.getClass();
        return new IG0.a(interfaceC28373a, interfaceC35950u, p12, context);
    }
}
