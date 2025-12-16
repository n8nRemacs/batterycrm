package kA0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SuggestApi_Module_ProvideSuggestApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LkA0/d;", "Ldagger/internal/h;", "LkA0/b;", "a", "_avito-discouraged_avito-api_suggest"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kA0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42559d implements h<InterfaceC42557b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f406150b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f406151a;

    /* compiled from: SuggestApi_Module_ProvideSuggestApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkA0/d$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_suggest"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kA0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C42559d(@k f fVar) {
        this.f406151a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f406151a.get();
        f406150b.getClass();
        C42558c.f406149a.getClass();
        InterfaceC42557b interfaceC42557b = (InterfaceC42557b) r02.create(InterfaceC42557b.class);
        t.b(interfaceC42557b, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC42557b;
    }
}
