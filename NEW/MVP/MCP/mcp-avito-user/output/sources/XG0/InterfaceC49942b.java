package xg0;

import Y61.k;
import Y61.l;
import com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingAddAnswerTextOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lxg0/b;", "", "a", "b", "c", "Lxg0/b$a;", "Lxg0/b$b;", "Lxg0/b$c;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xg0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC49942b {

    /* compiled from: RatingAddAnswerTextOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxg0/b$a;", "Lxg0/b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xg0.b$a */
    public static final class a implements InterfaceC49942b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f442600a = new a();
    }

    /* compiled from: RatingAddAnswerTextOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxg0/b$b;", "Lxg0/b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xg0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12876b implements InterfaceC49942b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final RatingAddAnswerPhotoArguments f442601a;

        public C12876b(@k RatingAddAnswerPhotoArguments ratingAddAnswerPhotoArguments) {
            this.f442601a = ratingAddAnswerPhotoArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12876b) && L.f(this.f442601a, ((C12876b) obj).f442601a);
        }

        public final int hashCode() {
            return this.f442601a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenPhotoStep(arguments=" + this.f442601a + ')';
        }
    }

    /* compiled from: RatingAddAnswerTextOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxg0/b$c;", "Lxg0/b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xg0.b$c */
    public static final class c implements InterfaceC49942b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f442602a = new c();
    }
}
