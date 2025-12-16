package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.CanHaveTypeCorrection;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasConstraints;
import com.avito.android.remote.model.category_parameters.base.HasPlaceholder;
import com.avito.android.remote.model.category_parameters.base.HasSubtitle;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.base.WithDependency;
import com.avito.android.remote.model.category_parameters.base.WithOnValidationFailedDeeplink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43026i;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: SelectParameter.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\t?@ABCDEFGB\t\b\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u000bR \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00178&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001e\u0010,\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\f0-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010&R\u0016\u00106\u001a\u0004\u0018\u0001038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010#R\u0016\u0010<\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001c\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0015\u0082\u0001\u0002HI¨\u0006J"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "Lcom/avito/android/remote/model/category_parameters/base/HasPlaceholder;", "Lcom/avito/android/remote/model/category_parameters/base/CanHaveTypeCorrection;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "Lcom/avito/android/remote/model/category_parameters/base/WithOnValidationFailedDeeplink;", "Lcom/avito/android/remote/model/category_parameters/base/WithDependency;", "Lcom/avito/android/remote/model/category_parameters/base/HasConstraints;", "<init>", "()V", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value;", "getSelectedValue", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value;", "getChosenOrCurrentSelectedValue", "Lkotlin/G0;", "applyChosenValue", "", "Lcom/avito/android/remote/model/ParcelableEntity;", "getListToShow", "()Ljava/util/List;", "listToShow", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;", "getChosenValue", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;", "setChosenValue", "(Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;)V", "chosenValue", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;", "getDisplaying", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;", Navigation.DISPLAYING, "", "getUpdatesObjectForm", "()Ljava/lang/Boolean;", "updatesObjectForm", "getHasSuggest", "()Z", "hasSuggest", "getDisplayTitle", "()Ljava/lang/String;", "setDisplayTitle", "(Ljava/lang/String;)V", "displayTitle", "", "getValuesSet", "()Ljava/util/Set;", "valuesSet", "getResetAreaOnChange", "resetAreaOnChange", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget;", "getWidget", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget;", "widget", "getTypoCorrectionEnabled", "typoCorrectionEnabled", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnValidationFailedDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "onValidationFailedDeeplink", "getParamsMustBeFilled", "paramsMustBeFilled", "Displaying", "EarlyAccess", "Flat", "Sectioned", "Separator", "Type", "UserChosenValue", "Value", "Widget", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Sectioned;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class SelectParameter extends EditableParameter<String> implements HasPlaceholder, CanHaveTypeCorrection, Visibility, Phantom, WithOnValidationFailedDeeplink, WithDependency, HasConstraints {

    /* compiled from: SelectParameter.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$EarlyAccess;", "Landroid/os/Parcelable;", "", "disabledId", "disabledEarlyAccessText", "enabledId", "enabledEarlyAccessText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/SelectParameter$EarlyAccess;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDisabledId", "getDisabledEarlyAccessText", "getEnabledId", "getEnabledEarlyAccessText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EarlyAccess implements Parcelable {

        @k
        public static final Parcelable.Creator<EarlyAccess> CREATOR = new Creator();

        @c("disabledEarlyAccessText")
        @k
        private final String disabledEarlyAccessText;

        @c("disabledId")
        @k
        private final String disabledId;

        @c("enabledEarlyAccessText")
        @k
        private final String enabledEarlyAccessText;

        @c("enabledId")
        @k
        private final String enabledId;

        /* compiled from: SelectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EarlyAccess> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EarlyAccess createFromParcel(@k Parcel parcel) {
                return new EarlyAccess(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EarlyAccess[] newArray(int i12) {
                return new EarlyAccess[i12];
            }
        }

        public EarlyAccess(@k String str, @k String str2, @k String str3, @k String str4) {
            this.disabledId = str;
            this.disabledEarlyAccessText = str2;
            this.enabledId = str3;
            this.enabledEarlyAccessText = str4;
        }

        public static /* synthetic */ EarlyAccess copy$default(EarlyAccess earlyAccess, String str, String str2, String str3, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = earlyAccess.disabledId;
            }
            if ((i12 & 2) != 0) {
                str2 = earlyAccess.disabledEarlyAccessText;
            }
            if ((i12 & 4) != 0) {
                str3 = earlyAccess.enabledId;
            }
            if ((i12 & 8) != 0) {
                str4 = earlyAccess.enabledEarlyAccessText;
            }
            return earlyAccess.copy(str, str2, str3, str4);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getDisabledId() {
            return this.disabledId;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getDisabledEarlyAccessText() {
            return this.disabledEarlyAccessText;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getEnabledId() {
            return this.enabledId;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getEnabledEarlyAccessText() {
            return this.enabledEarlyAccessText;
        }

        @k
        public final EarlyAccess copy(@k String disabledId, @k String disabledEarlyAccessText, @k String enabledId, @k String enabledEarlyAccessText) {
            return new EarlyAccess(disabledId, disabledEarlyAccessText, enabledId, enabledEarlyAccessText);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EarlyAccess)) {
                return false;
            }
            EarlyAccess earlyAccess = (EarlyAccess) other;
            return L.f(this.disabledId, earlyAccess.disabledId) && L.f(this.disabledEarlyAccessText, earlyAccess.disabledEarlyAccessText) && L.f(this.enabledId, earlyAccess.enabledId) && L.f(this.enabledEarlyAccessText, earlyAccess.enabledEarlyAccessText);
        }

        @k
        public final String getDisabledEarlyAccessText() {
            return this.disabledEarlyAccessText;
        }

        @k
        public final String getDisabledId() {
            return this.disabledId;
        }

        @k
        public final String getEnabledEarlyAccessText() {
            return this.enabledEarlyAccessText;
        }

        @k
        public final String getEnabledId() {
            return this.enabledId;
        }

        public int hashCode() {
            return this.enabledEarlyAccessText.hashCode() + H.d(H.d(this.disabledId.hashCode() * 31, 31, this.disabledEarlyAccessText), 31, this.enabledId);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("EarlyAccess(disabledId=");
            sb2.append(this.disabledId);
            sb2.append(", disabledEarlyAccessText=");
            sb2.append(this.disabledEarlyAccessText);
            sb2.append(", enabledId=");
            sb2.append(this.enabledId);
            sb2.append(", enabledEarlyAccessText=");
            return C22026a.c(sb2, this.enabledEarlyAccessText, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.disabledId);
            parcel.writeString(this.disabledEarlyAccessText);
            parcel.writeString(this.enabledId);
            parcel.writeString(this.enabledEarlyAccessText);
        }
    }

    /* compiled from: SelectParameter.kt */
    @s0
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b>\b\u0087\b\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u0002:\u0002\u0097\u0001B¯\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0011¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b)\u0010*J\u0011\u0010+\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b/\u0010-J\u0012\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b4\u00103J\u0012\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u00101J\u0012\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b8\u00107J\u0012\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b9\u0010-J\u0012\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b>\u0010-J\u0012\u0010?\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0018\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bC\u00107J\u0012\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bD\u00107J\u0012\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bE\u00107J\u0012\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bF\u0010-J\u0012\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bG\u0010-J\u0012\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bH\u0010-J\u0010\u0010I\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bI\u00103J\u0012\u0010J\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0018\u0010L\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bL\u0010MJÄ\u0002\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\"\u001a\u00020\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\bP\u0010QJ\u001a\u0010T\u001a\u00020\b2\b\u0010S\u001a\u0004\u0018\u00010RHÖ\u0003¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\bV\u0010QJ \u0010[\u001a\u00020Z2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b[\u0010\\J%\u0010_\u001a\u0004\u0018\u00010\u00122\b\u0010]\u001a\u0004\u0018\u00010\u00032\b\u0010^\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b_\u0010`J\u001f\u0010b\u001a\u00020\u00122\u0006\u0010]\u001a\u00020\u00032\u0006\u0010a\u001a\u00020\u0003H\u0002¢\u0006\u0004\bb\u0010`J\u0018\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÂ\u0003¢\u0006\u0004\bc\u0010MJ\u0012\u0010d\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0004\bd\u00107R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010e\u001a\u0004\bf\u0010-R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010e\u001a\u0004\bg\u0010-R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010h\u001a\u0004\bi\u00101R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010j\u001a\u0004\bk\u00103R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010j\u001a\u0004\bl\u00103R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010h\u001a\u0004\bm\u00101R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010n\u001a\u0004\bo\u00107R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010n\u001a\u0004\bp\u00107R$\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010e\u001a\u0004\bq\u0010-\"\u0004\br\u0010sR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010t\u001a\u0004\bu\u0010;\"\u0004\bv\u0010wR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010xR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010y\u001a\u0004\bz\u0010=R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010e\u001a\u0004\b{\u0010-R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010|\u001a\u0004\b}\u0010@R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010~\u001a\u0004\b\u007f\u0010BR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010n\u001a\u0004\b\u001b\u00107R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001c\u0010n\u001a\u0005\b\u0080\u0001\u00107R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001d\u0010n\u001a\u0005\b\u0081\u0001\u00107R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001e\u0010e\u001a\u0005\b\u0082\u0001\u0010-R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010nR&\u0010 \u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0004\b \u0010e\u001a\u0005\b\u0083\u0001\u0010-\"\u0005\b\u0084\u0001\u0010sR\u001d\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0004\b!\u0010e\u001a\u0005\b\u0085\u0001\u0010-R\u001b\u0010\"\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\"\u0010j\u001a\u0005\b\u0086\u0001\u00103R\u001e\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b$\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010KR#\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\r\n\u0004\b&\u0010x\u001a\u0005\b\u0089\u0001\u0010MR\u0016\u0010\u008b\u0001\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010-R5\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\r\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u008d\u0001\u0010M\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u00198VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010BR\u0016\u0010\u0094\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u00103R\u001c\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010M¨\u0006\u0098\u0001"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter;", "Lcom/avito/android/remote/model/category_parameters/base/HasSubtitle;", "", "id", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "", "required", "immutable", "motivation", "updatesForm", "updatesObjectForm", "_value", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;", "chosenValue", "", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value;", "_values", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;", Navigation.DISPLAYING, ChannelContext.Item.PLACEHOLDER, "", "attributeId", "", "availableOptions", "isEnabled", "visible", "phantom", "resetValue", "_hasSuggest", "displayTitle", "defaultValue", "resetAreaOnChange", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget;", "widget", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "constraints", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Set;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/category_parameters/SelectParameter$Widget;Ljava/util/List;)V", "getSelectedValue", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value;", "getChosenOrCurrentSelectedValue", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "()Z", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;", "component12", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;", "component13", "component14", "()Ljava/lang/Integer;", "component15", "()Ljava/util/Set;", "component16", "component17", "component18", "component19", "component21", "component22", "component23", "component24", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget;", "component25", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Set;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/category_parameters/SelectParameter$Widget;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/SelectParameter$Flat;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "valueId", "valueTitle", "getValue", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value;", "displayValue", "createSuggestedValue", "component11", "component20", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Z", "getRequired", "getImmutable", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "getUpdatesObjectForm", "get_value", "set_value", "(Ljava/lang/String;)V", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;", "getChosenValue", "setChosenValue", "(Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;)V", "Ljava/util/List;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;", "getDisplaying", "getPlaceholder", "Ljava/lang/Integer;", "getAttributeId", "Ljava/util/Set;", "getAvailableOptions", "getVisible", "getPhantom", "getResetValue", "getDisplayTitle", "setDisplayTitle", "getDefaultValue", "getResetAreaOnChange", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget;", "getWidget", "getConstraints", "getType", "type", "value", "getValues", "setValues", "(Ljava/util/List;)V", "values", "getValuesSet", "valuesSet", "getHasSuggest", "hasSuggest", "getListToShow", "listToShow", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Flat extends SelectParameter implements HasSubtitle {

        @k
        public static final String LEGACY_TYPE = "chips";

        @k
        public static final String TYPE = "select";

        @c("hasSuggest")
        @l
        private final Boolean _hasSuggest;

        @c("value")
        @l
        private String _value;

        @c("values")
        @l
        private List<Value> _values;

        @c("attrId")
        @l
        private final Integer attributeId;

        @c("availableOptions")
        @l
        private final Set<String> availableOptions;

        @l
        private UserChosenValue chosenValue;

        @c("constraints")
        @l
        private final List<Constraint> constraints;

        @c("defaultValue")
        @l
        private final String defaultValue;

        @c("displayTitle")
        @l
        private String displayTitle;

        @c(Navigation.DISPLAYING)
        @l
        private final Displaying displaying;

        @c("id")
        @k
        private final String id;

        @c("immutable")
        private final boolean immutable;

        @c("isEnabled")
        @l
        private final Boolean isEnabled;

        @c("motivation")
        @l
        private final AttributedText motivation;

        @c("phantom")
        @l
        private final Boolean phantom;

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("required")
        private final boolean required;

        @c("resetAreaOnChange")
        private final boolean resetAreaOnChange;

        @c("resetValue")
        @l
        private final String resetValue;

        @c("subtitle")
        @l
        private final AttributedText subtitle;

        @c("title")
        @k
        private final String title;

        @c("updatesForm")
        @l
        private final Boolean updatesForm;

        @c("updatesObjectForm")
        @l
        private final Boolean updatesObjectForm;

        @c("visible")
        @l
        private final Boolean visible;

        @c("widget")
        @l
        private final Widget widget;

        @k
        public static final Parcelable.Creator<Flat> CREATOR = new Creator();

        /* compiled from: SelectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Flat> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Flat createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                ArrayList arrayList;
                Displaying displaying;
                LinkedHashSet linkedHashSet;
                Boolean boolValueOf3;
                Boolean boolValueOf4;
                Boolean boolValueOf5;
                Boolean boolValueOf6;
                LinkedHashSet linkedHashSet2;
                ArrayList arrayList2;
                String string = parcel.readString();
                String string2 = parcel.readString();
                AttributedText attributedText = (AttributedText) parcel.readParcelable(Flat.class.getClassLoader());
                boolean z12 = parcel.readInt() != 0;
                boolean z13 = parcel.readInt() != 0;
                AttributedText attributedText2 = (AttributedText) parcel.readParcelable(Flat.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string3 = parcel.readString();
                UserChosenValue userChosenValue = (UserChosenValue) parcel.readParcelable(Flat.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(Value.CREATOR, parcel, arrayList3, iC2, 1);
                        i12 = i12;
                    }
                    arrayList = arrayList3;
                }
                Displaying displayingCreateFromParcel = parcel.readInt() == 0 ? null : Displaying.CREATOR.createFromParcel(parcel);
                String string4 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    displaying = displayingCreateFromParcel;
                    linkedHashSet = null;
                } else {
                    int i13 = parcel.readInt();
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet(i13);
                    displaying = displayingCreateFromParcel;
                    int i14 = 0;
                    while (i14 != i13) {
                        linkedHashSet3.add(parcel.readString());
                        i14++;
                        i13 = i13;
                    }
                    linkedHashSet = linkedHashSet3;
                }
                if (parcel.readInt() == 0) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf5 = null;
                } else {
                    boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf6 = null;
                } else {
                    boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                boolean z14 = parcel.readInt() != 0;
                Widget widgetCreateFromParcel = parcel.readInt() == 0 ? null : Widget.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashSet2 = linkedHashSet;
                    arrayList2 = null;
                } else {
                    int i15 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i15);
                    linkedHashSet2 = linkedHashSet;
                    int iL2 = 0;
                    while (iL2 != i15) {
                        iL2 = a.l(Flat.class, parcel, arrayList4, iL2, 1);
                        i15 = i15;
                    }
                    arrayList2 = arrayList4;
                }
                return new Flat(string, string2, attributedText, z12, z13, attributedText2, boolValueOf, boolValueOf2, string3, userChosenValue, arrayList, displaying, string4, numValueOf, linkedHashSet2, boolValueOf3, boolValueOf4, boolValueOf5, string5, boolValueOf6, string6, string7, z14, widgetCreateFromParcel, arrayList2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Flat[] newArray(int i12) {
                return new Flat[i12];
            }
        }

        public /* synthetic */ Flat(String str, String str2, AttributedText attributedText, boolean z12, boolean z13, AttributedText attributedText2, Boolean bool, Boolean bool2, String str3, UserChosenValue userChosenValue, List list, Displaying displaying, String str4, Integer num, Set set, Boolean bool3, Boolean bool4, Boolean bool5, String str5, Boolean bool6, String str6, String str7, boolean z14, Widget widget, List list2, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : attributedText, z12, z13, attributedText2, bool, (i12 & 128) != 0 ? null : bool2, (i12 & 256) != 0 ? null : str3, (i12 & 512) != 0 ? null : userChosenValue, (i12 & 1024) != 0 ? new ArrayList() : list, (i12 & 2048) != 0 ? null : displaying, (i12 & 4096) != 0 ? null : str4, (i12 & 8192) != 0 ? -1 : num, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : set, (32768 & i12) != 0 ? null : bool3, (65536 & i12) != 0 ? Boolean.FALSE : bool4, (131072 & i12) != 0 ? Boolean.FALSE : bool5, (262144 & i12) != 0 ? null : str5, (524288 & i12) != 0 ? null : bool6, (1048576 & i12) != 0 ? null : str6, (2097152 & i12) != 0 ? null : str7, (4194304 & i12) != 0 ? false : z14, (8388608 & i12) != 0 ? null : widget, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? new ArrayList() : list2);
        }

        private final List<Value> component11() {
            return this._values;
        }

        /* renamed from: component20, reason: from getter */
        private final Boolean get_hasSuggest() {
            return this._hasSuggest;
        }

        private final Value createSuggestedValue(String valueId, String displayValue) {
            return new Value(valueId, displayValue, null, null, null, null, false, null, null, null, 968, null);
        }

        private final Value getValue(String valueId, String valueTitle) {
            Object obj = null;
            if (valueId == null || valueId.length() == 0) {
                return null;
            }
            if (valueTitle != null && !C43066x.K(valueTitle)) {
                return createSuggestedValue(valueId, valueTitle);
            }
            Iterator<T> it = getValues().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(((Value) next).getId(), valueId)) {
                    obj = next;
                    break;
                }
            }
            return (Value) obj;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final UserChosenValue getChosenValue() {
            return this.chosenValue;
        }

        @l
        /* renamed from: component12, reason: from getter */
        public final Displaying getDisplaying() {
            return this.displaying;
        }

        @l
        /* renamed from: component13, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        /* renamed from: component14, reason: from getter */
        public final Integer getAttributeId() {
            return this.attributeId;
        }

        @l
        public final Set<String> component15() {
            return this.availableOptions;
        }

        @l
        /* renamed from: component16, reason: from getter */
        public final Boolean getIsEnabled() {
            return this.isEnabled;
        }

        @l
        /* renamed from: component17, reason: from getter */
        public final Boolean getVisible() {
            return this.visible;
        }

        @l
        /* renamed from: component18, reason: from getter */
        public final Boolean getPhantom() {
            return this.phantom;
        }

        @l
        /* renamed from: component19, reason: from getter */
        public final String getResetValue() {
            return this.resetValue;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component21, reason: from getter */
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        @l
        /* renamed from: component22, reason: from getter */
        public final String getDefaultValue() {
            return this.defaultValue;
        }

        /* renamed from: component23, reason: from getter */
        public final boolean getResetAreaOnChange() {
            return this.resetAreaOnChange;
        }

        @l
        /* renamed from: component24, reason: from getter */
        public final Widget getWidget() {
            return this.widget;
        }

        @l
        public final List<Constraint> component25() {
            return this.constraints;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getRequired() {
            return this.required;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getImmutable() {
            return this.immutable;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final AttributedText getMotivation() {
            return this.motivation;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final Boolean getUpdatesForm() {
            return this.updatesForm;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final Boolean getUpdatesObjectForm() {
            return this.updatesObjectForm;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final String get_value() {
            return this._value;
        }

        @k
        public final Flat copy(@k String id2, @k String title, @l AttributedText subtitle, boolean required, boolean immutable, @l AttributedText motivation, @l Boolean updatesForm, @l Boolean updatesObjectForm, @l String _value, @l UserChosenValue chosenValue, @l List<Value> _values, @l Displaying displaying, @l String placeholder, @l Integer attributeId, @l Set<String> availableOptions, @l Boolean isEnabled, @l Boolean visible, @l Boolean phantom, @l String resetValue, @l Boolean _hasSuggest, @l String displayTitle, @l String defaultValue, boolean resetAreaOnChange, @l Widget widget, @l List<? extends Constraint> constraints) {
            return new Flat(id2, title, subtitle, required, immutable, motivation, updatesForm, updatesObjectForm, _value, chosenValue, _values, displaying, placeholder, attributeId, availableOptions, isEnabled, visible, phantom, resetValue, _hasSuggest, displayTitle, defaultValue, resetAreaOnChange, widget, constraints);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Flat)) {
                return false;
            }
            Flat flat = (Flat) other;
            return L.f(this.id, flat.id) && L.f(this.title, flat.title) && L.f(this.subtitle, flat.subtitle) && this.required == flat.required && this.immutable == flat.immutable && L.f(this.motivation, flat.motivation) && L.f(this.updatesForm, flat.updatesForm) && L.f(this.updatesObjectForm, flat.updatesObjectForm) && L.f(this._value, flat._value) && L.f(this.chosenValue, flat.chosenValue) && L.f(this._values, flat._values) && L.f(this.displaying, flat.displaying) && L.f(this.placeholder, flat.placeholder) && L.f(this.attributeId, flat.attributeId) && L.f(this.availableOptions, flat.availableOptions) && L.f(this.isEnabled, flat.isEnabled) && L.f(this.visible, flat.visible) && L.f(this.phantom, flat.phantom) && L.f(this.resetValue, flat.resetValue) && L.f(this._hasSuggest, flat._hasSuggest) && L.f(this.displayTitle, flat.displayTitle) && L.f(this.defaultValue, flat.defaultValue) && this.resetAreaOnChange == flat.resetAreaOnChange && L.f(this.widget, flat.widget) && L.f(this.constraints, flat.constraints);
        }

        @Override // com.avito.android.remote.model.category_parameters.base.CanHaveTypeCorrection
        @l
        public Integer getAttributeId() {
            return this.attributeId;
        }

        @l
        public final Set<String> getAvailableOptions() {
            return this.availableOptions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @l
        public Value getChosenOrCurrentSelectedValue() {
            Q q12;
            UserChosenValue chosenValue = getChosenValue();
            if (chosenValue instanceof UserChosenValue.SuggestedValue) {
                UserChosenValue.SuggestedValue suggestedValue = (UserChosenValue.SuggestedValue) chosenValue;
                q12 = new Q(suggestedValue.getId(), suggestedValue.getName());
            } else {
                q12 = chosenValue instanceof UserChosenValue.ValueId ? new Q(((UserChosenValue.ValueId) chosenValue).getId(), null) : chosenValue instanceof UserChosenValue.ClearValue ? new Q(null, null) : new Q(getValue(), getDisplayTitle());
            }
            return getValue((String) q12.f406619b, (String) q12.f406620c);
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @l
        public UserChosenValue getChosenValue() {
            return this.chosenValue;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.HasConstraints
        @l
        public List<Constraint> getConstraints() {
            return this.constraints;
        }

        @l
        public final String getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @l
        public String getDisplayTitle() {
            return this.displayTitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @l
        public Displaying getDisplaying() {
            return this.displaying;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        public boolean getHasSuggest() {
            return L.f(this._hasSuggest, Boolean.TRUE);
        }

        @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        public boolean getImmutable() {
            return this.immutable;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @k
        public List<Value> getListToShow() {
            if (this.availableOptions == null) {
                return getValues();
            }
            List<Value> values = getValues();
            ArrayList arrayList = new ArrayList();
            for (Object obj : values) {
                if (this.availableOptions.contains(((Value) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @l
        public AttributedText getMotivation() {
            return this.motivation;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.Phantom
        @l
        public Boolean getPhantom() {
            return this.phantom;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.HasPlaceholder
        @l
        public String getPlaceholder() {
            return this.placeholder;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        public boolean getRequired() {
            return this.required;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        public boolean getResetAreaOnChange() {
            return this.resetAreaOnChange;
        }

        @l
        public final String getResetValue() {
            return this.resetValue;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @l
        public Value getSelectedValue() {
            return getValue(getValue(), getDisplayTitle());
        }

        @Override // com.avito.android.remote.model.category_parameters.base.HasSubtitle
        @l
        public AttributedText getSubtitle() {
            return this.subtitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @k
        public String getType() {
            return "select";
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
        @l
        public Boolean getUpdatesForm() {
            return this.updatesForm;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @l
        public Boolean getUpdatesObjectForm() {
            return this.updatesObjectForm;
        }

        @k
        public final List<Value> getValues() {
            List<Value> list = this._values;
            return list == null ? new ArrayList() : list;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @k
        public Set<Value> getValuesSet() {
            return C42745f0.P0(getValues());
        }

        @Override // com.avito.android.remote.model.category_parameters.base.Visibility
        @l
        public Boolean getVisible() {
            return this.visible;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @l
        public Widget getWidget() {
            return this.widget;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
        public int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
            AttributedText attributedText = this.subtitle;
            int i12 = r.i(r.i((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.required), 31, this.immutable);
            AttributedText attributedText2 = this.motivation;
            int iHashCode = (i12 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
            Boolean bool = this.updatesForm;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.updatesObjectForm;
            int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this._value;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            UserChosenValue userChosenValue = this.chosenValue;
            int iHashCode5 = (iHashCode4 + (userChosenValue == null ? 0 : userChosenValue.hashCode())) * 31;
            List<Value> list = this._values;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            Displaying displaying = this.displaying;
            int iHashCode7 = (iHashCode6 + (displaying == null ? 0 : displaying.hashCode())) * 31;
            String str2 = this.placeholder;
            int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.attributeId;
            int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
            Set<String> set = this.availableOptions;
            int iHashCode10 = (iHashCode9 + (set == null ? 0 : set.hashCode())) * 31;
            Boolean bool3 = this.isEnabled;
            int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.visible;
            int iHashCode12 = (iHashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.phantom;
            int iHashCode13 = (iHashCode12 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            String str3 = this.resetValue;
            int iHashCode14 = (iHashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool6 = this._hasSuggest;
            int iHashCode15 = (iHashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            String str4 = this.displayTitle;
            int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.defaultValue;
            int i13 = r.i((iHashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.resetAreaOnChange);
            Widget widget = this.widget;
            int iHashCode17 = (i13 + (widget == null ? 0 : widget.hashCode())) * 31;
            List<Constraint> list2 = this.constraints;
            return iHashCode17 + (list2 != null ? list2.hashCode() : 0);
        }

        @l
        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        public void setChosenValue(@l UserChosenValue userChosenValue) {
            this.chosenValue = userChosenValue;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        public void setDisplayTitle(@l String str) {
            this.displayTitle = str;
        }

        public final void setValues(@k List<Value> list) {
            this._values = list;
        }

        @k
        public String toString() {
            return "SelectParameter.Flat(id:" + getId() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.subtitle, flags);
            parcel.writeInt(this.required ? 1 : 0);
            parcel.writeInt(this.immutable ? 1 : 0);
            parcel.writeParcelable(this.motivation, flags);
            Boolean bool = this.updatesForm;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            Boolean bool2 = this.updatesObjectForm;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool2);
            }
            parcel.writeString(this._value);
            parcel.writeParcelable(this.chosenValue, flags);
            List<Value> list = this._values;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((Value) itA.next()).writeToParcel(parcel, flags);
                }
            }
            Displaying displaying = this.displaying;
            if (displaying == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                displaying.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.placeholder);
            Integer num = this.attributeId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Set<String> set = this.availableOptions;
            if (set == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
            }
            Boolean bool3 = this.isEnabled;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool3);
            }
            Boolean bool4 = this.visible;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool4);
            }
            Boolean bool5 = this.phantom;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool5);
            }
            parcel.writeString(this.resetValue);
            Boolean bool6 = this._hasSuggest;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool6);
            }
            parcel.writeString(this.displayTitle);
            parcel.writeString(this.defaultValue);
            parcel.writeInt(this.resetAreaOnChange ? 1 : 0);
            Widget widget = this.widget;
            if (widget == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                widget.writeToParcel(parcel, flags);
            }
            List<Constraint> list2 = this.constraints;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }

        @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
        @l
        public String get_value() {
            return this._value;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
        public void set_value(@l String str) {
            this._value = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Flat(@k String str, @k String str2, @l AttributedText attributedText, boolean z12, boolean z13, @l AttributedText attributedText2, @l Boolean bool, @l Boolean bool2, @l String str3, @l UserChosenValue userChosenValue, @l List<Value> list, @l Displaying displaying, @l String str4, @l Integer num, @l Set<String> set, @l Boolean bool3, @l Boolean bool4, @l Boolean bool5, @l String str5, @l Boolean bool6, @l String str6, @l String str7, boolean z14, @l Widget widget, @l List<? extends Constraint> list2) {
            super(null);
            this.id = str;
            this.title = str2;
            this.subtitle = attributedText;
            this.required = z12;
            this.immutable = z13;
            this.motivation = attributedText2;
            this.updatesForm = bool;
            this.updatesObjectForm = bool2;
            this._value = str3;
            this.chosenValue = userChosenValue;
            this._values = list;
            this.displaying = displaying;
            this.placeholder = str4;
            this.attributeId = num;
            this.availableOptions = set;
            this.isEnabled = bool3;
            this.visible = bool4;
            this.phantom = bool5;
            this.resetValue = str5;
            this._hasSuggest = bool6;
            this.displayTitle = str6;
            this.defaultValue = str7;
            this.resetAreaOnChange = z14;
            this.widget = widget;
            this.constraints = list2;
        }
    }

    /* compiled from: SelectParameter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u0083\u00012\u00020\u0001:\u0004\u0083\u0001\u0084\u0001Bë\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u000f¢\u0006\u0004\b \u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b1\u00100J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010'J\u0012\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b3\u00104J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010'J\u0012\u00108\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b:\u00100J\u0012\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b;\u00100J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010'J\u0010\u0010=\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b=\u0010+J\u0012\u0010>\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b@\u00106J\u0080\u0002\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\bC\u0010DJ\u001a\u0010G\u001a\u00020\u00052\b\u0010F\u001a\u0004\u0018\u00010EHÖ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\bI\u0010DJ \u0010N\u001a\u00020M2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\bN\u0010OJ\u0019\u0010Q\u001a\u0004\u0018\u00010\"2\u0006\u0010P\u001a\u00020\u0002H\u0002¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0012HÂ\u0003¢\u0006\u0004\bS\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0004\bU\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010V\u001a\u0004\bW\u0010'R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010V\u001a\u0004\bX\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010Y\u001a\u0004\bZ\u0010+R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010Y\u001a\u0004\b[\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\\\u001a\u0004\b]\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010^\u001a\u0004\b_\u00100R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010^\u001a\u0004\b`\u00100R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010V\u001a\u0004\ba\u0010'\"\u0004\bb\u0010cR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010d\u001a\u0004\be\u00104\"\u0004\bf\u0010gR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010h\u001a\u0004\bi\u00106R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010jR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010V\u001a\u0004\bk\u0010'R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010l\u001a\u0004\bm\u00109R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010^\u001a\u0004\bn\u00100R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010^\u001a\u0004\bo\u00100R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010V\u001a\u0004\bp\u0010'\"\u0004\bq\u0010cR\u001a\u0010\u001a\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010Y\u001a\u0004\br\u0010+R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010s\u001a\u0004\bt\u0010?R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010^R\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010h\u001a\u0004\bu\u00106R\u0014\u0010w\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010'R\u0014\u0010y\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010+R\u0016\u0010{\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010TR \u0010~\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020|0\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u00106R\u001d\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u007f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0085\u0001"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Sectioned;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter;", "", "id", "title", "", "required", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "updatesForm", "updatesObjectForm", "_value", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;", "chosenValue", "", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Sectioned$Section;", "sections", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;", "_displaying", ChannelContext.Item.PLACEHOLDER, "", "attributeId", "visible", "phantom", "displayTitle", "resetAreaOnChange", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget;", "widget", "_hasSuggest", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "constraints", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZLcom/avito/android/remote/model/category_parameters/SelectParameter$Widget;Ljava/lang/Boolean;Ljava/util/List;)V", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value;", "getSelectedValue", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value;", "getChosenOrCurrentSelectedValue", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "()Z", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "component9", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;", "component10", "()Ljava/util/List;", "component12", "component13", "()Ljava/lang/Integer;", "component14", "component15", "component16", "component17", "component18", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget;", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZLcom/avito/android/remote/model/category_parameters/SelectParameter$Widget;Ljava/lang/Boolean;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/SelectParameter$Sectioned;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "valueId", "findValueWithId", "(Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value;", "component11", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;", "component19", "Ljava/lang/String;", "getId", "getTitle", "Z", "getRequired", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "getUpdatesObjectForm", "get_value", "set_value", "(Ljava/lang/String;)V", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;", "getChosenValue", "setChosenValue", "(Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;)V", "Ljava/util/List;", "getSections", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;", "getPlaceholder", "Ljava/lang/Integer;", "getAttributeId", "getVisible", "getPhantom", "getDisplayTitle", "setDisplayTitle", "getResetAreaOnChange", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget;", "getWidget", "getConstraints", "getType", "type", "getHasSuggest", "hasSuggest", "getDisplaying", Navigation.DISPLAYING, "Lcom/avito/android/remote/model/ParcelableEntity;", "getListToShow", "listToShow", "", "getValuesSet", "()Ljava/util/Set;", "valuesSet", "Companion", "Section", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Sectioned extends SelectParameter {

        @k
        public static final String TYPE = "sectionedSelect";

        @c(Navigation.DISPLAYING)
        @l
        private final Displaying _displaying;

        @c("hasSuggest")
        @l
        private final Boolean _hasSuggest;

        @c("value")
        @l
        private String _value;

        @c("attrId")
        @l
        private final Integer attributeId;

        @l
        private UserChosenValue chosenValue;

        @c("constraints")
        @l
        private final List<Constraint> constraints;

        @c("displayTitle")
        @l
        private String displayTitle;

        @c("id")
        @k
        private final String id;

        @c("immutable")
        private final boolean immutable;

        @c("motivation")
        @l
        private final AttributedText motivation;

        @c("phantom")
        @l
        private final Boolean phantom;

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("required")
        private final boolean required;

        @c("resetAreaOnChange")
        private final boolean resetAreaOnChange;

        @c("values")
        @k
        private final List<Section> sections;

        @c("title")
        @k
        private final String title;

        @c("updatesForm")
        @l
        private final Boolean updatesForm;

        @c("updatesObjectForm")
        @l
        private final Boolean updatesObjectForm;

        @c("visible")
        @l
        private final Boolean visible;

        @c("widget")
        @l
        private final Widget widget;

        @k
        public static final Parcelable.Creator<Sectioned> CREATOR = new Creator();

        /* compiled from: SelectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Sectioned> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Sectioned createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Boolean boolValueOf3;
                Boolean boolValueOf4;
                Boolean boolValueOf5;
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z12 = parcel.readInt() != 0;
                boolean z13 = parcel.readInt() != 0;
                AttributedText attributedText = (AttributedText) parcel.readParcelable(Sectioned.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string3 = parcel.readString();
                UserChosenValue userChosenValue = (UserChosenValue) parcel.readParcelable(Sectioned.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Section.CREATOR, parcel, arrayList2, iC2, 1);
                }
                Displaying displayingCreateFromParcel = parcel.readInt() == 0 ? null : Displaying.CREATOR.createFromParcel(parcel);
                String string4 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string5 = parcel.readString();
                boolean z14 = parcel.readInt() != 0;
                Widget widgetCreateFromParcel = parcel.readInt() == 0 ? null : Widget.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    boolValueOf5 = null;
                } else {
                    boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i13 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i13);
                    int iL2 = 0;
                    while (iL2 != i13) {
                        iL2 = a.l(Sectioned.class, parcel, arrayList3, iL2, 1);
                        i13 = i13;
                    }
                    arrayList = arrayList3;
                }
                return new Sectioned(string, string2, z12, z13, attributedText, boolValueOf, boolValueOf2, string3, userChosenValue, arrayList2, displayingCreateFromParcel, string4, numValueOf, boolValueOf3, boolValueOf4, string5, z14, widgetCreateFromParcel, boolValueOf5, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Sectioned[] newArray(int i12) {
                return new Sectioned[i12];
            }
        }

        /* compiled from: SelectParameter.kt */
        @d
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Sectioned$Section;", "Landroid/os/Parcelable;", "", "sectionTitle", "", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value;", "values", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/SelectParameter$Sectioned$Section;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSectionTitle", "Ljava/util/List;", "getValues", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Section implements Parcelable {

            @k
            public static final Parcelable.Creator<Section> CREATOR = new Creator();

            @c("title")
            @l
            private final String sectionTitle;

            @c("options")
            @k
            private final List<Value> values;

            /* compiled from: SelectParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Section> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Section createFromParcel(@k Parcel parcel) {
                    String string = parcel.readString();
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(Value.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new Section(string, arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Section[] newArray(int i12) {
                    return new Section[i12];
                }
            }

            public Section() {
                this(null, null, 3, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Section copy$default(Section section, String str, List list, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = section.sectionTitle;
                }
                if ((i12 & 2) != 0) {
                    list = section.values;
                }
                return section.copy(str, list);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getSectionTitle() {
                return this.sectionTitle;
            }

            @k
            public final List<Value> component2() {
                return this.values;
            }

            @k
            public final Section copy(@l String sectionTitle, @k List<Value> values) {
                return new Section(sectionTitle, values);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Section)) {
                    return false;
                }
                Section section = (Section) other;
                return L.f(this.sectionTitle, section.sectionTitle) && L.f(this.values, section.values);
            }

            @l
            public final String getSectionTitle() {
                return this.sectionTitle;
            }

            @k
            public final List<Value> getValues() {
                return this.values;
            }

            public int hashCode() {
                String str = this.sectionTitle;
                return this.values.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Section(sectionTitle=");
                sb2.append(this.sectionTitle);
                sb2.append(", values=");
                return H.p(sb2, this.values, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.sectionTitle);
                Iterator itJ = C0.j(this.values, parcel);
                while (itJ.hasNext()) {
                    ((Value) itJ.next()).writeToParcel(parcel, flags);
                }
            }

            public Section(String str, List list, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? C42784z0.f406748b : list);
            }

            public Section(@l String str, @k List<Value> list) {
                this.sectionTitle = str;
                this.values = list;
            }
        }

        public Sectioned(String str, String str2, boolean z12, boolean z13, AttributedText attributedText, Boolean bool, Boolean bool2, String str3, UserChosenValue userChosenValue, List list, Displaying displaying, String str4, Integer num, Boolean bool3, Boolean bool4, String str5, boolean z14, Widget widget, Boolean bool5, List list2, int i12, C42822w c42822w) {
            this(str, str2, z12, z13, attributedText, bool, (i12 & 64) != 0 ? null : bool2, (i12 & 128) != 0 ? null : str3, (i12 & 256) != 0 ? null : userChosenValue, (i12 & 512) != 0 ? C42784z0.f406748b : list, (i12 & 1024) != 0 ? null : displaying, (i12 & 2048) != 0 ? null : str4, (i12 & 4096) != 0 ? -1 : num, (i12 & 8192) != 0 ? Boolean.FALSE : bool3, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? Boolean.FALSE : bool4, (32768 & i12) != 0 ? null : str5, (65536 & i12) != 0 ? false : z14, (131072 & i12) != 0 ? null : widget, (262144 & i12) != 0 ? null : bool5, (i12 & 524288) != 0 ? new ArrayList() : list2);
        }

        /* renamed from: component11, reason: from getter */
        private final Displaying get_displaying() {
            return this._displaying;
        }

        /* renamed from: component19, reason: from getter */
        private final Boolean get_hasSuggest() {
            return this._hasSuggest;
        }

        private final Value findValueWithId(String valueId) {
            Object next;
            C43026i.b bVar = new C43026i.b(C43033p.r(new o0(new C42770s0(this.sections), new h0() { // from class: com.avito.android.remote.model.category_parameters.SelectParameter$Sectioned$findValueWithId$1
                @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
                @l
                public Object get(@l Object obj) {
                    return ((SelectParameter.Sectioned.Section) obj).getValues();
                }
            })));
            while (true) {
                if (!bVar.hasNext()) {
                    next = null;
                    break;
                }
                next = bVar.next();
                if (L.f(((Value) next).getId(), valueId)) {
                    break;
                }
            }
            return (Value) next;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        public final List<Section> component10() {
            return this.sections;
        }

        @l
        /* renamed from: component12, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        /* renamed from: component13, reason: from getter */
        public final Integer getAttributeId() {
            return this.attributeId;
        }

        @l
        /* renamed from: component14, reason: from getter */
        public final Boolean getVisible() {
            return this.visible;
        }

        @l
        /* renamed from: component15, reason: from getter */
        public final Boolean getPhantom() {
            return this.phantom;
        }

        @l
        /* renamed from: component16, reason: from getter */
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        /* renamed from: component17, reason: from getter */
        public final boolean getResetAreaOnChange() {
            return this.resetAreaOnChange;
        }

        @l
        /* renamed from: component18, reason: from getter */
        public final Widget getWidget() {
            return this.widget;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        public final List<Constraint> component20() {
            return this.constraints;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getRequired() {
            return this.required;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getImmutable() {
            return this.immutable;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final AttributedText getMotivation() {
            return this.motivation;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Boolean getUpdatesForm() {
            return this.updatesForm;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final Boolean getUpdatesObjectForm() {
            return this.updatesObjectForm;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final String get_value() {
            return this._value;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final UserChosenValue getChosenValue() {
            return this.chosenValue;
        }

        @k
        public final Sectioned copy(@k String id2, @k String title, boolean required, boolean immutable, @l AttributedText motivation, @l Boolean updatesForm, @l Boolean updatesObjectForm, @l String _value, @l UserChosenValue chosenValue, @k List<Section> sections, @l Displaying _displaying, @l String placeholder, @l Integer attributeId, @l Boolean visible, @l Boolean phantom, @l String displayTitle, boolean resetAreaOnChange, @l Widget widget, @l Boolean _hasSuggest, @l List<? extends Constraint> constraints) {
            return new Sectioned(id2, title, required, immutable, motivation, updatesForm, updatesObjectForm, _value, chosenValue, sections, _displaying, placeholder, attributeId, visible, phantom, displayTitle, resetAreaOnChange, widget, _hasSuggest, constraints);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sectioned)) {
                return false;
            }
            Sectioned sectioned = (Sectioned) other;
            return L.f(this.id, sectioned.id) && L.f(this.title, sectioned.title) && this.required == sectioned.required && this.immutable == sectioned.immutable && L.f(this.motivation, sectioned.motivation) && L.f(this.updatesForm, sectioned.updatesForm) && L.f(this.updatesObjectForm, sectioned.updatesObjectForm) && L.f(this._value, sectioned._value) && L.f(this.chosenValue, sectioned.chosenValue) && L.f(this.sections, sectioned.sections) && L.f(this._displaying, sectioned._displaying) && L.f(this.placeholder, sectioned.placeholder) && L.f(this.attributeId, sectioned.attributeId) && L.f(this.visible, sectioned.visible) && L.f(this.phantom, sectioned.phantom) && L.f(this.displayTitle, sectioned.displayTitle) && this.resetAreaOnChange == sectioned.resetAreaOnChange && L.f(this.widget, sectioned.widget) && L.f(this._hasSuggest, sectioned._hasSuggest) && L.f(this.constraints, sectioned.constraints);
        }

        @Override // com.avito.android.remote.model.category_parameters.base.CanHaveTypeCorrection
        @l
        public Integer getAttributeId() {
            return this.attributeId;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @l
        public Value getChosenOrCurrentSelectedValue() {
            UserChosenValue chosenValue = getChosenValue();
            String id2 = chosenValue instanceof UserChosenValue.ValueId ? ((UserChosenValue.ValueId) chosenValue).getId() : chosenValue instanceof UserChosenValue.ClearValue ? null : getValue();
            if (id2 == null) {
                return null;
            }
            return findValueWithId(id2);
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @l
        public UserChosenValue getChosenValue() {
            return this.chosenValue;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.HasConstraints
        @l
        public List<Constraint> getConstraints() {
            return this.constraints;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @l
        public String getDisplayTitle() {
            return this.displayTitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @l
        public Displaying getDisplaying() {
            Displaying displaying = this._displaying;
            if (displaying != null) {
                return Displaying.copy$default(displaying, "default", null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -2, 511, null);
            }
            return null;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        public boolean getHasSuggest() {
            return L.f(this._hasSuggest, Boolean.TRUE);
        }

        @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        public boolean getImmutable() {
            return this.immutable;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @k
        public List<ParcelableEntity<String>> getListToShow() {
            return C43033p.D(C43033p.r(C43033p.y(new C42770s0(this.sections), SelectParameter$Sectioned$listToShow$1.INSTANCE)));
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @l
        public AttributedText getMotivation() {
            return this.motivation;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.Phantom
        @l
        public Boolean getPhantom() {
            return this.phantom;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.HasPlaceholder
        @l
        public String getPlaceholder() {
            return this.placeholder;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        public boolean getRequired() {
            return this.required;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        public boolean getResetAreaOnChange() {
            return this.resetAreaOnChange;
        }

        @k
        public final List<Section> getSections() {
            return this.sections;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @l
        public Value getSelectedValue() {
            String value = getValue();
            if (value == null) {
                return null;
            }
            return findValueWithId(value);
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
        @k
        public String getType() {
            return TYPE;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
        @l
        public Boolean getUpdatesForm() {
            return this.updatesForm;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @l
        public Boolean getUpdatesObjectForm() {
            return this.updatesObjectForm;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @k
        public Set<Value> getValuesSet() {
            List<Section> list = this.sections;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C42745f0.h(((Section) it.next()).getValues(), arrayList);
            }
            return C42745f0.P0(arrayList);
        }

        @Override // com.avito.android.remote.model.category_parameters.base.Visibility
        @l
        public Boolean getVisible() {
            return this.visible;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        @l
        public Widget getWidget() {
            return this.widget;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
        public int hashCode() {
            int i12 = r.i(r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.required), 31, this.immutable);
            AttributedText attributedText = this.motivation;
            int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            Boolean bool = this.updatesForm;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.updatesObjectForm;
            int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this._value;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            UserChosenValue userChosenValue = this.chosenValue;
            int iE2 = H.e((iHashCode4 + (userChosenValue == null ? 0 : userChosenValue.hashCode())) * 31, 31, this.sections);
            Displaying displaying = this._displaying;
            int iHashCode5 = (iE2 + (displaying == null ? 0 : displaying.hashCode())) * 31;
            String str2 = this.placeholder;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.attributeId;
            int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool3 = this.visible;
            int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.phantom;
            int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str3 = this.displayTitle;
            int i13 = r.i((iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.resetAreaOnChange);
            Widget widget = this.widget;
            int iHashCode10 = (i13 + (widget == null ? 0 : widget.hashCode())) * 31;
            Boolean bool5 = this._hasSuggest;
            int iHashCode11 = (iHashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            List<Constraint> list = this.constraints;
            return iHashCode11 + (list != null ? list.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        public void setChosenValue(@l UserChosenValue userChosenValue) {
            this.chosenValue = userChosenValue;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectParameter
        public void setDisplayTitle(@l String str) {
            this.displayTitle = str;
        }

        @k
        public String toString() {
            return "SelectParameter.Sectioned(id:" + getId() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeInt(this.required ? 1 : 0);
            parcel.writeInt(this.immutable ? 1 : 0);
            parcel.writeParcelable(this.motivation, flags);
            Boolean bool = this.updatesForm;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            Boolean bool2 = this.updatesObjectForm;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool2);
            }
            parcel.writeString(this._value);
            parcel.writeParcelable(this.chosenValue, flags);
            Iterator itJ = C0.j(this.sections, parcel);
            while (itJ.hasNext()) {
                ((Section) itJ.next()).writeToParcel(parcel, flags);
            }
            Displaying displaying = this._displaying;
            if (displaying == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                displaying.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.placeholder);
            Integer num = this.attributeId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Boolean bool3 = this.visible;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool3);
            }
            Boolean bool4 = this.phantom;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool4);
            }
            parcel.writeString(this.displayTitle);
            parcel.writeInt(this.resetAreaOnChange ? 1 : 0);
            Widget widget = this.widget;
            if (widget == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                widget.writeToParcel(parcel, flags);
            }
            Boolean bool5 = this._hasSuggest;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool5);
            }
            List<Constraint> list = this.constraints;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }

        @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
        @l
        public String get_value() {
            return this._value;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
        public void set_value(@l String str) {
            this._value = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Sectioned(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText, @l Boolean bool, @l Boolean bool2, @l String str3, @l UserChosenValue userChosenValue, @k List<Section> list, @l Displaying displaying, @l String str4, @l Integer num, @l Boolean bool3, @l Boolean bool4, @l String str5, boolean z14, @l Widget widget, @l Boolean bool5, @l List<? extends Constraint> list2) {
            super(null);
            this.id = str;
            this.title = str2;
            this.required = z12;
            this.immutable = z13;
            this.motivation = attributedText;
            this.updatesForm = bool;
            this.updatesObjectForm = bool2;
            this._value = str3;
            this.chosenValue = userChosenValue;
            this.sections = list;
            this._displaying = displaying;
            this.placeholder = str4;
            this.attributeId = num;
            this.visible = bool3;
            this.phantom = bool4;
            this.displayTitle = str5;
            this.resetAreaOnChange = z14;
            this.widget = widget;
            this._hasSuggest = bool5;
            this.constraints = list2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelectParameter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Separator;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Separator {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Separator[] $VALUES;

        @c("top")
        public static final Separator TOP = new Separator("TOP", 0);

        @c("bottom")
        public static final Separator BOTTOM = new Separator("BOTTOM", 1);

        private static final /* synthetic */ Separator[] $values() {
            return new Separator[]{TOP, BOTTOM};
        }

        static {
            Separator[] separatorArr$values = $values();
            $VALUES = separatorArr$values;
            $ENTRIES = kotlin.enums.c.a(separatorArr$values);
        }

        private Separator(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<Separator> getEntries() {
            return $ENTRIES;
        }

        public static Separator valueOf(String str) {
            return (Separator) Enum.valueOf(Separator.class, str);
        }

        public static Separator[] values() {
            return (Separator[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelectParameter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Type;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "IMAGE_LEFT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @c("imageLeft")
        public static final Type IMAGE_LEFT = new Type("IMAGE_LEFT", 0, "imageLeft");

        @l
        private final String type;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{IMAGE_LEFT};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = kotlin.enums.c.a(typeArr$values);
        }

        private Type(String str, int i12, String str2) {
            this.type = str2;
        }

        @k
        public static kotlin.enums.a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @l
        public final String getType() {
            return this.type;
        }
    }

    /* compiled from: SelectParameter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;", "Landroid/os/Parcelable;", "()V", "ClearValue", "SuggestedValue", "ValueId", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue$ClearValue;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue$SuggestedValue;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue$ValueId;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class UserChosenValue implements Parcelable {

        /* compiled from: SelectParameter.kt */
        @d
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue$ClearValue;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ClearValue extends UserChosenValue {

            @k
            public static final ClearValue INSTANCE = new ClearValue();

            @k
            public static final Parcelable.Creator<ClearValue> CREATOR = new Creator();

            /* compiled from: SelectParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ClearValue> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ClearValue createFromParcel(@k Parcel parcel) {
                    parcel.readInt();
                    return ClearValue.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ClearValue[] newArray(int i12) {
                    return new ClearValue[i12];
                }
            }

            private ClearValue() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: SelectParameter.kt */
        @d
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue$SuggestedValue;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;", "", "id", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SuggestedValue extends UserChosenValue {

            @k
            public static final Parcelable.Creator<SuggestedValue> CREATOR = new Creator();

            @k
            private final String id;

            @k
            private final String name;

            /* compiled from: SelectParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SuggestedValue> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SuggestedValue createFromParcel(@k Parcel parcel) {
                    return new SuggestedValue(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SuggestedValue[] newArray(int i12) {
                    return new SuggestedValue[i12];
                }
            }

            public SuggestedValue(@k String str, @k String str2) {
                super(null);
                this.id = str;
                this.name = str2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final String getId() {
                return this.id;
            }

            @k
            public final String getName() {
                return this.name;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.id);
                parcel.writeString(this.name);
            }
        }

        /* compiled from: SelectParameter.kt */
        @d
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue$ValueId;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$UserChosenValue;", "", "id", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ValueId extends UserChosenValue {

            @k
            public static final Parcelable.Creator<ValueId> CREATOR = new Creator();

            @k
            private final String id;

            /* compiled from: SelectParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ValueId> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ValueId createFromParcel(@k Parcel parcel) {
                    return new ValueId(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ValueId[] newArray(int i12) {
                    return new ValueId[i12];
                }
            }

            public ValueId(@k String str) {
                super(null);
                this.id = str;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final String getId() {
                return this.id;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.id);
            }
        }

        public /* synthetic */ UserChosenValue(C42822w c42822w) {
            this();
        }

        private UserChosenValue() {
        }
    }

    /* compiled from: SelectParameter.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005?@ABCBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u001dR*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b\u000e\u00105R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b9\u00108R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u001d¨\u0006D"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "id", "title", "subtitle", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Display;", "display", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget;", "widget", "", "isDisabled", "", "toInt", "fromInt", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Display;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget;ZLjava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "setParameters", "(Ljava/util/List;)V", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Display;", "getDisplay", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Display;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget;", "getWidget", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget;", "Z", "()Z", "Ljava/lang/Integer;", "getToInt", "()Ljava/lang/Integer;", "getFromInt", "Lcom/avito/android/deep_linking/links/DeepLink;", "getLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getName", "name", "CategoryAttributes", "Display", "LinkButton", "Paragraph", "Widget", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    @com.avito.android.gson.d
    public static final class Value implements ParcelableEntity<String> {

        @k
        public static final Parcelable.Creator<Value> CREATOR = new Creator();

        @c("display")
        @l
        private final Display display;

        @c("fromInt")
        @l
        private final Integer fromInt;

        @c("id")
        @k
        private final String id;

        @c("isDisabled")
        private final boolean isDisabled;

        @c("link")
        @l
        private final DeepLink link;

        @c("params")
        @l
        private List<? extends ParameterSlot> parameters;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        @c("toInt")
        @l
        private final Integer toInt;

        @c("widget")
        @l
        private final Widget widget;

        /* compiled from: SelectParameter.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$CategoryAttributes;", "Landroid/os/Parcelable;", "", "id", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$CategoryAttributes;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CategoryAttributes implements Parcelable {

            @k
            public static final Parcelable.Creator<CategoryAttributes> CREATOR = new Creator();

            @c("ID")
            @k
            private final String id;

            @c("ValueID")
            @k
            private final String value;

            /* compiled from: SelectParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CategoryAttributes> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final CategoryAttributes createFromParcel(@k Parcel parcel) {
                    return new CategoryAttributes(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final CategoryAttributes[] newArray(int i12) {
                    return new CategoryAttributes[i12];
                }
            }

            public CategoryAttributes(@k String str, @k String str2) {
                this.id = str;
                this.value = str2;
            }

            public static /* synthetic */ CategoryAttributes copy$default(CategoryAttributes categoryAttributes, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = categoryAttributes.id;
                }
                if ((i12 & 2) != 0) {
                    str2 = categoryAttributes.value;
                }
                return categoryAttributes.copy(str, str2);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            @k
            public final CategoryAttributes copy(@k String id2, @k String value) {
                return new CategoryAttributes(id2, value);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CategoryAttributes)) {
                    return false;
                }
                CategoryAttributes categoryAttributes = (CategoryAttributes) other;
                return L.f(this.id, categoryAttributes.id) && L.f(this.value, categoryAttributes.value);
            }

            @k
            public final String getId() {
                return this.id;
            }

            @k
            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode() + (this.id.hashCode() * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("CategoryAttributes(id=");
                sb2.append(this.id);
                sb2.append(", value=");
                return C22026a.c(sb2, this.value, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.id);
                parcel.writeString(this.value);
            }
        }

        /* compiled from: SelectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Value> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = a.l(Value.class, parcel, arrayList, iL2, 1);
                    }
                }
                return new Value(string, string2, string3, arrayList, parcel.readInt() == 0 ? null : Display.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Widget.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (DeepLink) parcel.readParcelable(Value.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value[] newArray(int i12) {
                return new Value[i12];
            }
        }

        /* compiled from: SelectParameter.kt */
        @d
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Paragraph;", "Landroid/os/Parcelable;", "", "title", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Paragraph implements Parcelable {

            @k
            public static final Parcelable.Creator<Paragraph> CREATOR = new Creator();

            @c("title")
            @k
            private final String title;

            @c("value")
            @k
            private final String value;

            /* compiled from: SelectParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Paragraph> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Paragraph createFromParcel(@k Parcel parcel) {
                    return new Paragraph(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Paragraph[] newArray(int i12) {
                    return new Paragraph[i12];
                }
            }

            public Paragraph(@k String str, @k String str2) {
                this.title = str;
                this.value = str2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            @k
            public final String getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.value);
            }
        }

        public Value(String str, String str2, String str3, List list, Display display, Widget widget, boolean z12, Integer num, Integer num2, DeepLink deepLink, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? C42784z0.f406748b : list, display, (i12 & 32) != 0 ? null : widget, (i12 & 64) != 0 ? false : z12, (i12 & 128) != 0 ? null : num, (i12 & 256) != 0 ? null : num2, (i12 & 512) != 0 ? null : deepLink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return L.f(other != null ? other.getClass() : null, Value.class) && L.f(getId(), ((Value) other).getId());
        }

        @l
        public final Display getDisplay() {
            return this.display;
        }

        @l
        public final Integer getFromInt() {
            return this.fromInt;
        }

        @l
        public final DeepLink getLink() {
            return this.link;
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        /* renamed from: getName, reason: from getter */
        public String getF201827c() {
            return this.title;
        }

        @l
        public final List<ParameterSlot> getParameters() {
            return this.parameters;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final Integer getToInt() {
            return this.toInt;
        }

        @l
        public final Widget getWidget() {
            return this.widget;
        }

        public int hashCode() {
            return getId().hashCode();
        }

        /* renamed from: isDisabled, reason: from getter */
        public final boolean getIsDisabled() {
            return this.isDisabled;
        }

        public final void setParameters(@l List<? extends ParameterSlot> list) {
            this.parameters = list;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Value(id='");
            sb2.append(getId());
            sb2.append("', title='");
            return AK.c.s(sb2, this.title, "')");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            List<? extends ParameterSlot> list = this.parameters;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), flags);
                }
            }
            Display display = this.display;
            if (display == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                display.writeToParcel(parcel, flags);
            }
            Widget widget = this.widget;
            if (widget == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                widget.writeToParcel(parcel, flags);
            }
            parcel.writeInt(this.isDisabled ? 1 : 0);
            Integer num = this.toInt;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Integer num2 = this.fromInt;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num2);
            }
            parcel.writeParcelable(this.link, flags);
        }

        /* compiled from: SelectParameter.kt */
        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001:\u0001>B¡\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b(\u0010'R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b,\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b-\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b.\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00107\u001a\u0004\b=\u00109¨\u0006?"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Display;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Color;", "color", "", "title", "subtitle", "Lcom/avito/android/remote/model/Image;", "image", "sortParam", "icon", "leftIcon", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Type;", "type", "Lcom/avito/android/remote/model/UniversalImage;", "multiThemeImages", "", "Lcom/avito/android/remote/model/UniversalColor;", "gradientColors", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Display$Link;", "link", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$CategoryAttributes;", "categoryAttributes", "<init>", "(Lcom/avito/android/remote/model/Color;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Type;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Display$Link;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Color;", "getColor", "()Lcom/avito/android/remote/model/Color;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "getSortParam", "getIcon", "getLeftIcon", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Type;", "getType", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Type;", "Lcom/avito/android/remote/model/UniversalImage;", "getMultiThemeImages", "()Lcom/avito/android/remote/model/UniversalImage;", "setMultiThemeImages", "(Lcom/avito/android/remote/model/UniversalImage;)V", "Ljava/util/List;", "getGradientColors", "()Ljava/util/List;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Display$Link;", "getLink", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Display$Link;", "getCategoryAttributes", "Link", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class Display implements Parcelable {

            @k
            public static final Parcelable.Creator<Display> CREATOR = new Creator();

            @c("categoryAttributes")
            @l
            private final List<CategoryAttributes> categoryAttributes;

            @c("color")
            @l
            private final Color color;

            @c("gradientColors")
            @l
            private final List<UniversalColor> gradientColors;

            @c("icon")
            @l
            private final String icon;

            @c("images")
            @l
            private final Image image;

            @c("leftIcon")
            @l
            private final String leftIcon;

            @c("link")
            @l
            private final Link link;

            @c("multiThemeImages")
            @l
            private UniversalImage multiThemeImages;

            @c("sortParam")
            @l
            private final String sortParam;

            @c("subtitle")
            @l
            private final String subtitle;

            @c("title")
            @l
            private final String title;

            @c("type")
            @l
            private final Type type;

            /* compiled from: SelectParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Display> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Display createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    Color color = (Color) parcel.readParcelable(Display.class.getClassLoader());
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    Image image = (Image) parcel.readParcelable(Display.class.getClassLoader());
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    Type typeValueOf = parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString());
                    UniversalImage universalImage = (UniversalImage) parcel.readParcelable(Display.class.getClassLoader());
                    int iC2 = 0;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        arrayList = new ArrayList(i12);
                        int iL2 = 0;
                        while (iL2 != i12) {
                            iL2 = a.l(Display.class, parcel, arrayList, iL2, 1);
                        }
                    }
                    Link linkCreateFromParcel = parcel.readInt() == 0 ? null : Link.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        arrayList2 = null;
                    } else {
                        int i13 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(i13);
                        while (iC2 != i13) {
                            iC2 = a.c(CategoryAttributes.CREATOR, parcel, arrayList3, iC2, 1);
                            i13 = i13;
                        }
                        arrayList2 = arrayList3;
                    }
                    return new Display(color, string, string2, image, string3, string4, string5, typeValueOf, universalImage, arrayList, linkCreateFromParcel, arrayList2);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Display[] newArray(int i12) {
                    return new Display[i12];
                }
            }

            /* compiled from: SelectParameter.kt */
            @d
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Display$Link;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Link implements Parcelable {

                @k
                public static final Parcelable.Creator<Link> CREATOR = new Creator();

                @c(TooltipAttribute.PARAM_DEEP_LINK)
                @l
                private final DeepLink deepLink;

                /* compiled from: SelectParameter.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Link> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Link createFromParcel(@k Parcel parcel) {
                        return new Link((DeepLink) parcel.readParcelable(Link.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Link[] newArray(int i12) {
                        return new Link[i12];
                    }
                }

                public Link(@l DeepLink deepLink) {
                    this.deepLink = deepLink;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @l
                public final DeepLink getDeepLink() {
                    return this.deepLink;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeParcelable(this.deepLink, flags);
                }
            }

            public Display(Color color, String str, String str2, Image image, String str3, String str4, String str5, Type type, UniversalImage universalImage, List list, Link link, List list2, int i12, C42822w c42822w) {
                this(color, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : image, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : str5, (i12 & 128) != 0 ? null : type, (i12 & 256) != 0 ? null : universalImage, (i12 & 512) != 0 ? null : list, (i12 & 1024) == 0 ? link : null, (i12 & 2048) != 0 ? C42784z0.f406748b : list2);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final List<CategoryAttributes> getCategoryAttributes() {
                return this.categoryAttributes;
            }

            @l
            public final Color getColor() {
                return this.color;
            }

            @l
            public final List<UniversalColor> getGradientColors() {
                return this.gradientColors;
            }

            @l
            public final String getIcon() {
                return this.icon;
            }

            @l
            public final Image getImage() {
                return this.image;
            }

            @l
            public final String getLeftIcon() {
                return this.leftIcon;
            }

            @l
            public final Link getLink() {
                return this.link;
            }

            @l
            public final UniversalImage getMultiThemeImages() {
                return this.multiThemeImages;
            }

            @l
            public final String getSortParam() {
                return this.sortParam;
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
            public final Type getType() {
                return this.type;
            }

            public final void setMultiThemeImages(@l UniversalImage universalImage) {
                this.multiThemeImages = universalImage;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.color, flags);
                parcel.writeString(this.title);
                parcel.writeString(this.subtitle);
                parcel.writeParcelable(this.image, flags);
                parcel.writeString(this.sortParam);
                parcel.writeString(this.icon);
                parcel.writeString(this.leftIcon);
                Type type = this.type;
                if (type == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(type.name());
                }
                parcel.writeParcelable(this.multiThemeImages, flags);
                List<UniversalColor> list = this.gradientColors;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA.next(), flags);
                    }
                }
                Link link = this.link;
                if (link == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    link.writeToParcel(parcel, flags);
                }
                List<CategoryAttributes> list2 = this.categoryAttributes;
                if (list2 == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator itA2 = a.A(list2, parcel, 1);
                while (itA2.hasNext()) {
                    ((CategoryAttributes) itA2.next()).writeToParcel(parcel, flags);
                }
            }

            public Display(@l Color color, @l String str, @l String str2, @l Image image, @l String str3, @l String str4, @l String str5, @l Type type, @l UniversalImage universalImage, @l List<UniversalColor> list, @l Link link, @l List<CategoryAttributes> list2) {
                this.color = color;
                this.title = str;
                this.subtitle = str2;
                this.image = image;
                this.sortParam = str3;
                this.icon = str4;
                this.leftIcon = str5;
                this.type = type;
                this.multiThemeImages = universalImage;
                this.gradientColors = list;
                this.link = link;
                this.categoryAttributes = list2;
            }
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        public String getId() {
            return this.id;
        }

        public Value(@k String str, @k String str2, @l String str3, @l List<? extends ParameterSlot> list, @l Display display, @l Widget widget, boolean z12, @l Integer num, @l Integer num2, @l DeepLink deepLink) {
            this.id = str;
            this.title = str2;
            this.subtitle = str3;
            this.parameters = list;
            this.display = display;
            this.widget = widget;
            this.isDisabled = z12;
            this.toInt = num;
            this.fromInt = num2;
            this.link = deepLink;
        }

        /* compiled from: SelectParameter.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget$Config;", Navigation.CONFIG, "<init>", "(Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget$Config;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget$Config;", "getConfig", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget$Config;", "Config", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class Widget implements Parcelable {

            @k
            public static final Parcelable.Creator<Widget> CREATOR = new Creator();

            @c(Navigation.CONFIG)
            @l
            private final Config config;

            /* compiled from: SelectParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Widget> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Widget createFromParcel(@k Parcel parcel) {
                    return new Widget(parcel.readInt() == 0 ? null : Config.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Widget[] newArray(int i12) {
                    return new Widget[i12];
                }
            }

            public Widget(@l Config config) {
                this.config = config;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final Config getConfig() {
                return this.config;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Config config = this.config;
                if (config == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    config.writeToParcel(parcel, flags);
                }
            }

            /* compiled from: SelectParameter.kt */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0002!\"B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget$Config;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget$Config$Hint;", "hint", "", "subtitle", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget$Config$Displaying;", Navigation.DISPLAYING, "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget$Config$Hint;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget$Config$Displaying;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget$Config$Hint;", "getHint", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget$Config$Hint;", "Ljava/lang/String;", "getSubtitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget$Config$Displaying;", "getDisplaying", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget$Config$Displaying;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Displaying", "Hint", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class Config implements Parcelable {

                @k
                public static final Parcelable.Creator<Config> CREATOR = new Creator();

                @c("customUri")
                @l
                private final DeepLink deepLink;

                @c(Navigation.DISPLAYING)
                @l
                private final Displaying displaying;

                @c("hint")
                @l
                private final Hint hint;

                @c("subtitle")
                @l
                private final String subtitle;

                /* compiled from: SelectParameter.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Config> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Config createFromParcel(@k Parcel parcel) {
                        return new Config(parcel.readInt() == 0 ? null : Hint.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Displaying.CREATOR.createFromParcel(parcel) : null, (DeepLink) parcel.readParcelable(Config.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Config[] newArray(int i12) {
                        return new Config[i12];
                    }
                }

                /* compiled from: SelectParameter.kt */
                @d
                @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B©\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b+\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b,\u0010*R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b5\u0010*R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b<\u0010*R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b=\u0010/R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010-\u001a\u0004\b>\u0010/¨\u0006?"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget$Config$Displaying;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Type;", "type", "Lcom/avito/android/remote/model/Image;", "image", "", "title", "subtitle", "sortParam", "Lcom/avito/android/remote/model/UniversalImage;", "multiThemeImages", "Lcom/avito/android/remote/model/Color;", "color", "icon", "", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Paragraph;", "paragraphs", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$LinkButton;", "linkButton", "description", "selectorCardGroupBottomSheetImagesSelected", "selectorCardGroupBottomSheetImagesUnselected", "<init>", "(Lcom/avito/android/remote/model/category_parameters/SelectParameter$Type;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/Color;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$LinkButton;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Type;", "getType", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Type;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getSortParam", "Lcom/avito/android/remote/model/UniversalImage;", "getMultiThemeImages", "()Lcom/avito/android/remote/model/UniversalImage;", "setMultiThemeImages", "(Lcom/avito/android/remote/model/UniversalImage;)V", "Lcom/avito/android/remote/model/Color;", "getColor", "()Lcom/avito/android/remote/model/Color;", "getIcon", "Ljava/util/List;", "getParagraphs", "()Ljava/util/List;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$LinkButton;", "getLinkButton", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$LinkButton;", "getDescription", "getSelectorCardGroupBottomSheetImagesSelected", "getSelectorCardGroupBottomSheetImagesUnselected", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Displaying implements Parcelable {

                    @k
                    public static final Parcelable.Creator<Displaying> CREATOR = new Creator();

                    @c("color")
                    @l
                    private final Color color;

                    @c("description")
                    @l
                    private final String description;

                    @c("icon")
                    @l
                    private final String icon;

                    @c("images")
                    @l
                    private final Image image;

                    @c("linkButton")
                    @l
                    private final LinkButton linkButton;

                    @c("multiThemeImages")
                    @l
                    private UniversalImage multiThemeImages;

                    @c("paragraphs")
                    @l
                    private final List<Paragraph> paragraphs;

                    @c("selectorCardGroupBottomSheetImagesSelected")
                    @l
                    private final UniversalImage selectorCardGroupBottomSheetImagesSelected;

                    @c("selectorCardGroupBottomSheetImagesUnselected")
                    @l
                    private final UniversalImage selectorCardGroupBottomSheetImagesUnselected;

                    @c("sortParam")
                    @l
                    private final String sortParam;

                    @c("subtitle")
                    @l
                    private final String subtitle;

                    @c("title")
                    @l
                    private final String title;

                    @c("type")
                    @l
                    private final Type type;

                    /* compiled from: SelectParameter.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Displaying> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Displaying createFromParcel(@k Parcel parcel) {
                            ArrayList arrayList;
                            Type typeValueOf = parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString());
                            Image image = (Image) parcel.readParcelable(Displaying.class.getClassLoader());
                            String string = parcel.readString();
                            String string2 = parcel.readString();
                            String string3 = parcel.readString();
                            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(Displaying.class.getClassLoader());
                            Color color = (Color) parcel.readParcelable(Displaying.class.getClassLoader());
                            String string4 = parcel.readString();
                            if (parcel.readInt() == 0) {
                                arrayList = null;
                            } else {
                                int i12 = parcel.readInt();
                                arrayList = new ArrayList(i12);
                                int iC2 = 0;
                                while (iC2 != i12) {
                                    iC2 = a.c(Paragraph.CREATOR, parcel, arrayList, iC2, 1);
                                }
                            }
                            return new Displaying(typeValueOf, image, string, string2, string3, universalImage, color, string4, arrayList, parcel.readInt() != 0 ? LinkButton.CREATOR.createFromParcel(parcel) : null, parcel.readString(), (UniversalImage) parcel.readParcelable(Displaying.class.getClassLoader()), (UniversalImage) parcel.readParcelable(Displaying.class.getClassLoader()));
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Displaying[] newArray(int i12) {
                            return new Displaying[i12];
                        }
                    }

                    public Displaying() {
                        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    @l
                    public final Color getColor() {
                        return this.color;
                    }

                    @l
                    public final String getDescription() {
                        return this.description;
                    }

                    @l
                    public final String getIcon() {
                        return this.icon;
                    }

                    @l
                    public final Image getImage() {
                        return this.image;
                    }

                    @l
                    public final LinkButton getLinkButton() {
                        return this.linkButton;
                    }

                    @l
                    public final UniversalImage getMultiThemeImages() {
                        return this.multiThemeImages;
                    }

                    @l
                    public final List<Paragraph> getParagraphs() {
                        return this.paragraphs;
                    }

                    @l
                    public final UniversalImage getSelectorCardGroupBottomSheetImagesSelected() {
                        return this.selectorCardGroupBottomSheetImagesSelected;
                    }

                    @l
                    public final UniversalImage getSelectorCardGroupBottomSheetImagesUnselected() {
                        return this.selectorCardGroupBottomSheetImagesUnselected;
                    }

                    @l
                    public final String getSortParam() {
                        return this.sortParam;
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
                    public final Type getType() {
                        return this.type;
                    }

                    public final void setMultiThemeImages(@l UniversalImage universalImage) {
                        this.multiThemeImages = universalImage;
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        Type type = this.type;
                        if (type == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            parcel.writeString(type.name());
                        }
                        parcel.writeParcelable(this.image, flags);
                        parcel.writeString(this.title);
                        parcel.writeString(this.subtitle);
                        parcel.writeString(this.sortParam);
                        parcel.writeParcelable(this.multiThemeImages, flags);
                        parcel.writeParcelable(this.color, flags);
                        parcel.writeString(this.icon);
                        List<Paragraph> list = this.paragraphs;
                        if (list == null) {
                            parcel.writeInt(0);
                        } else {
                            Iterator itA = a.A(list, parcel, 1);
                            while (itA.hasNext()) {
                                ((Paragraph) itA.next()).writeToParcel(parcel, flags);
                            }
                        }
                        LinkButton linkButton = this.linkButton;
                        if (linkButton == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            linkButton.writeToParcel(parcel, flags);
                        }
                        parcel.writeString(this.description);
                        parcel.writeParcelable(this.selectorCardGroupBottomSheetImagesSelected, flags);
                        parcel.writeParcelable(this.selectorCardGroupBottomSheetImagesUnselected, flags);
                    }

                    public Displaying(@l Type type, @l Image image, @l String str, @l String str2, @l String str3, @l UniversalImage universalImage, @l Color color, @l String str4, @l List<Paragraph> list, @l LinkButton linkButton, @l String str5, @l UniversalImage universalImage2, @l UniversalImage universalImage3) {
                        this.type = type;
                        this.image = image;
                        this.title = str;
                        this.subtitle = str2;
                        this.sortParam = str3;
                        this.multiThemeImages = universalImage;
                        this.color = color;
                        this.icon = str4;
                        this.paragraphs = list;
                        this.linkButton = linkButton;
                        this.description = str5;
                        this.selectorCardGroupBottomSheetImagesSelected = universalImage2;
                        this.selectorCardGroupBottomSheetImagesUnselected = universalImage3;
                    }

                    public /* synthetic */ Displaying(Type type, Image image, String str, String str2, String str3, UniversalImage universalImage, Color color, String str4, List list, LinkButton linkButton, String str5, UniversalImage universalImage2, UniversalImage universalImage3, int i12, C42822w c42822w) {
                        this((i12 & 1) != 0 ? null : type, (i12 & 2) != 0 ? null : image, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : universalImage, (i12 & 64) != 0 ? null : color, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? null : list, (i12 & 512) != 0 ? null : linkButton, (i12 & 1024) != 0 ? null : str5, (i12 & 2048) != 0 ? null : universalImage2, (i12 & 4096) == 0 ? universalImage3 : null);
                    }
                }

                /* compiled from: SelectParameter.kt */
                @d
                @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$Widget$Config$Hint;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Hint implements Parcelable {

                    @k
                    public static final Parcelable.Creator<Hint> CREATOR = new Creator();

                    @c(Constants.DEEPLINK)
                    @k
                    private final DeepLink deepLink;

                    /* compiled from: SelectParameter.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Hint> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Hint createFromParcel(@k Parcel parcel) {
                            return new Hint((DeepLink) parcel.readParcelable(Hint.class.getClassLoader()));
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Hint[] newArray(int i12) {
                            return new Hint[i12];
                        }
                    }

                    public Hint(@k DeepLink deepLink) {
                        this.deepLink = deepLink;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    @k
                    public final DeepLink getDeepLink() {
                        return this.deepLink;
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        parcel.writeParcelable(this.deepLink, flags);
                    }
                }

                public Config(@l Hint hint, @l String str, @l Displaying displaying, @l DeepLink deepLink) {
                    this.hint = hint;
                    this.subtitle = str;
                    this.displaying = displaying;
                    this.deepLink = deepLink;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @l
                public final DeepLink getDeepLink() {
                    return this.deepLink;
                }

                @l
                public final Displaying getDisplaying() {
                    return this.displaying;
                }

                @l
                public final Hint getHint() {
                    return this.hint;
                }

                @l
                public final String getSubtitle() {
                    return this.subtitle;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    Hint hint = this.hint;
                    if (hint == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        hint.writeToParcel(parcel, flags);
                    }
                    parcel.writeString(this.subtitle);
                    Displaying displaying = this.displaying;
                    if (displaying == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        displaying.writeToParcel(parcel, flags);
                    }
                    parcel.writeParcelable(this.deepLink, flags);
                }

                public /* synthetic */ Config(Hint hint, String str, Displaying displaying, DeepLink deepLink, int i12, C42822w c42822w) {
                    this(hint, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : displaying, (i12 & 8) != 0 ? null : deepLink);
                }
            }
        }

        /* compiled from: SelectParameter.kt */
        @d
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value$LinkButton;", "Landroid/os/Parcelable;", "", "title", "iconType", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getIconType", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getUrl", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LinkButton implements Parcelable {

            @k
            public static final Parcelable.Creator<LinkButton> CREATOR = new Creator();

            @c("iconType")
            @l
            private final String iconType;

            @c("title")
            @k
            private final String title;

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            @l
            private final DeepLink uri;

            @c(ContextActionHandler.Link.URL)
            @l
            private final String url;

            /* compiled from: SelectParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LinkButton> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final LinkButton createFromParcel(@k Parcel parcel) {
                    return new LinkButton(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(LinkButton.class.getClassLoader()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final LinkButton[] newArray(int i12) {
                    return new LinkButton[i12];
                }
            }

            public LinkButton(@k String str, @l String str2, @l DeepLink deepLink, @l String str3) {
                this.title = str;
                this.iconType = str2;
                this.uri = deepLink;
                this.url = str3;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final String getIconType() {
                return this.iconType;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            @l
            public final DeepLink getUri() {
                return this.uri;
            }

            @l
            public final String getUrl() {
                return this.url;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.iconType);
                parcel.writeParcelable(this.uri, flags);
                parcel.writeString(this.url);
            }

            public /* synthetic */ LinkButton(String str, String str2, DeepLink deepLink, String str3, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : deepLink, (i12 & 8) != 0 ? null : str3);
            }
        }
    }

    /* compiled from: SelectParameter.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget$Config;", Navigation.CONFIG, "<init>", "(Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget$Config;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget$Config;", "copy", "(Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget$Config;)Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget$Config;", "getConfig", "Config", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Widget implements Parcelable {

        @k
        public static final Parcelable.Creator<Widget> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @l
        private final Config config;

        /* compiled from: SelectParameter.kt */
        @d
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJj\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0015J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b)\u0010$J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b.\u0010/R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b8\u0010\u0015R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010\u001e¨\u0006="}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget$Config;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", "onValidationFailedDeeplink", "", "emptyValueId", "Lcom/avito/android/remote/model/category_parameters/TooltipOptions;", "tooltipOptions", "", "readOnly", "errorText", "", "", "suggests", "Lcom/avito/android/remote/model/category_parameters/SwitcherAction;", "switcherAction", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/TooltipOptions;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/SwitcherAction;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/category_parameters/TooltipOptions;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "()Ljava/util/List;", "component7", "()Lcom/avito/android/remote/model/category_parameters/SwitcherAction;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/TooltipOptions;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/SwitcherAction;)Lcom/avito/android/remote/model/category_parameters/SelectParameter$Widget$Config;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnValidationFailedDeeplink", "Ljava/lang/String;", "getEmptyValueId", "Lcom/avito/android/remote/model/category_parameters/TooltipOptions;", "getTooltipOptions", "Ljava/lang/Boolean;", "getReadOnly", "getErrorText", "Ljava/util/List;", "getSuggests", "Lcom/avito/android/remote/model/category_parameters/SwitcherAction;", "getSwitcherAction", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Config implements Parcelable {

            @k
            public static final Parcelable.Creator<Config> CREATOR = new Creator();

            @c("emptyValue")
            @l
            private final String emptyValueId;

            @c("errorText")
            @l
            private final String errorText;

            @c("onValidationFailedDeeplink")
            @l
            private final DeepLink onValidationFailedDeeplink;

            @c("readOnly")
            @l
            private final Boolean readOnly;

            @c("suggests")
            @l
            private final List<Long> suggests;

            @c("switcherAction")
            @l
            private final SwitcherAction switcherAction;

            @c(TooltipAttribute.ATTRIBUTE_TYPE)
            @l
            private final TooltipOptions tooltipOptions;

            /* compiled from: SelectParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    DeepLink deepLink = (DeepLink) parcel.readParcelable(Config.class.getClassLoader());
                    String string = parcel.readString();
                    TooltipOptions tooltipOptionsCreateFromParcel = parcel.readInt() == 0 ? null : TooltipOptions.CREATOR.createFromParcel(parcel);
                    Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                    String string2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i12);
                        for (int i13 = 0; i13 != i12; i13++) {
                            arrayList2.add(Long.valueOf(parcel.readLong()));
                        }
                        arrayList = arrayList2;
                    }
                    return new Config(deepLink, string, tooltipOptionsCreateFromParcel, boolValueOf, string2, arrayList, parcel.readInt() != 0 ? SwitcherAction.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config[] newArray(int i12) {
                    return new Config[i12];
                }
            }

            public Config() {
                this(null, null, null, null, null, null, null, 127, null);
            }

            public static /* synthetic */ Config copy$default(Config config, DeepLink deepLink, String str, TooltipOptions tooltipOptions, Boolean bool, String str2, List list, SwitcherAction switcherAction, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    deepLink = config.onValidationFailedDeeplink;
                }
                if ((i12 & 2) != 0) {
                    str = config.emptyValueId;
                }
                String str3 = str;
                if ((i12 & 4) != 0) {
                    tooltipOptions = config.tooltipOptions;
                }
                TooltipOptions tooltipOptions2 = tooltipOptions;
                if ((i12 & 8) != 0) {
                    bool = config.readOnly;
                }
                Boolean bool2 = bool;
                if ((i12 & 16) != 0) {
                    str2 = config.errorText;
                }
                String str4 = str2;
                if ((i12 & 32) != 0) {
                    list = config.suggests;
                }
                List list2 = list;
                if ((i12 & 64) != 0) {
                    switcherAction = config.switcherAction;
                }
                return config.copy(deepLink, str3, tooltipOptions2, bool2, str4, list2, switcherAction);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final DeepLink getOnValidationFailedDeeplink() {
                return this.onValidationFailedDeeplink;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getEmptyValueId() {
                return this.emptyValueId;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final TooltipOptions getTooltipOptions() {
                return this.tooltipOptions;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final Boolean getReadOnly() {
                return this.readOnly;
            }

            @l
            /* renamed from: component5, reason: from getter */
            public final String getErrorText() {
                return this.errorText;
            }

            @l
            public final List<Long> component6() {
                return this.suggests;
            }

            @l
            /* renamed from: component7, reason: from getter */
            public final SwitcherAction getSwitcherAction() {
                return this.switcherAction;
            }

            @k
            public final Config copy(@l DeepLink onValidationFailedDeeplink, @l String emptyValueId, @l TooltipOptions tooltipOptions, @l Boolean readOnly, @l String errorText, @l List<Long> suggests, @l SwitcherAction switcherAction) {
                return new Config(onValidationFailedDeeplink, emptyValueId, tooltipOptions, readOnly, errorText, suggests, switcherAction);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Config)) {
                    return false;
                }
                Config config = (Config) other;
                return L.f(this.onValidationFailedDeeplink, config.onValidationFailedDeeplink) && L.f(this.emptyValueId, config.emptyValueId) && L.f(this.tooltipOptions, config.tooltipOptions) && L.f(this.readOnly, config.readOnly) && L.f(this.errorText, config.errorText) && L.f(this.suggests, config.suggests) && L.f(this.switcherAction, config.switcherAction);
            }

            @l
            public final String getEmptyValueId() {
                return this.emptyValueId;
            }

            @l
            public final String getErrorText() {
                return this.errorText;
            }

            @l
            public final DeepLink getOnValidationFailedDeeplink() {
                return this.onValidationFailedDeeplink;
            }

            @l
            public final Boolean getReadOnly() {
                return this.readOnly;
            }

            @l
            public final List<Long> getSuggests() {
                return this.suggests;
            }

            @l
            public final SwitcherAction getSwitcherAction() {
                return this.switcherAction;
            }

            @l
            public final TooltipOptions getTooltipOptions() {
                return this.tooltipOptions;
            }

            public int hashCode() {
                DeepLink deepLink = this.onValidationFailedDeeplink;
                int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
                String str = this.emptyValueId;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                TooltipOptions tooltipOptions = this.tooltipOptions;
                int iHashCode3 = (iHashCode2 + (tooltipOptions == null ? 0 : tooltipOptions.hashCode())) * 31;
                Boolean bool = this.readOnly;
                int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str2 = this.errorText;
                int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
                List<Long> list = this.suggests;
                int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
                SwitcherAction switcherAction = this.switcherAction;
                return iHashCode6 + (switcherAction != null ? switcherAction.hashCode() : 0);
            }

            @k
            public String toString() {
                return "Config(onValidationFailedDeeplink=" + this.onValidationFailedDeeplink + ", emptyValueId=" + this.emptyValueId + ", tooltipOptions=" + this.tooltipOptions + ", readOnly=" + this.readOnly + ", errorText=" + this.errorText + ", suggests=" + this.suggests + ", switcherAction=" + this.switcherAction + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.onValidationFailedDeeplink, flags);
                parcel.writeString(this.emptyValueId);
                TooltipOptions tooltipOptions = this.tooltipOptions;
                if (tooltipOptions == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    tooltipOptions.writeToParcel(parcel, flags);
                }
                Boolean bool = this.readOnly;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
                parcel.writeString(this.errorText);
                List<Long> list = this.suggests;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        parcel.writeLong(((Number) itA.next()).longValue());
                    }
                }
                SwitcherAction switcherAction = this.switcherAction;
                if (switcherAction == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    switcherAction.writeToParcel(parcel, flags);
                }
            }

            public Config(@l DeepLink deepLink, @l String str, @l TooltipOptions tooltipOptions, @l Boolean bool, @l String str2, @l List<Long> list, @l SwitcherAction switcherAction) {
                this.onValidationFailedDeeplink = deepLink;
                this.emptyValueId = str;
                this.tooltipOptions = tooltipOptions;
                this.readOnly = bool;
                this.errorText = str2;
                this.suggests = list;
                this.switcherAction = switcherAction;
            }

            public /* synthetic */ Config(DeepLink deepLink, String str, TooltipOptions tooltipOptions, Boolean bool, String str2, List list, SwitcherAction switcherAction, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : deepLink, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : tooltipOptions, (i12 & 8) != 0 ? null : bool, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : list, (i12 & 64) != 0 ? null : switcherAction);
            }
        }

        /* compiled from: SelectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Widget> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Widget createFromParcel(@k Parcel parcel) {
                return new Widget(parcel.readInt() == 0 ? null : Config.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Widget[] newArray(int i12) {
                return new Widget[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Widget() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Widget copy$default(Widget widget, Config config, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                config = widget.config;
            }
            return widget.copy(config);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Config getConfig() {
            return this.config;
        }

        @k
        public final Widget copy(@l Config config) {
            return new Widget(config);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Widget) && L.f(this.config, ((Widget) other).config);
        }

        @l
        public final Config getConfig() {
            return this.config;
        }

        public int hashCode() {
            Config config = this.config;
            if (config == null) {
                return 0;
            }
            return config.hashCode();
        }

        @k
        public String toString() {
            return "Widget(config=" + this.config + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Config config = this.config;
            if (config == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                config.writeToParcel(parcel, flags);
            }
        }

        public Widget(@l Config config) {
            this.config = config;
        }

        public /* synthetic */ Widget(Config config, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : config);
        }
    }

    public /* synthetic */ SelectParameter(C42822w c42822w) {
        this();
    }

    public final void applyChosenValue() {
        String id2;
        UserChosenValue chosenValue = getChosenValue();
        if (chosenValue != null) {
            if (chosenValue instanceof UserChosenValue.ValueId) {
                id2 = ((UserChosenValue.ValueId) chosenValue).getId();
            } else if (chosenValue instanceof UserChosenValue.SuggestedValue) {
                id2 = ((UserChosenValue.SuggestedValue) chosenValue).getId();
            } else {
                if (!(chosenValue instanceof UserChosenValue.ClearValue)) {
                    throw new NoWhenBranchMatchedException();
                }
                id2 = null;
            }
            setValue(id2);
            setDisplayTitle(chosenValue instanceof UserChosenValue.SuggestedValue ? ((UserChosenValue.SuggestedValue) chosenValue).getName() : null);
            setChosenValue(null);
        }
    }

    @l
    public abstract Value getChosenOrCurrentSelectedValue();

    @l
    public abstract UserChosenValue getChosenValue();

    @l
    public abstract String getDisplayTitle();

    @l
    public abstract Displaying getDisplaying();

    public abstract boolean getHasSuggest();

    @k
    public abstract List<ParcelableEntity<String>> getListToShow();

    @Override // com.avito.android.remote.model.category_parameters.base.WithOnValidationFailedDeeplink
    @l
    public DeepLink getOnValidationFailedDeeplink() {
        Widget.Config config;
        Widget widget = getWidget();
        if (widget == null || (config = widget.getConfig()) == null) {
            return null;
        }
        return config.getOnValidationFailedDeeplink();
    }

    @Override // com.avito.android.remote.model.category_parameters.base.WithDependency
    @l
    public List<String> getParamsMustBeFilled() {
        Displaying displaying = getDisplaying();
        if (displaying != null) {
            return displaying.getParamsMustBeFilled();
        }
        return null;
    }

    public abstract boolean getResetAreaOnChange();

    @l
    public abstract Value getSelectedValue();

    @Override // com.avito.android.remote.model.category_parameters.base.CanHaveTypeCorrection
    @l
    public Boolean getTypoCorrectionEnabled() {
        Displaying displaying = getDisplaying();
        if (displaying != null) {
            return displaying.getTypoCorrectionEnabled();
        }
        return null;
    }

    @l
    public abstract Boolean getUpdatesObjectForm();

    @k
    public abstract Set<Value> getValuesSet();

    @l
    public abstract Widget getWidget();

    public abstract void setChosenValue(@l UserChosenValue userChosenValue);

    public abstract void setDisplayTitle(@l String str);

    private SelectParameter() {
    }

    /* compiled from: SelectParameter.kt */
    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b?\b\u0087\b\u0018\u00002\u00020\u0001:\u0002Á\u0001B÷\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010.\u001a\u00020\u0004\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010!\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bC\u0010@J\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010>J\u0012\u0010E\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u0010>J\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u0010>J\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u0010>J\u0012\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bN\u0010@J\u0012\u0010O\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u0010>J\u0012\u0010R\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bT\u0010SJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bY\u0010>J\u0012\u0010Z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bZ\u0010>J\u0012\u0010[\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b[\u0010>J\u0012\u0010\\\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\\\u0010@J\u0018\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0012\u0010_\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b_\u0010>J\u0012\u0010`\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0012\u0010b\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0012\u0010d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bd\u0010>J\u0012\u0010e\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0012\u0010g\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bg\u0010@J\u0012\u0010h\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bh\u0010@J\u0012\u0010i\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bi\u0010>J\u0010\u0010j\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bj\u0010BJ\u0012\u0010k\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bk\u0010>J\u0012\u0010l\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bl\u0010>J\u0012\u0010m\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bm\u0010@J\u0012\u0010n\u001a\u0004\u0018\u000102HÆ\u0003¢\u0006\u0004\bn\u0010oJ\u0018\u0010p\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010!HÆ\u0003¢\u0006\u0004\bp\u0010^J\u0012\u0010q\u001a\u0004\u0018\u000106HÆ\u0003¢\u0006\u0004\bq\u0010rJ\u0012\u0010s\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bs\u0010>J\u0012\u0010t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bt\u0010>J\u0012\u0010u\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bu\u0010>J\u0082\u0004\u0010v\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010.\u001a\u00020\u00042\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010!2\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bv\u0010wJ\u0010\u0010x\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bx\u0010>J\u0010\u0010y\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\by\u0010zJ\u001a\u0010}\u001a\u00020\u00042\b\u0010|\u001a\u0004\u0018\u00010{HÖ\u0003¢\u0006\u0004\b}\u0010~J\u0010\u0010\u007f\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u007f\u0010zJ'\u0010\u0084\u0001\u001a\u00030\u0083\u00012\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u0016HÖ\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0003\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010>R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0005\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010@R\u001c\u0010\u0006\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0006\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010@R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010\u0088\u0001\u001a\u0005\b\u008c\u0001\u0010@R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\b\u0010\u0086\u0001\u001a\u0005\b\u008d\u0001\u0010>R\u001e\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\n\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010FR\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\f\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010HR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010JR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010\u0086\u0001\u001a\u0005\b\u0094\u0001\u0010>R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0010\u0010\u0086\u0001\u001a\u0005\b\u0095\u0001\u0010>R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010\u0086\u0001\u001a\u0005\b\u0096\u0001\u0010>R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010\u0088\u0001\u001a\u0005\b\u0097\u0001\u0010@R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010\u0098\u0001\u001a\u0005\b\u0099\u0001\u0010PR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0015\u0010\u0086\u0001\u001a\u0005\b\u009a\u0001\u0010>R&\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0017\u0010\u009b\u0001\u0012\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0005\b\u009c\u0001\u0010SR&\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0018\u0010\u009b\u0001\u0012\u0006\b \u0001\u0010\u009e\u0001\u001a\u0005\b\u009f\u0001\u0010SR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010VR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001c\u0010£\u0001\u001a\u0005\b¤\u0001\u0010XR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010\u0086\u0001\u001a\u0005\b¥\u0001\u0010>R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010\u0086\u0001\u001a\u0005\b¦\u0001\u0010>R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010\u0086\u0001\u001a\u0005\b§\u0001\u0010>R\u001e\u0010 \u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b \u0010\u0088\u0001\u001a\u0005\b¨\u0001\u0010@R$\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\"\u0010©\u0001\u001a\u0005\bª\u0001\u0010^R\u001e\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b#\u0010\u0086\u0001\u001a\u0005\b«\u0001\u0010>R\u001e\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b%\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u0010aR\u001e\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b'\u0010®\u0001\u001a\u0005\b¯\u0001\u0010cR\u001e\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010\u0086\u0001\u001a\u0005\b°\u0001\u0010>R\u001e\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010±\u0001\u001a\u0005\b²\u0001\u0010fR\u001e\u0010+\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b+\u0010\u0088\u0001\u001a\u0005\b³\u0001\u0010@R\u001e\u0010,\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010\u0088\u0001\u001a\u0005\b´\u0001\u0010@R\u001e\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b-\u0010\u0086\u0001\u001a\u0005\bµ\u0001\u0010>R\u001b\u0010.\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\r\n\u0005\b.\u0010\u008a\u0001\u001a\u0004\b.\u0010BR\u001e\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b/\u0010\u0086\u0001\u001a\u0005\b¶\u0001\u0010>R\u001e\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b0\u0010\u0086\u0001\u001a\u0005\b·\u0001\u0010>R\u001e\u00101\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b1\u0010\u0088\u0001\u001a\u0005\b¸\u0001\u0010@R\u001e\u00103\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b3\u0010¹\u0001\u001a\u0005\bº\u0001\u0010oR$\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b5\u0010©\u0001\u001a\u0005\b»\u0001\u0010^R\u001e\u00107\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b7\u0010¼\u0001\u001a\u0005\b½\u0001\u0010rR\u001e\u00108\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b8\u0010\u0086\u0001\u001a\u0005\b¾\u0001\u0010>R\u001e\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b9\u0010\u0086\u0001\u001a\u0005\b¿\u0001\u0010>R\u001e\u0010:\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b:\u0010\u0086\u0001\u001a\u0005\bÀ\u0001\u0010>¨\u0006Â\u0001"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;", "Lcom/avito/android/remote/model/category_parameters/SelectDisplayingOptions;", "", "type", "", "typoCorrectionEnabled", "hideTitle", "withImages", "titlePattern", "Lcom/avito/android/remote/model/category_parameters/SortDirection;", "sortDirection", "Lcom/avito/android/remote/model/category_parameters/TipIconParameters;", "tipIconParameters", "Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "imageParams", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, ChannelContext.Item.PLACEHOLDER, "containerTitle", "hideShowMore", "Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;", "dialogDisplaying", "valueIdForEmptySearch", "", "topPadding", "bottomPadding", "Lcom/avito/android/remote/model/category_parameters/CustomPaddings;", "customPaddings", "Lcom/avito/android/remote/model/category_parameters/OptionImageSize;", "optionImageSize", "titleStyle", "checkboxTitle", "scrollToValue", "toFillIn", "", "paramsMustBeFilled", "buttonLabel", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/UniversalImage;", "multiThemeImages", "title", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$EarlyAccess;", "earlyAccess", "keepSelected", "showsAddressValue", "itemsStyle", "isComposeView", "alertBannerText", "autotekaCarOwnersId", "shouldShowAlertBannerOnValueSelected", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying$LabelPosition;", "labelPosition", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Separator;", "separators", "Lcom/avito/android/remote/model/category_parameters/ListItemAlignment;", "switcherAlignment", "bottomSheetTitle", "bottomSheetClearButtonTitle", "bottomSheetSelectButtonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SortDirection;Lcom/avito/android/remote/model/category_parameters/TipIconParameters;Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/category_parameters/CustomPaddings;Lcom/avito/android/remote/model/category_parameters/OptionImageSize;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SelectParameter$EarlyAccess;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying$LabelPosition;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/ListItemAlignment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/category_parameters/SortDirection;", "component7", "()Lcom/avito/android/remote/model/category_parameters/TipIconParameters;", "component8", "()Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "component9", "component10", "component11", "component12", "component13", "()Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;", "component14", "component15", "()Ljava/lang/Integer;", "component16", "component17", "()Lcom/avito/android/remote/model/category_parameters/CustomPaddings;", "component18", "()Lcom/avito/android/remote/model/category_parameters/OptionImageSize;", "component19", "component20", "component21", "component22", "component23", "()Ljava/util/List;", "component24", "component25", "()Lcom/avito/android/remote/model/text/AttributedText;", "component26", "()Lcom/avito/android/remote/model/UniversalImage;", "component27", "component28", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$EarlyAccess;", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying$LabelPosition;", "component37", "component38", "()Lcom/avito/android/remote/model/category_parameters/ListItemAlignment;", "component39", "component40", "component41", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SortDirection;Lcom/avito/android/remote/model/category_parameters/TipIconParameters;Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/category_parameters/CustomPaddings;Lcom/avito/android/remote/model/category_parameters/OptionImageSize;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SelectParameter$EarlyAccess;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying$LabelPosition;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/ListItemAlignment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "Ljava/lang/Boolean;", "getTypoCorrectionEnabled", "Z", "getHideTitle", "getWithImages", "getTitlePattern", "Lcom/avito/android/remote/model/category_parameters/SortDirection;", "getSortDirection", "Lcom/avito/android/remote/model/category_parameters/TipIconParameters;", "getTipIconParameters", "Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "getImageParams", "getStyle", "getPlaceholder", "getContainerTitle", "getHideShowMore", "Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;", "getDialogDisplaying", "getValueIdForEmptySearch", "Ljava/lang/Integer;", "getTopPadding", "getTopPadding$annotations", "()V", "getBottomPadding", "getBottomPadding$annotations", "Lcom/avito/android/remote/model/category_parameters/CustomPaddings;", "getCustomPaddings", "Lcom/avito/android/remote/model/category_parameters/OptionImageSize;", "getOptionImageSize", "getTitleStyle", "getCheckboxTitle", "getScrollToValue", "getToFillIn", "Ljava/util/List;", "getParamsMustBeFilled", "getButtonLabel", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/remote/model/UniversalImage;", "getMultiThemeImages", "getTitle", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$EarlyAccess;", "getEarlyAccess", "getKeepSelected", "getShowsAddressValue", "getItemsStyle", "getAlertBannerText", "getAutotekaCarOwnersId", "getShouldShowAlertBannerOnValueSelected", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying$LabelPosition;", "getLabelPosition", "getSeparators", "Lcom/avito/android/remote/model/category_parameters/ListItemAlignment;", "getSwitcherAlignment", "getBottomSheetTitle", "getBottomSheetClearButtonTitle", "getBottomSheetSelectButtonTitle", "LabelPosition", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Displaying implements SelectDisplayingOptions {

        @k
        public static final Parcelable.Creator<Displaying> CREATOR = new Creator();

        @c("alertBannerText")
        @l
        private final String alertBannerText;

        @c("autotekaCarOwnersId")
        @l
        private final String autotekaCarOwnersId;

        @c("bottomPadding")
        @l
        private final Integer bottomPadding;

        @c("bottomSheetClearButtonTitle")
        @l
        private final String bottomSheetClearButtonTitle;

        @c("bottomSheetSelectButtonTitle")
        @l
        private final String bottomSheetSelectButtonTitle;

        @c("bottomSheetTitle")
        @l
        private final String bottomSheetTitle;

        @c("buttonLabel")
        @l
        private final String buttonLabel;

        @c("checkboxTitle")
        @l
        private final String checkboxTitle;

        @c("containerTitle")
        @l
        private final String containerTitle;

        @c("customPaddings")
        @l
        private final CustomPaddings customPaddings;

        @c("description")
        @l
        private final AttributedText description;

        @c("dialog")
        @l
        private final DialogDisplaying dialogDisplaying;

        @c("earlyAccess")
        @l
        private final EarlyAccess earlyAccess;

        @c("hideShowMore")
        @l
        private final Boolean hideShowMore;

        @c("hideTitle")
        private final boolean hideTitle;

        @c("imageParams")
        @l
        private final DisplayingImageParams imageParams;

        @c("isComposeView")
        private final boolean isComposeView;

        @c("itemsStyle")
        @l
        private final String itemsStyle;

        @c("keepSelected")
        @l
        private final Boolean keepSelected;

        @c("labelPosition")
        @l
        private final LabelPosition labelPosition;

        @c("multiThemeImages")
        @l
        private final UniversalImage multiThemeImages;

        @c("optionImageSize")
        @l
        private final OptionImageSize optionImageSize;

        @c("paramsMustBeFilled")
        @l
        private final List<String> paramsMustBeFilled;

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("scrollToValue")
        @l
        private final String scrollToValue;

        @c("separators")
        @l
        private final List<Separator> separators;

        @c("shouldShowAlertBannerOnValueSelected")
        @l
        private final Boolean shouldShowAlertBannerOnValueSelected;

        @c("showsAddressValue")
        @l
        private final Boolean showsAddressValue;

        @c("sortDirection")
        @l
        private final SortDirection sortDirection;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("switcherAlignment")
        @l
        private final ListItemAlignment switcherAlignment;

        @c("tipIconParameters")
        @l
        private final TipIconParameters tipIconParameters;

        @c("title")
        @l
        private final String title;

        @c("titlePattern")
        @l
        private final String titlePattern;

        @c("titleStyle")
        @l
        private final String titleStyle;

        @c("toFillIn")
        @l
        private final Boolean toFillIn;

        @c("topPadding")
        @l
        private final Integer topPadding;

        @c("type")
        @k
        private final String type;

        @c("typoCorrectionEnabled")
        @l
        private final Boolean typoCorrectionEnabled;

        @c("optionIdForEmptySearch")
        @l
        private final String valueIdForEmptySearch;

        @c("withImages")
        @l
        private final Boolean withImages;

        /* compiled from: SelectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Displaying> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Displaying createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                boolean z12 = parcel.readInt() != 0;
                Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                String string2 = parcel.readString();
                SortDirection sortDirectionValueOf = parcel.readInt() == 0 ? null : SortDirection.valueOf(parcel.readString());
                TipIconParameters tipIconParametersCreateFromParcel = parcel.readInt() == 0 ? null : TipIconParameters.CREATOR.createFromParcel(parcel);
                DisplayingImageParams displayingImageParamsCreateFromParcel = parcel.readInt() == 0 ? null : DisplayingImageParams.CREATOR.createFromParcel(parcel);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                DialogDisplaying dialogDisplayingCreateFromParcel = parcel.readInt() == 0 ? null : DialogDisplaying.CREATOR.createFromParcel(parcel);
                String string6 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                CustomPaddings customPaddingsCreateFromParcel = parcel.readInt() == 0 ? null : CustomPaddings.CREATOR.createFromParcel(parcel);
                OptionImageSize optionImageSizeCreateFromParcel = parcel.readInt() == 0 ? null : OptionImageSize.CREATOR.createFromParcel(parcel);
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                Boolean boolValueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string10 = parcel.readString();
                AttributedText attributedText = (AttributedText) parcel.readParcelable(Displaying.class.getClassLoader());
                UniversalImage universalImage = (UniversalImage) parcel.readParcelable(Displaying.class.getClassLoader());
                String string11 = parcel.readString();
                EarlyAccess earlyAccessCreateFromParcel = parcel.readInt() == 0 ? null : EarlyAccess.CREATOR.createFromParcel(parcel);
                Boolean boolValueOf5 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean boolValueOf6 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                String string12 = parcel.readString();
                boolean z13 = parcel.readInt() != 0;
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                Boolean boolValueOf7 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                LabelPosition labelPositionValueOf = parcel.readInt() == 0 ? null : LabelPosition.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    for (int i13 = 0; i13 != i12; i13++) {
                        arrayList2.add(Separator.valueOf(parcel.readString()));
                    }
                    arrayList = arrayList2;
                }
                return new Displaying(string, boolValueOf, z12, boolValueOf2, string2, sortDirectionValueOf, tipIconParametersCreateFromParcel, displayingImageParamsCreateFromParcel, string3, string4, string5, boolValueOf3, dialogDisplayingCreateFromParcel, string6, numValueOf, numValueOf2, customPaddingsCreateFromParcel, optionImageSizeCreateFromParcel, string7, string8, string9, boolValueOf4, arrayListCreateStringArrayList, string10, attributedText, universalImage, string11, earlyAccessCreateFromParcel, boolValueOf5, boolValueOf6, string12, z13, string13, string14, boolValueOf7, labelPositionValueOf, arrayList, parcel.readInt() == 0 ? null : ListItemAlignment.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Displaying[] newArray(int i12) {
                return new Displaying[i12];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SelectParameter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying$LabelPosition;", "", "(Ljava/lang/String;I)V", "Start", "End", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LabelPosition {
            private static final /* synthetic */ kotlin.enums.a $ENTRIES;
            private static final /* synthetic */ LabelPosition[] $VALUES;

            @c("start")
            public static final LabelPosition Start = new LabelPosition("Start", 0);

            @c("end")
            public static final LabelPosition End = new LabelPosition("End", 1);

            private static final /* synthetic */ LabelPosition[] $values() {
                return new LabelPosition[]{Start, End};
            }

            static {
                LabelPosition[] labelPositionArr$values = $values();
                $VALUES = labelPositionArr$values;
                $ENTRIES = kotlin.enums.c.a(labelPositionArr$values);
            }

            private LabelPosition(String str, int i12) {
            }

            @k
            public static kotlin.enums.a<LabelPosition> getEntries() {
                return $ENTRIES;
            }

            public static LabelPosition valueOf(String str) {
                return (LabelPosition) Enum.valueOf(LabelPosition.class, str);
            }

            public static LabelPosition[] values() {
                return (LabelPosition[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Displaying(@k String str, @l Boolean bool, boolean z12, @l Boolean bool2, @l String str2, @l SortDirection sortDirection, @l TipIconParameters tipIconParameters, @l DisplayingImageParams displayingImageParams, @l String str3, @l String str4, @l String str5, @l Boolean bool3, @l DialogDisplaying dialogDisplaying, @l String str6, @l Integer num, @l Integer num2, @l CustomPaddings customPaddings, @l OptionImageSize optionImageSize, @l String str7, @l String str8, @l String str9, @l Boolean bool4, @l List<String> list, @l String str10, @l AttributedText attributedText, @l UniversalImage universalImage, @l String str11, @l EarlyAccess earlyAccess, @l Boolean bool5, @l Boolean bool6, @l String str12, boolean z13, @l String str13, @l String str14, @l Boolean bool7, @l LabelPosition labelPosition, @l List<? extends Separator> list2, @l ListItemAlignment listItemAlignment, @l String str15, @l String str16, @l String str17) {
            this.type = str;
            this.typoCorrectionEnabled = bool;
            this.hideTitle = z12;
            this.withImages = bool2;
            this.titlePattern = str2;
            this.sortDirection = sortDirection;
            this.tipIconParameters = tipIconParameters;
            this.imageParams = displayingImageParams;
            this.style = str3;
            this.placeholder = str4;
            this.containerTitle = str5;
            this.hideShowMore = bool3;
            this.dialogDisplaying = dialogDisplaying;
            this.valueIdForEmptySearch = str6;
            this.topPadding = num;
            this.bottomPadding = num2;
            this.customPaddings = customPaddings;
            this.optionImageSize = optionImageSize;
            this.titleStyle = str7;
            this.checkboxTitle = str8;
            this.scrollToValue = str9;
            this.toFillIn = bool4;
            this.paramsMustBeFilled = list;
            this.buttonLabel = str10;
            this.description = attributedText;
            this.multiThemeImages = universalImage;
            this.title = str11;
            this.earlyAccess = earlyAccess;
            this.keepSelected = bool5;
            this.showsAddressValue = bool6;
            this.itemsStyle = str12;
            this.isComposeView = z13;
            this.alertBannerText = str13;
            this.autotekaCarOwnersId = str14;
            this.shouldShowAlertBannerOnValueSelected = bool7;
            this.labelPosition = labelPosition;
            this.separators = list2;
            this.switcherAlignment = listItemAlignment;
            this.bottomSheetTitle = str15;
            this.bottomSheetClearButtonTitle = str16;
            this.bottomSheetSelectButtonTitle = str17;
        }

        public static /* synthetic */ Displaying copy$default(Displaying displaying, String str, Boolean bool, boolean z12, Boolean bool2, String str2, SortDirection sortDirection, TipIconParameters tipIconParameters, DisplayingImageParams displayingImageParams, String str3, String str4, String str5, Boolean bool3, DialogDisplaying dialogDisplaying, String str6, Integer num, Integer num2, CustomPaddings customPaddings, OptionImageSize optionImageSize, String str7, String str8, String str9, Boolean bool4, List list, String str10, AttributedText attributedText, UniversalImage universalImage, String str11, EarlyAccess earlyAccess, Boolean bool5, Boolean bool6, String str12, boolean z13, String str13, String str14, Boolean bool7, LabelPosition labelPosition, List list2, ListItemAlignment listItemAlignment, String str15, String str16, String str17, int i12, int i13, Object obj) {
            return displaying.copy((i12 & 1) != 0 ? displaying.type : str, (i12 & 2) != 0 ? displaying.typoCorrectionEnabled : bool, (i12 & 4) != 0 ? displaying.hideTitle : z12, (i12 & 8) != 0 ? displaying.withImages : bool2, (i12 & 16) != 0 ? displaying.titlePattern : str2, (i12 & 32) != 0 ? displaying.sortDirection : sortDirection, (i12 & 64) != 0 ? displaying.tipIconParameters : tipIconParameters, (i12 & 128) != 0 ? displaying.imageParams : displayingImageParams, (i12 & 256) != 0 ? displaying.style : str3, (i12 & 512) != 0 ? displaying.placeholder : str4, (i12 & 1024) != 0 ? displaying.containerTitle : str5, (i12 & 2048) != 0 ? displaying.hideShowMore : bool3, (i12 & 4096) != 0 ? displaying.dialogDisplaying : dialogDisplaying, (i12 & 8192) != 0 ? displaying.valueIdForEmptySearch : str6, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? displaying.topPadding : num, (i12 & 32768) != 0 ? displaying.bottomPadding : num2, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? displaying.customPaddings : customPaddings, (i12 & 131072) != 0 ? displaying.optionImageSize : optionImageSize, (i12 & 262144) != 0 ? displaying.titleStyle : str7, (i12 & 524288) != 0 ? displaying.checkboxTitle : str8, (i12 & 1048576) != 0 ? displaying.scrollToValue : str9, (i12 & 2097152) != 0 ? displaying.toFillIn : bool4, (i12 & 4194304) != 0 ? displaying.paramsMustBeFilled : list, (i12 & 8388608) != 0 ? displaying.buttonLabel : str10, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? displaying.description : attributedText, (i12 & 33554432) != 0 ? displaying.multiThemeImages : universalImage, (i12 & 67108864) != 0 ? displaying.title : str11, (i12 & 134217728) != 0 ? displaying.earlyAccess : earlyAccess, (i12 & 268435456) != 0 ? displaying.keepSelected : bool5, (i12 & 536870912) != 0 ? displaying.showsAddressValue : bool6, (i12 & 1073741824) != 0 ? displaying.itemsStyle : str12, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? displaying.isComposeView : z13, (i13 & 1) != 0 ? displaying.alertBannerText : str13, (i13 & 2) != 0 ? displaying.autotekaCarOwnersId : str14, (i13 & 4) != 0 ? displaying.shouldShowAlertBannerOnValueSelected : bool7, (i13 & 8) != 0 ? displaying.labelPosition : labelPosition, (i13 & 16) != 0 ? displaying.separators : list2, (i13 & 32) != 0 ? displaying.switcherAlignment : listItemAlignment, (i13 & 64) != 0 ? displaying.bottomSheetTitle : str15, (i13 & 128) != 0 ? displaying.bottomSheetClearButtonTitle : str16, (i13 & 256) != 0 ? displaying.bottomSheetSelectButtonTitle : str17);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        /* renamed from: component11, reason: from getter */
        public final String getContainerTitle() {
            return this.containerTitle;
        }

        @l
        /* renamed from: component12, reason: from getter */
        public final Boolean getHideShowMore() {
            return this.hideShowMore;
        }

        @l
        /* renamed from: component13, reason: from getter */
        public final DialogDisplaying getDialogDisplaying() {
            return this.dialogDisplaying;
        }

        @l
        /* renamed from: component14, reason: from getter */
        public final String getValueIdForEmptySearch() {
            return this.valueIdForEmptySearch;
        }

        @l
        /* renamed from: component15, reason: from getter */
        public final Integer getTopPadding() {
            return this.topPadding;
        }

        @l
        /* renamed from: component16, reason: from getter */
        public final Integer getBottomPadding() {
            return this.bottomPadding;
        }

        @l
        /* renamed from: component17, reason: from getter */
        public final CustomPaddings getCustomPaddings() {
            return this.customPaddings;
        }

        @l
        /* renamed from: component18, reason: from getter */
        public final OptionImageSize getOptionImageSize() {
            return this.optionImageSize;
        }

        @l
        /* renamed from: component19, reason: from getter */
        public final String getTitleStyle() {
            return this.titleStyle;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Boolean getTypoCorrectionEnabled() {
            return this.typoCorrectionEnabled;
        }

        @l
        /* renamed from: component20, reason: from getter */
        public final String getCheckboxTitle() {
            return this.checkboxTitle;
        }

        @l
        /* renamed from: component21, reason: from getter */
        public final String getScrollToValue() {
            return this.scrollToValue;
        }

        @l
        /* renamed from: component22, reason: from getter */
        public final Boolean getToFillIn() {
            return this.toFillIn;
        }

        @l
        public final List<String> component23() {
            return this.paramsMustBeFilled;
        }

        @l
        /* renamed from: component24, reason: from getter */
        public final String getButtonLabel() {
            return this.buttonLabel;
        }

        @l
        /* renamed from: component25, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        @l
        /* renamed from: component26, reason: from getter */
        public final UniversalImage getMultiThemeImages() {
            return this.multiThemeImages;
        }

        @l
        /* renamed from: component27, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component28, reason: from getter */
        public final EarlyAccess getEarlyAccess() {
            return this.earlyAccess;
        }

        @l
        /* renamed from: component29, reason: from getter */
        public final Boolean getKeepSelected() {
            return this.keepSelected;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHideTitle() {
            return this.hideTitle;
        }

        @l
        /* renamed from: component30, reason: from getter */
        public final Boolean getShowsAddressValue() {
            return this.showsAddressValue;
        }

        @l
        /* renamed from: component31, reason: from getter */
        public final String getItemsStyle() {
            return this.itemsStyle;
        }

        /* renamed from: component32, reason: from getter */
        public final boolean getIsComposeView() {
            return this.isComposeView;
        }

        @l
        /* renamed from: component33, reason: from getter */
        public final String getAlertBannerText() {
            return this.alertBannerText;
        }

        @l
        /* renamed from: component34, reason: from getter */
        public final String getAutotekaCarOwnersId() {
            return this.autotekaCarOwnersId;
        }

        @l
        /* renamed from: component35, reason: from getter */
        public final Boolean getShouldShowAlertBannerOnValueSelected() {
            return this.shouldShowAlertBannerOnValueSelected;
        }

        @l
        /* renamed from: component36, reason: from getter */
        public final LabelPosition getLabelPosition() {
            return this.labelPosition;
        }

        @l
        public final List<Separator> component37() {
            return this.separators;
        }

        @l
        /* renamed from: component38, reason: from getter */
        public final ListItemAlignment getSwitcherAlignment() {
            return this.switcherAlignment;
        }

        @l
        /* renamed from: component39, reason: from getter */
        public final String getBottomSheetTitle() {
            return this.bottomSheetTitle;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Boolean getWithImages() {
            return this.withImages;
        }

        @l
        /* renamed from: component40, reason: from getter */
        public final String getBottomSheetClearButtonTitle() {
            return this.bottomSheetClearButtonTitle;
        }

        @l
        /* renamed from: component41, reason: from getter */
        public final String getBottomSheetSelectButtonTitle() {
            return this.bottomSheetSelectButtonTitle;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getTitlePattern() {
            return this.titlePattern;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final SortDirection getSortDirection() {
            return this.sortDirection;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final TipIconParameters getTipIconParameters() {
            return this.tipIconParameters;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final DisplayingImageParams getImageParams() {
            return this.imageParams;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final Displaying copy(@k String type, @l Boolean typoCorrectionEnabled, boolean hideTitle, @l Boolean withImages, @l String titlePattern, @l SortDirection sortDirection, @l TipIconParameters tipIconParameters, @l DisplayingImageParams imageParams, @l String style, @l String placeholder, @l String containerTitle, @l Boolean hideShowMore, @l DialogDisplaying dialogDisplaying, @l String valueIdForEmptySearch, @l Integer topPadding, @l Integer bottomPadding, @l CustomPaddings customPaddings, @l OptionImageSize optionImageSize, @l String titleStyle, @l String checkboxTitle, @l String scrollToValue, @l Boolean toFillIn, @l List<String> paramsMustBeFilled, @l String buttonLabel, @l AttributedText description, @l UniversalImage multiThemeImages, @l String title, @l EarlyAccess earlyAccess, @l Boolean keepSelected, @l Boolean showsAddressValue, @l String itemsStyle, boolean isComposeView, @l String alertBannerText, @l String autotekaCarOwnersId, @l Boolean shouldShowAlertBannerOnValueSelected, @l LabelPosition labelPosition, @l List<? extends Separator> separators, @l ListItemAlignment switcherAlignment, @l String bottomSheetTitle, @l String bottomSheetClearButtonTitle, @l String bottomSheetSelectButtonTitle) {
            return new Displaying(type, typoCorrectionEnabled, hideTitle, withImages, titlePattern, sortDirection, tipIconParameters, imageParams, style, placeholder, containerTitle, hideShowMore, dialogDisplaying, valueIdForEmptySearch, topPadding, bottomPadding, customPaddings, optionImageSize, titleStyle, checkboxTitle, scrollToValue, toFillIn, paramsMustBeFilled, buttonLabel, description, multiThemeImages, title, earlyAccess, keepSelected, showsAddressValue, itemsStyle, isComposeView, alertBannerText, autotekaCarOwnersId, shouldShowAlertBannerOnValueSelected, labelPosition, separators, switcherAlignment, bottomSheetTitle, bottomSheetClearButtonTitle, bottomSheetSelectButtonTitle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Displaying)) {
                return false;
            }
            Displaying displaying = (Displaying) other;
            return L.f(this.type, displaying.type) && L.f(this.typoCorrectionEnabled, displaying.typoCorrectionEnabled) && this.hideTitle == displaying.hideTitle && L.f(this.withImages, displaying.withImages) && L.f(this.titlePattern, displaying.titlePattern) && this.sortDirection == displaying.sortDirection && L.f(this.tipIconParameters, displaying.tipIconParameters) && L.f(this.imageParams, displaying.imageParams) && L.f(this.style, displaying.style) && L.f(this.placeholder, displaying.placeholder) && L.f(this.containerTitle, displaying.containerTitle) && L.f(this.hideShowMore, displaying.hideShowMore) && L.f(this.dialogDisplaying, displaying.dialogDisplaying) && L.f(this.valueIdForEmptySearch, displaying.valueIdForEmptySearch) && L.f(this.topPadding, displaying.topPadding) && L.f(this.bottomPadding, displaying.bottomPadding) && L.f(this.customPaddings, displaying.customPaddings) && L.f(this.optionImageSize, displaying.optionImageSize) && L.f(this.titleStyle, displaying.titleStyle) && L.f(this.checkboxTitle, displaying.checkboxTitle) && L.f(this.scrollToValue, displaying.scrollToValue) && L.f(this.toFillIn, displaying.toFillIn) && L.f(this.paramsMustBeFilled, displaying.paramsMustBeFilled) && L.f(this.buttonLabel, displaying.buttonLabel) && L.f(this.description, displaying.description) && L.f(this.multiThemeImages, displaying.multiThemeImages) && L.f(this.title, displaying.title) && L.f(this.earlyAccess, displaying.earlyAccess) && L.f(this.keepSelected, displaying.keepSelected) && L.f(this.showsAddressValue, displaying.showsAddressValue) && L.f(this.itemsStyle, displaying.itemsStyle) && this.isComposeView == displaying.isComposeView && L.f(this.alertBannerText, displaying.alertBannerText) && L.f(this.autotekaCarOwnersId, displaying.autotekaCarOwnersId) && L.f(this.shouldShowAlertBannerOnValueSelected, displaying.shouldShowAlertBannerOnValueSelected) && this.labelPosition == displaying.labelPosition && L.f(this.separators, displaying.separators) && this.switcherAlignment == displaying.switcherAlignment && L.f(this.bottomSheetTitle, displaying.bottomSheetTitle) && L.f(this.bottomSheetClearButtonTitle, displaying.bottomSheetClearButtonTitle) && L.f(this.bottomSheetSelectButtonTitle, displaying.bottomSheetSelectButtonTitle);
        }

        @l
        public final String getAlertBannerText() {
            return this.alertBannerText;
        }

        @l
        public final String getAutotekaCarOwnersId() {
            return this.autotekaCarOwnersId;
        }

        @l
        public final Integer getBottomPadding() {
            return this.bottomPadding;
        }

        @l
        public final String getBottomSheetClearButtonTitle() {
            return this.bottomSheetClearButtonTitle;
        }

        @l
        public final String getBottomSheetSelectButtonTitle() {
            return this.bottomSheetSelectButtonTitle;
        }

        @l
        public final String getBottomSheetTitle() {
            return this.bottomSheetTitle;
        }

        @l
        public final String getButtonLabel() {
            return this.buttonLabel;
        }

        @l
        public final String getCheckboxTitle() {
            return this.checkboxTitle;
        }

        @l
        public final String getContainerTitle() {
            return this.containerTitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public CustomPaddings getCustomPaddings() {
            return this.customPaddings;
        }

        @l
        public final AttributedText getDescription() {
            return this.description;
        }

        @l
        public final DialogDisplaying getDialogDisplaying() {
            return this.dialogDisplaying;
        }

        @l
        public final EarlyAccess getEarlyAccess() {
            return this.earlyAccess;
        }

        @l
        public final Boolean getHideShowMore() {
            return this.hideShowMore;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @k
        public Boolean getHideTitle() {
            return Boolean.valueOf(this.hideTitle);
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public DisplayingImageParams getImageParams() {
            return this.imageParams;
        }

        @l
        public final String getItemsStyle() {
            return this.itemsStyle;
        }

        @l
        public final Boolean getKeepSelected() {
            return this.keepSelected;
        }

        @l
        public final LabelPosition getLabelPosition() {
            return this.labelPosition;
        }

        @l
        public final UniversalImage getMultiThemeImages() {
            return this.multiThemeImages;
        }

        @l
        public final OptionImageSize getOptionImageSize() {
            return this.optionImageSize;
        }

        @l
        public final List<String> getParamsMustBeFilled() {
            return this.paramsMustBeFilled;
        }

        @l
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        public final String getScrollToValue() {
            return this.scrollToValue;
        }

        @l
        public final List<Separator> getSeparators() {
            return this.separators;
        }

        @l
        public final Boolean getShouldShowAlertBannerOnValueSelected() {
            return this.shouldShowAlertBannerOnValueSelected;
        }

        @l
        public final Boolean getShowsAddressValue() {
            return this.showsAddressValue;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public SortDirection getSortDirection() {
            return this.sortDirection;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public String getStyle() {
            return this.style;
        }

        @l
        public final ListItemAlignment getSwitcherAlignment() {
            return this.switcherAlignment;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public TipIconParameters getTipIconParameters() {
            return this.tipIconParameters;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public String getTitlePattern() {
            return this.titlePattern;
        }

        @l
        public final String getTitleStyle() {
            return this.titleStyle;
        }

        @l
        public final Boolean getToFillIn() {
            return this.toFillIn;
        }

        @l
        public final Integer getTopPadding() {
            return this.topPadding;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @k
        public String getType() {
            return this.type;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public Boolean getTypoCorrectionEnabled() {
            return this.typoCorrectionEnabled;
        }

        @l
        public final String getValueIdForEmptySearch() {
            return this.valueIdForEmptySearch;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public Boolean getWithImages() {
            return this.withImages;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            Boolean bool = this.typoCorrectionEnabled;
            int i12 = r.i((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.hideTitle);
            Boolean bool2 = this.withImages;
            int iHashCode2 = (i12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.titlePattern;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            SortDirection sortDirection = this.sortDirection;
            int iHashCode4 = (iHashCode3 + (sortDirection == null ? 0 : sortDirection.hashCode())) * 31;
            TipIconParameters tipIconParameters = this.tipIconParameters;
            int iHashCode5 = (iHashCode4 + (tipIconParameters == null ? 0 : tipIconParameters.hashCode())) * 31;
            DisplayingImageParams displayingImageParams = this.imageParams;
            int iHashCode6 = (iHashCode5 + (displayingImageParams == null ? 0 : displayingImageParams.hashCode())) * 31;
            String str2 = this.style;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.placeholder;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.containerTitle;
            int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool3 = this.hideShowMore;
            int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            DialogDisplaying dialogDisplaying = this.dialogDisplaying;
            int iHashCode11 = (iHashCode10 + (dialogDisplaying == null ? 0 : dialogDisplaying.hashCode())) * 31;
            String str5 = this.valueIdForEmptySearch;
            int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.topPadding;
            int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.bottomPadding;
            int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
            CustomPaddings customPaddings = this.customPaddings;
            int iHashCode15 = (iHashCode14 + (customPaddings == null ? 0 : customPaddings.hashCode())) * 31;
            OptionImageSize optionImageSize = this.optionImageSize;
            int iHashCode16 = (iHashCode15 + (optionImageSize == null ? 0 : optionImageSize.hashCode())) * 31;
            String str6 = this.titleStyle;
            int iHashCode17 = (iHashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.checkboxTitle;
            int iHashCode18 = (iHashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.scrollToValue;
            int iHashCode19 = (iHashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Boolean bool4 = this.toFillIn;
            int iHashCode20 = (iHashCode19 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            List<String> list = this.paramsMustBeFilled;
            int iHashCode21 = (iHashCode20 + (list == null ? 0 : list.hashCode())) * 31;
            String str9 = this.buttonLabel;
            int iHashCode22 = (iHashCode21 + (str9 == null ? 0 : str9.hashCode())) * 31;
            AttributedText attributedText = this.description;
            int iHashCode23 = (iHashCode22 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            UniversalImage universalImage = this.multiThemeImages;
            int iHashCode24 = (iHashCode23 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
            String str10 = this.title;
            int iHashCode25 = (iHashCode24 + (str10 == null ? 0 : str10.hashCode())) * 31;
            EarlyAccess earlyAccess = this.earlyAccess;
            int iHashCode26 = (iHashCode25 + (earlyAccess == null ? 0 : earlyAccess.hashCode())) * 31;
            Boolean bool5 = this.keepSelected;
            int iHashCode27 = (iHashCode26 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.showsAddressValue;
            int iHashCode28 = (iHashCode27 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            String str11 = this.itemsStyle;
            int i13 = r.i((iHashCode28 + (str11 == null ? 0 : str11.hashCode())) * 31, 31, this.isComposeView);
            String str12 = this.alertBannerText;
            int iHashCode29 = (i13 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.autotekaCarOwnersId;
            int iHashCode30 = (iHashCode29 + (str13 == null ? 0 : str13.hashCode())) * 31;
            Boolean bool7 = this.shouldShowAlertBannerOnValueSelected;
            int iHashCode31 = (iHashCode30 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            LabelPosition labelPosition = this.labelPosition;
            int iHashCode32 = (iHashCode31 + (labelPosition == null ? 0 : labelPosition.hashCode())) * 31;
            List<Separator> list2 = this.separators;
            int iHashCode33 = (iHashCode32 + (list2 == null ? 0 : list2.hashCode())) * 31;
            ListItemAlignment listItemAlignment = this.switcherAlignment;
            int iHashCode34 = (iHashCode33 + (listItemAlignment == null ? 0 : listItemAlignment.hashCode())) * 31;
            String str14 = this.bottomSheetTitle;
            int iHashCode35 = (iHashCode34 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.bottomSheetClearButtonTitle;
            int iHashCode36 = (iHashCode35 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.bottomSheetSelectButtonTitle;
            return iHashCode36 + (str16 != null ? str16.hashCode() : 0);
        }

        public final boolean isComposeView() {
            return this.isComposeView;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Displaying(type=");
            sb2.append(this.type);
            sb2.append(", typoCorrectionEnabled=");
            sb2.append(this.typoCorrectionEnabled);
            sb2.append(", hideTitle=");
            sb2.append(this.hideTitle);
            sb2.append(", withImages=");
            sb2.append(this.withImages);
            sb2.append(", titlePattern=");
            sb2.append(this.titlePattern);
            sb2.append(", sortDirection=");
            sb2.append(this.sortDirection);
            sb2.append(", tipIconParameters=");
            sb2.append(this.tipIconParameters);
            sb2.append(", imageParams=");
            sb2.append(this.imageParams);
            sb2.append(", style=");
            sb2.append(this.style);
            sb2.append(", placeholder=");
            sb2.append(this.placeholder);
            sb2.append(", containerTitle=");
            sb2.append(this.containerTitle);
            sb2.append(", hideShowMore=");
            sb2.append(this.hideShowMore);
            sb2.append(", dialogDisplaying=");
            sb2.append(this.dialogDisplaying);
            sb2.append(", valueIdForEmptySearch=");
            sb2.append(this.valueIdForEmptySearch);
            sb2.append(", topPadding=");
            sb2.append(this.topPadding);
            sb2.append(", bottomPadding=");
            sb2.append(this.bottomPadding);
            sb2.append(", customPaddings=");
            sb2.append(this.customPaddings);
            sb2.append(", optionImageSize=");
            sb2.append(this.optionImageSize);
            sb2.append(", titleStyle=");
            sb2.append(this.titleStyle);
            sb2.append(", checkboxTitle=");
            sb2.append(this.checkboxTitle);
            sb2.append(", scrollToValue=");
            sb2.append(this.scrollToValue);
            sb2.append(", toFillIn=");
            sb2.append(this.toFillIn);
            sb2.append(", paramsMustBeFilled=");
            sb2.append(this.paramsMustBeFilled);
            sb2.append(", buttonLabel=");
            sb2.append(this.buttonLabel);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", multiThemeImages=");
            sb2.append(this.multiThemeImages);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", earlyAccess=");
            sb2.append(this.earlyAccess);
            sb2.append(", keepSelected=");
            sb2.append(this.keepSelected);
            sb2.append(", showsAddressValue=");
            sb2.append(this.showsAddressValue);
            sb2.append(", itemsStyle=");
            sb2.append(this.itemsStyle);
            sb2.append(", isComposeView=");
            sb2.append(this.isComposeView);
            sb2.append(", alertBannerText=");
            sb2.append(this.alertBannerText);
            sb2.append(", autotekaCarOwnersId=");
            sb2.append(this.autotekaCarOwnersId);
            sb2.append(", shouldShowAlertBannerOnValueSelected=");
            sb2.append(this.shouldShowAlertBannerOnValueSelected);
            sb2.append(", labelPosition=");
            sb2.append(this.labelPosition);
            sb2.append(", separators=");
            sb2.append(this.separators);
            sb2.append(", switcherAlignment=");
            sb2.append(this.switcherAlignment);
            sb2.append(", bottomSheetTitle=");
            sb2.append(this.bottomSheetTitle);
            sb2.append(", bottomSheetClearButtonTitle=");
            sb2.append(this.bottomSheetClearButtonTitle);
            sb2.append(", bottomSheetSelectButtonTitle=");
            return C22026a.c(sb2, this.bottomSheetSelectButtonTitle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.type);
            Boolean bool = this.typoCorrectionEnabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeInt(this.hideTitle ? 1 : 0);
            Boolean bool2 = this.withImages;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool2);
            }
            parcel.writeString(this.titlePattern);
            SortDirection sortDirection = this.sortDirection;
            if (sortDirection == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(sortDirection.name());
            }
            TipIconParameters tipIconParameters = this.tipIconParameters;
            if (tipIconParameters == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                tipIconParameters.writeToParcel(parcel, flags);
            }
            DisplayingImageParams displayingImageParams = this.imageParams;
            if (displayingImageParams == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                displayingImageParams.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.style);
            parcel.writeString(this.placeholder);
            parcel.writeString(this.containerTitle);
            Boolean bool3 = this.hideShowMore;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool3);
            }
            DialogDisplaying dialogDisplaying = this.dialogDisplaying;
            if (dialogDisplaying == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dialogDisplaying.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.valueIdForEmptySearch);
            Integer num = this.topPadding;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Integer num2 = this.bottomPadding;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num2);
            }
            CustomPaddings customPaddings = this.customPaddings;
            if (customPaddings == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                customPaddings.writeToParcel(parcel, flags);
            }
            OptionImageSize optionImageSize = this.optionImageSize;
            if (optionImageSize == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                optionImageSize.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.titleStyle);
            parcel.writeString(this.checkboxTitle);
            parcel.writeString(this.scrollToValue);
            Boolean bool4 = this.toFillIn;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool4);
            }
            parcel.writeStringList(this.paramsMustBeFilled);
            parcel.writeString(this.buttonLabel);
            parcel.writeParcelable(this.description, flags);
            parcel.writeParcelable(this.multiThemeImages, flags);
            parcel.writeString(this.title);
            EarlyAccess earlyAccess = this.earlyAccess;
            if (earlyAccess == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                earlyAccess.writeToParcel(parcel, flags);
            }
            Boolean bool5 = this.keepSelected;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool5);
            }
            Boolean bool6 = this.showsAddressValue;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool6);
            }
            parcel.writeString(this.itemsStyle);
            parcel.writeInt(this.isComposeView ? 1 : 0);
            parcel.writeString(this.alertBannerText);
            parcel.writeString(this.autotekaCarOwnersId);
            Boolean bool7 = this.shouldShowAlertBannerOnValueSelected;
            if (bool7 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool7);
            }
            LabelPosition labelPosition = this.labelPosition;
            if (labelPosition == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(labelPosition.name());
            }
            List<Separator> list = this.separators;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeString(((Separator) itA.next()).name());
                }
            }
            ListItemAlignment listItemAlignment = this.switcherAlignment;
            if (listItemAlignment == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                listItemAlignment.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.bottomSheetTitle);
            parcel.writeString(this.bottomSheetClearButtonTitle);
            parcel.writeString(this.bottomSheetSelectButtonTitle);
        }

        @InterfaceC42830m
        public static /* synthetic */ void getBottomPadding$annotations() {
        }

        @InterfaceC42830m
        public static /* synthetic */ void getTopPadding$annotations() {
        }

        public /* synthetic */ Displaying(String str, Boolean bool, boolean z12, Boolean bool2, String str2, SortDirection sortDirection, TipIconParameters tipIconParameters, DisplayingImageParams displayingImageParams, String str3, String str4, String str5, Boolean bool3, DialogDisplaying dialogDisplaying, String str6, Integer num, Integer num2, CustomPaddings customPaddings, OptionImageSize optionImageSize, String str7, String str8, String str9, Boolean bool4, List list, String str10, AttributedText attributedText, UniversalImage universalImage, String str11, EarlyAccess earlyAccess, Boolean bool5, Boolean bool6, String str12, boolean z13, String str13, String str14, Boolean bool7, LabelPosition labelPosition, List list2, ListItemAlignment listItemAlignment, String str15, String str16, String str17, int i12, int i13, C42822w c42822w) {
            DialogDisplaying dialogDisplaying2;
            CustomPaddings customPaddings2;
            Boolean bool8 = (i12 & 2) != 0 ? Boolean.FALSE : bool;
            boolean z14 = (i12 & 4) != 0 ? false : z12;
            Boolean bool9 = (i12 & 8) != 0 ? Boolean.FALSE : bool2;
            String str18 = (i12 & 16) != 0 ? null : str2;
            SortDirection sortDirection2 = (i12 & 32) != 0 ? null : sortDirection;
            TipIconParameters tipIconParameters2 = (i12 & 64) != 0 ? null : tipIconParameters;
            DisplayingImageParams displayingImageParams2 = (i12 & 128) != 0 ? null : displayingImageParams;
            String str19 = (i12 & 256) != 0 ? null : str3;
            String str20 = (i12 & 512) != 0 ? null : str4;
            String str21 = (i12 & 1024) != 0 ? null : str5;
            Boolean bool10 = (i12 & 2048) != 0 ? Boolean.FALSE : bool3;
            DialogDisplaying dialogDisplaying3 = (i12 & 4096) != 0 ? null : dialogDisplaying;
            String str22 = (i12 & 8192) != 0 ? null : str6;
            Integer num3 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num;
            String str23 = str22;
            Integer num4 = (i12 & 32768) != 0 ? null : num2;
            if ((i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0) {
                dialogDisplaying2 = dialogDisplaying3;
                customPaddings2 = new CustomPaddings(num3, num4);
            } else {
                dialogDisplaying2 = dialogDisplaying3;
                customPaddings2 = customPaddings;
            }
            this(str, bool8, z14, bool9, str18, sortDirection2, tipIconParameters2, displayingImageParams2, str19, str20, str21, bool10, dialogDisplaying2, str23, num3, num4, customPaddings2, (i12 & 131072) != 0 ? null : optionImageSize, (i12 & 262144) != 0 ? null : str7, (i12 & 524288) != 0 ? null : str8, (i12 & 1048576) != 0 ? null : str9, (i12 & 2097152) != 0 ? null : bool4, (i12 & 4194304) != 0 ? null : list, (i12 & 8388608) != 0 ? null : str10, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : attributedText, (i12 & 33554432) != 0 ? null : universalImage, (i12 & 67108864) != 0 ? null : str11, (i12 & 134217728) != 0 ? null : earlyAccess, (i12 & 268435456) != 0 ? null : bool5, (i12 & 536870912) != 0 ? null : bool6, (i12 & 1073741824) != 0 ? null : str12, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? false : z13, (i13 & 1) != 0 ? null : str13, (i13 & 2) != 0 ? null : str14, (i13 & 4) != 0 ? null : bool7, (i13 & 8) != 0 ? null : labelPosition, (i13 & 16) != 0 ? null : list2, (i13 & 32) != 0 ? null : listItemAlignment, (i13 & 64) != 0 ? null : str15, (i13 & 128) != 0 ? null : str16, (i13 & 256) != 0 ? null : str17);
        }
    }
}
