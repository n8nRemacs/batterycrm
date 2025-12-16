package G20;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiMessageSendUiState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG20/a;", "", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f6225a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6226b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f6227c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6228d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6229e;

    public a(int i12, @k String str, boolean z12, boolean z13, boolean z14) {
        this.f6225a = i12;
        this.f6226b = z12;
        this.f6227c = str;
        this.f6228d = z13;
        this.f6229e = z14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6225a == aVar.f6225a && this.f6226b == aVar.f6226b && L.f(this.f6227c, aVar.f6227c) && this.f6228d == aVar.f6228d && this.f6229e == aVar.f6229e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6229e) + r.i(H.d(r.i(Integer.hashCode(this.f6225a) * 31, 31, this.f6226b), 31, this.f6227c), 31, this.f6228d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputState(itemsCount=");
        sb2.append(this.f6225a);
        sb2.append(", isActive=");
        sb2.append(this.f6226b);
        sb2.append(", inputText=");
        sb2.append(this.f6227c);
        sb2.append(", isSendingInProgress=");
        sb2.append(this.f6228d);
        sb2.append(", isMaxItemsTextVisible=");
        return r.x(sb2, this.f6229e, ')');
    }
}
