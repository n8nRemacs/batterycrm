package com.avito.android.messenger;

import com.avito.android.remote.model.ProfileInfo;
import jz.C42450a;
import kotlin.Metadata;

/* compiled from: MessengerUserIdInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\n\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "SyncWith", "SyncResult", "Lkotlin/Q;", "Ljz/a;", "<name for destructuring parameter 0>", "", "test", "(Lkotlin/Q;)Z", "com/avito/android/messenger/e0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class Q<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f186173b;

    public Q(g0 g0Var) {
        this.f186173b = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.r
    public final boolean test(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        C42450a c42450a = (C42450a) q12.f406620c;
        ProfileInfo profileInfo = (ProfileInfo) q12.f406619b;
        this.f186173b.getClass();
        if (!c42450a.equals(C42450a.f405962e)) {
            String userId = profileInfo.getUserId();
            if (userId == null) {
                userId = "";
            }
            if (!userId.equals(c42450a.f405964b)) {
                return false;
            }
        }
        return true;
    }
}
