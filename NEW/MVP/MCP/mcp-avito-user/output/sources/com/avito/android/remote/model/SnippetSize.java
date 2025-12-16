package com.avito.android.remote.model;

import Y61.k;
import com.adjust.sdk.Constants;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConstructorAdvertNetworkModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/SnippetSize;", "", "(Ljava/lang/String;I)V", "SMALL", "MEDIUM", "LARGE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SnippetSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SnippetSize[] $VALUES;

    @c(Constants.SMALL)
    public static final SnippetSize SMALL = new SnippetSize("SMALL", 0);

    @c("medium")
    public static final SnippetSize MEDIUM = new SnippetSize("MEDIUM", 1);

    @c(Constants.LARGE)
    public static final SnippetSize LARGE = new SnippetSize("LARGE", 2);

    private static final /* synthetic */ SnippetSize[] $values() {
        return new SnippetSize[]{SMALL, MEDIUM, LARGE};
    }

    static {
        SnippetSize[] snippetSizeArr$values = $values();
        $VALUES = snippetSizeArr$values;
        $ENTRIES = kotlin.enums.c.a(snippetSizeArr$values);
    }

    private SnippetSize(String str, int i12) {
    }

    @k
    public static a<SnippetSize> getEntries() {
        return $ENTRIES;
    }

    public static SnippetSize valueOf(String str) {
        return (SnippetSize) Enum.valueOf(SnippetSize.class, str);
    }

    public static SnippetSize[] values() {
        return (SnippetSize[]) $VALUES.clone();
    }
}
