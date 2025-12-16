package com.avito.android.profile_management.remote.generated.api.universal_widget_save_api;

import Y61.k;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: UniversalWidgetSaveApiRequest.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000fB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/profile_management/remote/generated/api/universal_widget_save_api/FieldSave;", "", "Lcom/avito/android/profile_management/remote/generated/api/universal_widget_save_api/FieldSave$Name;", "name", "", "Lcom/avito/android/profile_management/remote/generated/api/universal_widget_save_api/UniversalWidgetSectionValue;", "values", "<init>", "(Lcom/avito/android/profile_management/remote/generated/api/universal_widget_save_api/FieldSave$Name;Ljava/util/List;)V", "Lcom/avito/android/profile_management/remote/generated/api/universal_widget_save_api/FieldSave$Name;", "getName", "()Lcom/avito/android/profile_management/remote/generated/api/universal_widget_save_api/FieldSave$Name;", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "Name", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class FieldSave {

    @c("name")
    @k
    private final Name name;

    @c("values")
    @k
    private final List<UniversalWidgetSectionValue> values;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidgetSaveApiRequest.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_management/remote/generated/api/universal_widget_save_api/FieldSave$Name;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "UniversalWidgetSection", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Name {

        @c("universal_widget_section")
        public static final Name UniversalWidgetSection;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Name[] f226604b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f226605c;

        static {
            Name name = new Name("UniversalWidgetSection", 0, "universal_widget_section");
            UniversalWidgetSection = name;
            Name[] nameArr = {name};
            f226604b = nameArr;
            f226605c = kotlin.enums.c.a(nameArr);
        }

        private Name(String str, int i12, String str2) {
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) f226604b.clone();
        }
    }

    public FieldSave(@k Name name, @k List<UniversalWidgetSectionValue> list) {
        this.name = name;
        this.values = list;
    }
}
