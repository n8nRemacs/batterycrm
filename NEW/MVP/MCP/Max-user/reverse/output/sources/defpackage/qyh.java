package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qyh implements psh {
    public static final qyh X;
    public static final qyh Y;
    public static final qyh Z;
    public static final qyh d;
    public static final qyh o;
    public static final qyh s0;
    public static final /* synthetic */ qyh[] t0;
    public static final /* synthetic */ zg5 u0;
    public final String a;
    public final String b;
    public final Integer c;

    static {
        qyh qyhVar = new qyh("SECURE_SAVE_KEY", 0, "WebAppSecureStorageSaveKey", "secure_storage_save_key", 1);
        d = qyhVar;
        qyh qyhVar2 = new qyh("SECURE_GET_KEY", 1, "WebAppSecureStorageGetKey", "secure_storage_get_key", 2);
        o = qyhVar2;
        qyh qyhVar3 = new qyh("SECURE_CLEAR_KEYS", 2, "WebAppSecureStorageClear", "secure_storage_clear", 4);
        X = qyhVar3;
        qyh qyhVar4 = new qyh("SAVE_KEY", 3, "WebAppDeviceStorageSaveKey", "device_storage_save_key", 5);
        Y = qyhVar4;
        qyh qyhVar5 = new qyh("GET_KEY", 4, "WebAppDeviceStorageGetKey", "device_storage_get_key", 6);
        Z = qyhVar5;
        qyh qyhVar6 = new qyh("CLEAR_KEYS", 5, "WebAppDeviceStorageClear", "device_storage_clear", 7);
        s0 = qyhVar6;
        qyh[] qyhVarArr = {qyhVar, qyhVar2, qyhVar3, qyhVar4, qyhVar5, qyhVar6};
        t0 = qyhVarArr;
        u0 = new zg5(qyhVarArr);
    }

    public qyh(String str, int i, String str2, String str3, Integer num) {
        this.a = str2;
        this.b = str3;
        this.c = num;
    }

    public static qyh valueOf(String str) {
        return (qyh) Enum.valueOf(qyh.class, str);
    }

    public static qyh[] values() {
        return (qyh[]) t0.clone();
    }

    @Override // defpackage.psh
    public final Integer a() {
        return this.c;
    }

    @Override // defpackage.psh
    public final String c() {
        return this.a;
    }

    @Override // defpackage.psh
    public final String d() {
        return this.b;
    }
}
