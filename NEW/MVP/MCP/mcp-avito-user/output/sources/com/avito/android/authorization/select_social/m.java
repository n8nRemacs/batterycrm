package com.avito.android.authorization.select_social;

import Ju.InterfaceC14249c;
import android.os.Parcelable;
import com.avito.android.R;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import kotlin.G0;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: SelectSocialPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f94543b;

    public m(n nVar) {
        this.f94543b = nVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        G0 g02 = null;
        CodeCheckLink.b.C3493b c3493b = interfaceC14249c instanceof CodeCheckLink.b.C3493b ? (CodeCheckLink.b.C3493b) interfaceC14249c : null;
        Parcelable parcelable = c3493b != null ? c3493b.f119267b : null;
        ConfirmedCodeInfo confirmedCodeInfo = parcelable instanceof ConfirmedCodeInfo ? (ConfirmedCodeInfo) parcelable : null;
        n nVar = this.f94543b;
        if (confirmedCodeInfo != null) {
            SelectSocialActivity selectSocialActivity = nVar.f94554k;
            if (selectSocialActivity != null) {
                selectSocialActivity.a2();
                g02 = G0.f406611a;
            }
            if (g02 != null) {
                return;
            }
        }
        s sVar = nVar.f94553j;
        if (sVar != null) {
            sVar.b(com.avito.android.printable_text.b.f(nVar.f94549f.getF15141a().getString(R.string.social_error_authentication)));
            G0 g03 = G0.f406611a;
        }
    }
}
