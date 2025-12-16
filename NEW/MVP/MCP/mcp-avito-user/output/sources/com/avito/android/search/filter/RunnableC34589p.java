package com.avito.android.search.filter;

import Mz0.InterfaceC14550b;
import android.app.job.JobParameters;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.remote.model.Radius;
import com.avito.android.search.filter.location_filter.LocationFiltersDialogFragment;
import com.avito.android.search_view.Toolbar23SearchView;
import com.avito.android.select.ResetResult;
import com.avito.android.select.SelectResult;
import com.avito.android.service_booking.mvi.step.C34912f;
import com.avito.android.str_calendar.booking_calendar.StrBookingCalendarFragment;
import com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog;
import com.avito.android.tariff.cpx.configure.advance.items.chips.a;
import com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment;
import com.avito.android.util.D6;
import com.avito.android.util.ExpandablePanelLayout;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.audio.i;
import com.google.android.exoplayer2.video.n;
import com.google.android.exoplayer2.video.spherical.k;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.vk.id.captcha.sensors.SensorsDataRepositoryImpl;
import cw0.InterfaceC39426c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import ow0.InterfaceC44952b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.search.filter.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC34589p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f263746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f263747c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f263748d;

    public /* synthetic */ RunnableC34589p(int i12, Object obj, Object obj2) {
        this.f263746b = i12;
        this.f263747c = obj;
        this.f263748d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20, types: [Y41.q, kotlin.jvm.internal.N] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f263747c;
        Object obj2 = this.f263748d;
        switch (this.f263746b) {
            case 0:
                InterfaceC34566e0 interfaceC34566e0 = ((FiltersFragment) obj).f261843t0;
                SelectResult selectResult = (SelectResult) obj2;
                (interfaceC34566e0 != null ? interfaceC34566e0 : null).j(selectResult.f264977b, selectResult.f264979d, selectResult.f264978c);
                break;
            case 1:
                InterfaceC34566e0 interfaceC34566e02 = ((FiltersFragment) obj).f261843t0;
                (interfaceC34566e02 != null ? interfaceC34566e02 : null).s((ResetResult) obj2);
                break;
            case 2:
                InterfaceC34566e0 interfaceC34566e03 = ((FiltersFragment) obj).f261843t0;
                (interfaceC34566e03 != null ? interfaceC34566e03 : null).o((Radius) obj2);
                break;
            case 3:
                int i12 = Chips.f178664L;
                ((com.avito.android.search.filter.adapter.chips.c) obj).f262146c.o((com.avito.android.lib.design.chips.h) obj2, false);
                break;
            case 4:
                int i13 = Chips.f178664L;
                ((com.avito.android.search.filter.adapter.chips.w) obj).f262188c.o((com.avito.android.lib.design.chips.h) obj2, false);
                break;
            case 5:
                com.avito.android.search.filter.location_filter.f fVar = ((LocationFiltersDialogFragment) obj).f263443l0;
                (fVar != null ? fVar : null).g((ArrayList) obj2);
                break;
            case 6:
                com.avito.android.search.filter.location_filter.f fVar2 = ((LocationFiltersDialogFragment) obj).f263443l0;
                SelectResult selectResult2 = (SelectResult) obj2;
                (fVar2 != null ? fVar2 : null).j(selectResult2.f264977b, selectResult2.f264979d, selectResult2.f264978c);
                break;
            case 7:
                com.avito.android.search.filter.location_filter.f fVar3 = ((LocationFiltersDialogFragment) obj).f263443l0;
                (fVar3 != null ? fVar3 : null).o((Radius) obj2);
                break;
            case 8:
                int i14 = Toolbar23SearchView.f264435C0;
                Toolbar23SearchView toolbar23SearchView = (Toolbar23SearchView) obj;
                toolbar23SearchView.G();
                ((Y41.a) obj2).invoke();
                toolbar23SearchView.f264477i0 = null;
                break;
            case 9:
                ((C34912f) obj).f274641c.c(new UV0.c((List) obj2));
                break;
            case 10:
                ((com.avito.android.lib.design.tooltip.k) obj).f((View) obj2);
                break;
            case 11:
                ((com.avito.android.short_term_rent.bookingform.j) obj).f281748i.F0(((InterfaceC39426c.a) obj2).f393076b);
                break;
            case 12:
                ((com.avito.android.short_term_rent.soft_booking.view.l) obj).e(((InterfaceC44952b.d) obj2).f422367a);
                break;
            case 13:
                RecyclerView.m layoutManager = ((RecyclerView) obj).getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.X0((Parcelable) obj2);
                    break;
                }
                break;
            case 14:
                MonthSelectorDialog monthSelectorDialog = (MonthSelectorDialog) obj;
                RecyclerView recyclerView = monthSelectorDialog.f290377k0;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                InterfaceC14550b.c cVar = (InterfaceC14550b.c) ((InterfaceC14550b) obj2);
                RecyclerView recyclerView2 = monthSelectorDialog.f290377k0;
                linearLayoutManager.b2(cVar.f11156a, (recyclerView2 != null ? recyclerView2 : null).getMeasuredHeight() / 2);
                break;
            case 15:
                if (((l0.a) obj).f406838b) {
                    com.avito.android.sx_address.new_address.view.r rVar = (com.avito.android.sx_address.new_address.view.r) obj2;
                    rVar.f293944n.p(rVar.f293942l.f293888a.getTop());
                    break;
                }
                break;
            case 16:
                int i15 = com.avito.android.tariff.cpx.configure.advance.items.chips.k.f295716e;
                int i16 = Chips.f178664L;
                ((Chips) obj).o((a.b) obj2, false);
                break;
            case 17:
                ((com.avito.android.tns_gallery.q) obj).f301552c.setBackground((ColorDrawable) obj2);
                break;
            case 18:
                TrxPromoDateRangePickerFragment.a aVar = TrxPromoDateRangePickerFragment.f303953r0;
                ((Picker) obj).setOnSelection((Y41.q<? super com.avito.android.lib.design.picker.k<?>, ? super com.avito.android.lib.design.picker.k<?>, ? super com.avito.android.lib.design.picker.k<?>, kotlin.G0>) obj2);
                break;
            case 19:
                int i17 = ExpandablePanelLayout.f318584n;
                TextView textView = (TextView) obj;
                ExpandablePanelLayout expandablePanelLayout = (ExpandablePanelLayout) obj2;
                if (textView.getLineCount() == 0 && !expandablePanelLayout.f318591h) {
                    textView.measure(View.MeasureSpec.makeMeasureSpec(expandablePanelLayout.getWidth(), BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(0, 0));
                }
                int lineCount = textView.getLineCount();
                int i18 = expandablePanelLayout.f318593j;
                if (lineCount > i18 && !expandablePanelLayout.f318591h) {
                    textView.setMaxLines(i18);
                    if (expandablePanelLayout.f318596m && expandablePanelLayout.f318593j > 0 && expandablePanelLayout.f318592i.length() > 2) {
                        int lineEnd = textView.getLayout().getLineEnd(expandablePanelLayout.f318593j - 1);
                        CharSequence charSequence = expandablePanelLayout.f318592i;
                        textView.setText(new SpannableStringBuilder(charSequence.subSequence(0, Character.offsetByCodePoints(charSequence, lineEnd, -1))).append((CharSequence) "…"));
                    }
                    TextView textView2 = expandablePanelLayout.f318589f;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    ExpandablePanelLayout.a aVar2 = expandablePanelLayout.f318594k;
                    if (aVar2 != null) {
                        aVar2.c();
                        break;
                    }
                } else {
                    textView.setMaxLines(Integer.MAX_VALUE);
                    TextView textView3 = expandablePanelLayout.f318589f;
                    if (textView3 != null) {
                        textView3.setVisibility(expandablePanelLayout.f318595l ? 0 : 8);
                        break;
                    }
                }
                break;
            case 20:
                View view = (View) obj;
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    Object[] objArr = view.getTop() >= viewGroup.getPaddingTop();
                    Object[] objArr2 = view.getBottom() <= viewGroup.getHeight() - viewGroup.getPaddingBottom();
                    Object[] objArr3 = view.getLeft() >= viewGroup.getPaddingLeft();
                    boolean z12 = view.getRight() <= viewGroup.getWidth() - viewGroup.getPaddingRight();
                    if (objArr != false && objArr2 != false && objArr3 != false && z12) {
                    }
                }
                D6.w((View) obj2);
                break;
            case 21:
                com.avito.android.widget_filters.ui.items.dates.l lVar = (com.avito.android.widget_filters.ui.items.dates.l) obj;
                androidx.fragment.app.H hE2 = lVar.f330383c.e();
                hE2.n(lVar.f330390j.getId(), (StrBookingCalendarFragment) obj2, null);
                hE2.f();
                break;
            case 22:
                int i19 = JobInfoSchedulerService.f343175b;
                ((JobInfoSchedulerService) obj).jobFinished((JobParameters) obj2, false);
                break;
            case 23:
                i.a aVar3 = (i.a) obj;
                aVar3.getClass();
                int i22 = com.google.android.exoplayer2.util.U.f348106a;
                aVar3.f343997b.L2((String) obj2);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                ((com.google.android.exoplayer2.upstream.r) obj2).a(((com.google.android.exoplayer2.util.B) obj).c());
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                n.a aVar4 = (n.a) obj;
                aVar4.getClass();
                int i23 = com.google.android.exoplayer2.util.U.f348106a;
                aVar4.f348319b.onVideoSizeChanged((com.google.android.exoplayer2.video.o) obj2);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                n.a aVar5 = (n.a) obj;
                aVar5.getClass();
                int i24 = com.google.android.exoplayer2.util.U.f348106a;
                aVar5.f348319b.I2((String) obj2);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                n.a aVar6 = (n.a) obj;
                aVar6.getClass();
                int i25 = com.google.android.exoplayer2.util.U.f348106a;
                aVar6.f348319b.g3((Exception) obj2);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                com.google.android.exoplayer2.video.spherical.k kVar = (com.google.android.exoplayer2.video.spherical.k) obj;
                SurfaceTexture surfaceTexture = kVar.f348387h;
                Surface surface = kVar.f348388i;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) obj2;
                Surface surface2 = new Surface(surfaceTexture2);
                kVar.f348387h = surfaceTexture2;
                kVar.f348388i = surface2;
                Iterator<k.b> it = kVar.f348381b.iterator();
                while (it.hasNext()) {
                    it.next().f(surface2);
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                    break;
                }
                break;
            default:
                SensorsDataRepositoryImpl.a((Y41.l) obj, (List) ((ArrayList) obj2));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC34589p(Picker picker, Y41.q qVar) {
        this.f263746b = 18;
        this.f263747c = picker;
        this.f263748d = (kotlin.jvm.internal.N) qVar;
    }
}
