package wg0;

import Y61.k;
import Y61.l;
import com.avito.android.rating.details.answer.upload.ReviewReplyState;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingAddAnswerPhotoOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lwg0/b;", "", "a", "b", "c", "d", "Lwg0/b$a;", "Lwg0/b$b;", "Lwg0/b$c;", "Lwg0/b$d;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wg0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC49620b {

    /* compiled from: RatingAddAnswerPhotoOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwg0/b$a;", "Lwg0/b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wg0.b$a */
    public static final /* data */ class a implements InterfaceC49620b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ReviewReplyState.Result f441738a;

        public a(@k ReviewReplyState.Result result) {
            this.f441738a = result;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f441738a.equals(((a) obj).f441738a);
        }

        public final int hashCode() {
            return this.f441738a.hashCode();
        }

        @k
        public final String toString() {
            return "Finish(reviewReplyState=" + this.f441738a + ')';
        }
    }

    /* compiled from: RatingAddAnswerPhotoOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwg0/b$b;", "Lwg0/b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wg0.b$b, reason: collision with other inner class name */
    public static final class C12825b implements InterfaceC49620b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12825b f441739a = new C12825b();
    }

    /* compiled from: RatingAddAnswerPhotoOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwg0/b$c;", "Lwg0/b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wg0.b$c */
    public static final /* data */ class c implements InterfaceC49620b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f441740a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f441741b;

        public c(@k String str, @k ApiException apiException) {
            this.f441740a = str;
            this.f441741b = apiException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f441740a, cVar.f441740a) && this.f441741b.equals(cVar.f441741b);
        }

        public final int hashCode() {
            return this.f441741b.hashCode() + (this.f441740a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorToastBar(text=");
            sb2.append(this.f441740a);
            sb2.append(", error=");
            return AK.c.q(sb2, this.f441741b, ')');
        }
    }

    /* compiled from: RatingAddAnswerPhotoOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwg0/b$d;", "Lwg0/b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wg0.b$d */
    public static final /* data */ class d implements InterfaceC49620b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserDialog f441742a;

        public d(@k UserDialog userDialog) {
            this.f441742a = userDialog;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f441742a, ((d) obj).f441742a);
        }

        public final int hashCode() {
            return this.f441742a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowUserDialog(dialog=" + this.f441742a + ')';
        }
    }
}
