package com.avito.android.remote.model.cv;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CvCreationWidget.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/cv/CvCreationIcon;", "", "(Ljava/lang/String;I)V", "PLUS", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CvCreationIcon {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CvCreationIcon[] $VALUES;

    @c("plus")
    public static final CvCreationIcon PLUS = new CvCreationIcon("PLUS", 0);

    private static final /* synthetic */ CvCreationIcon[] $values() {
        return new CvCreationIcon[]{PLUS};
    }

    static {
        CvCreationIcon[] cvCreationIconArr$values = $values();
        $VALUES = cvCreationIconArr$values;
        $ENTRIES = kotlin.enums.c.a(cvCreationIconArr$values);
    }

    private CvCreationIcon(String str, int i12) {
    }

    @k
    public static a<CvCreationIcon> getEntries() {
        return $ENTRIES;
    }

    public static CvCreationIcon valueOf(String str) {
        return (CvCreationIcon) Enum.valueOf(CvCreationIcon.class, str);
    }

    public static CvCreationIcon[] values() {
        return (CvCreationIcon[]) $VALUES.clone();
    }
}
