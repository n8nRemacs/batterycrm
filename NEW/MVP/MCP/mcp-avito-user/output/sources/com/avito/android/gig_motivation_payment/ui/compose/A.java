package com.avito.android.gig_motivation_payment.ui.compose;

import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43207v;
import sH.C48049a;
import vH.InterfaceC49212b;
import vH.c;

/* compiled from: MotivationPaymentScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class A extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Image f160122l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Image image) {
        super(2);
        this.f160122l = image;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            Image image = this.f160122l;
            F.b(new c.b(new C48049a("Вам полагается\n2 000 ₽", "По акции «Выгодный старт»", new UniversalImage(image, image), new sH.h("Получить", new NoMatchLink()), new sH.e(new sH.f(new NoMatchLink(), new UniversalImage(image, image), null, "Через СБП по номеру +7······2210"), "Изменить", null, null, 4, null), new sH.d("Детали выплаты", C42745f0.U(new sH.g("Вы завершили", "1 из 1 смены"), new sH.g("Срок акции", "10—20 февраля"))), new sH.i("Документы", new NoMatchLink()), null, null, 384, null), false, 2, null), new C43207v(new InterfaceC49212b[0]), y.f160193l, z.f160194l, a13, 3528);
        }
        return G0.f406611a;
    }
}
