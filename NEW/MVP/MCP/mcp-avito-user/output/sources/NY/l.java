package NY;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import arrow.core.Y0;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;

/* compiled from: PaginationData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNY/l;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<Q<LocalMessage, Q1>> f11582a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y0<Boolean> f11583b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Map<String, VideoInfo> f11584c;

    public l(@Y61.k List<Q<LocalMessage, Q1>> list, @Y61.k Y0<Boolean> y02, @Y61.k Map<String, VideoInfo> map) {
        this.f11582a = list;
        this.f11583b = y02;
        this.f11584c = map;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f11582a, lVar.f11582a) && L.f(this.f11583b, lVar.f11583b) && L.f(this.f11584c, lVar.f11584c);
    }

    public final int hashCode() {
        return this.f11584c.hashCode() + ((this.f11583b.hashCode() + (this.f11582a.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaginationDataWithVideoInfo(messagesAndMetaInfo=");
        sb2.append(this.f11582a);
        sb2.append(", hasMorePagesOption=");
        sb2.append(this.f11583b);
        sb2.append(", videoInfoById=");
        return r.w(sb2, this.f11584c, ')');
    }
}
