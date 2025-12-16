package com.avito.android.beduin.common.component.item_color_picker;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemColorChange.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/item_color_picker/ItemColorChange;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemColorChange implements e.a<BeduinItemColorPickerModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final ItemColorChange f101610c;

    /* renamed from: d, reason: collision with root package name */
    public static final ItemColorChange f101611d;

    /* renamed from: e, reason: collision with root package name */
    public static final ItemColorChange f101612e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ItemColorChange[] f101613f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f101614g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final N f101615b;

    /* compiled from: ItemColorChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<BeduinItemColorPickerModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f101616l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinItemColorPickerModel beduinItemColorPickerModel) {
            return Boolean.valueOf(beduinItemColorPickerModel.isEnabled());
        }
    }

    /* compiled from: ItemColorChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements l<BeduinItemColorPickerModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f101617l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinItemColorPickerModel beduinItemColorPickerModel) {
            return beduinItemColorPickerModel.e();
        }
    }

    /* compiled from: ItemColorChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements l<BeduinItemColorPickerModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f101618l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinItemColorPickerModel beduinItemColorPickerModel) {
            return beduinItemColorPickerModel.getErrorMessage();
        }
    }

    static {
        ItemColorChange itemColorChange = new ItemColorChange(0, a.f101616l, "IsEnabled");
        f101610c = itemColorChange;
        ItemColorChange itemColorChange2 = new ItemColorChange(1, b.f101617l, "SelectedIds");
        f101611d = itemColorChange2;
        ItemColorChange itemColorChange3 = new ItemColorChange(2, c.f101618l, "ErrorMessageToDisplay");
        f101612e = itemColorChange3;
        ItemColorChange[] itemColorChangeArr = {itemColorChange, itemColorChange2, itemColorChange3};
        f101613f = itemColorChangeArr;
        f101614g = kotlin.enums.c.a(itemColorChangeArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ItemColorChange(int i12, l lVar, String str) {
        this.f101615b = (N) lVar;
    }

    public static ItemColorChange valueOf(String str) {
        return (ItemColorChange) Enum.valueOf(ItemColorChange.class, str);
    }

    public static ItemColorChange[] values() {
        return (ItemColorChange[]) f101613f.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        return BeduinItemColorPickerModel.a((BeduinItemColorPickerModel) beduinModel, null, 8079);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l<com.avito.android.beduin.common.component.item_color_picker.BeduinItemColorPickerModel, java.lang.Object>, kotlin.jvm.internal.N] */
    @k
    public final l<BeduinItemColorPickerModel, Object> b() {
        return this.f101615b;
    }
}
