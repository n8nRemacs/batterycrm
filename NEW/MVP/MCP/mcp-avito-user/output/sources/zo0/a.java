package ZO0;

import androidx.compose.runtime.C22026a;
import com.avito.android.wallet.page.mvi.entity.WalletInfoUnavailableButtonAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPageViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZO0/a;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f20115a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final WalletInfoUnavailableButtonAction f20116b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f20117c;

    public a(@Y61.k String str, @Y61.k WalletInfoUnavailableButtonAction walletInfoUnavailableButtonAction, @Y61.k String str2) {
        this.f20115a = str;
        this.f20116b = walletInfoUnavailableButtonAction;
        this.f20117c = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f20115a, aVar.f20115a) && this.f20116b == aVar.f20116b && L.f(this.f20117c, aVar.f20117c);
    }

    public final int hashCode() {
        return this.f20117c.hashCode() + ((this.f20116b.hashCode() + (this.f20115a.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletInfoUnavailableButton(text=");
        sb2.append(this.f20115a);
        sb2.append(", action=");
        sb2.append(this.f20116b);
        sb2.append(", style=");
        return C22026a.c(sb2, this.f20117c, ')');
    }
}
