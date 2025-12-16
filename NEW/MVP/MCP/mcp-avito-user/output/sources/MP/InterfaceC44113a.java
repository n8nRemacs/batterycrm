package mp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommentAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lmp/a;", "", "a", "b", "c", "Lmp/a$a;", "Lmp/a$b;", "Lmp/a$c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC44113a {

    /* compiled from: CommentAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmp/a$a;", "Lmp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mp.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11842a implements InterfaceC44113a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f414748a;

        public C11842a(@k String str) {
            this.f414748a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11842a) && L.f(this.f414748a, ((C11842a) obj).f414748a);
        }

        public final int hashCode() {
            return this.f414748a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangeComment(comment="), this.f414748a, ')');
        }
    }

    /* compiled from: CommentAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmp/a$b;", "Lmp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mp.a$b */
    public static final /* data */ class b implements InterfaceC44113a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f414749a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2013614256;
        }

        @k
        public final String toString() {
            return "OnClose";
        }
    }

    /* compiled from: CommentAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmp/a$c;", "Lmp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mp.a$c */
    public static final /* data */ class c implements InterfaceC44113a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f414750a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 303242658;
        }

        @k
        public final String toString() {
            return "SaveClick";
        }
    }
}
