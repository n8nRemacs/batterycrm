package EY;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BlacklistItem.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LEY/a;", "Lcom/avito/conveyor_item/a;", "<init>", "()V", "a", "b", "LEY/a$a;", "LEY/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class a implements com.avito.conveyor_item.a {

    /* compiled from: BlacklistItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEY/a$a;", "LEY/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: EY.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0238a extends a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f4060b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f4061c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f4062d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f4063e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f4064f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f4065g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f4066h;

        public C0238a(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, boolean z12, @k String str6) {
            super(null);
            this.f4060b = str;
            this.f4061c = str2;
            this.f4062d = str3;
            this.f4063e = str4;
            this.f4064f = str5;
            this.f4065g = str6;
            this.f4066h = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0238a)) {
                return false;
            }
            C0238a c0238a = (C0238a) obj;
            return L.f(this.f4060b, c0238a.f4060b) && L.f(this.f4061c, c0238a.f4061c) && L.f(this.f4062d, c0238a.f4062d) && L.f(this.f4063e, c0238a.f4063e) && L.f(this.f4064f, c0238a.f4064f) && L.f(this.f4065g, c0238a.f4065g) && this.f4066h == c0238a.f4066h;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF4060b() {
            return this.f4060b;
        }

        public final int hashCode() {
            int iHashCode = this.f4060b.hashCode() * 31;
            String str = this.f4061c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f4062d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f4063e;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f4064f;
            return Boolean.hashCode(this.f4066h) + H.d((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f4065g);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BlockedUser(userId=");
            sb2.append(this.f4060b);
            sb2.append(", userName=");
            sb2.append(this.f4061c);
            sb2.append(", itemTitle=");
            sb2.append(this.f4062d);
            sb2.append(", itemPrice=");
            sb2.append(this.f4063e);
            sb2.append(", itemCategory=");
            sb2.append(this.f4064f);
            sb2.append(", created=");
            sb2.append(this.f4065g);
            sb2.append(", unblockingInProgress=");
            return r.x(sb2, this.f4066h, ')');
        }
    }

    /* compiled from: BlacklistItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEY/a$b;", "LEY/a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f4067b = new b();

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f4068c = "PaginationInProgress";

        /* renamed from: d, reason: collision with root package name */
        public static final long f4069d = -3;

        public b() {
            super(null);
        }

        @Override // EY.a, TV0.a
        /* renamed from: getId */
        public final long getF113526b() {
            return f4069d;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId */
        public final String getF4060b() {
            return f4068c;
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    @Override // TV0.a
    /* renamed from: getId */
    public long getF113526b() {
        return getF4060b().hashCode();
    }

    public a() {
    }
}
