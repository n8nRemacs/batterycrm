package Zz0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1StrSellerOrdersImportantToNotePostResponse.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LZz0/a;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "header", "", "LZz0/e;", "items", "", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19627a {

    @com.google.gson.annotations.c("header")
    @l
    private final AttributedText header;

    @com.google.gson.annotations.c("items")
    @l
    private final List<e> items;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public C19627a(@l AttributedText attributedText, @l List<? extends e> list, @l String str) {
        this.header = attributedText;
        this.items = list;
        this.title = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getHeader() {
        return this.header;
    }

    @l
    public final List<e> b() {
        return this.items;
    }
}
