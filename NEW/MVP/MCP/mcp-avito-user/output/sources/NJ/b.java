package Nj;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.BodyCondition;
import com.avito.android.deep_linking.links.BodyConditionSide;
import com.avito.android.deep_linking.links.PointWithPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BodyConditionSheetInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LNj/b;", "", "a", "b", "c", "d", "e", "f", "LNj/b$a;", "LNj/b$b;", "LNj/b$c;", "LNj/b$d;", "LNj/b$e;", "LNj/b$f;", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: BodyConditionSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNj/b$a;", "LNj/b;", "<init>", "()V", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f11719a = new a();
    }

    /* compiled from: BodyConditionSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNj/b$b;", "LNj/b;", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nj.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0757b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BodyCondition f11720a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f11721b;

        public C0757b(@k BodyCondition bodyCondition, @l String str) {
            this.f11720a = bodyCondition;
            this.f11721b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0757b)) {
                return false;
            }
            C0757b c0757b = (C0757b) obj;
            return L.f(this.f11720a, c0757b.f11720a) && L.f(this.f11721b, c0757b.f11721b);
        }

        public final int hashCode() {
            int iHashCode = this.f11720a.hashCode() * 31;
            String str = this.f11721b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentReceived(bodyCondition=");
            sb2.append(this.f11720a);
            sb2.append(", fromPage=");
            return C22026a.c(sb2, this.f11721b, ')');
        }
    }

    /* compiled from: BodyConditionSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNj/b$c;", "LNj/b;", "<init>", "()V", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f11722a = new c();
    }

    /* compiled from: BodyConditionSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNj/b$d;", "LNj/b;", "<init>", "()V", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f11723a = new d();
    }

    /* compiled from: BodyConditionSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNj/b$e;", "LNj/b;", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PointWithPosition f11724a;

        public e(@k PointWithPosition pointWithPosition) {
            this.f11724a = pointWithPosition;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f11724a, ((e) obj).f11724a);
        }

        public final int hashCode() {
            return this.f11724a.hashCode();
        }

        @k
        public final String toString() {
            return "PointClickHappened(point=" + this.f11724a + ')';
        }
    }

    /* compiled from: BodyConditionSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNj/b$f;", "LNj/b;", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BodyConditionSide f11725a;

        public f(@k BodyConditionSide bodyConditionSide) {
            this.f11725a = bodyConditionSide;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f11725a, ((f) obj).f11725a);
        }

        public final int hashCode() {
            return this.f11725a.hashCode();
        }

        @k
        public final String toString() {
            return "SideClickHappened(bodyConditionSide=" + this.f11725a + ')';
        }
    }
}
