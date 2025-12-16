package com.avito.android.edit_address.dialog.time_interval;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.edit_address.entity.TimeInterval;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TimeIntervalPicker.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_address/dialog/time_interval/TimeIntervalPicker;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "Mode", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TimeIntervalPicker extends com.avito.android.lib.design.bottom_sheet.d {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TimeIntervalPicker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/dialog/time_interval/TimeIntervalPicker$Mode;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Mode {

        /* renamed from: b, reason: collision with root package name */
        public static final Mode f145857b;

        /* renamed from: c, reason: collision with root package name */
        public static final Mode f145858c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Mode[] f145859d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f145860e;

        static {
            Mode mode = new Mode("WORK", 0);
            f145857b = mode;
            Mode mode2 = new Mode("BREAK", 1);
            f145858c = mode2;
            Mode[] modeArr = {mode, mode2};
            f145859d = modeArr;
            f145860e = kotlin.enums.c.a(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f145859d.clone();
        }
    }

    /* compiled from: TimeIntervalPicker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f145861l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Mode f145862m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ TimeInterval f145863n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ l<TimeInterval, G0> f145864o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ TimeIntervalPicker f145865p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Context context, Mode mode, TimeInterval timeInterval, l<? super TimeInterval, G0> lVar, TimeIntervalPicker timeIntervalPicker) {
            super(1);
            this.f145861l = context;
            this.f145862m = mode;
            this.f145863n = timeInterval;
            this.f145864o = lVar;
            this.f145865p = timeIntervalPicker;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            Resources resources = this.f145861l.getResources();
            Mode mode = this.f145862m;
            l<TimeInterval, G0> lVar = this.f145864o;
            TimeInterval timeInterval = this.f145863n;
            b bVar = new b(resources, mode, timeInterval, lVar);
            h hVar = new h(view2, this.f145865p, mode == Mode.f145857b, bVar);
            bVar.f145873h = hVar;
            I5.a(hVar.f145888f, bVar.f145871f, false);
            if (timeInterval != null) {
                if (timeInterval.f145911d) {
                    hVar.f145889g.setChecked(true);
                } else {
                    bVar.c(timeInterval.f145909b);
                    bVar.b(timeInterval.f145910c);
                }
            }
            return G0.f406611a;
        }
    }

    public TimeIntervalPicker(@k Context context, @k Mode mode, @Y61.l TimeInterval timeInterval, @k l<? super TimeInterval, G0> lVar) {
        super(context, 0, 2, null);
        E(R.layout.ext_profile_address_edit_period_dialog, true, new a(context, mode, timeInterval, lVar, this));
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
    }
}
