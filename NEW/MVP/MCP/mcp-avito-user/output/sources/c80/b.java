package C80;

import Y61.l;
import com.avito.android.rec.ScreenSource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: PlayerEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC80/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f1983b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f1984c;

    public b(@Y61.k String str, @Y61.k ScreenSource screenSource, @l String str2, @l String str3, @l String str4, @l String str5, int i12, int i13, @l String str6, @l String str7, @l Integer num, @l Integer num2) {
        this.f1983b = new com.avito.android.analytics.provider.clickstream.b(i12, i13);
        LinkedHashMap linkedHashMapJ = P0.j(new Q("media_name", str), new Q("from_source", screenSource.f251773b));
        if (str2 != null) {
            linkedHashMapJ.put("block_type", str2);
        }
        if (str3 != null) {
            linkedHashMapJ.put("slug", str3);
        }
        if (str4 != null) {
            linkedHashMapJ.put("media_session", str4);
        }
        if (str5 != null) {
            linkedHashMapJ.put("uid", str5);
        }
        if (str6 != null) {
            linkedHashMapJ.put("iid", str6);
        }
        if (str7 != null) {
            linkedHashMapJ.put("categoryid", str7);
        }
        if (num != null) {
            linkedHashMapJ.put("viewed_duration", num);
        }
        if (num2 != null) {
            linkedHashMapJ.put("video_duration", num2);
        }
        this.f1984c = linkedHashMapJ;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90262b() {
        return this.f1983b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f1984c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90263c() {
        return this.f1983b.f90263c;
    }

    public /* synthetic */ b(String str, ScreenSource screenSource, String str2, String str3, String str4, String str5, int i12, int i13, String str6, String str7, Integer num, Integer num2, int i14, C42822w c42822w) {
        this(str, screenSource, str2, str3, str4, str5, i12, i13, (i14 & 256) != 0 ? null : str6, (i14 & 512) != 0 ? null : str7, (i14 & 1024) != 0 ? null : num, (i14 & 2048) != 0 ? null : num2);
    }
}
