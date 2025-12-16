package com.avito.android.remote.model.adverts;

import Y61.k;
import com.avito.android.remote.model.ServiceTypeKt;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutopublishAction.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/adverts/AutopublishAction;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACTIVATE", "DEACTIVATE", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AutopublishAction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AutopublishAction[] $VALUES;
    public static final AutopublishAction ACTIVATE = new AutopublishAction("ACTIVATE", 0, ServiceTypeKt.SERVICE_ACTIVATION);
    public static final AutopublishAction DEACTIVATE = new AutopublishAction("DEACTIVATE", 1, "deactivate");

    @k
    private final String value;

    private static final /* synthetic */ AutopublishAction[] $values() {
        return new AutopublishAction[]{ACTIVATE, DEACTIVATE};
    }

    static {
        AutopublishAction[] autopublishActionArr$values = $values();
        $VALUES = autopublishActionArr$values;
        $ENTRIES = c.a(autopublishActionArr$values);
    }

    private AutopublishAction(String str, int i12, String str2) {
        this.value = str2;
    }

    @k
    public static a<AutopublishAction> getEntries() {
        return $ENTRIES;
    }

    public static AutopublishAction valueOf(String str) {
        return (AutopublishAction) Enum.valueOf(AutopublishAction.class, str);
    }

    public static AutopublishAction[] values() {
        return (AutopublishAction[]) $VALUES.clone();
    }

    @k
    public final String getValue() {
        return this.value;
    }
}
