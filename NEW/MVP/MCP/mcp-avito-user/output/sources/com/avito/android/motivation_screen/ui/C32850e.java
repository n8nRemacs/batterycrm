package com.avito.android.motivation_screen.ui;

import androidx.compose.runtime.internal.C22096n;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.motivation_screen.models.UiProgressStep;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import v20.C49152c;

/* compiled from: MotivationScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.motivation_screen.ui.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32850e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C32850e f206426a = new C32850e();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f206427b = new C22096n(-691266329, a.f206428l, false);

    /* compiled from: MotivationScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.motivation_screen.ui.e$a */
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f206428l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                F.a(new C49152c(C42745f0.U("До 5 000 рублей", "Каждую неделю"), "Название акции", null, "Чем больше смен завершите, тем больше вознаграждение.", null, "Прогресс", "1 из 3 смен", C42745f0.U(new UiProgressStep("Смена 1", UiProgressStep.UiProgressStepState.f206339b), new UiProgressStep("Смена 2", UiProgressStep.UiProgressStepState.f206342e), new UiProgressStep("Смена 3", UiProgressStep.UiProgressStepState.f206340c)), null, new v20.d("Получить бонус", new NoMatchLink()), new v20.d("Забрать 💰💰💰", new NoMatchLink()), false, false, false, 14612, null), C32848c.f206411l, C32849d.f206425l, a13, 440);
            }
            return G0.f406611a;
        }
    }
}
