package Eh;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: LimitIncreaseAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LEh/a;", "", "a", "b", "c", "d", "LEh/a$a;", "LEh/a$b;", "LEh/a$c;", "LEh/a$d;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Eh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13485a {

    /* compiled from: LimitIncreaseAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEh/a$a;", "LEh/a;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eh.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0246a implements InterfaceC13485a {

        /* renamed from: a, reason: collision with root package name */
        public final int f4166a;

        public C0246a(int i12) {
            this.f4166a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0246a) && this.f4166a == ((C0246a) obj).f4166a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f4166a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnChipClicked(position="), this.f4166a, ')');
        }
    }

    /* compiled from: LimitIncreaseAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEh/a$b;", "LEh/a;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eh.a$b */
    public static final /* data */ class b implements InterfaceC13485a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f4167a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 212772667;
        }

        @k
        public final String toString() {
            return "OnNavBarIconClicked";
        }
    }

    /* compiled from: LimitIncreaseAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEh/a$c;", "LEh/a;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eh.a$c */
    public static final /* data */ class c implements InterfaceC13485a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f4168a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -729807809;
        }

        @k
        public final String toString() {
            return "OnNextButtonClicked";
        }
    }

    /* compiled from: LimitIncreaseAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEh/a$d;", "LEh/a;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eh.a$d */
    public static final /* data */ class d implements InterfaceC13485a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f4169a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -149051760;
        }

        @k
        public final String toString() {
            return "OnRetryButtonClicked";
        }
    }
}
