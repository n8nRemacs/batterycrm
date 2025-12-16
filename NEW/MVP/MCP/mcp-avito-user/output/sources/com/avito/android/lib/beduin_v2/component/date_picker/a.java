package com.avito.android.lib.beduin_v2.component.date_picker;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.beduin.v2.avito.component.date_picker.state.AvitoDatePickerState;
import com.avito.beduin.v2.avito.component.date_picker.state.x;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.ranges.o;
import kotlin.text.C43066x;

/* compiled from: DatePickerComponent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/date_picker/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState;", "Lcom/avito/android/lib/beduin_v2/component/date_picker/j;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_date-picker"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36333c<AvitoDatePickerState, j> {

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final C5183a f175531q = new C5183a(null);

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.date_picker.utils.f f175532m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public AvitoDatePickerState.DatePickerDisableDatesOption f175533n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public Object f175534o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public Object f175535p;

    /* compiled from: DatePickerComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/date_picker/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_date-picker"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.date_picker.a$a, reason: collision with other inner class name */
    public static final class C5183a extends n<AvitoDatePickerState> {
        public /* synthetic */ C5183a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @Y61.k
        public final InterfaceC36343m b(@Y61.k A a12) {
            return new a();
        }

        public C5183a() {
            super(com.avito.beduin.v2.avito.component.date_picker.state.i.f334185c);
        }
    }

    /* compiled from: DatePickerComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175536a;

        static {
            int[] iArr = new int[AvitoDatePickerState.DatePickerDisableDatesOption.values().length];
            try {
                AvitoDatePickerState.DatePickerDisableDatesOption[] datePickerDisableDatesOptionArr = AvitoDatePickerState.DatePickerDisableDatesOption.f334169b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AvitoDatePickerState.DatePickerDisableDatesOption[] datePickerDisableDatesOptionArr2 = AvitoDatePickerState.DatePickerDisableDatesOption.f334169b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AvitoDatePickerState.DatePickerDisableDatesOption[] datePickerDisableDatesOptionArr3 = AvitoDatePickerState.DatePickerDisableDatesOption.f334169b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AvitoDatePickerState.DatePickerDisableDatesOption[] datePickerDisableDatesOptionArr4 = AvitoDatePickerState.DatePickerDisableDatesOption.f334169b;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f175536a = iArr;
        }
    }

    public a() {
        super(null, 1, null);
        com.akita.compose.component.date_picker.utils.f.f61416g.getClass();
        this.f175532m = new com.akita.compose.component.date_picker.utils.f(null, null, null, null, null, null, 63, null);
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f175534o = c42784z0;
        this.f175535p = c42784z0;
    }

    public static o u(x xVar) {
        Long lZ02 = C43066x.z0(xVar.f334225a.f14989a);
        if (lZ02 != null) {
            long jLongValue = lZ02.longValue();
            Long lZ03 = C43066x.z0(xVar.f334226b.f14989a);
            if (lZ03 != null) {
                return new o(jLongValue, lZ03.longValue());
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.view.View r13, com.avito.beduin.v2.theme.k r14, com.avito.beduin.v2.avito.component.date_picker.state.AvitoDatePickerState r15) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.date_picker.a.l(android.view.View, com.avito.beduin.v2.theme.k, java.lang.Object):void");
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new j(viewGroup.getContext());
    }
}
