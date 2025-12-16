package fa;

import Y61.k;
import com.avito.android.remote.model.RawParams;
import com.avito.android.remote.model.RawParamsDeserializer;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.remote.safedeal.SafeDealReturnCheckoutDialogTypeAdapter;
import com.avito.android.remote.safedeal.SafeDealTrustFactorsComponentTypeAdapter;
import com.avito.android.util.X5;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: AdvertDetailsJsonModule_ProvideTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfa/j;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/X5;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements dagger.internal.h<Set<X5>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final j f395955a = new j();

    @Override // javax.inject.Provider
    public final Object get() {
        g.f395952a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(SafeDeal.Component.class, new SafeDealTrustFactorsComponentTypeAdapter()));
        linkedHashSet.add(new X5(SafeDeal.ReturnCheckoutDialog.class, new SafeDealReturnCheckoutDialogTypeAdapter()));
        linkedHashSet.add(new X5(RawParams.class, new RawParamsDeserializer()));
        return linkedHashSet;
    }
}
