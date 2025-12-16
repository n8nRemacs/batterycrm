package com.avito.android.reward_bug_entry_impl.domain;

import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RewardBugModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/domain/j;", "", "a", "b", "Lcom/avito/android/reward_bug_entry_impl/domain/j$a;", "Lcom/avito/android/reward_bug_entry_impl/domain/j$b;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface j {

    /* compiled from: RewardBugModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/domain/j$a;", "Lcom/avito/android/reward_bug_entry_impl/domain/j;", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f255620a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1825550012;
        }

        @Y61.k
        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: RewardBugModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/domain/j$b;", "Lcom/avito/android/reward_bug_entry_impl/domain/j;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UniversalImage f255621a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final UniversalColor f255622b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f255623c;

        /* renamed from: d, reason: collision with root package name */
        public final long f255624d;

        public b(@Y61.k UniversalImage universalImage, @Y61.k UniversalColor universalColor, @Y61.k DeepLink deepLink, long j12) {
            this.f255621a = universalImage;
            this.f255622b = universalColor;
            this.f255623c = deepLink;
            this.f255624d = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f255621a, bVar.f255621a) && L.f(this.f255622b, bVar.f255622b) && L.f(this.f255623c, bVar.f255623c) && this.f255624d == bVar.f255624d;
        }

        public final int hashCode() {
            return Long.hashCode(this.f255624d) + com.avito.android.actions_sheet.a.e(this.f255623c, com.avito.android.actions_sheet.a.i(this.f255622b, this.f255621a.hashCode() * 31, 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(image=");
            sb2.append(this.f255621a);
            sb2.append(", background=");
            sb2.append(this.f255622b);
            sb2.append(", deeplink=");
            sb2.append(this.f255623c);
            sb2.append(", requestPeriod=");
            return r.u(sb2, this.f255624d, ')');
        }
    }
}
