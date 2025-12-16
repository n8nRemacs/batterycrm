package jh;

import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BbipPrivateConfiguratorResult.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Ljh/y;", "", "", "title", "", "min", "max", "", "recommended", "preselected", "moreButtonLabel", "selectTitle", "selectButtonText", "<init>", "(Ljava/lang/String;IILjava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "I", "b", "()I", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", "c", "g", "f", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class y {

    @com.google.gson.annotations.c("max")
    private final int max;

    @com.google.gson.annotations.c("min")
    private final int min;

    @com.google.gson.annotations.c("moreButtonLabel")
    @Y61.k
    private final String moreButtonLabel;

    @com.google.gson.annotations.c("preselected")
    private final int preselected;

    @com.google.gson.annotations.c("recommended")
    @Y61.k
    private final List<Integer> recommended;

    @com.google.gson.annotations.c("selectButtonText")
    @Y61.k
    private final String selectButtonText;

    @com.google.gson.annotations.c("selectTitle")
    @Y61.k
    private final String selectTitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public y(@Y61.k String str, int i12, int i13, @Y61.k List<Integer> list, int i14, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
        this.title = str;
        this.min = i12;
        this.max = i13;
        this.recommended = list;
        this.preselected = i14;
        this.moreButtonLabel = str2;
        this.selectTitle = str3;
        this.selectButtonText = str4;
    }

    /* renamed from: a, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* renamed from: b, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getMoreButtonLabel() {
        return this.moreButtonLabel;
    }

    /* renamed from: d, reason: from getter */
    public final int getPreselected() {
        return this.preselected;
    }

    @Y61.k
    public final List<Integer> e() {
        return this.recommended;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getSelectButtonText() {
        return this.selectButtonText;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getSelectTitle() {
        return this.selectTitle;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
