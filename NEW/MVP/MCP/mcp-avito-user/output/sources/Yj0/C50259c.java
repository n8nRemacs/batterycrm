package yj0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutotekaApi_Module_ProvideAutotekaApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lyj0/c;", "Ldagger/internal/h;", "Lyj0/a;", "a", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yj0.c, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C50259c implements h<InterfaceC50257a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f443481b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f443482a;

    /* compiled from: AutotekaApi_Module_ProvideAutotekaApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyj0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yj0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C50259c(@k f fVar) {
        this.f443482a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f443482a.get();
        f443481b.getClass();
        C50258b.f443480a.getClass();
        InterfaceC50257a interfaceC50257a = (InterfaceC50257a) r02.create(InterfaceC50257a.class);
        t.b(interfaceC50257a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC50257a;
    }
}
