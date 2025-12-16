package com.avito.android.remote.model.category_parameters;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotoRealtyLayouts.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Purpose;", "", "(Ljava/lang/String;I)V", "SELECT_GROUP", "ADD_TO_LAYOUTS", "REMOVE_FROM_LAYOUTS", "MAKE_FIRST", "EDIT", "DELETE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Purpose {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Purpose[] $VALUES;

    @c("select_group")
    public static final Purpose SELECT_GROUP = new Purpose("SELECT_GROUP", 0);

    @c("add_to_layouts")
    public static final Purpose ADD_TO_LAYOUTS = new Purpose("ADD_TO_LAYOUTS", 1);

    @c("remove_from_layouts")
    public static final Purpose REMOVE_FROM_LAYOUTS = new Purpose("REMOVE_FROM_LAYOUTS", 2);

    @c("make_first")
    public static final Purpose MAKE_FIRST = new Purpose("MAKE_FIRST", 3);

    @c("edit")
    public static final Purpose EDIT = new Purpose("EDIT", 4);

    @c("delete")
    public static final Purpose DELETE = new Purpose("DELETE", 5);

    private static final /* synthetic */ Purpose[] $values() {
        return new Purpose[]{SELECT_GROUP, ADD_TO_LAYOUTS, REMOVE_FROM_LAYOUTS, MAKE_FIRST, EDIT, DELETE};
    }

    static {
        Purpose[] purposeArr$values = $values();
        $VALUES = purposeArr$values;
        $ENTRIES = kotlin.enums.c.a(purposeArr$values);
    }

    private Purpose(String str, int i12) {
    }

    @k
    public static a<Purpose> getEntries() {
        return $ENTRIES;
    }

    public static Purpose valueOf(String str) {
        return (Purpose) Enum.valueOf(Purpose.class, str);
    }

    public static Purpose[] values() {
        return (Purpose[]) $VALUES.clone();
    }
}
