package jw0;

import com.avito.android.short_term_rent.generated.api.api_1_str_booking_form_get.BookingFormPageBlock;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1StrBookingFormGetResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001B3\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ljw0/h;", "", "", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormPageBlock;", "blocks", "Ljw0/j;", "footer", "Ljw0/k;", "header", "", "pageId", "<init>", "(Ljava/util/List;Ljw0/j;Ljw0/k;J)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljw0/j;", "b", "()Ljw0/j;", "Ljw0/k;", "c", "()Ljw0/k;", "J", "d", "()J", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {

    @com.google.gson.annotations.c("blocks")
    @Y61.l
    private final List<BookingFormPageBlock> blocks;

    @com.google.gson.annotations.c("footer")
    @Y61.l
    private final j footer;

    @com.google.gson.annotations.c("header")
    @Y61.l
    private final k header;

    @com.google.gson.annotations.c("pageId")
    private final long pageId;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@Y61.l List<? extends BookingFormPageBlock> list, @Y61.l j jVar, @Y61.l k kVar, long j12) {
        this.blocks = list;
        this.footer = jVar;
        this.header = kVar;
        this.pageId = j12;
    }

    @Y61.l
    public final List<BookingFormPageBlock> a() {
        return this.blocks;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final j getFooter() {
        return this.footer;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final k getHeader() {
        return this.header;
    }

    /* renamed from: d, reason: from getter */
    public final long getPageId() {
        return this.pageId;
    }
}
