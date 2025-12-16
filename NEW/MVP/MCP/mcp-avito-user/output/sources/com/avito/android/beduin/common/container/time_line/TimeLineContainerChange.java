package com.avito.android.beduin.common.container.time_line;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TimeLineContainerChange.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/time_line/TimeLineContainerChange;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/container/time_line/BeduinTimeLineContainerModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TimeLineContainerChange implements e.a<BeduinTimeLineContainerModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final TimeLineContainerChange f103231c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TimeLineContainerChange[] f103232d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f103233e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<BeduinTimeLineContainerModel, Object> f103234b;

    /* compiled from: TimeLineContainerChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/container/time_line/BeduinTimeLineContainerModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<BeduinTimeLineContainerModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f103235l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinTimeLineContainerModel beduinTimeLineContainerModel) {
            return beduinTimeLineContainerModel.getChildren();
        }
    }

    static {
        TimeLineContainerChange timeLineContainerChange = new TimeLineContainerChange(a.f103235l);
        f103231c = timeLineContainerChange;
        TimeLineContainerChange[] timeLineContainerChangeArr = {timeLineContainerChange};
        f103232d = timeLineContainerChangeArr;
        f103233e = kotlin.enums.c.a(timeLineContainerChangeArr);
    }

    public TimeLineContainerChange(l lVar) {
        this.f103234b = lVar;
    }

    public static TimeLineContainerChange valueOf(String str) {
        return (TimeLineContainerChange) Enum.valueOf(TimeLineContainerChange.class, str);
    }

    public static TimeLineContainerChange[] values() {
        return (TimeLineContainerChange[]) f103232d.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        return BeduinTimeLineContainerModel.copy$default((BeduinTimeLineContainerModel) beduinModel, null, C42784z0.f406748b, null, null, null, null, null, 125, null);
    }
}
