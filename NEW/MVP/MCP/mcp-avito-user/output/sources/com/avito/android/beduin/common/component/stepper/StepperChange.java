package com.avito.android.beduin.common.component.stepper;

import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StepperChange.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/stepper/StepperChange;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StepperChange implements e.a<BeduinStepperModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final StepperChange f102698c;

    /* renamed from: d, reason: collision with root package name */
    public static final StepperChange f102699d;

    /* renamed from: e, reason: collision with root package name */
    public static final StepperChange f102700e;

    /* renamed from: f, reason: collision with root package name */
    public static final StepperChange f102701f;

    /* renamed from: g, reason: collision with root package name */
    public static final StepperChange f102702g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ StepperChange[] f102703h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f102704i;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f102705b;

    /* compiled from: StepperChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<BeduinStepperModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f102706l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinStepperModel beduinStepperModel) {
            return Integer.valueOf(beduinStepperModel.getValue());
        }
    }

    /* compiled from: StepperChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<BeduinStepperModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f102707l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinStepperModel beduinStepperModel) {
            return Integer.valueOf(beduinStepperModel.getMinValue());
        }
    }

    /* compiled from: StepperChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.l<BeduinStepperModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f102708l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinStepperModel beduinStepperModel) {
            return Integer.valueOf(beduinStepperModel.getMaxValue());
        }
    }

    /* compiled from: StepperChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.l<BeduinStepperModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f102709l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinStepperModel beduinStepperModel) {
            return beduinStepperModel.getErrorMessage();
        }
    }

    /* compiled from: StepperChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.l<BeduinStepperModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f102710l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinStepperModel beduinStepperModel) {
            return beduinStepperModel.getError();
        }
    }

    static {
        StepperChange stepperChange = new StepperChange(0, a.f102706l, "Value");
        f102698c = stepperChange;
        StepperChange stepperChange2 = new StepperChange(1, b.f102707l, "MinValue");
        f102699d = stepperChange2;
        StepperChange stepperChange3 = new StepperChange(2, c.f102708l, "MaxValue");
        f102700e = stepperChange3;
        StepperChange stepperChange4 = new StepperChange(3, d.f102709l, "ErrorMessage");
        f102701f = stepperChange4;
        StepperChange stepperChange5 = new StepperChange(4, e.f102710l, "Error");
        f102702g = stepperChange5;
        StepperChange[] stepperChangeArr = {stepperChange, stepperChange2, stepperChange3, stepperChange4, stepperChange5};
        f102703h = stepperChangeArr;
        f102704i = kotlin.enums.c.a(stepperChangeArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StepperChange(int i12, Y41.l lVar, String str) {
        this.f102705b = (N) lVar;
    }

    public static StepperChange valueOf(String str) {
        return (StepperChange) Enum.valueOf(StepperChange.class, str);
    }

    public static StepperChange[] values() {
        return (StepperChange[]) f102703h.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        return BeduinStepperModel.a((BeduinStepperModel) beduinModel, null, -1, null, null, 899);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l<com.avito.android.beduin.common.component.stepper.BeduinStepperModel, java.lang.Object>, kotlin.jvm.internal.N] */
    @Y61.k
    public final Y41.l<BeduinStepperModel, Object> b() {
        return this.f102705b;
    }
}
