package com.avito.android.service_booking_utils.save_schedule_modal;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.modal.a;
import com.avito.android.service_booking_common.blueprints.geo_reference.g;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import j.InterfaceC42150f;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingSaveScheduleDialogBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_utils/save_schedule_modal/f;", "", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f278391a;

    /* renamed from: c, reason: collision with root package name */
    @l
    public String f278393c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public String f278394d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f278392b = C42727D.b(LazyThreadSafetyMode.f406616d, new b());

    /* renamed from: e, reason: collision with root package name */
    @k
    public com.avito.android.service_booking_utils.save_schedule_modal.a f278395e = new com.avito.android.service_booking_utils.save_schedule_modal.a(null, null, null, 7, null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public com.avito.android.service_booking_utils.save_schedule_modal.a f278396f = new com.avito.android.service_booking_utils.save_schedule_modal.a(null, null, null, 7, null);

    /* compiled from: ServiceBookingSaveScheduleDialogBuilder.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<a.b, DialogInterface, G0> {
        public a() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) throws Resources.NotFoundException {
            a.b bVar2 = bVar;
            DialogInterface dialogInterface2 = dialogInterface;
            f fVar = f.this;
            bVar2.setCustomView((com.avito.android.service_booking_utils.save_schedule_modal.b) fVar.f278392b.getValue());
            bVar2.setTitle(fVar.f278393c);
            bVar2.setSubtitle(fVar.f278394d);
            bVar2.setCloseButtonVisible(false);
            ?? r72 = fVar.f278392b;
            com.avito.android.service_booking_utils.save_schedule_modal.b bVar3 = (com.avito.android.service_booking_utils.save_schedule_modal.b) r72.getValue();
            com.avito.android.service_booking_utils.save_schedule_modal.a aVar = fVar.f278395e;
            String str = aVar.f278382a;
            Button button = bVar3.f278387b;
            D6.H(button);
            com.avito.android.lib.design.button.b.a(button, str, false);
            Integer num = aVar.f278383b;
            button.setAppearance(num != null ? C35835l0.j(num.intValue(), bVar3.getContext()) : R.attr.buttonPrimaryLarge);
            button.setOnClickListener(new g(7, aVar.f278384c));
            com.avito.android.service_booking_utils.save_schedule_modal.b bVar4 = (com.avito.android.service_booking_utils.save_schedule_modal.b) r72.getValue();
            com.avito.android.service_booking_utils.save_schedule_modal.a aVar2 = fVar.f278396f;
            String str2 = aVar2.f278382a;
            e eVar = new e(fVar, dialogInterface2);
            Button button2 = bVar4.f278388c;
            D6.H(button2);
            com.avito.android.lib.design.button.b.a(button2, str2, false);
            Integer num2 = aVar2.f278383b;
            button2.setAppearance(num2 != null ? C35835l0.j(num2.intValue(), bVar4.getContext()) : R.attr.buttonSecondaryLarge);
            button2.setOnClickListener(new g(8, eVar));
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingSaveScheduleDialogBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/service_booking_utils/save_schedule_modal/b;", "invoke", "()Lcom/avito/android/service_booking_utils/save_schedule_modal/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.service_booking_utils.save_schedule_modal.b> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.service_booking_utils.save_schedule_modal.b invoke() {
            return new com.avito.android.service_booking_utils.save_schedule_modal.b(f.this.f278391a, null, 0, 6, null);
        }
    }

    public f(@k Context context) {
        this.f278391a = context;
    }

    @k
    public final void a(@k String str, @InterfaceC42150f @l Integer num, @k Y41.a aVar) {
        this.f278395e.getClass();
        this.f278395e = new com.avito.android.service_booking_utils.save_schedule_modal.a(str, num, aVar);
    }

    @k
    public final void b(@k String str, @InterfaceC42150f @l Integer num, @k Y41.a aVar) {
        this.f278396f.getClass();
        this.f278396f = new com.avito.android.service_booking_utils.save_schedule_modal.a(str, num, aVar);
    }

    @k
    public final com.avito.android.lib.design.modal.a c() {
        return a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, this.f278391a, new a());
    }
}
