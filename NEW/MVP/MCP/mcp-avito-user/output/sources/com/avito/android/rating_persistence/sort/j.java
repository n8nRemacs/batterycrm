package com.avito.android.rating_persistence.sort;

import androidx.compose.foundation.H;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: RatingSortRepository.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_persistence/sort/j;", "Lcom/avito/android/rating_persistence/sort/i;", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f249850a;

    @Inject
    public j(@Y61.k a aVar) {
        this.f249850a = aVar;
    }

    @Override // com.avito.android.rating_persistence.sort.i
    @Y61.l
    public final Object a(@Y61.k String str, @Y61.k String str2, @Y61.k Continuation<? super Boolean> continuation) {
        return this.f249850a.a(str + ':' + str2, continuation);
    }

    @Override // com.avito.android.rating_persistence.sort.i
    @Y61.l
    public final Object b(@Y61.k String str, @Y61.k String str2, @Y61.k Continuation<? super G0> continuation) {
        Object objB = this.f249850a.b(new d(H.i(':', str, str2)), continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : G0.f406611a;
    }
}
