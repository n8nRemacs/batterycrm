package yc;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.publish.FromPage;
import com.avito.android.util.V2;
import java.util.LinkedHashMap;
import java.util.Locale;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PublishAnalyticsDataProvider.kt */
@Singleton
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc/a;", "", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yc.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50213a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f443209a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public volatile String f443210b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public volatile String f443211c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public volatile FromPage f443212d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public volatile String f443213e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public volatile Integer f443214f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public volatile String f443215g;

    public C50213a() {
        this(false, 1, null);
    }

    @k
    public final LinkedHashMap a() {
        LinkedHashMap linkedHashMapJ = P0.j(c(), new Q("from_page", this.f443212d.name().toLowerCase(Locale.ROOT)));
        String str = this.f443213e;
        if (str != null && str.length() != 0) {
            linkedHashMapJ.put("iid", this.f443213e);
        }
        return linkedHashMapJ;
    }

    @k
    public final String b() {
        if (this.f443209a) {
            this.f443211c.length();
        }
        if (this.f443211c.length() != 0) {
            return this.f443211c;
        }
        V2.f318762a.d("PublishAnalyticsDataProvider", "Read not generated Id");
        return "ERROR_NOT_GENERATED_ID";
    }

    @k
    public final Q<String, String> c() {
        return new Q<>("esid", b());
    }

    public C50213a(boolean z12) {
        this.f443209a = z12;
        this.f443210b = "";
        this.f443211c = "";
        this.f443212d = FromPage.f90272b;
    }

    public /* synthetic */ C50213a(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12);
    }
}
