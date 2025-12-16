package com.avito.android.travel_onboarding.ui.items;

import androidx.compose.runtime.internal.C22096n;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.travel_onboarding.models.TravelOnboardingButtonViewType;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ButtonsBlock.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.travel_onboarding.ui.items.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35254o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C35254o f302424a = new C35254o();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f302425b = new C22096n(-1184822360, a.f302426l, false);

    /* compiled from: ButtonsBlock.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.travel_onboarding.ui.items.o$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f302426l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                C35251l.a(new YE0.c(new YE0.d("Close button", null, null, TravelOnboardingButtonViewType.f302285c), new YE0.j("Redirect button", "redirect subtitle", new NoMatchLink(), null, TravelOnboardingButtonViewType.f302284b)), C35252m.f302422l, C35253n.f302423l, a13, 440);
            }
            return G0.f406611a;
        }
    }
}
