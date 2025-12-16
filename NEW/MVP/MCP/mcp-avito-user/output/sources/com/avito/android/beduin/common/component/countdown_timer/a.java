package com.avito.android.beduin.common.component.countdown_timer;

import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.util.f;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.serp_core.timer.CountDownTimerWidget;
import com.avito.android.util.y6;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import sK0.C48063a;
import ts0.C48712a;

/* compiled from: BeduinCountDownTimerComponent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/countdown_timer/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/countdown_timer/BeduinCountDownTimerModel;", "Lcom/avito/android/serp_core/timer/CountDownTimerWidget;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinCountDownTimerModel, CountDownTimerWidget> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101101e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinCountDownTimerModel f101102f;

    /* compiled from: BeduinCountDownTimerComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.countdown_timer.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3032a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101103a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f101104b;

        static {
            int[] iArr = new int[BeduinCountDownTimerStyle.values().length];
            try {
                iArr[BeduinCountDownTimerStyle.BLACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinCountDownTimerStyle.WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f101103a = iArr;
            int[] iArr2 = new int[TimeType.values().length];
            try {
                iArr2[TimeType.UTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TimeType.DEVICE_LOCAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f101104b = iArr2;
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinCountDownTimerModel beduinCountDownTimerModel) {
        this.f101101e = interfaceC15523b;
        this.f101102f = beduinCountDownTimerModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101102f;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        CountDownTimerWidget countDownTimerWidget = new CountDownTimerWidget(new ContextThemeWrapper(viewGroup.getContext(), com.avito.android.beduin.common.component.a.a(this.f101102f.getTheme())), null, 0, 4, null);
        countDownTimerWidget.setId(R.id.beduin_countdown_timer);
        countDownTimerWidget.setLayoutParams(layoutParams);
        return countDownTimerWidget;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        long jC2;
        CountDownTimerWidget countDownTimerWidget = (CountDownTimerWidget) view;
        BeduinCountDownTimerModel beduinCountDownTimerModel = this.f101102f;
        BeduinCountDown countdown = beduinCountDownTimerModel.getCountdown();
        int i12 = C3032a.f101104b[countdown.e().ordinal()];
        if (i12 == 1) {
            jC2 = countdown.getEndDate();
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jC2 = countdown.getEndDate() - ZonedDateTime.now(ZoneId.systemDefault()).getOffset().getTotalSeconds();
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(jC2);
        long millis2 = timeUnit.toMillis(beduinCountDownTimerModel.getCountdown().d());
        C48712a c48712a = countDownTimerWidget.f273985i;
        if (c48712a != null) {
            ts0.b bVar = c48712a.f439608g;
            if (bVar != null) {
                bVar.cancel();
            }
            c48712a.f439608g = null;
            c48712a.f439607f = null;
        }
        C48712a c48712a2 = new C48712a(millis, millis2, 0L, null, null, 28, null);
        c48712a2.b(countDownTimerWidget);
        countDownTimerWidget.f273985i = c48712a2;
        if (beduinCountDownTimerModel.getCustomStyle() != null) {
            countDownTimerWidget.setAppearance(R.style.BeduinCountDownTimer);
            CellSize cellSizeD = beduinCountDownTimerModel.getCustomStyle().getCellSize();
            if (cellSizeD != null) {
                countDownTimerWidget.c(y6.b(cellSizeD.getWidth()), y6.b(cellSizeD.getHeight()));
                countDownTimerWidget.setSeparatorMargin(y6.b(cellSizeD.c()));
            }
            UniversalColor universalColorC = beduinCountDownTimerModel.getCustomStyle().c();
            Context context = countDownTimerWidget.getContext();
            C48063a c48063a = C48063a.f437606a;
            countDownTimerWidget.setCellBackgroundColorTint(c48063a.a(context, universalColorC));
            countDownTimerWidget.setSeparatorTextColor(c48063a.a(countDownTimerWidget.getContext(), beduinCountDownTimerModel.getCustomStyle().e()));
            countDownTimerWidget.setCellTextAppearance(f.r(countDownTimerWidget.getContext(), beduinCountDownTimerModel.getCustomStyle().f()));
            countDownTimerWidget.setCellTextColor(c48063a.a(countDownTimerWidget.getContext(), beduinCountDownTimerModel.getCustomStyle().e()));
        } else {
            int i13 = C3032a.f101103a[beduinCountDownTimerModel.getStyle().ordinal()];
            if (i13 == 1) {
                countDownTimerWidget.setAppearance(R.style.BeduinCountDownTimer_Black);
            } else if (i13 == 2) {
                countDownTimerWidget.setAppearance(R.style.BeduinCountDownTimer_White);
            }
        }
        countDownTimerWidget.setOnStepListener(new b(this));
        countDownTimerWidget.setOnFinishListener(new c(this));
    }
}
