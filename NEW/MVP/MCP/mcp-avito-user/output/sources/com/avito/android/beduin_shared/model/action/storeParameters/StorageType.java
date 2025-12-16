package com.avito.android.beduin_shared.model.action.storeParameters;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StorageType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;", "", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "TEMPORARY", "PERSISTENT", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StorageType {

    @c("persistent")
    public static final StorageType PERSISTENT;

    @c("temporary")
    public static final StorageType TEMPORARY;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ StorageType[] f105305b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f105306c;

    static {
        StorageType storageType = new StorageType("TEMPORARY", 0, "temporary");
        TEMPORARY = storageType;
        StorageType storageType2 = new StorageType("PERSISTENT", 1, "persistent");
        PERSISTENT = storageType2;
        StorageType[] storageTypeArr = {storageType, storageType2};
        f105305b = storageTypeArr;
        f105306c = kotlin.enums.c.a(storageTypeArr);
    }

    private StorageType(String str, int i12, String str2) {
    }

    public static StorageType valueOf(String str) {
        return (StorageType) Enum.valueOf(StorageType.class, str);
    }

    public static StorageType[] values() {
        return (StorageType[]) f105305b.clone();
    }
}
