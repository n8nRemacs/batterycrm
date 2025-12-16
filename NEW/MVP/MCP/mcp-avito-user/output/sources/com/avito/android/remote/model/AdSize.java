package com.avito.android.remote.model;

import Y61.k;
import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdSize.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/AdSize;", "", "serverName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerName", "()Ljava/lang/String;", "SMALL", "SMALL_NEW", "BIG", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdSize[] $VALUES;

    @k
    private final String serverName;
    public static final AdSize SMALL = new AdSize("SMALL", 0, Constants.SMALL);
    public static final AdSize SMALL_NEW = new AdSize("SMALL_NEW", 1, "small_new");
    public static final AdSize BIG = new AdSize("BIG", 2, "big");

    private static final /* synthetic */ AdSize[] $values() {
        return new AdSize[]{SMALL, SMALL_NEW, BIG};
    }

    static {
        AdSize[] adSizeArr$values = $values();
        $VALUES = adSizeArr$values;
        $ENTRIES = c.a(adSizeArr$values);
    }

    private AdSize(String str, int i12, String str2) {
        this.serverName = str2;
    }

    @k
    public static a<AdSize> getEntries() {
        return $ENTRIES;
    }

    public static AdSize valueOf(String str) {
        return (AdSize) Enum.valueOf(AdSize.class, str);
    }

    public static AdSize[] values() {
        return (AdSize[]) $VALUES.clone();
    }

    @k
    public final String getServerName() {
        return this.serverName;
    }
}
