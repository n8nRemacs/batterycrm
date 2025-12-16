package com.avito.android.authorization.auth;

import com.avito.android.authorization.auth.g0;
import com.avito.android.authorization.gorelkin.ParsingPermissionFormContent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SocialProceedResult;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AuthPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/SocialProceedResult;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class O<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f92868b;

    public O(A a12) {
        this.f92868b = a12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AuthFragment authFragment;
        P2 p22 = (P2) obj;
        A a12 = this.f92868b;
        a12.getClass();
        if (!(p22 instanceof P2.b)) {
            if (!(p22 instanceof P2.a)) {
                kotlin.jvm.internal.L.f(p22, P2.c.f318721a);
                return;
            }
            h0 h0Var = a12.f92787p;
            if (h0Var != null) {
                P2.a aVar = (P2.a) p22;
                g0.a.a(h0Var, a12.f92777f.b(aVar.f318719a), aVar.f318719a, null, 4);
                return;
            }
            return;
        }
        SocialProceedResult socialProceedResult = (SocialProceedResult) ((P2.b) p22).f318720a;
        if (socialProceedResult instanceof SocialProceedResult.Ok) {
            a12.f92794w = true;
            a12.f92771A = true;
            DeepLink postAuthAction = ((SocialProceedResult.Ok) socialProceedResult).getAuthResult().getPostAuthAction();
            if (postAuthAction != null) {
                a12.f92795x = postAuthAction;
            }
            a12.j();
            return;
        }
        if (socialProceedResult instanceof SocialProceedResult.ErrorDialog) {
            a12.f92785n.b(a12.f92779h.g(((SocialProceedResult.ErrorDialog) socialProceedResult).getUserDialog()).m(new M(a12)));
            return;
        }
        if (!(socialProceedResult instanceof SocialProceedResult.ParsingPermission) || (authFragment = a12.f92788q) == null) {
            return;
        }
        SocialProceedResult.ParsingPermission parsingPermission = (SocialProceedResult.ParsingPermission) socialProceedResult;
        String name = parsingPermission.getName();
        List<String> phones = parsingPermission.getPhones();
        authFragment.J5(new ParsingPermissionFormContent(name, phones != null ? (String) C42745f0.G(phones) : null));
    }
}
