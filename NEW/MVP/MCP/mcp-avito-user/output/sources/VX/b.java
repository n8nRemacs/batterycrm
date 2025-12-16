package Vx;

import Y61.k;
import Y61.l;
import com.avito.android.early_access_advert.feedback_screen.domain.EarlyAccessAdvertFeedbackType;
import com.avito.android.remote.model.early_access_advert.EarlyAccessFeedback;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessAdvertInfoOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LVx/b;", "", "a", "LVx/b$a;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: EarlyAccessAdvertInfoOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVx/b$a;", "LVx/b;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final EarlyAccessAdvertFeedbackType f17518a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final EarlyAccessFeedback f17519b;

        public a(@k EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType, @k EarlyAccessFeedback earlyAccessFeedback) {
            this.f17518a = earlyAccessAdvertFeedbackType;
            this.f17519b = earlyAccessFeedback;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17518a == aVar.f17518a && L.f(this.f17519b, aVar.f17519b);
        }

        public final int hashCode() {
            return this.f17519b.hashCode() + (this.f17518a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowFeedbackScreen(feedbackType=" + this.f17518a + ", feedback=" + this.f17519b + ')';
        }
    }
}
