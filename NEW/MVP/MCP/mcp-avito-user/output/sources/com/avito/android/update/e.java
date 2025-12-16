package com.avito.android.update;

import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: UpdateApplicationPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f306646b;

    public e(f fVar) {
        this.f306646b = fVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        i iVar = this.f306646b.f306647a;
        if (iVar != null) {
            com.avito.android.component.snackbar.h.d(iVar.f306651a, R.string.no_application_installed_to_perform_this_action, null, 254);
        }
    }
}
