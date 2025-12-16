package MY;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DTOs.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/m;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<Image> f10814a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10815b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f10816c;

    public m(int i12, @Y61.k String str, @Y61.k List list) {
        this.f10814a = list;
        this.f10815b = i12;
        this.f10816c = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f10814a, mVar.f10814a) && this.f10815b == mVar.f10815b && L.f(this.f10816c, mVar.f10816c);
    }

    public final int hashCode() {
        return this.f10816c.hashCode() + r.e(this.f10815b, this.f10814a.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OpenGalleryData(images=");
        sb2.append(this.f10814a);
        sb2.append(", position=");
        sb2.append(this.f10815b);
        sb2.append(", channelId=");
        return C22026a.c(sb2, this.f10816c, ')');
    }

    public /* synthetic */ m(List list, int i12, String str, int i13, C42822w c42822w) {
        this((i13 & 2) != 0 ? 0 : i12, str, list);
    }
}
