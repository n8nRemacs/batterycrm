package zN0;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.virtual_deal_room.base.VDRClientAddFromPage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VDRClientAddResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LzN0/f;", "LJu/c$b;", "a", "b", "LzN0/f$a;", "LzN0/f$b;", "_avito_virtual-deal-room_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface f extends InterfaceC14249c.b {

    /* compiled from: VDRClientAddResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LzN0/f$a;", "LzN0/f;", "<init>", "()V", "_avito_virtual-deal-room_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements f {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f444034b = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1221340344;
        }

        @k
        public final String toString() {
            return "Dismissed";
        }
    }

    /* compiled from: VDRClientAddResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzN0/f$b;", "LzN0/f;", "_avito_virtual-deal-room_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements f {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f444035b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f444036c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final VDRClientAddFromPage f444037d;

        public b(@k String str, @k String str2, @k VDRClientAddFromPage vDRClientAddFromPage) {
            this.f444035b = str;
            this.f444036c = str2;
            this.f444037d = vDRClientAddFromPage;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f444035b, bVar.f444035b) && L.f(this.f444036c, bVar.f444036c) && this.f444037d == bVar.f444037d;
        }

        public final int hashCode() {
            return this.f444037d.hashCode() + H.d(this.f444035b.hashCode() * 31, 31, this.f444036c);
        }

        @k
        public final String toString() {
            return "Saved(processId=" + this.f444035b + ", processType=" + this.f444036c + ", fromPage=" + this.f444037d + ')';
        }
    }
}
