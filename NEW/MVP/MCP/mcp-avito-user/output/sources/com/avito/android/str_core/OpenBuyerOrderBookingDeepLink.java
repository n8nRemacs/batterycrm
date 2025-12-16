package com.avito.android.str_core;

import Ju.InterfaceC14249c;
import Ku.AbstractC14350a;
import Ku.i;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.AnimationOverlayUrl;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47204b;

/* compiled from: OpenBuyerOrderBookingDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_core/OpenBuyerOrderBookingDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "c", "_avito-discouraged_avito-libs_str-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class OpenBuyerOrderBookingDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<OpenBuyerOrderBookingDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f288524b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f288525c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AnimationOverlayUrl f288526d;

    /* compiled from: OpenBuyerOrderBookingDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OpenBuyerOrderBookingDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final OpenBuyerOrderBookingDeepLink createFromParcel(Parcel parcel) {
            return new OpenBuyerOrderBookingDeepLink(parcel.readString(), parcel.readString(), (AnimationOverlayUrl) parcel.readParcelable(OpenBuyerOrderBookingDeepLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OpenBuyerOrderBookingDeepLink[] newArray(int i12) {
            return new OpenBuyerOrderBookingDeepLink[i12];
        }
    }

    /* compiled from: OpenBuyerOrderBookingDeepLink.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_core/OpenBuyerOrderBookingDeepLink$b;", "LKu/a;", "Lcom/avito/android/str_core/OpenBuyerOrderBookingDeepLink;", "<init>", "()V", "_avito-discouraged_avito-libs_str-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC14350a<OpenBuyerOrderBookingDeepLink> {
        @Override // Ku.AbstractC14350a
        public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
            String strP = i.p(uri, "orderId");
            String queryParameter = uri.getQueryParameter("eventName");
            try {
                Type type = new com.avito.android.str_core.a().getType();
                String queryParameter2 = uri.getQueryParameter("startAnimation");
                return new OpenBuyerOrderBookingDeepLink(strP, queryParameter, (AnimationOverlayUrl) (queryParameter2 != null ? gson.e(queryParameter2, type) : null));
            } catch (JsonParseException e12) {
                throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "startAnimation", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
            }
        }
    }

    /* compiled from: OpenBuyerOrderBookingDeepLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_core/OpenBuyerOrderBookingDeepLink$c;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_avito-libs_str-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f288527b = new c();
    }

    public /* synthetic */ OpenBuyerOrderBookingDeepLink(String str, String str2, AnimationOverlayUrl animationOverlayUrl, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : animationOverlayUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f288524b);
        parcel.writeString(this.f288525c);
        parcel.writeParcelable(this.f288526d, i12);
    }

    public OpenBuyerOrderBookingDeepLink(@k String str, @l String str2, @l AnimationOverlayUrl animationOverlayUrl) {
        this.f288524b = str;
        this.f288525c = str2;
        this.f288526d = animationOverlayUrl;
    }
}
