package jn0;

import AK0.i;
import Y61.k;
import android.app.Application;
import com.avito.android.reward_bug_entry_impl.data.m;
import com.avito.android.reward_bug_entry_impl.domain.l;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RewardsBugEntryModule_ProvideBugReporterPositionStorageFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ljn0/b;", "Ldagger/internal/h;", "Lcom/avito/android/reward_bug_entry_impl/domain/l;", "a", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jn0.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C42403b implements h<l> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f405810c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.l f405811a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<i> f405812b;

    /* compiled from: RewardsBugEntryModule_ProvideBugReporterPositionStorageFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljn0/b$a;", "", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jn0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C42403b(@k dagger.internal.l lVar, @k Provider provider) {
        this.f405811a = lVar;
        this.f405812b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f405811a.f393949a;
        i iVar = this.f405812b.get();
        f405810c.getClass();
        int i12 = C42402a.f405809a;
        return new m(iVar.a(application, "rewards_entry_bug"));
    }
}
