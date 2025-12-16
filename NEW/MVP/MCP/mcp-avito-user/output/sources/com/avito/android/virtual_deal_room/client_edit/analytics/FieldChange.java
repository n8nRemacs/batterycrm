package com.avito.android.virtual_deal_room.client_edit.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserDataChangeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/analytics/FieldChange;", "", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FieldChange {

    /* renamed from: c, reason: collision with root package name */
    public static final FieldChange f326132c;

    /* renamed from: d, reason: collision with root package name */
    public static final FieldChange f326133d;

    /* renamed from: e, reason: collision with root package name */
    public static final FieldChange f326134e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ FieldChange[] f326135f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f326136g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f326137b;

    static {
        FieldChange fieldChange = new FieldChange("Edited", 0, "edited");
        f326132c = fieldChange;
        FieldChange fieldChange2 = new FieldChange("Added", 1, "added");
        f326133d = fieldChange2;
        FieldChange fieldChange3 = new FieldChange("NoChanges", 2, "no_changes");
        f326134e = fieldChange3;
        FieldChange[] fieldChangeArr = {fieldChange, fieldChange2, fieldChange3};
        f326135f = fieldChangeArr;
        f326136g = c.a(fieldChangeArr);
    }

    public FieldChange(String str, int i12, String str2) {
        this.f326137b = str2;
    }

    public static FieldChange valueOf(String str) {
        return (FieldChange) Enum.valueOf(FieldChange.class, str);
    }

    public static FieldChange[] values() {
        return (FieldChange[]) f326135f.clone();
    }
}
