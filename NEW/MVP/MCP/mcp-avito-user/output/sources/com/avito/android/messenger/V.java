package com.avito.android.messenger;

import com.avito.android.remote.model.ProfileInfo;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: MessengerUserIdInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u00012\u000b\u0010\u0003\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/ProfileInfo;", "Lj41/e;", "prev", "cur", "", "test", "(Lcom/avito/android/remote/model/ProfileInfo;Lcom/avito/android/remote/model/ProfileInfo;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class V<T1, T2> implements l41.d {

    /* renamed from: a, reason: collision with root package name */
    public static final V<T1, T2> f186177a = new V<>();

    @Override // l41.d
    public final boolean a(Object obj, Object obj2) {
        String userHashId;
        ProfileInfo profileInfo = (ProfileInfo) obj;
        ProfileInfo profileInfo2 = (ProfileInfo) obj2;
        String userHashId2 = profileInfo.getUserHashId();
        return (userHashId2 == null || C43066x.K(userHashId2) || (userHashId = profileInfo2.getUserHashId()) == null || C43066x.K(userHashId) || !kotlin.jvm.internal.L.f(profileInfo.getUserHashId(), profileInfo2.getUserHashId())) ? false : true;
    }
}
