package com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiImage;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacFinishedFallbackScreenArgument.kt */
@d
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u001f\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0012\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b.\u0010$J\u0012\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b/\u0010$J\u0012\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b0\u0010&J\u0012\u00101\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b3\u00102J\u0012\u00104\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b4\u00102J\u0012\u00105\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b7\u0010,J\u0012\u00108\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b8\u00102Jâ\u0001\u00109\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010 J\u0010\u0010=\u001a\u00020<HÖ\u0001¢\u0006\u0004\b=\u0010>J\u001a\u0010A\u001a\u00020\u00052\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020<HÖ\u0001¢\u0006\u0004\bC\u0010>J \u0010H\u001a\u00020G2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020<HÖ\u0001¢\u0006\u0004\bH\u0010IR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010J\u001a\u0004\bK\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010L\u001a\u0004\b\u0006\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010M\u001a\u0004\bN\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010O\u001a\u0004\bP\u0010&R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\bQ\u0010 R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bR\u0010 R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010S\u001a\u0004\bT\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010U\u001a\u0004\bV\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bW\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\bX\u0010$R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010M\u001a\u0004\bY\u0010$R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010O\u001a\u0004\bZ\u0010&R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\b\\\u00102R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010[\u001a\u0004\b]\u00102R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0018\u0010[\u001a\u0004\b^\u00102R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010_\u001a\u0004\b`\u00106R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010U\u001a\u0004\ba\u0010,R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u001c\u0010[\u001a\u0004\bb\u00102¨\u0006c"}, d2 = {"Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/IacFinishedFallbackScreenArgument;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "", "isVideo", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "peerName", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;", "peerAvatar", "scenario", "status", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "direction", "", "duration", "itemId", "itemTitle", "itemPrice", "itemImage", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "gsmLink", "iacLink", "messengerLink", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/AutomaticGsmClickSource;", "automaticGsmClickSource", "closingActionTimeoutSec", "closingActionInterceptorLink", "<init>", "(Ljava/lang/String;ZLcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;Ljava/lang/Long;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/AutomaticGsmClickSource;Ljava/lang/Long;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "component4", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;", "component5", "component6", "component7", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "component8", "()Ljava/lang/Long;", "component9", "component10", "component11", "component12", "component13", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "component14", "component15", "component16", "()Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/AutomaticGsmClickSource;", "component17", "component18", "copy", "(Ljava/lang/String;ZLcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;Ljava/lang/Long;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/AutomaticGsmClickSource;Ljava/lang/Long;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;)Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/IacFinishedFallbackScreenArgument;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCallId", "Z", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "getPeerName", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;", "getPeerAvatar", "getScenario", "getStatus", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "getDirection", "Ljava/lang/Long;", "getDuration", "getItemId", "getItemTitle", "getItemPrice", "getItemImage", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "getGsmLink", "getIacLink", "getMessengerLink", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/AutomaticGsmClickSource;", "getAutomaticGsmClickSource", "getClosingActionTimeoutSec", "getClosingActionInterceptorLink", "_avito_iac-dialer-finished_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacFinishedFallbackScreenArgument implements Parcelable {

    @k
    public static final Parcelable.Creator<IacFinishedFallbackScreenArgument> CREATOR = new a();

    @l
    private final AutomaticGsmClickSource automaticGsmClickSource;

    @k
    private final String callId;

    @l
    private final IacPiiDeepLink closingActionInterceptorLink;

    @l
    private final Long closingActionTimeoutSec;

    @k
    private final IacCallDirection direction;

    @l
    private final Long duration;

    @l
    private final IacPiiDeepLink gsmLink;

    @l
    private final IacPiiDeepLink iacLink;
    private final boolean isVideo;

    @l
    private final String itemId;

    @l
    private final IacPiiImage itemImage;

    @l
    private final IacPiiString itemPrice;

    @l
    private final IacPiiString itemTitle;

    @l
    private final IacPiiDeepLink messengerLink;

    @l
    private final IacPiiImage peerAvatar;

    @l
    private final IacPiiString peerName;

    @k
    private final String scenario;

    @k
    private final String status;

    /* compiled from: IacFinishedFallbackScreenArgument.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacFinishedFallbackScreenArgument> {
        @Override // android.os.Parcelable.Creator
        public final IacFinishedFallbackScreenArgument createFromParcel(Parcel parcel) {
            return new IacFinishedFallbackScreenArgument(parcel.readString(), parcel.readInt() != 0, (IacPiiString) parcel.readParcelable(IacFinishedFallbackScreenArgument.class.getClassLoader()), (IacPiiImage) parcel.readParcelable(IacFinishedFallbackScreenArgument.class.getClassLoader()), parcel.readString(), parcel.readString(), IacCallDirection.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (IacPiiString) parcel.readParcelable(IacFinishedFallbackScreenArgument.class.getClassLoader()), (IacPiiString) parcel.readParcelable(IacFinishedFallbackScreenArgument.class.getClassLoader()), (IacPiiImage) parcel.readParcelable(IacFinishedFallbackScreenArgument.class.getClassLoader()), (IacPiiDeepLink) parcel.readParcelable(IacFinishedFallbackScreenArgument.class.getClassLoader()), (IacPiiDeepLink) parcel.readParcelable(IacFinishedFallbackScreenArgument.class.getClassLoader()), (IacPiiDeepLink) parcel.readParcelable(IacFinishedFallbackScreenArgument.class.getClassLoader()), parcel.readInt() == 0 ? null : AutomaticGsmClickSource.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (IacPiiDeepLink) parcel.readParcelable(IacFinishedFallbackScreenArgument.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IacFinishedFallbackScreenArgument[] newArray(int i12) {
            return new IacFinishedFallbackScreenArgument[i12];
        }
    }

    public IacFinishedFallbackScreenArgument(@k String str, boolean z12, @l IacPiiString iacPiiString, @l IacPiiImage iacPiiImage, @k String str2, @k String str3, @k IacCallDirection iacCallDirection, @l Long l12, @l String str4, @l IacPiiString iacPiiString2, @l IacPiiString iacPiiString3, @l IacPiiImage iacPiiImage2, @l IacPiiDeepLink iacPiiDeepLink, @l IacPiiDeepLink iacPiiDeepLink2, @l IacPiiDeepLink iacPiiDeepLink3, @l AutomaticGsmClickSource automaticGsmClickSource, @l Long l13, @l IacPiiDeepLink iacPiiDeepLink4) {
        this.callId = str;
        this.isVideo = z12;
        this.peerName = iacPiiString;
        this.peerAvatar = iacPiiImage;
        this.scenario = str2;
        this.status = str3;
        this.direction = iacCallDirection;
        this.duration = l12;
        this.itemId = str4;
        this.itemTitle = iacPiiString2;
        this.itemPrice = iacPiiString3;
        this.itemImage = iacPiiImage2;
        this.gsmLink = iacPiiDeepLink;
        this.iacLink = iacPiiDeepLink2;
        this.messengerLink = iacPiiDeepLink3;
        this.automaticGsmClickSource = automaticGsmClickSource;
        this.closingActionTimeoutSec = l13;
        this.closingActionInterceptorLink = iacPiiDeepLink4;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final IacPiiString getItemTitle() {
        return this.itemTitle;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final IacPiiString getItemPrice() {
        return this.itemPrice;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final IacPiiImage getItemImage() {
        return this.itemImage;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final IacPiiDeepLink getGsmLink() {
        return this.gsmLink;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final IacPiiDeepLink getIacLink() {
        return this.iacLink;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final IacPiiDeepLink getMessengerLink() {
        return this.messengerLink;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final AutomaticGsmClickSource getAutomaticGsmClickSource() {
        return this.automaticGsmClickSource;
    }

    @l
    /* renamed from: component17, reason: from getter */
    public final Long getClosingActionTimeoutSec() {
        return this.closingActionTimeoutSec;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final IacPiiDeepLink getClosingActionInterceptorLink() {
        return this.closingActionInterceptorLink;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final IacPiiString getPeerName() {
        return this.peerName;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final IacPiiImage getPeerAvatar() {
        return this.peerAvatar;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final IacCallDirection getDirection() {
        return this.direction;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @k
    public final IacFinishedFallbackScreenArgument copy(@k String callId, boolean isVideo, @l IacPiiString peerName, @l IacPiiImage peerAvatar, @k String scenario, @k String status, @k IacCallDirection direction, @l Long duration, @l String itemId, @l IacPiiString itemTitle, @l IacPiiString itemPrice, @l IacPiiImage itemImage, @l IacPiiDeepLink gsmLink, @l IacPiiDeepLink iacLink, @l IacPiiDeepLink messengerLink, @l AutomaticGsmClickSource automaticGsmClickSource, @l Long closingActionTimeoutSec, @l IacPiiDeepLink closingActionInterceptorLink) {
        return new IacFinishedFallbackScreenArgument(callId, isVideo, peerName, peerAvatar, scenario, status, direction, duration, itemId, itemTitle, itemPrice, itemImage, gsmLink, iacLink, messengerLink, automaticGsmClickSource, closingActionTimeoutSec, closingActionInterceptorLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacFinishedFallbackScreenArgument)) {
            return false;
        }
        IacFinishedFallbackScreenArgument iacFinishedFallbackScreenArgument = (IacFinishedFallbackScreenArgument) other;
        return L.f(this.callId, iacFinishedFallbackScreenArgument.callId) && this.isVideo == iacFinishedFallbackScreenArgument.isVideo && L.f(this.peerName, iacFinishedFallbackScreenArgument.peerName) && L.f(this.peerAvatar, iacFinishedFallbackScreenArgument.peerAvatar) && L.f(this.scenario, iacFinishedFallbackScreenArgument.scenario) && L.f(this.status, iacFinishedFallbackScreenArgument.status) && this.direction == iacFinishedFallbackScreenArgument.direction && L.f(this.duration, iacFinishedFallbackScreenArgument.duration) && L.f(this.itemId, iacFinishedFallbackScreenArgument.itemId) && L.f(this.itemTitle, iacFinishedFallbackScreenArgument.itemTitle) && L.f(this.itemPrice, iacFinishedFallbackScreenArgument.itemPrice) && L.f(this.itemImage, iacFinishedFallbackScreenArgument.itemImage) && L.f(this.gsmLink, iacFinishedFallbackScreenArgument.gsmLink) && L.f(this.iacLink, iacFinishedFallbackScreenArgument.iacLink) && L.f(this.messengerLink, iacFinishedFallbackScreenArgument.messengerLink) && this.automaticGsmClickSource == iacFinishedFallbackScreenArgument.automaticGsmClickSource && L.f(this.closingActionTimeoutSec, iacFinishedFallbackScreenArgument.closingActionTimeoutSec) && L.f(this.closingActionInterceptorLink, iacFinishedFallbackScreenArgument.closingActionInterceptorLink);
    }

    @l
    public final AutomaticGsmClickSource getAutomaticGsmClickSource() {
        return this.automaticGsmClickSource;
    }

    @k
    public final String getCallId() {
        return this.callId;
    }

    @l
    public final IacPiiDeepLink getClosingActionInterceptorLink() {
        return this.closingActionInterceptorLink;
    }

    @l
    public final Long getClosingActionTimeoutSec() {
        return this.closingActionTimeoutSec;
    }

    @k
    public final IacCallDirection getDirection() {
        return this.direction;
    }

    @l
    public final Long getDuration() {
        return this.duration;
    }

    @l
    public final IacPiiDeepLink getGsmLink() {
        return this.gsmLink;
    }

    @l
    public final IacPiiDeepLink getIacLink() {
        return this.iacLink;
    }

    @l
    public final String getItemId() {
        return this.itemId;
    }

    @l
    public final IacPiiImage getItemImage() {
        return this.itemImage;
    }

    @l
    public final IacPiiString getItemPrice() {
        return this.itemPrice;
    }

    @l
    public final IacPiiString getItemTitle() {
        return this.itemTitle;
    }

    @l
    public final IacPiiDeepLink getMessengerLink() {
        return this.messengerLink;
    }

    @l
    public final IacPiiImage getPeerAvatar() {
        return this.peerAvatar;
    }

    @l
    public final IacPiiString getPeerName() {
        return this.peerName;
    }

    @k
    public final String getScenario() {
        return this.scenario;
    }

    @k
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int i12 = r.i(this.callId.hashCode() * 31, 31, this.isVideo);
        IacPiiString iacPiiString = this.peerName;
        int iHashCode = (i12 + (iacPiiString == null ? 0 : iacPiiString.hashCode())) * 31;
        IacPiiImage iacPiiImage = this.peerAvatar;
        int iHashCode2 = (this.direction.hashCode() + H.d(H.d((iHashCode + (iacPiiImage == null ? 0 : iacPiiImage.hashCode())) * 31, 31, this.scenario), 31, this.status)) * 31;
        Long l12 = this.duration;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.itemId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        IacPiiString iacPiiString2 = this.itemTitle;
        int iHashCode5 = (iHashCode4 + (iacPiiString2 == null ? 0 : iacPiiString2.hashCode())) * 31;
        IacPiiString iacPiiString3 = this.itemPrice;
        int iHashCode6 = (iHashCode5 + (iacPiiString3 == null ? 0 : iacPiiString3.hashCode())) * 31;
        IacPiiImage iacPiiImage2 = this.itemImage;
        int iHashCode7 = (iHashCode6 + (iacPiiImage2 == null ? 0 : iacPiiImage2.hashCode())) * 31;
        IacPiiDeepLink iacPiiDeepLink = this.gsmLink;
        int iHashCode8 = (iHashCode7 + (iacPiiDeepLink == null ? 0 : iacPiiDeepLink.hashCode())) * 31;
        IacPiiDeepLink iacPiiDeepLink2 = this.iacLink;
        int iHashCode9 = (iHashCode8 + (iacPiiDeepLink2 == null ? 0 : iacPiiDeepLink2.hashCode())) * 31;
        IacPiiDeepLink iacPiiDeepLink3 = this.messengerLink;
        int iHashCode10 = (iHashCode9 + (iacPiiDeepLink3 == null ? 0 : iacPiiDeepLink3.hashCode())) * 31;
        AutomaticGsmClickSource automaticGsmClickSource = this.automaticGsmClickSource;
        int iHashCode11 = (iHashCode10 + (automaticGsmClickSource == null ? 0 : automaticGsmClickSource.hashCode())) * 31;
        Long l13 = this.closingActionTimeoutSec;
        int iHashCode12 = (iHashCode11 + (l13 == null ? 0 : l13.hashCode())) * 31;
        IacPiiDeepLink iacPiiDeepLink4 = this.closingActionInterceptorLink;
        return iHashCode12 + (iacPiiDeepLink4 != null ? iacPiiDeepLink4.hashCode() : 0);
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    @k
    public String toString() {
        return "IacFinishedFallbackScreenArgument(callId=" + this.callId + ", isVideo=" + this.isVideo + ", peerName=" + this.peerName + ", peerAvatar=" + this.peerAvatar + ", scenario=" + this.scenario + ", status=" + this.status + ", direction=" + this.direction + ", duration=" + this.duration + ", itemId=" + this.itemId + ", itemTitle=" + this.itemTitle + ", itemPrice=" + this.itemPrice + ", itemImage=" + this.itemImage + ", gsmLink=" + this.gsmLink + ", iacLink=" + this.iacLink + ", messengerLink=" + this.messengerLink + ", automaticGsmClickSource=" + this.automaticGsmClickSource + ", closingActionTimeoutSec=" + this.closingActionTimeoutSec + ", closingActionInterceptorLink=" + this.closingActionInterceptorLink + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.callId);
        parcel.writeInt(this.isVideo ? 1 : 0);
        parcel.writeParcelable(this.peerName, flags);
        parcel.writeParcelable(this.peerAvatar, flags);
        parcel.writeString(this.scenario);
        parcel.writeString(this.status);
        parcel.writeString(this.direction.name());
        Long l12 = this.duration;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.itemId);
        parcel.writeParcelable(this.itemTitle, flags);
        parcel.writeParcelable(this.itemPrice, flags);
        parcel.writeParcelable(this.itemImage, flags);
        parcel.writeParcelable(this.gsmLink, flags);
        parcel.writeParcelable(this.iacLink, flags);
        parcel.writeParcelable(this.messengerLink, flags);
        AutomaticGsmClickSource automaticGsmClickSource = this.automaticGsmClickSource;
        if (automaticGsmClickSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(automaticGsmClickSource.name());
        }
        Long l13 = this.closingActionTimeoutSec;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        parcel.writeParcelable(this.closingActionInterceptorLink, flags);
    }
}
