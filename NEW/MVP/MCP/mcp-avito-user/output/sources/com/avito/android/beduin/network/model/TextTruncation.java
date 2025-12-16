package com.avito.android.beduin.network.model;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextTruncation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/network/model/TextTruncation;", "", "(Ljava/lang/String;I)V", "START", "MIDDLE", "END", "NONE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextTruncation {

    @c("end")
    public static final TextTruncation END;

    @c("middle")
    public static final TextTruncation MIDDLE;

    @c("none")
    public static final TextTruncation NONE;

    @c("start")
    public static final TextTruncation START;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ TextTruncation[] f104020b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f104021c;

    static {
        TextTruncation textTruncation = new TextTruncation("START", 0);
        START = textTruncation;
        TextTruncation textTruncation2 = new TextTruncation("MIDDLE", 1);
        MIDDLE = textTruncation2;
        TextTruncation textTruncation3 = new TextTruncation("END", 2);
        END = textTruncation3;
        TextTruncation textTruncation4 = new TextTruncation("NONE", 3);
        NONE = textTruncation4;
        TextTruncation[] textTruncationArr = {textTruncation, textTruncation2, textTruncation3, textTruncation4};
        f104020b = textTruncationArr;
        f104021c = kotlin.enums.c.a(textTruncationArr);
    }

    private TextTruncation(String str, int i12) {
    }

    public static TextTruncation valueOf(String str) {
        return (TextTruncation) Enum.valueOf(TextTruncation.class, str);
    }

    public static TextTruncation[] values() {
        return (TextTruncation[]) f104020b.clone();
    }
}
