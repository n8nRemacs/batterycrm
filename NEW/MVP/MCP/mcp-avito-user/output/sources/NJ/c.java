package Nj;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.BodyConditionSide;
import com.avito.android.deep_linking.links.PointWithPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BodyConditionSheetOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LNj/c;", "", "a", "b", "c", "d", "LNj/c$a;", "LNj/c$b;", "LNj/c$c;", "LNj/c$d;", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c {

    /* compiled from: BodyConditionSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNj/c$a;", "LNj/c;", "<init>", "()V", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f11726a = new a();
    }

    /* compiled from: BodyConditionSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNj/c$b;", "LNj/c;", "<init>", "()V", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f11727a = new b();
    }

    /* compiled from: BodyConditionSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNj/c$c;", "LNj/c;", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nj.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0758c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PointWithPosition f11728a;

        public C0758c(@k PointWithPosition pointWithPosition) {
            this.f11728a = pointWithPosition;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0758c) && L.f(this.f11728a, ((C0758c) obj).f11728a);
        }

        public final int hashCode() {
            return this.f11728a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowPointInformation(point=" + this.f11728a + ')';
        }
    }

    /* compiled from: BodyConditionSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNj/c$d;", "LNj/c;", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BodyConditionSide f11729a;

        public d(@k BodyConditionSide bodyConditionSide) {
            this.f11729a = bodyConditionSide;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f11729a, ((d) obj).f11729a);
        }

        public final int hashCode() {
            return this.f11729a.hashCode();
        }

        @k
        public final String toString() {
            return "SideChanged(bodyConditionSide=" + this.f11729a + ')';
        }
    }
}
