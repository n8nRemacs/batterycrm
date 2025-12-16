package com.avito.android.user_advert.advert.delegate.auto_select_close;

import Y61.l;
import android.view.View;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;

/* compiled from: AutoSelectDetailsDialogView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/auto_select_close/g;", "Landroid/view/View$OnLayoutChangeListener;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f308553b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f308554c;

    public g(f fVar, UniversalImage universalImage) {
        this.f308553b = fVar;
        this.f308554c = universalImage;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        f fVar = this.f308553b;
        if (fVar.f308547a.getWidth() > 0) {
            fVar.f308547a.removeOnLayoutChangeListener(this);
            fVar.a(this.f308554c);
        }
    }
}
