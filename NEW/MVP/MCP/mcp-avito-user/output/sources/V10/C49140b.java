package v10;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1MortgageCatalogCalculatorOffersGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lv10/b;", "", "", "leftCorner", "preset", "rightCorner", "size", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getLeftCorner", "()Ljava/lang/String;", "a", "b", "c", "d", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v10.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49140b {

    @com.google.gson.annotations.c("leftCorner")
    @Y61.k
    private final String leftCorner;

    @com.google.gson.annotations.c("preset")
    @Y61.k
    private final String preset;

    @com.google.gson.annotations.c("rightCorner")
    @Y61.k
    private final String rightCorner;

    @com.google.gson.annotations.c("size")
    @Y61.k
    private final String size;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final String text;

    public C49140b(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5) {
        this.leftCorner = str;
        this.preset = str2;
        this.rightCorner = str3;
        this.size = str4;
        this.text = str5;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getPreset() {
        return this.preset;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getRightCorner() {
        return this.rightCorner;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
