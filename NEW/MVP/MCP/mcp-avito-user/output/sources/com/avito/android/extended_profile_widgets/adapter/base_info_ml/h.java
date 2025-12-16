package com.avito.android.extended_profile_widgets.adapter.base_info_ml;

import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BaseInfoMlItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/base_info_ml/h;", "Lcom/avito/android/extended_profile_widgets/adapter/base_info_ml/c;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<oB.k, G0> f154270b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k Y41.l<? super oB.k, G0> lVar) {
        this.f154270b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r9, TV0.a r10, int r11) {
        /*
            r8 = this;
            com.avito.android.extended_profile_widgets.adapter.base_info_ml.j r9 = (com.avito.android.extended_profile_widgets.adapter.base_info_ml.j) r9
            com.avito.android.extended_profile_widgets.adapter.base_info_ml.BaseInfoMlItem r10 = (com.avito.android.extended_profile_widgets.adapter.base_info_ml.BaseInfoMlItem) r10
            java.lang.String r11 = r10.f154250e
            r9.G8(r11)
            r11 = 0
            com.avito.android.remote.model.ProfileRating r0 = r10.f154253h
            if (r0 == 0) goto L13
            com.avito.android.remote.model.ProfileRatingAction r1 = r0.getAction()
            goto L14
        L13:
            r1 = r11
        L14:
            r2 = 0
            if (r0 == 0) goto L22
            java.lang.Boolean r3 = r0.getHideStars()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.L.f(r3, r4)
            goto L23
        L22:
            r3 = r2
        L23:
            if (r3 == 0) goto L27
        L25:
            r3 = r11
            goto L39
        L27:
            if (r0 == 0) goto L2f
            java.lang.Float r3 = r0.getScoreFloat()
            if (r3 != 0) goto L39
        L2f:
            if (r0 == 0) goto L25
            float r0 = r0.getScore()
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
        L39:
            if (r1 == 0) goto L40
            java.lang.String r0 = r1.getTitle()
            goto L41
        L40:
            r0 = r11
        L41:
            java.lang.String r4 = "text"
            r5 = 1
            if (r1 == 0) goto L50
            java.lang.String r6 = r1.getType()
            boolean r6 = kotlin.jvm.internal.L.f(r6, r4)
            r6 = r6 ^ r5
            goto L51
        L50:
            r6 = r2
        L51:
            if (r1 == 0) goto L5f
            java.lang.String r7 = r1.getType()
            boolean r4 = kotlin.jvm.internal.L.f(r7, r4)
            r4 = r4 ^ r5
            if (r4 != r5) goto L5f
            r2 = r5
        L5f:
            if (r2 == 0) goto L66
            com.avito.android.extended_profile_widgets.adapter.base_info_ml.d r11 = new com.avito.android.extended_profile_widgets.adapter.base_info_ml.d
            r11.<init>(r8, r1, r10)
        L66:
            r9.X6(r3, r0, r6, r11)
            java.lang.String r11 = r10.f154251f
            r9.n6(r11)
            com.avito.android.remote.model.Image r11 = r10.f154252g
            com.avito.android.image_loader.a r11 = com.avito.android.image_loader.b.b(r11)
            com.avito.android.extended_profile_widgets.adapter.base_info_ml.e r0 = new com.avito.android.extended_profile_widgets.adapter.base_info_ml.e
            r0.<init>(r8, r10)
            r9.AR(r11, r0)
            com.avito.android.extended_profile_widgets.adapter.base_info_ml.f r11 = new com.avito.android.extended_profile_widgets.adapter.base_info_ml.f
            r11.<init>(r8)
            com.avito.android.extended_profile_widgets.adapter.base_info_ml.g r0 = new com.avito.android.extended_profile_widgets.adapter.base_info_ml.g
            r0.<init>(r8)
            java.util.List<com.avito.android.remote.model.ExtendedProfileBaseInfoMl$Action> r1 = r10.f154257l
            boolean r10 = r10.f154254i
            r9.Qv(r1, r10, r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_widgets.adapter.base_info_ml.h.O5(TV0.e, TV0.a, int):void");
    }
}
