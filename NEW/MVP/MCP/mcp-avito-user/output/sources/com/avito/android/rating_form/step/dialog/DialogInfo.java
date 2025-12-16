package com.avito.android.rating_form.step.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.StepIdentifier;
import com.avito.android.rating_form.api.remote.model.ButtonStyle;
import com.avito.android.rating_form.step.validations.ValidationInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DialogInfo.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/DialogInfo;", "Landroid/os/Parcelable;", "Action", "a", "OnCloseAction", "ViewType", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DialogInfo implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final StepIdentifier f249341b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f249342c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AttributedText f249343d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ArrayList f249344e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final ArrayList f249345f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ViewType f249346g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Map<FieldIdentifier, ValidationInfo> f249347h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final a f249340i = new a(null);

    @Y61.k
    public static final Parcelable.Creator<DialogInfo> CREATOR = new b();

    /* compiled from: DialogInfo.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/DialogInfo$Action;", "Landroid/os/Parcelable;", "AuthDialogAction", "CloseDialogAction", "UpdateStateAction", "Lcom/avito/android/rating_form/step/dialog/DialogInfo$Action$AuthDialogAction;", "Lcom/avito/android/rating_form/step/dialog/DialogInfo$Action$CloseDialogAction;", "Lcom/avito/android/rating_form/step/dialog/DialogInfo$Action$UpdateStateAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Action implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f249348b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ButtonStyle f249349c;

        /* compiled from: DialogInfo.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/DialogInfo$Action$AuthDialogAction;", "Lcom/avito/android/rating_form/step/dialog/DialogInfo$Action;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AuthDialogAction extends Action {

            @Y61.k
            public static final Parcelable.Creator<AuthDialogAction> CREATOR = new a();

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f249350d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final ButtonStyle f249351e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final DeepLink f249352f;

            /* compiled from: DialogInfo.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AuthDialogAction> {
                @Override // android.os.Parcelable.Creator
                public final AuthDialogAction createFromParcel(Parcel parcel) {
                    return new AuthDialogAction(parcel.readString(), ButtonStyle.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(AuthDialogAction.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final AuthDialogAction[] newArray(int i12) {
                    return new AuthDialogAction[i12];
                }
            }

            public AuthDialogAction(@Y61.k String str, @Y61.k ButtonStyle buttonStyle, @Y61.l DeepLink deepLink) {
                super(str, buttonStyle, deepLink, null);
                this.f249350d = str;
                this.f249351e = buttonStyle;
                this.f249352f = deepLink;
            }

            @Override // com.avito.android.rating_form.step.dialog.DialogInfo.Action
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final ButtonStyle getF249349c() {
                return this.f249351e;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AuthDialogAction)) {
                    return false;
                }
                AuthDialogAction authDialogAction = (AuthDialogAction) obj;
                return L.f(this.f249350d, authDialogAction.f249350d) && this.f249351e == authDialogAction.f249351e && L.f(this.f249352f, authDialogAction.f249352f);
            }

            @Override // com.avito.android.rating_form.step.dialog.DialogInfo.Action
            @Y61.k
            /* renamed from: getTitle, reason: from getter */
            public final String getF249348b() {
                return this.f249350d;
            }

            public final int hashCode() {
                int iHashCode = (this.f249351e.hashCode() + (this.f249350d.hashCode() * 31)) * 31;
                DeepLink deepLink = this.f249352f;
                return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AuthDialogAction(title=");
                sb2.append(this.f249350d);
                sb2.append(", style=");
                sb2.append(this.f249351e);
                sb2.append(", deeplink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f249352f, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f249350d);
                parcel.writeString(this.f249351e.name());
                parcel.writeParcelable(this.f249352f, i12);
            }
        }

        /* compiled from: DialogInfo.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/DialogInfo$Action$CloseDialogAction;", "Lcom/avito/android/rating_form/step/dialog/DialogInfo$Action;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CloseDialogAction extends Action {

            @Y61.k
            public static final Parcelable.Creator<CloseDialogAction> CREATOR = new a();

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f249353d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final ButtonStyle f249354e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final DeepLink f249355f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final String f249356g;

            /* renamed from: h, reason: collision with root package name */
            @Y61.k
            public final String f249357h;

            /* compiled from: DialogInfo.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CloseDialogAction> {
                @Override // android.os.Parcelable.Creator
                public final CloseDialogAction createFromParcel(Parcel parcel) {
                    return new CloseDialogAction(parcel.readString(), ButtonStyle.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(CloseDialogAction.class.getClassLoader()), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final CloseDialogAction[] newArray(int i12) {
                    return new CloseDialogAction[i12];
                }
            }

            public CloseDialogAction(@Y61.k String str, @Y61.k ButtonStyle buttonStyle, @Y61.l DeepLink deepLink, @Y61.k String str2, @Y61.k String str3) {
                super(str, buttonStyle, deepLink, null);
                this.f249353d = str;
                this.f249354e = buttonStyle;
                this.f249355f = deepLink;
                this.f249356g = str2;
                this.f249357h = str3;
            }

            @Override // com.avito.android.rating_form.step.dialog.DialogInfo.Action
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final ButtonStyle getF249349c() {
                return this.f249354e;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CloseDialogAction)) {
                    return false;
                }
                CloseDialogAction closeDialogAction = (CloseDialogAction) obj;
                return L.f(this.f249353d, closeDialogAction.f249353d) && this.f249354e == closeDialogAction.f249354e && L.f(this.f249355f, closeDialogAction.f249355f) && L.f(this.f249356g, closeDialogAction.f249356g) && L.f(this.f249357h, closeDialogAction.f249357h);
            }

            @Override // com.avito.android.rating_form.step.dialog.DialogInfo.Action
            @Y61.k
            /* renamed from: getTitle, reason: from getter */
            public final String getF249348b() {
                return this.f249353d;
            }

            public final int hashCode() {
                int iHashCode = (this.f249354e.hashCode() + (this.f249353d.hashCode() * 31)) * 31;
                DeepLink deepLink = this.f249355f;
                return this.f249357h.hashCode() + H.d((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f249356g);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("CloseDialogAction(title=");
                sb2.append(this.f249353d);
                sb2.append(", style=");
                sb2.append(this.f249354e);
                sb2.append(", deeplink=");
                sb2.append(this.f249355f);
                sb2.append(", focusFieldSlug=");
                sb2.append(this.f249356g);
                sb2.append(", focusStepSlug=");
                return C22026a.c(sb2, this.f249357h, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f249353d);
                parcel.writeString(this.f249354e.name());
                parcel.writeParcelable(this.f249355f, i12);
                parcel.writeString(this.f249356g);
                parcel.writeString(this.f249357h);
            }
        }

        /* compiled from: DialogInfo.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/DialogInfo$Action$UpdateStateAction;", "Lcom/avito/android/rating_form/step/dialog/DialogInfo$Action;", "NewStateValue", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class UpdateStateAction extends Action {

            @Y61.k
            public static final Parcelable.Creator<UpdateStateAction> CREATOR = new a();

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f249358d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final ButtonStyle f249359e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final DeepLink f249360f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final ArrayList f249361g;

            /* compiled from: DialogInfo.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/DialogInfo$Action$UpdateStateAction$NewStateValue;", "Landroid/os/Parcelable;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class NewStateValue implements Parcelable {

                @Y61.k
                public static final Parcelable.Creator<NewStateValue> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final String f249362b;

                /* renamed from: c, reason: collision with root package name */
                public final boolean f249363c;

                /* compiled from: DialogInfo.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<NewStateValue> {
                    @Override // android.os.Parcelable.Creator
                    public final NewStateValue createFromParcel(Parcel parcel) {
                        return new NewStateValue(parcel.readString(), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final NewStateValue[] newArray(int i12) {
                        return new NewStateValue[i12];
                    }
                }

                public NewStateValue(@Y61.k String str, boolean z12) {
                    this.f249362b = str;
                    this.f249363c = z12;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof NewStateValue)) {
                        return false;
                    }
                    NewStateValue newStateValue = (NewStateValue) obj;
                    return L.f(this.f249362b, newStateValue.f249362b) && this.f249363c == newStateValue.f249363c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f249363c) + (this.f249362b.hashCode() * 31);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("NewStateValue(path=");
                    sb2.append(this.f249362b);
                    sb2.append(", value=");
                    return r.x(sb2, this.f249363c, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeString(this.f249362b);
                    parcel.writeInt(this.f249363c ? 1 : 0);
                }
            }

            /* compiled from: DialogInfo.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<UpdateStateAction> {
                @Override // android.os.Parcelable.Creator
                public final UpdateStateAction createFromParcel(Parcel parcel) {
                    String string = parcel.readString();
                    ButtonStyle buttonStyleValueOf = ButtonStyle.valueOf(parcel.readString());
                    DeepLink deepLink = (DeepLink) parcel.readParcelable(UpdateStateAction.class.getClassLoader());
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(NewStateValue.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new UpdateStateAction(string, buttonStyleValueOf, deepLink, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final UpdateStateAction[] newArray(int i12) {
                    return new UpdateStateAction[i12];
                }
            }

            public UpdateStateAction(@Y61.k String str, @Y61.k ButtonStyle buttonStyle, @Y61.l DeepLink deepLink, @Y61.k ArrayList arrayList) {
                super(str, buttonStyle, deepLink, null);
                this.f249358d = str;
                this.f249359e = buttonStyle;
                this.f249360f = deepLink;
                this.f249361g = arrayList;
            }

            @Override // com.avito.android.rating_form.step.dialog.DialogInfo.Action
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final ButtonStyle getF249349c() {
                return this.f249359e;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UpdateStateAction)) {
                    return false;
                }
                UpdateStateAction updateStateAction = (UpdateStateAction) obj;
                return L.f(this.f249358d, updateStateAction.f249358d) && this.f249359e == updateStateAction.f249359e && L.f(this.f249360f, updateStateAction.f249360f) && L.f(this.f249361g, updateStateAction.f249361g);
            }

            @Override // com.avito.android.rating_form.step.dialog.DialogInfo.Action
            @Y61.k
            /* renamed from: getTitle, reason: from getter */
            public final String getF249348b() {
                return this.f249358d;
            }

            public final int hashCode() {
                int iHashCode = (this.f249359e.hashCode() + (this.f249358d.hashCode() * 31)) * 31;
                DeepLink deepLink = this.f249360f;
                return this.f249361g.hashCode() + ((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("UpdateStateAction(title=");
                sb2.append(this.f249358d);
                sb2.append(", style=");
                sb2.append(this.f249359e);
                sb2.append(", deeplink=");
                sb2.append(this.f249360f);
                sb2.append(", values=");
                return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f249361g, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f249358d);
                parcel.writeString(this.f249359e.name());
                parcel.writeParcelable(this.f249360f, i12);
                Iterator itZ = com.avito.android.actions_sheet.a.z(this.f249361g, parcel);
                while (itZ.hasNext()) {
                    ((NewStateValue) itZ.next()).writeToParcel(parcel, i12);
                }
            }
        }

        public Action(String str, ButtonStyle buttonStyle, DeepLink deepLink, C42822w c42822w) {
            this.f249348b = str;
            this.f249349c = buttonStyle;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public ButtonStyle getF249349c() {
            return this.f249349c;
        }

        @Y61.k
        /* renamed from: getTitle, reason: from getter */
        public String getF249348b() {
            return this.f249348b;
        }
    }

    /* compiled from: DialogInfo.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/DialogInfo$OnCloseAction;", "Landroid/os/Parcelable;", "FocusFieldAction", "SendAnalyticsAction", "Lcom/avito/android/rating_form/step/dialog/DialogInfo$OnCloseAction$FocusFieldAction;", "Lcom/avito/android/rating_form/step/dialog/DialogInfo$OnCloseAction$SendAnalyticsAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnCloseAction extends Parcelable {

        /* compiled from: DialogInfo.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/DialogInfo$OnCloseAction$FocusFieldAction;", "Lcom/avito/android/rating_form/step/dialog/DialogInfo$OnCloseAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FocusFieldAction implements OnCloseAction {

            @Y61.k
            public static final Parcelable.Creator<FocusFieldAction> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f249364b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f249365c;

            /* compiled from: DialogInfo.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<FocusFieldAction> {
                @Override // android.os.Parcelable.Creator
                public final FocusFieldAction createFromParcel(Parcel parcel) {
                    return new FocusFieldAction(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final FocusFieldAction[] newArray(int i12) {
                    return new FocusFieldAction[i12];
                }
            }

            public FocusFieldAction(@Y61.k String str, @Y61.k String str2) {
                this.f249364b = str;
                this.f249365c = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FocusFieldAction)) {
                    return false;
                }
                FocusFieldAction focusFieldAction = (FocusFieldAction) obj;
                return L.f(this.f249364b, focusFieldAction.f249364b) && L.f(this.f249365c, focusFieldAction.f249365c);
            }

            public final int hashCode() {
                return this.f249365c.hashCode() + (this.f249364b.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("FocusFieldAction(focusFieldSlug=");
                sb2.append(this.f249364b);
                sb2.append(", focusStepSlug=");
                return C22026a.c(sb2, this.f249365c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f249364b);
                parcel.writeString(this.f249365c);
            }
        }

        /* compiled from: DialogInfo.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/DialogInfo$OnCloseAction$SendAnalyticsAction;", "Lcom/avito/android/rating_form/step/dialog/DialogInfo$OnCloseAction;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        @X41.g
        public static final class SendAnalyticsAction implements OnCloseAction {

            @Y61.k
            public static final Parcelable.Creator<SendAnalyticsAction> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final DeepLink f249366b;

            /* compiled from: DialogInfo.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SendAnalyticsAction> {
                @Override // android.os.Parcelable.Creator
                public final SendAnalyticsAction createFromParcel(Parcel parcel) {
                    return SendAnalyticsAction.a((DeepLink) parcel.readParcelable(SendAnalyticsAction.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final SendAnalyticsAction[] newArray(int i12) {
                    return new SendAnalyticsAction[i12];
                }
            }

            private /* synthetic */ SendAnalyticsAction(DeepLink deepLink) {
                this.f249366b = deepLink;
            }

            public static final /* synthetic */ SendAnalyticsAction a(DeepLink deepLink) {
                return new SendAnalyticsAction(deepLink);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof SendAnalyticsAction) {
                    return L.f(this.f249366b, ((SendAnalyticsAction) obj).f249366b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f249366b.hashCode();
            }

            public final String toString() {
                return "SendAnalyticsAction(uri=" + this.f249366b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f249366b, i12);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/DialogInfo$ViewType;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ViewType {

        /* renamed from: b, reason: collision with root package name */
        public static final ViewType f249367b;

        /* renamed from: c, reason: collision with root package name */
        public static final ViewType f249368c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ViewType[] f249369d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f249370e;

        static {
            ViewType viewType = new ViewType("BOTTOM_SHEET", 0);
            f249367b = viewType;
            ViewType viewType2 = new ViewType("FULLSCREEN", 1);
            f249368c = viewType2;
            ViewType[] viewTypeArr = {viewType, viewType2};
            f249369d = viewTypeArr;
            f249370e = kotlin.enums.c.a(viewTypeArr);
        }

        public ViewType() {
            throw null;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) f249369d.clone();
        }
    }

    /* compiled from: DialogInfo.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/DialogInfo$a;", "", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DialogInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DialogInfo> {
        @Override // android.os.Parcelable.Creator
        public final DialogInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2 = null;
            StepIdentifier stepIdentifierCreateFromParcel = parcel.readInt() == 0 ? null : StepIdentifier.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(DialogInfo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(DialogInfo.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(DialogInfo.class, parcel, arrayList3, iL3, 1);
                }
                arrayList2 = arrayList3;
            }
            ViewType viewTypeValueOf = ViewType.valueOf(parcel.readString());
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashMap.put(FieldIdentifier.CREATOR.createFromParcel(parcel), ValidationInfo.CREATOR.createFromParcel(parcel));
            }
            return new DialogInfo(stepIdentifierCreateFromParcel, string, attributedText, arrayList, arrayList2, viewTypeValueOf, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final DialogInfo[] newArray(int i12) {
            return new DialogInfo[i12];
        }
    }

    public DialogInfo(@Y61.l StepIdentifier stepIdentifier, @Y61.l String str, @Y61.k AttributedText attributedText, @Y61.l ArrayList arrayList, @Y61.l ArrayList arrayList2, @Y61.k ViewType viewType, @Y61.k Map map) {
        this.f249341b = stepIdentifier;
        this.f249342c = str;
        this.f249343d = attributedText;
        this.f249344e = arrayList;
        this.f249345f = arrayList2;
        this.f249346g = viewType;
        this.f249347h = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogInfo)) {
            return false;
        }
        DialogInfo dialogInfo = (DialogInfo) obj;
        return L.f(this.f249341b, dialogInfo.f249341b) && L.f(this.f249342c, dialogInfo.f249342c) && L.f(this.f249343d, dialogInfo.f249343d) && L.f(this.f249344e, dialogInfo.f249344e) && L.f(this.f249345f, dialogInfo.f249345f) && this.f249346g == dialogInfo.f249346g && L.f(this.f249347h, dialogInfo.f249347h);
    }

    public final int hashCode() {
        StepIdentifier stepIdentifier = this.f249341b;
        int iHashCode = (stepIdentifier == null ? 0 : stepIdentifier.hashCode()) * 31;
        String str = this.f249342c;
        int iB2 = com.avito.android.actions_sheet.a.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f249343d);
        ArrayList arrayList = this.f249344e;
        int iHashCode2 = (iB2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f249345f;
        return this.f249347h.hashCode() + ((this.f249346g.hashCode() + ((iHashCode2 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DialogInfo(stepIdentifier=");
        sb2.append(this.f249341b);
        sb2.append(", title=");
        sb2.append(this.f249342c);
        sb2.append(", content=");
        sb2.append(this.f249343d);
        sb2.append(", actions=");
        sb2.append(this.f249344e);
        sb2.append(", onCloseActions=");
        sb2.append(this.f249345f);
        sb2.append(", viewType=");
        sb2.append(this.f249346g);
        sb2.append(", failedValidationList=");
        return r.w(sb2, this.f249347h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        StepIdentifier stepIdentifier = this.f249341b;
        if (stepIdentifier == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stepIdentifier.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f249342c);
        parcel.writeParcelable(this.f249343d, i12);
        ArrayList arrayList = this.f249344e;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                parcel.writeParcelable((Parcelable) itY.next(), i12);
            }
        }
        ArrayList arrayList2 = this.f249345f;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY2 = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList2);
            while (itY2.hasNext()) {
                parcel.writeParcelable((Parcelable) itY2.next(), i12);
            }
        }
        parcel.writeString(this.f249346g.name());
        Iterator itI = C0.i(parcel, this.f249347h);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            ((FieldIdentifier) entry.getKey()).writeToParcel(parcel, i12);
            ((ValidationInfo) entry.getValue()).writeToParcel(parcel, i12);
        }
    }
}
