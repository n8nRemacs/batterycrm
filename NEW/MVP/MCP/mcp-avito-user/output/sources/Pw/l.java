package PW;

import cX.InterfaceC27115a;
import com.avito.android.loyalty.remote.adapter.BadgeDetailsAttributedTextAdapter;
import com.avito.android.loyalty.remote.adapter.BadgeDetailsItemTypeAdapter;
import com.avito.android.loyalty.remote.adapter.BadgeDetailsUniversalImageAdapter;
import com.avito.android.loyalty.remote.adapter.QualityServiceGrayWidgetTypeAdapter;
import com.avito.android.loyalty.remote.adapter.QualityServiceItemTypeAdapter;
import com.avito.android.loyalty.remote.model.quality_service.QualityServiceWidget;
import com.avito.android.util.X5;
import dX.o;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: LoyaltyJsonModule_ProvideTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LPW/l;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/X5;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<Set<X5>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final l f13103a = new l();

    @Override // javax.inject.Provider
    public final Object get() {
        k.f13102a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(InterfaceC27115a.class, new BadgeDetailsItemTypeAdapter()));
        linkedHashSet.add(new X5(cX.f.class, new BadgeDetailsAttributedTextAdapter()));
        linkedHashSet.add(new X5(cX.d.class, new BadgeDetailsUniversalImageAdapter()));
        linkedHashSet.add(new X5(QualityServiceWidget.class, new QualityServiceItemTypeAdapter()));
        linkedHashSet.add(new X5(o.class, new QualityServiceGrayWidgetTypeAdapter()));
        return linkedHashSet;
    }
}
