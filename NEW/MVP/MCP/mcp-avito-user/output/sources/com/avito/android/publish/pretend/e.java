package com.avito.android.publish.pretend;

import Y61.k;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.util.AbstractC35806h3;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: PretendInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/pretend/e;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface e {
    @k
    I<PretendResult> a(@k Navigation navigation2, @k CategoryParameters categoryParameters);

    @k
    z<AbstractC35806h3<PretendResult>> m(@k Navigation navigation2, @k CategoryParameters categoryParameters);
}
