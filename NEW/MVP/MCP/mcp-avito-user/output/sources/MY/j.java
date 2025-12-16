package MY;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DTOs.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/j;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final T1.d.b f10763a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LocalMessage f10764b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f10765c;

    public j(@Y61.k T1.d.b bVar, @Y61.k LocalMessage localMessage, @Y61.k String str) {
        this.f10763a = bVar;
        this.f10764b = localMessage;
        this.f10765c = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f10763a, jVar.f10763a) && L.f(this.f10764b, jVar.f10764b) && L.f(this.f10765c, jVar.f10765c);
    }

    public final int hashCode() {
        return this.f10765c.hashCode() + ((this.f10764b.hashCode() + (this.f10763a.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LinkMenuData(bodyOrBubble=");
        sb2.append(this.f10763a);
        sb2.append(", localMessage=");
        sb2.append(this.f10764b);
        sb2.append(", url=");
        return C22026a.c(sb2, this.f10765c, ')');
    }
}
