package NY;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context.ChatReplyTime;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChatReplyTimeState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNY/c;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ChatReplyTime f11541a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11542b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final m f11543c;

    public c(@Y61.k ChatReplyTime chatReplyTime, boolean z12, @Y61.l m mVar) {
        this.f11541a = chatReplyTime;
        this.f11542b = z12;
        this.f11543c = mVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f11541a, cVar.f11541a) && this.f11542b == cVar.f11542b && L.f(this.f11543c, cVar.f11543c);
    }

    public final int hashCode() {
        int i12 = r.i(this.f11541a.hashCode() * 31, 31, this.f11542b);
        m mVar = this.f11543c;
        return i12 + (mVar == null ? 0 : mVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ChatReplyTimeState(replyTime=" + this.f11541a + ", canCall=" + this.f11542b + ", placeholder=" + this.f11543c + ')';
    }

    public /* synthetic */ c(ChatReplyTime chatReplyTime, boolean z12, m mVar, int i12, C42822w c42822w) {
        this(chatReplyTime, z12, (i12 & 4) != 0 ? null : mVar);
    }
}
