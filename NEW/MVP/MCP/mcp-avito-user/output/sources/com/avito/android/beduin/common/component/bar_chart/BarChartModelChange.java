package com.avito.android.beduin.common.component.bar_chart;

import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BarChartModelChange.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/BarChartModelChange;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/component/bar_chart/BeduinBarChartModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarChartModelChange implements e.a<BeduinBarChartModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final BarChartModelChange f100694c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BarChartModelChange[] f100695d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f100696e;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<BeduinBarChartModel, Object> f100697b;

    /* compiled from: BarChartModelChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/bar_chart/BeduinBarChartModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<BeduinBarChartModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f100698l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinBarChartModel beduinBarChartModel) {
            BeduinBarChartModel beduinBarChartModel2 = beduinBarChartModel;
            return new Q(beduinBarChartModel2.getColumns(), beduinBarChartModel2.getSelectedColumnId());
        }
    }

    static {
        BarChartModelChange barChartModelChange = new BarChartModelChange(a.f100698l);
        f100694c = barChartModelChange;
        BarChartModelChange[] barChartModelChangeArr = {barChartModelChange};
        f100695d = barChartModelChangeArr;
        f100696e = kotlin.enums.c.a(barChartModelChangeArr);
    }

    public BarChartModelChange(Y41.l lVar) {
        this.f100697b = lVar;
    }

    public static BarChartModelChange valueOf(String str) {
        return (BarChartModelChange) Enum.valueOf(BarChartModelChange.class, str);
    }

    public static BarChartModelChange[] values() {
        return (BarChartModelChange[]) f100695d.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        return BeduinBarChartModel.copy$default((BeduinBarChartModel) beduinModel, null, null, null, 0, null, null, null, null, 0, null, C42784z0.f406748b, null, null, null, 15327, null);
    }
}
