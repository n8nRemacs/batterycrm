package Ru;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_events.events.DeeplinkParsingFailReason;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeeplinkParsingEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LRu/d;", "LRu/a;", "a", "b", "c", "d", "LRu/d$b;", "LRu/d$c;", "_avito_deeplinks_events_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface d extends InterfaceC15081a {

    /* compiled from: DeeplinkParsingEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LRu/d$b;", "LRu/d;", "LRu/d$a;", "LRu/d$d;", "_avito_deeplinks_events_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends d {
    }

    /* compiled from: DeeplinkParsingEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRu/d$c;", "LRu/d;", "_avito_deeplinks_events_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f14722a;

        public c(@k Uri uri) {
            this.f14722a = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f14722a, ((c) obj).f14722a);
        }

        public final int hashCode() {
            return this.f14722a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("OnStart(uri="), this.f14722a, ')');
        }
    }

    @k
    /* renamed from: getUri */
    Uri getF14723a();

    /* compiled from: DeeplinkParsingEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRu/d$a;", "LRu/d$b;", "_avito_deeplinks_events_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f14719a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeeplinkParsingFailReason f14720b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f14721c;

        public a(@k Uri uri, @k DeeplinkParsingFailReason deeplinkParsingFailReason, @l Throwable th2) {
            this.f14719a = uri;
            this.f14720b = deeplinkParsingFailReason;
            this.f14721c = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f14719a, aVar.f14719a) && this.f14720b == aVar.f14720b && L.f(this.f14721c, aVar.f14721c);
        }

        @Override // Ru.d
        @k
        /* renamed from: getUri, reason: from getter */
        public final Uri getF14723a() {
            return this.f14719a;
        }

        public final int hashCode() {
            int iHashCode = (this.f14720b.hashCode() + (this.f14719a.hashCode() * 31)) * 31;
            Throwable th2 = this.f14721c;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnFailure(uri=");
            sb2.append(this.f14719a);
            sb2.append(", reason=");
            sb2.append(this.f14720b);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f14721c, ')');
        }

        public /* synthetic */ a(Uri uri, DeeplinkParsingFailReason deeplinkParsingFailReason, Throwable th2, int i12, C42822w c42822w) {
            this(uri, deeplinkParsingFailReason, (i12 & 4) != 0 ? null : th2);
        }
    }

    /* compiled from: DeeplinkParsingEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRu/d$d;", "LRu/d$b;", "_avito_deeplinks_events_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ru.d$d, reason: collision with other inner class name */
    public static final /* data */ class C0991d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f14723a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f14724b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f14725c;

        public C0991d(@k Uri uri, @k DeepLink deepLink, boolean z12) {
            this.f14723a = uri;
            this.f14724b = deepLink;
            this.f14725c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0991d)) {
                return false;
            }
            C0991d c0991d = (C0991d) obj;
            return L.f(this.f14723a, c0991d.f14723a) && L.f(this.f14724b, c0991d.f14724b) && this.f14725c == c0991d.f14725c;
        }

        @Override // Ru.d
        @k
        /* renamed from: getUri, reason: from getter */
        public final Uri getF14723a() {
            return this.f14723a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14725c) + com.avito.android.actions_sheet.a.e(this.f14724b, this.f14723a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnSuccessful(uri=");
            sb2.append(this.f14723a);
            sb2.append(", deeplink=");
            sb2.append(this.f14724b);
            sb2.append(", isDynamic=");
            return r.x(sb2, this.f14725c, ')');
        }

        public /* synthetic */ C0991d(Uri uri, DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
            this(uri, deepLink, (i12 & 4) != 0 ? false : z12);
        }
    }
}
