package com.avito.android.beduin.common.component.segmented_control;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SegmentedControlChange.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/segmented_control/SegmentedControlChange;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/component/segmented_control/BeduinSegmentedControlModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SegmentedControlChange implements e.a<BeduinSegmentedControlModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final SegmentedControlChange f102377c;

    /* renamed from: d, reason: collision with root package name */
    public static final SegmentedControlChange f102378d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SegmentedControlChange[] f102379e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f102380f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final N f102381b;

    /* compiled from: SegmentedControlChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/segmented_control/BeduinSegmentedControlModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<BeduinSegmentedControlModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f102382l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinSegmentedControlModel beduinSegmentedControlModel) {
            BeduinSegmentedControlModel beduinSegmentedControlModel2 = beduinSegmentedControlModel;
            return new Q(beduinSegmentedControlModel2.getOptions(), beduinSegmentedControlModel2.getSelectedId());
        }
    }

    /* compiled from: SegmentedControlChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/segmented_control/BeduinSegmentedControlModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements l<BeduinSegmentedControlModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f102383l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinSegmentedControlModel beduinSegmentedControlModel) {
            return beduinSegmentedControlModel.isEnabled();
        }
    }

    static {
        SegmentedControlChange segmentedControlChange = new SegmentedControlChange(0, a.f102382l, "Options");
        f102377c = segmentedControlChange;
        SegmentedControlChange segmentedControlChange2 = new SegmentedControlChange(1, b.f102383l, "IsEnabled");
        f102378d = segmentedControlChange2;
        SegmentedControlChange[] segmentedControlChangeArr = {segmentedControlChange, segmentedControlChange2};
        f102379e = segmentedControlChangeArr;
        f102380f = kotlin.enums.c.a(segmentedControlChangeArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SegmentedControlChange(int i12, l lVar, String str) {
        this.f102381b = (N) lVar;
    }

    public static SegmentedControlChange valueOf(String str) {
        return (SegmentedControlChange) Enum.valueOf(SegmentedControlChange.class, str);
    }

    public static SegmentedControlChange[] values() {
        return (SegmentedControlChange[]) f102379e.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        return BeduinSegmentedControlModel.copy$default((BeduinSegmentedControlModel) beduinModel, null, Boolean.FALSE, null, C42784z0.f406748b, null, null, null, null, 241, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l<com.avito.android.beduin.common.component.segmented_control.BeduinSegmentedControlModel, java.lang.Object>, kotlin.jvm.internal.N] */
    @k
    public final l<BeduinSegmentedControlModel, Object> b() {
        return this.f102381b;
    }
}
