package com.avito.android.beduin.common.component.input;

import Y41.l;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.input.multi_line.MultiLineInputModel;
import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import com.avito.android.beduin_models.BeduinModel;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InputChange.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/input/InputChange;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/component/input/BeduinInputModel;", "e", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputChange implements e.a<BeduinInputModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final InputChange f101528c;

    /* renamed from: d, reason: collision with root package name */
    public static final InputChange f101529d;

    /* renamed from: e, reason: collision with root package name */
    public static final InputChange f101530e;

    /* renamed from: f, reason: collision with root package name */
    public static final InputChange f101531f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ InputChange[] f101532g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f101533h;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f101534b;

    /* compiled from: InputChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/input/BeduinInputModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<BeduinInputModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f101535l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinInputModel beduinInputModel) {
            BeduinInputModel beduinInputModel2 = beduinInputModel;
            return new e(beduinInputModel2.getText(), beduinInputModel2.getTextVersion());
        }
    }

    /* compiled from: InputChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/input/BeduinInputModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements l<BeduinInputModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f101536l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinInputModel beduinInputModel) {
            BeduinInputModel beduinInputModel2 = beduinInputModel;
            return new Q(beduinInputModel2.getErrorMessage(), beduinInputModel2.getShowErrorMessage());
        }
    }

    /* compiled from: InputChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/input/BeduinInputModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements l<BeduinInputModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f101537l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinInputModel beduinInputModel) {
            return beduinInputModel.getShowRightIcon();
        }
    }

    /* compiled from: InputChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/input/BeduinInputModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements l<BeduinInputModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f101538l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinInputModel beduinInputModel) {
            return beduinInputModel.isEnabled();
        }
    }

    /* compiled from: InputChange.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/input/InputChange$e;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f101539a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f101540b;

        public e(@Y61.k String str, @Y61.l Integer num) {
            this.f101539a = str;
            this.f101540b = num;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            int iIntValue = BeduinInputModel.MIN_TEXT_VERSION;
            Integer num = this.f101540b;
            int iIntValue2 = num != null ? num.intValue() : Integer.MIN_VALUE;
            e eVar = (e) obj;
            Integer num2 = eVar.f101540b;
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
            return L.f(this.f101539a, eVar.f101539a) || (iIntValue2 < iIntValue);
        }

        public final int hashCode() {
            return Objects.hash(this.f101539a, this.f101540b);
        }
    }

    static {
        InputChange inputChange = new InputChange(0, a.f101535l, "Text");
        f101528c = inputChange;
        InputChange inputChange2 = new InputChange(1, b.f101536l, "ErrorMessageToDisplay");
        f101529d = inputChange2;
        InputChange inputChange3 = new InputChange(2, c.f101537l, "ShowRightIcon");
        f101530e = inputChange3;
        InputChange inputChange4 = new InputChange(3, d.f101538l, "IsEnabled");
        f101531f = inputChange4;
        InputChange[] inputChangeArr = {inputChange, inputChange2, inputChange3, inputChange4};
        f101532g = inputChangeArr;
        f101533h = kotlin.enums.c.a(inputChangeArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InputChange(int i12, l lVar, String str) {
        this.f101534b = (N) lVar;
    }

    public static InputChange valueOf(String str) {
        return (InputChange) Enum.valueOf(InputChange.class, str);
    }

    public static InputChange[] values() {
        return (InputChange[]) f101532g.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        BeduinInputModel beduinInputModel = (BeduinInputModel) beduinModel;
        if (beduinInputModel instanceof SingleLineInputModel) {
            return SingleLineInputModel.copy$default((SingleLineInputModel) beduinInputModel, null, null, null, null, null, Boolean.FALSE, "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33269663, null);
        }
        if (beduinInputModel instanceof MultiLineInputModel) {
            return MultiLineInputModel.copy$default((MultiLineInputModel) beduinInputModel, null, null, null, "", null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, 488695, null);
        }
        throw new IllegalStateException(("Unknown BeduinInputModel " + beduinInputModel).toString());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l<com.avito.android.beduin.common.component.input.BeduinInputModel, java.lang.Object>, kotlin.jvm.internal.N] */
    @Y61.k
    public final l<BeduinInputModel, Object> b() {
        return this.f101534b;
    }
}
