package Sx0;

import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001BG\u0012\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR(\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LSx0/H;", "", "", "Lcom/avito/android/remote/model/text/AttributedText;", "content", "footer", "header", "", "title", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class H {

    @com.google.gson.annotations.c("content")
    @Y61.l
    private final List<List<AttributedText>> content;

    @com.google.gson.annotations.c("footer")
    @Y61.l
    private final List<AttributedText> footer;

    @com.google.gson.annotations.c("header")
    @Y61.l
    private final List<AttributedText> header;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public H(@Y61.l List<? extends List<AttributedText>> list, @Y61.l List<AttributedText> list2, @Y61.l List<AttributedText> list3, @Y61.l String str) {
        this.content = list;
        this.footer = list2;
        this.header = list3;
        this.title = str;
    }

    @Y61.l
    public final List<List<AttributedText>> a() {
        return this.content;
    }

    @Y61.l
    public final List<AttributedText> b() {
        return this.footer;
    }

    @Y61.l
    public final List<AttributedText> c() {
        return this.header;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
