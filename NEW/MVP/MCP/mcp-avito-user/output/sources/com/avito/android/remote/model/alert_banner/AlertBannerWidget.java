package com.avito.android.remote.model.alert_banner;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: AlertBannerWidget.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001.B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b$\u0010 R(\u0010&\u001a\u00020%8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b&\u0010'\u0012\u0004\b,\u0010-\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/alert_banner/AlertBannerWidget;", "Lcom/avito/android/remote/model/SerpElement;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "body", "Lcom/avito/android/remote/model/alert_banner/Action;", "action", "Lcom/avito/android/remote/model/alert_banner/AlertBannerWidget$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "link", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/alert_banner/Action;Lcom/avito/android/remote/model/alert_banner/AlertBannerWidget$Style;Lcom/avito/android/remote/model/alert_banner/Action;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getBody", "Lcom/avito/android/remote/model/alert_banner/Action;", "getAction", "()Lcom/avito/android/remote/model/alert_banner/Action;", "Lcom/avito/android/remote/model/alert_banner/AlertBannerWidget$Style;", "getStyle", "()Lcom/avito/android/remote/model/alert_banner/AlertBannerWidget$Style;", "getLink", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "Style", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AlertBannerWidget implements SerpElement {

    @k
    public static final Parcelable.Creator<AlertBannerWidget> CREATOR = new Creator();

    @c("action")
    @l
    private final Action action;

    @c("body")
    @l
    private final AttributedText body;

    @c("id")
    @k
    private final String id;

    @c("link")
    @l
    private final Action link;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final Style style;

    @c("title")
    @l
    private final AttributedText title;
    private long uniqueId;

    /* compiled from: AlertBannerWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AlertBannerWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AlertBannerWidget createFromParcel(@k Parcel parcel) {
            return new AlertBannerWidget(parcel.readString(), (AttributedText) parcel.readParcelable(AlertBannerWidget.class.getClassLoader()), (AttributedText) parcel.readParcelable(AlertBannerWidget.class.getClassLoader()), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel), Style.valueOf(parcel.readString()), parcel.readInt() != 0 ? Action.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AlertBannerWidget[] newArray(int i12) {
            return new AlertBannerWidget[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AlertBannerWidget.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/alert_banner/AlertBannerWidget$Style;", "", "(Ljava/lang/String;I)V", "DEFAULT", "DANGER", "INFO", "SUCCESS", "WARNING", "WHITE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;

        @c("default")
        public static final Style DEFAULT = new Style("DEFAULT", 0);

        @c("danger")
        public static final Style DANGER = new Style("DANGER", 1);

        @c(RequestReviewResultKt.INFO_TYPE)
        public static final Style INFO = new Style("INFO", 2);

        @c("success")
        public static final Style SUCCESS = new Style("SUCCESS", 3);

        @c(ConstraintKt.WARNING)
        public static final Style WARNING = new Style("WARNING", 4);

        @c("white")
        public static final Style WHITE = new Style("WHITE", 5);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{DEFAULT, DANGER, INFO, SUCCESS, WARNING, WHITE};
        }

        static {
            Style[] styleArr$values = $values();
            $VALUES = styleArr$values;
            $ENTRIES = kotlin.enums.c.a(styleArr$values);
        }

        private Style(String str, int i12) {
        }

        @k
        public static a<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public AlertBannerWidget(@k String str, @l AttributedText attributedText, @l AttributedText attributedText2, @l Action action, @k Style style, @l Action action2) {
        this.id = str;
        this.title = attributedText;
        this.body = attributedText2;
        this.action = action;
        this.style = style;
        this.link = action2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    @l
    public final AttributedText getBody() {
        return this.body;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final Action getLink() {
        return this.link;
    }

    @k
    public final Style getStyle() {
        return this.style;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.body, flags);
        Action action = this.action;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.style.name());
        Action action2 = this.link;
        if (action2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action2.writeToParcel(parcel, flags);
        }
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
