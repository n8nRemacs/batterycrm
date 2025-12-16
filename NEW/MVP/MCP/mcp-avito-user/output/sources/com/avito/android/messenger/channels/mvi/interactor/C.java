package com.avito.android.messenger.channels.mvi.interactor;

import com.avito.android.persistence.messenger.Z;
import kotlin.Metadata;

/* compiled from: LocallyDeletedChannelsInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u00012\u000b\u0010\u0003\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/persistence/messenger/Z;", "Lj41/e;", "prev", "new", "", "test", "(Lcom/avito/android/persistence/messenger/Z;Lcom/avito/android/persistence/messenger/Z;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class C<T1, T2> implements l41.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C<T1, T2> f187623a = new C<>();

    @Override // l41.d
    public final boolean a(Object obj, Object obj2) {
        Long l12;
        Z z12 = (Z) obj2;
        Long l13 = ((Z) obj).f215385e;
        return (l13 == null || (l12 = z12.f215385e) == null || l13.longValue() < l12.longValue()) ? false : true;
    }
}
