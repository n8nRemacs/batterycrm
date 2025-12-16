package com.avito.android.account;

import Wd.InterfaceC15745b;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.remote.model.LoginResult;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AccountInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/LoginResult;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/util/P2;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.account.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27683v<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C27672j f68179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15745b.C1278b f68180c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f68181d;

    public C27683v(C27672j c27672j, InterfaceC15745b.C1278b c1278b, String str) {
        this.f68179b = c27672j;
        this.f68180c = c1278b;
        this.f68181d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        P2 p22 = (P2) obj;
        if (!(p22 instanceof P2.b)) {
            return io.reactivex.rxjava3.core.z.c0(p22);
        }
        LoginResult loginResult = (LoginResult) ((P2.b) p22).f318720a;
        if (loginResult instanceof LoginResult.Ok) {
            LoginResult.Ok ok2 = (LoginResult.Ok) loginResult;
            C27672j.g(this.f68179b, ok2.getAuthResult(), this.f68180c);
            return InterfaceC27663a.C2131a.b(this.f68179b, ok2.getAuthResult().getSession(), ok2.getAuthResult().getProfile(), null, "login", null, this.f68181d, 64).B(p22).F();
        }
        if (loginResult instanceof LoginResult.TfaCheckWithPush) {
            return io.reactivex.rxjava3.core.z.c0(p22);
        }
        if (loginResult instanceof LoginResult.FollowDeeplink) {
            return io.reactivex.rxjava3.core.z.c0(p22);
        }
        if (loginResult instanceof LoginResult.PassportBlocked) {
            return io.reactivex.rxjava3.core.z.c0(p22);
        }
        if (loginResult instanceof LoginResult.ParsingPermission) {
            return io.reactivex.rxjava3.core.z.M(new RuntimeException("Unexpected result was received: ParsingPermission"));
        }
        if (!(loginResult instanceof LoginResult.FailedWithDialog ? true : loginResult instanceof LoginResult.FailedWithMessage ? true : loginResult instanceof LoginResult.FailedWithMessages)) {
            throw new NoWhenBranchMatchedException();
        }
        return io.reactivex.rxjava3.core.z.M(new RuntimeException("Expected ok result here but was " + loginResult));
    }
}
