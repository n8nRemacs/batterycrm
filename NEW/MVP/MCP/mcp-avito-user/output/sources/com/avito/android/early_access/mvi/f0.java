package com.avito.android.early_access.mvi;

import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.font.C22605a0;
import com.avito.android.early_access.adapter.parameter.element.EarlyAccessParameterItem;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessScreenPreview.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_early-access_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f0 {
    public static final List<ReEarlyAccessData.Package> a() {
        return C42745f0.U(new ReEarlyAccessData.Package("Связаться по*этому объявлению", "129 ₽", 0, null, null, null, "", "По*всем новым тоже платно", null, null), new ReEarlyAccessData.Package("7 дней", "399 ₽", 0, null, "633 ₽", "-37%", "", "Если нужно быстро заехать", null, null), new ReEarlyAccessData.Package("14 дней", "599 ₽", 0, null, "1*266 ₽", "-53%", "", "Если*не*спешите, есть*дети или*питомцы", null, null));
    }

    public static final C22602e b() {
        C22602e.b bVar = new C22602e.b(0, 1, null);
        bVar.f("Или ");
        bVar.f("бесплатно после ");
        androidx.compose.ui.text.font.e0.f42240c.getClass();
        int iL2 = bVar.l(new androidx.compose.ui.text.e0(0L, 0L, androidx.compose.ui.text.font.e0.f42250m, (androidx.compose.ui.text.font.Z) null, (C22605a0) null, (androidx.compose.ui.text.font.E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (f1) null, (androidx.compose.ui.text.X) null, (androidx.compose.ui.graphics.drawscope.j) null, 65531, (C42822w) null));
        try {
            bVar.f("11:00");
            G0 g02 = G0.f406611a;
            bVar.h(iL2);
            return bVar.m();
        } catch (Throwable th2) {
            bVar.h(iL2);
            throw th2;
        }
    }

    public static final C22602e c() {
        C22602e.b bVar = new C22602e.b(0, 1, null);
        bVar.f("Оплачивая услугу, вы соглашаетесь с ");
        com.avito.android.early_access.s.a(bVar, "", "", new e0("офертой"));
        bVar.f(" и ");
        com.avito.android.early_access.s.a(bVar, "", "", new e0("условиями"));
        bVar.f(". ");
        com.avito.android.early_access.s.a(bVar, "", "", new e0("Всё про услугу"));
        return bVar.m();
    }

    public static final List<ReEarlyAccessData.Package> d() {
        return C42745f0.U(new ReEarlyAccessData.Package("1 объявление", "129 ₽", 1, null, null, null, "", null, null, null), new ReEarlyAccessData.Package("3 объявления", "289 ₽", 3, "96*₽ за*каждое", "387 ₽", "-25%", "", "96*₽ за*каждое", null, null), new ReEarlyAccessData.Package("5 объявлений", "399 ₽", 5, "79*₽ за*каждое", "645*₽", "-38%", "", "79*₽ за*каждое", null, null));
    }

    public static final List<EarlyAccessParameterItem> e(boolean z12) {
        return C42745f0.U(new EarlyAccessParameterItem(null, "fire", "Только разместили, опередите других", z12 ? "Сэкономьте время и*деньги" : null, 1, null), new EarlyAccessParameterItem(null, "operations", "Аренда без*комиссии риелтору", z12 ? "Сэкономьте время и*деньги" : null, 1, null), new EarlyAccessParameterItem(null, "history", "Первые 4*часа после публикации новых объявлений звонки и*чаты по*ним платные", z12 ? "Сэкономьте время и*деньги" : null, 1, null));
    }
}
