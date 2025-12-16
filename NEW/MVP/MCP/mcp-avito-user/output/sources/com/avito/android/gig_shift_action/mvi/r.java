package com.avito.android.gig_shift_action.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.work_profile.deeplink.JobSeekerCvsLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigShiftActionOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/r;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/gig_shift_action/mvi/r$a;", "Lcom/avito/android/gig_shift_action/mvi/r$b;", "Lcom/avito/android/gig_shift_action/mvi/r$c;", "Lcom/avito/android/gig_shift_action/mvi/r$d;", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class r {

    /* compiled from: GigShiftActionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/r$a;", "Lcom/avito/android/gig_shift_action/mvi/r;", "<init>", "()V", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends r {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f160515a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -494655270;
        }

        @Y61.k
        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: GigShiftActionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/r$b;", "Lcom/avito/android/gig_shift_action/mvi/r;", "<init>", "()V", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends r {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f160516a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -527769428;
        }

        @Y61.k
        public final String toString() {
            return "DismissForScan";
        }
    }

    /* compiled from: GigShiftActionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/r$c;", "Lcom/avito/android/gig_shift_action/mvi/r;", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends r {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f160517a;

        public c(@Y61.k DeepLink deepLink) {
            super(null);
            this.f160517a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f160517a, ((c) obj).f160517a);
        }

        public final int hashCode() {
            return this.f160517a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("GoToRate(deeplink="), this.f160517a, ')');
        }
    }

    /* compiled from: GigShiftActionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/r$d;", "Lcom/avito/android/gig_shift_action/mvi/r;", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends r {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final JobSeekerCvsLink f160518a;

        public d(@Y61.k JobSeekerCvsLink jobSeekerCvsLink) {
            super(null);
            this.f160518a = jobSeekerCvsLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f160518a, ((d) obj).f160518a);
        }

        public final int hashCode() {
            return this.f160518a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenDeeplink(deeplink=" + this.f160518a + ')';
        }
    }

    public /* synthetic */ r(C42822w c42822w) {
        this();
    }

    public r() {
    }
}
