package wC0;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiTariffCptInfoV3Response.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LwC0/i;", "", "LwC0/c;", "emptyColor", "LwC0/b;", "fillColor", "", "value", "<init>", "(LwC0/c;LwC0/b;D)V", "LwC0/c;", "a", "()LwC0/c;", "LwC0/b;", "b", "()LwC0/b;", "D", "c", "()D", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i {

    @com.google.gson.annotations.c("emptyColor")
    @Y61.l
    private final c emptyColor;

    @com.google.gson.annotations.c("fillColor")
    @Y61.k
    private final b fillColor;

    @com.google.gson.annotations.c("value")
    private final double value;

    public i(@Y61.l c cVar, @Y61.k b bVar, double d12) {
        this.emptyColor = cVar;
        this.fillColor = bVar;
        this.value = d12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final c getEmptyColor() {
        return this.emptyColor;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final b getFillColor() {
        return this.fillColor;
    }

    /* renamed from: c, reason: from getter */
    public final double getValue() {
        return this.value;
    }
}
