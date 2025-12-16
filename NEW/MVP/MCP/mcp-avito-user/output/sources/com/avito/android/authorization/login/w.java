package com.avito.android.authorization.login;

import com.avito.android.credman.o;
import kotlin.Metadata;
import xn0.C49971a;

/* compiled from: LoginPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/credman/o$a;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/credman/o$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class w<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f94094b;

    public w(u uVar) {
        this.f94094b = uVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        LoginActivity loginActivity;
        boolean z12 = ((o.a) obj) instanceof o.a.b;
        u uVar = this.f94094b;
        if (z12 && (loginActivity = uVar.f94061A) != null) {
            C49971a.a(loginActivity);
        }
        LoginActivity loginActivity2 = uVar.f94061A;
        if (loginActivity2 != null) {
            loginActivity2.a2(-1);
        }
    }
}
