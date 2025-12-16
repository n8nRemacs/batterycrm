package Ru;

import Ju.C14248b;
import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_events.events.DeeplinkHandlingResultStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeeplinkHandlingEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"LRu/b;", "LRu/a;", "a", "b", "c", "d", "e", "LRu/b$c;", "LRu/b$e;", "_avito_deeplinks_events_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b extends InterfaceC15081a {

    /* compiled from: DeeplinkHandlingEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRu/b$a;", "LRu/b$c;", "_avito_deeplinks_events_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f14710a;

        public a(@k DeepLink deepLink) {
            DeeplinkHandlingResultStatus deeplinkHandlingResultStatus = DeeplinkHandlingResultStatus.f134138c;
            this.f14710a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            if (!L.f(this.f14710a, ((a) obj).f14710a)) {
                return false;
            }
            DeeplinkHandlingResultStatus deeplinkHandlingResultStatus = DeeplinkHandlingResultStatus.f134138c;
            return true;
        }

        @Override // Ru.b
        @k
        /* renamed from: getDeeplink, reason: from getter */
        public final DeepLink getF14716a() {
            return this.f14710a;
        }

        @Override // Ru.b.c
        @k
        /* renamed from: getStatus */
        public final DeeplinkHandlingResultStatus getF14715e() {
            return DeeplinkHandlingResultStatus.f134138c;
        }

        public final int hashCode() {
            return DeeplinkHandlingResultStatus.f134138c.hashCode() + (this.f14710a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OnHardcodedResult(deeplink=" + this.f14710a + ", status=" + DeeplinkHandlingResultStatus.f134138c + ')';
        }
    }

    /* compiled from: DeeplinkHandlingEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRu/b$b;", "LRu/b$c;", "_avito_deeplinks_events_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ru.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0990b implements c {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0990b)) {
                return false;
            }
            ((C0990b) obj).getClass();
            return L.f(null, null);
        }

        @Override // Ru.b
        @k
        /* renamed from: getDeeplink */
        public final DeepLink getF14716a() {
            return null;
        }

        @Override // Ru.b.c
        @k
        /* renamed from: getStatus */
        public final DeeplinkHandlingResultStatus getF14715e() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "OnLegacyResult(deeplink=null, status=null)";
        }
    }

    /* compiled from: DeeplinkHandlingEvent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LRu/b$c;", "LRu/b;", "LRu/b$a;", "LRu/b$b;", "LRu/b$d;", "_avito_deeplinks_events_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends b {
        @k
        /* renamed from: getStatus */
        DeeplinkHandlingResultStatus getF14715e();
    }

    /* compiled from: DeeplinkHandlingEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRu/b$d;", "LRu/b$c;", "_avito_deeplinks_events_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f14711a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC14249c f14712b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f14713c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Bundle f14714d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final DeeplinkHandlingResultStatus f14715e;

        public d(@k DeepLink deepLink, @k InterfaceC14249c interfaceC14249c, @l String str, @l Bundle bundle) {
            this.f14711a = deepLink;
            this.f14712b = interfaceC14249c;
            this.f14713c = str;
            this.f14714d = bundle;
            this.f14715e = interfaceC14249c instanceof C14248b ? DeeplinkHandlingResultStatus.f134140e : interfaceC14249c instanceof InterfaceC14247a.b ? DeeplinkHandlingResultStatus.f134138c : interfaceC14249c instanceof InterfaceC14247a.InterfaceC0545a ? DeeplinkHandlingResultStatus.f134139d : DeeplinkHandlingResultStatus.f134141f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f14711a, dVar.f14711a) && L.f(this.f14712b, dVar.f14712b) && L.f(this.f14713c, dVar.f14713c) && L.f(this.f14714d, dVar.f14714d);
        }

        @Override // Ru.b
        @k
        /* renamed from: getDeeplink, reason: from getter */
        public final DeepLink getF14716a() {
            return this.f14711a;
        }

        @Override // Ru.b.c
        @k
        /* renamed from: getStatus, reason: from getter */
        public final DeeplinkHandlingResultStatus getF14715e() {
            return this.f14715e;
        }

        public final int hashCode() {
            int iHashCode = (this.f14712b.hashCode() + (this.f14711a.hashCode() * 31)) * 31;
            String str = this.f14713c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Bundle bundle = this.f14714d;
            return iHashCode2 + (bundle != null ? bundle.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnSetResult(deeplink=");
            sb2.append(this.f14711a);
            sb2.append(", result=");
            sb2.append(this.f14712b);
            sb2.append(", requestKey=");
            sb2.append(this.f14713c);
            sb2.append(", args=");
            return H.m(sb2, this.f14714d, ')');
        }
    }

    /* compiled from: DeeplinkHandlingEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRu/b$e;", "LRu/b;", "_avito_deeplinks_events_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f14716a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f14717b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f14718c;

        public e(@l Bundle bundle, @k DeepLink deepLink, @l String str) {
            this.f14716a = deepLink;
            this.f14717b = str;
            this.f14718c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f14716a, eVar.f14716a) && L.f(this.f14717b, eVar.f14717b) && L.f(this.f14718c, eVar.f14718c);
        }

        @Override // Ru.b
        @k
        /* renamed from: getDeeplink, reason: from getter */
        public final DeepLink getF14716a() {
            return this.f14716a;
        }

        public final int hashCode() {
            int iHashCode = this.f14716a.hashCode() * 31;
            String str = this.f14717b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Bundle bundle = this.f14718c;
            return iHashCode2 + (bundle != null ? bundle.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnStart(deeplink=");
            sb2.append(this.f14716a);
            sb2.append(", requestKey=");
            sb2.append(this.f14717b);
            sb2.append(", args=");
            return H.m(sb2, this.f14718c, ')');
        }
    }

    @k
    /* renamed from: getDeeplink */
    DeepLink getF14716a();
}
