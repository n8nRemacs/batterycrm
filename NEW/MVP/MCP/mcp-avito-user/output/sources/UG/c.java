package uG;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;

/* compiled from: QrScanV2Response.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b$\u0010\u0017¨\u0006%"}, d2 = {"LuG/c;", "", "LuG/a;", "actionButton", "", AddressParameter.TYPE, "endTime", "secret", "LuG/d;", "seller", "LuG/e;", "sheet", "", "slotId", "startTime", "title", "<init>", "(LuG/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LuG/d;LuG/e;JLjava/lang/String;Ljava/lang/String;)V", "LuG/a;", "a", "()LuG/a;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "LuG/d;", "e", "()LuG/d;", "LuG/e;", "f", "()LuG/e;", "J", "g", "()J", "h", "i", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {

    @com.google.gson.annotations.c("actionButton")
    @k
    private final C48893a actionButton;

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    @k
    private final String address;

    @com.google.gson.annotations.c("endTime")
    @k
    private final String endTime;

    @com.google.gson.annotations.c("secret")
    @l
    private final String secret;

    @com.google.gson.annotations.c("seller")
    @k
    private final d seller;

    @com.google.gson.annotations.c("sheet")
    @k
    private final e sheet;

    @com.google.gson.annotations.c("slotId")
    private final long slotId;

    @com.google.gson.annotations.c("startTime")
    @k
    private final String startTime;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public c(@k C48893a c48893a, @k String str, @k String str2, @l String str3, @k d dVar, @k e eVar, long j12, @k String str4, @k String str5) {
        this.actionButton = c48893a;
        this.address = str;
        this.endTime = str2;
        this.secret = str3;
        this.seller = dVar;
        this.sheet = eVar;
        this.slotId = j12;
        this.startTime = str4;
        this.title = str5;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C48893a getActionButton() {
        return this.actionButton;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getSecret() {
        return this.secret;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final d getSeller() {
        return this.seller;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final e getSheet() {
        return this.sheet;
    }

    /* renamed from: g, reason: from getter */
    public final long getSlotId() {
        return this.slotId;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    @k
    /* renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
