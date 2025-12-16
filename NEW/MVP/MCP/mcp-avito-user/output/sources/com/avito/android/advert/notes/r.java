package com.avito.android.advert.notes;

import com.avito.android.R;
import com.avito.android.util.L5;
import kotlin.Metadata;

/* compiled from: EditAdvertNotePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "needShowToast", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f80923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f80924c;

    public r(t tVar, String str) {
        this.f80923b = tVar;
        this.f80924c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        y yVar;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        t tVar = this.f80923b;
        if (zBooleanValue && (yVar = tVar.f80937l) != null) {
            L5.a(yVar.f80951a.getContext(), R.string.advert_details_advert_added_to_fav, 0);
        }
        t.c(tVar, this.f80924c, 2);
    }
}
