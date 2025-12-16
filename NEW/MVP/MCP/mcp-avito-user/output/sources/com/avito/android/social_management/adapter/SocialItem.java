package com.avito.android.social_management.adapter;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.social.SocialNetwork;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: SocialItem.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/social_management/adapter/SocialItem;", "LTV0/a;", "Landroid/os/Parcelable;", "Available", "Connected", "Header", "Notification", "VkGroupItem", "Lcom/avito/android/social_management/adapter/SocialItem$Available;", "Lcom/avito/android/social_management/adapter/SocialItem$Connected;", "Lcom/avito/android/social_management/adapter/SocialItem$Header;", "Lcom/avito/android/social_management/adapter/SocialItem$Notification;", "Lcom/avito/android/social_management/adapter/SocialItem$VkGroupItem;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SocialItem extends TV0.a, Parcelable {

    /* compiled from: SocialItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/adapter/SocialItem$Available;", "Lcom/avito/android/social_management/adapter/SocialItem;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Available implements SocialItem {

        @k
        public static final Parcelable.Creator<Available> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f284475b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SocialNetwork f284476c;

        /* compiled from: SocialItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Available> {
            @Override // android.os.Parcelable.Creator
            public final Available createFromParcel(Parcel parcel) {
                return new Available(parcel.readLong(), (SocialNetwork) parcel.readParcelable(Available.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Available[] newArray(int i12) {
                return new Available[i12];
            }
        }

        public Available(long j12, @k SocialNetwork socialNetwork) {
            this.f284475b = j12;
            this.f284476c = socialNetwork;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF247713b() {
            return this.f284475b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f284475b);
            parcel.writeParcelable(this.f284476c, i12);
        }
    }

    /* compiled from: SocialItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/adapter/SocialItem$Connected;", "Lcom/avito/android/social_management/adapter/SocialItem;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Connected implements SocialItem {

        @k
        public static final Parcelable.Creator<Connected> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f284477b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SocialNetwork f284478c;

        /* compiled from: SocialItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Connected> {
            @Override // android.os.Parcelable.Creator
            public final Connected createFromParcel(Parcel parcel) {
                return new Connected(parcel.readLong(), (SocialNetwork) parcel.readParcelable(Connected.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Connected[] newArray(int i12) {
                return new Connected[i12];
            }
        }

        public Connected(long j12, @k SocialNetwork socialNetwork) {
            this.f284477b = j12;
            this.f284478c = socialNetwork;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF247713b() {
            return this.f284477b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f284477b);
            parcel.writeParcelable(this.f284478c, i12);
        }
    }

    /* compiled from: SocialItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/adapter/SocialItem$Header;", "Lcom/avito/android/social_management/adapter/SocialItem;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Header implements SocialItem {

        @k
        public static final Parcelable.Creator<Header> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f284479b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f284480c;

        /* compiled from: SocialItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Header> {
            @Override // android.os.Parcelable.Creator
            public final Header createFromParcel(Parcel parcel) {
                return new Header(parcel.readLong(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Header[] newArray(int i12) {
                return new Header[i12];
            }
        }

        public Header(long j12, @k String str) {
            this.f284479b = j12;
            this.f284480c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF247713b() {
            return this.f284479b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f284479b);
            parcel.writeString(this.f284480c);
        }
    }

    /* compiled from: SocialItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/adapter/SocialItem$Notification;", "Lcom/avito/android/social_management/adapter/SocialItem;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Notification implements SocialItem {

        @k
        public static final Parcelable.Creator<Notification> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f284481b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f284482c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final AttributedText f284483d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f284484e;

        /* compiled from: SocialItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Notification> {
            @Override // android.os.Parcelable.Creator
            public final Notification createFromParcel(Parcel parcel) {
                return new Notification(parcel.readLong(), parcel.readString(), (AttributedText) parcel.readParcelable(Notification.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Notification[] newArray(int i12) {
                return new Notification[i12];
            }
        }

        public Notification(long j12, @k String str, @k AttributedText attributedText, @l String str2) {
            this.f284481b = j12;
            this.f284482c = str;
            this.f284483d = attributedText;
            this.f284484e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF247713b() {
            return this.f284481b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f284481b);
            parcel.writeString(this.f284482c);
            parcel.writeParcelable(this.f284483d, i12);
            parcel.writeString(this.f284484e);
        }
    }

    /* compiled from: SocialItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/social_management/adapter/SocialItem$VkGroupItem;", "Lcom/avito/android/social_management/adapter/SocialItem;", "Action", "Type", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class VkGroupItem implements SocialItem {

        @k
        public static final Parcelable.Creator<VkGroupItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f284485b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f284486c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f284487d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final Type f284488e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final Action f284489f;

        /* compiled from: SocialItem.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/adapter/SocialItem$VkGroupItem$Action;", "Landroid/os/Parcelable;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Action implements Parcelable {

            @k
            public static final Parcelable.Creator<Action> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f284490b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final DeepLink f284491c;

            /* compiled from: SocialItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Action> {
                @Override // android.os.Parcelable.Creator
                public final Action createFromParcel(Parcel parcel) {
                    return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Action[] newArray(int i12) {
                    return new Action[i12];
                }
            }

            public Action(@k String str, @k DeepLink deepLink) {
                this.f284490b = str;
                this.f284491c = deepLink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f284490b);
                parcel.writeParcelable(this.f284491c, i12);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SocialItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/adapter/SocialItem$VkGroupItem$Type;", "", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            /* renamed from: b, reason: collision with root package name */
            public static final Type f284492b;

            /* renamed from: c, reason: collision with root package name */
            public static final Type f284493c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Type[] f284494d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f284495e;

            static {
                Type type = new Type("OK", 0);
                f284492b = type;
                Type type2 = new Type("ERROR", 1);
                f284493c = type2;
                Type[] typeArr = {type, type2};
                f284494d = typeArr;
                f284495e = kotlin.enums.c.a(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f284494d.clone();
            }
        }

        /* compiled from: SocialItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<VkGroupItem> {
            @Override // android.os.Parcelable.Creator
            public final VkGroupItem createFromParcel(Parcel parcel) {
                return new VkGroupItem(parcel.readLong(), parcel.readString(), parcel.readString(), Type.valueOf(parcel.readString()), Action.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final VkGroupItem[] newArray(int i12) {
                return new VkGroupItem[i12];
            }
        }

        public VkGroupItem(long j12, @k String str, @l String str2, @k Type type, @k Action action) {
            this.f284485b = j12;
            this.f284486c = str;
            this.f284487d = str2;
            this.f284488e = type;
            this.f284489f = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF247713b() {
            return this.f284485b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f284485b);
            parcel.writeString(this.f284486c);
            parcel.writeString(this.f284487d);
            parcel.writeString(this.f284488e.name());
            this.f284489f.writeToParcel(parcel, i12);
        }
    }
}
