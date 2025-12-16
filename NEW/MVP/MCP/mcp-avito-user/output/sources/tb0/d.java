package TB0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api2SfTariffLimitsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"LTB0/d;", "", "", "leftText", "", "needSpacing", "rightText", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Z", "b", "()Z", "c", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    @com.google.gson.annotations.c("leftText")
    @k
    private final String leftText;

    @com.google.gson.annotations.c("needSpacing")
    private final boolean needSpacing;

    @com.google.gson.annotations.c("rightText")
    @k
    private final String rightText;

    public d(@k String str, boolean z12, @k String str2) {
        this.leftText = str;
        this.needSpacing = z12;
        this.rightText = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getLeftText() {
        return this.leftText;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getNeedSpacing() {
        return this.needSpacing;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getRightText() {
        return this.rightText;
    }
}
