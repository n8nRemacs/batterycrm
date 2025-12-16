package com.avito.android.beduin.common.component.bar_chart;

import com.avito.android.beduin.common.component.bar_chart.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinBarChartComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/BarChartModelChange;", "payload", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/bar_chart/BarChartModelChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.l<BarChartModelChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f100738l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f100739m;

    /* compiled from: BeduinBarChartComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100740a;

        static {
            int[] iArr = new int[BarChartModelChange.values().length];
            try {
                iArr[BarChartModelChange.f100694c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f100740a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, p pVar) {
        super(1);
        this.f100738l = dVar;
        this.f100739m = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(BarChartModelChange barChartModelChange) {
        if (a.f100740a[barChartModelChange.ordinal()] == 1) {
            d.a aVar = d.f100729i;
            this.f100738l.u(this.f100739m, false);
        }
        return G0.f406611a;
    }
}
