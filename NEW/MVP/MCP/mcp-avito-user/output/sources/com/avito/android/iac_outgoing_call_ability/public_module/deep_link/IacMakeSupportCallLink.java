package com.avito.android.iac_outgoing_call_ability.public_module.deep_link;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.deep_linking.links.PublicDeeplink;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: IacMakeSupportCallLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeSupportCallLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "Landroid/os/Parcelable;", "b", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacMakeSupportCallLink extends PublicDeeplink implements Parcelable {

    @k
    public static final Parcelable.Creator<IacMakeSupportCallLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<String, String> f168688b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PhoneLink.Call f168689c;

    /* compiled from: IacMakeSupportCallLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacMakeSupportCallLink> {
        @Override // android.os.Parcelable.Creator
        public final IacMakeSupportCallLink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new IacMakeSupportCallLink(linkedHashMap, (PhoneLink.Call) parcel.readParcelable(IacMakeSupportCallLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IacMakeSupportCallLink[] newArray(int i12) {
            return new IacMakeSupportCallLink[i12];
        }
    }

    /* compiled from: IacMakeSupportCallLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeSupportCallLink$b;", "", "a", "b", "c", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeSupportCallLink$b$a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeSupportCallLink$b$b;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeSupportCallLink$b$c;", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: IacMakeSupportCallLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeSupportCallLink$b$a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeSupportCallLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f168690b = new a();
        }

        /* compiled from: IacMakeSupportCallLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeSupportCallLink$b$b;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeSupportCallLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacMakeSupportCallLink$b$b, reason: collision with other inner class name */
        public static final class C4988b implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4988b f168691b = new C4988b();
        }

        /* compiled from: IacMakeSupportCallLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeSupportCallLink$b$c;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeSupportCallLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements b, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f168692b = new c();
        }
    }

    public IacMakeSupportCallLink(@k Map<String, String> map, @l PhoneLink.Call call) {
        this.f168688b = map;
        this.f168689c = call;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacMakeSupportCallLink)) {
            return false;
        }
        IacMakeSupportCallLink iacMakeSupportCallLink = (IacMakeSupportCallLink) obj;
        return L.f(this.f168688b, iacMakeSupportCallLink.f168688b) && L.f(this.f168689c, iacMakeSupportCallLink.f168689c);
    }

    public final int hashCode() {
        int iHashCode = this.f168688b.hashCode() * 31;
        PhoneLink.Call call = this.f168689c;
        return iHashCode + (call == null ? 0 : call.hashCode());
    }

    @k
    public final String toString() {
        return "IacMakeSupportCallLink(extraInfo=" + this.f168688b + ", supportPhoneLink=" + this.f168689c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itI = C0.i(parcel, this.f168688b);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeParcelable(this.f168689c, i12);
    }
}
