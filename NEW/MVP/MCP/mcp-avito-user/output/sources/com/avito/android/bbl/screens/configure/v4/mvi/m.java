package com.avito.android.bbl.screens.configure.v4.mvi;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import wZ.C49582f;
import wZ.k;

/* compiled from: BblConfigureV4Reducer.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_bbl_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m {
    @Y61.k
    public static final C49582f a(@Y61.k vh.e eVar) {
        wZ.k kVarB;
        int count = (int) eVar.getCount();
        float progress = (float) eVar.getProgress();
        AttributedText text = eVar.getText();
        String icon = eVar.getIcon();
        vh.f progressColor = eVar.getProgressColor();
        if (progressColor != null) {
            k.a aVar = wZ.k.f441571d;
            String valueName = progressColor.getValueName();
            String value = progressColor.getValue();
            String valueDark = progressColor.getValueDark();
            aVar.getClass();
            kVarB = k.a.b(valueName, value, valueDark);
        } else {
            kVarB = null;
        }
        return new C49582f(count, progress, text, icon, kVarB);
    }
}
