package KL0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StickersBuyOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LKL0/b;", "", "a", "b", "c", "LKL0/b$a;", "LKL0/b$b;", "LKL0/b$c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: StickersBuyOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKL0/b$a;", "LKL0/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f9400a;

        public a(boolean z12) {
            this.f9400a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f9400a == ((a) obj).f9400a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f9400a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CloseScreen(forceFinishFlow="), this.f9400a, ')');
        }
    }

    /* compiled from: StickersBuyOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKL0/b$b;", "LKL0/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: KL0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0567b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f9401a;

        public C0567b(@k DeepLink deepLink) {
            this.f9401a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0567b) && L.f(this.f9401a, ((C0567b) obj).f9401a);
        }

        public final int hashCode() {
            return this.f9401a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f9401a, ')');
        }
    }

    /* compiled from: StickersBuyOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKL0/b$c;", "LKL0/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a f9402a;

        public c(@k com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a aVar) {
            this.f9402a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f9402a, ((c) obj).f9402a);
        }

        public final int hashCode() {
            return this.f9402a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowStickerDescription(sticker=" + this.f9402a + ')';
        }
    }
}
