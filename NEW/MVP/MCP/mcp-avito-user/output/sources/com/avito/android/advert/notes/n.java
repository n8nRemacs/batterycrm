package com.avito.android.advert.notes;

import android.view.MenuItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditAdvertNotePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f80920b;

    public n(t tVar) {
        this.f80920b = tVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str = (String) obj;
        t tVar = this.f80920b;
        y yVar = tVar.f80937l;
        if (yVar != null) {
            boolean z12 = !L.f(tVar.f80928c, str);
            MenuItem menuItem = yVar.f80956f;
            if (menuItem == null) {
                menuItem = null;
            }
            if (menuItem.isEnabled() == z12) {
                return;
            }
            MenuItem menuItem2 = yVar.f80956f;
            (menuItem2 != null ? menuItem2 : null).setEnabled(z12);
        }
    }
}
