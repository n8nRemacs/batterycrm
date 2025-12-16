package kn0;

import Y61.k;
import com.avito.android.reward_bug_entry_impl.data.e;
import com.avito.android.reward_bug_entry_impl.domain.i;
import dagger.internal.h;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RewardsBugEntryInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkn0/b;", "Ldagger/internal/h;", "Lkn0/a;", "a", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kn0.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C42718b implements h<C42717a> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f406594d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f406595a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.reward_bug_entry_impl.data.k f406596b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final u f406597c;

    /* compiled from: RewardsBugEntryInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkn0/b$a;", "", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kn0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C42718b(@k e eVar, @k com.avito.android.reward_bug_entry_impl.data.k kVar, @k u uVar) {
        this.f406595a = eVar;
        this.f406596b = kVar;
        this.f406597c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.reward_bug_entry_impl.domain.h hVar = (com.avito.android.reward_bug_entry_impl.domain.h) this.f406595a.get();
        i iVar = (i) this.f406596b.get();
        com.avito.android.reward_bug_entry_impl.domain.a aVar = (com.avito.android.reward_bug_entry_impl.domain.a) this.f406597c.get();
        f406594d.getClass();
        return new C42717a(hVar, iVar, aVar);
    }
}
