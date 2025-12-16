package wi0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RecallMeApiV2_Module_ProvideRecallMeApiV2Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lwi0/e;", "Ldagger/internal/h;", "Lwi0/c;", "a", "_avito-discouraged_avito-api_recall-me"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wi0.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49634e implements h<InterfaceC49632c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f441757b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.f f441758a;

    /* compiled from: RecallMeApiV2_Module_ProvideRecallMeApiV2Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwi0/e$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_recall-me"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wi0.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C49634e(@k dagger.internal.f fVar) {
        this.f441758a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f441758a.get();
        f441757b.getClass();
        C49633d.f441756a.getClass();
        InterfaceC49632c interfaceC49632c = (InterfaceC49632c) r02.create(InterfaceC49632c.class);
        t.b(interfaceC49632c, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC49632c;
    }
}
