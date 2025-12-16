package com.avito.android.user_advert.advert.delegate.auto_select_close;

import Y61.l;
import com.avito.android.remote.model.MyAdvertAutoSelect;
import com.avito.android.remote.model.my_advert.CloseReason;
import com.avito.android.user_advert.advert.delegate.auto_select_close.i;
import fH0.AbstractC40291a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: AutoSelectDialogPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/auto_select_close/j;", "Lcom/avito/android/user_advert/advert/delegate/auto_select_close/h;", "LfH0/a;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends AbstractC40291a implements h {

    /* renamed from: d, reason: collision with root package name */
    @l
    public MyAdvertAutoSelect.MyAdvertAutoSelectDialog f308558d;

    @Inject
    public j() {
    }

    @Override // com.avito.android.user_advert.advert.delegate.auto_select_close.h
    public final boolean H(@Y61.k CloseReason closeReason, @l String str) {
        MyAdvertAutoSelect.MyAdvertAutoSelectDialog myAdvertAutoSelectDialog;
        String description;
        if (!L.f(closeReason.getShowInput(), Boolean.TRUE) || (myAdvertAutoSelectDialog = this.f308558d) == null) {
            return false;
        }
        String title = myAdvertAutoSelectDialog.getTitle();
        if ((title == null || C43066x.K(title)) && (((description = myAdvertAutoSelectDialog.getDescription()) == null || C43066x.K(description)) && (myAdvertAutoSelectDialog.getButton() == null || myAdvertAutoSelectDialog.getImage() == null))) {
            return false;
        }
        this.f395801b.accept(new i.a(myAdvertAutoSelectDialog, closeReason, str));
        return true;
    }

    @Override // com.avito.android.user_advert.advert.delegate.auto_select_close.h
    public final void x(@l MyAdvertAutoSelect myAdvertAutoSelect) {
        this.f308558d = myAdvertAutoSelect != null ? myAdvertAutoSelect.getCloseDialog() : null;
    }
}
