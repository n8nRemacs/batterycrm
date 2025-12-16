package Nj;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.BodyConditionSide;
import com.avito.android.deep_linking.links.PointWithPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BodyConditionSheetAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LNj/a;", "", "a", "b", "c", "d", "e", "LNj/a$a;", "LNj/a$b;", "LNj/a$c;", "LNj/a$d;", "LNj/a$e;", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nj.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14580a {

    /* compiled from: BodyConditionSheetAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNj/a$a;", "LNj/a;", "<init>", "()V", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nj.a$a, reason: collision with other inner class name */
    public static final class C0756a implements InterfaceC14580a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0756a f11714a = new C0756a();
    }

    /* compiled from: BodyConditionSheetAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNj/a$b;", "LNj/a;", "<init>", "()V", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nj.a$b */
    public static final class b implements InterfaceC14580a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f11715a = new b();
    }

    /* compiled from: BodyConditionSheetAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNj/a$c;", "LNj/a;", "<init>", "()V", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nj.a$c */
    public static final class c implements InterfaceC14580a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f11716a = new c();
    }

    /* compiled from: BodyConditionSheetAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNj/a$d;", "LNj/a;", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nj.a$d */
    public static final /* data */ class d implements InterfaceC14580a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PointWithPosition f11717a;

        public d(@k PointWithPosition pointWithPosition) {
            this.f11717a = pointWithPosition;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f11717a, ((d) obj).f11717a);
        }

        public final int hashCode() {
            return this.f11717a.hashCode();
        }

        @k
        public final String toString() {
            return "PointClicked(point=" + this.f11717a + ')';
        }
    }

    /* compiled from: BodyConditionSheetAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNj/a$e;", "LNj/a;", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nj.a$e */
    public static final /* data */ class e implements InterfaceC14580a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BodyConditionSide f11718a;

        public e(@k BodyConditionSide bodyConditionSide) {
            this.f11718a = bodyConditionSide;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f11718a, ((e) obj).f11718a);
        }

        public final int hashCode() {
            return this.f11718a.hashCode();
        }

        @k
        public final String toString() {
            return "SideClicked(bodyConditionSide=" + this.f11718a + ')';
        }
    }
}
