package vD0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CheckBoxResult.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b!\u0010\u0013¨\u0006\""}, d2 = {"LvD0/a;", "", "", "id", "title", "parentId", "", "isRoot", "", "level", "isEnabled", "isSelected", "", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "f", "d", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "g", "i", "Ljava/util/List;", "a", "()Ljava/util/List;", "e", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vD0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49197a {

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
    @l
    private final List<C49197a> children;

    @c("id")
    @k
    private final String id;

    @c("isEnabled")
    @l
    private final Boolean isEnabled;

    @c("isRoot")
    @l
    private final Boolean isRoot;

    @c("isSelected")
    @l
    private final Boolean isSelected;

    @c("level")
    @l
    private final Integer level;

    @c("parentId")
    @l
    private final String parentId;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    public C49197a(@k String str, @k String str2, @l String str3, @l Boolean bool, @l Integer num, @l Boolean bool2, @l Boolean bool3, @l List<C49197a> list, @l String str4) {
        this.id = str;
        this.title = str2;
        this.parentId = str3;
        this.isRoot = bool;
        this.level = num;
        this.isEnabled = bool2;
        this.isSelected = bool3;
        this.children = list;
        this.subtitle = str4;
    }

    @l
    public final List<C49197a> a() {
        return this.children;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getLevel() {
        return this.level;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final Boolean getIsRoot() {
        return this.isRoot;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }
}
