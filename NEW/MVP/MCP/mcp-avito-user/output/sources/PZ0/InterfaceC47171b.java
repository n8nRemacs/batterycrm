package pz0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.StrOrdersBuyerResponseSection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersBuyerState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lpz0/b;", "", "a", "b", "c", "Lpz0/b$a;", "Lpz0/b$b;", "Lpz0/b$c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC47171b {

    /* compiled from: StrOrdersBuyerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpz0/b$a;", "Lpz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pz0.b$a */
    public static final /* data */ class a implements InterfaceC47171b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<StrOrdersBuyerResponseSection> f428925a;

        public a(@k List<StrOrdersBuyerResponseSection> list) {
            this.f428925a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f428925a, ((a) obj).f428925a);
        }

        public final int hashCode() {
            return this.f428925a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Content(sections="), this.f428925a, ')');
        }
    }

    /* compiled from: StrOrdersBuyerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpz0/b$b;", "Lpz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pz0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12300b implements InterfaceC47171b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f428926a;

        public C12300b(@k ApiError apiError) {
            this.f428926a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12300b) && L.f(this.f428926a, ((C12300b) obj).f428926a);
        }

        public final int hashCode() {
            return this.f428926a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f428926a, ')');
        }
    }

    /* compiled from: StrOrdersBuyerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpz0/b$c;", "Lpz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pz0.b$c */
    public static final class c implements InterfaceC47171b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f428927a = new c();
    }
}
