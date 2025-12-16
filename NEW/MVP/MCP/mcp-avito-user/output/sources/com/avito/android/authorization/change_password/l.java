package com.avito.android.authorization.change_password;

import com.avito.android.password_tip.PasswordTipInput;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: ChangeResettedPasswordPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class l extends N implements Y41.l<Map<String, ? extends String>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f93356l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar) {
        super(1);
        this.f93356l = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Map<String, ? extends String> map) {
        s sVar;
        Map<String, ? extends String> map2 = map;
        m mVar = this.f93356l;
        mVar.f93366k = map2;
        String str = (String) C42745f0.F(map2.values());
        if (str != null && (sVar = mVar.f93360e) != null) {
            PasswordTipInput passwordTipInput = sVar.f93379d;
            passwordTipInput.d(str);
            passwordTipInput.e();
        }
        return G0.f406611a;
    }
}
