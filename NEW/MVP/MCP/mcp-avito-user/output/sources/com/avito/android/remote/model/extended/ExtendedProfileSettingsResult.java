package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.category_parameters.BeduinParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsResult.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jt\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u000bHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/extended/ExtendedProfileSettingsResult;", "", "action", "Lcom/avito/android/remote/model/DeeplinkAction;", AdFormat.BANNER, "Lcom/avito/android/remote/model/extended/Banner;", "profileView", "Lcom/avito/android/remote/model/extended/ExtendedProfileInfo;", "toggle", "Lcom/avito/android/remote/model/extended/Toggle;", "userHash", "", "dontShowActionAndProfileView", "", "widgets", "", "Lcom/avito/android/remote/model/extended/ExtendedSettingsWidget;", BeduinParameter.TYPE, "Lcom/avito/android/remote/model/extended/ExtendedProfileSettingsBeduin;", "(Lcom/avito/android/remote/model/DeeplinkAction;Lcom/avito/android/remote/model/extended/Banner;Lcom/avito/android/remote/model/extended/ExtendedProfileInfo;Lcom/avito/android/remote/model/extended/Toggle;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/extended/ExtendedProfileSettingsBeduin;)V", "getAction", "()Lcom/avito/android/remote/model/DeeplinkAction;", "getBanner", "()Lcom/avito/android/remote/model/extended/Banner;", "getBeduin", "()Lcom/avito/android/remote/model/extended/ExtendedProfileSettingsBeduin;", "getDontShowActionAndProfileView", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProfileView", "()Lcom/avito/android/remote/model/extended/ExtendedProfileInfo;", "getToggle", "()Lcom/avito/android/remote/model/extended/Toggle;", "getUserHash", "()Ljava/lang/String;", "getWidgets", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/avito/android/remote/model/DeeplinkAction;Lcom/avito/android/remote/model/extended/Banner;Lcom/avito/android/remote/model/extended/ExtendedProfileInfo;Lcom/avito/android/remote/model/extended/Toggle;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/extended/ExtendedProfileSettingsBeduin;)Lcom/avito/android/remote/model/extended/ExtendedProfileSettingsResult;", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileSettingsResult {

    @c("action")
    @l
    private final DeeplinkAction action;

    @c(AdFormat.BANNER)
    @l
    private final Banner banner;

    @c(BeduinParameter.TYPE)
    @l
    private final ExtendedProfileSettingsBeduin beduin;

    @c("dontShowActionAndProfileView")
    @l
    private final Boolean dontShowActionAndProfileView;

    @c("profileView")
    @l
    private final ExtendedProfileInfo profileView;

    @c("toggle")
    @l
    private final Toggle toggle;

    @c("userHash")
    @l
    private final String userHash;

    @c("widgets")
    @l
    private final List<ExtendedSettingsWidget> widgets;

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedProfileSettingsResult(@l DeeplinkAction deeplinkAction, @l Banner banner, @l ExtendedProfileInfo extendedProfileInfo, @l Toggle toggle, @l String str, @l Boolean bool, @l List<? extends ExtendedSettingsWidget> list, @l ExtendedProfileSettingsBeduin extendedProfileSettingsBeduin) {
        this.action = deeplinkAction;
        this.banner = banner;
        this.profileView = extendedProfileInfo;
        this.toggle = toggle;
        this.userHash = str;
        this.dontShowActionAndProfileView = bool;
        this.widgets = list;
        this.beduin = extendedProfileSettingsBeduin;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final DeeplinkAction getAction() {
        return this.action;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Banner getBanner() {
        return this.banner;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ExtendedProfileInfo getProfileView() {
        return this.profileView;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Toggle getToggle() {
        return this.toggle;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getUserHash() {
        return this.userHash;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getDontShowActionAndProfileView() {
        return this.dontShowActionAndProfileView;
    }

    @l
    public final List<ExtendedSettingsWidget> component7() {
        return this.widgets;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final ExtendedProfileSettingsBeduin getBeduin() {
        return this.beduin;
    }

    @k
    public final ExtendedProfileSettingsResult copy(@l DeeplinkAction action, @l Banner banner, @l ExtendedProfileInfo profileView, @l Toggle toggle, @l String userHash, @l Boolean dontShowActionAndProfileView, @l List<? extends ExtendedSettingsWidget> widgets, @l ExtendedProfileSettingsBeduin beduin) {
        return new ExtendedProfileSettingsResult(action, banner, profileView, toggle, userHash, dontShowActionAndProfileView, widgets, beduin);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileSettingsResult)) {
            return false;
        }
        ExtendedProfileSettingsResult extendedProfileSettingsResult = (ExtendedProfileSettingsResult) other;
        return L.f(this.action, extendedProfileSettingsResult.action) && L.f(this.banner, extendedProfileSettingsResult.banner) && L.f(this.profileView, extendedProfileSettingsResult.profileView) && L.f(this.toggle, extendedProfileSettingsResult.toggle) && L.f(this.userHash, extendedProfileSettingsResult.userHash) && L.f(this.dontShowActionAndProfileView, extendedProfileSettingsResult.dontShowActionAndProfileView) && L.f(this.widgets, extendedProfileSettingsResult.widgets) && L.f(this.beduin, extendedProfileSettingsResult.beduin);
    }

    @l
    public final DeeplinkAction getAction() {
        return this.action;
    }

    @l
    public final Banner getBanner() {
        return this.banner;
    }

    @l
    public final ExtendedProfileSettingsBeduin getBeduin() {
        return this.beduin;
    }

    @l
    public final Boolean getDontShowActionAndProfileView() {
        return this.dontShowActionAndProfileView;
    }

    @l
    public final ExtendedProfileInfo getProfileView() {
        return this.profileView;
    }

    @l
    public final Toggle getToggle() {
        return this.toggle;
    }

    @l
    public final String getUserHash() {
        return this.userHash;
    }

    @l
    public final List<ExtendedSettingsWidget> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        DeeplinkAction deeplinkAction = this.action;
        int iHashCode = (deeplinkAction == null ? 0 : deeplinkAction.hashCode()) * 31;
        Banner banner = this.banner;
        int iHashCode2 = (iHashCode + (banner == null ? 0 : banner.hashCode())) * 31;
        ExtendedProfileInfo extendedProfileInfo = this.profileView;
        int iHashCode3 = (iHashCode2 + (extendedProfileInfo == null ? 0 : extendedProfileInfo.hashCode())) * 31;
        Toggle toggle = this.toggle;
        int iHashCode4 = (iHashCode3 + (toggle == null ? 0 : toggle.hashCode())) * 31;
        String str = this.userHash;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.dontShowActionAndProfileView;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<ExtendedSettingsWidget> list = this.widgets;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        ExtendedProfileSettingsBeduin extendedProfileSettingsBeduin = this.beduin;
        return iHashCode7 + (extendedProfileSettingsBeduin != null ? extendedProfileSettingsBeduin.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ExtendedProfileSettingsResult(action=" + this.action + ", banner=" + this.banner + ", profileView=" + this.profileView + ", toggle=" + this.toggle + ", userHash=" + this.userHash + ", dontShowActionAndProfileView=" + this.dontShowActionAndProfileView + ", widgets=" + this.widgets + ", beduin=" + this.beduin + ')';
    }
}
