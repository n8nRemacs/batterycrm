package com.avito.android.remote.model.search;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.BeduinV2;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InlineFilters.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/search/TopWidget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/BeduinV2;", "content", "", "marginBottom", "Lcom/avito/android/remote/model/search/TopWidget$Onboarding;", "onboarding", "<init>", "(Lcom/avito/android/remote/model/BeduinV2;Ljava/lang/Integer;Lcom/avito/android/remote/model/search/TopWidget$Onboarding;)V", "component1", "()Lcom/avito/android/remote/model/BeduinV2;", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/avito/android/remote/model/search/TopWidget$Onboarding;", "copy", "(Lcom/avito/android/remote/model/BeduinV2;Ljava/lang/Integer;Lcom/avito/android/remote/model/search/TopWidget$Onboarding;)Lcom/avito/android/remote/model/search/TopWidget;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/BeduinV2;", "getContent", "Ljava/lang/Integer;", "getMarginBottom", "Lcom/avito/android/remote/model/search/TopWidget$Onboarding;", "getOnboarding", "Onboarding", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TopWidget implements Parcelable {

    @k
    public static final Parcelable.Creator<TopWidget> CREATOR = new Creator();

    @c("content")
    @k
    private final BeduinV2 content;

    @c("marginBottom")
    @l
    private final Integer marginBottom;

    @c("onboarding")
    @l
    private final Onboarding onboarding;

    /* compiled from: InlineFilters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TopWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TopWidget createFromParcel(@k Parcel parcel) {
            return new TopWidget(BeduinV2.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Onboarding.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TopWidget[] newArray(int i12) {
            return new TopWidget[i12];
        }
    }

    /* compiled from: InlineFilters.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0001<Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ|\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\"J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b3\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b4\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b7\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b8\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b9\u0010\u0012R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010\u001d¨\u0006="}, d2 = {"Lcom/avito/android/remote/model/search/TopWidget$Onboarding;", "Landroid/os/Parcelable;", "", "priority", "", "title", "text", "buttonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "onceShowId", "onShow", "cornerRadius", "Lcom/avito/android/remote/model/search/TopWidget$Onboarding$Margin;", BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Integer;Lcom/avito/android/remote/model/search/TopWidget$Onboarding$Margin;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component6", "component7", "component8", "component9", "()Lcom/avito/android/remote/model/search/TopWidget$Onboarding$Margin;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Integer;Lcom/avito/android/remote/model/search/TopWidget$Onboarding$Margin;)Lcom/avito/android/remote/model/search/TopWidget$Onboarding;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getPriority", "Ljava/lang/String;", "getTitle", "getText", "getButtonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "getOnceShowId", "getOnShow", "getCornerRadius", "Lcom/avito/android/remote/model/search/TopWidget$Onboarding$Margin;", "getMargin", "Margin", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Onboarding implements Parcelable {

        @k
        public static final Parcelable.Creator<Onboarding> CREATOR = new Creator();

        @c("buttonTitle")
        @l
        private final String buttonTitle;

        @c("cornerRadius")
        @l
        private final Integer cornerRadius;

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN)
        @l
        private final Margin margin;

        @c("onShow")
        @l
        private final DeepLink onShow;

        @c("onceShowId")
        @l
        private final String onceShowId;

        @c("priority")
        @l
        private final Integer priority;

        @c("text")
        @l
        private final String text;

        @c("title")
        @l
        private final String title;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Onboarding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Onboarding createFromParcel(@k Parcel parcel) {
                return new Onboarding(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Onboarding.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(Onboarding.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Margin.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Onboarding[] newArray(int i12) {
                return new Onboarding[i12];
            }
        }

        /* compiled from: InlineFilters.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010\n¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/search/TopWidget$Onboarding$Margin;", "Landroid/os/Parcelable;", "", "top", "bottom", "left", "right", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/remote/model/search/TopWidget$Onboarding$Margin;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getTop", "getBottom", "getLeft", "getRight", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Margin implements Parcelable {

            @k
            public static final Parcelable.Creator<Margin> CREATOR = new Creator();

            @c("bottom")
            @l
            private final Integer bottom;

            @c("left")
            @l
            private final Integer left;

            @c("right")
            @l
            private final Integer right;

            @c("top")
            @l
            private final Integer top;

            /* compiled from: InlineFilters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Margin> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Margin createFromParcel(@k Parcel parcel) {
                    return new Margin(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Margin[] newArray(int i12) {
                    return new Margin[i12];
                }
            }

            public Margin() {
                this(null, null, null, null, 15, null);
            }

            public static /* synthetic */ Margin copy$default(Margin margin, Integer num, Integer num2, Integer num3, Integer num4, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    num = margin.top;
                }
                if ((i12 & 2) != 0) {
                    num2 = margin.bottom;
                }
                if ((i12 & 4) != 0) {
                    num3 = margin.left;
                }
                if ((i12 & 8) != 0) {
                    num4 = margin.right;
                }
                return margin.copy(num, num2, num3, num4);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final Integer getTop() {
                return this.top;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final Integer getBottom() {
                return this.bottom;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final Integer getLeft() {
                return this.left;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final Integer getRight() {
                return this.right;
            }

            @k
            public final Margin copy(@l Integer top, @l Integer bottom, @l Integer left, @l Integer right) {
                return new Margin(top, bottom, left, right);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Margin)) {
                    return false;
                }
                Margin margin = (Margin) other;
                return L.f(this.top, margin.top) && L.f(this.bottom, margin.bottom) && L.f(this.left, margin.left) && L.f(this.right, margin.right);
            }

            @l
            public final Integer getBottom() {
                return this.bottom;
            }

            @l
            public final Integer getLeft() {
                return this.left;
            }

            @l
            public final Integer getRight() {
                return this.right;
            }

            @l
            public final Integer getTop() {
                return this.top;
            }

            public int hashCode() {
                Integer num = this.top;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.bottom;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.left;
                int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.right;
                return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Margin(top=");
                sb2.append(this.top);
                sb2.append(", bottom=");
                sb2.append(this.bottom);
                sb2.append(", left=");
                sb2.append(this.left);
                sb2.append(", right=");
                return s.j(sb2, this.right, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Integer num = this.top;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    a.C(parcel, 1, num);
                }
                Integer num2 = this.bottom;
                if (num2 == null) {
                    parcel.writeInt(0);
                } else {
                    a.C(parcel, 1, num2);
                }
                Integer num3 = this.left;
                if (num3 == null) {
                    parcel.writeInt(0);
                } else {
                    a.C(parcel, 1, num3);
                }
                Integer num4 = this.right;
                if (num4 == null) {
                    parcel.writeInt(0);
                } else {
                    a.C(parcel, 1, num4);
                }
            }

            public Margin(@l Integer num, @l Integer num2, @l Integer num3, @l Integer num4) {
                this.top = num;
                this.bottom = num2;
                this.left = num3;
                this.right = num4;
            }

            public /* synthetic */ Margin(Integer num, Integer num2, Integer num3, Integer num4, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2, (i12 & 4) != 0 ? null : num3, (i12 & 8) != 0 ? null : num4);
            }
        }

        public Onboarding() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Integer getPriority() {
            return this.priority;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getOnceShowId() {
            return this.onceShowId;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final DeepLink getOnShow() {
            return this.onShow;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final Margin getMargin() {
            return this.margin;
        }

        @k
        public final Onboarding copy(@l Integer priority, @l String title, @l String text, @l String buttonTitle, @l DeepLink deeplink, @l String onceShowId, @l DeepLink onShow, @l Integer cornerRadius, @l Margin margin) {
            return new Onboarding(priority, title, text, buttonTitle, deeplink, onceShowId, onShow, cornerRadius, margin);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Onboarding)) {
                return false;
            }
            Onboarding onboarding = (Onboarding) other;
            return L.f(this.priority, onboarding.priority) && L.f(this.title, onboarding.title) && L.f(this.text, onboarding.text) && L.f(this.buttonTitle, onboarding.buttonTitle) && L.f(this.deeplink, onboarding.deeplink) && L.f(this.onceShowId, onboarding.onceShowId) && L.f(this.onShow, onboarding.onShow) && L.f(this.cornerRadius, onboarding.cornerRadius) && L.f(this.margin, onboarding.margin);
        }

        @l
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final Margin getMargin() {
            return this.margin;
        }

        @l
        public final DeepLink getOnShow() {
            return this.onShow;
        }

        @l
        public final String getOnceShowId() {
            return this.onceShowId;
        }

        @l
        public final Integer getPriority() {
            return this.priority;
        }

        @l
        public final String getText() {
            return this.text;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Integer num = this.priority;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.text;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.buttonTitle;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            DeepLink deepLink = this.deeplink;
            int iHashCode5 = (iHashCode4 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            String str4 = this.onceShowId;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            DeepLink deepLink2 = this.onShow;
            int iHashCode7 = (iHashCode6 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
            Integer num2 = this.cornerRadius;
            int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Margin margin = this.margin;
            return iHashCode8 + (margin != null ? margin.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Onboarding(priority=" + this.priority + ", title=" + this.title + ", text=" + this.text + ", buttonTitle=" + this.buttonTitle + ", deeplink=" + this.deeplink + ", onceShowId=" + this.onceShowId + ", onShow=" + this.onShow + ", cornerRadius=" + this.cornerRadius + ", margin=" + this.margin + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Integer num = this.priority;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            parcel.writeString(this.title);
            parcel.writeString(this.text);
            parcel.writeString(this.buttonTitle);
            parcel.writeParcelable(this.deeplink, flags);
            parcel.writeString(this.onceShowId);
            parcel.writeParcelable(this.onShow, flags);
            Integer num2 = this.cornerRadius;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num2);
            }
            Margin margin = this.margin;
            if (margin == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                margin.writeToParcel(parcel, flags);
            }
        }

        public Onboarding(@l Integer num, @l String str, @l String str2, @l String str3, @l DeepLink deepLink, @l String str4, @l DeepLink deepLink2, @l Integer num2, @l Margin margin) {
            this.priority = num;
            this.title = str;
            this.text = str2;
            this.buttonTitle = str3;
            this.deeplink = deepLink;
            this.onceShowId = str4;
            this.onShow = deepLink2;
            this.cornerRadius = num2;
            this.margin = margin;
        }

        public /* synthetic */ Onboarding(Integer num, String str, String str2, String str3, DeepLink deepLink, String str4, DeepLink deepLink2, Integer num2, Margin margin, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : deepLink, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : deepLink2, (i12 & 128) != 0 ? null : num2, (i12 & 256) == 0 ? margin : null);
        }
    }

    public TopWidget(@k BeduinV2 beduinV2, @l Integer num, @l Onboarding onboarding) {
        this.content = beduinV2;
        this.marginBottom = num;
        this.onboarding = onboarding;
    }

    public static /* synthetic */ TopWidget copy$default(TopWidget topWidget, BeduinV2 beduinV2, Integer num, Onboarding onboarding, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            beduinV2 = topWidget.content;
        }
        if ((i12 & 2) != 0) {
            num = topWidget.marginBottom;
        }
        if ((i12 & 4) != 0) {
            onboarding = topWidget.onboarding;
        }
        return topWidget.copy(beduinV2, num, onboarding);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final BeduinV2 getContent() {
        return this.content;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getMarginBottom() {
        return this.marginBottom;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    @k
    public final TopWidget copy(@k BeduinV2 content, @l Integer marginBottom, @l Onboarding onboarding) {
        return new TopWidget(content, marginBottom, onboarding);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopWidget)) {
            return false;
        }
        TopWidget topWidget = (TopWidget) other;
        return L.f(this.content, topWidget.content) && L.f(this.marginBottom, topWidget.marginBottom) && L.f(this.onboarding, topWidget.onboarding);
    }

    @k
    public final BeduinV2 getContent() {
        return this.content;
    }

    @l
    public final Integer getMarginBottom() {
        return this.marginBottom;
    }

    @l
    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    public int hashCode() {
        int iHashCode = this.content.hashCode() * 31;
        Integer num = this.marginBottom;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Onboarding onboarding = this.onboarding;
        return iHashCode2 + (onboarding != null ? onboarding.hashCode() : 0);
    }

    @k
    public String toString() {
        return "TopWidget(content=" + this.content + ", marginBottom=" + this.marginBottom + ", onboarding=" + this.onboarding + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.content.writeToParcel(parcel, flags);
        Integer num = this.marginBottom;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Onboarding onboarding = this.onboarding;
        if (onboarding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onboarding.writeToParcel(parcel, flags);
        }
    }
}
