package vQ;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.job.interview.domain.i;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JobInterviewInvitationState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LvQ/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vQ.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C49251c extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f440741e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C49251c f440742f = new C49251c(new i(C42784z0.f406748b, null, null, false, 14, null), false, false);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f440743b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f440744c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f440745d;

    /* compiled from: JobInterviewInvitationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvQ/c$a;", "", "<init>", "()V", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vQ.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C49251c(@k i iVar, boolean z12, boolean z13) {
        this.f440743b = iVar;
        this.f440744c = z12;
        this.f440745d = z13;
    }

    public static C49251c a(C49251c c49251c, i iVar, boolean z12, boolean z13, int i12) {
        if ((i12 & 1) != 0) {
            iVar = c49251c.f440743b;
        }
        if ((i12 & 2) != 0) {
            z12 = c49251c.f440744c;
        }
        if ((i12 & 4) != 0) {
            z13 = c49251c.f440745d;
        }
        c49251c.getClass();
        return new C49251c(iVar, z12, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49251c)) {
            return false;
        }
        C49251c c49251c = (C49251c) obj;
        return L.f(this.f440743b, c49251c.f440743b) && this.f440744c == c49251c.f440744c && this.f440745d == c49251c.f440745d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f440745d) + r.i(this.f440743b.hashCode() * 31, 31, this.f440744c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobInterviewInvitationState(draft=");
        sb2.append(this.f440743b);
        sb2.append(", isLoading=");
        sb2.append(this.f440744c);
        sb2.append(", isLoadingError=");
        return r.x(sb2, this.f440745d, ')');
    }
}
