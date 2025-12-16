package com.avito.android.rating_persistence.aspects;

import com.avito.android.account.E;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;

/* compiled from: RatingAspectsInteractorImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_persistence/aspects/f;", "Lcom/avito/android/rating_persistence/aspects/e;", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f249790a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f249791b;

    @Inject
    public f(@Y61.k i iVar, @Y61.k E e12) {
        this.f249790a = iVar;
        this.f249791b = e12;
    }

    @Override // com.avito.android.rating_persistence.aspects.e
    @Y61.l
    public final Object a(@Y61.k String str, @Y61.k Continuation<? super G0> continuation) {
        String strA = this.f249791b.a();
        if (strA == null) {
            return G0.f406611a;
        }
        Object objA = this.f249790a.a(strA, str, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }

    @Override // com.avito.android.rating_persistence.aspects.e
    @Y61.l
    public final Object b(@Y61.k String str, @Y61.k Continuation<? super Boolean> continuation) {
        String strA = this.f249791b.a();
        return strA == null ? Boxing.boxBoolean(true) : this.f249790a.b(strA, str, continuation);
    }
}
