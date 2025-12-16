package vg0;

import Y61.k;
import Y61.l;
import com.avito.android.rating.details.answer.text.RatingAddAnswerTextArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingAddAnswerInternalAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lvg0/a;", "", "a", "Lvg0/a$a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vg0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC49326a {

    /* compiled from: RatingAddAnswerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvg0/a$a;", "Lvg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vg0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12786a implements InterfaceC49326a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final RatingAddAnswerTextArguments f440929a;

        public C12786a(@k RatingAddAnswerTextArguments ratingAddAnswerTextArguments) {
            this.f440929a = ratingAddAnswerTextArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12786a) && L.f(this.f440929a, ((C12786a) obj).f440929a);
        }

        public final int hashCode() {
            return this.f440929a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenTextStep(arguments=" + this.f440929a + ')';
        }
    }
}
