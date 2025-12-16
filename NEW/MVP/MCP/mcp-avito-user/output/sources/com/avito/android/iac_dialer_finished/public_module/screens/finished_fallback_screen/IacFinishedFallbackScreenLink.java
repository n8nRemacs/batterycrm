package com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiImage;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: IacFinishedFallbackScreenLink.kt */
@Keep
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001:\u0001eBµ\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010!\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\"J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\"J\u0012\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b1\u0010'J\u0012\u00102\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b4\u00103J\u0012\u00105\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b5\u00103J\u0012\u00106\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b8\u0010-J\u0012\u00109\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b9\u0010:Jâ\u0001\u0010;\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b=\u0010\"J\u0010\u0010?\u001a\u00020>HÖ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010C\u001a\u00020\u00052\b\u0010B\u001a\u0004\u0018\u00010AHÖ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020>HÖ\u0001¢\u0006\u0004\bE\u0010@J \u0010J\u001a\u00020I2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020>HÖ\u0001¢\u0006\u0004\bJ\u0010KR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010L\u001a\u0004\bM\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010N\u001a\u0004\b\u0006\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010L\u001a\u0004\bO\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010P\u001a\u0004\bQ\u0010'R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010L\u001a\u0004\bR\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bS\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010T\u001a\u0004\bU\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010V\u001a\u0004\bW\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bX\u0010\"R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\bY\u0010\"R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bZ\u0010\"R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010P\u001a\u0004\b[\u0010'R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\\\u001a\u0004\b]\u00103R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\\\u001a\u0004\b^\u00103R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\\\u001a\u0004\b_\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010`\u001a\u0004\ba\u00107R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010V\u001a\u0004\bb\u0010-R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010c\u001a\u0004\bd\u0010:¨\u0006f"}, d2 = {"Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/IacFinishedFallbackScreenLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "", "isVideo", "peerName", "Lcom/avito/android/remote/model/Image;", "peerAvatar", "scenario", "status", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "direction", "", "duration", "itemId", "itemTitle", "itemPrice", "itemImage", "gsmLink", "iacLink", "messengerLink", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/AutomaticGsmClickSource;", "automaticGsmClickSource", "closingActionTimeoutSec", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "closingActionInterceptorLink", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/AutomaticGsmClickSource;Ljava/lang/Long;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;)V", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/IacFinishedFallbackScreenArgument;", "toScreenArgument", "()Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/IacFinishedFallbackScreenArgument;", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "component6", "component7", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "component8", "()Ljava/lang/Long;", "component9", "component10", "component11", "component12", "component13", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component14", "component15", "component16", "()Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/AutomaticGsmClickSource;", "component17", "component18", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "copy", "(Ljava/lang/String;ZLjava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/AutomaticGsmClickSource;Ljava/lang/Long;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;)Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/IacFinishedFallbackScreenLink;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCallId", "Z", "getPeerName", "Lcom/avito/android/remote/model/Image;", "getPeerAvatar", "getScenario", "getStatus", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "getDirection", "Ljava/lang/Long;", "getDuration", "getItemId", "getItemTitle", "getItemPrice", "getItemImage", "Lcom/avito/android/deep_linking/links/DeepLink;", "getGsmLink", "getIacLink", "getMessengerLink", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/AutomaticGsmClickSource;", "getAutomaticGsmClickSource", "getClosingActionTimeoutSec", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "getClosingActionInterceptorLink", "b", "_avito_iac-dialer-finished_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacFinishedFallbackScreenLink extends DeepLink {

    @k
    public static final Parcelable.Creator<IacFinishedFallbackScreenLink> CREATOR = new a();

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
    private final DeepLink gsmLink;

    @l
    private final DeepLink iacLink;
    private final boolean isVideo;

    @l
    private final String itemId;

    @l
    private final Image itemImage;

    @l
    private final String itemPrice;

    @l
    private final String itemTitle;

    @l
    private final DeepLink messengerLink;

    @l
    private final Image peerAvatar;

    @l
    private final String peerName;

    @k
    private final String scenario;

    @k
    private final String status;

    /* compiled from: IacFinishedFallbackScreenLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacFinishedFallbackScreenLink> {
        @Override // android.os.Parcelable.Creator
        public final IacFinishedFallbackScreenLink createFromParcel(Parcel parcel) {
            return new IacFinishedFallbackScreenLink(parcel.readString(), parcel.readInt() != 0, parcel.readString(), (Image) parcel.readParcelable(IacFinishedFallbackScreenLink.class.getClassLoader()), parcel.readString(), parcel.readString(), IacCallDirection.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(IacFinishedFallbackScreenLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(IacFinishedFallbackScreenLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(IacFinishedFallbackScreenLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(IacFinishedFallbackScreenLink.class.getClassLoader()), parcel.readInt() == 0 ? null : AutomaticGsmClickSource.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (IacPiiDeepLink) parcel.readParcelable(IacFinishedFallbackScreenLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IacFinishedFallbackScreenLink[] newArray(int i12) {
            return new IacFinishedFallbackScreenLink[i12];
        }
    }

    /* compiled from: IacFinishedFallbackScreenLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/IacFinishedFallbackScreenLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_iac-dialer-finished_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f166823b = new b();
    }

    public IacFinishedFallbackScreenLink(@k String str, boolean z12, @l String str2, @l Image image, @k String str3, @k String str4, @k IacCallDirection iacCallDirection, @l Long l12, @l String str5, @l String str6, @l String str7, @l Image image2, @l DeepLink deepLink, @l DeepLink deepLink2, @l DeepLink deepLink3, @l AutomaticGsmClickSource automaticGsmClickSource, @l Long l13, @l IacPiiDeepLink iacPiiDeepLink) {
        this.callId = str;
        this.isVideo = z12;
        this.peerName = str2;
        this.peerAvatar = image;
        this.scenario = str3;
        this.status = str4;
        this.direction = iacCallDirection;
        this.duration = l12;
        this.itemId = str5;
        this.itemTitle = str6;
        this.itemPrice = str7;
        this.itemImage = image2;
        this.gsmLink = deepLink;
        this.iacLink = deepLink2;
        this.messengerLink = deepLink3;
        this.automaticGsmClickSource = automaticGsmClickSource;
        this.closingActionTimeoutSec = l13;
        this.closingActionInterceptorLink = iacPiiDeepLink;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getItemTitle() {
        return this.itemTitle;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getItemPrice() {
        return this.itemPrice;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final Image getItemImage() {
        return this.itemImage;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final DeepLink getGsmLink() {
        return this.gsmLink;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final DeepLink getIacLink() {
        return this.iacLink;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final DeepLink getMessengerLink() {
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
    public final String getPeerName() {
        return this.peerName;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Image getPeerAvatar() {
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
    public final IacFinishedFallbackScreenLink copy(@k String callId, boolean isVideo, @l String peerName, @l Image peerAvatar, @k String scenario, @k String status, @k IacCallDirection direction, @l Long duration, @l String itemId, @l String itemTitle, @l String itemPrice, @l Image itemImage, @l DeepLink gsmLink, @l DeepLink iacLink, @l DeepLink messengerLink, @l AutomaticGsmClickSource automaticGsmClickSource, @l Long closingActionTimeoutSec, @l IacPiiDeepLink closingActionInterceptorLink) {
        return new IacFinishedFallbackScreenLink(callId, isVideo, peerName, peerAvatar, scenario, status, direction, duration, itemId, itemTitle, itemPrice, itemImage, gsmLink, iacLink, messengerLink, automaticGsmClickSource, closingActionTimeoutSec, closingActionInterceptorLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacFinishedFallbackScreenLink)) {
            return false;
        }
        IacFinishedFallbackScreenLink iacFinishedFallbackScreenLink = (IacFinishedFallbackScreenLink) other;
        return L.f(this.callId, iacFinishedFallbackScreenLink.callId) && this.isVideo == iacFinishedFallbackScreenLink.isVideo && L.f(this.peerName, iacFinishedFallbackScreenLink.peerName) && L.f(this.peerAvatar, iacFinishedFallbackScreenLink.peerAvatar) && L.f(this.scenario, iacFinishedFallbackScreenLink.scenario) && L.f(this.status, iacFinishedFallbackScreenLink.status) && this.direction == iacFinishedFallbackScreenLink.direction && L.f(this.duration, iacFinishedFallbackScreenLink.duration) && L.f(this.itemId, iacFinishedFallbackScreenLink.itemId) && L.f(this.itemTitle, iacFinishedFallbackScreenLink.itemTitle) && L.f(this.itemPrice, iacFinishedFallbackScreenLink.itemPrice) && L.f(this.itemImage, iacFinishedFallbackScreenLink.itemImage) && L.f(this.gsmLink, iacFinishedFallbackScreenLink.gsmLink) && L.f(this.iacLink, iacFinishedFallbackScreenLink.iacLink) && L.f(this.messengerLink, iacFinishedFallbackScreenLink.messengerLink) && this.automaticGsmClickSource == iacFinishedFallbackScreenLink.automaticGsmClickSource && L.f(this.closingActionTimeoutSec, iacFinishedFallbackScreenLink.closingActionTimeoutSec) && L.f(this.closingActionInterceptorLink, iacFinishedFallbackScreenLink.closingActionInterceptorLink);
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
    public final DeepLink getGsmLink() {
        return this.gsmLink;
    }

    @l
    public final DeepLink getIacLink() {
        return this.iacLink;
    }

    @l
    public final String getItemId() {
        return this.itemId;
    }

    @l
    public final Image getItemImage() {
        return this.itemImage;
    }

    @l
    public final String getItemPrice() {
        return this.itemPrice;
    }

    @l
    public final String getItemTitle() {
        return this.itemTitle;
    }

    @l
    public final DeepLink getMessengerLink() {
        return this.messengerLink;
    }

    @l
    public final Image getPeerAvatar() {
        return this.peerAvatar;
    }

    @l
    public final String getPeerName() {
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
        String str = this.peerName;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.peerAvatar;
        int iHashCode2 = (this.direction.hashCode() + H.d(H.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.scenario), 31, this.status)) * 31;
        Long l12 = this.duration;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str2 = this.itemId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.itemTitle;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.itemPrice;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Image image2 = this.itemImage;
        int iHashCode7 = (iHashCode6 + (image2 == null ? 0 : image2.hashCode())) * 31;
        DeepLink deepLink = this.gsmLink;
        int iHashCode8 = (iHashCode7 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.iacLink;
        int iHashCode9 = (iHashCode8 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        DeepLink deepLink3 = this.messengerLink;
        int iHashCode10 = (iHashCode9 + (deepLink3 == null ? 0 : deepLink3.hashCode())) * 31;
        AutomaticGsmClickSource automaticGsmClickSource = this.automaticGsmClickSource;
        int iHashCode11 = (iHashCode10 + (automaticGsmClickSource == null ? 0 : automaticGsmClickSource.hashCode())) * 31;
        Long l13 = this.closingActionTimeoutSec;
        int iHashCode12 = (iHashCode11 + (l13 == null ? 0 : l13.hashCode())) * 31;
        IacPiiDeepLink iacPiiDeepLink = this.closingActionInterceptorLink;
        return iHashCode12 + (iacPiiDeepLink != null ? iacPiiDeepLink.hashCode() : 0);
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    @k
    public final IacFinishedFallbackScreenArgument toScreenArgument() {
        String str = this.callId;
        boolean z12 = this.isVideo;
        String str2 = this.peerName;
        IacPiiString iacPiiString = str2 != null ? new IacPiiString(str2) : null;
        Image image = this.peerAvatar;
        IacPiiImage iacPiiImage = image != null ? new IacPiiImage(image) : null;
        String str3 = this.scenario;
        String str4 = this.status;
        IacCallDirection iacCallDirection = this.direction;
        Long l12 = this.duration;
        String str5 = this.itemId;
        String str6 = this.itemTitle;
        IacPiiString iacPiiString2 = str6 != null ? new IacPiiString(str6) : null;
        String str7 = this.itemPrice;
        IacPiiString iacPiiString3 = str7 != null ? new IacPiiString(str7) : null;
        Image image2 = this.itemImage;
        IacPiiImage iacPiiImage2 = image2 != null ? new IacPiiImage(image2) : null;
        DeepLink deepLink = this.gsmLink;
        IacPiiDeepLink iacPiiDeepLink = deepLink != null ? new IacPiiDeepLink(deepLink) : null;
        DeepLink deepLink2 = this.iacLink;
        IacPiiDeepLink iacPiiDeepLink2 = deepLink2 != null ? new IacPiiDeepLink(deepLink2) : null;
        DeepLink deepLink3 = this.messengerLink;
        return new IacFinishedFallbackScreenArgument(str, z12, iacPiiString, iacPiiImage, str3, str4, iacCallDirection, l12, str5, iacPiiString2, iacPiiString3, iacPiiImage2, iacPiiDeepLink, iacPiiDeepLink2, deepLink3 != null ? new IacPiiDeepLink(deepLink3) : null, this.automaticGsmClickSource, this.closingActionTimeoutSec, this.closingActionInterceptorLink);
    }

    @k
    public String toString() {
        return "IacFinishedFallbackScreenLink(callId=" + this.callId + ", isVideo=" + this.isVideo + ", peerName=" + this.peerName + ", peerAvatar=" + this.peerAvatar + ", scenario=" + this.scenario + ", status=" + this.status + ", direction=" + this.direction + ", duration=" + this.duration + ", itemId=" + this.itemId + ", itemTitle=" + this.itemTitle + ", itemPrice=" + this.itemPrice + ", itemImage=" + this.itemImage + ", gsmLink=" + this.gsmLink + ", iacLink=" + this.iacLink + ", messengerLink=" + this.messengerLink + ", automaticGsmClickSource=" + this.automaticGsmClickSource + ", closingActionTimeoutSec=" + this.closingActionTimeoutSec + ", closingActionInterceptorLink=" + this.closingActionInterceptorLink + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.callId);
        parcel.writeInt(this.isVideo ? 1 : 0);
        parcel.writeString(this.peerName);
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
        parcel.writeString(this.itemTitle);
        parcel.writeString(this.itemPrice);
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
