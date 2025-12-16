package com.avito.android.service_booking_utils.save_schedule_modal;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingSaveScheduleDialogBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_utils/save_schedule_modal/a;", "", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f278382a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f278383b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f278384c;

    /* compiled from: ServiceBookingSaveScheduleDialogBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.service_booking_utils.save_schedule_modal.a$a, reason: collision with other inner class name */
    public static final class C8273a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8273a f278385l = new C8273a();

        public C8273a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public a() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f278382a, aVar.f278382a) && L.f(this.f278383b, aVar.f278383b) && L.f(this.f278384c, aVar.f278384c);
    }

    public final int hashCode() {
        String str = this.f278382a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f278383b;
        return this.f278384c.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DialogButtonParams(title=");
        sb2.append(this.f278382a);
        sb2.append(", style=");
        sb2.append(this.f278383b);
        sb2.append(", listener=");
        return r.v(sb2, this.f278384c, ')');
    }

    public a(@l String str, @InterfaceC42150f @l Integer num, @k Y41.a<G0> aVar) {
        this.f278382a = str;
        this.f278383b = num;
        this.f278384c = aVar;
    }

    public /* synthetic */ a(String str, Integer num, Y41.a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? C8273a.f278385l : aVar);
    }
}
