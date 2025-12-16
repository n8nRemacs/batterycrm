package uY;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2NewDevelopmentsCatalogBuildingsByDevelopmentIdGetResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001b"}, d2 = {"LuY/c;", "", "LuY/d;", "allItemsButton", "", "infoText", "", "LuY/e;", "items", "LuY/f;", "subtitle", "title", "<init>", "(LuY/d;Ljava/lang/String;Ljava/util/List;LuY/f;Ljava/lang/String;)V", "LuY/d;", "a", "()LuY/d;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "LuY/f;", "d", "()LuY/f;", "e", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uY.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48999c {

    @com.google.gson.annotations.c("allItemsButton")
    @l
    private final C49000d allItemsButton;

    @com.google.gson.annotations.c("infoText")
    @l
    private final String infoText;

    @com.google.gson.annotations.c("items")
    @k
    private final List<C49001e> items;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final C49002f subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C48999c(@l C49000d c49000d, @l String str, @k List<C49001e> list, @l C49002f c49002f, @k String str2) {
        this.allItemsButton = c49000d;
        this.infoText = str;
        this.items = list;
        this.subtitle = c49002f;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C49000d getAllItemsButton() {
        return this.allItemsButton;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getInfoText() {
        return this.infoText;
    }

    @k
    public final List<C49001e> c() {
        return this.items;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final C49002f getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
