package com.avito.beduin.v2.avito.component.checkbox.state;

import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvitoCheckboxState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/checkbox/state/CheckboxValue;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CheckboxValue {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f333999c;

    /* renamed from: d, reason: collision with root package name */
    public static final CheckboxValue f334000d;

    /* renamed from: e, reason: collision with root package name */
    public static final CheckboxValue f334001e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CheckboxValue[] f334002f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f334003g;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f334004b;

    /* compiled from: AvitoCheckboxState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/checkbox/state/CheckboxValue$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        CheckboxValue checkboxValue = new CheckboxValue("Unchecked", 0, BeduinCartItemModel.UNCHECKED_STRING);
        f334000d = checkboxValue;
        CheckboxValue checkboxValue2 = new CheckboxValue("Indeterminate", 1, "indeterminate");
        CheckboxValue checkboxValue3 = new CheckboxValue("Checked", 2, BeduinCartItemModel.CHECKED_STRING);
        f334001e = checkboxValue3;
        CheckboxValue[] checkboxValueArr = {checkboxValue, checkboxValue2, checkboxValue3};
        f334002f = checkboxValueArr;
        f334003g = kotlin.enums.c.a(checkboxValueArr);
        f333999c = new a(null);
    }

    public CheckboxValue(String str, int i12, String str2) {
        this.f334004b = str2;
    }

    public static CheckboxValue valueOf(String str) {
        return (CheckboxValue) Enum.valueOf(CheckboxValue.class, str);
    }

    public static CheckboxValue[] values() {
        return (CheckboxValue[]) f334002f.clone();
    }
}
