package xj0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutotekaApi_Module_ProvideAutotekaApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lxj0/c;", "Ldagger/internal/h;", "Lxj0/a;", "a", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xj0.c, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C49959c implements h<InterfaceC49957a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f442618b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f442619a;

    /* compiled from: AutotekaApi_Module_ProvideAutotekaApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxj0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xj0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C49959c(@k f fVar) {
        this.f442619a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f442619a.get();
        f442618b.getClass();
        C49958b.f442617a.getClass();
        InterfaceC49957a interfaceC49957a = (InterfaceC49957a) r02.create(InterfaceC49957a.class);
        t.b(interfaceC49957a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC49957a;
    }
}
