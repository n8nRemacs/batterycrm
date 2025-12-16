package mO;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.intermediary_verification.data.model.IntermediaryVerificationData;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: IntermediaryVerificationState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LmO/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f414489c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final b f414490d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final IntermediaryVerificationData f414491b;

    /* compiled from: IntermediaryVerificationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmO/b$a;", "", "<init>", "()V", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f414490d = new b(new IntermediaryVerificationData("", new AttributedText("", c42784z0, 0, 4, null), "", c42784z0, new IntermediaryVerificationData.Button(new NoMatchLink(), "", "", true), new IntermediaryVerificationData.Button(new NoMatchLink(), "", "", true), "", ""));
    }

    public b(@k IntermediaryVerificationData intermediaryVerificationData) {
        this.f414491b = intermediaryVerificationData;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f414491b, ((b) obj).f414491b);
    }

    public final int hashCode() {
        return this.f414491b.hashCode();
    }

    @k
    public final String toString() {
        return "IntermediaryVerificationState(data=" + this.f414491b + ')';
    }
}
