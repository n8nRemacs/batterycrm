package com.avito.android.extended_profile_image_edit;

import android.animation.ValueAnimator;
import com.avito.android.krop.KropView;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import vA.InterfaceC49183a;

/* compiled from: BannerImageEditView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_image_edit/m;", "Lcom/avito/android/krop/KropView$a;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements KropView.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f151029a;

    public m(q qVar) {
        this.f151029a = qVar;
    }

    @Override // com.avito.android.krop.KropView.a
    public final void a() {
        q qVar = this.f151029a;
        qVar.f151126q.cancel();
        if (!qVar.f151128s) {
            int iD2 = C35835l0.d(qVar.f151125p, qVar.f151114e);
            qVar.f151122m.setBackgroundColor(iD2);
            qVar.f151117h.setBackgroundColor(iD2);
            qVar.f151118i.setBackgroundColor(iD2);
            qVar.f151128s = true;
        }
        ValueAnimator valueAnimator = qVar.f151126q;
        valueAnimator.setStartDelay(1000L);
        valueAnimator.start();
        qVar.f151111b.accept(new InterfaceC49183a.c(new l(qVar)));
    }
}
