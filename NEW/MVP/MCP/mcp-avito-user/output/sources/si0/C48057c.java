package sI0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAdvertsApi_Module_ProvideUserAdvertsApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LsI0/c;", "Ldagger/internal/h;", "LsI0/a;", "a", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sI0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48057c implements h<InterfaceC48055a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f437595b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f437596a;

    /* compiled from: UserAdvertsApi_Module_ProvideUserAdvertsApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsI0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sI0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48057c(@k f fVar) {
        this.f437596a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f437596a.get();
        f437595b.getClass();
        C48056b.f437594a.getClass();
        InterfaceC48055a interfaceC48055a = (InterfaceC48055a) r02.create(InterfaceC48055a.class);
        t.b(interfaceC48055a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC48055a;
    }
}
