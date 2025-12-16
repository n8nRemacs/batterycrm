package com.avito.android.async_phone;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: LegacyAsyncPhoneInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class w<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final w<T, R> f92294b = new w<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return new P2.b((DeepLink) obj);
    }
}
