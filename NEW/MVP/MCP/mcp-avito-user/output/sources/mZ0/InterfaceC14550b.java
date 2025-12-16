package Mz0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MonthSelectorOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LMz0/b;", "", "a", "b", "c", "LMz0/b$a;", "LMz0/b$b;", "LMz0/b$c;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC14550b {

    /* compiled from: MonthSelectorOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMz0/b$a;", "LMz0/b;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mz0.b$a */
    public static final class a implements InterfaceC14550b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f11154a = new a();
    }

    /* compiled from: MonthSelectorOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMz0/b$b;", "LMz0/b;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mz0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0716b implements InterfaceC14550b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11155a;

        public C0716b(@k String str) {
            this.f11155a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0716b) && L.f(this.f11155a, ((C0716b) obj).f11155a);
        }

        public final int hashCode() {
            return this.f11155a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PassResult(monthId="), this.f11155a, ')');
        }
    }

    /* compiled from: MonthSelectorOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMz0/b$c;", "LMz0/b;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mz0.b$c */
    public static final /* data */ class c implements InterfaceC14550b {

        /* renamed from: a, reason: collision with root package name */
        public final int f11156a;

        public c(int i12) {
            this.f11156a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f11156a == ((c) obj).f11156a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f11156a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToPosition(position="), this.f11156a, ')');
        }
    }
}
