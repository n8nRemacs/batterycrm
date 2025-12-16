package com.avito.android.account;

import Wd.InterfaceC15745b;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.account.X;
import com.avito.android.remote.model.SocialAuthResult;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AccountInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/SocialAuthResult;", "loadingState", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/util/P2;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.account.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27668f<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C27672j f68127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15745b.C1278b f68128c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X.b f68129d;

    public C27668f(C27672j c27672j, InterfaceC15745b.C1278b c1278b, X.b bVar) {
        this.f68127b = c27672j;
        this.f68128c = c1278b;
        this.f68129d = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        P2 p22 = (P2) obj;
        if (!(p22 instanceof P2.b)) {
            return io.reactivex.rxjava3.core.z.c0(p22);
        }
        SocialAuthResult socialAuthResult = (SocialAuthResult) ((P2.b) p22).f318720a;
        if (socialAuthResult instanceof SocialAuthResult.Ok) {
            SocialAuthResult.Ok ok2 = (SocialAuthResult.Ok) socialAuthResult;
            C27672j.g(this.f68127b, ok2.getAuthResult(), this.f68128c);
            return InterfaceC27663a.C2131a.b(this.f68127b, ok2.getAuthResult().getSession(), ok2.getAuthResult().getProfile(), this.f68129d.f68088a, null, null, null, 120).B(p22).F();
        }
        if (socialAuthResult instanceof SocialAuthResult.TfaCheckWithPush ? true : socialAuthResult instanceof SocialAuthResult.ParsingPermission ? true : socialAuthResult instanceof SocialAuthResult.NeedPhoneVerification ? true : socialAuthResult instanceof SocialAuthResult.FollowDeeplink ? true : socialAuthResult instanceof SocialAuthResult.DuplicatedPD ? true : socialAuthResult instanceof SocialAuthResult.PassportBlocked) {
            return io.reactivex.rxjava3.core.z.c0(p22);
        }
        if (socialAuthResult instanceof SocialAuthResult.BlockedAccount ? true : socialAuthResult instanceof SocialAuthResult.FailedWithDialog ? true : socialAuthResult instanceof SocialAuthResult.WrongSocialUser) {
            throw new IllegalStateException("Not supposed to get here");
        }
        throw new NoWhenBranchMatchedException();
    }
}
