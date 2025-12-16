package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvatarShape.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/AvatarShape;", "", "(Ljava/lang/String;I)V", "CIRCLE", "SQUARE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AvatarShape {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AvatarShape[] $VALUES;

    @c("circle")
    public static final AvatarShape CIRCLE = new AvatarShape("CIRCLE", 0);

    @c("square")
    public static final AvatarShape SQUARE = new AvatarShape("SQUARE", 1);

    private static final /* synthetic */ AvatarShape[] $values() {
        return new AvatarShape[]{CIRCLE, SQUARE};
    }

    static {
        AvatarShape[] avatarShapeArr$values = $values();
        $VALUES = avatarShapeArr$values;
        $ENTRIES = kotlin.enums.c.a(avatarShapeArr$values);
    }

    private AvatarShape(String str, int i12) {
    }

    @k
    public static a<AvatarShape> getEntries() {
        return $ENTRIES;
    }

    public static AvatarShape valueOf(String str) {
        return (AvatarShape) Enum.valueOf(AvatarShape.class, str);
    }

    public static AvatarShape[] values() {
        return (AvatarShape[]) $VALUES.clone();
    }
}
