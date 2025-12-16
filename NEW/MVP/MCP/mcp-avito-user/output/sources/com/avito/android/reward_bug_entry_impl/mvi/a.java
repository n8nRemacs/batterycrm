package com.avito.android.reward_bug_entry_impl.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.reward_bug_entry_impl.domain.PositionOnScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RewardBugEntryAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/a;", "", "a", "b", "c", "d", "Lcom/avito/android/reward_bug_entry_impl/mvi/a$a;", "Lcom/avito/android/reward_bug_entry_impl/mvi/a$b;", "Lcom/avito/android/reward_bug_entry_impl/mvi/a$c;", "Lcom/avito/android/reward_bug_entry_impl/mvi/a$d;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: RewardBugEntryAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/a$a;", "Lcom/avito/android/reward_bug_entry_impl/mvi/a;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.reward_bug_entry_impl.mvi.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7652a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PositionOnScreen f255632a;

        public C7652a(@Y61.k PositionOnScreen positionOnScreen) {
            this.f255632a = positionOnScreen;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C7652a) && this.f255632a == ((C7652a) obj).f255632a;
        }

        public final int hashCode() {
            return this.f255632a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ChangePosition(position=" + this.f255632a + ')';
        }
    }

    /* compiled from: RewardBugEntryAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/a$b;", "Lcom/avito/android/reward_bug_entry_impl/mvi/a;", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f255633a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -883702660;
        }

        @Y61.k
        public final String toString() {
            return "CloseClick";
        }
    }

    /* compiled from: RewardBugEntryAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/a$c;", "Lcom/avito/android/reward_bug_entry_impl/mvi/a;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f255634a;

        public c(@Y61.k DeepLink deepLink) {
            this.f255634a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f255634a, ((c) obj).f255634a);
        }

        public final int hashCode() {
            return this.f255634a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("IconClick(deepLink="), this.f255634a, ')');
        }
    }

    /* compiled from: RewardBugEntryAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/a$d;", "Lcom/avito/android/reward_bug_entry_impl/mvi/a;", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f255635a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 502311458;
        }

        @Y61.k
        public final String toString() {
            return "ShowIcon";
        }
    }
}
