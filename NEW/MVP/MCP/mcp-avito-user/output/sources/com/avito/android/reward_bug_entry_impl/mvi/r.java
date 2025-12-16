package com.avito.android.reward_bug_entry_impl.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.reward_bug_entry_impl.domain.PositionOnScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RewardBugState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/r;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/reward_bug_entry_impl/mvi/r$b;", "Lcom/avito/android/reward_bug_entry_impl/mvi/r$c;", "Lcom/avito/android/reward_bug_entry_impl/mvi/r$d;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f255671a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final c f255672b = c.f255674c;

    /* compiled from: RewardBugState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/r$a;", "", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RewardBugState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/r$b;", "Lcom/avito/android/reward_bug_entry_impl/mvi/r;", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends r {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f255673c = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2072519899;
        }

        @Y61.k
        public final String toString() {
            return "Hide";
        }
    }

    /* compiled from: RewardBugState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/r$c;", "Lcom/avito/android/reward_bug_entry_impl/mvi/r;", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends r {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final c f255674c = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1253944139;
        }

        @Y61.k
        public final String toString() {
            return "NotLoaded";
        }
    }

    /* compiled from: RewardBugState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/r$d;", "Lcom/avito/android/reward_bug_entry_impl/mvi/r;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends r {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f255675c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final UniversalImage f255676d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final UniversalColor f255677e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final PositionOnScreen f255678f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f255679g;

        public d(@Y61.k DeepLink deepLink, @Y61.k UniversalImage universalImage, @Y61.k UniversalColor universalColor, @Y61.k PositionOnScreen positionOnScreen, boolean z12) {
            super(null);
            this.f255675c = deepLink;
            this.f255676d = universalImage;
            this.f255677e = universalColor;
            this.f255678f = positionOnScreen;
            this.f255679g = z12;
        }

        public static d a(d dVar, PositionOnScreen positionOnScreen, int i12) {
            DeepLink deepLink = dVar.f255675c;
            UniversalImage universalImage = dVar.f255676d;
            UniversalColor universalColor = dVar.f255677e;
            if ((i12 & 8) != 0) {
                positionOnScreen = dVar.f255678f;
            }
            PositionOnScreen positionOnScreen2 = positionOnScreen;
            boolean z12 = (i12 & 16) != 0 ? dVar.f255679g : false;
            dVar.getClass();
            return new d(deepLink, universalImage, universalColor, positionOnScreen2, z12);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f255675c, dVar.f255675c) && L.f(this.f255676d, dVar.f255676d) && L.f(this.f255677e, dVar.f255677e) && this.f255678f == dVar.f255678f && this.f255679g == dVar.f255679g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f255679g) + ((this.f255678f.hashCode() + com.avito.android.actions_sheet.a.i(this.f255677e, com.avito.android.actions_sheet.a.a(this.f255675c.hashCode() * 31, 31, this.f255676d), 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Show(deepLink=");
            sb2.append(this.f255675c);
            sb2.append(", image=");
            sb2.append(this.f255676d);
            sb2.append(", color=");
            sb2.append(this.f255677e);
            sb2.append(", positionOnScreen=");
            sb2.append(this.f255678f);
            sb2.append(", firstShow=");
            return androidx.appcompat.app.r.x(sb2, this.f255679g, ')');
        }
    }

    public /* synthetic */ r(C42822w c42822w) {
        this();
    }

    public r() {
    }
}
