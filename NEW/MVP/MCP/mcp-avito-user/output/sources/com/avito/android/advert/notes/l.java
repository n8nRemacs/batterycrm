package com.avito.android.advert.notes;

import android.view.MenuItem;
import com.avito.android.R;
import com.avito.android.component.snackbar.e;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: EditAdvertNotePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f80918b;

    public l(t tVar) {
        this.f80918b = tVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        y yVar = this.f80918b.f80937l;
        if (yVar != null) {
            D6.g(yVar.f80955e);
            e.b.f125239c.getClass();
            com.avito.android.component.snackbar.h.d(yVar.f80951a, R.string.advert_details_save_note_error_was_occurred, new e.b(null, null, null), 250);
            MenuItem menuItem = yVar.f80956f;
            (menuItem != null ? menuItem : null).setEnabled(true);
            yVar.f80954d.setEnabled(true);
        }
    }
}
