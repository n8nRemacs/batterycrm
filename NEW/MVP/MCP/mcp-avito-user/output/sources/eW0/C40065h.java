package eW0;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsData.kt */
@com.avito.android.gson.d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LeW0/h;", "", "", "value", "", "label", "labelSelected", "", "LeW0/i;", "template", "<init>", "(FLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "F", "getValue", "()F", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getLabelSelected", "Ljava/util/List;", "getTemplate", "()Ljava/util/List;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eW0.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40065h {

    @com.google.gson.annotations.c("label")
    @Y61.k
    private final String label;

    @com.google.gson.annotations.c("label_selected")
    @Y61.l
    private final String labelSelected;

    @com.google.gson.annotations.c("template")
    @Y61.k
    private final List<InterfaceC40066i> template;

    @com.google.gson.annotations.c("value")
    private final float value;

    /* JADX WARN: Multi-variable type inference failed */
    public C40065h(float f12, @Y61.k String str, @Y61.l String str2, @Y61.k List<? extends InterfaceC40066i> list) {
        this.value = f12;
        this.label = str;
        this.labelSelected = str2;
        this.template = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40065h)) {
            return false;
        }
        C40065h c40065h = (C40065h) obj;
        return Float.compare(this.value, c40065h.value) == 0 && L.f(this.label, c40065h.label) && L.f(this.labelSelected, c40065h.labelSelected) && L.f(this.template, c40065h.template);
    }

    public final int hashCode() {
        int iD2 = H.d(Float.hashCode(this.value) * 31, 31, this.label);
        String str = this.labelSelected;
        return this.template.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatsData(value=");
        sb2.append(this.value);
        sb2.append(", label=");
        sb2.append(this.label);
        sb2.append(", labelSelected=");
        sb2.append(this.labelSelected);
        sb2.append(", template=");
        return H.p(sb2, this.template, ')');
    }
}
