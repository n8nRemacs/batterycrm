package r91;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RewardBugEntryApi_Module_ProvideRewardBugEntryApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lr91/c;", "Ldagger/internal/h;", "Lr91/a;", "a", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: r91.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47517c implements h<InterfaceC47515a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f429644b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f429645a;

    /* compiled from: RewardBugEntryApi_Module_ProvideRewardBugEntryApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr91/c$a;", "", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: r91.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47517c(@k f fVar) {
        this.f429645a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f429645a.get();
        f429644b.getClass();
        C47516b.f429643a.getClass();
        InterfaceC47515a interfaceC47515a = (InterfaceC47515a) r02.create(InterfaceC47515a.class);
        t.b(interfaceC47515a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC47515a;
    }
}
