package mp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.comment.model.CommentResult;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommentOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lmp/c;", "", "a", "b", "Lmp/c$a;", "Lmp/c$b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mp.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC44115c {

    /* compiled from: CommentOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmp/c$a;", "Lmp/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mp.c$a */
    public static final /* data */ class a implements InterfaceC44115c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CommentResult f414756a;

        public a(@k CommentResult commentResult) {
            this.f414756a = commentResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f414756a, ((a) obj).f414756a);
        }

        public final int hashCode() {
            return this.f414756a.hashCode();
        }

        @k
        public final String toString() {
            return "Close(result=" + this.f414756a + ')';
        }
    }

    /* compiled from: CommentOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmp/c$b;", "Lmp/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mp.c$b */
    public static final /* data */ class b implements InterfaceC44115c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f414757a;

        public b(@k PrintableText printableText) {
            this.f414757a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f414757a, ((b) obj).f414757a);
        }

        public final int hashCode() {
            return this.f414757a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowError(text="), this.f414757a, ')');
        }
    }
}
