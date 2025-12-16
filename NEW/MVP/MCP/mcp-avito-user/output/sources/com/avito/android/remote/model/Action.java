package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: Action.kt */
@InterfaceC19823a
@d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002XYB¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001cJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b-\u0010+J\u0012\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b.\u0010+J\u0012\u0010/\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b1\u0010$JÌ\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010\u001cJ\u0010\u00105\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b;\u00106J \u0010@\u001a\u00020?2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bG\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bH\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bI\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\bK\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bM\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bN\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bO\u0010\u001cR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bP\u0010\u001cR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010Q\u001a\u0004\bR\u0010+R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bS\u0010\u001cR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010Q\u001a\u0004\bT\u0010+R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0015\u0010Q\u001a\u0004\bU\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010V\u001a\u0004\bW\u00100R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\b\u0018\u0010$¨\u0006Z"}, d2 = {"Lcom/avito/android/remote/model/Action;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/Action$Confirmation;", "confirmation", "type", "rawUri", "", "closesElement", "Lcom/avito/android/remote/model/UniversalImage;", "image", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "rubricatorLayout", "titleWithTransfer", "", "rowLine", "backgroundColor", "landscapeRowLine", "landscapePosition", "Lcom/avito/android/remote/model/Action$TitleWithSalary;", "titleWithSalary", "isAllCategoriesItem", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Action$Confirmation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/Action$TitleWithSalary;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/Action$Confirmation;", "component4", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "()Lcom/avito/android/remote/model/UniversalImage;", "component8", "component9", "component10", "component11", "()Ljava/lang/Integer;", "component12", "component13", "component14", "component15", "()Lcom/avito/android/remote/model/Action$TitleWithSalary;", "component16", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Action$Confirmation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/Action$TitleWithSalary;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/Action;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Lcom/avito/android/remote/model/Action$Confirmation;", "getConfirmation", "getType", "getRawUri", "Ljava/lang/Boolean;", "getClosesElement", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "getStyle", "getRubricatorLayout", "getTitleWithTransfer", "Ljava/lang/Integer;", "getRowLine", "getBackgroundColor", "getLandscapeRowLine", "getLandscapePosition", "Lcom/avito/android/remote/model/Action$TitleWithSalary;", "getTitleWithSalary", "Confirmation", "TitleWithSalary", "_common_network-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Action implements Parcelable {

    @k
    public static final Parcelable.Creator<Action> CREATOR = new Creator();

    @l
    private final String backgroundColor;

    @l
    private final Boolean closesElement;

    @l
    private final Confirmation confirmation;

    @k
    private final DeepLink deepLink;

    @l
    private final UniversalImage image;

    @l
    private final Boolean isAllCategoriesItem;

    @l
    private final Integer landscapePosition;

    @l
    private final Integer landscapeRowLine;

    @l
    private final String rawUri;

    @l
    private final Integer rowLine;

    @l
    private final String rubricatorLayout;

    @l
    private final String style;

    @k
    private final String title;

    @l
    private final TitleWithSalary titleWithSalary;

    @l
    private final String titleWithTransfer;

    @l
    private final String type;

    /* compiled from: Action.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/Action$Confirmation;", "Landroid/os/Parcelable;", "", "title", "description", "ok", "cancel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/Action$Confirmation;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "getOk", "getCancel", "_common_network-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Confirmation implements Parcelable {

        @k
        public static final Parcelable.Creator<Confirmation> CREATOR = new Creator();

        @c("cancel")
        @k
        private final String cancel;

        @c("description")
        @k
        private final String description;

        @c("ok")
        @k
        private final String ok;

        @c("title")
        @k
        private final String title;

        /* compiled from: Action.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Confirmation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Confirmation createFromParcel(@k Parcel parcel) {
                return new Confirmation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Confirmation[] newArray(int i12) {
                return new Confirmation[i12];
            }
        }

        public Confirmation(@k String str, @k String str2, @k String str3, @k String str4) {
            this.title = str;
            this.description = str2;
            this.ok = str3;
            this.cancel = str4;
        }

        public static /* synthetic */ Confirmation copy$default(Confirmation confirmation, String str, String str2, String str3, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = confirmation.title;
            }
            if ((i12 & 2) != 0) {
                str2 = confirmation.description;
            }
            if ((i12 & 4) != 0) {
                str3 = confirmation.ok;
            }
            if ((i12 & 8) != 0) {
                str4 = confirmation.cancel;
            }
            return confirmation.copy(str, str2, str3, str4);
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
        public final String getOk() {
            return this.ok;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getCancel() {
            return this.cancel;
        }

        @k
        public final Confirmation copy(@k String title, @k String description, @k String ok2, @k String cancel) {
            return new Confirmation(title, description, ok2, cancel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) other;
            return L.f(this.title, confirmation.title) && L.f(this.description, confirmation.description) && L.f(this.ok, confirmation.ok) && L.f(this.cancel, confirmation.cancel);
        }

        @k
        public final String getCancel() {
            return this.cancel;
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @k
        public final String getOk() {
            return this.ok;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.cancel.hashCode() + H.d(H.d(this.title.hashCode() * 31, 31, this.description), 31, this.ok);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Confirmation(title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", ok=");
            sb2.append(this.ok);
            sb2.append(", cancel=");
            return C22026a.c(sb2, this.cancel, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            parcel.writeString(this.ok);
            parcel.writeString(this.cancel);
        }
    }

    /* compiled from: Action.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Action> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Action createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(Action.class.getClassLoader());
            Confirmation confirmationCreateFromParcel = parcel.readInt() == 0 ? null : Confirmation.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(Action.class.getClassLoader());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string7 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            TitleWithSalary titleWithSalaryCreateFromParcel = parcel.readInt() == 0 ? null : TitleWithSalary.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Action(string, deepLink, confirmationCreateFromParcel, string2, string3, boolValueOf, universalImage, string4, string5, string6, numValueOf, string7, numValueOf2, numValueOf3, titleWithSalaryCreateFromParcel, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Action[] newArray(int i12) {
            return new Action[i12];
        }
    }

    /* compiled from: Action.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/Action$TitleWithSalary;", "Landroid/os/Parcelable;", "", "title", "salaryRange", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/Action$TitleWithSalary;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSalaryRange", "_common_network-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TitleWithSalary implements Parcelable {

        @k
        public static final Parcelable.Creator<TitleWithSalary> CREATOR = new Creator();

        @c("salaryRange")
        @l
        private final String salaryRange;

        @c("title")
        @k
        private final String title;

        /* compiled from: Action.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TitleWithSalary> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TitleWithSalary createFromParcel(@k Parcel parcel) {
                return new TitleWithSalary(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TitleWithSalary[] newArray(int i12) {
                return new TitleWithSalary[i12];
            }
        }

        public TitleWithSalary(@k String str, @l String str2) {
            this.title = str;
            this.salaryRange = str2;
        }

        public static /* synthetic */ TitleWithSalary copy$default(TitleWithSalary titleWithSalary, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = titleWithSalary.title;
            }
            if ((i12 & 2) != 0) {
                str2 = titleWithSalary.salaryRange;
            }
            return titleWithSalary.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getSalaryRange() {
            return this.salaryRange;
        }

        @k
        public final TitleWithSalary copy(@k String title, @l String salaryRange) {
            return new TitleWithSalary(title, salaryRange);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleWithSalary)) {
                return false;
            }
            TitleWithSalary titleWithSalary = (TitleWithSalary) other;
            return L.f(this.title, titleWithSalary.title) && L.f(this.salaryRange, titleWithSalary.salaryRange);
        }

        @l
        public final String getSalaryRange() {
            return this.salaryRange;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.salaryRange;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("TitleWithSalary(title=");
            sb2.append(this.title);
            sb2.append(", salaryRange=");
            return C22026a.c(sb2, this.salaryRange, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.salaryRange);
        }
    }

    public Action(@k String str, @k DeepLink deepLink, @l Confirmation confirmation, @l String str2, @l String str3, @l Boolean bool, @l UniversalImage universalImage, @l String str4, @l String str5, @l String str6, @l Integer num, @l String str7, @l Integer num2, @l Integer num3, @l TitleWithSalary titleWithSalary, @l Boolean bool2) {
        this.title = str;
        this.deepLink = deepLink;
        this.confirmation = confirmation;
        this.type = str2;
        this.rawUri = str3;
        this.closesElement = bool;
        this.image = universalImage;
        this.style = str4;
        this.rubricatorLayout = str5;
        this.titleWithTransfer = str6;
        this.rowLine = num;
        this.backgroundColor = str7;
        this.landscapeRowLine = num2;
        this.landscapePosition = num3;
        this.titleWithSalary = titleWithSalary;
        this.isAllCategoriesItem = bool2;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getTitleWithTransfer() {
        return this.titleWithTransfer;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final Integer getRowLine() {
        return this.rowLine;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final Integer getLandscapeRowLine() {
        return this.landscapeRowLine;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final Integer getLandscapePosition() {
        return this.landscapePosition;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final TitleWithSalary getTitleWithSalary() {
        return this.titleWithSalary;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final Boolean getIsAllCategoriesItem() {
        return this.isAllCategoriesItem;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Confirmation getConfirmation() {
        return this.confirmation;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getRawUri() {
        return this.rawUri;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getClosesElement() {
        return this.closesElement;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getRubricatorLayout() {
        return this.rubricatorLayout;
    }

    @k
    public final Action copy(@k String title, @k DeepLink deepLink, @l Confirmation confirmation, @l String type, @l String rawUri, @l Boolean closesElement, @l UniversalImage image, @l String style, @l String rubricatorLayout, @l String titleWithTransfer, @l Integer rowLine, @l String backgroundColor, @l Integer landscapeRowLine, @l Integer landscapePosition, @l TitleWithSalary titleWithSalary, @l Boolean isAllCategoriesItem) {
        return new Action(title, deepLink, confirmation, type, rawUri, closesElement, image, style, rubricatorLayout, titleWithTransfer, rowLine, backgroundColor, landscapeRowLine, landscapePosition, titleWithSalary, isAllCategoriesItem);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Action)) {
            return false;
        }
        Action action = (Action) other;
        return L.f(this.title, action.title) && L.f(this.deepLink, action.deepLink) && L.f(this.confirmation, action.confirmation) && L.f(this.type, action.type) && L.f(this.rawUri, action.rawUri) && L.f(this.closesElement, action.closesElement) && L.f(this.image, action.image) && L.f(this.style, action.style) && L.f(this.rubricatorLayout, action.rubricatorLayout) && L.f(this.titleWithTransfer, action.titleWithTransfer) && L.f(this.rowLine, action.rowLine) && L.f(this.backgroundColor, action.backgroundColor) && L.f(this.landscapeRowLine, action.landscapeRowLine) && L.f(this.landscapePosition, action.landscapePosition) && L.f(this.titleWithSalary, action.titleWithSalary) && L.f(this.isAllCategoriesItem, action.isAllCategoriesItem);
    }

    @l
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final Boolean getClosesElement() {
        return this.closesElement;
    }

    @l
    public final Confirmation getConfirmation() {
        return this.confirmation;
    }

    @k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final Integer getLandscapePosition() {
        return this.landscapePosition;
    }

    @l
    public final Integer getLandscapeRowLine() {
        return this.landscapeRowLine;
    }

    @l
    public final String getRawUri() {
        return this.rawUri;
    }

    @l
    public final Integer getRowLine() {
        return this.rowLine;
    }

    @l
    public final String getRubricatorLayout() {
        return this.rubricatorLayout;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final TitleWithSalary getTitleWithSalary() {
        return this.titleWithSalary;
    }

    @l
    public final String getTitleWithTransfer() {
        return this.titleWithTransfer;
    }

    @l
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iE2 = a.e(this.deepLink, this.title.hashCode() * 31, 31);
        Confirmation confirmation = this.confirmation;
        int iHashCode = (iE2 + (confirmation == null ? 0 : confirmation.hashCode())) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rawUri;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.closesElement;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str3 = this.style;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rubricatorLayout;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.titleWithTransfer;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.rowLine;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.backgroundColor;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.landscapeRowLine;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.landscapePosition;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        TitleWithSalary titleWithSalary = this.titleWithSalary;
        int iHashCode13 = (iHashCode12 + (titleWithSalary == null ? 0 : titleWithSalary.hashCode())) * 31;
        Boolean bool2 = this.isAllCategoriesItem;
        return iHashCode13 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @l
    public final Boolean isAllCategoriesItem() {
        return this.isAllCategoriesItem;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Action(title=");
        sb2.append(this.title);
        sb2.append(", deepLink=");
        sb2.append(this.deepLink);
        sb2.append(", confirmation=");
        sb2.append(this.confirmation);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", rawUri=");
        sb2.append(this.rawUri);
        sb2.append(", closesElement=");
        sb2.append(this.closesElement);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", rubricatorLayout=");
        sb2.append(this.rubricatorLayout);
        sb2.append(", titleWithTransfer=");
        sb2.append(this.titleWithTransfer);
        sb2.append(", rowLine=");
        sb2.append(this.rowLine);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", landscapeRowLine=");
        sb2.append(this.landscapeRowLine);
        sb2.append(", landscapePosition=");
        sb2.append(this.landscapePosition);
        sb2.append(", titleWithSalary=");
        sb2.append(this.titleWithSalary);
        sb2.append(", isAllCategoriesItem=");
        return C0.g(sb2, this.isAllCategoriesItem, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.deepLink, flags);
        Confirmation confirmation = this.confirmation;
        if (confirmation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            confirmation.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.type);
        parcel.writeString(this.rawUri);
        Boolean bool = this.closesElement;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.style);
        parcel.writeString(this.rubricatorLayout);
        parcel.writeString(this.titleWithTransfer);
        Integer num = this.rowLine;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeString(this.backgroundColor);
        Integer num2 = this.landscapeRowLine;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        Integer num3 = this.landscapePosition;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num3);
        }
        TitleWithSalary titleWithSalary = this.titleWithSalary;
        if (titleWithSalary == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            titleWithSalary.writeToParcel(parcel, flags);
        }
        Boolean bool2 = this.isAllCategoriesItem;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }

    public /* synthetic */ Action(String str, DeepLink deepLink, Confirmation confirmation, String str2, String str3, Boolean bool, UniversalImage universalImage, String str4, String str5, String str6, Integer num, String str7, Integer num2, Integer num3, TitleWithSalary titleWithSalary, Boolean bool2, int i12, C42822w c42822w) {
        this(str, deepLink, (i12 & 4) != 0 ? null : confirmation, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : bool, (i12 & 64) != 0 ? null : universalImage, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? null : str5, (i12 & 512) != 0 ? null : str6, (i12 & 1024) != 0 ? null : num, (i12 & 2048) != 0 ? null : str7, (i12 & 4096) != 0 ? null : num2, (i12 & 8192) != 0 ? null : num3, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : titleWithSalary, (i12 & 32768) != 0 ? null : bool2);
    }
}
