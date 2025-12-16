package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TfaSource.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/TfaSource;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ANTIHACK", "TFA", "_avito_auth-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TfaSource {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TfaSource[] $VALUES;

    @c("antihack")
    public static final TfaSource ANTIHACK = new TfaSource("ANTIHACK", 0, "antihack");

    @c("tfa")
    public static final TfaSource TFA = new TfaSource("TFA", 1, "tfa");

    @k
    private final String value;

    private static final /* synthetic */ TfaSource[] $values() {
        return new TfaSource[]{ANTIHACK, TFA};
    }

    static {
        TfaSource[] tfaSourceArr$values = $values();
        $VALUES = tfaSourceArr$values;
        $ENTRIES = kotlin.enums.c.a(tfaSourceArr$values);
    }

    private TfaSource(String str, int i12, String str2) {
        this.value = str2;
    }

    @k
    public static a<TfaSource> getEntries() {
        return $ENTRIES;
    }

    public static TfaSource valueOf(String str) {
        return (TfaSource) Enum.valueOf(TfaSource.class, str);
    }

    public static TfaSource[] values() {
        return (TfaSource[]) $VALUES.clone();
    }

    @k
    public final String getValue() {
        return this.value;
    }
}
