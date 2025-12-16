package com.avito.android.messenger_icebreakers_dialog.deeplink;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: MessengerIcebreakerDialogDeeplink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "b", "_avito_messenger-icebreakers-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class MessengerIcebreakerDialogDeeplink extends DeepLink implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<MessengerIcebreakerDialogDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f197547b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f197548c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f197549d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f197550e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final DeepLink f197551f;

    /* compiled from: MessengerIcebreakerDialogDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MessengerIcebreakerDialogDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final MessengerIcebreakerDialogDeeplink createFromParcel(Parcel parcel) {
            return new MessengerIcebreakerDialogDeeplink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(MessengerIcebreakerDialogDeeplink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessengerIcebreakerDialogDeeplink[] newArray(int i12) {
            return new MessengerIcebreakerDialogDeeplink[i12];
        }
    }

    /* compiled from: MessengerIcebreakerDialogDeeplink.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink$b;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink$b$a;", "Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink$b$b;", "Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink$b$c;", "Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink$b$d;", "Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink$b$e;", "_avito_messenger-icebreakers-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: MessengerIcebreakerDialogDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink$b$a;", "Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink$b;", "LJu/c$b;", "<init>", "()V", "_avito_messenger-icebreakers-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f197552b = new a();
        }

        /* compiled from: MessengerIcebreakerDialogDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink$b$b;", "Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink$b;", "LJu/c$b;", "<init>", "()V", "_avito_messenger-icebreakers-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger_icebreakers_dialog.deeplink.MessengerIcebreakerDialogDeeplink$b$b, reason: collision with other inner class name */
        public static final class C5818b implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C5818b f197553b = new C5818b();
        }

        /* compiled from: MessengerIcebreakerDialogDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink$b$c;", "Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink$b;", "LJu/c$b;", "<init>", "()V", "_avito_messenger-icebreakers-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f197554b = new c();
        }

        /* compiled from: MessengerIcebreakerDialogDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink$b$d;", "Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink$b;", "LJu/c$a;", "<init>", "()V", "_avito_messenger-icebreakers-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements b, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final d f197555b = new d();
        }

        /* compiled from: MessengerIcebreakerDialogDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink$b$e;", "Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink$b;", "LJu/c$a;", "<init>", "()V", "_avito_messenger-icebreakers-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e implements b, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final e f197556b = new e();
        }
    }

    public /* synthetic */ MessengerIcebreakerDialogDeeplink(String str, String str2, String str3, String str4, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : deepLink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessengerIcebreakerDialogDeeplink)) {
            return false;
        }
        MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink = (MessengerIcebreakerDialogDeeplink) obj;
        return L.f(this.f197547b, messengerIcebreakerDialogDeeplink.f197547b) && L.f(this.f197548c, messengerIcebreakerDialogDeeplink.f197548c) && L.f(this.f197549d, messengerIcebreakerDialogDeeplink.f197549d) && L.f(this.f197550e, messengerIcebreakerDialogDeeplink.f197550e) && L.f(this.f197551f, messengerIcebreakerDialogDeeplink.f197551f);
    }

    public final int hashCode() {
        int iHashCode = this.f197547b.hashCode() * 31;
        String str = this.f197548c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f197549d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f197550e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DeepLink deepLink = this.f197551f;
        return iHashCode4 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessengerIcebreakerDialogDeeplink(itemId=");
        sb2.append(this.f197547b);
        sb2.append(", context=");
        sb2.append(this.f197548c);
        sb2.append(", source=");
        sb2.append(this.f197549d);
        sb2.append(", xHash=");
        sb2.append(this.f197550e);
        sb2.append(", phoneDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f197551f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f197547b);
        parcel.writeString(this.f197548c);
        parcel.writeString(this.f197549d);
        parcel.writeString(this.f197550e);
        parcel.writeParcelable(this.f197551f, i12);
    }

    public MessengerIcebreakerDialogDeeplink(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l DeepLink deepLink) {
        this.f197547b = str;
        this.f197548c = str2;
        this.f197549d = str3;
        this.f197550e = str4;
        this.f197551f = deepLink;
    }
}
