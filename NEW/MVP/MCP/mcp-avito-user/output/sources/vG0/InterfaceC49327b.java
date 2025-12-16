package vg0;

import Y61.k;
import Y61.l;
import com.avito.android.rating.details.answer.text.RatingAddAnswerTextArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingAddAnswerOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lvg0/b;", "", "a", "Lvg0/b$a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vg0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC49327b {

    /* compiled from: RatingAddAnswerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvg0/b$a;", "Lvg0/b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vg0.b$a */
    public static final /* data */ class a implements InterfaceC49327b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final RatingAddAnswerTextArguments f440930a;

        public a(@k RatingAddAnswerTextArguments ratingAddAnswerTextArguments) {
            this.f440930a = ratingAddAnswerTextArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f440930a, ((a) obj).f440930a);
        }

        public final int hashCode() {
            return this.f440930a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenTextStep(arguments=" + this.f440930a + ')';
        }
    }
}
