package ru.cyberity.cbr.core.data.model;

import android.graphics.drawable.Drawable;
import android.util.Patterns;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRSupportItem.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b \u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b$\u0010\u0011R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSupportItem;", "", "", "title", "subtitle", "Lru/cyberity/cbr/core/data/model/CBRSupportItem$Type;", "type", "value", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "iconName", "Lkotlin/Function1;", "Lkotlin/G0;", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/CBRSupportItem$Type;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;LY41/l;)V", "isValid", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lru/cyberity/cbr/core/data/model/CBRSupportItem$Type;", "getType", "()Lru/cyberity/cbr/core/data/model/CBRSupportItem$Type;", "getValue", "Landroid/graphics/drawable/Drawable;", "getIconDrawable", "()Landroid/graphics/drawable/Drawable;", "getIconName", "LY41/l;", "getOnClick", "()LY41/l;", "Type", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public final /* data */ class CBRSupportItem {

    @Y61.l
    private final Drawable iconDrawable;

    @Y61.l
    private final String iconName;

    @Y61.l
    private final Y41.l<CBRSupportItem, G0> onClick;

    @Y61.l
    private final String subtitle;

    @Y61.l
    private final String title;

    @Y61.k
    private final Type type;

    @Y61.k
    private final String value;

    /* compiled from: CBRSupportItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSupportItem$Type;", "", "(Ljava/lang/String;I)V", "Url", "Email", "Custom", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Type {
        Url,
        Email,
        Custom
    }

    /* compiled from: CBRSupportItem.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            iArr[Type.Url.ordinal()] = 1;
            iArr[Type.Email.ordinal()] = 2;
            iArr[Type.Custom.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CBRSupportItem(@Y61.l String str, @Y61.l String str2, @Y61.k Type type, @Y61.k String str3, @Y61.l Drawable drawable, @Y61.l String str4, @Y61.l Y41.l<? super CBRSupportItem, G0> lVar) {
        this.title = str;
        this.subtitle = str2;
        this.type = type;
        this.value = str3;
        this.iconDrawable = drawable;
        this.iconName = str4;
        this.onClick = lVar;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CBRSupportItem)) {
            return false;
        }
        CBRSupportItem cBRSupportItem = (CBRSupportItem) other;
        return L.f(this.title, cBRSupportItem.title) && L.f(this.subtitle, cBRSupportItem.subtitle) && this.type == cBRSupportItem.type && L.f(this.value, cBRSupportItem.value) && L.f(this.iconDrawable, cBRSupportItem.iconDrawable) && L.f(this.iconName, cBRSupportItem.iconName) && L.f(this.onClick, cBRSupportItem.onClick);
    }

    @Y61.l
    public final Drawable getIconDrawable() {
        return this.iconDrawable;
    }

    @Y61.l
    public final String getIconName() {
        return this.iconName;
    }

    @Y61.l
    public final Y41.l<CBRSupportItem, G0> getOnClick() {
        return this.onClick;
    }

    @Y61.l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    public final Type getType() {
        return this.type;
    }

    @Y61.k
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iD2 = H.d((this.type.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.value);
        Drawable drawable = this.iconDrawable;
        int iHashCode2 = (iD2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        String str3 = this.iconName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Y41.l<CBRSupportItem, G0> lVar = this.onClick;
        return iHashCode3 + (lVar != null ? lVar.hashCode() : 0);
    }

    @Y61.l
    public final String isValid() {
        if (this.value.length() == 0 || C43066x.K(this.value)) {
            return this + ". Value must not be empty or blank.";
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i12 == 1) {
            if (Patterns.WEB_URL.matcher(this.value).matches()) {
                return null;
            }
            return this + ". Invalid url format";
        }
        if (i12 == 2) {
            if (Patterns.EMAIL_ADDRESS.matcher(this.value).matches()) {
                return null;
            }
            return this + ". Invalid email format";
        }
        if (i12 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.onClick != null) {
            return null;
        }
        return this + ". You have to implement your own onClick callback if you want to use a Custom type.";
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CBRSupportItem(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", iconDrawable=");
        sb2.append(this.iconDrawable);
        sb2.append(", iconName=");
        sb2.append(this.iconName);
        sb2.append(", onClick=");
        return H.l(sb2, this.onClick, ')');
    }

    public /* synthetic */ CBRSupportItem(String str, String str2, Type type, String str3, Drawable drawable, String str4, Y41.l lVar, int i12, C42822w c42822w) {
        this(str, str2, type, str3, (i12 & 16) != 0 ? null : drawable, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : lVar);
    }
}
