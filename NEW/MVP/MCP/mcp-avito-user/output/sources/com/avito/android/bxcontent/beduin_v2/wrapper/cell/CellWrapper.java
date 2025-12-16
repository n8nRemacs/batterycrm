package com.avito.android.bxcontent.beduin_v2.wrapper.cell;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BxCellWrapperState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/wrapper/cell/CellWrapper;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CellWrapper {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f109568c;

    /* renamed from: d, reason: collision with root package name */
    public static final CellWrapper f109569d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CellWrapper[] f109570e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f109571f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f109572b;

    /* compiled from: BxCellWrapperState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/wrapper/cell/CellWrapper$a;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        CellWrapper cellWrapper = new CellWrapper("MINI_MENU", 0, "ServicesMenu");
        CellWrapper cellWrapper2 = new CellWrapper("RUBRICATOR", 1, "Rubricator");
        CellWrapper cellWrapper3 = new CellWrapper(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "");
        f109569d = cellWrapper3;
        CellWrapper[] cellWrapperArr = {cellWrapper, cellWrapper2, cellWrapper3};
        f109570e = cellWrapperArr;
        f109571f = kotlin.enums.c.a(cellWrapperArr);
        f109568c = new a(null);
    }

    public CellWrapper(String str, int i12, String str2) {
        this.f109572b = str2;
    }

    public static CellWrapper valueOf(String str) {
        return (CellWrapper) Enum.valueOf(CellWrapper.class, str);
    }

    public static CellWrapper[] values() {
        return (CellWrapper[]) f109570e.clone();
    }
}
