package YO;

import Y61.k;
import Y61.l;
import com.avito.android.job.confirm_documents_bottom_sheet_public.generated.api.shift_documents_status_v_1.ShiftDocumentsStatusV1ItemsItem;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ShiftDocumentsStatusV1Response.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"LYO/b;", "", "", "description", "LYO/a;", "event", "", "Lcom/avito/android/job/confirm_documents_bottom_sheet_public/generated/api/shift_documents_status_v_1/ShiftDocumentsStatusV1ItemsItem;", "items", "title", "<init>", "(Ljava/lang/String;LYO/a;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LYO/a;", "b", "()LYO/a;", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "_avito_gig_confirm_documents_bottom_sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    @c("description")
    @k
    private final String description;

    @c("event")
    @l
    private final a event;

    @c("items")
    @k
    private final List<ShiftDocumentsStatusV1ItemsItem> items;

    @c("title")
    @k
    private final String title;

    public b(@k String str, @l a aVar, @k List<ShiftDocumentsStatusV1ItemsItem> list, @k String str2) {
        this.description = str;
        this.event = aVar;
        this.items = list;
        this.title = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final a getEvent() {
        return this.event;
    }

    @k
    public final List<ShiftDocumentsStatusV1ItemsItem> c() {
        return this.items;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
