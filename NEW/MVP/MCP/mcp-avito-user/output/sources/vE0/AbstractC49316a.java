package ve0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.PretendErrorValue;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PretendPriceListResult.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lve0/a;", "", "<init>", "()V", "a", "b", "c", "Lve0/a$a;", "Lve0/a$b;", "Lve0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ve0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC49316a {

    /* compiled from: PretendPriceListResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lve0/a$a;", "Lve0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ve0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12785a extends AbstractC49316a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f440913a;

        public C12785a(@l String str) {
            super(null);
            this.f440913a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12785a) && L.f(this.f440913a, ((C12785a) obj).f440913a);
        }

        public final int hashCode() {
            String str = this.f440913a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ApiError(message="), this.f440913a, ')');
        }
    }

    /* compiled from: PretendPriceListResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lve0/a$b;", "Lve0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ve0.a$b */
    public static final class b extends AbstractC49316a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f440914a = new b();

        public b() {
            super(null);
        }
    }

    /* compiled from: PretendPriceListResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lve0/a$c;", "Lve0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ve0.a$c */
    public static final /* data */ class c extends AbstractC49316a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f440915a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Map<String, PretendErrorValue> f440916b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@l String str, @l Map<String, ? extends PretendErrorValue> map) {
            super(null);
            this.f440915a = str;
            this.f440916b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f440915a, cVar.f440915a) && L.f(this.f440916b, cVar.f440916b);
        }

        public final int hashCode() {
            String str = this.f440915a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Map<String, PretendErrorValue> map = this.f440916b;
            return iHashCode + (map != null ? map.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ValidationError(message=");
            sb2.append(this.f440915a);
            sb2.append(", pretendResult=");
            return r.w(sb2, this.f440916b, ')');
        }
    }

    public /* synthetic */ AbstractC49316a(C42822w c42822w) {
        this();
    }

    public AbstractC49316a() {
    }
}
