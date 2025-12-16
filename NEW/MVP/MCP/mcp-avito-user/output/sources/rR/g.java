package Rr;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: EstimateActivateBulkAppV2Response.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"LRr/g;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "agreement", "LRr/a;", "button", "description", "", "LRr/b;", "items", "", "itemsCountTitle", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LRr/a;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "LRr/a;", "b", "()LRr/a;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g {

    @com.google.gson.annotations.c("agreement")
    @l
    private final AttributedText agreement;

    @com.google.gson.annotations.c("button")
    @k
    private final C15073a button;

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("items")
    @k
    private final List<C15074b> items;

    @com.google.gson.annotations.c("itemsCountTitle")
    @l
    private final String itemsCountTitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public g(@l AttributedText attributedText, @k C15073a c15073a, @l AttributedText attributedText2, @k List<C15074b> list, @l String str, @k String str2) {
        this.agreement = attributedText;
        this.button = c15073a;
        this.description = attributedText2;
        this.items = list;
        this.itemsCountTitle = str;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getAgreement() {
        return this.agreement;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final C15073a getButton() {
        return this.button;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final List<C15074b> d() {
        return this.items;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getItemsCountTitle() {
        return this.itemsCountTitle;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
