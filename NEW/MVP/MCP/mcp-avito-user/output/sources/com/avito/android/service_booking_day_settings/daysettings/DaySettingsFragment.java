package com.avito.android.service_booking_day_settings.daysettings;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.date_time_picker.PickerHeaderType;
import com.avito.android.date_time_picker.TimePickerArguments;
import com.avito.android.date_time_picker.TimePickerDialog;
import com.avito.android.date_time_picker.TimePickerDialogFragment;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.service_booking_day_settings.DaySettingsActivity;
import com.avito.android.service_booking_day_settings.DaySettingsFragmentArgs;
import com.avito.android.service_booking_day_settings.daysettings.DaySettingsFragment;
import com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import com.avito.android.service_booking_day_settings.daysettings.perf_screen.DayScheduleScreen;
import com.avito.android.service_booking_day_settings.daysettings.v;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.N0;
import com.google.android.material.appbar.MaterialToolbar;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import xt0.C49997a;
import yt0.InterfaceC50300a;
import yt0.InterfaceC50301b;
import z1.AbstractC50339a;

/* compiled from: DaySettingsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/DaySettingsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DaySettingsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final a f276691v0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public v.a f276692n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f276693o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f276694p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f276695q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f276696r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f276697s0;

    /* renamed from: t0, reason: collision with root package name */
    public com.avito.android.service_booking_day_settings.daysettings.h f276698t0;

    /* renamed from: u0, reason: collision with root package name */
    public com.avito.android.service_booking_day_settings.daysettings.a f276699u0;

    /* compiled from: DaySettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/DaySettingsFragment$a;", "", "<init>", "()V", "", "DAY_KEY_ARG", "Ljava/lang/String;", "DIALOG_TAG_DATE_FROM", "DIALOG_TAG_DATE_TO", "OVERLAPS_SEPARATOR", "REQUEST_BREAK_TIME_PICKER_FROM", "REQUEST_BREAK_TIME_PICKER_TO", "REQUEST_TIME_PICKER_FROM", "REQUEST_TIME_PICKER_TO", "", "TIME_PICKER_MINUTES_STEP", "I", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DaySettingsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = DaySettingsFragment.f276691v0;
            DaySettingsFragment.this.r5().accept(InterfaceC50300a.InterfaceC12928a.C12929a.f443562a);
            return G0.f406611a;
        }
    }

    /* compiled from: DaySettingsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC50301b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC50301b interfaceC50301b) {
            View viewRequireView;
            InterfaceC50301b interfaceC50301b2 = interfaceC50301b;
            DaySettingsFragment daySettingsFragment = (DaySettingsFragment) this.receiver;
            a aVar = DaySettingsFragment.f276691v0;
            daySettingsFragment.getClass();
            if (interfaceC50301b2 instanceof InterfaceC50301b.a) {
                InterfaceC50301b.a aVar2 = (InterfaceC50301b.a) interfaceC50301b2;
                if (aVar2.f443585a) {
                    daySettingsFragment.requireActivity().setResult(-1);
                } else {
                    ActivityC22955m activityC22955mRequireActivity = daySettingsFragment.requireActivity();
                    DaySettingsActivity.f276682n.getClass();
                    Intent intent = new Intent();
                    intent.putExtra("result_key.settings_status", aVar2.f443586b);
                    activityC22955mRequireActivity.setResult(0, intent);
                }
                daySettingsFragment.requireActivity().finish();
            } else {
                if (interfaceC50301b2 instanceof InterfaceC50301b.e) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar3 = daySettingsFragment.f276695q0;
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    b.a.a(aVar3, ((InterfaceC50301b.e) interfaceC50301b2).f443593a, null, null, 6);
                } else {
                    boolean z12 = interfaceC50301b2 instanceof InterfaceC50301b.i;
                    if (z12 ? true : interfaceC50301b2 instanceof InterfaceC50301b.h) {
                        com.avito.android.service_booking_day_settings.daysettings.h hVar = daySettingsFragment.f276698t0;
                        if (hVar == null) {
                            hVar = null;
                        }
                        boolean zY2 = D6.y(hVar.f276874d);
                        if (z12) {
                            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                            if (zY2) {
                                com.avito.android.service_booking_day_settings.daysettings.h hVar2 = daySettingsFragment.f276698t0;
                                viewRequireView = (hVar2 != null ? hVar2 : null).f276876f;
                            } else {
                                viewRequireView = daySettingsFragment.requireView();
                            }
                            com.avito.android.component.toast.c.b(cVar, viewRequireView, com.avito.android.printable_text.b.f(((InterfaceC50301b.i) interfaceC50301b2).f443599a), null, null, null, f.a.f125253a, 1500, zY2 ? ToastBarPosition.f181044b : ToastBarPosition.f181047e, null, false, false, null, null, 3982);
                        } else if (interfaceC50301b2 instanceof InterfaceC50301b.h) {
                            com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                            com.avito.android.service_booking_day_settings.daysettings.h hVar3 = daySettingsFragment.f276698t0;
                            MaterialToolbar materialToolbar = (hVar3 != null ? hVar3 : null).f276872b;
                            PrintableText printableTextF = com.avito.android.printable_text.b.f(((InterfaceC50301b.h) interfaceC50301b2).f443598a);
                            ToastBarPosition toastBarPosition = ToastBarPosition.f181045c;
                            f.c.f125255c.getClass();
                            com.avito.android.component.toast.c.b(cVar2, materialToolbar, printableTextF, null, null, null, f.c.a.b(), 1500, toastBarPosition, null, false, false, null, null, 3982);
                        }
                    } else if (interfaceC50301b2 instanceof InterfaceC50301b.f) {
                        if (daySettingsFragment.getChildFragmentManager().H("tag.date_from") == null) {
                            TimePickerDialogFragment.a aVar4 = TimePickerDialogFragment.f132645j0;
                            InterfaceC50301b.f fVar = (InterfaceC50301b.f) interfaceC50301b2;
                            TimePickerArguments timePickerArguments = new TimePickerArguments(PickerHeaderType.f132602c, R.string.picker_apply_text, null, TimePickerDialog.ValidationErrorType.f132634b, fVar.f443594a, 15, 0, new TimePickerDialog.BeforeThanProvidedValidationRule(fVar.f443595b), R.string.time_picker_start_title, false, 580, null);
                            aVar4.getClass();
                            TimePickerDialogFragment.a.a("request.time_picker.from", timePickerArguments).show(daySettingsFragment.getChildFragmentManager(), "tag.date_from");
                        }
                    } else if (interfaceC50301b2 instanceof InterfaceC50301b.g) {
                        if (daySettingsFragment.getChildFragmentManager().H("tag.date_to") == null) {
                            TimePickerDialogFragment.a aVar5 = TimePickerDialogFragment.f132645j0;
                            InterfaceC50301b.g gVar = (InterfaceC50301b.g) interfaceC50301b2;
                            org.threeten.bp.f fVar2 = gVar.f443597b;
                            TimePickerArguments timePickerArguments2 = new TimePickerArguments(PickerHeaderType.f132602c, R.string.picker_apply_text, new TimePickerDialog.PickerWheel.EndAfterStart(fVar2.f421949c), TimePickerDialog.ValidationErrorType.f132634b, gVar.f443596a, 15, 0, new TimePickerDialog.AfterThanProvidedValidationRule(fVar2), R.string.time_picker_end_title, false, 576, null);
                            aVar5.getClass();
                            TimePickerDialogFragment.a.a("request.time_picker.to", timePickerArguments2).show(daySettingsFragment.getChildFragmentManager(), "tag.date_to");
                        }
                    } else if (interfaceC50301b2 instanceof InterfaceC50301b.C12930b) {
                        com.avito.android.deeplink_handler.handler.composite.a aVar6 = daySettingsFragment.f276695q0;
                        if (aVar6 == null) {
                            aVar6 = null;
                        }
                        b.a.a(aVar6, new WebViewLink.OnlyAvitoDomain(Uri.parse("https://support.avito.ru/articles/2796"), null, null, 6, null), null, null, 6);
                    } else if (interfaceC50301b2 instanceof InterfaceC50301b.c) {
                        if (daySettingsFragment.getChildFragmentManager().H("tag.date_to") == null) {
                            TimePickerDialogFragment.a aVar7 = TimePickerDialogFragment.f132645j0;
                            TimePickerArguments timePickerArguments3 = new TimePickerArguments(PickerHeaderType.f132602c, R.string.picker_apply_text, TimePickerDialog.PickerWheel.None.f132633b, TimePickerDialog.ValidationErrorType.f132637e, ((InterfaceC50301b.c) interfaceC50301b2).f443588b, 15, 0, null, R.string.time_picker_break_end_title, false, 704, null);
                            aVar7.getClass();
                            TimePickerDialogFragment.a.a("break.time_picker.to", timePickerArguments3).show(daySettingsFragment.getChildFragmentManager(), "tag.date_to");
                        }
                    } else if ((interfaceC50301b2 instanceof InterfaceC50301b.d) && daySettingsFragment.getChildFragmentManager().H("tag.date_from") == null) {
                        TimePickerDialogFragment.a aVar8 = TimePickerDialogFragment.f132645j0;
                        TimePickerArguments timePickerArguments4 = new TimePickerArguments(PickerHeaderType.f132602c, R.string.time_picker_break_add, TimePickerDialog.PickerWheel.None.f132633b, TimePickerDialog.ValidationErrorType.f132634b, ((InterfaceC50301b.d) interfaceC50301b2).f443591b, 15, 0, null, R.string.time_picker_break_start_title, false, 704, null);
                        aVar8.getClass();
                        TimePickerDialogFragment.a.a("break.time_picker.from", timePickerArguments4).show(daySettingsFragment.getChildFragmentManager(), "tag.date_from");
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DaySettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<DaySettingsState, G0> {
        public d() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.l
        public final G0 invoke(DaySettingsState daySettingsState) throws Resources.NotFoundException {
            final DaySettingsState.SaveScheduleInfo saveScheduleInfo;
            DaySettingsState.TimePeriod timePeriod;
            int i12 = 0;
            int i13 = 7;
            DaySettingsState daySettingsState2 = daySettingsState;
            a aVar = DaySettingsFragment.f276691v0;
            DaySettingsFragment daySettingsFragment = DaySettingsFragment.this;
            final com.avito.android.service_booking_day_settings.daysettings.d dVar = new com.avito.android.service_booking_day_settings.daysettings.d(1, daySettingsFragment.r5(), v.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            if (daySettingsState2.f276965b) {
                com.avito.android.service_booking_day_settings.daysettings.h hVar = daySettingsFragment.f276698t0;
                C42670a.d((hVar != null ? hVar : null).f276891u);
            } else if (daySettingsState2.f276967d != null) {
                com.avito.android.service_booking_day_settings.daysettings.h hVar2 = daySettingsFragment.f276698t0;
                if (hVar2 == null) {
                    hVar2 = null;
                }
                hVar2.f276891u.c(null, new com.avito.android.service_booking_day_settings.daysettings.e(daySettingsState2));
                com.avito.android.service_booking_day_settings.daysettings.h hVar3 = daySettingsFragment.f276698t0;
                (hVar3 != null ? hVar3 : null).f276891u.a(new com.avito.android.seller_promotions.b(i13, dVar));
            } else {
                DaySettingsState.DayScheduleInfo dayScheduleInfo = daySettingsState2.f276966c;
                if (dayScheduleInfo != null) {
                    com.avito.android.service_booking_day_settings.daysettings.h hVar4 = daySettingsFragment.f276698t0;
                    if (hVar4 == null) {
                        hVar4 = null;
                    }
                    hVar4.f276891u.b();
                    com.avito.android.service_booking_day_settings.daysettings.h hVar5 = daySettingsFragment.f276698t0;
                    if (hVar5 == null) {
                        hVar5 = null;
                    }
                    DaySettingsState.ShowElements showElements = daySettingsState2.f276968e;
                    boolean z12 = showElements.f277019b || showElements.f277020c;
                    DaySettingsState.DayInfo dayInfo = dayScheduleInfo.f276999d;
                    boolean z13 = dayInfo.f276994b;
                    com.avito.android.service_booking_day_settings.daysettings.m mVar = new com.avito.android.service_booking_day_settings.daysettings.m(dVar);
                    Button button = hVar5.f276873c;
                    DaySettingsState.ActionButtonsContainer actionButtonsContainer = dayScheduleInfo.f277000e;
                    DaySettingsState.ActionButtonsContainer.ActionButtonInfo actionButtonInfo = actionButtonsContainer.f276973b;
                    if (z12) {
                        com.avito.android.lib.design.button.b.a(button, actionButtonInfo.f276976c, false);
                        button.setAppearanceFromAttr(actionButtonInfo.f276975b);
                        button.setOnClickListener(new A(7, mVar));
                    }
                    D6.G(button, z12);
                    com.avito.android.service_booking_day_settings.daysettings.n nVar = new com.avito.android.service_booking_day_settings.daysettings.n(dVar);
                    Button button2 = hVar5.f276874d;
                    if (z13) {
                        DaySettingsState.ActionButtonsContainer.ActionButtonInfo actionButtonInfo2 = actionButtonsContainer.f276974c;
                        com.avito.android.lib.design.button.b.a(button2, actionButtonInfo2.f276976c, false);
                        button2.setAppearanceFromAttr(actionButtonInfo2.f276975b);
                        button2.setOnClickListener(new A(7, nVar));
                    }
                    D6.G(button2, z13);
                    com.avito.android.service_booking_day_settings.daysettings.h hVar6 = daySettingsFragment.f276698t0;
                    if (hVar6 == null) {
                        hVar6 = null;
                    }
                    hVar6.f276872b.setTitle(dayScheduleInfo.f276997b);
                    com.avito.android.service_booking_day_settings.daysettings.h hVar7 = daySettingsFragment.f276698t0;
                    if (hVar7 == null) {
                        hVar7 = null;
                    }
                    com.avito.android.service_booking_day_settings.daysettings.f fVar = new com.avito.android.service_booking_day_settings.daysettings.f(dVar);
                    I5.a(hVar7.f276877g, dayInfo.f276995c, false);
                    Switcher switcher = hVar7.f276878h;
                    switcher.setOnCheckedChangeListener(null);
                    boolean z14 = dayInfo.f276994b;
                    switcher.setChecked(z14);
                    D6.G(switcher, true);
                    switcher.setOnClickListener(new com.avito.android.service_booking_day_settings.daysettings.l(i12, fVar, hVar7));
                    com.avito.android.service_booking_day_settings.daysettings.h hVar8 = daySettingsFragment.f276698t0;
                    if (hVar8 == null) {
                        hVar8 = null;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z14);
                    DaySettingsState.WorkHoursInfo workHoursInfo = dayScheduleInfo.f277001f;
                    I5.a(hVar8.f276884n, workHoursInfo != null ? workHoursInfo.f277030b : null, false);
                    Boolean bool = Boolean.TRUE;
                    D6.F(hVar8.f276881k, boolValueOf.equals(bool));
                    String strA = C49997a.a((workHoursInfo == null || (timePeriod = workHoursInfo.f277031c) == null) ? null : timePeriod.f277026b);
                    Input input = hVar8.f276885o;
                    Input.t(input, strA, false, 6);
                    String strA2 = C49997a.a(workHoursInfo.f277031c.f277027c);
                    Input input2 = hVar8.f276886p;
                    Input.t(input2, strA2, false, 6);
                    input.setOnClickListener(new com.avito.android.seller_promotions.b(8, dVar));
                    input2.setOnClickListener(new com.avito.android.seller_promotions.b(9, dVar));
                    com.avito.android.service_booking_day_settings.daysettings.h hVar9 = daySettingsFragment.f276698t0;
                    if (hVar9 == null) {
                        hVar9 = null;
                    }
                    AttributedText attributedText = dayScheduleInfo.f277003h;
                    boolean z15 = attributedText != null;
                    TextView textView = hVar9.f276888r;
                    if (z15) {
                        com.avito.android.util.text.j.a(textView, attributedText, null);
                    }
                    D6.G(textView, z15);
                    final com.avito.android.service_booking_day_settings.daysettings.h hVar10 = daySettingsFragment.f276698t0;
                    if (hVar10 == null) {
                        hVar10 = null;
                    }
                    if (D6.y(hVar10.f276874d)) {
                        r rVar = new r(dVar);
                        final s sVar = new s(dVar);
                        DaySettingsState.SaveTooltip saveTooltip = dayScheduleInfo.f277002g;
                        if (saveTooltip != null && !showElements.f277023f) {
                            com.avito.android.lib.design.tooltip.k kVar = hVar10.f276880j;
                            if (kVar != null) {
                                kVar.dismiss();
                            }
                            com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(hVar10.f276871a.getContext(), 0, 0, 6, null);
                            r.d dVar2 = new r.d(new i.a(new b.a()));
                            dVar2.f181263d = new r.a(new i.a(new b.a()));
                            kVar2.f181224j = dVar2;
                            int i14 = kVar2.f181229o;
                            kVar2.f181228n = -1;
                            kVar2.f181229o = i14;
                            kVar2.f181225k = true;
                            com.avito.android.lib.design.tooltip.p.a(kVar2, new t(saveTooltip, kVar2, rVar));
                            hVar10.f276880j = kVar2;
                            kVar2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.avito.android.service_booking_day_settings.daysettings.i
                                @Override // android.widget.PopupWindow.OnDismissListener
                                public final void onDismiss() {
                                    hVar10.f276880j = null;
                                    sVar.invoke();
                                }
                            });
                            com.avito.android.lib.design.tooltip.k kVar3 = hVar10.f276880j;
                            if (kVar3 != null) {
                                kVar3.f(hVar10.f276875e);
                            }
                        }
                    }
                    com.avito.android.service_booking_day_settings.daysettings.a aVar2 = daySettingsFragment.f276699u0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    aVar2.getClass();
                    boolean z16 = showElements.f277022e;
                    DaySettingsState.BreaksInfo breaksInfo = daySettingsState2.f276971h;
                    boolean z17 = breaksInfo != null && z16;
                    TextView textView2 = aVar2.f276716d;
                    D6.G(textView2, z17);
                    ViewGroup viewGroup = aVar2.f276718f;
                    D6.G(viewGroup, z17);
                    D6.G(aVar2.f276717e, z17);
                    if (breaksInfo != null) {
                        textView2.setText(breaksInfo.f276984b);
                        if (z16) {
                            aVar2.f276719g.setText(breaksInfo.f276985c);
                            List<SettingsBreakItem> list = breaksInfo.f276986d;
                            aVar2.f276714b.c(new UV0.c(list));
                            D6.G(viewGroup, list.size() < breaksInfo.f276987e);
                            aVar2.f276713a.notifyDataSetChanged();
                        }
                    }
                    com.avito.android.service_booking_day_settings.daysettings.h hVar11 = daySettingsFragment.f276698t0;
                    if (hVar11 == null) {
                        hVar11 = null;
                    }
                    if (!Boolean.valueOf(showElements.f277024g).equals(bool) || (saveScheduleInfo = dayScheduleInfo.f277004i) == null) {
                        Dialog dialog = hVar11.f276890t;
                        if (dialog != null) {
                            N0.a(dialog);
                        }
                    } else {
                        Dialog dialogC = hVar11.f276890t;
                        if (dialogC == null) {
                            com.avito.android.service_booking_utils.save_schedule_modal.f fVar2 = hVar11.f276889s;
                            fVar2.f278393c = saveScheduleInfo.f277010b;
                            fVar2.f278394d = saveScheduleInfo.f277011c;
                            DaySettingsState.SaveScheduleInfo.ActionButtonItem actionButtonItem = saveScheduleInfo.f277012d;
                            fVar2.a(actionButtonItem.f277015b, actionButtonItem.f277016c, new p(dVar));
                            DaySettingsState.SaveScheduleInfo.ActionButtonItem actionButtonItem2 = saveScheduleInfo.f277013e;
                            fVar2.b(actionButtonItem2.f277015b, actionButtonItem2.f277016c, new q(dVar));
                            dialogC = fVar2.c();
                        }
                        hVar11.f276890t = dialogC;
                        dialogC.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.avito.android.service_booking_day_settings.daysettings.k
                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                ((d) dVar).invoke(new InterfaceC50300a.m(saveScheduleInfo.f277014f));
                            }
                        });
                        Dialog dialog2 = hVar11.f276890t;
                        if (dialog2 != null) {
                            com.avito.android.lib.util.g.a(dialog2);
                        }
                    }
                    com.avito.android.service_booking_day_settings.daysettings.h hVar12 = daySettingsFragment.f276698t0;
                    if (hVar12 == null) {
                        hVar12 = null;
                    }
                    Button button3 = hVar12.f276873c;
                    boolean z18 = showElements.f277021d;
                    button3.setLoading(z18);
                    boolean z19 = true ^ z18;
                    D6.F(hVar12.f276875e, z19);
                    D6.F(hVar12.f276883m, z19);
                    if (!z18 && !z16) {
                        D6.F(hVar12.f276881k, z18);
                    }
                    D6.F(hVar12.f276887q, showElements.f277025h);
                    ((com.avito.android.service_booking_utils.save_schedule_modal.b) hVar12.f276889s.f278392b.getValue()).setViewLoading(z18);
                    final com.avito.android.service_booking_day_settings.daysettings.h hVar13 = daySettingsFragment.f276698t0;
                    if (hVar13 == null) {
                        hVar13 = null;
                    }
                    final DaySettingsState.ToastMessage toastMessage = dayScheduleInfo.f277006k;
                    hVar13.f276871a.post(new Runnable() { // from class: com.avito.android.service_booking_day_settings.daysettings.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.avito.android.lib.design.toast_bar.k kVarB;
                            h hVar14 = hVar13;
                            com.avito.android.lib.design.toast_bar.k kVar4 = hVar14.f276879i;
                            if (kVar4 != null) {
                                kVar4.f();
                            }
                            DaySettingsState.ToastMessage toastMessage2 = toastMessage;
                            if (toastMessage2 != null) {
                                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                                List listSingletonList = Collections.singletonList(new c.a.C3719a(toastMessage2.f277028b.k0(hVar14.f276871a.getContext()), true, null, o.f277076l, 4, null));
                                ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
                                kVarB = com.avito.android.component.toast.c.b(cVar, hVar14.f276875e, toastMessage2.f277029c, null, listSingletonList, null, f.a.f125253a, -1, toastBarPosition, null, false, false, null, null, 3978);
                            } else {
                                kVarB = null;
                            }
                            hVar14.f276879i = kVarB;
                        }
                    });
                    com.avito.android.service_booking_day_settings.daysettings.h hVar14 = daySettingsFragment.f276698t0;
                    com.avito.android.service_booking_day_settings.daysettings.h hVar15 = hVar14 == null ? null : hVar14;
                    Context context = hVar15.f276871a.getContext();
                    if (context != null) {
                        PrintableText printableText = dayScheduleInfo.f277005j;
                        ComponentContainer componentContainer = hVar15.f276882l;
                        if (printableText != null) {
                            componentContainer.q(printableText.k0(context));
                        } else {
                            componentContainer.k();
                        }
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DaySettingsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<InterfaceC50300a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC50300a interfaceC50300a) {
            ((v) this.receiver).accept(interfaceC50300a);
            return G0.f406611a;
        }
    }

    /* compiled from: DaySettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/service_booking_day_settings/daysettings/DaySettingsFragment$f", "Landroidx/activity/x;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends androidx.view.x {
        public f() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = DaySettingsFragment.f276691v0;
            DaySettingsFragment.this.r5().accept(InterfaceC50300a.c.f443571a);
        }
    }

    /* compiled from: DaySettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<Integer, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            a aVar = DaySettingsFragment.f276691v0;
            DaySettingsFragment.this.r5().accept(new InterfaceC50300a.InterfaceC12928a.f(iIntValue));
            return G0.f406611a;
        }
    }

    /* compiled from: DaySettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "id", "Lorg/threeten/bp/g;", CrashHianalyticsData.TIME, "startTime", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lorg/threeten/bp/g;Lorg/threeten/bp/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.q<String, org.threeten.bp.g, org.threeten.bp.g, G0> {
        public h() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(String str, org.threeten.bp.g gVar, org.threeten.bp.g gVar2) {
            String str2 = str;
            org.threeten.bp.g gVarC = gVar;
            org.threeten.bp.g gVar3 = gVar2;
            a aVar = DaySettingsFragment.f276691v0;
            v vVarR5 = DaySettingsFragment.this.r5();
            if (gVarC == null) {
                gVarC = gVar3 != null ? gVar3.C(15L) : null;
            }
            vVarR5.accept(new InterfaceC50300a.InterfaceC12928a.d(str2, gVarC));
            return G0.f406611a;
        }
    }

    /* compiled from: DaySettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "id", "Lorg/threeten/bp/g;", CrashHianalyticsData.TIME, "startTime", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lorg/threeten/bp/g;Lorg/threeten/bp/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.q<String, org.threeten.bp.g, org.threeten.bp.g, G0> {
        public i() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(String str, org.threeten.bp.g gVar, org.threeten.bp.g gVar2) {
            String str2 = str;
            org.threeten.bp.g gVarC = gVar;
            org.threeten.bp.g gVar3 = gVar2;
            a aVar = DaySettingsFragment.f276691v0;
            v vVarR5 = DaySettingsFragment.this.r5();
            if (gVarC == null) {
                gVarC = gVar3 != null ? gVar3.C(15L) : null;
            }
            vVarR5.accept(new InterfaceC50300a.InterfaceC12928a.b(str2, gVarC));
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f276707m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.l lVar) {
            super(0);
            this.f276707m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(DaySettingsFragment.this, this.f276707m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return DaySettingsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f276709l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f276709l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f276709l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f276710l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f276710l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f276710l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f276711l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f276711l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f276711l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: DaySettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/service_booking_day_settings/daysettings/v;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/service_booking_day_settings/daysettings/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.l<C23060r0, v> {
        public o() {
            super(1);
        }

        @Override // Y41.l
        public final v invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            v.a aVar = DaySettingsFragment.this.f276692n0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public DaySettingsFragment() {
        super(0, 1, null);
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f276693o0 = new O0(m0.f406844a.b(v.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static void q5(DaySettingsFragment daySettingsFragment, String str, Bundle bundle) {
        TimePickerDialogFragment.f132645j0.getClass();
        TimePickerDialogFragment.Result result = (TimePickerDialogFragment.Result) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("result.key", TimePickerDialogFragment.Result.class) : bundle.getParcelable("result.key"));
        if (result instanceof TimePickerDialogFragment.Result.Success) {
            org.threeten.bp.g gVar = ((TimePickerDialogFragment.Result.Success) result).f132649b.f421949c;
            switch (str.hashCode()) {
                case -979237336:
                    if (str.equals("request.time_picker.to")) {
                        daySettingsFragment.r5().accept(new InterfaceC50300a.r(gVar));
                        break;
                    }
                    break;
                case -449652713:
                    if (str.equals("request.time_picker.from")) {
                        daySettingsFragment.r5().accept(new InterfaceC50300a.b(gVar));
                        break;
                    }
                    break;
                case 3350439:
                    if (str.equals("break.time_picker.from")) {
                        daySettingsFragment.r5().accept(new InterfaceC50300a.InterfaceC12928a.e(gVar));
                        break;
                    }
                    break;
                case 1345253816:
                    if (str.equals("break.time_picker.to")) {
                        daySettingsFragment.r5().accept(new InterfaceC50300a.InterfaceC12928a.c(gVar));
                        break;
                    }
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f276694p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_day_settings, viewGroup, false);
        this.f276698t0 = new com.avito.android.service_booking_day_settings.daysettings.h(viewInflate);
        com.avito.konveyor.adapter.j jVar = this.f276697s0;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f276696r0;
        if (aVar == null) {
            aVar = null;
        }
        this.f276699u0 = new com.avito.android.service_booking_day_settings.daysettings.a(viewInflate, jVar, aVar, new b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f276694p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, r5(), new c(1, this, DaySettingsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsOneTimeEvent;)V", 0), new d());
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f276694p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        com.avito.android.service_booking_day_settings.daysettings.h hVar = this.f276698t0;
        if (hVar != null) {
            final int i12 = 0;
            View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: com.avito.android.service_booking_day_settings.daysettings.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ DaySettingsFragment f276751c;

                {
                    this.f276751c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DaySettingsFragment daySettingsFragment = this.f276751c;
                    switch (i12) {
                        case 0:
                            DaySettingsFragment.a aVar = DaySettingsFragment.f276691v0;
                            daySettingsFragment.r5().accept(InterfaceC50300a.c.f443571a);
                            break;
                        default:
                            DaySettingsFragment.a aVar2 = DaySettingsFragment.f276691v0;
                            daySettingsFragment.r5().accept(new InterfaceC50300a.j());
                            break;
                    }
                }
            };
            MaterialToolbar materialToolbar = hVar.f276872b;
            materialToolbar.setNavigationOnClickListener(onClickListener);
            materialToolbar.m(R.menu.sb_help_menu);
            View viewFindViewById = view.findViewById(R.id.link_help_textview);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById;
            textView.setText(textView.getResources().getText(R.string.service_booking_help_menu_text));
            final int i13 = 1;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.service_booking_day_settings.daysettings.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ DaySettingsFragment f276751c;

                {
                    this.f276751c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DaySettingsFragment daySettingsFragment = this.f276751c;
                    switch (i13) {
                        case 0:
                            DaySettingsFragment.a aVar = DaySettingsFragment.f276691v0;
                            daySettingsFragment.r5().accept(InterfaceC50300a.c.f443571a);
                            break;
                        default:
                            DaySettingsFragment.a aVar2 = DaySettingsFragment.f276691v0;
                            daySettingsFragment.r5().accept(new InterfaceC50300a.j());
                            break;
                    }
                }
            });
            D6.H(textView);
        }
        e eVar = new e(1, r5(), v.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f276695q0;
        if (aVar == null) {
            aVar = null;
        }
        C43175k.K(new C43197r1(new com.avito.android.service_booking_day_settings.daysettings.c(eVar, null), y.a(aVar.d9())), C22984Q.a(getViewLifecycleOwner()));
        requireActivity().getF21241d().a(getViewLifecycleOwner(), new f());
        getChildFragmentManager().p0("request.time_picker.from", this, new com.avito.android.offlinization.ui.a(this, 23));
        getChildFragmentManager().p0("request.time_picker.to", this, new com.avito.android.offlinization.ui.a(this, 23));
        getChildFragmentManager().p0("break.time_picker.from", this, new com.avito.android.offlinization.ui.a(this, 23));
        getChildFragmentManager().p0("break.time_picker.to", this, new com.avito.android.offlinization.ui.a(this, 23));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle bundleRequireArguments = requireArguments();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("day_key_arg", DaySettingsFragmentArgs.class) : bundleRequireArguments.getParcelable("day_key_arg");
        if (parcelable == null) {
            throw new IllegalArgumentException("day_key_arg is not provided");
        }
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.service_booking_day_settings.di.c.a().a(new C28478k(DayScheduleScreen.f277078d, com.avito.android.analytics.screens.s.c(this), "serviceBookingDaySchedule"), cv.c.b(this), (com.avito.android.service_booking_day_settings.di.i) C29972i.a(C29972i.b(this), com.avito.android.service_booking_day_settings.di.i.class), new g(), new h(), new i(), ((DaySettingsFragmentArgs) parcelable).f276684b, getChildFragmentManager()).Z9(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f276694p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final v r5() {
        return (v) this.f276693o0.getValue();
    }
}
