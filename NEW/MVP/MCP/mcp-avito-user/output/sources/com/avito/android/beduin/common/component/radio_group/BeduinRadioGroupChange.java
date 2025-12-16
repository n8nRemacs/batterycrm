package com.avito.android.beduin.common.component.radio_group;

import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinRadioGroupChange.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/radio_group/BeduinRadioGroupChange;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/component/radio_group/BeduinRadioGroupModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinRadioGroupChange implements e.a<BeduinRadioGroupModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final BeduinRadioGroupChange f102182c;

    /* renamed from: d, reason: collision with root package name */
    public static final BeduinRadioGroupChange f102183d;

    /* renamed from: e, reason: collision with root package name */
    public static final BeduinRadioGroupChange f102184e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ BeduinRadioGroupChange[] f102185f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f102186g;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f102187b;

    /* compiled from: BeduinRadioGroupChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/radio_group/BeduinRadioGroupModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<BeduinRadioGroupModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f102188l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinRadioGroupModel beduinRadioGroupModel) {
            return beduinRadioGroupModel.isEnabled();
        }
    }

    /* compiled from: BeduinRadioGroupChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/radio_group/BeduinRadioGroupModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<BeduinRadioGroupModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f102189l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinRadioGroupModel beduinRadioGroupModel) {
            return beduinRadioGroupModel.getSelectedId();
        }
    }

    /* compiled from: BeduinRadioGroupChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/radio_group/BeduinRadioGroupModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.l<BeduinRadioGroupModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f102190l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinRadioGroupModel beduinRadioGroupModel) {
            return beduinRadioGroupModel.getErrorMessageToDisplay();
        }
    }

    static {
        BeduinRadioGroupChange beduinRadioGroupChange = new BeduinRadioGroupChange(0, a.f102188l, "IsEnabled");
        f102182c = beduinRadioGroupChange;
        BeduinRadioGroupChange beduinRadioGroupChange2 = new BeduinRadioGroupChange(1, b.f102189l, "SelectedId");
        f102183d = beduinRadioGroupChange2;
        BeduinRadioGroupChange beduinRadioGroupChange3 = new BeduinRadioGroupChange(2, c.f102190l, "ErrorMessageToDisplay");
        f102184e = beduinRadioGroupChange3;
        BeduinRadioGroupChange[] beduinRadioGroupChangeArr = {beduinRadioGroupChange, beduinRadioGroupChange2, beduinRadioGroupChange3};
        f102185f = beduinRadioGroupChangeArr;
        f102186g = kotlin.enums.c.a(beduinRadioGroupChangeArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinRadioGroupChange(int i12, Y41.l lVar, String str) {
        this.f102187b = (N) lVar;
    }

    public static BeduinRadioGroupChange valueOf(String str) {
        return (BeduinRadioGroupChange) Enum.valueOf(BeduinRadioGroupChange.class, str);
    }

    public static BeduinRadioGroupChange[] values() {
        return (BeduinRadioGroupChange[]) f102185f.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        return BeduinRadioGroupModel.copy$default((BeduinRadioGroupModel) beduinModel, null, null, null, null, null, null, null, null, null, 115, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l<com.avito.android.beduin.common.component.radio_group.BeduinRadioGroupModel, java.lang.Object>, kotlin.jvm.internal.N] */
    @Y61.k
    public final Y41.l<BeduinRadioGroupModel, Object> b() {
        return this.f102187b;
    }
}
