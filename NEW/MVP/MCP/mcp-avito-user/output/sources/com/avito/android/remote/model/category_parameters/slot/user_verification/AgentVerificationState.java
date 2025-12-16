package com.avito.android.remote.model.category_parameters.slot.user_verification;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: UserVerificationSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002;<BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012Jn\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0012J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020 HÖ\u0001¢\u0006\u0004\b(\u0010\"J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020 HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u0012R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u0019R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b8\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b9\u0010\u0012R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b:\u0010\u0012¨\u0006="}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "benefitsHeader", "", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Benefit;", "benefits", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Button;", "submitButton", "leaveButton", "bottomText", "errorMessage", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Button;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Button;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Button;", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Button;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Button;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "getBenefitsHeader", "Ljava/util/List;", "getBenefits", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Button;", "getSubmitButton", "getLeaveButton", "getBottomText", "getErrorMessage", "Benefit", "Button", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AgentVerificationState implements Parcelable {

    @k
    public static final Parcelable.Creator<AgentVerificationState> CREATOR = new Creator();

    @c("benefits")
    @l
    private final List<Benefit> benefits;

    @c("benefitsHeader")
    @l
    private final String benefitsHeader;

    @c("bottomText")
    @l
    private final String bottomText;

    @c("description")
    @k
    private final AttributedText description;

    @c("errorMessage")
    @l
    private final String errorMessage;

    @c("leaveButton")
    @k
    private final Button leaveButton;

    @c("submitButton")
    @k
    private final Button submitButton;

    @c("title")
    @k
    private final String title;

    /* compiled from: UserVerificationSlotConfig.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Benefit;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Benefit$Icon;", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Benefit$Icon;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Benefit$Icon;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Benefit$Icon;)Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Benefit;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Benefit$Icon;", "getIcon", "Icon", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Benefit implements Parcelable {

        @k
        public static final Parcelable.Creator<Benefit> CREATOR = new Creator();

        @c("description")
        @k
        private final String description;

        @c("icon")
        @k
        private final Icon icon;

        @c("title")
        @k
        private final String title;

        /* compiled from: UserVerificationSlotConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Benefit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Benefit createFromParcel(@k Parcel parcel) {
                return new Benefit(parcel.readString(), parcel.readString(), Icon.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Benefit[] newArray(int i12) {
                return new Benefit[i12];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UserVerificationSlotConfig.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Benefit$Icon;", "", "(Ljava/lang/String;I)V", "VAS", "ITEM_RICH", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Icon {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Icon[] $VALUES;

            @c("vas")
            public static final Icon VAS = new Icon("VAS", 0);

            @c("item_rich")
            public static final Icon ITEM_RICH = new Icon("ITEM_RICH", 1);

            private static final /* synthetic */ Icon[] $values() {
                return new Icon[]{VAS, ITEM_RICH};
            }

            static {
                Icon[] iconArr$values = $values();
                $VALUES = iconArr$values;
                $ENTRIES = kotlin.enums.c.a(iconArr$values);
            }

            private Icon(String str, int i12) {
            }

            @k
            public static a<Icon> getEntries() {
                return $ENTRIES;
            }

            public static Icon valueOf(String str) {
                return (Icon) Enum.valueOf(Icon.class, str);
            }

            public static Icon[] values() {
                return (Icon[]) $VALUES.clone();
            }
        }

        public Benefit(@k String str, @k String str2, @k Icon icon) {
            this.title = str;
            this.description = str2;
            this.icon = icon;
        }

        public static /* synthetic */ Benefit copy$default(Benefit benefit, String str, String str2, Icon icon, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = benefit.title;
            }
            if ((i12 & 2) != 0) {
                str2 = benefit.description;
            }
            if ((i12 & 4) != 0) {
                icon = benefit.icon;
            }
            return benefit.copy(str, str2, icon);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @k
        public final Benefit copy(@k String title, @k String description, @k Icon icon) {
            return new Benefit(title, description, icon);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Benefit)) {
                return false;
            }
            Benefit benefit = (Benefit) other;
            return L.f(this.title, benefit.title) && L.f(this.description, benefit.description) && this.icon == benefit.icon;
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @k
        public final Icon getIcon() {
            return this.icon;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.icon.hashCode() + H.d(this.title.hashCode() * 31, 31, this.description);
        }

        @k
        public String toString() {
            return "Benefit(title=" + this.title + ", description=" + this.description + ", icon=" + this.icon + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            parcel.writeString(this.icon.name());
        }
    }

    /* compiled from: UserVerificationSlotConfig.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0011¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Button;", "Landroid/os/Parcelable;", "", "title", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "", "enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getStyle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getLink", "Ljava/lang/Boolean;", "getEnabled", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new Creator();

        @c("enabled")
        @l
        private final Boolean enabled;

        @c(ContextActionHandler.Link.URL)
        @l
        private final DeepLink link;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @k
        private final String style;

        @c("title")
        @k
        private final String title;

        /* compiled from: UserVerificationSlotConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Button> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Button.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Button(string, string2, deepLink, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @k String str2, @l DeepLink deepLink, @l Boolean bool) {
            this.title = str;
            this.style = str2;
            this.link = deepLink;
            this.enabled = bool;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, String str2, DeepLink deepLink, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = button.title;
            }
            if ((i12 & 2) != 0) {
                str2 = button.style;
            }
            if ((i12 & 4) != 0) {
                deepLink = button.link;
            }
            if ((i12 & 8) != 0) {
                bool = button.enabled;
            }
            return button.copy(str, str2, deepLink, bool);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final DeepLink getLink() {
            return this.link;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Boolean getEnabled() {
            return this.enabled;
        }

        @k
        public final Button copy(@k String title, @k String style, @l DeepLink link, @l Boolean enabled) {
            return new Button(title, style, link, enabled);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return L.f(this.title, button.title) && L.f(this.style, button.style) && L.f(this.link, button.link) && L.f(this.enabled, button.enabled);
        }

        @l
        public final Boolean getEnabled() {
            return this.enabled;
        }

        @l
        public final DeepLink getLink() {
            return this.link;
        }

        @k
        public final String getStyle() {
            return this.style;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iD2 = H.d(this.title.hashCode() * 31, 31, this.style);
            DeepLink deepLink = this.link;
            int iHashCode = (iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Boolean bool = this.enabled;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.title);
            sb2.append(", style=");
            sb2.append(this.style);
            sb2.append(", link=");
            sb2.append(this.link);
            sb2.append(", enabled=");
            return C0.g(sb2, this.enabled, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.style);
            parcel.writeParcelable(this.link, flags);
            Boolean bool = this.enabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: UserVerificationSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AgentVerificationState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AgentVerificationState createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AgentVerificationState.class.getClassLoader());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Benefit.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            Parcelable.Creator<Button> creator = Button.CREATOR;
            return new AgentVerificationState(string, attributedText, string2, arrayList, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AgentVerificationState[] newArray(int i12) {
            return new AgentVerificationState[i12];
        }
    }

    public AgentVerificationState(@k String str, @k AttributedText attributedText, @l String str2, @l List<Benefit> list, @k Button button, @k Button button2, @l String str3, @l String str4) {
        this.title = str;
        this.description = attributedText;
        this.benefitsHeader = str2;
        this.benefits = list;
        this.submitButton = button;
        this.leaveButton = button2;
        this.bottomText = str3;
        this.errorMessage = str4;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getBenefitsHeader() {
        return this.benefitsHeader;
    }

    @l
    public final List<Benefit> component4() {
        return this.benefits;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final Button getSubmitButton() {
        return this.submitButton;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final Button getLeaveButton() {
        return this.leaveButton;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getBottomText() {
        return this.bottomText;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @k
    public final AgentVerificationState copy(@k String title, @k AttributedText description, @l String benefitsHeader, @l List<Benefit> benefits, @k Button submitButton, @k Button leaveButton, @l String bottomText, @l String errorMessage) {
        return new AgentVerificationState(title, description, benefitsHeader, benefits, submitButton, leaveButton, bottomText, errorMessage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgentVerificationState)) {
            return false;
        }
        AgentVerificationState agentVerificationState = (AgentVerificationState) other;
        return L.f(this.title, agentVerificationState.title) && L.f(this.description, agentVerificationState.description) && L.f(this.benefitsHeader, agentVerificationState.benefitsHeader) && L.f(this.benefits, agentVerificationState.benefits) && L.f(this.submitButton, agentVerificationState.submitButton) && L.f(this.leaveButton, agentVerificationState.leaveButton) && L.f(this.bottomText, agentVerificationState.bottomText) && L.f(this.errorMessage, agentVerificationState.errorMessage);
    }

    @l
    public final List<Benefit> getBenefits() {
        return this.benefits;
    }

    @l
    public final String getBenefitsHeader() {
        return this.benefitsHeader;
    }

    @l
    public final String getBottomText() {
        return this.bottomText;
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @k
    public final Button getLeaveButton() {
        return this.leaveButton;
    }

    @k
    public final Button getSubmitButton() {
        return this.submitButton;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.title.hashCode() * 31, 31, this.description);
        String str = this.benefitsHeader;
        int iHashCode = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
        List<Benefit> list = this.benefits;
        int iHashCode2 = (this.leaveButton.hashCode() + ((this.submitButton.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.bottomText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMessage;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AgentVerificationState(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", benefitsHeader=");
        sb2.append(this.benefitsHeader);
        sb2.append(", benefits=");
        sb2.append(this.benefits);
        sb2.append(", submitButton=");
        sb2.append(this.submitButton);
        sb2.append(", leaveButton=");
        sb2.append(this.leaveButton);
        sb2.append(", bottomText=");
        sb2.append(this.bottomText);
        sb2.append(", errorMessage=");
        return C22026a.c(sb2, this.errorMessage, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.description, flags);
        parcel.writeString(this.benefitsHeader);
        List<Benefit> list = this.benefits;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Benefit) itA.next()).writeToParcel(parcel, flags);
            }
        }
        this.submitButton.writeToParcel(parcel, flags);
        this.leaveButton.writeToParcel(parcel, flags);
        parcel.writeString(this.bottomText);
        parcel.writeString(this.errorMessage);
    }
}
