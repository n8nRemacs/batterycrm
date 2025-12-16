package rY;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.ButtonAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Info.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001b"}, d2 = {"LrY/b;", "", "", "title", "LrY/d;", "subtitle", "Lcom/avito/android/remote/model/ButtonAction;", "allItemsButton", "", "LrY/c;", "items", "infoText", "<init>", "(Ljava/lang/String;LrY/d;Lcom/avito/android/remote/model/ButtonAction;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "LrY/d;", "d", "()LrY/d;", "Lcom/avito/android/remote/model/ButtonAction;", "a", "()Lcom/avito/android/remote/model/ButtonAction;", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rY.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C47615b {

    @com.google.gson.annotations.c("allItemsButton")
    @l
    private final ButtonAction allItemsButton;

    @com.google.gson.annotations.c("infoText")
    @l
    private final String infoText;

    @com.google.gson.annotations.c("items")
    @l
    private final List<C47616c> items;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final C47617d subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C47615b(@k String str, @l C47617d c47617d, @l ButtonAction buttonAction, @l List<C47616c> list, @l String str2) {
        this.title = str;
        this.subtitle = c47617d;
        this.allItemsButton = buttonAction;
        this.items = list;
        this.infoText = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final ButtonAction getAllItemsButton() {
        return this.allItemsButton;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getInfoText() {
        return this.infoText;
    }

    @l
    public final List<C47616c> c() {
        return this.items;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final C47617d getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47615b)) {
            return false;
        }
        C47615b c47615b = (C47615b) obj;
        return L.f(this.title, c47615b.title) && L.f(this.subtitle, c47615b.subtitle) && L.f(this.allItemsButton, c47615b.allItemsButton) && L.f(this.items, c47615b.items) && L.f(this.infoText, c47615b.infoText);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        C47617d c47617d = this.subtitle;
        int iHashCode2 = (iHashCode + (c47617d == null ? 0 : c47617d.hashCode())) * 31;
        ButtonAction buttonAction = this.allItemsButton;
        int iHashCode3 = (iHashCode2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        List<C47616c> list = this.items;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.infoText;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Info(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", allItemsButton=");
        sb2.append(this.allItemsButton);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", infoText=");
        return C22026a.c(sb2, this.infoText, ')');
    }
}
