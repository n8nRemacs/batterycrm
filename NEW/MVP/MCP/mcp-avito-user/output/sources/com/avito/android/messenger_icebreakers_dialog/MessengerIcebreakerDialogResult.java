package com.avito.android.messenger_icebreakers_dialog;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.messenger_icebreakers_dialog.deeplink.MessengerIcebreakerDialogDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MessengerIcebreakerDialogResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/MessengerIcebreakerDialogResult;", "Landroid/os/Parcelable;", "a", "OnCancel", "OnPhoneClick", "OnSendIcebreaker", "OnSendMessage", "Lcom/avito/android/messenger_icebreakers_dialog/MessengerIcebreakerDialogResult$OnCancel;", "Lcom/avito/android/messenger_icebreakers_dialog/MessengerIcebreakerDialogResult$OnPhoneClick;", "Lcom/avito/android/messenger_icebreakers_dialog/MessengerIcebreakerDialogResult$OnSendIcebreaker;", "Lcom/avito/android/messenger_icebreakers_dialog/MessengerIcebreakerDialogResult$OnSendMessage;", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MessengerIcebreakerDialogResult extends Parcelable {

    /* renamed from: U1, reason: collision with root package name */
    @k
    public static final a f197529U1 = a.f197540a;

    /* compiled from: MessengerIcebreakerDialogResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/MessengerIcebreakerDialogResult$OnCancel;", "Lcom/avito/android/messenger_icebreakers_dialog/MessengerIcebreakerDialogResult;", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnCancel implements MessengerIcebreakerDialogResult {

        @k
        public static final Parcelable.Creator<OnCancel> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MessengerIcebreakerDialogDeeplink f197530b;

        /* compiled from: MessengerIcebreakerDialogResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnCancel> {
            @Override // android.os.Parcelable.Creator
            public final OnCancel createFromParcel(Parcel parcel) {
                return new OnCancel((MessengerIcebreakerDialogDeeplink) parcel.readParcelable(OnCancel.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OnCancel[] newArray(int i12) {
                return new OnCancel[i12];
            }
        }

        public OnCancel(@k MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink) {
            this.f197530b = messengerIcebreakerDialogDeeplink;
        }

        @k
        public final Bundle c() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("messenger_icebreakers_dialog.MessengerIcebreakerDialogResult", this);
            return bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCancel) && L.f(this.f197530b, ((OnCancel) obj).f197530b);
        }

        public final int hashCode() {
            return this.f197530b.hashCode();
        }

        @k
        public final String toString() {
            return "OnCancel(link=" + this.f197530b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f197530b, i12);
        }
    }

    /* compiled from: MessengerIcebreakerDialogResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/MessengerIcebreakerDialogResult$OnPhoneClick;", "Lcom/avito/android/messenger_icebreakers_dialog/MessengerIcebreakerDialogResult;", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnPhoneClick implements MessengerIcebreakerDialogResult {

        @k
        public static final Parcelable.Creator<OnPhoneClick> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MessengerIcebreakerDialogDeeplink f197531b;

        /* compiled from: MessengerIcebreakerDialogResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnPhoneClick> {
            @Override // android.os.Parcelable.Creator
            public final OnPhoneClick createFromParcel(Parcel parcel) {
                return new OnPhoneClick((MessengerIcebreakerDialogDeeplink) parcel.readParcelable(OnPhoneClick.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OnPhoneClick[] newArray(int i12) {
                return new OnPhoneClick[i12];
            }
        }

        public OnPhoneClick(@k MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink) {
            this.f197531b = messengerIcebreakerDialogDeeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPhoneClick) && L.f(this.f197531b, ((OnPhoneClick) obj).f197531b);
        }

        public final int hashCode() {
            return this.f197531b.hashCode();
        }

        @k
        public final String toString() {
            return "OnPhoneClick(link=" + this.f197531b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f197531b, i12);
        }
    }

    /* compiled from: MessengerIcebreakerDialogResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/MessengerIcebreakerDialogResult$OnSendIcebreaker;", "Lcom/avito/android/messenger_icebreakers_dialog/MessengerIcebreakerDialogResult;", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSendIcebreaker implements MessengerIcebreakerDialogResult {

        @k
        public static final Parcelable.Creator<OnSendIcebreaker> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MessengerIcebreakerDialogDeeplink f197532b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f197533c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f197534d;

        /* renamed from: e, reason: collision with root package name */
        public final int f197535e;

        /* renamed from: f, reason: collision with root package name */
        public final int f197536f;

        /* compiled from: MessengerIcebreakerDialogResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnSendIcebreaker> {
            @Override // android.os.Parcelable.Creator
            public final OnSendIcebreaker createFromParcel(Parcel parcel) {
                return new OnSendIcebreaker((MessengerIcebreakerDialogDeeplink) parcel.readParcelable(OnSendIcebreaker.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final OnSendIcebreaker[] newArray(int i12) {
                return new OnSendIcebreaker[i12];
            }
        }

        public OnSendIcebreaker(@k MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink, @k String str, @k String str2, int i12, int i13) {
            this.f197532b = messengerIcebreakerDialogDeeplink;
            this.f197533c = str;
            this.f197534d = str2;
            this.f197535e = i12;
            this.f197536f = i13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSendIcebreaker)) {
                return false;
            }
            OnSendIcebreaker onSendIcebreaker = (OnSendIcebreaker) obj;
            return L.f(this.f197532b, onSendIcebreaker.f197532b) && L.f(this.f197533c, onSendIcebreaker.f197533c) && L.f(this.f197534d, onSendIcebreaker.f197534d) && this.f197535e == onSendIcebreaker.f197535e && this.f197536f == onSendIcebreaker.f197536f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f197536f) + r.e(this.f197535e, H.d(H.d(this.f197532b.hashCode() * 31, 31, this.f197533c), 31, this.f197534d), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnSendIcebreaker(link=");
            sb2.append(this.f197532b);
            sb2.append(", message=");
            sb2.append(this.f197533c);
            sb2.append(", channelId=");
            sb2.append(this.f197534d);
            sb2.append(", icebreakerId=");
            sb2.append(this.f197535e);
            sb2.append(", icebreakerPosition=");
            return r.t(sb2, this.f197536f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f197532b, i12);
            parcel.writeString(this.f197533c);
            parcel.writeString(this.f197534d);
            parcel.writeInt(this.f197535e);
            parcel.writeInt(this.f197536f);
        }
    }

    /* compiled from: MessengerIcebreakerDialogResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/MessengerIcebreakerDialogResult$OnSendMessage;", "Lcom/avito/android/messenger_icebreakers_dialog/MessengerIcebreakerDialogResult;", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSendMessage implements MessengerIcebreakerDialogResult {

        @k
        public static final Parcelable.Creator<OnSendMessage> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MessengerIcebreakerDialogDeeplink f197537b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f197538c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f197539d;

        /* compiled from: MessengerIcebreakerDialogResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnSendMessage> {
            @Override // android.os.Parcelable.Creator
            public final OnSendMessage createFromParcel(Parcel parcel) {
                return new OnSendMessage((MessengerIcebreakerDialogDeeplink) parcel.readParcelable(OnSendMessage.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OnSendMessage[] newArray(int i12) {
                return new OnSendMessage[i12];
            }
        }

        public OnSendMessage(@k MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink, @k String str, @k String str2) {
            this.f197537b = messengerIcebreakerDialogDeeplink;
            this.f197538c = str;
            this.f197539d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSendMessage)) {
                return false;
            }
            OnSendMessage onSendMessage = (OnSendMessage) obj;
            return L.f(this.f197537b, onSendMessage.f197537b) && L.f(this.f197538c, onSendMessage.f197538c) && L.f(this.f197539d, onSendMessage.f197539d);
        }

        public final int hashCode() {
            return this.f197539d.hashCode() + H.d(this.f197537b.hashCode() * 31, 31, this.f197538c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnSendMessage(link=");
            sb2.append(this.f197537b);
            sb2.append(", message=");
            sb2.append(this.f197538c);
            sb2.append(", channelId=");
            return C22026a.c(sb2, this.f197539d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f197537b, i12);
            parcel.writeString(this.f197538c);
            parcel.writeString(this.f197539d);
        }
    }

    /* compiled from: MessengerIcebreakerDialogResult.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/MessengerIcebreakerDialogResult$a;", "", "<init>", "()V", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f197540a = new a();
    }

    /* compiled from: MessengerIcebreakerDialogResult.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }
}
