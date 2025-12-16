package UO0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Target.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LUO0/b;", "", "<init>", "()V", "a", "b", "LUO0/b$a;", "LUO0/b$b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class b {

    /* compiled from: Target.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LUO0/b$a;", "LUO0/b;", "", "id", "service", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends b {

        @com.google.gson.annotations.c("id")
        @k
        private final String id;

        @com.google.gson.annotations.c("service")
        @k
        private final String service;

        @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
        @l
        private final DeepLink url;

        public a(@k String str, @k String str2, @l DeepLink deepLink) {
            super(null);
            this.id = str;
            this.service = str2;
            this.url = deepLink;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getService() {
            return this.service;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final DeepLink getUrl() {
            return this.url;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.id, aVar.id) && L.f(this.service, aVar.service) && L.f(this.url, aVar.url);
        }

        public final int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.service);
            DeepLink deepLink = this.url;
            return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Advert(id=");
            sb2.append(this.id);
            sb2.append(", service=");
            sb2.append(this.service);
            sb2.append(", url=");
            return com.avito.android.actions_sheet.a.v(sb2, this.url, ')');
        }
    }

    /* compiled from: Target.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LUO0/b$b;", "LUO0/b;", "", "title", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: UO0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1122b extends b {

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        public C1122b(@k String str) {
            super(null);
            this.title = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1122b) && L.f(this.title, ((C1122b) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Base(title="), this.title, ')');
        }
    }

    public /* synthetic */ b(C42822w c42822w) {
        this();
    }

    private b() {
    }
}
