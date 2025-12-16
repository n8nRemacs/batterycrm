package sJ;

import FJ.e;
import Y61.k;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvCallsCallIdProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LsJ/c;", "Ldagger/internal/h;", "LsJ/a;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sJ.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48060c implements h<C48058a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f437598b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f437599a;

    /* compiled from: AvCallsCallIdProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsJ/c$a;", "", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sJ.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48060c(@k e eVar) {
        this.f437599a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        FJ.a aVar = (FJ.a) this.f437599a.get();
        f437598b.getClass();
        return new C48058a(aVar);
    }
}
