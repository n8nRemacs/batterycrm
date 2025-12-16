package com.avito.android.travel_guest_profile.domain.interactors;

import Mg0.InterfaceC14487a;
import android.net.Uri;
import com.avito.android.travel_guest_profile.mvi.entity.TravelGuestProfileInternalAction;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TravelGuestProfileReviewsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_guest_profile/domain/interactors/f;", "", "a", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14487a f301995a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f301996b = new AtomicBoolean(false);

    /* compiled from: TravelGuestProfileReviewsInteractor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/travel_guest_profile/domain/interactors/f$a;", "", "<init>", "()V", "", "DEFAULT_DEBOUNCE_MILLIS", "J", "", "STR_SCR_ROLE", "Ljava/lang/String;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f(@Y61.k InterfaceC14487a interfaceC14487a) {
        this.f301995a = interfaceC14487a;
    }

    @Y61.k
    public final h a(@Y61.k String str, @Y61.l String str2, @Y61.k Map map) {
        return new h(C43175k.n(new C43137a0(new j(2, null), new g(C43175k.G(new i(this, str, str2, map, null)))), 300L));
    }

    @Y61.k
    public final InterfaceC43160i<TravelGuestProfileInternalAction> b(@Y61.k Uri uri) {
        if (!this.f301996b.get()) {
            return C43175k.w();
        }
        return new l(new C43197r1(new o(this, null), C43175k.n(new C43137a0(new n(2, null), new k(C43175k.G(new m(this, uri, null)))), 300L)));
    }
}
