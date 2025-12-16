package com.avito.android.reward_bug_entry_impl.mvi;

import com.avito.android.reward_bug_entry_impl.domain.PositionOnScreen;
import com.avito.android.reward_bug_entry_impl.domain.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RewardBugEntryInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/reward_bug_entry_impl/mvi/m$a;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m$b;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m$c;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m$d;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m$e;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m$f;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class m {

    /* compiled from: RewardBugEntryInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/m$a;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f255665a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1844183852;
        }

        @Y61.k
        public final String toString() {
            return "AnalyticSent";
        }
    }

    /* compiled from: RewardBugEntryInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/m$b;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PositionOnScreen f255666a;

        public b(@Y61.k PositionOnScreen positionOnScreen) {
            super(null);
            this.f255666a = positionOnScreen;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f255666a == ((b) obj).f255666a;
        }

        public final int hashCode() {
            return this.f255666a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ChangedPosition(positionOnScreen=" + this.f255666a + ')';
        }
    }

    /* compiled from: RewardBugEntryInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/m$c;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f255667a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -653967622;
        }

        @Y61.k
        public final String toString() {
            return "CloseRewardEntry";
        }
    }

    /* compiled from: RewardBugEntryInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/m$d;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f255668a = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1777083278;
        }

        @Y61.k
        public final String toString() {
            return "HideRewardEntry";
        }
    }

    /* compiled from: RewardBugEntryInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/m$e;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends m {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "InitialLoad(rewardBugModel=null, positionOnScreen=null, initialDelay=0)";
        }
    }

    /* compiled from: RewardBugEntryInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/m$f;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final j.b f255669a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final PositionOnScreen f255670b;

        public f(@Y61.k j.b bVar, @Y61.k PositionOnScreen positionOnScreen) {
            super(null);
            this.f255669a = bVar;
            this.f255670b = positionOnScreen;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f255669a, fVar.f255669a) && this.f255670b == fVar.f255670b;
        }

        public final int hashCode() {
            return this.f255670b.hashCode() + (this.f255669a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "RewardBugStateLoaded(rewardBugModel=" + this.f255669a + ", positionOnScreen=" + this.f255670b + ')';
        }
    }

    public /* synthetic */ m(C42822w c42822w) {
        this();
    }

    public m() {
    }
}
