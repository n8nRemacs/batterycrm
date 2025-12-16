package com.avito.android.str_booking.mvi;

import Mx0.C14541a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.clientEventBus.ConnectionState;
import com.avito.android.str_booking.mvi.entity.StrBookingInternalAction;
import com.avito.android.str_booking.ui.ScreenType;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import lE.C43624b;

/* compiled from: StrBookingActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_booking/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/str_booking/mvi/entity/a;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "LMx0/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<com.avito.android.str_booking.mvi.entity.a, StrBookingInternalAction, C14541a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f285718a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_booking.domain.f f285719b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_booking.domain.d f285720c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43624b f285721d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.a f285722e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f285723f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ScreenType f285724g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f285725h;

    /* compiled from: StrBookingActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_booking.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C8551a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f285726a;

        static {
            int[] iArr = new int[ConnectionState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f285726a = iArr;
            int[] iArr2 = new int[ScreenType.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ScreenType.a aVar = ScreenType.f285864b;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public a(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.str_booking.domain.f fVar, @Y61.k com.avito.android.str_booking.domain.d dVar, @Y61.k C43624b c43624b, @Y61.k com.avito.android.clientEventBus.a aVar, @Y61.k @Named("order_id") String str, @Y61.k @Named("screen_type") ScreenType screenType, @Y61.l @Named("ux_feedback_event_name") String str2) {
        this.f285718a = interfaceC28373a;
        this.f285719b = fVar;
        this.f285720c = dVar;
        this.f285721d = c43624b;
        this.f285722e = aVar;
        this.f285723f = str;
        this.f285724g = screenType;
        this.f285725h = str2;
    }

    public static final InterfaceC43160i c(a aVar) {
        int iOrdinal = aVar.f285724g.ordinal();
        String str = aVar.f285723f;
        com.avito.android.str_booking.domain.f fVar = aVar.f285719b;
        if (iOrdinal == 0) {
            return fVar.d(str, aVar.f285725h);
        }
        if (iOrdinal == 1) {
            return fVar.b(str);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.C(new g(aVar, this, null), c43197r1), !this.f285721d.w().invoke().booleanValue() ? C43175k.w() : C43175k.Y(C43175k.r(y.a(this.f285722e.a())), new b(aVar, this, null)));
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StrBookingInternalAction> b(com.avito.android.str_booking.mvi.entity.a aVar, C14541a c14541a) {
        return C43175k.G(new f(aVar, this, null));
    }
}
