package com.avito.android.early_access_advert;

import Y61.k;
import androidx.core.os.C22777e;
import com.avito.android.remote.model.early_access_advert.EarlyAccessAdvert;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: EarlyAccessAdvertDialogFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/early_access_advert/e;", "Lcom/avito/android/early_access_advert/d;", "<init>", "()V", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    @Override // com.avito.android.early_access_advert.d
    @k
    public final EarlyAccessAdvertBottomSheet a(@k String str, @k EarlyAccessAdvert earlyAccessAdvert) {
        EarlyAccessAdvertBottomSheet.f145585l0.getClass();
        EarlyAccessAdvertBottomSheet earlyAccessAdvertBottomSheet = new EarlyAccessAdvertBottomSheet();
        earlyAccessAdvertBottomSheet.setArguments(C22777e.b(new Q("advert_id", str), new Q("early_access_advert_key", earlyAccessAdvert)));
        return earlyAccessAdvertBottomSheet;
    }
}
