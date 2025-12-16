package mp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.comment.model.CommentResult;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommentInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lmp/b;", "", "a", "b", "c", "d", "e", "Lmp/b$a;", "Lmp/b$b;", "Lmp/b$c;", "Lmp/b$d;", "Lmp/b$e;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mp.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC44114b {

    /* compiled from: CommentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmp/b$a;", "Lmp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mp.b$a */
    public static final /* data */ class a implements InterfaceC44114b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CommentResult f414751a;

        public a(@k CommentResult commentResult) {
            this.f414751a = commentResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f414751a, ((a) obj).f414751a);
        }

        public final int hashCode() {
            return this.f414751a.hashCode();
        }

        @k
        public final String toString() {
            return "Close(result=" + this.f414751a + ')';
        }
    }

    /* compiled from: CommentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmp/b$b;", "Lmp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mp.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11843b implements InterfaceC44114b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f414752a;

        public C11843b(@k ApiError apiError) {
            this.f414752a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11843b) && L.f(this.f414752a, ((C11843b) obj).f414752a);
        }

        public final int hashCode() {
            return this.f414752a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("SubmitError(error="), this.f414752a, ')');
        }
    }

    /* compiled from: CommentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmp/b$c;", "Lmp/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mp.b$c */
    public static final /* data */ class c implements InterfaceC44114b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f414753a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 604219581;
        }

        @k
        public final String toString() {
            return "SubmitStarted";
        }
    }

    /* compiled from: CommentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmp/b$d;", "Lmp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mp.b$d */
    public static final /* data */ class d implements InterfaceC44114b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CommentResult f414754a;

        public d(@k CommentResult commentResult) {
            this.f414754a = commentResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f414754a, ((d) obj).f414754a);
        }

        public final int hashCode() {
            return this.f414754a.hashCode();
        }

        @k
        public final String toString() {
            return "SubmitSuccess(result=" + this.f414754a + ')';
        }
    }

    /* compiled from: CommentInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmp/b$e;", "Lmp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mp.b$e */
    public static final /* data */ class e implements InterfaceC44114b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f414755a;

        public e(@k String str) {
            this.f414755a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f414755a, ((e) obj).f414755a);
        }

        public final int hashCode() {
            return this.f414755a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateComment(comment="), this.f414755a, ')');
        }
    }
}
