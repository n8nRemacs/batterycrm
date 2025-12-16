package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerticalDto.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jj\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/VerticalDto;", "", "description", "", "id", "", "name", "profiles", "", "Lcom/avito/android/remote/model/Specific;", "defaultSpecificId", "title", BeduinCartItemModel.DISABLED_STRING, "", "disablingText", "Lcom/avito/android/remote/model/text/AttributedText;", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;ZLcom/avito/android/remote/model/text/AttributedText;)V", "getDefaultSpecificId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescription", "()Ljava/lang/String;", "getDisabled", "()Z", "getDisablingText", "()Lcom/avito/android/remote/model/text/AttributedText;", "getId", "()I", "getName", "getProfiles", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;ZLcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/VerticalDto;", "equals", PluralsKeys.OTHER, "hashCode", "toString", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerticalDto {

    @c("defaultSpecificId")
    @l
    private final Integer defaultSpecificId;

    @c("description")
    @k
    private final String description;

    @c(BeduinCartItemModel.DISABLED_STRING)
    private final boolean disabled;

    @c("disablingText")
    @l
    private final AttributedText disablingText;

    @c("id")
    private final int id;

    @c("name")
    @k
    private final String name;

    @c("specifics")
    @l
    private final List<Specific> profiles;

    @c("title")
    @k
    private final String title;

    public VerticalDto(@k String str, int i12, @k String str2, @l List<Specific> list, @l Integer num, @k String str3, boolean z12, @l AttributedText attributedText) {
        this.description = str;
        this.id = i12;
        this.name = str2;
        this.profiles = list;
        this.defaultSpecificId = num;
        this.title = str3;
        this.disabled = z12;
        this.disablingText = attributedText;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    public final List<Specific> component4() {
        return this.profiles;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Integer getDefaultSpecificId() {
        return this.defaultSpecificId;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final AttributedText getDisablingText() {
        return this.disablingText;
    }

    @k
    public final VerticalDto copy(@k String description, int id2, @k String name, @l List<Specific> profiles, @l Integer defaultSpecificId, @k String title, boolean disabled, @l AttributedText disablingText) {
        return new VerticalDto(description, id2, name, profiles, defaultSpecificId, title, disabled, disablingText);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerticalDto)) {
            return false;
        }
        VerticalDto verticalDto = (VerticalDto) other;
        return L.f(this.description, verticalDto.description) && this.id == verticalDto.id && L.f(this.name, verticalDto.name) && L.f(this.profiles, verticalDto.profiles) && L.f(this.defaultSpecificId, verticalDto.defaultSpecificId) && L.f(this.title, verticalDto.title) && this.disabled == verticalDto.disabled && L.f(this.disablingText, verticalDto.disablingText);
    }

    @l
    public final Integer getDefaultSpecificId() {
        return this.defaultSpecificId;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    @l
    public final AttributedText getDisablingText() {
        return this.disablingText;
    }

    public final int getId() {
        return this.id;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final List<Specific> getProfiles() {
        return this.profiles;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(r.e(this.id, this.description.hashCode() * 31, 31), 31, this.name);
        List<Specific> list = this.profiles;
        int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.defaultSpecificId;
        int i12 = r.i(H.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.title), 31, this.disabled);
        AttributedText attributedText = this.disablingText;
        return i12 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VerticalDto(description=");
        sb2.append(this.description);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", profiles=");
        sb2.append(this.profiles);
        sb2.append(", defaultSpecificId=");
        sb2.append(this.defaultSpecificId);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", disabled=");
        sb2.append(this.disabled);
        sb2.append(", disablingText=");
        return a.w(sb2, this.disablingText, ')');
    }
}
