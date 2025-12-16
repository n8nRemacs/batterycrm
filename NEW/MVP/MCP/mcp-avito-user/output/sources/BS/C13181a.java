package Bs;

import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FloatingViewActionTextClickEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBs/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bs.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13181a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f1733b = new com.avito.android.analytics.provider.clickstream.b(14181, 3);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final kotlin.collections.builders.d f1734c;

    public C13181a(@l String str, @k String str2, @l String str3) {
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        dVar.put("item_id", str2);
        if (str != null) {
            dVar.put("from_page", str);
        }
        if (str3 != null) {
            dVar.put("installments_plan", str3);
        }
        this.f1734c = dVar.b();
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f1733b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f1734c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f1733b.f90263c;
    }
}
