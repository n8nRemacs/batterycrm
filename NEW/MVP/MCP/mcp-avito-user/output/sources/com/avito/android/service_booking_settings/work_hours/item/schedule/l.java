package com.avito.android.service_booking_settings.work_hours.item.schedule;

import Tt0.C15405a;
import Ut0.C15567b;
import Y41.p;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.date_time_picker.PickerHeaderType;
import com.avito.android.date_time_picker.TimePickerArguments;
import com.avito.android.date_time_picker.TimePickerDialog;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.service_booking_settings.work_hours.analytics.events.FromPage;
import com.avito.android.service_booking_settings.work_hours.item.schedule.h;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingWorkHourDayView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/item/schedule/l;", "Lcom/avito/android/service_booking_settings/work_hours/item/schedule/h;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f278005n = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f278006b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final org.threeten.bp.format.c f278007c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h.b f278008d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f278009e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f278010f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Switcher f278011g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f278012h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Input f278013i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Input f278014j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public TimePickerDialog f278015k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public TimePickerDialog f278016l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public N f278017m;

    /* compiled from: ServiceBookingWorkHourDayView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/item/schedule/l$a;", "", "<init>", "()V", "", "TIME_PICKER_MINUTES_STEP", "I", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceBookingWorkHourDayView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/threeten/bp/g;", "<anonymous parameter 0>", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Lorg/threeten/bp/g;Lorg/threeten/bp/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<org.threeten.bp.g, org.threeten.bp.g, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f278018l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ G0 invoke(org.threeten.bp.g gVar, org.threeten.bp.g gVar2) {
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    public l(@Y61.k View view, @Y61.k org.threeten.bp.format.c cVar, @Y61.k h.b bVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        super(view);
        this.f278006b = view;
        this.f278007c = cVar;
        this.f278008d = bVar;
        this.f278009e = interfaceC28373a;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f278010f = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.switcher);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.switcher.Switcher");
        }
        this.f278011g = (Switcher) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.selectTimeGroup);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f278012h = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.fromTime);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f278013i = (Input) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.toTime);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f278014j = (Input) viewFindViewById5;
        this.f278017m = b.f278018l;
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.schedule.h
    public final void Qq(@Y61.k final org.threeten.bp.g gVar, @Y61.k final org.threeten.bp.g gVar2, final int i12) {
        org.threeten.bp.format.c cVar = this.f278007c;
        String strQ = gVar.q(cVar);
        Input input = this.f278013i;
        Input.t(input, strQ, false, 6);
        String strQ2 = gVar2.q(cVar);
        Input input2 = this.f278014j;
        Input.t(input2, strQ2, false, 6);
        final int i13 = 0;
        input.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.service_booking_settings.work_hours.item.schedule.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l f277996c;

            {
                this.f277996c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        final l lVar = this.f277996c;
                        TimePickerDialog timePickerDialog = lVar.f278015k;
                        if (timePickerDialog == null || !timePickerDialog.isShowing()) {
                            lVar.f278008d.x(i12);
                            Context context = lVar.f278006b.getContext();
                            org.threeten.bp.f fVarG = org.threeten.bp.f.G(org.threeten.bp.e.L(), gVar);
                            org.threeten.bp.e eVarL = org.threeten.bp.e.L();
                            final org.threeten.bp.g gVar3 = gVar2;
                            final int i14 = 0;
                            TimePickerDialog timePickerDialog2 = new TimePickerDialog(context, new TimePickerArguments(PickerHeaderType.f132602c, 0, null, null, fVarG, 15, 0, new TimePickerDialog.BeforeThanProvidedValidationRule(org.threeten.bp.f.G(eVarL, gVar3)), R.string.service_booking_working_hours_picker_title, false, 590, null), new l41.g() { // from class: com.avito.android.service_booking_settings.work_hours.item.schedule.j
                                /* JADX WARN: Type inference failed for: r0v2, types: [Y41.p, kotlin.jvm.internal.N] */
                                /* JADX WARN: Type inference failed for: r0v4, types: [Y41.p, kotlin.jvm.internal.N] */
                                @Override // l41.g
                                public final void accept(Object obj) {
                                    org.threeten.bp.f fVar = (org.threeten.bp.f) obj;
                                    switch (i14) {
                                        case 0:
                                            lVar.f278017m.invoke(fVar.f421949c, gVar3);
                                            break;
                                        default:
                                            lVar.f278017m.invoke(gVar3, fVar.f421949c);
                                            break;
                                    }
                                }
                            });
                            Context context2 = view.getContext();
                            org.threeten.bp.g gVar4 = org.threeten.bp.g.f422069h;
                            org.threeten.bp.format.c cVar2 = lVar.f278007c;
                            timePickerDialog2.f132623M = context2.getString(R.string.service_booking_time_validation_error, gVar4.q(cVar2), gVar3.q(cVar2));
                            final int i15 = 0;
                            timePickerDialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.avito.android.service_booking_settings.work_hours.item.schedule.k
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    l lVar2 = lVar;
                                    switch (i15) {
                                        case 0:
                                            int i16 = l.f278005n;
                                            lVar2.f278009e.c(new C15405a(FromPage.f277922c));
                                            break;
                                        default:
                                            int i17 = l.f278005n;
                                            lVar2.f278009e.c(new C15405a(FromPage.f277922c));
                                            break;
                                    }
                                }
                            });
                            lVar.f278015k = timePickerDialog2;
                            com.avito.android.lib.util.g.a(timePickerDialog2);
                            break;
                        }
                        break;
                    default:
                        final l lVar2 = this.f277996c;
                        TimePickerDialog timePickerDialog3 = lVar2.f278016l;
                        if (timePickerDialog3 == null || !timePickerDialog3.isShowing()) {
                            lVar2.f278008d.U(i12);
                            Context context3 = lVar2.f278006b.getContext();
                            org.threeten.bp.f fVarG2 = org.threeten.bp.f.G(org.threeten.bp.e.L(), gVar);
                            org.threeten.bp.e eVarL2 = org.threeten.bp.e.L();
                            final org.threeten.bp.g gVar5 = gVar2;
                            final int i16 = 1;
                            TimePickerDialog timePickerDialog4 = new TimePickerDialog(context3, new TimePickerArguments(PickerHeaderType.f132602c, 0, null, null, fVarG2, 15, 0, new TimePickerDialog.AfterThanProvidedValidationRule(org.threeten.bp.f.G(eVarL2, gVar5)), R.string.service_booking_working_hours_picker_title, false, 590, null), new l41.g() { // from class: com.avito.android.service_booking_settings.work_hours.item.schedule.j
                                /* JADX WARN: Type inference failed for: r0v2, types: [Y41.p, kotlin.jvm.internal.N] */
                                /* JADX WARN: Type inference failed for: r0v4, types: [Y41.p, kotlin.jvm.internal.N] */
                                @Override // l41.g
                                public final void accept(Object obj) {
                                    org.threeten.bp.f fVar = (org.threeten.bp.f) obj;
                                    switch (i16) {
                                        case 0:
                                            lVar2.f278017m.invoke(fVar.f421949c, gVar5);
                                            break;
                                        default:
                                            lVar2.f278017m.invoke(gVar5, fVar.f421949c);
                                            break;
                                    }
                                }
                            });
                            Context context4 = view.getContext();
                            org.threeten.bp.format.c cVar3 = lVar2.f278007c;
                            timePickerDialog4.f132623M = context4.getString(R.string.service_booking_time_validation_error, gVar5.q(cVar3), org.threeten.bp.g.f422069h.q(cVar3));
                            final int i17 = 1;
                            timePickerDialog4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.avito.android.service_booking_settings.work_hours.item.schedule.k
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    l lVar22 = lVar2;
                                    switch (i17) {
                                        case 0:
                                            int i162 = l.f278005n;
                                            lVar22.f278009e.c(new C15405a(FromPage.f277922c));
                                            break;
                                        default:
                                            int i172 = l.f278005n;
                                            lVar22.f278009e.c(new C15405a(FromPage.f277922c));
                                            break;
                                    }
                                }
                            });
                            lVar2.f278016l = timePickerDialog4;
                            com.avito.android.lib.util.g.a(timePickerDialog4);
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 1;
        input2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.service_booking_settings.work_hours.item.schedule.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l f277996c;

            {
                this.f277996c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        final l lVar = this.f277996c;
                        TimePickerDialog timePickerDialog = lVar.f278015k;
                        if (timePickerDialog == null || !timePickerDialog.isShowing()) {
                            lVar.f278008d.x(i12);
                            Context context = lVar.f278006b.getContext();
                            org.threeten.bp.f fVarG = org.threeten.bp.f.G(org.threeten.bp.e.L(), gVar2);
                            org.threeten.bp.e eVarL = org.threeten.bp.e.L();
                            final org.threeten.bp.g gVar3 = gVar;
                            final int i142 = 0;
                            TimePickerDialog timePickerDialog2 = new TimePickerDialog(context, new TimePickerArguments(PickerHeaderType.f132602c, 0, null, null, fVarG, 15, 0, new TimePickerDialog.BeforeThanProvidedValidationRule(org.threeten.bp.f.G(eVarL, gVar3)), R.string.service_booking_working_hours_picker_title, false, 590, null), new l41.g() { // from class: com.avito.android.service_booking_settings.work_hours.item.schedule.j
                                /* JADX WARN: Type inference failed for: r0v2, types: [Y41.p, kotlin.jvm.internal.N] */
                                /* JADX WARN: Type inference failed for: r0v4, types: [Y41.p, kotlin.jvm.internal.N] */
                                @Override // l41.g
                                public final void accept(Object obj) {
                                    org.threeten.bp.f fVar = (org.threeten.bp.f) obj;
                                    switch (i142) {
                                        case 0:
                                            lVar.f278017m.invoke(fVar.f421949c, gVar3);
                                            break;
                                        default:
                                            lVar.f278017m.invoke(gVar3, fVar.f421949c);
                                            break;
                                    }
                                }
                            });
                            Context context2 = view.getContext();
                            org.threeten.bp.g gVar4 = org.threeten.bp.g.f422069h;
                            org.threeten.bp.format.c cVar2 = lVar.f278007c;
                            timePickerDialog2.f132623M = context2.getString(R.string.service_booking_time_validation_error, gVar4.q(cVar2), gVar3.q(cVar2));
                            final int i15 = 0;
                            timePickerDialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.avito.android.service_booking_settings.work_hours.item.schedule.k
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    l lVar22 = lVar;
                                    switch (i15) {
                                        case 0:
                                            int i162 = l.f278005n;
                                            lVar22.f278009e.c(new C15405a(FromPage.f277922c));
                                            break;
                                        default:
                                            int i172 = l.f278005n;
                                            lVar22.f278009e.c(new C15405a(FromPage.f277922c));
                                            break;
                                    }
                                }
                            });
                            lVar.f278015k = timePickerDialog2;
                            com.avito.android.lib.util.g.a(timePickerDialog2);
                            break;
                        }
                        break;
                    default:
                        final l lVar2 = this.f277996c;
                        TimePickerDialog timePickerDialog3 = lVar2.f278016l;
                        if (timePickerDialog3 == null || !timePickerDialog3.isShowing()) {
                            lVar2.f278008d.U(i12);
                            Context context3 = lVar2.f278006b.getContext();
                            org.threeten.bp.f fVarG2 = org.threeten.bp.f.G(org.threeten.bp.e.L(), gVar2);
                            org.threeten.bp.e eVarL2 = org.threeten.bp.e.L();
                            final org.threeten.bp.g gVar5 = gVar;
                            final int i16 = 1;
                            TimePickerDialog timePickerDialog4 = new TimePickerDialog(context3, new TimePickerArguments(PickerHeaderType.f132602c, 0, null, null, fVarG2, 15, 0, new TimePickerDialog.AfterThanProvidedValidationRule(org.threeten.bp.f.G(eVarL2, gVar5)), R.string.service_booking_working_hours_picker_title, false, 590, null), new l41.g() { // from class: com.avito.android.service_booking_settings.work_hours.item.schedule.j
                                /* JADX WARN: Type inference failed for: r0v2, types: [Y41.p, kotlin.jvm.internal.N] */
                                /* JADX WARN: Type inference failed for: r0v4, types: [Y41.p, kotlin.jvm.internal.N] */
                                @Override // l41.g
                                public final void accept(Object obj) {
                                    org.threeten.bp.f fVar = (org.threeten.bp.f) obj;
                                    switch (i16) {
                                        case 0:
                                            lVar2.f278017m.invoke(fVar.f421949c, gVar5);
                                            break;
                                        default:
                                            lVar2.f278017m.invoke(gVar5, fVar.f421949c);
                                            break;
                                    }
                                }
                            });
                            Context context4 = view.getContext();
                            org.threeten.bp.format.c cVar3 = lVar2.f278007c;
                            timePickerDialog4.f132623M = context4.getString(R.string.service_booking_time_validation_error, gVar5.q(cVar3), org.threeten.bp.g.f422069h.q(cVar3));
                            final int i17 = 1;
                            timePickerDialog4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.avito.android.service_booking_settings.work_hours.item.schedule.k
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    l lVar22 = lVar2;
                                    switch (i17) {
                                        case 0:
                                            int i162 = l.f278005n;
                                            lVar22.f278009e.c(new C15405a(FromPage.f277922c));
                                            break;
                                        default:
                                            int i172 = l.f278005n;
                                            lVar22.f278009e.c(new C15405a(FromPage.f277922c));
                                            break;
                                    }
                                }
                            });
                            lVar2.f278016l = timePickerDialog4;
                            com.avito.android.lib.util.g.a(timePickerDialog4);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.schedule.h
    public final void cv(boolean z12) {
        D6.G(this.f278012h, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.service_booking_settings.work_hours.item.schedule.h
    public final void oM(@Y61.k C15567b c15567b, @Y61.k Y41.l<? super Boolean, G0> lVar, @Y61.k p<? super org.threeten.bp.g, ? super org.threeten.bp.g, G0> pVar) throws Resources.NotFoundException {
        this.f278010f.setText(c15567b.f16718d);
        Switcher switcher = this.f278011g;
        boolean z12 = c15567b.f16719e;
        switcher.setChecked(z12);
        D6.G(this.f278012h, z12);
        switcher.setOnCheckedChangeListener(new com.avito.android.blueprints.publish.select.inline.j(4, lVar));
        Qq(c15567b.f16720f, c15567b.f16721g, c15567b.f16717c);
        D6.F(this.f278006b, c15567b.f16722h);
        this.f278017m = (N) pVar;
    }
}
