package com.avito.android.travel_onboarding.ui;

import ZE0.d;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.avito.android.travel_onboarding.models.TravelOnboardingButtonViewType;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TravelOnboardingContentScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.travel_onboarding.ui.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35237b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C35237b f302334a = new C35237b();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f302335b = new C22096n(808277899, a.f302336l, false);

    /* compiled from: TravelOnboardingContentScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.travel_onboarding.ui.b$a */
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f302336l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                u.a(new d.b(new YE0.b(null, null, null, new YE0.c(new YE0.d("Написать", null, MessageSuggest.PREVIEW, TravelOnboardingButtonViewType.f302285c), new YE0.j("Позвонить", "subtitle", new NoMatchLink(), MessageSuggest.PREVIEW, TravelOnboardingButtonViewType.f302284b)), new YE0.a(1234L, "test"))), C35236a.f302333l, a13, 56);
            }
            return G0.f406611a;
        }
    }
}
