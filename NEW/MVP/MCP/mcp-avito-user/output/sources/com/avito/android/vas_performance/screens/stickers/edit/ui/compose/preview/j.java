package com.avito.android.vas_performance.screens.stickers.edit.ui.compose.preview;

import ML0.c;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.r;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: StickerEditPreviews.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class j extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f320938l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i12) {
        super(2);
        this.f320938l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        int i12;
        num.intValue();
        int iA2 = C22066f2.a(this.f320938l | 1);
        Image image = l.f320940a;
        B bE2 = a12.E(1690708993);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
            i12 = iA2;
        } else {
            com.avito.android.vas_performance.screens.stickers.edit.mvi.l lVar = new com.avito.android.vas_performance.screens.stickers.edit.mvi.l();
            bE2.C(980158019);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                ML0.c cVarA = l.a(3);
                C42784z0 c42784z0 = C42784z0.f406748b;
                AttributedText attributedText = new AttributedText("Выберите стикеры для услуги сверху. Можно выбрать до 3.", c42784z0, 0, 4, null);
                List listU = C42745f0.U(new c.h("1", "Обучение от компании", null, true, false, 16, null), new c.h("2", "Возможны премии", null, false, false, 16, null), new c.h("3", "Оформление по ТК РФ", null, true, false, 16, null), new c.h("4", "Быстрый старт работы", null, false, false, 16, null), new c.h("5", "Карьерный рост", null, false, false, 16, null), new c.h("6", "Срочная вакансия", null, false, false, 16, null), new c.h("7", "Без опыта", null, false, false, 16, null));
                i12 = iA2;
                objT = C22126m3.g(ML0.c.a(cVarA, false, false, null, null, "Редактирование стикеров", attributedText, null, 3, new c.g("Изменения в услугах", C42745f0.U(new c.f(0, new AttributedText("Без изменений", c42784z0, 0, 4, null)), new c.f(1, new AttributedText("1 изменений", c42784z0, 0, 4, null)), new c.f(2, new AttributedText("2 изменений", c42784z0, 0, 4, null)), new c.f(3, new AttributedText("3 изменений", c42784z0, 0, 4, null)))), listU, "Вернуться к объявлению", "Сохранить изменения", new c.d("Вернуться к объявлению", false, false), new c.e(0, null), null, new c.b(l.f320940a, "Три значка", new AttributedText("Без изменений", c42784z0, 0, 4, null)), null, 81999));
                bE2.H(objT);
            } else {
                i12 = iA2;
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            bE2.C(980161250);
            boolean zB2 = bE2.B(lVar);
            Object objT2 = bE2.t();
            if (zB2 || objT2 == c1651a) {
                objT2 = new k(lVar, interfaceC22204y1);
                bE2.H(objT2);
            }
            bE2.X(false);
            com.akita.compose.theme.re23.c.a(false, r.c(1215045276, new i((Y41.l) objT2, interfaceC22204y1), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(i12);
        }
        return G0.f406611a;
    }
}
