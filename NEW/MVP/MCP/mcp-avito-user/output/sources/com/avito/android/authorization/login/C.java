package com.avito.android.authorization.login;

import Ju.InterfaceC14249c;
import android.os.Parcelable;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kv.C43501a;

/* compiled from: LoginPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class C<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f93957b;

    public C(u uVar) {
        this.f93957b = uVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        LoginActivity loginActivity;
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        G0 g02 = null;
        CodeCheckLink.b.C3493b c3493b = interfaceC14249c instanceof CodeCheckLink.b.C3493b ? (CodeCheckLink.b.C3493b) interfaceC14249c : null;
        Parcelable parcelable = c3493b != null ? c3493b.f119267b : null;
        ConfirmedCodeInfo confirmedCodeInfo = parcelable instanceof ConfirmedCodeInfo ? (ConfirmedCodeInfo) parcelable : null;
        u uVar = this.f93957b;
        if (confirmedCodeInfo == null) {
            if (!(interfaceC14249c instanceof CodeCheckLink.b.a) || (loginActivity = uVar.f94061A) == null) {
                return;
            }
            loginActivity.b2(false);
            return;
        }
        DeepLink deepLink = confirmedCodeInfo.f119578e;
        if (deepLink == null) {
            LoginActivity loginActivity2 = uVar.f94061A;
            if (loginActivity2 != null) {
                loginActivity2.a2(-1);
                return;
            }
            return;
        }
        if (uVar.f94061A != null) {
            uVar.j(deepLink);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            uVar.f94062B = deepLink;
        }
    }
}
