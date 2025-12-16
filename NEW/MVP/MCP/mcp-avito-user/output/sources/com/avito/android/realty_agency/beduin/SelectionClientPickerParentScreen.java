package com.avito.android.realty_agency.beduin;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionClientPickerDeeplinkFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/realty_agency/beduin/SelectionClientPickerParentScreen;", "", "a", "_avito_realty-agency_shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SelectionClientPickerParentScreen {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ SelectionClientPickerParentScreen[] f250857b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f250858c;

    /* compiled from: SelectionClientPickerDeeplinkFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/realty_agency/beduin/SelectionClientPickerParentScreen$a;", "", "<init>", "()V", "_avito_realty-agency_shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        SelectionClientPickerParentScreen[] selectionClientPickerParentScreenArr = {new SelectionClientPickerParentScreen("AGENCY_SEARCH", 0, "prof_search"), new SelectionClientPickerParentScreen("LOT_ITEM_CARD", 1, "flat_card"), new SelectionClientPickerParentScreen(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "unknown")};
        f250857b = selectionClientPickerParentScreenArr;
        f250858c = kotlin.enums.c.a(selectionClientPickerParentScreenArr);
        new a(null);
    }

    public SelectionClientPickerParentScreen(String str, int i12, String str2) {
    }

    public static SelectionClientPickerParentScreen valueOf(String str) {
        return (SelectionClientPickerParentScreen) Enum.valueOf(SelectionClientPickerParentScreen.class, str);
    }

    public static SelectionClientPickerParentScreen[] values() {
        return (SelectionClientPickerParentScreen[]) f250857b.clone();
    }
}
