package com.avito.android.authorization.reset_password;

import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import kotlin.Metadata;

/* compiled from: ResetPasswordPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f94189b;

    public p(s sVar) {
        this.f94189b = sVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        B b12 = this.f94189b.f94199h;
        if (b12 != null) {
            K2.d(b12.f94099b, true);
            D6.h(b12.f94100c);
            Button button = b12.f94102e;
            button.setClickable(false);
            button.setLoading(true);
            b12.f94101d.k();
        }
    }
}
