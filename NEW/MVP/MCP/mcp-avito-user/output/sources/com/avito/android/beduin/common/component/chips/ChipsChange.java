package com.avito.android.beduin.common.component.chips;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChipsChange.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/chips/ChipsChange;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/component/chips/BeduinChipsModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChipsChange implements e.a<BeduinChipsModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final ChipsChange f101013c;

    /* renamed from: d, reason: collision with root package name */
    public static final ChipsChange f101014d;

    /* renamed from: e, reason: collision with root package name */
    public static final ChipsChange f101015e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ChipsChange[] f101016f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f101017g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final N f101018b;

    /* compiled from: ChipsChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/chips/BeduinChipsModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<BeduinChipsModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f101019l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinChipsModel beduinChipsModel) {
            return Boolean.valueOf(beduinChipsModel.isEnabled());
        }
    }

    /* compiled from: ChipsChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/chips/BeduinChipsModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements l<BeduinChipsModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f101020l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinChipsModel beduinChipsModel) {
            return beduinChipsModel.e();
        }
    }

    /* compiled from: ChipsChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/chips/BeduinChipsModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements l<BeduinChipsModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f101021l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinChipsModel beduinChipsModel) {
            return beduinChipsModel.getErrorMessageToDisplay();
        }
    }

    static {
        ChipsChange chipsChange = new ChipsChange(0, a.f101019l, "IsEnabled");
        f101013c = chipsChange;
        ChipsChange chipsChange2 = new ChipsChange(1, b.f101020l, "SelectedIds");
        f101014d = chipsChange2;
        ChipsChange chipsChange3 = new ChipsChange(2, c.f101021l, "ErrorMessageToDisplay");
        f101015e = chipsChange3;
        ChipsChange[] chipsChangeArr = {chipsChange, chipsChange2, chipsChange3};
        f101016f = chipsChangeArr;
        f101017g = kotlin.enums.c.a(chipsChangeArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChipsChange(int i12, l lVar, String str) {
        this.f101018b = (N) lVar;
    }

    public static ChipsChange valueOf(String str) {
        return (ChipsChange) Enum.valueOf(ChipsChange.class, str);
    }

    public static ChipsChange[] values() {
        return (ChipsChange[]) f101016f.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        return BeduinChipsModel.a((BeduinChipsModel) beduinModel, null, null, null, null, null, false, 3887);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l<com.avito.android.beduin.common.component.chips.BeduinChipsModel, java.lang.Object>, kotlin.jvm.internal.N] */
    @k
    public final l<BeduinChipsModel, Object> b() {
        return this.f101018b;
    }
}
