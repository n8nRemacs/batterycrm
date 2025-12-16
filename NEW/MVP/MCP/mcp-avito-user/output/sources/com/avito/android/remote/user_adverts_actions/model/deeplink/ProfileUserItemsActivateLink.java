package com.avito.android.remote.user_adverts_actions.model.deeplink;

import AK.c;
import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.error.ApiError;
import hm0.InterfaceC40961a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ProfileUserItemsActivateLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/user_adverts_actions/model/deeplink/ProfileUserItemsActivateLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final class ProfileUserItemsActivateLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ProfileUserItemsActivateLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<String> f254389b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Map<String, String> f254390c;

    /* compiled from: ProfileUserItemsActivateLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileUserItemsActivateLink> {
        @Override // android.os.Parcelable.Creator
        public final ProfileUserItemsActivateLink createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ProfileUserItemsActivateLink(arrayListCreateStringArrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileUserItemsActivateLink[] newArray(int i12) {
            return new ProfileUserItemsActivateLink[i12];
        }
    }

    /* compiled from: ProfileUserItemsActivateLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/user_adverts_actions/model/deeplink/ProfileUserItemsActivateLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/remote/user_adverts_actions/model/deeplink/ProfileUserItemsActivateLink$b$a;", "Lcom/avito/android/remote/user_adverts_actions/model/deeplink/ProfileUserItemsActivateLink$b$b;", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: ProfileUserItemsActivateLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/user_adverts_actions/model/deeplink/ProfileUserItemsActivateLink$b$a;", "Lcom/avito/android/remote/user_adverts_actions/model/deeplink/ProfileUserItemsActivateLink$b;", "LJu/c$b;", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiError f254391b;

            public a(@k ApiError apiError) {
                super(null);
                this.f254391b = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f254391b, ((a) obj).f254391b);
            }

            public final int hashCode() {
                return this.f254391b.hashCode();
            }

            @k
            public final String toString() {
                return c.n(new StringBuilder("Error(error="), this.f254391b, ')');
            }
        }

        /* compiled from: ProfileUserItemsActivateLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/user_adverts_actions/model/deeplink/ProfileUserItemsActivateLink$b$b;", "Lcom/avito/android/remote/user_adverts_actions/model/deeplink/ProfileUserItemsActivateLink$b;", "LJu/c$b;", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.remote.user_adverts_actions.model.deeplink.ProfileUserItemsActivateLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C7613b extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final InterfaceC40961a f254392b;

            public C7613b(@k InterfaceC40961a interfaceC40961a) {
                super(null);
                this.f254392b = interfaceC40961a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7613b) && L.f(this.f254392b, ((C7613b) obj).f254392b);
            }

            public final int hashCode() {
                return this.f254392b.hashCode();
            }

            @k
            public final String toString() {
                return "Success(result=" + this.f254392b + ')';
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public ProfileUserItemsActivateLink(@k List<String> list, @l Map<String, String> map) {
        this.f254389b = list;
        this.f254390c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeStringList(this.f254389b);
        Map<String, String> map = this.f254390c;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
