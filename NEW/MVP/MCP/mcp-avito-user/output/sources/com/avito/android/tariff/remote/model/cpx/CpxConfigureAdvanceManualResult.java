package com.avito.android.tariff.remote.model.cpx;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: CpxConfigureAdvanceManualResult.kt */
@d
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/avito/android/tariff/remote/model/cpx/CpxConfigureAdvanceManualResult;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/tariff/remote/model/cpx/CpxConfigureAdvanceManualResult$Advance;", "advance", "Lcom/avito/android/tariff/remote/model/cpx/CpxConfigureAdvanceManualResult$Actions;", "actions", "Lcom/avito/android/remote/model/ButtonAction;", "button", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/tariff/remote/model/cpx/CpxConfigureAdvanceManualResult$Advance;Lcom/avito/android/tariff/remote/model/cpx/CpxConfigureAdvanceManualResult$Actions;Lcom/avito/android/remote/model/ButtonAction;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/tariff/remote/model/cpx/CpxConfigureAdvanceManualResult$Advance;", "d", "()Lcom/avito/android/tariff/remote/model/cpx/CpxConfigureAdvanceManualResult$Advance;", "Lcom/avito/android/tariff/remote/model/cpx/CpxConfigureAdvanceManualResult$Actions;", "c", "()Lcom/avito/android/tariff/remote/model/cpx/CpxConfigureAdvanceManualResult$Actions;", "Lcom/avito/android/remote/model/ButtonAction;", "e", "()Lcom/avito/android/remote/model/ButtonAction;", "Actions", "Advance", "MessagePlurals", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CpxConfigureAdvanceManualResult implements Parcelable {

    @k
    public static final Parcelable.Creator<CpxConfigureAdvanceManualResult> CREATOR = new a();

    @c("actions")
    @l
    private final Actions actions;

    @c("advance")
    @k
    private final Advance advance;

    @c("button")
    @k
    private final ButtonAction button;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: CpxConfigureAdvanceManualResult.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/tariff/remote/model/cpx/CpxConfigureAdvanceManualResult$Actions;", "Landroid/os/Parcelable;", "", "price", "Lcom/avito/android/tariff/remote/model/cpx/CpxConfigureAdvanceManualResult$MessagePlurals;", "messagePlurals", "<init>", "(FLcom/avito/android/tariff/remote/model/cpx/CpxConfigureAdvanceManualResult$MessagePlurals;)V", "F", "d", "()F", "Lcom/avito/android/tariff/remote/model/cpx/CpxConfigureAdvanceManualResult$MessagePlurals;", "c", "()Lcom/avito/android/tariff/remote/model/cpx/CpxConfigureAdvanceManualResult$MessagePlurals;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Actions implements Parcelable {

        @k
        public static final Parcelable.Creator<Actions> CREATOR = new a();

        @c("messagePlurals")
        @k
        private final MessagePlurals messagePlurals;

        @c("price")
        private final float price;

        /* compiled from: CpxConfigureAdvanceManualResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Actions> {
            @Override // android.os.Parcelable.Creator
            public final Actions createFromParcel(Parcel parcel) {
                return new Actions(parcel.readFloat(), MessagePlurals.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Actions[] newArray(int i12) {
                return new Actions[i12];
            }
        }

        public Actions(float f12, @k MessagePlurals messagePlurals) {
            this.price = f12;
            this.messagePlurals = messagePlurals;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final MessagePlurals getMessagePlurals() {
            return this.messagePlurals;
        }

        /* renamed from: d, reason: from getter */
        public final float getPrice() {
            return this.price;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeFloat(this.price);
            this.messagePlurals.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: CpxConfigureAdvanceManualResult.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/avito/android/tariff/remote/model/cpx/CpxConfigureAdvanceManualResult$Advance;", "Landroid/os/Parcelable;", "", "minValue", "", "minValueMessage", ChannelContext.Item.PLACEHOLDER, "currency", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "I", "d", "()I", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "getPlaceholder", "c", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Advance implements Parcelable {

        @k
        public static final Parcelable.Creator<Advance> CREATOR = new a();

        @c("currency")
        @l
        private final String currency;

        @c("minValue")
        private final int minValue;

        @c("minValueMessage")
        @k
        private final String minValueMessage;

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        /* compiled from: CpxConfigureAdvanceManualResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Advance> {
            @Override // android.os.Parcelable.Creator
            public final Advance createFromParcel(Parcel parcel) {
                return new Advance(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Advance[] newArray(int i12) {
                return new Advance[i12];
            }
        }

        public Advance(int i12, @k String str, @l String str2, @l String str3) {
            this.minValue = i12;
            this.minValueMessage = str;
            this.placeholder = str2;
            this.currency = str3;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* renamed from: d, reason: from getter */
        public final int getMinValue() {
            return this.minValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final String getMinValueMessage() {
            return this.minValueMessage;
        }

        @l
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.minValue);
            parcel.writeString(this.minValueMessage);
            parcel.writeString(this.placeholder);
            parcel.writeString(this.currency);
        }
    }

    /* compiled from: CpxConfigureAdvanceManualResult.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/tariff/remote/model/cpx/CpxConfigureAdvanceManualResult$MessagePlurals;", "Landroid/os/Parcelable;", "", PluralsKeys.ONE, PluralsKeys.FEW, PluralsKeys.OTHER, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "e", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class MessagePlurals implements Parcelable {

        @k
        public static final Parcelable.Creator<MessagePlurals> CREATOR = new a();

        @c(PluralsKeys.FEW)
        @k
        private final String few;

        @c(PluralsKeys.ONE)
        @k
        private final String one;

        @c(PluralsKeys.OTHER)
        @k
        private final String other;

        /* compiled from: CpxConfigureAdvanceManualResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MessagePlurals> {
            @Override // android.os.Parcelable.Creator
            public final MessagePlurals createFromParcel(Parcel parcel) {
                return new MessagePlurals(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MessagePlurals[] newArray(int i12) {
                return new MessagePlurals[i12];
            }
        }

        public MessagePlurals(@k String str, @k String str2, @k String str3) {
            this.one = str;
            this.few = str2;
            this.other = str3;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getFew() {
            return this.few;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getOne() {
            return this.one;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final String getOther() {
            return this.other;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.one);
            parcel.writeString(this.few);
            parcel.writeString(this.other);
        }
    }

    /* compiled from: CpxConfigureAdvanceManualResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpxConfigureAdvanceManualResult> {
        @Override // android.os.Parcelable.Creator
        public final CpxConfigureAdvanceManualResult createFromParcel(Parcel parcel) {
            return new CpxConfigureAdvanceManualResult((AttributedText) parcel.readParcelable(CpxConfigureAdvanceManualResult.class.getClassLoader()), Advance.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Actions.CREATOR.createFromParcel(parcel), (ButtonAction) parcel.readParcelable(CpxConfigureAdvanceManualResult.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CpxConfigureAdvanceManualResult[] newArray(int i12) {
            return new CpxConfigureAdvanceManualResult[i12];
        }
    }

    public CpxConfigureAdvanceManualResult(@k AttributedText attributedText, @k Advance advance, @l Actions actions, @k ButtonAction buttonAction) {
        this.title = attributedText;
        this.advance = advance;
        this.actions = actions;
        this.button = buttonAction;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Actions getActions() {
        return this.actions;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Advance getAdvance() {
        return this.advance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        this.advance.writeToParcel(parcel, i12);
        Actions actions = this.actions;
        if (actions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actions.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.button, i12);
    }
}
