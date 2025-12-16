package com.avito.android.rating_form.api.remote.model;

import K51.d;
import X41.g;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormAddValueType.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0016\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0010\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(¨\u0006)"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Landroid/os/Parcelable;", "()V", "Action", "Button", "Command", "Dialog", "Done", "DoneButton", "DonePseudoStep", "DoneToast", "DraftCreated", "Error", "FieldUpdate", "FieldsList", "HiddenFields", "RatingFormItem", "RatingFormPromoBlock", "RatingFormText", "RenderList", "StepFinished", "StepValidationFailed", "StepsList", "ValidationFailed", "ValueAccepted", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Action;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DonePseudoStep;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DoneToast;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DraftCreated;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$FieldUpdate;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$FieldsList;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$HiddenFields;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RenderList;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepFinished;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepValidationFailed;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$ValidationFailed;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$ValueAccepted;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class RatingFormAddValueType implements Parcelable {

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Action;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Action$ActionData;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Action$ActionData;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Action$ActionData;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Action$ActionData;", "ActionData", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Action extends RatingFormAddValueType {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new a();

        @c("data")
        @k
        private final ActionData data;

        /* compiled from: RatingFormAddValueType.kt */
        @d
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Action$ActionData;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ActionData implements Parcelable {

            @k
            public static final Parcelable.Creator<ActionData> CREATOR = new a();

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            @l
            private final DeepLink uri;

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ActionData> {
                @Override // android.os.Parcelable.Creator
                public final ActionData createFromParcel(Parcel parcel) {
                    return new ActionData((DeepLink) parcel.readParcelable(ActionData.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ActionData[] newArray(int i12) {
                    return new ActionData[i12];
                }
            }

            public ActionData(@l DeepLink deepLink) {
                this.uri = deepLink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionData) && L.f(this.uri, ((ActionData) obj).uri);
            }

            @l
            public final DeepLink getUri() {
                return this.uri;
            }

            public final int hashCode() {
                DeepLink deepLink = this.uri;
                if (deepLink == null) {
                    return 0;
                }
                return deepLink.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("ActionData(uri="), this.uri, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.uri, i12);
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Action> {
            @Override // android.os.Parcelable.Creator
            public final Action createFromParcel(Parcel parcel) {
                return new Action(ActionData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@k ActionData actionData) {
            super(null);
            this.data = actionData;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final ActionData getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.data.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button;", "Landroid/os/Parcelable;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button$Title;", "title", "Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;", "preset", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command;", "commands", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button$HidingRule;", "hidingRules", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button$Title;Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;Ljava/util/List;Ljava/util/List;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button$Title;", "f", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button$Title;", "Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;", "e", "()Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "HidingRule", "Title", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        @c("commands")
        @k
        private final List<Command> commands;

        @c("hidingRules")
        @l
        private final List<HidingRule> hidingRules;

        @c("preset")
        @k
        private final ButtonStyle preset;

        @c("title")
        @k
        private final Title title;

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button$HidingRule;", "Landroid/os/Parcelable;", "FieldsHaveBeenRevealedRule", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button$HidingRule$FieldsHaveBeenRevealedRule;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public interface HidingRule extends Parcelable {

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button$HidingRule$FieldsHaveBeenRevealedRule;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button$HidingRule;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button$HidingRule$FieldsHaveBeenRevealedRule$Data;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button$HidingRule$FieldsHaveBeenRevealedRule$Data;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button$HidingRule$FieldsHaveBeenRevealedRule$Data;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button$HidingRule$FieldsHaveBeenRevealedRule$Data;", "Data", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class FieldsHaveBeenRevealedRule implements HidingRule {

                @k
                public static final Parcelable.Creator<FieldsHaveBeenRevealedRule> CREATOR = new a();

                @c("data")
                @k
                private final Data data;

                /* compiled from: RatingFormAddValueType.kt */
                @d
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button$HidingRule$FieldsHaveBeenRevealedRule$Data;", "Landroid/os/Parcelable;", "", "", "slugs", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Data implements Parcelable {

                    @k
                    public static final Parcelable.Creator<Data> CREATOR = new a();

                    @c("slugs")
                    @k
                    private final List<String> slugs;

                    /* compiled from: RatingFormAddValueType.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<Data> {
                        @Override // android.os.Parcelable.Creator
                        public final Data createFromParcel(Parcel parcel) {
                            return new Data(parcel.createStringArrayList());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Data[] newArray(int i12) {
                            return new Data[i12];
                        }
                    }

                    public Data(@k List<String> list) {
                        this.slugs = list;
                    }

                    @k
                    public final List<String> c() {
                        return this.slugs;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Data) && L.f(this.slugs, ((Data) obj).slugs);
                    }

                    public final int hashCode() {
                        return this.slugs.hashCode();
                    }

                    @k
                    public final String toString() {
                        return H.p(new StringBuilder("Data(slugs="), this.slugs, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeStringList(this.slugs);
                    }
                }

                /* compiled from: RatingFormAddValueType.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<FieldsHaveBeenRevealedRule> {
                    @Override // android.os.Parcelable.Creator
                    public final FieldsHaveBeenRevealedRule createFromParcel(Parcel parcel) {
                        return new FieldsHaveBeenRevealedRule(Data.CREATOR.createFromParcel(parcel));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final FieldsHaveBeenRevealedRule[] newArray(int i12) {
                        return new FieldsHaveBeenRevealedRule[i12];
                    }
                }

                public FieldsHaveBeenRevealedRule(@k Data data) {
                    this.data = data;
                }

                @k
                /* renamed from: c, reason: from getter */
                public final Data getData() {
                    return this.data;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof FieldsHaveBeenRevealedRule) && L.f(this.data, ((FieldsHaveBeenRevealedRule) obj).data);
                }

                public final int hashCode() {
                    return this.data.hashCode();
                }

                @k
                public final String toString() {
                    return "FieldsHaveBeenRevealedRule(data=" + this.data + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    this.data.writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @d
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button$Title;", "Landroid/os/Parcelable;", "", "default", "emptyFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Title implements Parcelable {

            @k
            public static final Parcelable.Creator<Title> CREATOR = new a();

            @c("default")
            @k
            private final String default;

            @c("emptyFields")
            @l
            private final String emptyFields;

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Title> {
                @Override // android.os.Parcelable.Creator
                public final Title createFromParcel(Parcel parcel) {
                    return new Title(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Title[] newArray(int i12) {
                    return new Title[i12];
                }
            }

            public Title(@k String str, @l String str2) {
                this.default = str;
                this.emptyFields = str2;
            }

            @k
            /* renamed from: c, reason: from getter */
            public final String getDefault() {
                return this.default;
            }

            @l
            /* renamed from: d, reason: from getter */
            public final String getEmptyFields() {
                return this.emptyFields;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Title)) {
                    return false;
                }
                Title title = (Title) obj;
                return L.f(this.default, title.default) && L.f(this.emptyFields, title.emptyFields);
            }

            public final int hashCode() {
                int iHashCode = this.default.hashCode() * 31;
                String str = this.emptyFields;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Title(default=");
                sb2.append(this.default);
                sb2.append(", emptyFields=");
                return C22026a.c(sb2, this.emptyFields, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.default);
                parcel.writeString(this.emptyFields);
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Title titleCreateFromParcel = Title.CREATOR.createFromParcel(parcel);
                ButtonStyle buttonStyleValueOf = ButtonStyle.valueOf(parcel.readString());
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(Button.class, parcel, arrayList2, iL3, 1);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i13 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i13);
                    while (iL2 != i13) {
                        iL2 = com.avito.android.actions_sheet.a.l(Button.class, parcel, arrayList3, iL2, 1);
                    }
                    arrayList = arrayList3;
                }
                return new Button(titleCreateFromParcel, buttonStyleValueOf, arrayList2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Button(@k Title title, @k ButtonStyle buttonStyle, @k List<? extends Command> list, @l List<? extends HidingRule> list2) {
            this.title = title;
            this.preset = buttonStyle;
            this.commands = list;
            this.hidingRules = list2;
        }

        @k
        public final List<Command> c() {
            return this.commands;
        }

        @l
        public final List<HidingRule> d() {
            return this.hidingRules;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final ButtonStyle getPreset() {
            return this.preset;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.title, button.title) && this.preset == button.preset && L.f(this.commands, button.commands) && L.f(this.hidingRules, button.hidingRules);
        }

        @k
        /* renamed from: f, reason: from getter */
        public final Title getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iE2 = H.e((this.preset.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.commands);
            List<HidingRule> list = this.hidingRules;
            return iE2 + (list == null ? 0 : list.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.title);
            sb2.append(", preset=");
            sb2.append(this.preset);
            sb2.append(", commands=");
            sb2.append(this.commands);
            sb2.append(", hidingRules=");
            return H.p(sb2, this.hidingRules, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.title.writeToParcel(parcel, i12);
            parcel.writeString(this.preset.name());
            Iterator itJ = C0.j(this.commands, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            List<HidingRule> list = this.hidingRules;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command;", "Landroid/os/Parcelable;", "CloseCommand", "ControlFieldsCommand", "FinishCommand", "RevealFieldsCommand", "SendDeeplinkCommand", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$CloseCommand;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$ControlFieldsCommand;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$FinishCommand;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$RevealFieldsCommand;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$SendDeeplinkCommand;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public interface Command extends Parcelable {

        /* compiled from: RatingFormAddValueType.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$CloseCommand;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CloseCommand implements Command {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final CloseCommand f247977b = new CloseCommand();

            @k
            public static final Parcelable.Creator<CloseCommand> CREATOR = new a();

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CloseCommand> {
                @Override // android.os.Parcelable.Creator
                public final CloseCommand createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return CloseCommand.f247977b;
                }

                @Override // android.os.Parcelable.Creator
                public final CloseCommand[] newArray(int i12) {
                    return new CloseCommand[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof CloseCommand);
            }

            public final int hashCode() {
                return -1246703757;
            }

            @k
            public final String toString() {
                return "CloseCommand";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$ControlFieldsCommand;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$ControlFieldsCommand$Data;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$ControlFieldsCommand$Data;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$ControlFieldsCommand$Data;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$ControlFieldsCommand$Data;", "Data", "Field", "FieldAction", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class ControlFieldsCommand implements Command {

            @k
            public static final Parcelable.Creator<ControlFieldsCommand> CREATOR = new a();

            @c("data")
            @k
            private final Data data;

            /* compiled from: RatingFormAddValueType.kt */
            @d
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$ControlFieldsCommand$Data;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$ControlFieldsCommand$Field;", LocalPublishState.FIELDS, "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Data implements Parcelable {

                @k
                public static final Parcelable.Creator<Data> CREATOR = new a();

                @c(LocalPublishState.FIELDS)
                @k
                private final List<Field> fields;

                /* compiled from: RatingFormAddValueType.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Data> {
                    @Override // android.os.Parcelable.Creator
                    public final Data createFromParcel(Parcel parcel) {
                        int i12 = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i12);
                        int iC2 = 0;
                        while (iC2 != i12) {
                            iC2 = com.avito.android.actions_sheet.a.c(Field.CREATOR, parcel, arrayList, iC2, 1);
                        }
                        return new Data(arrayList);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Data[] newArray(int i12) {
                        return new Data[i12];
                    }
                }

                public Data(@k List<Field> list) {
                    this.fields = list;
                }

                @k
                public final List<Field> c() {
                    return this.fields;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Data) && L.f(this.fields, ((Data) obj).fields);
                }

                public final int hashCode() {
                    return this.fields.hashCode();
                }

                @k
                public final String toString() {
                    return H.p(new StringBuilder("Data(fields="), this.fields, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    Iterator itJ = C0.j(this.fields, parcel);
                    while (itJ.hasNext()) {
                        ((Field) itJ.next()).writeToParcel(parcel, i12);
                    }
                }
            }

            /* compiled from: RatingFormAddValueType.kt */
            @d
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$ControlFieldsCommand$Field;", "Landroid/os/Parcelable;", "", "slug", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$ControlFieldsCommand$FieldAction;", "action", "<init>", "(Ljava/lang/String;Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$ControlFieldsCommand$FieldAction;)V", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$ControlFieldsCommand$FieldAction;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$ControlFieldsCommand$FieldAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Field implements Parcelable {

                @k
                public static final Parcelable.Creator<Field> CREATOR = new a();

                @c("action")
                @k
                private final FieldAction action;

                @c("slug")
                @k
                private final String slug;

                /* compiled from: RatingFormAddValueType.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Field> {
                    @Override // android.os.Parcelable.Creator
                    public final Field createFromParcel(Parcel parcel) {
                        return new Field(parcel.readString(), FieldAction.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Field[] newArray(int i12) {
                        return new Field[i12];
                    }
                }

                public Field(@k String str, @k FieldAction fieldAction) {
                    this.slug = str;
                    this.action = fieldAction;
                }

                @k
                /* renamed from: c, reason: from getter */
                public final FieldAction getAction() {
                    return this.action;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Field)) {
                        return false;
                    }
                    Field field = (Field) obj;
                    return L.f(this.slug, field.slug) && this.action == field.action;
                }

                @k
                public final String getSlug() {
                    return this.slug;
                }

                public final int hashCode() {
                    return this.action.hashCode() + (this.slug.hashCode() * 31);
                }

                @k
                public final String toString() {
                    return "Field(slug=" + this.slug + ", action=" + this.action + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.slug);
                    parcel.writeString(this.action.name());
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$ControlFieldsCommand$FieldAction;", "", "(Ljava/lang/String;I)V", "OPEN_DOCUMENT_PICKER", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class FieldAction {

                @c("openDocumentPicker")
                public static final FieldAction OPEN_DOCUMENT_PICKER;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ FieldAction[] f247978b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f247979c;

                static {
                    FieldAction fieldAction = new FieldAction("OPEN_DOCUMENT_PICKER", 0);
                    OPEN_DOCUMENT_PICKER = fieldAction;
                    FieldAction[] fieldActionArr = {fieldAction};
                    f247978b = fieldActionArr;
                    f247979c = kotlin.enums.c.a(fieldActionArr);
                }

                private FieldAction(String str, int i12) {
                }

                public static FieldAction valueOf(String str) {
                    return (FieldAction) Enum.valueOf(FieldAction.class, str);
                }

                public static FieldAction[] values() {
                    return (FieldAction[]) f247978b.clone();
                }
            }

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ControlFieldsCommand> {
                @Override // android.os.Parcelable.Creator
                public final ControlFieldsCommand createFromParcel(Parcel parcel) {
                    return new ControlFieldsCommand(Data.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final ControlFieldsCommand[] newArray(int i12) {
                    return new ControlFieldsCommand[i12];
                }
            }

            public ControlFieldsCommand(@k Data data) {
                this.data = data;
            }

            @k
            /* renamed from: c, reason: from getter */
            public final Data getData() {
                return this.data;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ControlFieldsCommand) && L.f(this.data, ((ControlFieldsCommand) obj).data);
            }

            public final int hashCode() {
                return this.data.hashCode();
            }

            @k
            public final String toString() {
                return "ControlFieldsCommand(data=" + this.data + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                this.data.writeToParcel(parcel, i12);
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$FinishCommand;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FinishCommand implements Command {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final FinishCommand f247980b = new FinishCommand();

            @k
            public static final Parcelable.Creator<FinishCommand> CREATOR = new a();

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<FinishCommand> {
                @Override // android.os.Parcelable.Creator
                public final FinishCommand createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return FinishCommand.f247980b;
                }

                @Override // android.os.Parcelable.Creator
                public final FinishCommand[] newArray(int i12) {
                    return new FinishCommand[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof FinishCommand);
            }

            public final int hashCode() {
                return -1606387208;
            }

            @k
            public final String toString() {
                return "FinishCommand";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$RevealFieldsCommand;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$RevealFieldsCommand$Data;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$RevealFieldsCommand$Data;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$RevealFieldsCommand$Data;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$RevealFieldsCommand$Data;", "Data", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class RevealFieldsCommand implements Command {

            @k
            public static final Parcelable.Creator<RevealFieldsCommand> CREATOR = new a();

            @c("data")
            @k
            private final Data data;

            /* compiled from: RatingFormAddValueType.kt */
            @d
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$RevealFieldsCommand$Data;", "Landroid/os/Parcelable;", "", "", "slugs", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Data implements Parcelable {

                @k
                public static final Parcelable.Creator<Data> CREATOR = new a();

                @c("slugs")
                @k
                private final List<List<String>> slugs;

                /* compiled from: RatingFormAddValueType.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Data> {
                    @Override // android.os.Parcelable.Creator
                    public final Data createFromParcel(Parcel parcel) {
                        int i12 = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i12);
                        for (int i13 = 0; i13 != i12; i13++) {
                            arrayList.add(parcel.createStringArrayList());
                        }
                        return new Data(arrayList);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Data[] newArray(int i12) {
                        return new Data[i12];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Data(@k List<? extends List<String>> list) {
                    this.slugs = list;
                }

                @k
                public final List<List<String>> c() {
                    return this.slugs;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Data) && L.f(this.slugs, ((Data) obj).slugs);
                }

                public final int hashCode() {
                    return this.slugs.hashCode();
                }

                @k
                public final String toString() {
                    return H.p(new StringBuilder("Data(slugs="), this.slugs, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    Iterator itJ = C0.j(this.slugs, parcel);
                    while (itJ.hasNext()) {
                        parcel.writeStringList((List) itJ.next());
                    }
                }
            }

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RevealFieldsCommand> {
                @Override // android.os.Parcelable.Creator
                public final RevealFieldsCommand createFromParcel(Parcel parcel) {
                    return new RevealFieldsCommand(Data.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final RevealFieldsCommand[] newArray(int i12) {
                    return new RevealFieldsCommand[i12];
                }
            }

            public RevealFieldsCommand(@k Data data) {
                this.data = data;
            }

            @k
            /* renamed from: c, reason: from getter */
            public final Data getData() {
                return this.data;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RevealFieldsCommand) && L.f(this.data, ((RevealFieldsCommand) obj).data);
            }

            public final int hashCode() {
                return this.data.hashCode();
            }

            @k
            public final String toString() {
                return "RevealFieldsCommand(data=" + this.data + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                this.data.writeToParcel(parcel, i12);
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$SendDeeplinkCommand;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$SendDeeplinkCommand$Data;", "data", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$SendDeeplinkCommand$Data;", "getData", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$SendDeeplinkCommand$Data;", "Data", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        @g
        public static final class SendDeeplinkCommand implements Command {

            @k
            public static final Parcelable.Creator<SendDeeplinkCommand> CREATOR = new a();

            @c("data")
            @k
            private final Data data;

            /* compiled from: RatingFormAddValueType.kt */
            @d
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command$SendDeeplinkCommand$Data;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Data implements Parcelable {

                @k
                public static final Parcelable.Creator<Data> CREATOR = new a();

                @c(TooltipAttribute.PARAM_DEEP_LINK)
                @k
                private final DeepLink uri;

                /* compiled from: RatingFormAddValueType.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Data> {
                    @Override // android.os.Parcelable.Creator
                    public final Data createFromParcel(Parcel parcel) {
                        return new Data((DeepLink) parcel.readParcelable(Data.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Data[] newArray(int i12) {
                        return new Data[i12];
                    }
                }

                public Data(@k DeepLink deepLink) {
                    this.uri = deepLink;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Data) && L.f(this.uri, ((Data) obj).uri);
                }

                @k
                public final DeepLink getUri() {
                    return this.uri;
                }

                public final int hashCode() {
                    return this.uri.hashCode();
                }

                @k
                public final String toString() {
                    return com.avito.android.actions_sheet.a.v(new StringBuilder("Data(uri="), this.uri, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeParcelable(this.uri, i12);
                }
            }

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SendDeeplinkCommand> {
                @Override // android.os.Parcelable.Creator
                public final SendDeeplinkCommand createFromParcel(Parcel parcel) {
                    return SendDeeplinkCommand.a(Data.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final SendDeeplinkCommand[] newArray(int i12) {
                    return new SendDeeplinkCommand[i12];
                }
            }

            private /* synthetic */ SendDeeplinkCommand(Data data) {
                this.data = data;
            }

            public static final /* synthetic */ SendDeeplinkCommand a(Data data) {
                return new SendDeeplinkCommand(data);
            }

            /* renamed from: c, reason: from getter */
            public final /* synthetic */ Data getData() {
                return this.data;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return (obj instanceof SendDeeplinkCommand) && L.f(this.data, ((SendDeeplinkCommand) obj).data);
            }

            public final int hashCode() {
                return this.data.hashCode();
            }

            public final String toString() {
                return "SendDeeplinkCommand(data=" + this.data + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                this.data.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002\t\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData;", "DialogData", "ViewType", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Dialog extends RatingFormAddValueType {

        @k
        public static final Parcelable.Creator<Dialog> CREATOR = new a();

        @c("data")
        @k
        private final DialogData data;

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dBC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "content", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction;", "actions", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$OnCloseAction;", BeduinPromoBlockModel.SERIALIZED_NAME_ON_CLOSE_ACTIONS, "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$ViewType;", "viewType", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/util/List;Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$ViewType;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "d", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$ViewType;", "e", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$ViewType;", "DialogAction", "OnCloseAction", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class DialogData implements Parcelable {

            @k
            public static final Parcelable.Creator<DialogData> CREATOR = new a();

            @c("actions")
            @l
            private final List<DialogAction> actions;

            @c("content")
            @k
            private final AttributedText content;

            @c(BeduinPromoBlockModel.SERIALIZED_NAME_ON_CLOSE_ACTIONS)
            @l
            private final List<OnCloseAction> onCloseActions;

            @c("title")
            @l
            private final String title;

            @c("viewType")
            @l
            private final ViewType viewType;

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction;", "Landroid/os/Parcelable;", "AuthDialogAction", "CloseDialogAction", "UpdateStateDialogAction", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction$AuthDialogAction;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction$CloseDialogAction;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction$UpdateStateDialogAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public interface DialogAction extends Parcelable {

                /* compiled from: RatingFormAddValueType.kt */
                @d
                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction$AuthDialogAction;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction;", "", "title", "Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/deep_linking/links/DeepLink;", "analytics", "<init>", "(Ljava/lang/String;Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;", "d", "()Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class AuthDialogAction implements DialogAction {

                    @k
                    public static final Parcelable.Creator<AuthDialogAction> CREATOR = new a();

                    @c("analytics")
                    @l
                    private final DeepLink analytics;

                    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
                    @k
                    private final ButtonStyle style;

                    @c("title")
                    @k
                    private final String title;

                    /* compiled from: RatingFormAddValueType.kt */
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

                    public AuthDialogAction(@k String str, @k ButtonStyle buttonStyle, @l DeepLink deepLink) {
                        this.title = str;
                        this.style = buttonStyle;
                        this.analytics = deepLink;
                    }

                    @l
                    /* renamed from: c, reason: from getter */
                    public final DeepLink getAnalytics() {
                        return this.analytics;
                    }

                    @k
                    /* renamed from: d, reason: from getter */
                    public final ButtonStyle getStyle() {
                        return this.style;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof AuthDialogAction)) {
                            return false;
                        }
                        AuthDialogAction authDialogAction = (AuthDialogAction) obj;
                        return L.f(this.title, authDialogAction.title) && this.style == authDialogAction.style && L.f(this.analytics, authDialogAction.analytics);
                    }

                    @k
                    public final String getTitle() {
                        return this.title;
                    }

                    public final int hashCode() {
                        int iHashCode = (this.style.hashCode() + (this.title.hashCode() * 31)) * 31;
                        DeepLink deepLink = this.analytics;
                        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
                    }

                    @k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("AuthDialogAction(title=");
                        sb2.append(this.title);
                        sb2.append(", style=");
                        sb2.append(this.style);
                        sb2.append(", analytics=");
                        return com.avito.android.actions_sheet.a.v(sb2, this.analytics, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeString(this.title);
                        parcel.writeString(this.style.name());
                        parcel.writeParcelable(this.analytics, i12);
                    }
                }

                /* compiled from: RatingFormAddValueType.kt */
                @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction$CloseDialogAction;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction;", "", "title", "Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/deep_linking/links/DeepLink;", "analytics", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction$CloseDialogAction$Focus;", "focus", "<init>", "(Ljava/lang/String;Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction$CloseDialogAction$Focus;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;", "e", "()Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction$CloseDialogAction$Focus;", "d", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction$CloseDialogAction$Focus;", "Focus", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @d
                public static final /* data */ class CloseDialogAction implements DialogAction {

                    @k
                    public static final Parcelable.Creator<CloseDialogAction> CREATOR = new a();

                    @c("analytics")
                    @l
                    private final DeepLink analytics;

                    @c("focus")
                    @k
                    private final Focus focus;

                    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
                    @k
                    private final ButtonStyle style;

                    @c("title")
                    @k
                    private final String title;

                    /* compiled from: RatingFormAddValueType.kt */
                    @d
                    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction$CloseDialogAction$Focus;", "Landroid/os/Parcelable;", "", "fieldSlug", "stepSlug", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final /* data */ class Focus implements Parcelable {

                        @k
                        public static final Parcelable.Creator<Focus> CREATOR = new a();

                        @c("fieldSlug")
                        @k
                        private final String fieldSlug;

                        @c("stepSlug")
                        @k
                        private final String stepSlug;

                        /* compiled from: RatingFormAddValueType.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        public static final class a implements Parcelable.Creator<Focus> {
                            @Override // android.os.Parcelable.Creator
                            public final Focus createFromParcel(Parcel parcel) {
                                return new Focus(parcel.readString(), parcel.readString());
                            }

                            @Override // android.os.Parcelable.Creator
                            public final Focus[] newArray(int i12) {
                                return new Focus[i12];
                            }
                        }

                        public Focus(@k String str, @k String str2) {
                            this.fieldSlug = str;
                            this.stepSlug = str2;
                        }

                        @k
                        /* renamed from: c, reason: from getter */
                        public final String getFieldSlug() {
                            return this.fieldSlug;
                        }

                        @k
                        /* renamed from: d, reason: from getter */
                        public final String getStepSlug() {
                            return this.stepSlug;
                        }

                        @Override // android.os.Parcelable
                        public final int describeContents() {
                            return 0;
                        }

                        public final boolean equals(@l Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Focus)) {
                                return false;
                            }
                            Focus focus = (Focus) obj;
                            return L.f(this.fieldSlug, focus.fieldSlug) && L.f(this.stepSlug, focus.stepSlug);
                        }

                        public final int hashCode() {
                            return this.stepSlug.hashCode() + (this.fieldSlug.hashCode() * 31);
                        }

                        @k
                        public final String toString() {
                            StringBuilder sb2 = new StringBuilder("Focus(fieldSlug=");
                            sb2.append(this.fieldSlug);
                            sb2.append(", stepSlug=");
                            return C22026a.c(sb2, this.stepSlug, ')');
                        }

                        @Override // android.os.Parcelable
                        public final void writeToParcel(@k Parcel parcel, int i12) {
                            parcel.writeString(this.fieldSlug);
                            parcel.writeString(this.stepSlug);
                        }
                    }

                    /* compiled from: RatingFormAddValueType.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<CloseDialogAction> {
                        @Override // android.os.Parcelable.Creator
                        public final CloseDialogAction createFromParcel(Parcel parcel) {
                            return new CloseDialogAction(parcel.readString(), ButtonStyle.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(CloseDialogAction.class.getClassLoader()), Focus.CREATOR.createFromParcel(parcel));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final CloseDialogAction[] newArray(int i12) {
                            return new CloseDialogAction[i12];
                        }
                    }

                    public CloseDialogAction(@k String str, @k ButtonStyle buttonStyle, @l DeepLink deepLink, @k Focus focus) {
                        this.title = str;
                        this.style = buttonStyle;
                        this.analytics = deepLink;
                        this.focus = focus;
                    }

                    @l
                    /* renamed from: c, reason: from getter */
                    public final DeepLink getAnalytics() {
                        return this.analytics;
                    }

                    @k
                    /* renamed from: d, reason: from getter */
                    public final Focus getFocus() {
                        return this.focus;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    @k
                    /* renamed from: e, reason: from getter */
                    public final ButtonStyle getStyle() {
                        return this.style;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof CloseDialogAction)) {
                            return false;
                        }
                        CloseDialogAction closeDialogAction = (CloseDialogAction) obj;
                        return L.f(this.title, closeDialogAction.title) && this.style == closeDialogAction.style && L.f(this.analytics, closeDialogAction.analytics) && L.f(this.focus, closeDialogAction.focus);
                    }

                    @k
                    public final String getTitle() {
                        return this.title;
                    }

                    public final int hashCode() {
                        int iHashCode = (this.style.hashCode() + (this.title.hashCode() * 31)) * 31;
                        DeepLink deepLink = this.analytics;
                        return this.focus.hashCode() + ((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
                    }

                    @k
                    public final String toString() {
                        return "CloseDialogAction(title=" + this.title + ", style=" + this.style + ", analytics=" + this.analytics + ", focus=" + this.focus + ')';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeString(this.title);
                        parcel.writeString(this.style.name());
                        parcel.writeParcelable(this.analytics, i12);
                        this.focus.writeToParcel(parcel, i12);
                    }
                }

                /* compiled from: RatingFormAddValueType.kt */
                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction$UpdateStateDialogAction;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction;", "", "title", "Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/deep_linking/links/DeepLink;", "analytics", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction$UpdateStateDialogAction$NewStateValue;", "newStateValues", "<init>", "(Ljava/lang/String;Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;", "e", "()Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "d", "()Ljava/util/List;", "NewStateValue", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @d
                public static final /* data */ class UpdateStateDialogAction implements DialogAction {

                    @k
                    public static final Parcelable.Creator<UpdateStateDialogAction> CREATOR = new a();

                    @c("analytics")
                    @l
                    private final DeepLink analytics;

                    @c("newStateValues")
                    @k
                    private final List<NewStateValue> newStateValues;

                    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
                    @k
                    private final ButtonStyle style;

                    @c("title")
                    @k
                    private final String title;

                    /* compiled from: RatingFormAddValueType.kt */
                    @d
                    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction$UpdateStateDialogAction$NewStateValue;", "Landroid/os/Parcelable;", "", "path", "", "value", "<init>", "(Ljava/lang/String;Z)V", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "Z", "c", "()Z", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final /* data */ class NewStateValue implements Parcelable {

                        @k
                        public static final Parcelable.Creator<NewStateValue> CREATOR = new a();

                        @c("path")
                        @k
                        private final String path;

                        @c("value")
                        private final boolean value;

                        /* compiled from: RatingFormAddValueType.kt */
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

                        public NewStateValue(@k String str, boolean z12) {
                            this.path = str;
                            this.value = z12;
                        }

                        /* renamed from: c, reason: from getter */
                        public final boolean getValue() {
                            return this.value;
                        }

                        @Override // android.os.Parcelable
                        public final int describeContents() {
                            return 0;
                        }

                        public final boolean equals(@l Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof NewStateValue)) {
                                return false;
                            }
                            NewStateValue newStateValue = (NewStateValue) obj;
                            return L.f(this.path, newStateValue.path) && this.value == newStateValue.value;
                        }

                        @k
                        public final String getPath() {
                            return this.path;
                        }

                        public final int hashCode() {
                            return Boolean.hashCode(this.value) + (this.path.hashCode() * 31);
                        }

                        @k
                        public final String toString() {
                            StringBuilder sb2 = new StringBuilder("NewStateValue(path=");
                            sb2.append(this.path);
                            sb2.append(", value=");
                            return r.x(sb2, this.value, ')');
                        }

                        @Override // android.os.Parcelable
                        public final void writeToParcel(@k Parcel parcel, int i12) {
                            parcel.writeString(this.path);
                            parcel.writeInt(this.value ? 1 : 0);
                        }
                    }

                    /* compiled from: RatingFormAddValueType.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<UpdateStateDialogAction> {
                        @Override // android.os.Parcelable.Creator
                        public final UpdateStateDialogAction createFromParcel(Parcel parcel) {
                            String string = parcel.readString();
                            ButtonStyle buttonStyleValueOf = ButtonStyle.valueOf(parcel.readString());
                            DeepLink deepLink = (DeepLink) parcel.readParcelable(UpdateStateDialogAction.class.getClassLoader());
                            int i12 = parcel.readInt();
                            ArrayList arrayList = new ArrayList(i12);
                            int iC2 = 0;
                            while (iC2 != i12) {
                                iC2 = com.avito.android.actions_sheet.a.c(NewStateValue.CREATOR, parcel, arrayList, iC2, 1);
                            }
                            return new UpdateStateDialogAction(string, buttonStyleValueOf, deepLink, arrayList);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final UpdateStateDialogAction[] newArray(int i12) {
                            return new UpdateStateDialogAction[i12];
                        }
                    }

                    public UpdateStateDialogAction(@k String str, @k ButtonStyle buttonStyle, @l DeepLink deepLink, @k List<NewStateValue> list) {
                        this.title = str;
                        this.style = buttonStyle;
                        this.analytics = deepLink;
                        this.newStateValues = list;
                    }

                    @l
                    /* renamed from: c, reason: from getter */
                    public final DeepLink getAnalytics() {
                        return this.analytics;
                    }

                    @k
                    public final List<NewStateValue> d() {
                        return this.newStateValues;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    @k
                    /* renamed from: e, reason: from getter */
                    public final ButtonStyle getStyle() {
                        return this.style;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof UpdateStateDialogAction)) {
                            return false;
                        }
                        UpdateStateDialogAction updateStateDialogAction = (UpdateStateDialogAction) obj;
                        return L.f(this.title, updateStateDialogAction.title) && this.style == updateStateDialogAction.style && L.f(this.analytics, updateStateDialogAction.analytics) && L.f(this.newStateValues, updateStateDialogAction.newStateValues);
                    }

                    @k
                    public final String getTitle() {
                        return this.title;
                    }

                    public final int hashCode() {
                        int iHashCode = (this.style.hashCode() + (this.title.hashCode() * 31)) * 31;
                        DeepLink deepLink = this.analytics;
                        return this.newStateValues.hashCode() + ((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
                    }

                    @k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("UpdateStateDialogAction(title=");
                        sb2.append(this.title);
                        sb2.append(", style=");
                        sb2.append(this.style);
                        sb2.append(", analytics=");
                        sb2.append(this.analytics);
                        sb2.append(", newStateValues=");
                        return H.p(sb2, this.newStateValues, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeString(this.title);
                        parcel.writeString(this.style.name());
                        parcel.writeParcelable(this.analytics, i12);
                        Iterator itJ = C0.j(this.newStateValues, parcel);
                        while (itJ.hasNext()) {
                            ((NewStateValue) itJ.next()).writeToParcel(parcel, i12);
                        }
                    }
                }
            }

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$OnCloseAction;", "Landroid/os/Parcelable;", "FocusFieldAction", "SendAnalyticsAction", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$OnCloseAction$FocusFieldAction;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$OnCloseAction$SendAnalyticsAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public interface OnCloseAction extends Parcelable {

                /* compiled from: RatingFormAddValueType.kt */
                @d
                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$OnCloseAction$FocusFieldAction;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$OnCloseAction;", "", "fieldSlug", "stepSlug", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class FocusFieldAction implements OnCloseAction {

                    @k
                    public static final Parcelable.Creator<FocusFieldAction> CREATOR = new a();

                    @c("fieldSlug")
                    @k
                    private final String fieldSlug;

                    @c("stepSlug")
                    @k
                    private final String stepSlug;

                    /* compiled from: RatingFormAddValueType.kt */
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

                    public FocusFieldAction(@k String str, @k String str2) {
                        this.fieldSlug = str;
                        this.stepSlug = str2;
                    }

                    @k
                    /* renamed from: c, reason: from getter */
                    public final String getFieldSlug() {
                        return this.fieldSlug;
                    }

                    @k
                    /* renamed from: d, reason: from getter */
                    public final String getStepSlug() {
                        return this.stepSlug;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof FocusFieldAction)) {
                            return false;
                        }
                        FocusFieldAction focusFieldAction = (FocusFieldAction) obj;
                        return L.f(this.fieldSlug, focusFieldAction.fieldSlug) && L.f(this.stepSlug, focusFieldAction.stepSlug);
                    }

                    public final int hashCode() {
                        return this.stepSlug.hashCode() + (this.fieldSlug.hashCode() * 31);
                    }

                    @k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("FocusFieldAction(fieldSlug=");
                        sb2.append(this.fieldSlug);
                        sb2.append(", stepSlug=");
                        return C22026a.c(sb2, this.stepSlug, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeString(this.fieldSlug);
                        parcel.writeString(this.stepSlug);
                    }
                }

                /* compiled from: RatingFormAddValueType.kt */
                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$OnCloseAction$SendAnalyticsAction;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$OnCloseAction;", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @d
                @g
                public static final class SendAnalyticsAction implements OnCloseAction {

                    @k
                    public static final Parcelable.Creator<SendAnalyticsAction> CREATOR = new a();

                    @c(TooltipAttribute.PARAM_DEEP_LINK)
                    @k
                    private final DeepLink uri;

                    /* compiled from: RatingFormAddValueType.kt */
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
                        this.uri = deepLink;
                    }

                    public static final /* synthetic */ SendAnalyticsAction a(DeepLink deepLink) {
                        return new SendAnalyticsAction(deepLink);
                    }

                    /* renamed from: c, reason: from getter */
                    public final /* synthetic */ DeepLink getUri() {
                        return this.uri;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        return (obj instanceof SendAnalyticsAction) && L.f(this.uri, ((SendAnalyticsAction) obj).uri);
                    }

                    public final int hashCode() {
                        return this.uri.hashCode();
                    }

                    public final String toString() {
                        return "SendAnalyticsAction(uri=" + this.uri + ')';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeParcelable(this.uri, i12);
                    }
                }
            }

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<DialogData> {
                @Override // android.os.Parcelable.Creator
                public final DialogData createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    String string = parcel.readString();
                    AttributedText attributedText = (AttributedText) parcel.readParcelable(DialogData.class.getClassLoader());
                    int iL2 = 0;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(i12);
                        int iL3 = 0;
                        while (iL3 != i12) {
                            iL3 = com.avito.android.actions_sheet.a.l(DialogData.class, parcel, arrayList3, iL3, 1);
                        }
                        arrayList = arrayList3;
                    }
                    if (parcel.readInt() == 0) {
                        arrayList2 = null;
                    } else {
                        int i13 = parcel.readInt();
                        ArrayList arrayList4 = new ArrayList(i13);
                        while (iL2 != i13) {
                            iL2 = com.avito.android.actions_sheet.a.l(DialogData.class, parcel, arrayList4, iL2, 1);
                        }
                        arrayList2 = arrayList4;
                    }
                    return new DialogData(string, attributedText, arrayList, arrayList2, parcel.readInt() != 0 ? ViewType.valueOf(parcel.readString()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final DialogData[] newArray(int i12) {
                    return new DialogData[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public DialogData(@l String str, @k AttributedText attributedText, @l List<? extends DialogAction> list, @l List<? extends OnCloseAction> list2, @l ViewType viewType) {
                this.title = str;
                this.content = attributedText;
                this.actions = list;
                this.onCloseActions = list2;
                this.viewType = viewType;
            }

            @k
            /* renamed from: c, reason: from getter */
            public final AttributedText getContent() {
                return this.content;
            }

            @l
            public final List<OnCloseAction> d() {
                return this.onCloseActions;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final ViewType getViewType() {
                return this.viewType;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DialogData)) {
                    return false;
                }
                DialogData dialogData = (DialogData) obj;
                return L.f(this.title, dialogData.title) && L.f(this.content, dialogData.content) && L.f(this.actions, dialogData.actions) && L.f(this.onCloseActions, dialogData.onCloseActions) && this.viewType == dialogData.viewType;
            }

            @l
            public final List<DialogAction> getActions() {
                return this.actions;
            }

            @l
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                String str = this.title;
                int iB2 = com.avito.android.actions_sheet.a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.content);
                List<DialogAction> list = this.actions;
                int iHashCode = (iB2 + (list == null ? 0 : list.hashCode())) * 31;
                List<OnCloseAction> list2 = this.onCloseActions;
                int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
                ViewType viewType = this.viewType;
                return iHashCode2 + (viewType != null ? viewType.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "DialogData(title=" + this.title + ", content=" + this.content + ", actions=" + this.actions + ", onCloseActions=" + this.onCloseActions + ", viewType=" + this.viewType + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.title);
                parcel.writeParcelable(this.content, i12);
                List<DialogAction> list = this.actions;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA.next(), i12);
                    }
                }
                List<OnCloseAction> list2 = this.onCloseActions;
                if (list2 == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
                    while (itA2.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA2.next(), i12);
                    }
                }
                ViewType viewType = this.viewType;
                if (viewType == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(viewType.name());
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$ViewType;", "", "(Ljava/lang/String;I)V", "BOTTOM_SHEET", "FULLSCREEN", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ViewType {

            @c("bottom_sheet")
            public static final ViewType BOTTOM_SHEET;

            @c("fullscreen")
            public static final ViewType FULLSCREEN;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ ViewType[] f247981b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f247982c;

            static {
                ViewType viewType = new ViewType("BOTTOM_SHEET", 0);
                BOTTOM_SHEET = viewType;
                ViewType viewType2 = new ViewType("FULLSCREEN", 1);
                FULLSCREEN = viewType2;
                ViewType[] viewTypeArr = {viewType, viewType2};
                f247981b = viewTypeArr;
                f247982c = kotlin.enums.c.a(viewTypeArr);
            }

            private ViewType(String str, int i12) {
            }

            public static ViewType valueOf(String str) {
                return (ViewType) Enum.valueOf(ViewType.class, str);
            }

            public static ViewType[] values() {
                return (ViewType[]) f247981b.clone();
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Dialog> {
            @Override // android.os.Parcelable.Creator
            public final Dialog createFromParcel(Parcel parcel) {
                return new Dialog(DialogData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Dialog[] newArray(int i12) {
                return new Dialog[i12];
            }
        }

        public Dialog(@k DialogData dialogData) {
            super(null);
            this.data = dialogData;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final DialogData getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.data.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done$DoneData;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done$DoneData;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done$DoneData;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done$DoneData;", "DoneData", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Done extends RatingFormAddValueType {

        @k
        public static final Parcelable.Creator<Done> CREATOR = new a();

        @c("data")
        @k
        private final DoneData data;

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001f BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done$DoneData;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done$DoneData$Action;", "action", "message", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done$DoneData$ViewType;", "viewType", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "refreshScreen", "<init>", "(Ljava/lang/String;Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done$DoneData$Action;Ljava/lang/String;Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done$DoneData$ViewType;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done$DoneData$Action;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done$DoneData$Action;", "getMessage", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done$DoneData$ViewType;", "e", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done$DoneData$ViewType;", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "Action", "ViewType", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class DoneData implements Parcelable {

            @k
            public static final Parcelable.Creator<DoneData> CREATOR = new a();

            @c("action")
            @l
            private final Action action;

            @c("image")
            @l
            private final UniversalImage image;

            @c("message")
            @l
            private final String message;

            @c("refreshScreen")
            @l
            private final Boolean refreshScreen;

            @c("title")
            @k
            private final String title;

            @c("viewType")
            @l
            private final ViewType viewType;

            /* compiled from: RatingFormAddValueType.kt */
            @d
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done$DoneData$Action;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Action implements Parcelable {

                @k
                public static final Parcelable.Creator<Action> CREATOR = new a();

                @c("title")
                @l
                private final String title;

                @c(TooltipAttribute.PARAM_DEEP_LINK)
                @l
                private final DeepLink uri;

                /* compiled from: RatingFormAddValueType.kt */
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

                public Action(@l String str, @l DeepLink deepLink) {
                    this.title = str;
                    this.uri = deepLink;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Action)) {
                        return false;
                    }
                    Action action = (Action) obj;
                    return L.f(this.title, action.title) && L.f(this.uri, action.uri);
                }

                @l
                public final String getTitle() {
                    return this.title;
                }

                @l
                public final DeepLink getUri() {
                    return this.uri;
                }

                public final int hashCode() {
                    String str = this.title;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    DeepLink deepLink = this.uri;
                    return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Action(title=");
                    sb2.append(this.title);
                    sb2.append(", uri=");
                    return com.avito.android.actions_sheet.a.v(sb2, this.uri, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.title);
                    parcel.writeParcelable(this.uri, i12);
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Done$DoneData$ViewType;", "", "(Ljava/lang/String;I)V", "SCREEN", "TOAST", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ViewType {

                @c("screen")
                public static final ViewType SCREEN;

                @c("toast")
                public static final ViewType TOAST;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ ViewType[] f247983b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f247984c;

                static {
                    ViewType viewType = new ViewType("SCREEN", 0);
                    SCREEN = viewType;
                    ViewType viewType2 = new ViewType("TOAST", 1);
                    TOAST = viewType2;
                    ViewType[] viewTypeArr = {viewType, viewType2};
                    f247983b = viewTypeArr;
                    f247984c = kotlin.enums.c.a(viewTypeArr);
                }

                private ViewType(String str, int i12) {
                }

                public static ViewType valueOf(String str) {
                    return (ViewType) Enum.valueOf(ViewType.class, str);
                }

                public static ViewType[] values() {
                    return (ViewType[]) f247983b.clone();
                }
            }

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<DoneData> {
                @Override // android.os.Parcelable.Creator
                public final DoneData createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    String string = parcel.readString();
                    Action actionCreateFromParcel = parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel);
                    String string2 = parcel.readString();
                    ViewType viewTypeValueOf = parcel.readInt() == 0 ? null : ViewType.valueOf(parcel.readString());
                    UniversalImage universalImage = (UniversalImage) parcel.readParcelable(DoneData.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new DoneData(string, actionCreateFromParcel, string2, viewTypeValueOf, universalImage, boolValueOf);
                }

                @Override // android.os.Parcelable.Creator
                public final DoneData[] newArray(int i12) {
                    return new DoneData[i12];
                }
            }

            public DoneData(@k String str, @l Action action, @l String str2, @l ViewType viewType, @l UniversalImage universalImage, @l Boolean bool) {
                this.title = str;
                this.action = action;
                this.message = str2;
                this.viewType = viewType;
                this.image = universalImage;
                this.refreshScreen = bool;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final Action getAction() {
                return this.action;
            }

            @l
            /* renamed from: d, reason: from getter */
            public final Boolean getRefreshScreen() {
                return this.refreshScreen;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final ViewType getViewType() {
                return this.viewType;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DoneData)) {
                    return false;
                }
                DoneData doneData = (DoneData) obj;
                return L.f(this.title, doneData.title) && L.f(this.action, doneData.action) && L.f(this.message, doneData.message) && this.viewType == doneData.viewType && L.f(this.image, doneData.image) && L.f(this.refreshScreen, doneData.refreshScreen);
            }

            @l
            public final UniversalImage getImage() {
                return this.image;
            }

            @l
            public final String getMessage() {
                return this.message;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                Action action = this.action;
                int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
                String str = this.message;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                ViewType viewType = this.viewType;
                int iHashCode4 = (iHashCode3 + (viewType == null ? 0 : viewType.hashCode())) * 31;
                UniversalImage universalImage = this.image;
                int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
                Boolean bool = this.refreshScreen;
                return iHashCode5 + (bool != null ? bool.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("DoneData(title=");
                sb2.append(this.title);
                sb2.append(", action=");
                sb2.append(this.action);
                sb2.append(", message=");
                sb2.append(this.message);
                sb2.append(", viewType=");
                sb2.append(this.viewType);
                sb2.append(", image=");
                sb2.append(this.image);
                sb2.append(", refreshScreen=");
                return C0.g(sb2, this.refreshScreen, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.title);
                Action action = this.action;
                if (action == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    action.writeToParcel(parcel, i12);
                }
                parcel.writeString(this.message);
                ViewType viewType = this.viewType;
                if (viewType == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(viewType.name());
                }
                parcel.writeParcelable(this.image, i12);
                Boolean bool = this.refreshScreen;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Done> {
            @Override // android.os.Parcelable.Creator
            public final Done createFromParcel(Parcel parcel) {
                return new Done(DoneData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Done[] newArray(int i12) {
                return new Done[i12];
            }
        }

        public Done(@k DoneData doneData) {
            super(null);
            this.data = doneData;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final DoneData getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.data.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @d
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DoneButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;", "preset", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Command;", "commands", "<init>", "(Ljava/lang/String;Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;", "d", "()Lcom/avito/android/rating_form/api/remote/model/ButtonStyle;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DoneButton implements Parcelable {

        @k
        public static final Parcelable.Creator<DoneButton> CREATOR = new a();

        @c("commands")
        @l
        private final List<Command> commands;

        @c("preset")
        @l
        private final ButtonStyle preset;

        @c("title")
        @k
        private final String title;

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DoneButton> {
            @Override // android.os.Parcelable.Creator
            public final DoneButton createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                ArrayList arrayList = null;
                ButtonStyle buttonStyleValueOf = parcel.readInt() == 0 ? null : ButtonStyle.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(DoneButton.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new DoneButton(string, buttonStyleValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final DoneButton[] newArray(int i12) {
                return new DoneButton[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DoneButton(@k String str, @l ButtonStyle buttonStyle, @l List<? extends Command> list) {
            this.title = str;
            this.preset = buttonStyle;
            this.commands = list;
        }

        @l
        public final List<Command> c() {
            return this.commands;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final ButtonStyle getPreset() {
            return this.preset;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DoneButton)) {
                return false;
            }
            DoneButton doneButton = (DoneButton) obj;
            return L.f(this.title, doneButton.title) && this.preset == doneButton.preset && L.f(this.commands, doneButton.commands);
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            ButtonStyle buttonStyle = this.preset;
            int iHashCode2 = (iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31;
            List<Command> list = this.commands;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DoneButton(title=");
            sb2.append(this.title);
            sb2.append(", preset=");
            sb2.append(this.preset);
            sb2.append(", commands=");
            return H.p(sb2, this.commands, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            ButtonStyle buttonStyle = this.preset;
            if (buttonStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(buttonStyle.name());
            }
            List<Command> list = this.commands;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DonePseudoStep;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DonePseudoStep$DonePseudoStepData;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DonePseudoStep$DonePseudoStepData;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DonePseudoStep$DonePseudoStepData;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DonePseudoStep$DonePseudoStepData;", "DonePseudoStepData", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class DonePseudoStep extends RatingFormAddValueType {

        @k
        public static final Parcelable.Creator<DonePseudoStep> CREATOR = new a();

        @c("data")
        @k
        private final DonePseudoStepData data;

        /* compiled from: RatingFormAddValueType.kt */
        @d
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DonePseudoStep$DonePseudoStepData;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "content", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DoneButton;", "buttons", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DonePseudoStepData implements Parcelable {

            @k
            public static final Parcelable.Creator<DonePseudoStepData> CREATOR = new a();

            @c("buttons")
            @l
            private final List<DoneButton> buttons;

            @c("content")
            @k
            private final AttributedText content;

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<DonePseudoStepData> {
                @Override // android.os.Parcelable.Creator
                public final DonePseudoStepData createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    AttributedText attributedText = (AttributedText) parcel.readParcelable(DonePseudoStepData.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i12);
                        int iC2 = 0;
                        while (iC2 != i12) {
                            iC2 = com.avito.android.actions_sheet.a.c(DoneButton.CREATOR, parcel, arrayList2, iC2, 1);
                        }
                        arrayList = arrayList2;
                    }
                    return new DonePseudoStepData(attributedText, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final DonePseudoStepData[] newArray(int i12) {
                    return new DonePseudoStepData[i12];
                }
            }

            public DonePseudoStepData(@k AttributedText attributedText, @l List<DoneButton> list) {
                this.content = attributedText;
                this.buttons = list;
            }

            @l
            public final List<DoneButton> c() {
                return this.buttons;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final AttributedText getContent() {
                return this.content;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DonePseudoStepData)) {
                    return false;
                }
                DonePseudoStepData donePseudoStepData = (DonePseudoStepData) obj;
                return L.f(this.content, donePseudoStepData.content) && L.f(this.buttons, donePseudoStepData.buttons);
            }

            public final int hashCode() {
                int iHashCode = this.content.hashCode() * 31;
                List<DoneButton> list = this.buttons;
                return iHashCode + (list == null ? 0 : list.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("DonePseudoStepData(content=");
                sb2.append(this.content);
                sb2.append(", buttons=");
                return H.p(sb2, this.buttons, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.content, i12);
                List<DoneButton> list = this.buttons;
                if (list == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((DoneButton) itA.next()).writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DonePseudoStep> {
            @Override // android.os.Parcelable.Creator
            public final DonePseudoStep createFromParcel(Parcel parcel) {
                return new DonePseudoStep(DonePseudoStepData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final DonePseudoStep[] newArray(int i12) {
                return new DonePseudoStep[i12];
            }
        }

        public DonePseudoStep(@k DonePseudoStepData donePseudoStepData) {
            super(null);
            this.data = donePseudoStepData;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final DonePseudoStepData getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.data.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DoneToast;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DoneToast$DoneToastData;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DoneToast$DoneToastData;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DoneToast$DoneToastData;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DoneToast$DoneToastData;", "DoneToastData", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class DoneToast extends RatingFormAddValueType {

        @k
        public static final Parcelable.Creator<DoneToast> CREATOR = new a();

        @c("data")
        @k
        private final DoneToastData data;

        /* compiled from: RatingFormAddValueType.kt */
        @d
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DoneToast$DoneToastData;", "Landroid/os/Parcelable;", "", "title", "message", "Lcom/avito/android/rating_form/api/remote/model/RatingFormToastPreset;", "preset", "", "timeout", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DoneButton;", "buttons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/rating_form/api/remote/model/RatingFormToastPreset;Ljava/lang/Integer;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getMessage", "Lcom/avito/android/rating_form/api/remote/model/RatingFormToastPreset;", "d", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormToastPreset;", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DoneToastData implements Parcelable {

            @k
            public static final Parcelable.Creator<DoneToastData> CREATOR = new a();

            @c("buttons")
            @l
            private final List<DoneButton> buttons;

            @c("message")
            @k
            private final String message;

            @c("preset")
            @l
            private final RatingFormToastPreset preset;

            @c("timeout")
            @l
            private final Integer timeout;

            @c("title")
            @l
            private final String title;

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<DoneToastData> {
                @Override // android.os.Parcelable.Creator
                public final DoneToastData createFromParcel(Parcel parcel) {
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    ArrayList arrayList = null;
                    RatingFormToastPreset ratingFormToastPresetValueOf = parcel.readInt() == 0 ? null : RatingFormToastPreset.valueOf(parcel.readString());
                    Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    if (parcel.readInt() != 0) {
                        int i12 = parcel.readInt();
                        arrayList = new ArrayList(i12);
                        int iC2 = 0;
                        while (iC2 != i12) {
                            iC2 = com.avito.android.actions_sheet.a.c(DoneButton.CREATOR, parcel, arrayList, iC2, 1);
                        }
                    }
                    return new DoneToastData(string, string2, ratingFormToastPresetValueOf, numValueOf, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final DoneToastData[] newArray(int i12) {
                    return new DoneToastData[i12];
                }
            }

            public DoneToastData(@l String str, @k String str2, @l RatingFormToastPreset ratingFormToastPreset, @l Integer num, @l List<DoneButton> list) {
                this.title = str;
                this.message = str2;
                this.preset = ratingFormToastPreset;
                this.timeout = num;
                this.buttons = list;
            }

            @l
            public final List<DoneButton> c() {
                return this.buttons;
            }

            @l
            /* renamed from: d, reason: from getter */
            public final RatingFormToastPreset getPreset() {
                return this.preset;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final Integer getTimeout() {
                return this.timeout;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DoneToastData)) {
                    return false;
                }
                DoneToastData doneToastData = (DoneToastData) obj;
                return L.f(this.title, doneToastData.title) && L.f(this.message, doneToastData.message) && this.preset == doneToastData.preset && L.f(this.timeout, doneToastData.timeout) && L.f(this.buttons, doneToastData.buttons);
            }

            @k
            public final String getMessage() {
                return this.message;
            }

            public final int hashCode() {
                String str = this.title;
                int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
                RatingFormToastPreset ratingFormToastPreset = this.preset;
                int iHashCode = (iD2 + (ratingFormToastPreset == null ? 0 : ratingFormToastPreset.hashCode())) * 31;
                Integer num = this.timeout;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                List<DoneButton> list = this.buttons;
                return iHashCode2 + (list != null ? list.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("DoneToastData(title=");
                sb2.append(this.title);
                sb2.append(", message=");
                sb2.append(this.message);
                sb2.append(", preset=");
                sb2.append(this.preset);
                sb2.append(", timeout=");
                sb2.append(this.timeout);
                sb2.append(", buttons=");
                return H.p(sb2, this.buttons, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.title);
                parcel.writeString(this.message);
                RatingFormToastPreset ratingFormToastPreset = this.preset;
                if (ratingFormToastPreset == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(ratingFormToastPreset.name());
                }
                Integer num = this.timeout;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
                List<DoneButton> list = this.buttons;
                if (list == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((DoneButton) itA.next()).writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DoneToast> {
            @Override // android.os.Parcelable.Creator
            public final DoneToast createFromParcel(Parcel parcel) {
                return new DoneToast(DoneToastData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final DoneToast[] newArray(int i12) {
                return new DoneToast[i12];
            }
        }

        public DoneToast(@k DoneToastData doneToastData) {
            super(null);
            this.data = doneToastData;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final DoneToastData getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.data.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DraftCreated;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DraftCreated$DraftCreatedData;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DraftCreated$DraftCreatedData;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DraftCreated$DraftCreatedData;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DraftCreated$DraftCreatedData;", "DraftCreatedData", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class DraftCreated extends RatingFormAddValueType {

        @k
        public static final Parcelable.Creator<DraftCreated> CREATOR = new a();

        @c("data")
        @k
        private final DraftCreatedData data;

        /* compiled from: RatingFormAddValueType.kt */
        @d
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$DraftCreated$DraftCreatedData;", "Landroid/os/Parcelable;", "", "draftId", "", "title", "<init>", "(ILjava/lang/String;)V", "I", "c", "()I", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DraftCreatedData implements Parcelable {

            @k
            public static final Parcelable.Creator<DraftCreatedData> CREATOR = new a();

            @c("draftId")
            private final int draftId;

            @c("title")
            @k
            private final String title;

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<DraftCreatedData> {
                @Override // android.os.Parcelable.Creator
                public final DraftCreatedData createFromParcel(Parcel parcel) {
                    return new DraftCreatedData(parcel.readInt(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final DraftCreatedData[] newArray(int i12) {
                    return new DraftCreatedData[i12];
                }
            }

            public DraftCreatedData(int i12, @k String str) {
                this.draftId = i12;
                this.title = str;
            }

            /* renamed from: c, reason: from getter */
            public final int getDraftId() {
                return this.draftId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DraftCreatedData)) {
                    return false;
                }
                DraftCreatedData draftCreatedData = (DraftCreatedData) obj;
                return this.draftId == draftCreatedData.draftId && L.f(this.title, draftCreatedData.title);
            }

            public final int hashCode() {
                return this.title.hashCode() + (Integer.hashCode(this.draftId) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("DraftCreatedData(draftId=");
                sb2.append(this.draftId);
                sb2.append(", title=");
                return C22026a.c(sb2, this.title, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.draftId);
                parcel.writeString(this.title);
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DraftCreated> {
            @Override // android.os.Parcelable.Creator
            public final DraftCreated createFromParcel(Parcel parcel) {
                return new DraftCreated(DraftCreatedData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final DraftCreated[] newArray(int i12) {
                return new DraftCreated[i12];
            }
        }

        public DraftCreated(@k DraftCreatedData draftCreatedData) {
            super(null);
            this.data = draftCreatedData;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final DraftCreatedData getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.data.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error$ErrorData;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error$ErrorData;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error$ErrorData;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error$ErrorData;", "ErrorData", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Error extends RatingFormAddValueType {

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        @c("data")
        @k
        private final ErrorData data;

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error$ErrorData;", "Landroid/os/Parcelable;", "", "title", "message", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error$ErrorData$Button;", "button", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error$ErrorData$Action;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error$ErrorData$Button;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error$ErrorData$Action;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getMessage", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error$ErrorData$Button;", "d", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error$ErrorData$Button;", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error$ErrorData$Action;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error$ErrorData$Action;", "Action", "Button", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class ErrorData implements Parcelable {

            @k
            public static final Parcelable.Creator<ErrorData> CREATOR = new a();

            @c("action")
            @l
            private final Action action;

            @c("button")
            @l
            private final Button button;

            @c("image")
            @l
            private final UniversalImage image;

            @c("message")
            @k
            private final String message;

            @c("title")
            @k
            private final String title;

            /* compiled from: RatingFormAddValueType.kt */
            @d
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error$ErrorData$Action;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Action implements Parcelable {

                @k
                public static final Parcelable.Creator<Action> CREATOR = new a();

                @c("title")
                @k
                private final String title;

                @c(TooltipAttribute.PARAM_DEEP_LINK)
                @k
                private final DeepLink uri;

                /* compiled from: RatingFormAddValueType.kt */
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
                    this.title = str;
                    this.uri = deepLink;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Action)) {
                        return false;
                    }
                    Action action = (Action) obj;
                    return L.f(this.title, action.title) && L.f(this.uri, action.uri);
                }

                @k
                public final String getTitle() {
                    return this.title;
                }

                @k
                public final DeepLink getUri() {
                    return this.uri;
                }

                public final int hashCode() {
                    return this.uri.hashCode() + (this.title.hashCode() * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Action(title=");
                    sb2.append(this.title);
                    sb2.append(", uri=");
                    return com.avito.android.actions_sheet.a.v(sb2, this.uri, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.title);
                    parcel.writeParcelable(this.uri, i12);
                }
            }

            /* compiled from: RatingFormAddValueType.kt */
            @d
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Error$ErrorData$Button;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Button implements Parcelable {

                @k
                public static final Parcelable.Creator<Button> CREATOR = new a();

                @c("text")
                @k
                private final String text;

                @c(ContextActionHandler.Link.URL)
                @k
                private final DeepLink url;

                /* compiled from: RatingFormAddValueType.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Button> {
                    @Override // android.os.Parcelable.Creator
                    public final Button createFromParcel(Parcel parcel) {
                        return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Button[] newArray(int i12) {
                        return new Button[i12];
                    }
                }

                public Button(@k String str, @k DeepLink deepLink) {
                    this.text = str;
                    this.url = deepLink;
                }

                @k
                /* renamed from: c, reason: from getter */
                public final DeepLink getUrl() {
                    return this.url;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) obj;
                    return L.f(this.text, button.text) && L.f(this.url, button.url);
                }

                @k
                public final String getText() {
                    return this.text;
                }

                public final int hashCode() {
                    return this.url.hashCode() + (this.text.hashCode() * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Button(text=");
                    sb2.append(this.text);
                    sb2.append(", url=");
                    return com.avito.android.actions_sheet.a.v(sb2, this.url, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.text);
                    parcel.writeParcelable(this.url, i12);
                }
            }

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ErrorData> {
                @Override // android.os.Parcelable.Creator
                public final ErrorData createFromParcel(Parcel parcel) {
                    return new ErrorData(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(ErrorData.class.getClassLoader()), parcel.readInt() != 0 ? Action.CREATOR.createFromParcel(parcel) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final ErrorData[] newArray(int i12) {
                    return new ErrorData[i12];
                }
            }

            public ErrorData(@k String str, @k String str2, @l Button button, @l UniversalImage universalImage, @l Action action) {
                this.title = str;
                this.message = str2;
                this.button = button;
                this.image = universalImage;
                this.action = action;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final Action getAction() {
                return this.action;
            }

            @l
            /* renamed from: d, reason: from getter */
            public final Button getButton() {
                return this.button;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ErrorData)) {
                    return false;
                }
                ErrorData errorData = (ErrorData) obj;
                return L.f(this.title, errorData.title) && L.f(this.message, errorData.message) && L.f(this.button, errorData.button) && L.f(this.image, errorData.image) && L.f(this.action, errorData.action);
            }

            @l
            public final UniversalImage getImage() {
                return this.image;
            }

            @k
            public final String getMessage() {
                return this.message;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                int iD2 = H.d(this.title.hashCode() * 31, 31, this.message);
                Button button = this.button;
                int iHashCode = (iD2 + (button == null ? 0 : button.hashCode())) * 31;
                UniversalImage universalImage = this.image;
                int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
                Action action = this.action;
                return iHashCode2 + (action != null ? action.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "ErrorData(title=" + this.title + ", message=" + this.message + ", button=" + this.button + ", image=" + this.image + ", action=" + this.action + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.title);
                parcel.writeString(this.message);
                Button button = this.button;
                if (button == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    button.writeToParcel(parcel, i12);
                }
                parcel.writeParcelable(this.image, i12);
                Action action = this.action;
                if (action == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    action.writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(ErrorData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error(@k ErrorData errorData) {
            super(null);
            this.data = errorData;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final ErrorData getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.data.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$FieldUpdate;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$FieldUpdate$FieldUpdateData;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$FieldUpdate$FieldUpdateData;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$FieldUpdate$FieldUpdateData;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$FieldUpdate$FieldUpdateData;", "FieldUpdateData", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class FieldUpdate extends RatingFormAddValueType {

        @k
        public static final Parcelable.Creator<FieldUpdate> CREATOR = new a();

        @c("data")
        @k
        private final FieldUpdateData data;

        /* compiled from: RatingFormAddValueType.kt */
        @d
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$FieldUpdate$FieldUpdateData;", "Landroid/os/Parcelable;", "", "stepId", "", "fieldSlug", "fieldId", "", BeduinCartItemModel.DISABLED_STRING, "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$Value;", "values", "<init>", "(ILjava/lang/String;IZLjava/util/List;)V", "I", "getStepId", "()I", "Ljava/lang/String;", "getFieldSlug", "()Ljava/lang/String;", "d", "Z", "c", "()Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FieldUpdateData implements Parcelable {

            @k
            public static final Parcelable.Creator<FieldUpdateData> CREATOR = new a();

            @c(BeduinCartItemModel.DISABLED_STRING)
            private final boolean disabled;

            @c("fieldId")
            private final int fieldId;

            @c("fieldSlug")
            @k
            private final String fieldSlug;

            @c("stepId")
            private final int stepId;

            @c("values")
            @k
            private final List<RatingFormField.Value> values;

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<FieldUpdateData> {
                @Override // android.os.Parcelable.Creator
                public final FieldUpdateData createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    String string = parcel.readString();
                    int i13 = parcel.readInt();
                    int iC2 = 0;
                    boolean z12 = parcel.readInt() != 0;
                    int i14 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i14);
                    while (iC2 != i14) {
                        iC2 = com.avito.android.actions_sheet.a.c(RatingFormField.Value.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new FieldUpdateData(i12, string, i13, z12, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final FieldUpdateData[] newArray(int i12) {
                    return new FieldUpdateData[i12];
                }
            }

            public FieldUpdateData(int i12, @k String str, int i13, boolean z12, @k List<RatingFormField.Value> list) {
                this.stepId = i12;
                this.fieldSlug = str;
                this.fieldId = i13;
                this.disabled = z12;
                this.values = list;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getDisabled() {
                return this.disabled;
            }

            /* renamed from: d, reason: from getter */
            public final int getFieldId() {
                return this.fieldId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @k
            public final List<RatingFormField.Value> e() {
                return this.values;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FieldUpdateData)) {
                    return false;
                }
                FieldUpdateData fieldUpdateData = (FieldUpdateData) obj;
                return this.stepId == fieldUpdateData.stepId && L.f(this.fieldSlug, fieldUpdateData.fieldSlug) && this.fieldId == fieldUpdateData.fieldId && this.disabled == fieldUpdateData.disabled && L.f(this.values, fieldUpdateData.values);
            }

            public final int hashCode() {
                return this.values.hashCode() + r.i(r.e(this.fieldId, H.d(Integer.hashCode(this.stepId) * 31, 31, this.fieldSlug), 31), 31, this.disabled);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("FieldUpdateData(stepId=");
                sb2.append(this.stepId);
                sb2.append(", fieldSlug=");
                sb2.append(this.fieldSlug);
                sb2.append(", fieldId=");
                sb2.append(this.fieldId);
                sb2.append(", disabled=");
                sb2.append(this.disabled);
                sb2.append(", values=");
                return H.p(sb2, this.values, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.stepId);
                parcel.writeString(this.fieldSlug);
                parcel.writeInt(this.fieldId);
                parcel.writeInt(this.disabled ? 1 : 0);
                Iterator itJ = C0.j(this.values, parcel);
                while (itJ.hasNext()) {
                    ((RatingFormField.Value) itJ.next()).writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FieldUpdate> {
            @Override // android.os.Parcelable.Creator
            public final FieldUpdate createFromParcel(Parcel parcel) {
                return new FieldUpdate(FieldUpdateData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final FieldUpdate[] newArray(int i12) {
                return new FieldUpdate[i12];
            }
        }

        public FieldUpdate(@k FieldUpdateData fieldUpdateData) {
            super(null);
            this.data = fieldUpdateData;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final FieldUpdateData getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.data.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$FieldsList;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$FieldsList$FieldsListData;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$FieldsList$FieldsListData;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$FieldsList$FieldsListData;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$FieldsList$FieldsListData;", "FieldsListData", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class FieldsList extends RatingFormAddValueType {

        @k
        public static final Parcelable.Creator<FieldsList> CREATOR = new a();

        @c("data")
        @k
        private final FieldsListData data;

        /* compiled from: RatingFormAddValueType.kt */
        @d
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b \u0010\u0017R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$FieldsList$FieldsListData;", "Landroid/os/Parcelable;", "", "stepId", "", "stepSlug", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField;", LocalPublishState.FIELDS, "finishButtonTitle", "emptyStepFinishButtonTitle", "Lcom/avito/android/remote/model/text/AttributedText;", ServiceTransportationWidget.DisclaimerField.TYPE, "toastErrorMessage", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button;", "buttons", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/util/List;)V", "I", "h", "()I", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "Ljava/util/List;", "f", "()Ljava/util/List;", "g", "e", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "j", "c", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FieldsListData implements Parcelable {

            @k
            public static final Parcelable.Creator<FieldsListData> CREATOR = new a();

            @c("buttons")
            @l
            private final List<Button> buttons;

            @c(ServiceTransportationWidget.DisclaimerField.TYPE)
            @l
            private final AttributedText disclaimer;

            @c("emptyStepFinishButtonTitle")
            @l
            private final String emptyStepFinishButtonTitle;

            @c(LocalPublishState.FIELDS)
            @k
            private final List<RatingFormField> fields;

            @c("finishButtonTitle")
            @l
            private final String finishButtonTitle;

            @c("stepId")
            private final int stepId;

            @c("stepSlug")
            @l
            private final String stepSlug;

            @c("toastErrorMessage")
            @l
            private final String toastErrorMessage;

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<FieldsListData> {
                @Override // android.os.Parcelable.Creator
                public final FieldsListData createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    int i12 = parcel.readInt();
                    String string = parcel.readString();
                    int i13 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i13);
                    int iC2 = 0;
                    int iC3 = 0;
                    while (iC3 != i13) {
                        iC3 = com.avito.android.actions_sheet.a.c(RatingFormField.CREATOR, parcel, arrayList2, iC3, 1);
                    }
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    AttributedText attributedText = (AttributedText) parcel.readParcelable(FieldsListData.class.getClassLoader());
                    String string4 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i14 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(i14);
                        while (iC2 != i14) {
                            iC2 = com.avito.android.actions_sheet.a.c(Button.CREATOR, parcel, arrayList3, iC2, 1);
                        }
                        arrayList = arrayList3;
                    }
                    return new FieldsListData(i12, string, arrayList2, string2, string3, attributedText, string4, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final FieldsListData[] newArray(int i12) {
                    return new FieldsListData[i12];
                }
            }

            public FieldsListData(int i12, @l String str, @k List<RatingFormField> list, @l String str2, @l String str3, @l AttributedText attributedText, @l String str4, @l List<Button> list2) {
                this.stepId = i12;
                this.stepSlug = str;
                this.fields = list;
                this.finishButtonTitle = str2;
                this.emptyStepFinishButtonTitle = str3;
                this.disclaimer = attributedText;
                this.toastErrorMessage = str4;
                this.buttons = list2;
            }

            @l
            public final List<Button> c() {
                return this.buttons;
            }

            @l
            /* renamed from: d, reason: from getter */
            public final AttributedText getDisclaimer() {
                return this.disclaimer;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final String getEmptyStepFinishButtonTitle() {
                return this.emptyStepFinishButtonTitle;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FieldsListData)) {
                    return false;
                }
                FieldsListData fieldsListData = (FieldsListData) obj;
                return this.stepId == fieldsListData.stepId && L.f(this.stepSlug, fieldsListData.stepSlug) && L.f(this.fields, fieldsListData.fields) && L.f(this.finishButtonTitle, fieldsListData.finishButtonTitle) && L.f(this.emptyStepFinishButtonTitle, fieldsListData.emptyStepFinishButtonTitle) && L.f(this.disclaimer, fieldsListData.disclaimer) && L.f(this.toastErrorMessage, fieldsListData.toastErrorMessage) && L.f(this.buttons, fieldsListData.buttons);
            }

            @k
            public final List<RatingFormField> f() {
                return this.fields;
            }

            @l
            /* renamed from: g, reason: from getter */
            public final String getFinishButtonTitle() {
                return this.finishButtonTitle;
            }

            /* renamed from: h, reason: from getter */
            public final int getStepId() {
                return this.stepId;
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.stepId) * 31;
                String str = this.stepSlug;
                int iE2 = H.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.fields);
                String str2 = this.finishButtonTitle;
                int iHashCode2 = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.emptyStepFinishButtonTitle;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                AttributedText attributedText = this.disclaimer;
                int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
                String str4 = this.toastErrorMessage;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                List<Button> list = this.buttons;
                return iHashCode5 + (list != null ? list.hashCode() : 0);
            }

            @l
            /* renamed from: i, reason: from getter */
            public final String getStepSlug() {
                return this.stepSlug;
            }

            @l
            /* renamed from: j, reason: from getter */
            public final String getToastErrorMessage() {
                return this.toastErrorMessage;
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("FieldsListData(stepId=");
                sb2.append(this.stepId);
                sb2.append(", stepSlug=");
                sb2.append(this.stepSlug);
                sb2.append(", fields=");
                sb2.append(this.fields);
                sb2.append(", finishButtonTitle=");
                sb2.append(this.finishButtonTitle);
                sb2.append(", emptyStepFinishButtonTitle=");
                sb2.append(this.emptyStepFinishButtonTitle);
                sb2.append(", disclaimer=");
                sb2.append(this.disclaimer);
                sb2.append(", toastErrorMessage=");
                sb2.append(this.toastErrorMessage);
                sb2.append(", buttons=");
                return H.p(sb2, this.buttons, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.stepId);
                parcel.writeString(this.stepSlug);
                Iterator itJ = C0.j(this.fields, parcel);
                while (itJ.hasNext()) {
                    ((RatingFormField) itJ.next()).writeToParcel(parcel, i12);
                }
                parcel.writeString(this.finishButtonTitle);
                parcel.writeString(this.emptyStepFinishButtonTitle);
                parcel.writeParcelable(this.disclaimer, i12);
                parcel.writeString(this.toastErrorMessage);
                List<Button> list = this.buttons;
                if (list == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((Button) itA.next()).writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FieldsList> {
            @Override // android.os.Parcelable.Creator
            public final FieldsList createFromParcel(Parcel parcel) {
                return new FieldsList(FieldsListData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final FieldsList[] newArray(int i12) {
                return new FieldsList[i12];
            }
        }

        public FieldsList(@k FieldsListData fieldsListData) {
            super(null);
            this.data = fieldsListData;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final FieldsListData getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FieldsList) && L.f(this.data, ((FieldsList) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        @k
        public final String toString() {
            return "FieldsList(data=" + this.data + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.data.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$HiddenFields;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$HiddenFields$HiddenFieldsData;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$HiddenFields$HiddenFieldsData;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$HiddenFields$HiddenFieldsData;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$HiddenFields$HiddenFieldsData;", "HiddenFieldsData", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class HiddenFields extends RatingFormAddValueType {

        @k
        public static final Parcelable.Creator<HiddenFields> CREATOR = new a();

        @c("data")
        @k
        private final HiddenFieldsData data;

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$HiddenFields$HiddenFieldsData;", "Landroid/os/Parcelable;", "", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$HiddenFields$HiddenFieldsData$HiddenFieldData;", LocalPublishState.FIELDS, "<init>", "(Ljava/util/Map;)V", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "HiddenFieldData", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class HiddenFieldsData implements Parcelable {

            @k
            public static final Parcelable.Creator<HiddenFieldsData> CREATOR = new a();

            @c(LocalPublishState.FIELDS)
            @k
            private final Map<String, HiddenFieldData> fields;

            /* compiled from: RatingFormAddValueType.kt */
            @d
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$HiddenFields$HiddenFieldsData$HiddenFieldData;", "Landroid/os/Parcelable;", "", HiddenParameter.TYPE, "<init>", "(Z)V", "Z", "c", "()Z", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class HiddenFieldData implements Parcelable {

                @k
                public static final Parcelable.Creator<HiddenFieldData> CREATOR = new a();

                @c(HiddenParameter.TYPE)
                private final boolean hidden;

                /* compiled from: RatingFormAddValueType.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<HiddenFieldData> {
                    @Override // android.os.Parcelable.Creator
                    public final HiddenFieldData createFromParcel(Parcel parcel) {
                        return new HiddenFieldData(parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final HiddenFieldData[] newArray(int i12) {
                        return new HiddenFieldData[i12];
                    }
                }

                public HiddenFieldData(boolean z12) {
                    this.hidden = z12;
                }

                /* renamed from: c, reason: from getter */
                public final boolean getHidden() {
                    return this.hidden;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof HiddenFieldData) && this.hidden == ((HiddenFieldData) obj).hidden;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.hidden);
                }

                @k
                public final String toString() {
                    return r.x(new StringBuilder("HiddenFieldData(hidden="), this.hidden, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeInt(this.hidden ? 1 : 0);
                }
            }

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<HiddenFieldsData> {
                @Override // android.os.Parcelable.Creator
                public final HiddenFieldsData createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                    for (int i13 = 0; i13 != i12; i13++) {
                        linkedHashMap.put(parcel.readString(), HiddenFieldData.CREATOR.createFromParcel(parcel));
                    }
                    return new HiddenFieldsData(linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final HiddenFieldsData[] newArray(int i12) {
                    return new HiddenFieldsData[i12];
                }
            }

            public HiddenFieldsData(@k Map<String, HiddenFieldData> map) {
                this.fields = map;
            }

            @k
            public final Map<String, HiddenFieldData> c() {
                return this.fields;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HiddenFieldsData) && L.f(this.fields, ((HiddenFieldsData) obj).fields);
            }

            public final int hashCode() {
                return this.fields.hashCode();
            }

            @k
            public final String toString() {
                return r.w(new StringBuilder("HiddenFieldsData(fields="), this.fields, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                Iterator itI = C0.i(parcel, this.fields);
                while (itI.hasNext()) {
                    Map.Entry entry = (Map.Entry) itI.next();
                    parcel.writeString((String) entry.getKey());
                    ((HiddenFieldData) entry.getValue()).writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HiddenFields> {
            @Override // android.os.Parcelable.Creator
            public final HiddenFields createFromParcel(Parcel parcel) {
                return new HiddenFields(HiddenFieldsData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final HiddenFields[] newArray(int i12) {
                return new HiddenFields[i12];
            }
        }

        public HiddenFields(@k HiddenFieldsData hiddenFieldsData) {
            super(null);
            this.data = hiddenFieldsData;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final HiddenFieldsData getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.data.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RatingFormItem;", "Landroid/os/Parcelable;", "()V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RatingFormPromoBlock;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RatingFormText;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class RatingFormItem implements Parcelable {
        public /* synthetic */ RatingFormItem(C42822w c42822w) {
            this();
        }

        private RatingFormItem() {
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RatingFormPromoBlock;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RatingFormItem;", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RatingFormPromoBlock$Icon;", "icon", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RatingFormPromoBlock$Icon;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RatingFormPromoBlock$Icon;", "d", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RatingFormPromoBlock$Icon;", "Icon", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class RatingFormPromoBlock extends RatingFormItem {

        @k
        public static final Parcelable.Creator<RatingFormPromoBlock> CREATOR = new a();

        @c("attributedText")
        @k
        private final AttributedText attributedText;

        @c("icon")
        @l
        private final Icon icon;

        /* compiled from: RatingFormAddValueType.kt */
        @d
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RatingFormPromoBlock$Icon;", "Landroid/os/Parcelable;", "", "name", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Icon implements Parcelable {

            @k
            public static final Parcelable.Creator<Icon> CREATOR = new a();

            @c("name")
            @l
            private final String name;

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Icon> {
                @Override // android.os.Parcelable.Creator
                public final Icon createFromParcel(Parcel parcel) {
                    return new Icon(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Icon[] newArray(int i12) {
                    return new Icon[i12];
                }
            }

            public Icon(@l String str) {
                this.name = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Icon) && L.f(this.name, ((Icon) obj).name);
            }

            @l
            public final String getName() {
                return this.name;
            }

            public final int hashCode() {
                String str = this.name;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Icon(name="), this.name, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.name);
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RatingFormPromoBlock> {
            @Override // android.os.Parcelable.Creator
            public final RatingFormPromoBlock createFromParcel(Parcel parcel) {
                return new RatingFormPromoBlock((AttributedText) parcel.readParcelable(RatingFormPromoBlock.class.getClassLoader()), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final RatingFormPromoBlock[] newArray(int i12) {
                return new RatingFormPromoBlock[i12];
            }
        }

        public RatingFormPromoBlock(@k AttributedText attributedText, @l Icon icon) {
            super(null);
            this.attributedText = attributedText;
            this.icon = icon;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final AttributedText getAttributedText() {
            return this.attributedText;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RatingFormPromoBlock)) {
                return false;
            }
            RatingFormPromoBlock ratingFormPromoBlock = (RatingFormPromoBlock) obj;
            return L.f(this.attributedText, ratingFormPromoBlock.attributedText) && L.f(this.icon, ratingFormPromoBlock.icon);
        }

        public final int hashCode() {
            int iHashCode = this.attributedText.hashCode() * 31;
            Icon icon = this.icon;
            return iHashCode + (icon == null ? 0 : icon.hashCode());
        }

        @k
        public final String toString() {
            return "RatingFormPromoBlock(attributedText=" + this.attributedText + ", icon=" + this.icon + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.attributedText, i12);
            Icon icon = this.icon;
            if (icon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                icon.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RatingFormText;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RatingFormItem;", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RatingFormText extends RatingFormItem {

        @k
        public static final Parcelable.Creator<RatingFormText> CREATOR = new a();

        @c("attributedText")
        @k
        private final AttributedText attributedText;

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RatingFormText> {
            @Override // android.os.Parcelable.Creator
            public final RatingFormText createFromParcel(Parcel parcel) {
                return new RatingFormText((AttributedText) parcel.readParcelable(RatingFormText.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final RatingFormText[] newArray(int i12) {
                return new RatingFormText[i12];
            }
        }

        public RatingFormText(@k AttributedText attributedText) {
            super(null);
            this.attributedText = attributedText;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final AttributedText getAttributedText() {
            return this.attributedText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RatingFormText) && L.f(this.attributedText, ((RatingFormText) obj).attributedText);
        }

        public final int hashCode() {
            return this.attributedText.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("RatingFormText(attributedText="), this.attributedText, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.attributedText, i12);
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RenderList;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RenderList$RenderListData;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RenderList$RenderListData;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RenderList$RenderListData;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RenderList$RenderListData;", "RenderListData", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class RenderList extends RatingFormAddValueType {

        @k
        public static final Parcelable.Creator<RenderList> CREATOR = new a();

        @c("data")
        @k
        private final RenderListData data;

        /* compiled from: RatingFormAddValueType.kt */
        @d
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RenderList$RenderListData;", "Landroid/os/Parcelable;", "", "stepSlug", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$RatingFormItem;", "items", "finishButtonTitle", "emptyStepFinishButtonTitle", "Lcom/avito/android/remote/model/text/AttributedText;", ServiceTransportationWidget.DisclaimerField.TYPE, "toastErrorMessage", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Button;", "buttons", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "f", "e", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "h", "c", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RenderListData implements Parcelable {

            @k
            public static final Parcelable.Creator<RenderListData> CREATOR = new a();

            @c("buttons")
            @l
            private final List<Button> buttons;

            @c(ServiceTransportationWidget.DisclaimerField.TYPE)
            @l
            private final AttributedText disclaimer;

            @c("emptyStepFinishButtonTitle")
            @l
            private final String emptyStepFinishButtonTitle;

            @c("finishButtonTitle")
            @l
            private final String finishButtonTitle;

            @c("items")
            @k
            private final List<RatingFormItem> items;

            @c("stepSlug")
            @k
            private final String stepSlug;

            @c("toastErrorMessage")
            @l
            private final String toastErrorMessage;

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RenderListData> {
                @Override // android.os.Parcelable.Creator
                public final RenderListData createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    String string = parcel.readString();
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(RenderListData.class, parcel, arrayList2, iL2, 1);
                    }
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    AttributedText attributedText = (AttributedText) parcel.readParcelable(RenderListData.class.getClassLoader());
                    String string4 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i13 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(i13);
                        while (iC2 != i13) {
                            iC2 = com.avito.android.actions_sheet.a.c(Button.CREATOR, parcel, arrayList3, iC2, 1);
                        }
                        arrayList = arrayList3;
                    }
                    return new RenderListData(string, arrayList2, string2, string3, attributedText, string4, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final RenderListData[] newArray(int i12) {
                    return new RenderListData[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public RenderListData(@k String str, @k List<? extends RatingFormItem> list, @l String str2, @l String str3, @l AttributedText attributedText, @l String str4, @l List<Button> list2) {
                this.stepSlug = str;
                this.items = list;
                this.finishButtonTitle = str2;
                this.emptyStepFinishButtonTitle = str3;
                this.disclaimer = attributedText;
                this.toastErrorMessage = str4;
                this.buttons = list2;
            }

            @l
            public final List<Button> c() {
                return this.buttons;
            }

            @l
            /* renamed from: d, reason: from getter */
            public final AttributedText getDisclaimer() {
                return this.disclaimer;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final String getEmptyStepFinishButtonTitle() {
                return this.emptyStepFinishButtonTitle;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RenderListData)) {
                    return false;
                }
                RenderListData renderListData = (RenderListData) obj;
                return L.f(this.stepSlug, renderListData.stepSlug) && L.f(this.items, renderListData.items) && L.f(this.finishButtonTitle, renderListData.finishButtonTitle) && L.f(this.emptyStepFinishButtonTitle, renderListData.emptyStepFinishButtonTitle) && L.f(this.disclaimer, renderListData.disclaimer) && L.f(this.toastErrorMessage, renderListData.toastErrorMessage) && L.f(this.buttons, renderListData.buttons);
            }

            @l
            /* renamed from: f, reason: from getter */
            public final String getFinishButtonTitle() {
                return this.finishButtonTitle;
            }

            @k
            /* renamed from: g, reason: from getter */
            public final String getStepSlug() {
                return this.stepSlug;
            }

            @k
            public final List<RatingFormItem> getItems() {
                return this.items;
            }

            @l
            /* renamed from: h, reason: from getter */
            public final String getToastErrorMessage() {
                return this.toastErrorMessage;
            }

            public final int hashCode() {
                int iE2 = H.e(this.stepSlug.hashCode() * 31, 31, this.items);
                String str = this.finishButtonTitle;
                int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.emptyStepFinishButtonTitle;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                AttributedText attributedText = this.disclaimer;
                int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
                String str3 = this.toastErrorMessage;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                List<Button> list = this.buttons;
                return iHashCode4 + (list != null ? list.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("RenderListData(stepSlug=");
                sb2.append(this.stepSlug);
                sb2.append(", items=");
                sb2.append(this.items);
                sb2.append(", finishButtonTitle=");
                sb2.append(this.finishButtonTitle);
                sb2.append(", emptyStepFinishButtonTitle=");
                sb2.append(this.emptyStepFinishButtonTitle);
                sb2.append(", disclaimer=");
                sb2.append(this.disclaimer);
                sb2.append(", toastErrorMessage=");
                sb2.append(this.toastErrorMessage);
                sb2.append(", buttons=");
                return H.p(sb2, this.buttons, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.stepSlug);
                Iterator itJ = C0.j(this.items, parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), i12);
                }
                parcel.writeString(this.finishButtonTitle);
                parcel.writeString(this.emptyStepFinishButtonTitle);
                parcel.writeParcelable(this.disclaimer, i12);
                parcel.writeString(this.toastErrorMessage);
                List<Button> list = this.buttons;
                if (list == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((Button) itA.next()).writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RenderList> {
            @Override // android.os.Parcelable.Creator
            public final RenderList createFromParcel(Parcel parcel) {
                return new RenderList(RenderListData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final RenderList[] newArray(int i12) {
                return new RenderList[i12];
            }
        }

        public RenderList(@k RenderListData renderListData) {
            super(null);
            this.data = renderListData;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final RenderListData getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RenderList) && L.f(this.data, ((RenderList) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        @k
        public final String toString() {
            return "RenderList(data=" + this.data + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.data.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepFinished;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepFinished$StepFinishedData;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepFinished$StepFinishedData;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepFinished$StepFinishedData;", "getData", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepFinished$StepFinishedData;", "StepFinishedData", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class StepFinished extends RatingFormAddValueType {

        @k
        public static final Parcelable.Creator<StepFinished> CREATOR = new a();

        @c("data")
        @k
        private final StepFinishedData data;

        /* compiled from: RatingFormAddValueType.kt */
        @d
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepFinished$StepFinishedData;", "Landroid/os/Parcelable;", "", "stepId", "<init>", "(I)V", "I", "getStepId", "()I", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StepFinishedData implements Parcelable {

            @k
            public static final Parcelable.Creator<StepFinishedData> CREATOR = new a();

            @c("stepId")
            private final int stepId;

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<StepFinishedData> {
                @Override // android.os.Parcelable.Creator
                public final StepFinishedData createFromParcel(Parcel parcel) {
                    return new StepFinishedData(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final StepFinishedData[] newArray(int i12) {
                    return new StepFinishedData[i12];
                }
            }

            public StepFinishedData(int i12) {
                this.stepId = i12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StepFinishedData) && this.stepId == ((StepFinishedData) obj).stepId;
            }

            public final int hashCode() {
                return Integer.hashCode(this.stepId);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("StepFinishedData(stepId="), this.stepId, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.stepId);
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StepFinished> {
            @Override // android.os.Parcelable.Creator
            public final StepFinished createFromParcel(Parcel parcel) {
                return new StepFinished(StepFinishedData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final StepFinished[] newArray(int i12) {
                return new StepFinished[i12];
            }
        }

        public StepFinished(@k StepFinishedData stepFinishedData) {
            super(null);
            this.data = stepFinishedData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.data.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepValidationFailed;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepValidationFailed$StepValidationFailedData;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepValidationFailed$StepValidationFailedData;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepValidationFailed$StepValidationFailedData;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepValidationFailed$StepValidationFailedData;", "StepValidationFailedData", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class StepValidationFailed extends RatingFormAddValueType {

        @k
        public static final Parcelable.Creator<StepValidationFailed> CREATOR = new a();

        @c("data")
        @k
        private final StepValidationFailedData data;

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepValidationFailed$StepValidationFailedData;", "Landroid/os/Parcelable;", "", "stepId", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepValidationFailed$StepValidationFailedData$Field;", LocalPublishState.FIELDS, "<init>", "(ILjava/util/List;)V", "I", "getStepId", "()I", "Ljava/util/List;", "c", "()Ljava/util/List;", "Field", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class StepValidationFailedData implements Parcelable {

            @k
            public static final Parcelable.Creator<StepValidationFailedData> CREATOR = new a();

            @c(LocalPublishState.FIELDS)
            @k
            private final List<Field> fields;

            @c("stepId")
            private final int stepId;

            /* compiled from: RatingFormAddValueType.kt */
            @d
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepValidationFailed$StepValidationFailedData$Field;", "Landroid/os/Parcelable;", "", "slug", "", "errors", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Field implements Parcelable {

                @k
                public static final Parcelable.Creator<Field> CREATOR = new a();

                @c("errors")
                @k
                private final List<String> errors;

                @c("slug")
                @k
                private final String slug;

                /* compiled from: RatingFormAddValueType.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Field> {
                    @Override // android.os.Parcelable.Creator
                    public final Field createFromParcel(Parcel parcel) {
                        return new Field(parcel.readString(), parcel.createStringArrayList());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Field[] newArray(int i12) {
                        return new Field[i12];
                    }
                }

                public Field(@k String str, @k List<String> list) {
                    this.slug = str;
                    this.errors = list;
                }

                @k
                public final List<String> c() {
                    return this.errors;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Field)) {
                        return false;
                    }
                    Field field = (Field) obj;
                    return L.f(this.slug, field.slug) && L.f(this.errors, field.errors);
                }

                @k
                public final String getSlug() {
                    return this.slug;
                }

                public final int hashCode() {
                    return this.errors.hashCode() + (this.slug.hashCode() * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Field(slug=");
                    sb2.append(this.slug);
                    sb2.append(", errors=");
                    return H.p(sb2, this.errors, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.slug);
                    parcel.writeStringList(this.errors);
                }
            }

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<StepValidationFailedData> {
                @Override // android.os.Parcelable.Creator
                public final StepValidationFailedData createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    int i13 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i13);
                    int iC2 = 0;
                    while (iC2 != i13) {
                        iC2 = com.avito.android.actions_sheet.a.c(Field.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new StepValidationFailedData(i12, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final StepValidationFailedData[] newArray(int i12) {
                    return new StepValidationFailedData[i12];
                }
            }

            public StepValidationFailedData(int i12, @k List<Field> list) {
                this.stepId = i12;
                this.fields = list;
            }

            @k
            public final List<Field> c() {
                return this.fields;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StepValidationFailedData)) {
                    return false;
                }
                StepValidationFailedData stepValidationFailedData = (StepValidationFailedData) obj;
                return this.stepId == stepValidationFailedData.stepId && L.f(this.fields, stepValidationFailedData.fields);
            }

            public final int hashCode() {
                return this.fields.hashCode() + (Integer.hashCode(this.stepId) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("StepValidationFailedData(stepId=");
                sb2.append(this.stepId);
                sb2.append(", fields=");
                return H.p(sb2, this.fields, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.stepId);
                Iterator itJ = C0.j(this.fields, parcel);
                while (itJ.hasNext()) {
                    ((Field) itJ.next()).writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StepValidationFailed> {
            @Override // android.os.Parcelable.Creator
            public final StepValidationFailed createFromParcel(Parcel parcel) {
                return new StepValidationFailed(StepValidationFailedData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final StepValidationFailed[] newArray(int i12) {
                return new StepValidationFailed[i12];
            }
        }

        public StepValidationFailed(@k StepValidationFailedData stepValidationFailedData) {
            super(null);
            this.data = stepValidationFailedData;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final StepValidationFailedData getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.data.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList$StepsListData;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList$StepsListData;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList$StepsListData;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList$StepsListData;", "StepsListData", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class StepsList extends RatingFormAddValueType {

        @k
        public static final Parcelable.Creator<StepsList> CREATOR = new a();

        @c("data")
        @k
        private final StepsListData data;

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fB\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList$StepsListData;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList$StepsListData$Step;", "steps", "", "allProbableSteps", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "Step", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class StepsListData implements Parcelable {

            @k
            public static final Parcelable.Creator<StepsListData> CREATOR = new a();

            @c("allProbableSteps")
            @l
            private final Integer allProbableSteps;

            @c("steps")
            @k
            private final List<Step> steps;

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\t\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList$StepsListData$Step;", "Landroid/os/Parcelable;", "", "id", "", "slug", "title", "navigationTitle", "", "isFinished", "focusOnField", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList$StepsListData$Step$Validation;", "validations", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", "I", "d", "()I", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "getTitle", "e", "Z", "()Z", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "Validation", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class Step implements Parcelable {

                @k
                public static final Parcelable.Creator<Step> CREATOR = new a();

                @c("focusOnField")
                @l
                private final String focusOnField;

                @c("id")
                private final int id;

                @c("isFinished")
                private final boolean isFinished;

                @c("navigationTitle")
                @l
                private final String navigationTitle;

                @c("slug")
                @l
                private final String slug;

                @c("title")
                @k
                private final String title;

                @c("validations")
                @l
                private final List<Validation> validations;

                /* compiled from: RatingFormAddValueType.kt */
                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList$StepsListData$Step$Validation;", "Landroid/os/Parcelable;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList$StepsListData$Step$Validation$Rule;", "rule", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList$StepsListData$Step$Validation$Field;", LocalPublishState.FIELDS, "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList$StepsListData$Step$Validation$Rule;Ljava/util/List;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList$StepsListData$Step$Validation$Rule;", "d", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList$StepsListData$Step$Validation$Rule;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Field", "Rule", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @d
                public static final /* data */ class Validation implements Parcelable {

                    @k
                    public static final Parcelable.Creator<Validation> CREATOR = new a();

                    @c(LocalPublishState.FIELDS)
                    @k
                    private final List<Field> fields;

                    @c("rule")
                    @l
                    private final Rule rule;

                    /* compiled from: RatingFormAddValueType.kt */
                    @d
                    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList$StepsListData$Step$Validation$Field;", "Landroid/os/Parcelable;", "", "slug", "", "errors", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final /* data */ class Field implements Parcelable {

                        @k
                        public static final Parcelable.Creator<Field> CREATOR = new a();

                        @c("errors")
                        @l
                        private final List<String> errors;

                        @c("slug")
                        @k
                        private final String slug;

                        /* compiled from: RatingFormAddValueType.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        public static final class a implements Parcelable.Creator<Field> {
                            @Override // android.os.Parcelable.Creator
                            public final Field createFromParcel(Parcel parcel) {
                                return new Field(parcel.readString(), parcel.createStringArrayList());
                            }

                            @Override // android.os.Parcelable.Creator
                            public final Field[] newArray(int i12) {
                                return new Field[i12];
                            }
                        }

                        public Field(@k String str, @l List<String> list) {
                            this.slug = str;
                            this.errors = list;
                        }

                        @l
                        public final List<String> c() {
                            return this.errors;
                        }

                        @Override // android.os.Parcelable
                        public final int describeContents() {
                            return 0;
                        }

                        public final boolean equals(@l Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Field)) {
                                return false;
                            }
                            Field field = (Field) obj;
                            return L.f(this.slug, field.slug) && L.f(this.errors, field.errors);
                        }

                        @k
                        public final String getSlug() {
                            return this.slug;
                        }

                        public final int hashCode() {
                            int iHashCode = this.slug.hashCode() * 31;
                            List<String> list = this.errors;
                            return iHashCode + (list == null ? 0 : list.hashCode());
                        }

                        @k
                        public final String toString() {
                            StringBuilder sb2 = new StringBuilder("Field(slug=");
                            sb2.append(this.slug);
                            sb2.append(", errors=");
                            return H.p(sb2, this.errors, ')');
                        }

                        @Override // android.os.Parcelable
                        public final void writeToParcel(@k Parcel parcel, int i12) {
                            parcel.writeString(this.slug);
                            parcel.writeStringList(this.errors);
                        }
                    }

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    /* compiled from: RatingFormAddValueType.kt */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$StepsList$StepsListData$Step$Validation$Rule;", "", "(Ljava/lang/String;I)V", "REQUIRED_ANY", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final class Rule {

                        @c("requiredAny")
                        public static final Rule REQUIRED_ANY;

                        /* renamed from: b, reason: collision with root package name */
                        public static final /* synthetic */ Rule[] f247986b;

                        /* renamed from: c, reason: collision with root package name */
                        public static final /* synthetic */ kotlin.enums.a f247987c;

                        static {
                            Rule rule = new Rule("REQUIRED_ANY", 0);
                            REQUIRED_ANY = rule;
                            Rule[] ruleArr = {rule};
                            f247986b = ruleArr;
                            f247987c = kotlin.enums.c.a(ruleArr);
                        }

                        private Rule(String str, int i12) {
                        }

                        public static Rule valueOf(String str) {
                            return (Rule) Enum.valueOf(Rule.class, str);
                        }

                        public static Rule[] values() {
                            return (Rule[]) f247986b.clone();
                        }
                    }

                    /* compiled from: RatingFormAddValueType.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<Validation> {
                        @Override // android.os.Parcelable.Creator
                        public final Validation createFromParcel(Parcel parcel) {
                            Rule ruleValueOf = parcel.readInt() == 0 ? null : Rule.valueOf(parcel.readString());
                            int i12 = parcel.readInt();
                            ArrayList arrayList = new ArrayList(i12);
                            int iC2 = 0;
                            while (iC2 != i12) {
                                iC2 = com.avito.android.actions_sheet.a.c(Field.CREATOR, parcel, arrayList, iC2, 1);
                            }
                            return new Validation(ruleValueOf, arrayList);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Validation[] newArray(int i12) {
                            return new Validation[i12];
                        }
                    }

                    public Validation(@l Rule rule, @k List<Field> list) {
                        this.rule = rule;
                        this.fields = list;
                    }

                    @k
                    public final List<Field> c() {
                        return this.fields;
                    }

                    @l
                    /* renamed from: d, reason: from getter */
                    public final Rule getRule() {
                        return this.rule;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Validation)) {
                            return false;
                        }
                        Validation validation = (Validation) obj;
                        return this.rule == validation.rule && L.f(this.fields, validation.fields);
                    }

                    public final int hashCode() {
                        Rule rule = this.rule;
                        return this.fields.hashCode() + ((rule == null ? 0 : rule.hashCode()) * 31);
                    }

                    @k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("Validation(rule=");
                        sb2.append(this.rule);
                        sb2.append(", fields=");
                        return H.p(sb2, this.fields, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        Rule rule = this.rule;
                        if (rule == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            parcel.writeString(rule.name());
                        }
                        Iterator itJ = C0.j(this.fields, parcel);
                        while (itJ.hasNext()) {
                            ((Field) itJ.next()).writeToParcel(parcel, i12);
                        }
                    }
                }

                /* compiled from: RatingFormAddValueType.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Step> {
                    @Override // android.os.Parcelable.Creator
                    public final Step createFromParcel(Parcel parcel) {
                        ArrayList arrayList;
                        int i12 = parcel.readInt();
                        String string = parcel.readString();
                        String string2 = parcel.readString();
                        String string3 = parcel.readString();
                        int iC2 = 0;
                        boolean z12 = parcel.readInt() != 0;
                        String string4 = parcel.readString();
                        if (parcel.readInt() == 0) {
                            arrayList = null;
                        } else {
                            int i13 = parcel.readInt();
                            ArrayList arrayList2 = new ArrayList(i13);
                            while (iC2 != i13) {
                                iC2 = com.avito.android.actions_sheet.a.c(Validation.CREATOR, parcel, arrayList2, iC2, 1);
                            }
                            arrayList = arrayList2;
                        }
                        return new Step(i12, string, string2, string3, z12, string4, arrayList);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Step[] newArray(int i12) {
                        return new Step[i12];
                    }
                }

                public Step(int i12, @l String str, @k String str2, @l String str3, boolean z12, @l String str4, @l List<Validation> list) {
                    this.id = i12;
                    this.slug = str;
                    this.title = str2;
                    this.navigationTitle = str3;
                    this.isFinished = z12;
                    this.focusOnField = str4;
                    this.validations = list;
                }

                @l
                /* renamed from: c, reason: from getter */
                public final String getFocusOnField() {
                    return this.focusOnField;
                }

                /* renamed from: d, reason: from getter */
                public final int getId() {
                    return this.id;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @l
                /* renamed from: e, reason: from getter */
                public final String getNavigationTitle() {
                    return this.navigationTitle;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Step)) {
                        return false;
                    }
                    Step step = (Step) obj;
                    return this.id == step.id && L.f(this.slug, step.slug) && L.f(this.title, step.title) && L.f(this.navigationTitle, step.navigationTitle) && this.isFinished == step.isFinished && L.f(this.focusOnField, step.focusOnField) && L.f(this.validations, step.validations);
                }

                @l
                public final List<Validation> f() {
                    return this.validations;
                }

                @l
                public final String getSlug() {
                    return this.slug;
                }

                @k
                public final String getTitle() {
                    return this.title;
                }

                public final int hashCode() {
                    int iHashCode = Integer.hashCode(this.id) * 31;
                    String str = this.slug;
                    int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title);
                    String str2 = this.navigationTitle;
                    int i12 = r.i((iD2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isFinished);
                    String str3 = this.focusOnField;
                    int iHashCode2 = (i12 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    List<Validation> list = this.validations;
                    return iHashCode2 + (list != null ? list.hashCode() : 0);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Step(id=");
                    sb2.append(this.id);
                    sb2.append(", slug=");
                    sb2.append(this.slug);
                    sb2.append(", title=");
                    sb2.append(this.title);
                    sb2.append(", navigationTitle=");
                    sb2.append(this.navigationTitle);
                    sb2.append(", isFinished=");
                    sb2.append(this.isFinished);
                    sb2.append(", focusOnField=");
                    sb2.append(this.focusOnField);
                    sb2.append(", validations=");
                    return H.p(sb2, this.validations, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeInt(this.id);
                    parcel.writeString(this.slug);
                    parcel.writeString(this.title);
                    parcel.writeString(this.navigationTitle);
                    parcel.writeInt(this.isFinished ? 1 : 0);
                    parcel.writeString(this.focusOnField);
                    List<Validation> list = this.validations;
                    if (list == null) {
                        parcel.writeInt(0);
                        return;
                    }
                    Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        ((Validation) itA.next()).writeToParcel(parcel, i12);
                    }
                }
            }

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<StepsListData> {
                @Override // android.os.Parcelable.Creator
                public final StepsListData createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(Step.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new StepsListData(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final StepsListData[] newArray(int i12) {
                    return new StepsListData[i12];
                }
            }

            public StepsListData(@k List<Step> list, @l Integer num) {
                this.steps = list;
                this.allProbableSteps = num;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final Integer getAllProbableSteps() {
                return this.allProbableSteps;
            }

            @k
            public final List<Step> d() {
                return this.steps;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StepsListData)) {
                    return false;
                }
                StepsListData stepsListData = (StepsListData) obj;
                return L.f(this.steps, stepsListData.steps) && L.f(this.allProbableSteps, stepsListData.allProbableSteps);
            }

            public final int hashCode() {
                int iHashCode = this.steps.hashCode() * 31;
                Integer num = this.allProbableSteps;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("StepsListData(steps=");
                sb2.append(this.steps);
                sb2.append(", allProbableSteps=");
                return s.j(sb2, this.allProbableSteps, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                Iterator itJ = C0.j(this.steps, parcel);
                while (itJ.hasNext()) {
                    ((Step) itJ.next()).writeToParcel(parcel, i12);
                }
                Integer num = this.allProbableSteps;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StepsList> {
            @Override // android.os.Parcelable.Creator
            public final StepsList createFromParcel(Parcel parcel) {
                return new StepsList(StepsListData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final StepsList[] newArray(int i12) {
                return new StepsList[i12];
            }
        }

        public StepsList(@k StepsListData stepsListData) {
            super(null);
            this.data = stepsListData;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final StepsListData getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.data.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$ValidationFailed;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$ValidationFailed$ValidationFailedData;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$ValidationFailed$ValidationFailedData;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$ValidationFailed$ValidationFailedData;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$ValidationFailed$ValidationFailedData;", "ValidationFailedData", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class ValidationFailed extends RatingFormAddValueType {

        @k
        public static final Parcelable.Creator<ValidationFailed> CREATOR = new a();

        @c("data")
        @k
        private final ValidationFailedData data;

        /* compiled from: RatingFormAddValueType.kt */
        @d
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$ValidationFailed$ValidationFailedData;", "Landroid/os/Parcelable;", "", "stepId", "", "fieldSlug", "fieldId", "", "errors", "<init>", "(ILjava/lang/String;ILjava/util/List;)V", "I", "getStepId", "()I", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "d", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ValidationFailedData implements Parcelable {

            @k
            public static final Parcelable.Creator<ValidationFailedData> CREATOR = new a();

            @c("errors")
            @l
            private final List<String> errors;

            @c("fieldId")
            private final int fieldId;

            @c("fieldSlug")
            @k
            private final String fieldSlug;

            @c("stepId")
            private final int stepId;

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ValidationFailedData> {
                @Override // android.os.Parcelable.Creator
                public final ValidationFailedData createFromParcel(Parcel parcel) {
                    return new ValidationFailedData(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                public final ValidationFailedData[] newArray(int i12) {
                    return new ValidationFailedData[i12];
                }
            }

            public ValidationFailedData(int i12, @k String str, int i13, @l List<String> list) {
                this.stepId = i12;
                this.fieldSlug = str;
                this.fieldId = i13;
                this.errors = list;
            }

            @l
            public final List<String> c() {
                return this.errors;
            }

            /* renamed from: d, reason: from getter */
            public final int getFieldId() {
                return this.fieldId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @k
            /* renamed from: e, reason: from getter */
            public final String getFieldSlug() {
                return this.fieldSlug;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ValidationFailedData)) {
                    return false;
                }
                ValidationFailedData validationFailedData = (ValidationFailedData) obj;
                return this.stepId == validationFailedData.stepId && L.f(this.fieldSlug, validationFailedData.fieldSlug) && this.fieldId == validationFailedData.fieldId && L.f(this.errors, validationFailedData.errors);
            }

            public final int hashCode() {
                int iE2 = r.e(this.fieldId, H.d(Integer.hashCode(this.stepId) * 31, 31, this.fieldSlug), 31);
                List<String> list = this.errors;
                return iE2 + (list == null ? 0 : list.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ValidationFailedData(stepId=");
                sb2.append(this.stepId);
                sb2.append(", fieldSlug=");
                sb2.append(this.fieldSlug);
                sb2.append(", fieldId=");
                sb2.append(this.fieldId);
                sb2.append(", errors=");
                return H.p(sb2, this.errors, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.stepId);
                parcel.writeString(this.fieldSlug);
                parcel.writeInt(this.fieldId);
                parcel.writeStringList(this.errors);
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ValidationFailed> {
            @Override // android.os.Parcelable.Creator
            public final ValidationFailed createFromParcel(Parcel parcel) {
                return new ValidationFailed(ValidationFailedData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ValidationFailed[] newArray(int i12) {
                return new ValidationFailed[i12];
            }
        }

        public ValidationFailed(@k ValidationFailedData validationFailedData) {
            super(null);
            this.data = validationFailedData;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final ValidationFailedData getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.data.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: RatingFormAddValueType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$ValueAccepted;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$ValueAccepted$ValueAcceptedData;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$ValueAccepted$ValueAcceptedData;)V", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$ValueAccepted$ValueAcceptedData;", "c", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$ValueAccepted$ValueAcceptedData;", "ValueAcceptedData", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class ValueAccepted extends RatingFormAddValueType {

        @k
        public static final Parcelable.Creator<ValueAccepted> CREATOR = new a();

        @c("data")
        @k
        private final ValueAcceptedData data;

        /* compiled from: RatingFormAddValueType.kt */
        @d
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$ValueAccepted$ValueAcceptedData;", "Landroid/os/Parcelable;", "", "stepId", "", "fieldSlug", "fieldId", "<init>", "(ILjava/lang/String;I)V", "I", "getStepId", "()I", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ValueAcceptedData implements Parcelable {

            @k
            public static final Parcelable.Creator<ValueAcceptedData> CREATOR = new a();

            @c("fieldId")
            private final int fieldId;

            @c("fieldSlug")
            @k
            private final String fieldSlug;

            @c("stepId")
            private final int stepId;

            /* compiled from: RatingFormAddValueType.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ValueAcceptedData> {
                @Override // android.os.Parcelable.Creator
                public final ValueAcceptedData createFromParcel(Parcel parcel) {
                    return new ValueAcceptedData(parcel.readInt(), parcel.readString(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final ValueAcceptedData[] newArray(int i12) {
                    return new ValueAcceptedData[i12];
                }
            }

            public ValueAcceptedData(int i12, @k String str, int i13) {
                this.stepId = i12;
                this.fieldSlug = str;
                this.fieldId = i13;
            }

            /* renamed from: c, reason: from getter */
            public final int getFieldId() {
                return this.fieldId;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final String getFieldSlug() {
                return this.fieldSlug;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.stepId);
                parcel.writeString(this.fieldSlug);
                parcel.writeInt(this.fieldId);
            }
        }

        /* compiled from: RatingFormAddValueType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ValueAccepted> {
            @Override // android.os.Parcelable.Creator
            public final ValueAccepted createFromParcel(Parcel parcel) {
                return new ValueAccepted(ValueAcceptedData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ValueAccepted[] newArray(int i12) {
                return new ValueAccepted[i12];
            }
        }

        public ValueAccepted(@k ValueAcceptedData valueAcceptedData) {
            super(null);
            this.data = valueAcceptedData;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final ValueAcceptedData getData() {
            return this.data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.data.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ RatingFormAddValueType(C42822w c42822w) {
        this();
    }

    private RatingFormAddValueType() {
    }
}
