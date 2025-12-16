package com.avito.android.remote.model.section;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.section.complementary_v3.SectionElementV3;
import com.avito.android.remote.model.section.complementary_v3.SectionTypeElementV3;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SectionTypeItemV3.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010 R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\u0005\u0010$R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\u0007\u0010$R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/section/SectionTypeItemV3;", "Lcom/avito/android/remote/model/section/complementary_v3/SectionTypeElementV3;", "title", "", "subtitle", "isAvailableToHide", "", "isCollapsed", "action", "Lcom/avito/android/remote/model/Action;", "items", "", "Lcom/avito/android/remote/model/section/complementary_v3/SectionElementV3;", Navigation.DISPLAYING, "Lcom/avito/android/remote/model/section/SectionDisplaying;", "context", "engine", "displayType", "Lcom/avito/android/remote/model/SerpDisplayType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/Action;Ljava/util/List;Lcom/avito/android/remote/model/section/SectionDisplaying;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/SerpDisplayType;)V", "getAction", "()Lcom/avito/android/remote/model/Action;", "getContext", "()Ljava/lang/String;", "getDisplayType", "()Lcom/avito/android/remote/model/SerpDisplayType;", "getDisplaying", "()Lcom/avito/android/remote/model/section/SectionDisplaying;", "getEngine", "iconUri", "getIconUri", "setIconUri", "(Ljava/lang/String;)V", "id", "getId", "setId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getItems", "()Ljava/util/List;", "getSubtitle", "getTitle", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SectionTypeItemV3 implements SectionTypeElementV3 {

    @c("action")
    @l
    private final Action action;

    @c("context")
    @l
    private final String context;

    @c("displayType")
    @l
    private final SerpDisplayType displayType;

    @c(Navigation.DISPLAYING)
    @l
    private final SectionDisplaying displaying;

    @c("engine")
    @l
    private final String engine;

    @c("isAvailableToHide")
    @l
    private final Boolean isAvailableToHide;

    @c("isCollapsed")
    @l
    private final Boolean isCollapsed;

    @c("list")
    @k
    private final List<SectionElementV3> items;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    @k
    private String id = "";

    @k
    private String iconUri = "";

    /* JADX WARN: Multi-variable type inference failed */
    public SectionTypeItemV3(@l String str, @l String str2, @l Boolean bool, @l Boolean bool2, @l Action action, @k List<? extends SectionElementV3> list, @l SectionDisplaying sectionDisplaying, @l String str3, @l String str4, @l SerpDisplayType serpDisplayType) {
        this.title = str;
        this.subtitle = str2;
        this.isAvailableToHide = bool;
        this.isCollapsed = bool2;
        this.action = action;
        this.items = list;
        this.displaying = sectionDisplaying;
        this.context = str3;
        this.engine = str4;
        this.displayType = serpDisplayType;
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    @l
    public final String getContext() {
        return this.context;
    }

    @l
    public final SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @l
    public final SectionDisplaying getDisplaying() {
        return this.displaying;
    }

    @l
    public final String getEngine() {
        return this.engine;
    }

    @Override // com.avito.android.remote.model.section.complementary_v3.SectionTypeElementV3
    @k
    public String getIconUri() {
        return this.iconUri;
    }

    @Override // com.avito.android.remote.model.section.complementary_v3.SectionTypeElementV3
    @k
    public String getId() {
        return this.id;
    }

    @k
    public final List<SectionElementV3> getItems() {
        return this.items;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: isAvailableToHide, reason: from getter */
    public final Boolean getIsAvailableToHide() {
        return this.isAvailableToHide;
    }

    @l
    /* renamed from: isCollapsed, reason: from getter */
    public final Boolean getIsCollapsed() {
        return this.isCollapsed;
    }

    @Override // com.avito.android.remote.model.section.complementary_v3.SectionTypeElementV3
    public void setIconUri(@k String str) {
        this.iconUri = str;
    }

    @Override // com.avito.android.remote.model.section.complementary_v3.SectionTypeElementV3
    public void setId(@k String str) {
        this.id = str;
    }
}
