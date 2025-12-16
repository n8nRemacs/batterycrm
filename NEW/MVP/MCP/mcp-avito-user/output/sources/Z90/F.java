package z90;

import com.avito.android.profile.pro.impl.generated.api.profile_tab_v_1.PassportComponentV2ProfilesItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ProfileTabV1Response.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lz90/F;", "", "", "count", "", "Lcom/avito/android/profile/pro/impl/generated/api/profile_tab_v_1/PassportComponentV2ProfilesItem;", "profiles", "<init>", "(JLjava/util/List;)V", "J", "a", "()J", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class F {

    @com.google.gson.annotations.c("count")
    private final long count;

    @com.google.gson.annotations.c("profiles")
    @Y61.k
    private final List<PassportComponentV2ProfilesItem> profiles;

    public F(long j12, @Y61.k List<PassportComponentV2ProfilesItem> list) {
        this.count = j12;
        this.profiles = list;
    }

    /* renamed from: a, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    @Y61.k
    public final List<PassportComponentV2ProfilesItem> b() {
        return this.profiles;
    }
}
