package xg0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingAddAnswerTextAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lxg0/a;", "", "a", "b", "Lxg0/a$a;", "Lxg0/a$b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xg0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC49941a {

    /* compiled from: RatingAddAnswerTextAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxg0/a$a;", "Lxg0/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xg0.a$a, reason: collision with other inner class name */
    public static final class C12875a implements InterfaceC49941a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12875a f442598a = new C12875a();
    }

    /* compiled from: RatingAddAnswerTextAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxg0/a$b;", "Lxg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xg0.a$b */
    public static final /* data */ class b implements InterfaceC49941a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f442599a;

        public b(@k String str) {
            this.f442599a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f442599a, ((b) obj).f442599a);
        }

        public final int hashCode() {
            return this.f442599a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TextChanged(text="), this.f442599a, ')');
        }
    }
}
