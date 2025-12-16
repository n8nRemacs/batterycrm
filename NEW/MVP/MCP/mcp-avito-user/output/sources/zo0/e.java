package ZO0;

import android.content.Intent;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPageOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LZO0/e;", "", "a", "b", "c", "d", "LZO0/e$a;", "LZO0/e$b;", "LZO0/e$c;", "LZO0/e$d;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface e {

    /* compiled from: WalletPageOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZO0/e$a;", "LZO0/e;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f20133a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 170358753;
        }

        @Y61.k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: WalletPageOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZO0/e$b;", "LZO0/e;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AttributedText f20134a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.component.toast.f f20135b;

        public b(@Y61.l AttributedText attributedText, @Y61.k com.avito.android.component.toast.f fVar) {
            this.f20134a = attributedText;
            this.f20135b = fVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f20134a, bVar.f20134a) && L.f(this.f20135b, bVar.f20135b);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f20134a;
            return this.f20135b.hashCode() + ((attributedText == null ? 0 : attributedText.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ShowToast(toastText=" + this.f20134a + ", toastType=" + this.f20135b + ')';
        }
    }

    /* compiled from: WalletPageOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZO0/e$c;", "LZO0/e;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Intent f20136a;

        public c(@Y61.k Intent intent) {
            this.f20136a = intent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f20136a, ((c) obj).f20136a);
        }

        public final int hashCode() {
            return this.f20136a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "StartActivity(intent=" + this.f20136a + ')';
        }
    }

    /* compiled from: WalletPageOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZO0/e$d;", "LZO0/e;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Intent f20137a;

        public d(@Y61.k Intent intent) {
            this.f20137a = intent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f20137a, ((d) obj).f20137a);
        }

        public final int hashCode() {
            return this.f20137a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "StartActivityForResult(intent=" + this.f20137a + ')';
        }
    }
}
