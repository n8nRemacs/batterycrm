package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BxContentBusiness360.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002$%B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/BxContentBusiness360;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/BxContentBusiness360$Toast;", "toast", "Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain;", "replaceMain", "<init>", "(Lcom/avito/android/remote/model/BxContentBusiness360$Toast;Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain;)V", "component1", "()Lcom/avito/android/remote/model/BxContentBusiness360$Toast;", "component2", "()Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain;", "copy", "(Lcom/avito/android/remote/model/BxContentBusiness360$Toast;Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain;)Lcom/avito/android/remote/model/BxContentBusiness360;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/BxContentBusiness360$Toast;", "getToast", "Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain;", "getReplaceMain", "ReplaceMain", "Toast", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BxContentBusiness360 implements Parcelable {

    @k
    public static final Parcelable.Creator<BxContentBusiness360> CREATOR = new Creator();

    @c("replaceMain")
    @l
    private final ReplaceMain replaceMain;

    @c("toast")
    @l
    private final Toast toast;

    /* compiled from: BxContentBusiness360.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BxContentBusiness360> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BxContentBusiness360 createFromParcel(@k Parcel parcel) {
            return new BxContentBusiness360(parcel.readInt() == 0 ? null : Toast.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ReplaceMain.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BxContentBusiness360[] newArray(int i12) {
            return new BxContentBusiness360[i12];
        }
    }

    /* compiled from: BxContentBusiness360.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002$%B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding;", "onboarding", "Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$ToastReplaceMain;", "toast", "<init>", "(Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding;Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$ToastReplaceMain;)V", "component1", "()Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding;", "component2", "()Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$ToastReplaceMain;", "copy", "(Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding;Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$ToastReplaceMain;)Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding;", "getOnboarding", "Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$ToastReplaceMain;", "getToast", "Onboarding", "ToastReplaceMain", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ReplaceMain implements Parcelable {

        @k
        public static final Parcelable.Creator<ReplaceMain> CREATOR = new Creator();

        @c("onboarding")
        @l
        private final Onboarding onboarding;

        @c("toast")
        @l
        private final ToastReplaceMain toast;

        /* compiled from: BxContentBusiness360.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ReplaceMain> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ReplaceMain createFromParcel(@k Parcel parcel) {
                return new ReplaceMain(parcel.readInt() == 0 ? null : Onboarding.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ToastReplaceMain.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ReplaceMain[] newArray(int i12) {
                return new ReplaceMain[i12];
            }
        }

        /* compiled from: BxContentBusiness360.kt */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0002;<BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ`\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010\u001bJ \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u0019R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\u001bR\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b9\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b:\u0010\u001b¨\u0006="}, d2 = {"Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding$ConfirmButton;", "confirmButton", "Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding$CancelButton;", "cancelButton", "", "showId", "", "showCount", "priority", "showDelayMs", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding$ConfirmButton;Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding$CancelButton;Ljava/lang/String;III)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding$ConfirmButton;", "component4", "()Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding$CancelButton;", "component5", "()Ljava/lang/String;", "component6", "()I", "component7", "component8", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding$ConfirmButton;Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding$CancelButton;Ljava/lang/String;III)Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding$ConfirmButton;", "getConfirmButton", "Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding$CancelButton;", "getCancelButton", "Ljava/lang/String;", "getShowId", "I", "getShowCount", "getPriority", "getShowDelayMs", "CancelButton", "ConfirmButton", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Onboarding implements Parcelable {

            @k
            public static final Parcelable.Creator<Onboarding> CREATOR = new Creator();

            @c("cancelButton")
            @k
            private final CancelButton cancelButton;

            @c("confirmButton")
            @k
            private final ConfirmButton confirmButton;

            @c("priority")
            private final int priority;

            @c("showCount")
            private final int showCount;

            @c("showDelayMs")
            private final int showDelayMs;

            @c("showId")
            @k
            private final String showId;

            @c("subtitle")
            @k
            private final AttributedText subtitle;

            @c("title")
            @k
            private final AttributedText title;

            /* compiled from: BxContentBusiness360.kt */
            @d
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding$CancelButton;", "Landroid/os/Parcelable;", "", "text", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding$CancelButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class CancelButton implements Parcelable {

                @k
                public static final Parcelable.Creator<CancelButton> CREATOR = new Creator();

                @c("text")
                @k
                private final String text;

                /* compiled from: BxContentBusiness360.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<CancelButton> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final CancelButton createFromParcel(@k Parcel parcel) {
                        return new CancelButton(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final CancelButton[] newArray(int i12) {
                        return new CancelButton[i12];
                    }
                }

                public CancelButton(@k String str) {
                    this.text = str;
                }

                public static /* synthetic */ CancelButton copy$default(CancelButton cancelButton, String str, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = cancelButton.text;
                    }
                    return cancelButton.copy(str);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                @k
                public final CancelButton copy(@k String text) {
                    return new CancelButton(text);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof CancelButton) && L.f(this.text, ((CancelButton) other).text);
                }

                @k
                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                @k
                public String toString() {
                    return C22026a.c(new StringBuilder("CancelButton(text="), this.text, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.text);
                }
            }

            /* compiled from: BxContentBusiness360.kt */
            @d
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding$ConfirmButton;", "Landroid/os/Parcelable;", "", "text", "clearShowId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$Onboarding$ConfirmButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getClearShowId", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class ConfirmButton implements Parcelable {

                @k
                public static final Parcelable.Creator<ConfirmButton> CREATOR = new Creator();

                @c("clearShowId")
                @k
                private final String clearShowId;

                @c("text")
                @k
                private final String text;

                /* compiled from: BxContentBusiness360.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ConfirmButton> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ConfirmButton createFromParcel(@k Parcel parcel) {
                        return new ConfirmButton(parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ConfirmButton[] newArray(int i12) {
                        return new ConfirmButton[i12];
                    }
                }

                public ConfirmButton(@k String str, @k String str2) {
                    this.text = str;
                    this.clearShowId = str2;
                }

                public static /* synthetic */ ConfirmButton copy$default(ConfirmButton confirmButton, String str, String str2, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = confirmButton.text;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = confirmButton.clearShowId;
                    }
                    return confirmButton.copy(str, str2);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final String getClearShowId() {
                    return this.clearShowId;
                }

                @k
                public final ConfirmButton copy(@k String text, @k String clearShowId) {
                    return new ConfirmButton(text, clearShowId);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ConfirmButton)) {
                        return false;
                    }
                    ConfirmButton confirmButton = (ConfirmButton) other;
                    return L.f(this.text, confirmButton.text) && L.f(this.clearShowId, confirmButton.clearShowId);
                }

                @k
                public final String getClearShowId() {
                    return this.clearShowId;
                }

                @k
                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.clearShowId.hashCode() + (this.text.hashCode() * 31);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("ConfirmButton(text=");
                    sb2.append(this.text);
                    sb2.append(", clearShowId=");
                    return C22026a.c(sb2, this.clearShowId, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.text);
                    parcel.writeString(this.clearShowId);
                }
            }

            /* compiled from: BxContentBusiness360.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Onboarding> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Onboarding createFromParcel(@k Parcel parcel) {
                    return new Onboarding((AttributedText) parcel.readParcelable(Onboarding.class.getClassLoader()), (AttributedText) parcel.readParcelable(Onboarding.class.getClassLoader()), ConfirmButton.CREATOR.createFromParcel(parcel), CancelButton.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Onboarding[] newArray(int i12) {
                    return new Onboarding[i12];
                }
            }

            public Onboarding(@k AttributedText attributedText, @k AttributedText attributedText2, @k ConfirmButton confirmButton, @k CancelButton cancelButton, @k String str, int i12, int i13, int i14) {
                this.title = attributedText;
                this.subtitle = attributedText2;
                this.confirmButton = confirmButton;
                this.cancelButton = cancelButton;
                this.showId = str;
                this.showCount = i12;
                this.priority = i13;
                this.showDelayMs = i14;
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final AttributedText getTitle() {
                return this.title;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final AttributedText getSubtitle() {
                return this.subtitle;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final ConfirmButton getConfirmButton() {
                return this.confirmButton;
            }

            @k
            /* renamed from: component4, reason: from getter */
            public final CancelButton getCancelButton() {
                return this.cancelButton;
            }

            @k
            /* renamed from: component5, reason: from getter */
            public final String getShowId() {
                return this.showId;
            }

            /* renamed from: component6, reason: from getter */
            public final int getShowCount() {
                return this.showCount;
            }

            /* renamed from: component7, reason: from getter */
            public final int getPriority() {
                return this.priority;
            }

            /* renamed from: component8, reason: from getter */
            public final int getShowDelayMs() {
                return this.showDelayMs;
            }

            @k
            public final Onboarding copy(@k AttributedText title, @k AttributedText subtitle, @k ConfirmButton confirmButton, @k CancelButton cancelButton, @k String showId, int showCount, int priority, int showDelayMs) {
                return new Onboarding(title, subtitle, confirmButton, cancelButton, showId, showCount, priority, showDelayMs);
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
                return L.f(this.title, onboarding.title) && L.f(this.subtitle, onboarding.subtitle) && L.f(this.confirmButton, onboarding.confirmButton) && L.f(this.cancelButton, onboarding.cancelButton) && L.f(this.showId, onboarding.showId) && this.showCount == onboarding.showCount && this.priority == onboarding.priority && this.showDelayMs == onboarding.showDelayMs;
            }

            @k
            public final CancelButton getCancelButton() {
                return this.cancelButton;
            }

            @k
            public final ConfirmButton getConfirmButton() {
                return this.confirmButton;
            }

            public final int getPriority() {
                return this.priority;
            }

            public final int getShowCount() {
                return this.showCount;
            }

            public final int getShowDelayMs() {
                return this.showDelayMs;
            }

            @k
            public final String getShowId() {
                return this.showId;
            }

            @k
            public final AttributedText getSubtitle() {
                return this.subtitle;
            }

            @k
            public final AttributedText getTitle() {
                return this.title;
            }

            public int hashCode() {
                return Integer.hashCode(this.showDelayMs) + r.e(this.priority, r.e(this.showCount, H.d((this.cancelButton.hashCode() + ((this.confirmButton.hashCode() + a.b(this.title.hashCode() * 31, 31, this.subtitle)) * 31)) * 31, 31, this.showId), 31), 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Onboarding(title=");
                sb2.append(this.title);
                sb2.append(", subtitle=");
                sb2.append(this.subtitle);
                sb2.append(", confirmButton=");
                sb2.append(this.confirmButton);
                sb2.append(", cancelButton=");
                sb2.append(this.cancelButton);
                sb2.append(", showId=");
                sb2.append(this.showId);
                sb2.append(", showCount=");
                sb2.append(this.showCount);
                sb2.append(", priority=");
                sb2.append(this.priority);
                sb2.append(", showDelayMs=");
                return r.t(sb2, this.showDelayMs, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.title, flags);
                parcel.writeParcelable(this.subtitle, flags);
                this.confirmButton.writeToParcel(parcel, flags);
                this.cancelButton.writeToParcel(parcel, flags);
                parcel.writeString(this.showId);
                parcel.writeInt(this.showCount);
                parcel.writeInt(this.priority);
                parcel.writeInt(this.showDelayMs);
            }
        }

        /* compiled from: BxContentBusiness360.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0013J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b-\u0010\u0013R\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b.\u0010\u0013¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$ToastReplaceMain;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$ToastReplaceMain$Button;", "button", "showId", "", "showCount", "showDelayMs", "priority", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$ToastReplaceMain$Button;Ljava/lang/String;III)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$ToastReplaceMain$Button;", "component3", "component4", "()I", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$ToastReplaceMain$Button;Ljava/lang/String;III)Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$ToastReplaceMain;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$ToastReplaceMain$Button;", "getButton", "getShowId", "I", "getShowCount", "getShowDelayMs", "getPriority", "Button", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class ToastReplaceMain implements Parcelable {

            @k
            public static final Parcelable.Creator<ToastReplaceMain> CREATOR = new Creator();

            @c("button")
            @k
            private final Button button;

            @c("priority")
            private final int priority;

            @c("showCount")
            private final int showCount;

            @c("showDelayMs")
            private final int showDelayMs;

            @c("showId")
            @k
            private final String showId;

            @c("text")
            @k
            private final String text;

            /* compiled from: BxContentBusiness360.kt */
            @d
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$ToastReplaceMain$Button;", "Landroid/os/Parcelable;", "", "text", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/BxContentBusiness360$ReplaceMain$ToastReplaceMain$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Button implements Parcelable {

                @k
                public static final Parcelable.Creator<Button> CREATOR = new Creator();

                @c("text")
                @k
                private final String text;

                /* compiled from: BxContentBusiness360.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Button> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Button createFromParcel(@k Parcel parcel) {
                        return new Button(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Button[] newArray(int i12) {
                        return new Button[i12];
                    }
                }

                public Button(@k String str) {
                    this.text = str;
                }

                public static /* synthetic */ Button copy$default(Button button, String str, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = button.text;
                    }
                    return button.copy(str);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                @k
                public final Button copy(@k String text) {
                    return new Button(text);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Button) && L.f(this.text, ((Button) other).text);
                }

                @k
                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                @k
                public String toString() {
                    return C22026a.c(new StringBuilder("Button(text="), this.text, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.text);
                }
            }

            /* compiled from: BxContentBusiness360.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ToastReplaceMain> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ToastReplaceMain createFromParcel(@k Parcel parcel) {
                    return new ToastReplaceMain(parcel.readString(), Button.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ToastReplaceMain[] newArray(int i12) {
                    return new ToastReplaceMain[i12];
                }
            }

            public ToastReplaceMain(@k String str, @k Button button, @k String str2, int i12, int i13, int i14) {
                this.text = str;
                this.button = button;
                this.showId = str2;
                this.showCount = i12;
                this.showDelayMs = i13;
                this.priority = i14;
            }

            public static /* synthetic */ ToastReplaceMain copy$default(ToastReplaceMain toastReplaceMain, String str, Button button, String str2, int i12, int i13, int i14, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    str = toastReplaceMain.text;
                }
                if ((i15 & 2) != 0) {
                    button = toastReplaceMain.button;
                }
                Button button2 = button;
                if ((i15 & 4) != 0) {
                    str2 = toastReplaceMain.showId;
                }
                String str3 = str2;
                if ((i15 & 8) != 0) {
                    i12 = toastReplaceMain.showCount;
                }
                int i16 = i12;
                if ((i15 & 16) != 0) {
                    i13 = toastReplaceMain.showDelayMs;
                }
                int i17 = i13;
                if ((i15 & 32) != 0) {
                    i14 = toastReplaceMain.priority;
                }
                return toastReplaceMain.copy(str, button2, str3, i16, i17, i14);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final Button getButton() {
                return this.button;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final String getShowId() {
                return this.showId;
            }

            /* renamed from: component4, reason: from getter */
            public final int getShowCount() {
                return this.showCount;
            }

            /* renamed from: component5, reason: from getter */
            public final int getShowDelayMs() {
                return this.showDelayMs;
            }

            /* renamed from: component6, reason: from getter */
            public final int getPriority() {
                return this.priority;
            }

            @k
            public final ToastReplaceMain copy(@k String text, @k Button button, @k String showId, int showCount, int showDelayMs, int priority) {
                return new ToastReplaceMain(text, button, showId, showCount, showDelayMs, priority);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ToastReplaceMain)) {
                    return false;
                }
                ToastReplaceMain toastReplaceMain = (ToastReplaceMain) other;
                return L.f(this.text, toastReplaceMain.text) && L.f(this.button, toastReplaceMain.button) && L.f(this.showId, toastReplaceMain.showId) && this.showCount == toastReplaceMain.showCount && this.showDelayMs == toastReplaceMain.showDelayMs && this.priority == toastReplaceMain.priority;
            }

            @k
            public final Button getButton() {
                return this.button;
            }

            public final int getPriority() {
                return this.priority;
            }

            public final int getShowCount() {
                return this.showCount;
            }

            public final int getShowDelayMs() {
                return this.showDelayMs;
            }

            @k
            public final String getShowId() {
                return this.showId;
            }

            @k
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return Integer.hashCode(this.priority) + r.e(this.showDelayMs, r.e(this.showCount, H.d((this.button.hashCode() + (this.text.hashCode() * 31)) * 31, 31, this.showId), 31), 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ToastReplaceMain(text=");
                sb2.append(this.text);
                sb2.append(", button=");
                sb2.append(this.button);
                sb2.append(", showId=");
                sb2.append(this.showId);
                sb2.append(", showCount=");
                sb2.append(this.showCount);
                sb2.append(", showDelayMs=");
                sb2.append(this.showDelayMs);
                sb2.append(", priority=");
                return r.t(sb2, this.priority, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.text);
                this.button.writeToParcel(parcel, flags);
                parcel.writeString(this.showId);
                parcel.writeInt(this.showCount);
                parcel.writeInt(this.showDelayMs);
                parcel.writeInt(this.priority);
            }
        }

        public ReplaceMain(@l Onboarding onboarding, @l ToastReplaceMain toastReplaceMain) {
            this.onboarding = onboarding;
            this.toast = toastReplaceMain;
        }

        public static /* synthetic */ ReplaceMain copy$default(ReplaceMain replaceMain, Onboarding onboarding, ToastReplaceMain toastReplaceMain, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                onboarding = replaceMain.onboarding;
            }
            if ((i12 & 2) != 0) {
                toastReplaceMain = replaceMain.toast;
            }
            return replaceMain.copy(onboarding, toastReplaceMain);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Onboarding getOnboarding() {
            return this.onboarding;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final ToastReplaceMain getToast() {
            return this.toast;
        }

        @k
        public final ReplaceMain copy(@l Onboarding onboarding, @l ToastReplaceMain toast) {
            return new ReplaceMain(onboarding, toast);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReplaceMain)) {
                return false;
            }
            ReplaceMain replaceMain = (ReplaceMain) other;
            return L.f(this.onboarding, replaceMain.onboarding) && L.f(this.toast, replaceMain.toast);
        }

        @l
        public final Onboarding getOnboarding() {
            return this.onboarding;
        }

        @l
        public final ToastReplaceMain getToast() {
            return this.toast;
        }

        public int hashCode() {
            Onboarding onboarding = this.onboarding;
            int iHashCode = (onboarding == null ? 0 : onboarding.hashCode()) * 31;
            ToastReplaceMain toastReplaceMain = this.toast;
            return iHashCode + (toastReplaceMain != null ? toastReplaceMain.hashCode() : 0);
        }

        @k
        public String toString() {
            return "ReplaceMain(onboarding=" + this.onboarding + ", toast=" + this.toast + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Onboarding onboarding = this.onboarding;
            if (onboarding == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                onboarding.writeToParcel(parcel, flags);
            }
            ToastReplaceMain toastReplaceMain = this.toast;
            if (toastReplaceMain == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                toastReplaceMain.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: BxContentBusiness360.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\u000eR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0014R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b.\u0010\u0014¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/BxContentBusiness360$Toast;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/BxContentBusiness360$Toast$ToastButton;", "button", "showId", "", "showCount", "showDelayMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/BxContentBusiness360$Toast$ToastButton;Ljava/lang/String;II)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/BxContentBusiness360$Toast$ToastButton;", "component4", "component5", "()I", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/BxContentBusiness360$Toast$ToastButton;Ljava/lang/String;II)Lcom/avito/android/remote/model/BxContentBusiness360$Toast;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/BxContentBusiness360$Toast$ToastButton;", "getButton", "getShowId", "I", "getShowCount", "getShowDelayMs", "ToastButton", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Toast implements Parcelable {

        @k
        public static final Parcelable.Creator<Toast> CREATOR = new Creator();

        @c("button")
        @k
        private final ToastButton button;

        @c("showCount")
        private final int showCount;

        @c("showDelayMs")
        private final int showDelayMs;

        @c("showId")
        @k
        private final String showId;

        @c("subtitle")
        @k
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: BxContentBusiness360.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Toast> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Toast createFromParcel(@k Parcel parcel) {
                return new Toast(parcel.readString(), parcel.readString(), ToastButton.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Toast[] newArray(int i12) {
                return new Toast[i12];
            }
        }

        /* compiled from: BxContentBusiness360.kt */
        @d
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/BxContentBusiness360$Toast$ToastButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "onClick", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/BxContentBusiness360$Toast$ToastButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnClick", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ToastButton implements Parcelable {

            @k
            public static final Parcelable.Creator<ToastButton> CREATOR = new Creator();

            @c("onClick")
            @l
            private final DeepLink onClick;

            @c("title")
            @k
            private final String title;

            /* compiled from: BxContentBusiness360.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ToastButton> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ToastButton createFromParcel(@k Parcel parcel) {
                    return new ToastButton(parcel.readString(), (DeepLink) parcel.readParcelable(ToastButton.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ToastButton[] newArray(int i12) {
                    return new ToastButton[i12];
                }
            }

            public ToastButton(@k String str, @l DeepLink deepLink) {
                this.title = str;
                this.onClick = deepLink;
            }

            public static /* synthetic */ ToastButton copy$default(ToastButton toastButton, String str, DeepLink deepLink, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = toastButton.title;
                }
                if ((i12 & 2) != 0) {
                    deepLink = toastButton.onClick;
                }
                return toastButton.copy(str, deepLink);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final DeepLink getOnClick() {
                return this.onClick;
            }

            @k
            public final ToastButton copy(@k String title, @l DeepLink onClick) {
                return new ToastButton(title, onClick);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ToastButton)) {
                    return false;
                }
                ToastButton toastButton = (ToastButton) other;
                return L.f(this.title, toastButton.title) && L.f(this.onClick, toastButton.onClick);
            }

            @l
            public final DeepLink getOnClick() {
                return this.onClick;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                DeepLink deepLink = this.onClick;
                return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ToastButton(title=");
                sb2.append(this.title);
                sb2.append(", onClick=");
                return a.v(sb2, this.onClick, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeParcelable(this.onClick, flags);
            }
        }

        public Toast(@k String str, @k String str2, @k ToastButton toastButton, @k String str3, int i12, int i13) {
            this.title = str;
            this.subtitle = str2;
            this.button = toastButton;
            this.showId = str3;
            this.showCount = i12;
            this.showDelayMs = i13;
        }

        public static /* synthetic */ Toast copy$default(Toast toast, String str, String str2, ToastButton toastButton, String str3, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = toast.title;
            }
            if ((i14 & 2) != 0) {
                str2 = toast.subtitle;
            }
            String str4 = str2;
            if ((i14 & 4) != 0) {
                toastButton = toast.button;
            }
            ToastButton toastButton2 = toastButton;
            if ((i14 & 8) != 0) {
                str3 = toast.showId;
            }
            String str5 = str3;
            if ((i14 & 16) != 0) {
                i12 = toast.showCount;
            }
            int i15 = i12;
            if ((i14 & 32) != 0) {
                i13 = toast.showDelayMs;
            }
            return toast.copy(str, str4, toastButton2, str5, i15, i13);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final ToastButton getButton() {
            return this.button;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getShowId() {
            return this.showId;
        }

        /* renamed from: component5, reason: from getter */
        public final int getShowCount() {
            return this.showCount;
        }

        /* renamed from: component6, reason: from getter */
        public final int getShowDelayMs() {
            return this.showDelayMs;
        }

        @k
        public final Toast copy(@k String title, @k String subtitle, @k ToastButton button, @k String showId, int showCount, int showDelayMs) {
            return new Toast(title, subtitle, button, showId, showCount, showDelayMs);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Toast)) {
                return false;
            }
            Toast toast = (Toast) other;
            return L.f(this.title, toast.title) && L.f(this.subtitle, toast.subtitle) && L.f(this.button, toast.button) && L.f(this.showId, toast.showId) && this.showCount == toast.showCount && this.showDelayMs == toast.showDelayMs;
        }

        @k
        public final ToastButton getButton() {
            return this.button;
        }

        public final int getShowCount() {
            return this.showCount;
        }

        public final int getShowDelayMs() {
            return this.showDelayMs;
        }

        @k
        public final String getShowId() {
            return this.showId;
        }

        @k
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.showDelayMs) + r.e(this.showCount, H.d((this.button.hashCode() + H.d(this.title.hashCode() * 31, 31, this.subtitle)) * 31, 31, this.showId), 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Toast(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", button=");
            sb2.append(this.button);
            sb2.append(", showId=");
            sb2.append(this.showId);
            sb2.append(", showCount=");
            sb2.append(this.showCount);
            sb2.append(", showDelayMs=");
            return r.t(sb2, this.showDelayMs, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            this.button.writeToParcel(parcel, flags);
            parcel.writeString(this.showId);
            parcel.writeInt(this.showCount);
            parcel.writeInt(this.showDelayMs);
        }
    }

    public BxContentBusiness360(@l Toast toast, @l ReplaceMain replaceMain) {
        this.toast = toast;
        this.replaceMain = replaceMain;
    }

    public static /* synthetic */ BxContentBusiness360 copy$default(BxContentBusiness360 bxContentBusiness360, Toast toast, ReplaceMain replaceMain, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            toast = bxContentBusiness360.toast;
        }
        if ((i12 & 2) != 0) {
            replaceMain = bxContentBusiness360.replaceMain;
        }
        return bxContentBusiness360.copy(toast, replaceMain);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Toast getToast() {
        return this.toast;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final ReplaceMain getReplaceMain() {
        return this.replaceMain;
    }

    @k
    public final BxContentBusiness360 copy(@l Toast toast, @l ReplaceMain replaceMain) {
        return new BxContentBusiness360(toast, replaceMain);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BxContentBusiness360)) {
            return false;
        }
        BxContentBusiness360 bxContentBusiness360 = (BxContentBusiness360) other;
        return L.f(this.toast, bxContentBusiness360.toast) && L.f(this.replaceMain, bxContentBusiness360.replaceMain);
    }

    @l
    public final ReplaceMain getReplaceMain() {
        return this.replaceMain;
    }

    @l
    public final Toast getToast() {
        return this.toast;
    }

    public int hashCode() {
        Toast toast = this.toast;
        int iHashCode = (toast == null ? 0 : toast.hashCode()) * 31;
        ReplaceMain replaceMain = this.replaceMain;
        return iHashCode + (replaceMain != null ? replaceMain.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BxContentBusiness360(toast=" + this.toast + ", replaceMain=" + this.replaceMain + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Toast toast = this.toast;
        if (toast == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            toast.writeToParcel(parcel, flags);
        }
        ReplaceMain replaceMain = this.replaceMain;
        if (replaceMain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            replaceMain.writeToParcel(parcel, flags);
        }
    }
}
