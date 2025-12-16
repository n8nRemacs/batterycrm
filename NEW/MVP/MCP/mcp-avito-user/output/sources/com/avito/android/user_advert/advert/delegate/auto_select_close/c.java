package com.avito.android.user_advert.advert.delegate.auto_select_close;

import Y61.l;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.MyAdvertAutoSelect;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoSelectDetailsDialogFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/auto_select_close/c;", "Lcom/avito/android/user_advert/advert/delegate/auto_select_close/a;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements a {
    @Inject
    public c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.user_advert.advert.delegate.auto_select_close.a
    @Y61.k
    public final com.avito.android.lib.design.bottom_sheet.d a(@Y61.k Context context, @Y61.k MyAdvertAutoSelect.MyAdvertAutoSelectDialog myAdvertAutoSelectDialog, @l Y41.a aVar, @l Y41.a aVar2) {
        View viewInflate = View.inflate(context, R.layout.my_advert_auto_select_dialog, null);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, 0 == true ? 1 : 0);
        dVar.setContentView(viewInflate);
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, null, false, 0, 0, 0, 127);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        f fVar = new f(viewInflate);
        b bVar = new b(aVar, dVar);
        I5.a(fVar.f308548b, myAdvertAutoSelectDialog.getTitle(), false);
        I5.a(fVar.f308549c, myAdvertAutoSelectDialog.getDescription(), false);
        MyAdvertAutoSelect.MyAdvertAutoSelectButton button = myAdvertAutoSelectDialog.getButton();
        String text = button != null ? button.getText() : null;
        Button button2 = fVar.f308550d;
        com.avito.android.lib.design.button.b.a(button2, text, false);
        button2.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(10, bVar));
        UniversalImage image = myAdvertAutoSelectDialog.getImage();
        SimpleDraweeView simpleDraweeView = fVar.f308547a;
        if (simpleDraweeView.getWidth() > 0) {
            fVar.a(image);
        } else {
            simpleDraweeView.addOnLayoutChangeListener(new g(fVar, image));
        }
        dVar.setOnDismissListener(new com.avito.android.advert_item_actions.view.d(5, aVar2));
        return dVar;
    }
}
