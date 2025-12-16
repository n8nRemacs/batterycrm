package b80;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PublishImageContentStyle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb80/c;", "", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f56943a;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f56943a, ((c) obj).f56943a);
    }

    public final int hashCode() {
        String str = this.f56943a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("PublishImageContentStyle(labelBackgroundColor="), this.f56943a, ')');
    }

    public c(@l String str) {
        this.f56943a = str;
    }

    public /* synthetic */ c(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str);
    }
}
