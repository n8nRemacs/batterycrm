package F20;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MultiSendMessageListItem.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LF20/e;", "", "a", "b", "c", "LF20/e$a;", "LF20/e$b;", "LF20/e$c;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f4507a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f4508b;

    /* compiled from: MultiSendMessageListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LF20/e$a;", "LF20/e;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* renamed from: c, reason: collision with root package name */
        public final long f4509c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f4510d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f4511e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f4512f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f4513g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final Image f4514h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final f f4515i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final String f4516j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f4517k;

        /* renamed from: l, reason: collision with root package name */
        @k
        public final String f4518l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f4519m;

        public /* synthetic */ a(long j12, String str, String str2, String str3, String str4, Image image, f fVar, String str5, boolean z12, String str6, boolean z13, int i12, C42822w c42822w) {
            this(j12, str, str2, str3, str4, image, fVar, str5, (i12 & 256) != 0 ? false : z12, str6, z13);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4509c == aVar.f4509c && L.f(this.f4510d, aVar.f4510d) && L.f(this.f4511e, aVar.f4511e) && L.f(this.f4512f, aVar.f4512f) && L.f(this.f4513g, aVar.f4513g) && L.f(this.f4514h, aVar.f4514h) && L.f(this.f4515i, aVar.f4515i) && L.f(this.f4516j, aVar.f4516j) && this.f4517k == aVar.f4517k && L.f(this.f4518l, aVar.f4518l) && this.f4519m == aVar.f4519m;
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(H.d(Long.hashCode(this.f4509c) * 31, 31, this.f4510d), 31, this.f4511e), 31, this.f4512f);
            String str = this.f4513g;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            Image image = this.f4514h;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            f fVar = this.f4515i;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            String str2 = this.f4516j;
            return Boolean.hashCode(this.f4519m) + H.d(r.i((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f4517k), 31, this.f4518l);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ListItem(id=");
            sb2.append(this.f4509c);
            sb2.append(", name=");
            sb2.append(this.f4510d);
            sb2.append(", price=");
            sb2.append(this.f4511e);
            sb2.append(", sellerName=");
            sb2.append(this.f4512f);
            sb2.append(", address=");
            sb2.append(this.f4513g);
            sb2.append(", image=");
            sb2.append(this.f4514h);
            sb2.append(", sellerReputation=");
            sb2.append(this.f4515i);
            sb2.append(", minDeliveryTime=");
            sb2.append(this.f4516j);
            sb2.append(", isChecked=");
            sb2.append(this.f4517k);
            sb2.append(", ident=");
            sb2.append(this.f4518l);
            sb2.append(", isActive=");
            return r.x(sb2, this.f4519m, ')');
        }

        public a(long j12, @k String str, @k String str2, @k String str3, @l String str4, @l Image image, @l f fVar, @l String str5, boolean z12, @k String str6, boolean z13) {
            super(String.valueOf(j12), str6, null);
            this.f4509c = j12;
            this.f4510d = str;
            this.f4511e = str2;
            this.f4512f = str3;
            this.f4513g = str4;
            this.f4514h = image;
            this.f4515i = fVar;
            this.f4516j = str5;
            this.f4517k = z12;
            this.f4518l = str6;
            this.f4519m = z13;
        }
    }

    /* compiled from: MultiSendMessageListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LF20/e$b;", "LF20/e;", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final b f4520c = new b();

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -377067105;
        }

        @k
        public final String toString() {
            return "ShimmerItem";
        }
    }

    /* compiled from: MultiSendMessageListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LF20/e$c;", "LF20/e;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends e {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f4521c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f4522d;

        public c(@k String str, @k String str2) {
            super(str2, str2, null);
            this.f4521c = str;
            this.f4522d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f4521c, cVar.f4521c) && L.f(this.f4522d, cVar.f4522d);
        }

        public final int hashCode() {
            return this.f4522d.hashCode() + (this.f4521c.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TitleItem(title=");
            sb2.append(this.f4521c);
            sb2.append(", ident=");
            return C22026a.c(sb2, this.f4522d, ')');
        }
    }

    public /* synthetic */ e(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, null);
    }

    public e(String str, String str2, C42822w c42822w) {
        this.f4507a = str;
        this.f4508b = str2;
    }
}
