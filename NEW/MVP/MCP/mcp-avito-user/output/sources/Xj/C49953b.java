package xj;

import Y61.k;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import wj.InterfaceC49636a;

/* compiled from: BeduinSnippetJobResponseDeeplinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lxj/b;", "Ldagger/internal/h;", "Lxj/a;", "a", "_avito_job_beduin-snippet-response-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xj.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49953b implements h<C49952a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f442612b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC49636a> f442613a;

    /* compiled from: BeduinSnippetJobResponseDeeplinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxj/b$a;", "", "<init>", "()V", "_avito_job_beduin-snippet-response-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xj.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C49953b(@k Provider<InterfaceC49636a> provider) {
        this.f442613a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49636a interfaceC49636a = this.f442613a.get();
        f442612b.getClass();
        return new C49952a(interfaceC49636a);
    }
}
