package Yl0;

import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: ProfileItemsApiV13Response.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LYl0/w;", "", "", "errorCode", "status", "", "statusTitle", "LYl0/x;", TooltipAttribute.ATTRIBUTE_TYPE, "<init>", "(Ljava/lang/Long;JLjava/lang/String;LYl0/x;)V", "Ljava/lang/Long;", "getErrorCode", "()Ljava/lang/Long;", "J", "a", "()J", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "LYl0/x;", "getTooltip", "()LYl0/x;", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class w {

    @com.google.gson.annotations.c("errorCode")
    @Y61.l
    private final Long errorCode;

    @com.google.gson.annotations.c("status")
    private final long status;

    @com.google.gson.annotations.c("statusTitle")
    @Y61.l
    private final String statusTitle;

    @com.google.gson.annotations.c(TooltipAttribute.ATTRIBUTE_TYPE)
    @Y61.l
    private final x tooltip;

    public w(@Y61.l Long l12, long j12, @Y61.l String str, @Y61.l x xVar) {
        this.errorCode = l12;
        this.status = j12;
        this.statusTitle = str;
        this.tooltip = xVar;
    }

    /* renamed from: a, reason: from getter */
    public final long getStatus() {
        return this.status;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getStatusTitle() {
        return this.statusTitle;
    }
}
