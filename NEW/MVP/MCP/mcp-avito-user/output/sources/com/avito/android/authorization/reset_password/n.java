package com.avito.android.authorization.reset_password;

import com.avito.android.R;
import com.avito.android.analytics.screens.utils.D;
import io.reactivex.rxjava3.internal.operators.single.C42016n;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: ResetPasswordPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f94187b;

    public n(s sVar) {
        this.f94187b = sVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        B b12;
        s sVar = this.f94187b;
        if (!C43066x.K(sVar.f94203l)) {
            sVar.f94201j.b(D.a(new C42016n(sVar.f94192a.a(sVar.f94203l).s(sVar.f94193b.e()).j(new p(sVar)), new l(sVar, 0)), sVar.f94196e, null, new q(sVar), new r(sVar), 18));
        } else {
            if (!C43066x.K(sVar.f94203l) || (b12 = sVar.f94199h) == null) {
                return;
            }
            b12.c(sVar.f94195d.getF15141a().getString(R.string.empty_input_error));
        }
    }
}
