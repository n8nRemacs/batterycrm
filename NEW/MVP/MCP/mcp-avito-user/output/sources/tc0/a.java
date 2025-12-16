package TC0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: EditPackageMicroCategoryItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTC0/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f15502b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f15503c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f15504d;

    public a(@k String str, @k String str2, @l String str3) {
        this.f15502b = str;
        this.f15503c = str2;
        this.f15504d = str3;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF15502b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF15502b() {
        return this.f15502b;
    }
}
