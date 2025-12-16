package com.avito.android.seller_coach.adverts_hint.mvi;

import com.avito.android.seller_coach.adverts_hint.mvi.entity.ShortAdvicesState;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.ws.WebSocketProtocol;
import uq0.C49099a;
import yq0.InterfaceC50281a;
import yq0.InterfaceC50282b;
import yq0.InterfaceC50283c;

/* compiled from: ShortAdvicesFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/mvi/o;", "Lcom/avito/android/arch/mvi/q;", "Lyq0/a;", "Lyq0/c;", "Lcom/avito/android/seller_coach/adverts_hint/mvi/entity/ShortAdvicesState;", "Lyq0/b;", "a", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o extends com.avito.android.arch.mvi.q<InterfaceC50281a, InterfaceC50283c, ShortAdvicesState, InterfaceC50282b> {

    /* compiled from: ShortAdvicesFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/mvi/o$a;", "", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.seller_coach.adverts_hint.mvi.a f267311a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final q f267312b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final l f267313c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final R0 f267314d;

        @Inject
        public a(@Y61.k com.avito.android.seller_coach.adverts_hint.mvi.a aVar, @Y61.k q qVar, @Y61.k l lVar, @Y61.k R0 r02) {
            this.f267311a = aVar;
            this.f267312b = qVar;
            this.f267313c = lVar;
            this.f267314d = r02;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C49099a c49099a, com.avito.android.seller_coach.adverts_hint.mvi.a aVar, q qVar, l lVar, R0 r02, C42822w c42822w) {
        super("UserAdvertsShortAdvicesFeature", new ShortAdvicesState(c49099a, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null), new n(aVar, qVar, lVar, r02));
        c49099a.getClass();
    }
}
