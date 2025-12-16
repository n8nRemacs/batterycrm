package com.avito.android.profile_management.remote.generated.api.universal_widget_save_api;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import eb0.C40081b;
import eb0.C40082c;
import eb0.f;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: UniversalWidgetSaveApiRequest.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001\u001dB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/avito/android/profile_management/remote/generated/api/universal_widget_save_api/UniversalWidgetSectionValue;", "", "Lcom/avito/android/profile_management/remote/generated/api/universal_widget_save_api/UniversalWidgetSectionValue$Operation;", "operation", "Leb0/b;", "valueFactoid", "", "valueId", "Leb0/c;", "valueImageWithText", "Leb0/f;", "valueText", "<init>", "(Lcom/avito/android/profile_management/remote/generated/api/universal_widget_save_api/UniversalWidgetSectionValue$Operation;Leb0/b;Ljava/lang/String;Leb0/c;Leb0/f;)V", "Lcom/avito/android/profile_management/remote/generated/api/universal_widget_save_api/UniversalWidgetSectionValue$Operation;", "getOperation", "()Lcom/avito/android/profile_management/remote/generated/api/universal_widget_save_api/UniversalWidgetSectionValue$Operation;", "Leb0/b;", "getValueFactoid", "()Leb0/b;", "Ljava/lang/String;", "getValueId", "()Ljava/lang/String;", "Leb0/c;", "getValueImageWithText", "()Leb0/c;", "Leb0/f;", "getValueText", "()Leb0/f;", "Operation", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UniversalWidgetSectionValue {

    @c("operation")
    @k
    private final Operation operation;

    @c("valueFactoid")
    @l
    private final C40081b valueFactoid;

    @c("valueId")
    @l
    private final String valueId;

    @c("valueImageWithText")
    @l
    private final C40082c valueImageWithText;

    @c("valueText")
    @l
    private final f valueText;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidgetSaveApiRequest.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_management/remote/generated/api/universal_widget_save_api/UniversalWidgetSectionValue$Operation;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Update", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Operation {

        @c("update")
        public static final Operation Update;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Operation[] f226606b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f226607c;

        static {
            Operation operation = new Operation("Update", 0, "update");
            Update = operation;
            Operation[] operationArr = {operation};
            f226606b = operationArr;
            f226607c = kotlin.enums.c.a(operationArr);
        }

        private Operation(String str, int i12, String str2) {
        }

        public static Operation valueOf(String str) {
            return (Operation) Enum.valueOf(Operation.class, str);
        }

        public static Operation[] values() {
            return (Operation[]) f226606b.clone();
        }
    }

    public UniversalWidgetSectionValue(@k Operation operation, @l C40081b c40081b, @l String str, @l C40082c c40082c, @l f fVar) {
        this.operation = operation;
        this.valueFactoid = c40081b;
        this.valueId = str;
        this.valueImageWithText = c40082c;
        this.valueText = fVar;
    }
}
