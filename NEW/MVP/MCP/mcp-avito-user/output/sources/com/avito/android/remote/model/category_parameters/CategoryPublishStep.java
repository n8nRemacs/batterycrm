package com.avito.android.remote.model.category_parameters;

import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import aW.InterfaceC19824b;
import aW.InterfaceC19825c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gson.d;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.parse.adapter.WizardConfigTypeAdapter;
import com.google.gson.annotations.b;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CategoryPublishStep.kt */
@InterfaceC19824b
@d
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b!\"#$%&'()*+B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0013\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0005H\u0016R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0012\u0010\u0017\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0012\u0010\u0019\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\n\u0082\u0001\u000b,-./0123456¨\u00067"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep;", "Landroid/os/Parcelable;", "()V", LocalPublishState.FIELDS, "", "", "getFields", "()Ljava/util/List;", "hash", "getHash", "()Ljava/lang/String;", "id", "getId", "shortTitle", "getShortTitle", "skipOnBackwards", "", "getSkipOnBackwards", "()Z", "subtitle", "getSubtitle", "subtype", "getSubtype", "title", "getTitle", "type", "getType", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Accordion", "MergedPretendPremoderation", "Params", "Premoderation", "PriceList", "Request", "Restriction", "Select", "SuggestCategory", "Vin", "Wizard", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Accordion;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$MergedPretendPremoderation;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Premoderation;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$PriceList;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Request;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Restriction;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Select;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$SuggestCategory;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Vin;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Wizard;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class CategoryPublishStep implements Parcelable {

    /* compiled from: CategoryPublishStep.kt */
    @K51.d
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001a¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Accordion;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep;", "", "id", "hash", "subtype", "", LocalPublishState.FIELDS, "title", "shortTitle", "subtitle", "", "skipOnBackwards", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getHash", "getSubtype", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "getTitle", "getShortTitle", "getSubtitle", "Z", "getSkipOnBackwards", "()Z", "getType", "type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Accordion extends CategoryPublishStep {

        @k
        public static final Parcelable.Creator<Accordion> CREATOR = new Creator();

        @c(LocalPublishState.FIELDS)
        @k
        private final List<String> fields;

        @c("hash")
        @l
        private final String hash;

        @c("id")
        @k
        private final String id;

        @c("shortTitle")
        @l
        private final String shortTitle;

        @c("skipOnBackwards")
        private final boolean skipOnBackwards;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("subtype")
        @l
        private final String subtype;

        @c("title")
        @k
        private final String title;

        /* compiled from: CategoryPublishStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Accordion> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Accordion createFromParcel(@k Parcel parcel) {
                return new Accordion(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Accordion[] newArray(int i12) {
                return new Accordion[i12];
            }
        }

        public /* synthetic */ Accordion(String str, String str2, String str3, List list, String str4, String str5, String str6, boolean z12, int i12, C42822w c42822w) {
            this(str, str2, str3, list, str4, (i12 & 32) != 0 ? null : str5, str6, z12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public List<String> getFields() {
            return this.fields;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getHash() {
            return this.hash;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getShortTitle() {
            return this.shortTitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        public boolean getSkipOnBackwards() {
            return this.skipOnBackwards;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtype() {
            return this.subtype;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getType() {
            return "accordion";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.hash);
            parcel.writeString(this.subtype);
            parcel.writeStringList(this.fields);
            parcel.writeString(this.title);
            parcel.writeString(this.shortTitle);
            parcel.writeString(this.subtitle);
            parcel.writeInt(this.skipOnBackwards ? 1 : 0);
        }

        public Accordion(@k String str, @l String str2, @l String str3, @k List<String> list, @k String str4, @l String str5, @l String str6, boolean z12) {
            super(null);
            this.id = str;
            this.hash = str2;
            this.subtype = str3;
            this.fields = list;
            this.title = str4;
            this.shortTitle = str5;
            this.subtitle = str6;
            this.skipOnBackwards = z12;
        }
    }

    /* compiled from: CategoryPublishStep.kt */
    @InterfaceC19825c
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0019R\u0016\u0010&\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0019R\u0016\u0010(\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0019R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0019¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$MergedPretendPremoderation;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Request;", "request", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Premoderation;", "premoderation", "<init>", "(Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Request;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Premoderation;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Request;", "getRequest", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Request;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Premoderation;", "getPremoderation", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Premoderation;", "", "getId", "()Ljava/lang/String;", "id", "getHash", "hash", "getSubtype", "subtype", "", "getFields", "()Ljava/util/List;", LocalPublishState.FIELDS, "getTitle", "title", "getShortTitle", "shortTitle", "getSubtitle", "subtitle", "", "getSkipOnBackwards", "()Z", "skipOnBackwards", "getType", "type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class MergedPretendPremoderation extends CategoryPublishStep {

        @k
        public static final Parcelable.Creator<MergedPretendPremoderation> CREATOR = new Creator();

        @k
        private final Premoderation premoderation;

        @k
        private final Request request;

        /* compiled from: CategoryPublishStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MergedPretendPremoderation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MergedPretendPremoderation createFromParcel(@k Parcel parcel) {
                return new MergedPretendPremoderation(Request.CREATOR.createFromParcel(parcel), Premoderation.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MergedPretendPremoderation[] newArray(int i12) {
                return new MergedPretendPremoderation[i12];
            }
        }

        public MergedPretendPremoderation(@k Request request, @k Premoderation premoderation) {
            super(null);
            this.request = request;
            this.premoderation = premoderation;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public List<String> getFields() {
            return this.request.getFields();
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getHash() {
            return this.request.getHash();
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getId() {
            return this.request.getId();
        }

        @k
        public final Premoderation getPremoderation() {
            return this.premoderation;
        }

        @k
        public final Request getRequest() {
            return this.request;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getShortTitle() {
            return this.request.getShortTitle();
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        public boolean getSkipOnBackwards() {
            return this.request.getSkipOnBackwards();
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtitle() {
            return this.request.getSubtitle();
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtype() {
            return this.request.getSubtype();
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getTitle() {
            return this.request.getTitle();
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getType() {
            return "merged_pretend_premoderation";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.request.writeToParcel(parcel, flags);
            this.premoderation.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: CategoryPublishStep.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\f23456789:;<=Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001dR\u0016\u00101\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006>"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep;", "Lcom/avito/android/remote/model/category_parameters/ThemedStep;", "", "id", "hash", "subtype", "", LocalPublishState.FIELDS, "title", "shortTitle", "subtitle", "", "skipOnBackwards", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Config;", Navigation.CONFIG, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Config;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getHash", "getSubtype", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "getTitle", "getShortTitle", "getSubtitle", "Z", "getSkipOnBackwards", "()Z", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Config;", "getConfig", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Config;", "getType", "type", "Lcom/avito/android/remote/model/search/Theme;", "getTheme", "()Lcom/avito/android/remote/model/search/Theme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Config", "Confirmation", "DisclaimerPosition", "FormStyle", "HeaderStyle", "NavigationButton", "NavigationButtonAction", "NavigationButtonStyle", "NavigationButtonsOrientation", "ParamsToFill", "Predicate", "ScanButtonData", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class Params extends CategoryPublishStep implements ThemedStep {

        @k
        public static final Parcelable.Creator<Params> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @l
        private final Config config;

        @c(LocalPublishState.FIELDS)
        @k
        private final List<String> fields;

        @c("hash")
        @l
        private final String hash;

        @c("id")
        @k
        private final String id;

        @c("shortTitle")
        @l
        private final String shortTitle;

        @c("skipOnBackwards")
        private final boolean skipOnBackwards;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("subtype")
        @l
        private final String subtype;

        @c("title")
        @k
        private final String title;

        /* compiled from: CategoryPublishStep.kt */
        @K51.d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Confirmation;", "Landroid/os/Parcelable;", "", "title", "subtitle", "cancelButtonText", "confirmationButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Confirmation;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getCancelButtonText", "getConfirmationButtonText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Confirmation implements Parcelable {

            @k
            public static final Parcelable.Creator<Confirmation> CREATOR = new Creator();

            @c("cancelButtonText")
            @l
            private final String cancelButtonText;

            @c("confirmationButtonText")
            @l
            private final String confirmationButtonText;

            @c("subtitle")
            @l
            private final String subtitle;

            @c("title")
            @l
            private final String title;

            /* compiled from: CategoryPublishStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Confirmation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Confirmation createFromParcel(@k Parcel parcel) {
                    return new Confirmation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Confirmation[] newArray(int i12) {
                    return new Confirmation[i12];
                }
            }

            public Confirmation(@l String str, @l String str2, @l String str3, @l String str4) {
                this.title = str;
                this.subtitle = str2;
                this.cancelButtonText = str3;
                this.confirmationButtonText = str4;
            }

            public static /* synthetic */ Confirmation copy$default(Confirmation confirmation, String str, String str2, String str3, String str4, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = confirmation.title;
                }
                if ((i12 & 2) != 0) {
                    str2 = confirmation.subtitle;
                }
                if ((i12 & 4) != 0) {
                    str3 = confirmation.cancelButtonText;
                }
                if ((i12 & 8) != 0) {
                    str4 = confirmation.confirmationButtonText;
                }
                return confirmation.copy(str, str2, str3, str4);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final String getCancelButtonText() {
                return this.cancelButtonText;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final String getConfirmationButtonText() {
                return this.confirmationButtonText;
            }

            @k
            public final Confirmation copy(@l String title, @l String subtitle, @l String cancelButtonText, @l String confirmationButtonText) {
                return new Confirmation(title, subtitle, cancelButtonText, confirmationButtonText);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Confirmation)) {
                    return false;
                }
                Confirmation confirmation = (Confirmation) other;
                return L.f(this.title, confirmation.title) && L.f(this.subtitle, confirmation.subtitle) && L.f(this.cancelButtonText, confirmation.cancelButtonText) && L.f(this.confirmationButtonText, confirmation.confirmationButtonText);
            }

            @l
            public final String getCancelButtonText() {
                return this.cancelButtonText;
            }

            @l
            public final String getConfirmationButtonText() {
                return this.confirmationButtonText;
            }

            @l
            public final String getSubtitle() {
                return this.subtitle;
            }

            @l
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.subtitle;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.cancelButtonText;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.confirmationButtonText;
                return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Confirmation(title=");
                sb2.append(this.title);
                sb2.append(", subtitle=");
                sb2.append(this.subtitle);
                sb2.append(", cancelButtonText=");
                sb2.append(this.cancelButtonText);
                sb2.append(", confirmationButtonText=");
                return C22026a.c(sb2, this.confirmationButtonText, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.subtitle);
                parcel.writeString(this.cancelButtonText);
                parcel.writeString(this.confirmationButtonText);
            }
        }

        /* compiled from: CategoryPublishStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Params> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Params createFromParcel(@k Parcel parcel) {
                return new Params(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Config.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Params[] newArray(int i12) {
                return new Params[i12];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CategoryPublishStep.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$DisclaimerPosition;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "isBottom", "()Z", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "BOTTOM", "TOP", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class DisclaimerPosition implements Parcelable {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ DisclaimerPosition[] $VALUES;

            @k
            public static final Parcelable.Creator<DisclaimerPosition> CREATOR;

            @c("bottom")
            public static final DisclaimerPosition BOTTOM = new DisclaimerPosition("BOTTOM", 0);

            @c("top")
            public static final DisclaimerPosition TOP = new DisclaimerPosition("TOP", 1);

            /* compiled from: CategoryPublishStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DisclaimerPosition> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DisclaimerPosition createFromParcel(@k Parcel parcel) {
                    return DisclaimerPosition.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DisclaimerPosition[] newArray(int i12) {
                    return new DisclaimerPosition[i12];
                }
            }

            private static final /* synthetic */ DisclaimerPosition[] $values() {
                return new DisclaimerPosition[]{BOTTOM, TOP};
            }

            static {
                DisclaimerPosition[] disclaimerPositionArr$values = $values();
                $VALUES = disclaimerPositionArr$values;
                $ENTRIES = kotlin.enums.c.a(disclaimerPositionArr$values);
                CREATOR = new Creator();
            }

            private DisclaimerPosition(String str, int i12) {
            }

            @k
            public static a<DisclaimerPosition> getEntries() {
                return $ENTRIES;
            }

            public static DisclaimerPosition valueOf(String str) {
                return (DisclaimerPosition) Enum.valueOf(DisclaimerPosition.class, str);
            }

            public static DisclaimerPosition[] values() {
                return (DisclaimerPosition[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final boolean isBottom() {
                return this == BOTTOM;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(name());
            }
        }

        /* compiled from: CategoryPublishStep.kt */
        @K51.d
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\b¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$FormStyle;", "Landroid/os/Parcelable;", "", "hasSpaceBefore", "hasSpaceAfter", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$FormStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getHasSpaceBefore", "getHasSpaceAfter", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FormStyle implements Parcelable {

            @k
            public static final Parcelable.Creator<FormStyle> CREATOR = new Creator();

            @c("hasSpaceAfter")
            @l
            private final Boolean hasSpaceAfter;

            @c("hasSpaceBefore")
            @l
            private final Boolean hasSpaceBefore;

            /* compiled from: CategoryPublishStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<FormStyle> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final FormStyle createFromParcel(@k Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2 = null;
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() != 0) {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new FormStyle(boolValueOf, boolValueOf2);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final FormStyle[] newArray(int i12) {
                    return new FormStyle[i12];
                }
            }

            public FormStyle(@l Boolean bool, @l Boolean bool2) {
                this.hasSpaceBefore = bool;
                this.hasSpaceAfter = bool2;
            }

            public static /* synthetic */ FormStyle copy$default(FormStyle formStyle, Boolean bool, Boolean bool2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    bool = formStyle.hasSpaceBefore;
                }
                if ((i12 & 2) != 0) {
                    bool2 = formStyle.hasSpaceAfter;
                }
                return formStyle.copy(bool, bool2);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final Boolean getHasSpaceBefore() {
                return this.hasSpaceBefore;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final Boolean getHasSpaceAfter() {
                return this.hasSpaceAfter;
            }

            @k
            public final FormStyle copy(@l Boolean hasSpaceBefore, @l Boolean hasSpaceAfter) {
                return new FormStyle(hasSpaceBefore, hasSpaceAfter);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FormStyle)) {
                    return false;
                }
                FormStyle formStyle = (FormStyle) other;
                return L.f(this.hasSpaceBefore, formStyle.hasSpaceBefore) && L.f(this.hasSpaceAfter, formStyle.hasSpaceAfter);
            }

            @l
            public final Boolean getHasSpaceAfter() {
                return this.hasSpaceAfter;
            }

            @l
            public final Boolean getHasSpaceBefore() {
                return this.hasSpaceBefore;
            }

            public int hashCode() {
                Boolean bool = this.hasSpaceBefore;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.hasSpaceAfter;
                return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("FormStyle(hasSpaceBefore=");
                sb2.append(this.hasSpaceBefore);
                sb2.append(", hasSpaceAfter=");
                return C0.g(sb2, this.hasSpaceAfter, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Boolean bool = this.hasSpaceBefore;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
                Boolean bool2 = this.hasSpaceAfter;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool2);
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CategoryPublishStep.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$HeaderStyle;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "COMPACT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class HeaderStyle implements Parcelable {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ HeaderStyle[] $VALUES;

            @c("compact")
            public static final HeaderStyle COMPACT = new HeaderStyle("COMPACT", 0);

            @k
            public static final Parcelable.Creator<HeaderStyle> CREATOR;

            /* compiled from: CategoryPublishStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<HeaderStyle> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final HeaderStyle createFromParcel(@k Parcel parcel) {
                    return HeaderStyle.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final HeaderStyle[] newArray(int i12) {
                    return new HeaderStyle[i12];
                }
            }

            private static final /* synthetic */ HeaderStyle[] $values() {
                return new HeaderStyle[]{COMPACT};
            }

            static {
                HeaderStyle[] headerStyleArr$values = $values();
                $VALUES = headerStyleArr$values;
                $ENTRIES = kotlin.enums.c.a(headerStyleArr$values);
                CREATOR = new Creator();
            }

            private HeaderStyle(String str, int i12) {
            }

            @k
            public static a<HeaderStyle> getEntries() {
                return $ENTRIES;
            }

            public static HeaderStyle valueOf(String str) {
                return (HeaderStyle) Enum.valueOf(HeaderStyle.class, str);
            }

            public static HeaderStyle[] values() {
                return (HeaderStyle[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(name());
            }
        }

        /* compiled from: CategoryPublishStep.kt */
        @K51.d
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b,\u0010\"R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButton;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "title", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonAction;", "action", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Confirmation;", "confirmation", "titleVertical", "", "Lcom/avito/android/beduin_models/BeduinAction;", "beduinActions", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ParamsToFill;", "paramsToFill", "<init>", "(Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonStyle;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonAction;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Confirmation;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ParamsToFill;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonStyle;", "getStyle", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonStyle;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonAction;", "getAction", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonAction;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Confirmation;", "getConfirmation", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Confirmation;", "getTitleVertical", "Ljava/util/List;", "getBeduinActions", "()Ljava/util/List;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ParamsToFill;", "getParamsToFill", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ParamsToFill;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NavigationButton implements Parcelable {

            @k
            public static final Parcelable.Creator<NavigationButton> CREATOR = new Creator();

            @c("action")
            @l
            private final NavigationButtonAction action;

            @c("beduinActions")
            @l
            private final List<BeduinAction> beduinActions;

            @c("confirmation")
            @l
            private final Confirmation confirmation;

            @c(ContextActionHandler.Link.DEEPLINK)
            @l
            private final DeepLink deepLink;

            @c("paramsToFill")
            @l
            private final ParamsToFill paramsToFill;

            @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
            @l
            private final NavigationButtonStyle style;

            @c("title")
            @k
            private final String title;

            @c("titleVertical")
            @l
            private final String titleVertical;

            /* compiled from: CategoryPublishStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NavigationButton> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final NavigationButton createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    NavigationButtonStyle navigationButtonStyleCreateFromParcel = parcel.readInt() == 0 ? null : NavigationButtonStyle.CREATOR.createFromParcel(parcel);
                    String string = parcel.readString();
                    NavigationButtonAction navigationButtonActionCreateFromParcel = parcel.readInt() == 0 ? null : NavigationButtonAction.CREATOR.createFromParcel(parcel);
                    DeepLink deepLink = (DeepLink) parcel.readParcelable(NavigationButton.class.getClassLoader());
                    Confirmation confirmationCreateFromParcel = parcel.readInt() == 0 ? null : Confirmation.CREATOR.createFromParcel(parcel);
                    String string2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        arrayList = new ArrayList(i12);
                        int iL2 = 0;
                        while (iL2 != i12) {
                            iL2 = com.avito.android.actions_sheet.a.l(NavigationButton.class, parcel, arrayList, iL2, 1);
                        }
                    }
                    return new NavigationButton(navigationButtonStyleCreateFromParcel, string, navigationButtonActionCreateFromParcel, deepLink, confirmationCreateFromParcel, string2, arrayList, parcel.readInt() != 0 ? ParamsToFill.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final NavigationButton[] newArray(int i12) {
                    return new NavigationButton[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public NavigationButton(@l NavigationButtonStyle navigationButtonStyle, @k String str, @l NavigationButtonAction navigationButtonAction, @l DeepLink deepLink, @l Confirmation confirmation, @l String str2, @l List<? extends BeduinAction> list, @l ParamsToFill paramsToFill) {
                this.style = navigationButtonStyle;
                this.title = str;
                this.action = navigationButtonAction;
                this.deepLink = deepLink;
                this.confirmation = confirmation;
                this.titleVertical = str2;
                this.beduinActions = list;
                this.paramsToFill = paramsToFill;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final NavigationButtonAction getAction() {
                return this.action;
            }

            @l
            public final List<BeduinAction> getBeduinActions() {
                return this.beduinActions;
            }

            @l
            public final Confirmation getConfirmation() {
                return this.confirmation;
            }

            @l
            public final DeepLink getDeepLink() {
                return this.deepLink;
            }

            @l
            public final ParamsToFill getParamsToFill() {
                return this.paramsToFill;
            }

            @l
            public final NavigationButtonStyle getStyle() {
                return this.style;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            @l
            public final String getTitleVertical() {
                return this.titleVertical;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                NavigationButtonStyle navigationButtonStyle = this.style;
                if (navigationButtonStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    navigationButtonStyle.writeToParcel(parcel, flags);
                }
                parcel.writeString(this.title);
                NavigationButtonAction navigationButtonAction = this.action;
                if (navigationButtonAction == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    navigationButtonAction.writeToParcel(parcel, flags);
                }
                parcel.writeParcelable(this.deepLink, flags);
                Confirmation confirmation = this.confirmation;
                if (confirmation == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    confirmation.writeToParcel(parcel, flags);
                }
                parcel.writeString(this.titleVertical);
                List<BeduinAction> list = this.beduinActions;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA.next(), flags);
                    }
                }
                ParamsToFill paramsToFill = this.paramsToFill;
                if (paramsToFill == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    paramsToFill.writeToParcel(parcel, flags);
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CategoryPublishStep.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonAction;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "PERFORM_DEEP_LINK", "CONTINUE_PUBLISH", "CONDITIONAL_ACTION", "EXECUTE_BEDUIN_ACTIONS", "SET_MANUAL_DATA_ENTRY", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class NavigationButtonAction implements Parcelable {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ NavigationButtonAction[] $VALUES;

            @k
            public static final Parcelable.Creator<NavigationButtonAction> CREATOR;

            @c("performDeepLink")
            public static final NavigationButtonAction PERFORM_DEEP_LINK = new NavigationButtonAction("PERFORM_DEEP_LINK", 0);

            @c("continuePublish")
            public static final NavigationButtonAction CONTINUE_PUBLISH = new NavigationButtonAction("CONTINUE_PUBLISH", 1);

            @c("conditionalAction")
            public static final NavigationButtonAction CONDITIONAL_ACTION = new NavigationButtonAction("CONDITIONAL_ACTION", 2);

            @c("executeBeduinActions")
            public static final NavigationButtonAction EXECUTE_BEDUIN_ACTIONS = new NavigationButtonAction("EXECUTE_BEDUIN_ACTIONS", 3);

            @c("setManualDataEntry")
            public static final NavigationButtonAction SET_MANUAL_DATA_ENTRY = new NavigationButtonAction("SET_MANUAL_DATA_ENTRY", 4);

            /* compiled from: CategoryPublishStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NavigationButtonAction> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final NavigationButtonAction createFromParcel(@k Parcel parcel) {
                    return NavigationButtonAction.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final NavigationButtonAction[] newArray(int i12) {
                    return new NavigationButtonAction[i12];
                }
            }

            private static final /* synthetic */ NavigationButtonAction[] $values() {
                return new NavigationButtonAction[]{PERFORM_DEEP_LINK, CONTINUE_PUBLISH, CONDITIONAL_ACTION, EXECUTE_BEDUIN_ACTIONS, SET_MANUAL_DATA_ENTRY};
            }

            static {
                NavigationButtonAction[] navigationButtonActionArr$values = $values();
                $VALUES = navigationButtonActionArr$values;
                $ENTRIES = kotlin.enums.c.a(navigationButtonActionArr$values);
                CREATOR = new Creator();
            }

            private NavigationButtonAction(String str, int i12) {
            }

            @k
            public static a<NavigationButtonAction> getEntries() {
                return $ENTRIES;
            }

            public static NavigationButtonAction valueOf(String str) {
                return (NavigationButtonAction) Enum.valueOf(NavigationButtonAction.class, str);
            }

            public static NavigationButtonAction[] values() {
                return (NavigationButtonAction[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CategoryPublishStep.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonStyle;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "SECONDARY", "PRIMARY", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class NavigationButtonStyle implements Parcelable {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ NavigationButtonStyle[] $VALUES;

            @k
            public static final Parcelable.Creator<NavigationButtonStyle> CREATOR;

            @c("secondary")
            public static final NavigationButtonStyle SECONDARY = new NavigationButtonStyle("SECONDARY", 0);

            @c("primary")
            public static final NavigationButtonStyle PRIMARY = new NavigationButtonStyle("PRIMARY", 1);

            /* compiled from: CategoryPublishStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NavigationButtonStyle> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final NavigationButtonStyle createFromParcel(@k Parcel parcel) {
                    return NavigationButtonStyle.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final NavigationButtonStyle[] newArray(int i12) {
                    return new NavigationButtonStyle[i12];
                }
            }

            private static final /* synthetic */ NavigationButtonStyle[] $values() {
                return new NavigationButtonStyle[]{SECONDARY, PRIMARY};
            }

            static {
                NavigationButtonStyle[] navigationButtonStyleArr$values = $values();
                $VALUES = navigationButtonStyleArr$values;
                $ENTRIES = kotlin.enums.c.a(navigationButtonStyleArr$values);
                CREATOR = new Creator();
            }

            private NavigationButtonStyle(String str, int i12) {
            }

            @k
            public static a<NavigationButtonStyle> getEntries() {
                return $ENTRIES;
            }

            public static NavigationButtonStyle valueOf(String str) {
                return (NavigationButtonStyle) Enum.valueOf(NavigationButtonStyle.class, str);
            }

            public static NavigationButtonStyle[] values() {
                return (NavigationButtonStyle[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CategoryPublishStep.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonsOrientation;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "HORIZONTAL", "VERTICAL", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class NavigationButtonsOrientation implements Parcelable {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ NavigationButtonsOrientation[] $VALUES;

            @k
            public static final Parcelable.Creator<NavigationButtonsOrientation> CREATOR;

            @c("horizontal")
            public static final NavigationButtonsOrientation HORIZONTAL = new NavigationButtonsOrientation("HORIZONTAL", 0);

            @c("vertical")
            public static final NavigationButtonsOrientation VERTICAL = new NavigationButtonsOrientation("VERTICAL", 1);

            /* compiled from: CategoryPublishStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NavigationButtonsOrientation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final NavigationButtonsOrientation createFromParcel(@k Parcel parcel) {
                    return NavigationButtonsOrientation.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final NavigationButtonsOrientation[] newArray(int i12) {
                    return new NavigationButtonsOrientation[i12];
                }
            }

            private static final /* synthetic */ NavigationButtonsOrientation[] $values() {
                return new NavigationButtonsOrientation[]{HORIZONTAL, VERTICAL};
            }

            static {
                NavigationButtonsOrientation[] navigationButtonsOrientationArr$values = $values();
                $VALUES = navigationButtonsOrientationArr$values;
                $ENTRIES = kotlin.enums.c.a(navigationButtonsOrientationArr$values);
                CREATOR = new Creator();
            }

            private NavigationButtonsOrientation(String str, int i12) {
            }

            @k
            public static a<NavigationButtonsOrientation> getEntries() {
                return $ENTRIES;
            }

            public static NavigationButtonsOrientation valueOf(String str) {
                return (NavigationButtonsOrientation) Enum.valueOf(NavigationButtonsOrientation.class, str);
            }

            public static NavigationButtonsOrientation[] values() {
                return (NavigationButtonsOrientation[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(name());
            }
        }

        /* compiled from: CategoryPublishStep.kt */
        @K51.d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000b¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ParamsToFill;", "Landroid/os/Parcelable;", "", "vinByRegNumUserBackstepId", "autoFillItemId", "vinId", "vehicleNumberId", "autoRegNumByPhoto", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ParamsToFill;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getVinByRegNumUserBackstepId", "getAutoFillItemId", "getVinId", "getVehicleNumberId", "getAutoRegNumByPhoto", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ParamsToFill implements Parcelable {

            @k
            public static final Parcelable.Creator<ParamsToFill> CREATOR = new Creator();

            @c("autoFillItemId")
            @l
            private final String autoFillItemId;

            @c("autoRegNumByPhoto")
            @l
            private final String autoRegNumByPhoto;

            @c("vehicleNumberId")
            @l
            private final String vehicleNumberId;

            @c("vinByRegNumUserBackstepId")
            @l
            private final String vinByRegNumUserBackstepId;

            @c("vinId")
            @l
            private final String vinId;

            /* compiled from: CategoryPublishStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ParamsToFill> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ParamsToFill createFromParcel(@k Parcel parcel) {
                    return new ParamsToFill(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ParamsToFill[] newArray(int i12) {
                    return new ParamsToFill[i12];
                }
            }

            public ParamsToFill(@l String str, @l String str2, @l String str3, @l String str4, @l String str5) {
                this.vinByRegNumUserBackstepId = str;
                this.autoFillItemId = str2;
                this.vinId = str3;
                this.vehicleNumberId = str4;
                this.autoRegNumByPhoto = str5;
            }

            public static /* synthetic */ ParamsToFill copy$default(ParamsToFill paramsToFill, String str, String str2, String str3, String str4, String str5, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = paramsToFill.vinByRegNumUserBackstepId;
                }
                if ((i12 & 2) != 0) {
                    str2 = paramsToFill.autoFillItemId;
                }
                String str6 = str2;
                if ((i12 & 4) != 0) {
                    str3 = paramsToFill.vinId;
                }
                String str7 = str3;
                if ((i12 & 8) != 0) {
                    str4 = paramsToFill.vehicleNumberId;
                }
                String str8 = str4;
                if ((i12 & 16) != 0) {
                    str5 = paramsToFill.autoRegNumByPhoto;
                }
                return paramsToFill.copy(str, str6, str7, str8, str5);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getVinByRegNumUserBackstepId() {
                return this.vinByRegNumUserBackstepId;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getAutoFillItemId() {
                return this.autoFillItemId;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final String getVinId() {
                return this.vinId;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final String getVehicleNumberId() {
                return this.vehicleNumberId;
            }

            @l
            /* renamed from: component5, reason: from getter */
            public final String getAutoRegNumByPhoto() {
                return this.autoRegNumByPhoto;
            }

            @k
            public final ParamsToFill copy(@l String vinByRegNumUserBackstepId, @l String autoFillItemId, @l String vinId, @l String vehicleNumberId, @l String autoRegNumByPhoto) {
                return new ParamsToFill(vinByRegNumUserBackstepId, autoFillItemId, vinId, vehicleNumberId, autoRegNumByPhoto);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ParamsToFill)) {
                    return false;
                }
                ParamsToFill paramsToFill = (ParamsToFill) other;
                return L.f(this.vinByRegNumUserBackstepId, paramsToFill.vinByRegNumUserBackstepId) && L.f(this.autoFillItemId, paramsToFill.autoFillItemId) && L.f(this.vinId, paramsToFill.vinId) && L.f(this.vehicleNumberId, paramsToFill.vehicleNumberId) && L.f(this.autoRegNumByPhoto, paramsToFill.autoRegNumByPhoto);
            }

            @l
            public final String getAutoFillItemId() {
                return this.autoFillItemId;
            }

            @l
            public final String getAutoRegNumByPhoto() {
                return this.autoRegNumByPhoto;
            }

            @l
            public final String getVehicleNumberId() {
                return this.vehicleNumberId;
            }

            @l
            public final String getVinByRegNumUserBackstepId() {
                return this.vinByRegNumUserBackstepId;
            }

            @l
            public final String getVinId() {
                return this.vinId;
            }

            public int hashCode() {
                String str = this.vinByRegNumUserBackstepId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.autoFillItemId;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.vinId;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.vehicleNumberId;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.autoRegNumByPhoto;
                return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ParamsToFill(vinByRegNumUserBackstepId=");
                sb2.append(this.vinByRegNumUserBackstepId);
                sb2.append(", autoFillItemId=");
                sb2.append(this.autoFillItemId);
                sb2.append(", vinId=");
                sb2.append(this.vinId);
                sb2.append(", vehicleNumberId=");
                sb2.append(this.vehicleNumberId);
                sb2.append(", autoRegNumByPhoto=");
                return C22026a.c(sb2, this.autoRegNumByPhoto, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.vinByRegNumUserBackstepId);
                parcel.writeString(this.autoFillItemId);
                parcel.writeString(this.vinId);
                parcel.writeString(this.vehicleNumberId);
                parcel.writeString(this.autoRegNumByPhoto);
            }
        }

        /* compiled from: CategoryPublishStep.kt */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002$%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition;", "condition", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Action;", "action", "<init>", "(Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Action;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition;", "component2", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Action;", "copy", "(Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Action;)Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition;", "getCondition", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Action;", "getAction", "Action", "Condition", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Predicate implements Parcelable {

            @k
            public static final Parcelable.Creator<Predicate> CREATOR = new Creator();

            @c("then")
            @k
            private final Action action;

            @c("if")
            @k
            private final Condition condition;

            /* compiled from: CategoryPublishStep.kt */
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Action;", "Landroid/os/Parcelable;", "", "continueTitle", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Action$ContinueStyle;", "continueStyle", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Action$ContinueStyle;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Action$ContinueStyle;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Action$ContinueStyle;)Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Action;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getContinueTitle", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Action$ContinueStyle;", "getContinueStyle", "ContinueStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final /* data */ class Action implements Parcelable {

                @k
                public static final Parcelable.Creator<Action> CREATOR = new Creator();

                @c("continueStyle")
                @k
                private final ContinueStyle continueStyle;

                @c("continueTitle")
                @k
                private final String continueTitle;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: CategoryPublishStep.kt */
                @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Action$ContinueStyle;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "SECONDARY", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @K51.d
                public static final class ContinueStyle implements Parcelable {
                    private static final /* synthetic */ a $ENTRIES;
                    private static final /* synthetic */ ContinueStyle[] $VALUES;

                    @k
                    public static final Parcelable.Creator<ContinueStyle> CREATOR;

                    @c("secondary")
                    public static final ContinueStyle SECONDARY = new ContinueStyle("SECONDARY", 0);

                    /* compiled from: CategoryPublishStep.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<ContinueStyle> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final ContinueStyle createFromParcel(@k Parcel parcel) {
                            return ContinueStyle.valueOf(parcel.readString());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final ContinueStyle[] newArray(int i12) {
                            return new ContinueStyle[i12];
                        }
                    }

                    private static final /* synthetic */ ContinueStyle[] $values() {
                        return new ContinueStyle[]{SECONDARY};
                    }

                    static {
                        ContinueStyle[] continueStyleArr$values = $values();
                        $VALUES = continueStyleArr$values;
                        $ENTRIES = kotlin.enums.c.a(continueStyleArr$values);
                        CREATOR = new Creator();
                    }

                    private ContinueStyle(String str, int i12) {
                    }

                    @k
                    public static a<ContinueStyle> getEntries() {
                        return $ENTRIES;
                    }

                    public static ContinueStyle valueOf(String str) {
                        return (ContinueStyle) Enum.valueOf(ContinueStyle.class, str);
                    }

                    public static ContinueStyle[] values() {
                        return (ContinueStyle[]) $VALUES.clone();
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        parcel.writeString(name());
                    }
                }

                /* compiled from: CategoryPublishStep.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Action> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Action createFromParcel(@k Parcel parcel) {
                        return new Action(parcel.readString(), ContinueStyle.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Action[] newArray(int i12) {
                        return new Action[i12];
                    }
                }

                public Action(@k String str, @k ContinueStyle continueStyle) {
                    this.continueTitle = str;
                    this.continueStyle = continueStyle;
                }

                public static /* synthetic */ Action copy$default(Action action, String str, ContinueStyle continueStyle, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = action.continueTitle;
                    }
                    if ((i12 & 2) != 0) {
                        continueStyle = action.continueStyle;
                    }
                    return action.copy(str, continueStyle);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getContinueTitle() {
                    return this.continueTitle;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final ContinueStyle getContinueStyle() {
                    return this.continueStyle;
                }

                @k
                public final Action copy(@k String continueTitle, @k ContinueStyle continueStyle) {
                    return new Action(continueTitle, continueStyle);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Action)) {
                        return false;
                    }
                    Action action = (Action) other;
                    return L.f(this.continueTitle, action.continueTitle) && this.continueStyle == action.continueStyle;
                }

                @k
                public final ContinueStyle getContinueStyle() {
                    return this.continueStyle;
                }

                @k
                public final String getContinueTitle() {
                    return this.continueTitle;
                }

                public int hashCode() {
                    return this.continueStyle.hashCode() + (this.continueTitle.hashCode() * 31);
                }

                @k
                public String toString() {
                    return "Action(continueTitle=" + this.continueTitle + ", continueStyle=" + this.continueStyle + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.continueTitle);
                    this.continueStyle.writeToParcel(parcel, flags);
                }
            }

            /* compiled from: CategoryPublishStep.kt */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$Field;", "field", "<init>", "(Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$Field;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$Field;", "copy", "(Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$Field;)Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$Field;", "getField", "Field", "PredicateField", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final /* data */ class Condition implements Parcelable {

                @k
                public static final Parcelable.Creator<Condition> CREATOR = new Creator();

                @c("field")
                @k
                private final Field field;

                /* compiled from: CategoryPublishStep.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Condition> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Condition createFromParcel(@k Parcel parcel) {
                        return new Condition(Field.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Condition[] newArray(int i12) {
                        return new Condition[i12];
                    }
                }

                /* compiled from: CategoryPublishStep.kt */
                @K51.d
                @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$Field;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$PredicateField;", VideoUploadParameter.TYPE, "<init>", "(Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$PredicateField;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$PredicateField;", "copy", "(Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$PredicateField;)Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$Field;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$PredicateField;", "getVideoUploader", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Field implements Parcelable {

                    @k
                    public static final Parcelable.Creator<Field> CREATOR = new Creator();

                    @c("124938")
                    @l
                    private final PredicateField videoUploader;

                    /* compiled from: CategoryPublishStep.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Field> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Field createFromParcel(@k Parcel parcel) {
                            return new Field(parcel.readInt() == 0 ? null : PredicateField.CREATOR.createFromParcel(parcel));
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Field[] newArray(int i12) {
                            return new Field[i12];
                        }
                    }

                    public Field(@l PredicateField predicateField) {
                        this.videoUploader = predicateField;
                    }

                    public static /* synthetic */ Field copy$default(Field field, PredicateField predicateField, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            predicateField = field.videoUploader;
                        }
                        return field.copy(predicateField);
                    }

                    @l
                    /* renamed from: component1, reason: from getter */
                    public final PredicateField getVideoUploader() {
                        return this.videoUploader;
                    }

                    @k
                    public final Field copy(@l PredicateField videoUploader) {
                        return new Field(videoUploader);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Field) && L.f(this.videoUploader, ((Field) other).videoUploader);
                    }

                    @l
                    public final PredicateField getVideoUploader() {
                        return this.videoUploader;
                    }

                    public int hashCode() {
                        PredicateField predicateField = this.videoUploader;
                        if (predicateField == null) {
                            return 0;
                        }
                        return predicateField.hashCode();
                    }

                    @k
                    public String toString() {
                        return "Field(videoUploader=" + this.videoUploader + ')';
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        PredicateField predicateField = this.videoUploader;
                        if (predicateField == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            predicateField.writeToParcel(parcel, flags);
                        }
                    }
                }

                /* compiled from: CategoryPublishStep.kt */
                @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$PredicateField;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$PredicateField$PredicateValue;", "value", "<init>", "(Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$PredicateField$PredicateValue;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$PredicateField$PredicateValue;", "copy", "(Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$PredicateField$PredicateValue;)Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$PredicateField;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$PredicateField$PredicateValue;", "getValue", "PredicateValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @K51.d
                public static final /* data */ class PredicateField implements Parcelable {

                    @k
                    public static final Parcelable.Creator<PredicateField> CREATOR = new Creator();

                    @c("value")
                    @k
                    private final PredicateValue value;

                    /* compiled from: CategoryPublishStep.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<PredicateField> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final PredicateField createFromParcel(@k Parcel parcel) {
                            return new PredicateField(PredicateValue.CREATOR.createFromParcel(parcel));
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final PredicateField[] newArray(int i12) {
                            return new PredicateField[i12];
                        }
                    }

                    /* compiled from: CategoryPublishStep.kt */
                    @K51.d
                    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0003\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$PredicateField$PredicateValue;", "Landroid/os/Parcelable;", "", "isEmpty", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate$Condition$PredicateField$PredicateValue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final /* data */ class PredicateValue implements Parcelable {

                        @k
                        public static final Parcelable.Creator<PredicateValue> CREATOR = new Creator();

                        @c("empty")
                        private final boolean isEmpty;

                        /* compiled from: CategoryPublishStep.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        public static final class Creator implements Parcelable.Creator<PredicateValue> {
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // android.os.Parcelable.Creator
                            @k
                            public final PredicateValue createFromParcel(@k Parcel parcel) {
                                return new PredicateValue(parcel.readInt() != 0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // android.os.Parcelable.Creator
                            @k
                            public final PredicateValue[] newArray(int i12) {
                                return new PredicateValue[i12];
                            }
                        }

                        public PredicateValue(boolean z12) {
                            this.isEmpty = z12;
                        }

                        public static /* synthetic */ PredicateValue copy$default(PredicateValue predicateValue, boolean z12, int i12, Object obj) {
                            if ((i12 & 1) != 0) {
                                z12 = predicateValue.isEmpty;
                            }
                            return predicateValue.copy(z12);
                        }

                        /* renamed from: component1, reason: from getter */
                        public final boolean getIsEmpty() {
                            return this.isEmpty;
                        }

                        @k
                        public final PredicateValue copy(boolean isEmpty) {
                            return new PredicateValue(isEmpty);
                        }

                        @Override // android.os.Parcelable
                        public int describeContents() {
                            return 0;
                        }

                        public boolean equals(@l Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof PredicateValue) && this.isEmpty == ((PredicateValue) other).isEmpty;
                        }

                        public int hashCode() {
                            return Boolean.hashCode(this.isEmpty);
                        }

                        public final boolean isEmpty() {
                            return this.isEmpty;
                        }

                        @k
                        public String toString() {
                            return r.x(new StringBuilder("PredicateValue(isEmpty="), this.isEmpty, ')');
                        }

                        @Override // android.os.Parcelable
                        public void writeToParcel(@k Parcel parcel, int flags) {
                            parcel.writeInt(this.isEmpty ? 1 : 0);
                        }
                    }

                    public PredicateField(@k PredicateValue predicateValue) {
                        this.value = predicateValue;
                    }

                    public static /* synthetic */ PredicateField copy$default(PredicateField predicateField, PredicateValue predicateValue, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            predicateValue = predicateField.value;
                        }
                        return predicateField.copy(predicateValue);
                    }

                    @k
                    /* renamed from: component1, reason: from getter */
                    public final PredicateValue getValue() {
                        return this.value;
                    }

                    @k
                    public final PredicateField copy(@k PredicateValue value) {
                        return new PredicateField(value);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof PredicateField) && L.f(this.value, ((PredicateField) other).value);
                    }

                    @k
                    public final PredicateValue getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    @k
                    public String toString() {
                        return "PredicateField(value=" + this.value + ')';
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        this.value.writeToParcel(parcel, flags);
                    }
                }

                public Condition(@k Field field) {
                    this.field = field;
                }

                public static /* synthetic */ Condition copy$default(Condition condition, Field field, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        field = condition.field;
                    }
                    return condition.copy(field);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final Field getField() {
                    return this.field;
                }

                @k
                public final Condition copy(@k Field field) {
                    return new Condition(field);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Condition) && L.f(this.field, ((Condition) other).field);
                }

                @k
                public final Field getField() {
                    return this.field;
                }

                public int hashCode() {
                    return this.field.hashCode();
                }

                @k
                public String toString() {
                    return "Condition(field=" + this.field + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    this.field.writeToParcel(parcel, flags);
                }
            }

            /* compiled from: CategoryPublishStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Predicate> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Predicate createFromParcel(@k Parcel parcel) {
                    return new Predicate(Condition.CREATOR.createFromParcel(parcel), Action.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Predicate[] newArray(int i12) {
                    return new Predicate[i12];
                }
            }

            public Predicate(@k Condition condition, @k Action action) {
                this.condition = condition;
                this.action = action;
            }

            public static /* synthetic */ Predicate copy$default(Predicate predicate, Condition condition, Action action, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    condition = predicate.condition;
                }
                if ((i12 & 2) != 0) {
                    action = predicate.action;
                }
                return predicate.copy(condition, action);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final Condition getCondition() {
                return this.condition;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final Action getAction() {
                return this.action;
            }

            @k
            public final Predicate copy(@k Condition condition, @k Action action) {
                return new Predicate(condition, action);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Predicate)) {
                    return false;
                }
                Predicate predicate = (Predicate) other;
                return L.f(this.condition, predicate.condition) && L.f(this.action, predicate.action);
            }

            @k
            public final Action getAction() {
                return this.action;
            }

            @k
            public final Condition getCondition() {
                return this.condition;
            }

            public int hashCode() {
                return this.action.hashCode() + (this.condition.hashCode() * 31);
            }

            @k
            public String toString() {
                return "Predicate(condition=" + this.condition + ", action=" + this.action + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                this.condition.writeToParcel(parcel, flags);
                this.action.writeToParcel(parcel, flags);
            }
        }

        /* compiled from: CategoryPublishStep.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0011\u0010\"\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b!\u0010\t¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ScanButtonData;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ScanButtonData$Position;", "_position", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ScanButtonData$Position;)V", "component2", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ScanButtonData$Position;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ScanButtonData$Position;)Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ScanButtonData;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ScanButtonData$Position;", "getPosition", "position", "Position", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class ScanButtonData implements Parcelable {

            @k
            public static final Parcelable.Creator<ScanButtonData> CREATOR = new Creator();

            @c("position")
            @l
            private final Position _position;

            @c("title")
            @k
            private final String title;

            /* compiled from: CategoryPublishStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ScanButtonData> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ScanButtonData createFromParcel(@k Parcel parcel) {
                    return new ScanButtonData(parcel.readString(), parcel.readInt() == 0 ? null : Position.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ScanButtonData[] newArray(int i12) {
                    return new ScanButtonData[i12];
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: CategoryPublishStep.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ScanButtonData$Position;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Position {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ Position[] $VALUES;

                @c("top")
                public static final Position TOP = new Position("TOP", 0);

                @c("bottom")
                public static final Position BOTTOM = new Position("BOTTOM", 1);

                private static final /* synthetic */ Position[] $values() {
                    return new Position[]{TOP, BOTTOM};
                }

                static {
                    Position[] positionArr$values = $values();
                    $VALUES = positionArr$values;
                    $ENTRIES = kotlin.enums.c.a(positionArr$values);
                }

                private Position(String str, int i12) {
                }

                @k
                public static a<Position> getEntries() {
                    return $ENTRIES;
                }

                public static Position valueOf(String str) {
                    return (Position) Enum.valueOf(Position.class, str);
                }

                public static Position[] values() {
                    return (Position[]) $VALUES.clone();
                }
            }

            public ScanButtonData(@k String str, @l Position position) {
                this.title = str;
                this._position = position;
            }

            /* renamed from: component2, reason: from getter */
            private final Position get_position() {
                return this._position;
            }

            public static /* synthetic */ ScanButtonData copy$default(ScanButtonData scanButtonData, String str, Position position, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = scanButtonData.title;
                }
                if ((i12 & 2) != 0) {
                    position = scanButtonData._position;
                }
                return scanButtonData.copy(str, position);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @k
            public final ScanButtonData copy(@k String title, @l Position _position) {
                return new ScanButtonData(title, _position);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ScanButtonData)) {
                    return false;
                }
                ScanButtonData scanButtonData = (ScanButtonData) other;
                return L.f(this.title, scanButtonData.title) && this._position == scanButtonData._position;
            }

            @k
            public final Position getPosition() {
                Position position = this._position;
                return position == null ? Position.BOTTOM : position;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                Position position = this._position;
                return iHashCode + (position == null ? 0 : position.hashCode());
            }

            @k
            public String toString() {
                return "ScanButtonData(title=" + this.title + ", _position=" + this._position + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                Position position = this._position;
                if (position == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(position.name());
                }
            }
        }

        public /* synthetic */ Params(String str, String str2, String str3, List list, String str4, String str5, String str6, boolean z12, Config config, int i12, C42822w c42822w) {
            this(str, str2, str3, list, str4, (i12 & 32) != 0 ? null : str5, str6, z12, config);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Config getConfig() {
            return this.config;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public List<String> getFields() {
            return this.fields;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getHash() {
            return this.hash;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getShortTitle() {
            return this.shortTitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        public boolean getSkipOnBackwards() {
            return this.skipOnBackwards;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtype() {
            return this.subtype;
        }

        @Override // com.avito.android.remote.model.category_parameters.ThemedStep
        @l
        public Theme getTheme() {
            Config config = this.config;
            if (config != null) {
                return config.getTheme();
            }
            return null;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getType() {
            return "params";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.hash);
            parcel.writeString(this.subtype);
            parcel.writeStringList(this.fields);
            parcel.writeString(this.title);
            parcel.writeString(this.shortTitle);
            parcel.writeString(this.subtitle);
            parcel.writeInt(this.skipOnBackwards ? 1 : 0);
            Config config = this.config;
            if (config == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                config.writeToParcel(parcel, flags);
            }
        }

        public Params(@k String str, @l String str2, @l String str3, @k List<String> list, @k String str4, @l String str5, @l String str6, boolean z12, @l Config config) {
            super(null);
            this.id = str;
            this.hash = str2;
            this.subtype = str3;
            this.fields = list;
            this.title = str4;
            this.shortTitle = str5;
            this.subtitle = str6;
            this.skipOnBackwards = z12;
            this.config = config;
        }

        /* compiled from: CategoryPublishStep.kt */
        @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\b\u0007\u0018\u00002\u00020\u0001Bã\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\n\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b%\u0010&J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b\u0007\u00104R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b\b\u00104R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b5\u00102R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b?\u0010>R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\bF\u00102R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010G\u001a\u0004\bH\u0010IR\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00106\u001a\u0004\bJ\u00108R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00106\u001a\u0004\bK\u00108R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00103\u001a\u0004\bL\u00104R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010M\u001a\u0004\bN\u0010OR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010!\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00103\u001a\u0004\b!\u00104R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00100\u001a\u0004\bS\u00102¨\u0006T"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Config;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$HeaderStyle;", "headerStyle", "", "continueTitle", "", "isContinueButtonHidden", "isCloseButtonHidden", "backButtonStyle", "", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButton;", "navigationButtons", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonsOrientation;", "navigationButtonsOrientation", "", "headerTopOffsetDp", "headerBottomOffsetDp", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ScanButtonData;", "scanButtonData", "Lcom/avito/android/remote/model/search/Theme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "badgeText", "Lcom/avito/android/remote/model/text/AttributedText;", ServiceTransportationWidget.DisclaimerField.TYPE, "conditionButtons", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$Predicate;", "continueButtonChanges", "showRequiredFieldSign", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$FormStyle;", "formStyle", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$DisclaimerPosition;", "disclaimerPosition", "isContinueButtonVisibleAboveKeyboard", "badgeOnceShowId", "<init>", "(Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$HeaderStyle;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonsOrientation;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ScanButtonData;Lcom/avito/android/remote/model/search/Theme;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$FormStyle;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$DisclaimerPosition;Ljava/lang/Boolean;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$HeaderStyle;", "getHeaderStyle", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$HeaderStyle;", "Ljava/lang/String;", "getContinueTitle", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getBackButtonStyle", "Ljava/util/List;", "getNavigationButtons", "()Ljava/util/List;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonsOrientation;", "getNavigationButtonsOrientation", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonsOrientation;", "Ljava/lang/Integer;", "getHeaderTopOffsetDp", "()Ljava/lang/Integer;", "getHeaderBottomOffsetDp", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ScanButtonData;", "getScanButtonData", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$ScanButtonData;", "Lcom/avito/android/remote/model/search/Theme;", "getTheme", "()Lcom/avito/android/remote/model/search/Theme;", "getBadgeText", "Lcom/avito/android/remote/model/text/AttributedText;", "getDisclaimer", "()Lcom/avito/android/remote/model/text/AttributedText;", "getConditionButtons", "getContinueButtonChanges", "getShowRequiredFieldSign", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$FormStyle;", "getFormStyle", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$FormStyle;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$DisclaimerPosition;", "getDisclaimerPosition", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$DisclaimerPosition;", "getBadgeOnceShowId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        @d
        public static final class Config implements Parcelable {

            @k
            public static final Parcelable.Creator<Config> CREATOR = new Creator();

            @c("backButtonStyle")
            @l
            private final String backButtonStyle;

            @c("badgeOnceShowId")
            @l
            private final String badgeOnceShowId;

            @c("badgeText")
            @l
            private final String badgeText;

            @c("conditionButtons")
            @l
            private final List<NavigationButton> conditionButtons;

            @c("continueButtonChanges")
            @l
            private final List<Predicate> continueButtonChanges;

            @c("continueTitle")
            @l
            private final String continueTitle;

            @c(ServiceTransportationWidget.DisclaimerField.TYPE)
            @l
            private final AttributedText disclaimer;

            @c("disclaimerPosition")
            @l
            private final DisclaimerPosition disclaimerPosition;

            @c("formStyle")
            @l
            private final FormStyle formStyle;

            @c("headerBottomOffset")
            @l
            private final Integer headerBottomOffsetDp;

            @c("headerStyle")
            @l
            private final HeaderStyle headerStyle;

            @c("headerTopOffset")
            @l
            private final Integer headerTopOffsetDp;

            @c("isCloseButtonHidden")
            @l
            private final Boolean isCloseButtonHidden;

            @c("isContinueButtonHidden")
            @l
            private final Boolean isContinueButtonHidden;

            @c("isContinueButtonVisibleAboveKeyboard")
            @l
            private final Boolean isContinueButtonVisibleAboveKeyboard;

            @c("navigationButtons")
            @l
            private final List<NavigationButton> navigationButtons;

            @c("navigationButtonsOrientation")
            @l
            private final NavigationButtonsOrientation navigationButtonsOrientation;

            @c("scanButtonData")
            @l
            private final ScanButtonData scanButtonData;

            @c("showRequiredFieldSign")
            @l
            private final Boolean showRequiredFieldSign;

            @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
            @l
            private final Theme theme;

            /* compiled from: CategoryPublishStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config createFromParcel(@k Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    ArrayList arrayList;
                    String str;
                    ArrayList arrayList2;
                    ArrayList arrayList3;
                    ArrayList arrayList4;
                    Boolean boolValueOf3;
                    Boolean boolValueOf4;
                    HeaderStyle headerStyleCreateFromParcel = parcel.readInt() == 0 ? null : HeaderStyle.CREATOR.createFromParcel(parcel);
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    String string2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        ArrayList arrayList5 = new ArrayList(i12);
                        int iC2 = 0;
                        while (iC2 != i12) {
                            iC2 = com.avito.android.actions_sheet.a.c(NavigationButton.CREATOR, parcel, arrayList5, iC2, 1);
                        }
                        arrayList = arrayList5;
                    }
                    NavigationButtonsOrientation navigationButtonsOrientationCreateFromParcel = parcel.readInt() == 0 ? null : NavigationButtonsOrientation.CREATOR.createFromParcel(parcel);
                    Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    ScanButtonData scanButtonDataCreateFromParcel = parcel.readInt() == 0 ? null : ScanButtonData.CREATOR.createFromParcel(parcel);
                    Theme themeValueOf = parcel.readInt() == 0 ? null : Theme.valueOf(parcel.readString());
                    String string3 = parcel.readString();
                    AttributedText attributedText = (AttributedText) parcel.readParcelable(Config.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        str = string3;
                        arrayList2 = null;
                    } else {
                        int i13 = parcel.readInt();
                        ArrayList arrayList6 = new ArrayList(i13);
                        int iC3 = 0;
                        while (iC3 != i13) {
                            iC3 = com.avito.android.actions_sheet.a.c(NavigationButton.CREATOR, parcel, arrayList6, iC3, 1);
                            i13 = i13;
                            string3 = string3;
                        }
                        str = string3;
                        arrayList2 = arrayList6;
                    }
                    if (parcel.readInt() == 0) {
                        arrayList3 = arrayList2;
                        arrayList4 = null;
                    } else {
                        int i14 = parcel.readInt();
                        ArrayList arrayList7 = new ArrayList(i14);
                        int iC4 = 0;
                        while (iC4 != i14) {
                            iC4 = com.avito.android.actions_sheet.a.c(Predicate.CREATOR, parcel, arrayList7, iC4, 1);
                            i14 = i14;
                            arrayList2 = arrayList2;
                        }
                        arrayList3 = arrayList2;
                        arrayList4 = arrayList7;
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf3 = null;
                    } else {
                        boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    FormStyle formStyleCreateFromParcel = parcel.readInt() == 0 ? null : FormStyle.CREATOR.createFromParcel(parcel);
                    DisclaimerPosition disclaimerPositionCreateFromParcel = parcel.readInt() == 0 ? null : DisclaimerPosition.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        boolValueOf4 = null;
                    } else {
                        boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Config(headerStyleCreateFromParcel, string, boolValueOf, boolValueOf2, string2, arrayList, navigationButtonsOrientationCreateFromParcel, numValueOf, numValueOf2, scanButtonDataCreateFromParcel, themeValueOf, str, attributedText, arrayList3, arrayList4, boolValueOf3, formStyleCreateFromParcel, disclaimerPositionCreateFromParcel, boolValueOf4, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config[] newArray(int i12) {
                    return new Config[i12];
                }
            }

            public Config(@l HeaderStyle headerStyle, @l String str, @l Boolean bool, @l Boolean bool2, @l String str2, @l List<NavigationButton> list, @l NavigationButtonsOrientation navigationButtonsOrientation, @l Integer num, @l Integer num2, @l ScanButtonData scanButtonData, @l Theme theme, @l String str3, @l AttributedText attributedText, @l List<NavigationButton> list2, @l List<Predicate> list3, @l Boolean bool3, @l FormStyle formStyle, @l DisclaimerPosition disclaimerPosition, @l Boolean bool4, @l String str4) {
                this.headerStyle = headerStyle;
                this.continueTitle = str;
                this.isContinueButtonHidden = bool;
                this.isCloseButtonHidden = bool2;
                this.backButtonStyle = str2;
                this.navigationButtons = list;
                this.navigationButtonsOrientation = navigationButtonsOrientation;
                this.headerTopOffsetDp = num;
                this.headerBottomOffsetDp = num2;
                this.scanButtonData = scanButtonData;
                this.theme = theme;
                this.badgeText = str3;
                this.disclaimer = attributedText;
                this.conditionButtons = list2;
                this.continueButtonChanges = list3;
                this.showRequiredFieldSign = bool3;
                this.formStyle = formStyle;
                this.disclaimerPosition = disclaimerPosition;
                this.isContinueButtonVisibleAboveKeyboard = bool4;
                this.badgeOnceShowId = str4;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final String getBackButtonStyle() {
                return this.backButtonStyle;
            }

            @l
            public final String getBadgeOnceShowId() {
                return this.badgeOnceShowId;
            }

            @l
            public final String getBadgeText() {
                return this.badgeText;
            }

            @l
            public final List<NavigationButton> getConditionButtons() {
                return this.conditionButtons;
            }

            @l
            public final List<Predicate> getContinueButtonChanges() {
                return this.continueButtonChanges;
            }

            @l
            public final String getContinueTitle() {
                return this.continueTitle;
            }

            @l
            public final AttributedText getDisclaimer() {
                return this.disclaimer;
            }

            @l
            public final DisclaimerPosition getDisclaimerPosition() {
                return this.disclaimerPosition;
            }

            @l
            public final FormStyle getFormStyle() {
                return this.formStyle;
            }

            @l
            public final Integer getHeaderBottomOffsetDp() {
                return this.headerBottomOffsetDp;
            }

            @l
            public final HeaderStyle getHeaderStyle() {
                return this.headerStyle;
            }

            @l
            public final Integer getHeaderTopOffsetDp() {
                return this.headerTopOffsetDp;
            }

            @l
            public final List<NavigationButton> getNavigationButtons() {
                return this.navigationButtons;
            }

            @l
            public final NavigationButtonsOrientation getNavigationButtonsOrientation() {
                return this.navigationButtonsOrientation;
            }

            @l
            public final ScanButtonData getScanButtonData() {
                return this.scanButtonData;
            }

            @l
            public final Boolean getShowRequiredFieldSign() {
                return this.showRequiredFieldSign;
            }

            @l
            public final Theme getTheme() {
                return this.theme;
            }

            @l
            /* renamed from: isCloseButtonHidden, reason: from getter */
            public final Boolean getIsCloseButtonHidden() {
                return this.isCloseButtonHidden;
            }

            @l
            /* renamed from: isContinueButtonHidden, reason: from getter */
            public final Boolean getIsContinueButtonHidden() {
                return this.isContinueButtonHidden;
            }

            @l
            /* renamed from: isContinueButtonVisibleAboveKeyboard, reason: from getter */
            public final Boolean getIsContinueButtonVisibleAboveKeyboard() {
                return this.isContinueButtonVisibleAboveKeyboard;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                HeaderStyle headerStyle = this.headerStyle;
                if (headerStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    headerStyle.writeToParcel(parcel, flags);
                }
                parcel.writeString(this.continueTitle);
                Boolean bool = this.isContinueButtonHidden;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
                Boolean bool2 = this.isCloseButtonHidden;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool2);
                }
                parcel.writeString(this.backButtonStyle);
                List<NavigationButton> list = this.navigationButtons;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        ((NavigationButton) itA.next()).writeToParcel(parcel, flags);
                    }
                }
                NavigationButtonsOrientation navigationButtonsOrientation = this.navigationButtonsOrientation;
                if (navigationButtonsOrientation == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    navigationButtonsOrientation.writeToParcel(parcel, flags);
                }
                Integer num = this.headerTopOffsetDp;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
                Integer num2 = this.headerBottomOffsetDp;
                if (num2 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num2);
                }
                ScanButtonData scanButtonData = this.scanButtonData;
                if (scanButtonData == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    scanButtonData.writeToParcel(parcel, flags);
                }
                Theme theme = this.theme;
                if (theme == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(theme.name());
                }
                parcel.writeString(this.badgeText);
                parcel.writeParcelable(this.disclaimer, flags);
                List<NavigationButton> list2 = this.conditionButtons;
                if (list2 == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
                    while (itA2.hasNext()) {
                        ((NavigationButton) itA2.next()).writeToParcel(parcel, flags);
                    }
                }
                List<Predicate> list3 = this.continueButtonChanges;
                if (list3 == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
                    while (itA3.hasNext()) {
                        ((Predicate) itA3.next()).writeToParcel(parcel, flags);
                    }
                }
                Boolean bool3 = this.showRequiredFieldSign;
                if (bool3 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool3);
                }
                FormStyle formStyle = this.formStyle;
                if (formStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    formStyle.writeToParcel(parcel, flags);
                }
                DisclaimerPosition disclaimerPosition = this.disclaimerPosition;
                if (disclaimerPosition == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    disclaimerPosition.writeToParcel(parcel, flags);
                }
                Boolean bool4 = this.isContinueButtonVisibleAboveKeyboard;
                if (bool4 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool4);
                }
                parcel.writeString(this.badgeOnceShowId);
            }

            public /* synthetic */ Config(HeaderStyle headerStyle, String str, Boolean bool, Boolean bool2, String str2, List list, NavigationButtonsOrientation navigationButtonsOrientation, Integer num, Integer num2, ScanButtonData scanButtonData, Theme theme, String str3, AttributedText attributedText, List list2, List list3, Boolean bool3, FormStyle formStyle, DisclaimerPosition disclaimerPosition, Boolean bool4, String str4, int i12, C42822w c42822w) {
                this(headerStyle, str, bool, bool2, str2, list, navigationButtonsOrientation, num, num2, scanButtonData, theme, str3, attributedText, list2, list3, bool3, formStyle, disclaimerPosition, bool4, (i12 & 524288) != 0 ? null : str4);
            }
        }
    }

    /* compiled from: CategoryPublishStep.kt */
    @K51.d
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001a¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Premoderation;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep;", "", "id", "hash", "subtype", "", LocalPublishState.FIELDS, "title", "shortTitle", "subtitle", "", "skipOnBackwards", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getHash", "getSubtype", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "getTitle", "getShortTitle", "getSubtitle", "Z", "getSkipOnBackwards", "()Z", "getType", "type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Premoderation extends CategoryPublishStep {

        @k
        public static final Parcelable.Creator<Premoderation> CREATOR = new Creator();

        @c(LocalPublishState.FIELDS)
        @k
        private final List<String> fields;

        @c("hash")
        @l
        private final String hash;

        @c("id")
        @k
        private final String id;

        @c("shortTitle")
        @l
        private final String shortTitle;

        @c("skipOnBackwards")
        private final boolean skipOnBackwards;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("subtype")
        @l
        private final String subtype;

        @c("title")
        @k
        private final String title;

        /* compiled from: CategoryPublishStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Premoderation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Premoderation createFromParcel(@k Parcel parcel) {
                return new Premoderation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Premoderation[] newArray(int i12) {
                return new Premoderation[i12];
            }
        }

        public /* synthetic */ Premoderation(String str, String str2, String str3, List list, String str4, String str5, String str6, boolean z12, int i12, C42822w c42822w) {
            this(str, str2, str3, list, str4, (i12 & 32) != 0 ? null : str5, str6, z12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public List<String> getFields() {
            return this.fields;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getHash() {
            return this.hash;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getShortTitle() {
            return this.shortTitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        public boolean getSkipOnBackwards() {
            return this.skipOnBackwards;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtype() {
            return this.subtype;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getType() {
            return "premoderation";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.hash);
            parcel.writeString(this.subtype);
            parcel.writeStringList(this.fields);
            parcel.writeString(this.title);
            parcel.writeString(this.shortTitle);
            parcel.writeString(this.subtitle);
            parcel.writeInt(this.skipOnBackwards ? 1 : 0);
        }

        public Premoderation(@k String str, @l String str2, @l String str3, @k List<String> list, @k String str4, @l String str5, @l String str6, boolean z12) {
            super(null);
            this.id = str;
            this.hash = str2;
            this.subtype = str3;
            this.fields = list;
            this.title = str4;
            this.shortTitle = str5;
            this.subtitle = str6;
            this.skipOnBackwards = z12;
        }
    }

    /* compiled from: CategoryPublishStep.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001:\u0001-B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001c¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$PriceList;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep;", "", "id", "hash", "subtype", "", LocalPublishState.FIELDS, "title", "shortTitle", "subtitle", "", "skipOnBackwards", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$PriceList$PriceListConfig;", Navigation.CONFIG, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/category_parameters/CategoryPublishStep$PriceList$PriceListConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getHash", "getSubtype", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "getTitle", "getShortTitle", "getSubtitle", "Z", "getSkipOnBackwards", "()Z", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$PriceList$PriceListConfig;", "getConfig", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$PriceList$PriceListConfig;", "getType", "type", "PriceListConfig", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class PriceList extends CategoryPublishStep {

        @k
        public static final Parcelable.Creator<PriceList> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @k
        private final PriceListConfig config;

        @c(LocalPublishState.FIELDS)
        @k
        private final List<String> fields;

        @c("hash")
        @l
        private final String hash;

        @c("id")
        @k
        private final String id;

        @c("shortTitle")
        @l
        private final String shortTitle;

        @c("skipOnBackwards")
        private final boolean skipOnBackwards;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("subtype")
        @l
        private final String subtype;

        @c("title")
        @k
        private final String title;

        /* compiled from: CategoryPublishStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PriceList> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PriceList createFromParcel(@k Parcel parcel) {
                return new PriceList(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, PriceListConfig.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PriceList[] newArray(int i12) {
                return new PriceList[i12];
            }
        }

        public /* synthetic */ PriceList(String str, String str2, String str3, List list, String str4, String str5, String str6, boolean z12, PriceListConfig priceListConfig, int i12, C42822w c42822w) {
            this(str, str2, str3, list, str4, (i12 & 32) != 0 ? null : str5, str6, z12, priceListConfig);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final PriceListConfig getConfig() {
            return this.config;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public List<String> getFields() {
            return this.fields;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getHash() {
            return this.hash;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getShortTitle() {
            return this.shortTitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        public boolean getSkipOnBackwards() {
            return this.skipOnBackwards;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtype() {
            return this.subtype;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getType() {
            return "priceList";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.hash);
            parcel.writeString(this.subtype);
            parcel.writeStringList(this.fields);
            parcel.writeString(this.title);
            parcel.writeString(this.shortTitle);
            parcel.writeString(this.subtitle);
            parcel.writeInt(this.skipOnBackwards ? 1 : 0);
            this.config.writeToParcel(parcel, flags);
        }

        public PriceList(@k String str, @l String str2, @l String str3, @k List<String> list, @k String str4, @l String str5, @l String str6, boolean z12, @k PriceListConfig priceListConfig) {
            super(null);
            this.id = str;
            this.hash = str2;
            this.subtype = str3;
            this.fields = list;
            this.title = str4;
            this.shortTitle = str5;
            this.subtitle = str6;
            this.skipOnBackwards = z12;
            this.config = priceListConfig;
        }

        /* compiled from: CategoryPublishStep.kt */
        @K51.d
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$PriceList$PriceListConfig;", "Landroid/os/Parcelable;", "", "priceListId", "emptyMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPriceListId", "()Ljava/lang/String;", "getEmptyMessage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PriceListConfig implements Parcelable {

            @k
            public static final Parcelable.Creator<PriceListConfig> CREATOR = new Creator();

            @c("emptyMessage")
            @l
            private final String emptyMessage;

            @c("priceListId")
            @k
            private final String priceListId;

            /* compiled from: CategoryPublishStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PriceListConfig> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final PriceListConfig createFromParcel(@k Parcel parcel) {
                    return new PriceListConfig(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final PriceListConfig[] newArray(int i12) {
                    return new PriceListConfig[i12];
                }
            }

            public PriceListConfig(@k String str, @l String str2) {
                this.priceListId = str;
                this.emptyMessage = str2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final String getEmptyMessage() {
                return this.emptyMessage;
            }

            @k
            public final String getPriceListId() {
                return this.priceListId;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.priceListId);
                parcel.writeString(this.emptyMessage);
            }

            public /* synthetic */ PriceListConfig(String str, String str2, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? null : str2);
            }
        }
    }

    /* compiled from: CategoryPublishStep.kt */
    @K51.d
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001b¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Request;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep;", "", "id", "hash", "subtype", "", LocalPublishState.FIELDS, "title", "shortTitle", "subtitle", "", "skipOnBackwards", "shouldSkip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getHash", "getSubtype", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "getTitle", "getShortTitle", "getSubtitle", "Z", "getSkipOnBackwards", "()Z", "Ljava/lang/Boolean;", "getShouldSkip", "()Ljava/lang/Boolean;", "getType", "type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Request extends CategoryPublishStep {

        @k
        public static final Parcelable.Creator<Request> CREATOR = new Creator();

        @c(LocalPublishState.FIELDS)
        @k
        private final List<String> fields;

        @c("hash")
        @l
        private final String hash;

        @c("id")
        @k
        private final String id;

        @c("shortTitle")
        @l
        private final String shortTitle;

        @c("shouldSkip")
        @l
        private final Boolean shouldSkip;

        @c("skipOnBackwards")
        private final boolean skipOnBackwards;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("subtype")
        @l
        private final String subtype;

        @c("title")
        @k
        private final String title;

        /* compiled from: CategoryPublishStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Request> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Request createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean z12 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Request(string, string2, string3, arrayListCreateStringArrayList, string4, string5, string6, z12, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Request[] newArray(int i12) {
                return new Request[i12];
            }
        }

        public /* synthetic */ Request(String str, String str2, String str3, List list, String str4, String str5, String str6, boolean z12, Boolean bool, int i12, C42822w c42822w) {
            this(str, str2, str3, list, str4, (i12 & 32) != 0 ? null : str5, str6, z12, (i12 & 256) != 0 ? null : bool);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public List<String> getFields() {
            return this.fields;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getHash() {
            return this.hash;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getShortTitle() {
            return this.shortTitle;
        }

        @l
        public final Boolean getShouldSkip() {
            return this.shouldSkip;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        public boolean getSkipOnBackwards() {
            return this.skipOnBackwards;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtype() {
            return this.subtype;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getType() {
            return "request";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.hash);
            parcel.writeString(this.subtype);
            parcel.writeStringList(this.fields);
            parcel.writeString(this.title);
            parcel.writeString(this.shortTitle);
            parcel.writeString(this.subtitle);
            parcel.writeInt(this.skipOnBackwards ? 1 : 0);
            Boolean bool = this.shouldSkip;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }

        public Request(@k String str, @l String str2, @l String str3, @k List<String> list, @k String str4, @l String str5, @l String str6, boolean z12, @l Boolean bool) {
            super(null);
            this.id = str;
            this.hash = str2;
            this.subtype = str3;
            this.fields = list;
            this.title = str4;
            this.shortTitle = str5;
            this.subtitle = str6;
            this.skipOnBackwards = z12;
            this.shouldSkip = bool;
        }
    }

    /* compiled from: CategoryPublishStep.kt */
    @K51.d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001c¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Restriction;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep;", "", "id", "hash", "subtype", "", LocalPublishState.FIELDS, "title", "shortTitle", "subtitle", "", "skipOnBackwards", "Lcom/avito/android/remote/model/category_parameters/RestrictionConfig;", Navigation.CONFIG, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/category_parameters/RestrictionConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getHash", "getSubtype", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "getTitle", "getShortTitle", "getSubtitle", "Z", "getSkipOnBackwards", "()Z", "Lcom/avito/android/remote/model/category_parameters/RestrictionConfig;", "getConfig", "()Lcom/avito/android/remote/model/category_parameters/RestrictionConfig;", "getType", "type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Restriction extends CategoryPublishStep {

        @k
        public static final Parcelable.Creator<Restriction> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @k
        private final RestrictionConfig config;

        @c(LocalPublishState.FIELDS)
        @k
        private final List<String> fields;

        @c("hash")
        @l
        private final String hash;

        @c("id")
        @k
        private final String id;

        @c("shortTitle")
        @l
        private final String shortTitle;

        @c("skipOnBackwards")
        private final boolean skipOnBackwards;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("subtype")
        @l
        private final String subtype;

        @c("title")
        @k
        private final String title;

        /* compiled from: CategoryPublishStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Restriction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Restriction createFromParcel(@k Parcel parcel) {
                return new Restriction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, RestrictionConfig.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Restriction[] newArray(int i12) {
                return new Restriction[i12];
            }
        }

        public /* synthetic */ Restriction(String str, String str2, String str3, List list, String str4, String str5, String str6, boolean z12, RestrictionConfig restrictionConfig, int i12, C42822w c42822w) {
            this(str, str2, str3, list, str4, (i12 & 32) != 0 ? null : str5, str6, z12, restrictionConfig);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final RestrictionConfig getConfig() {
            return this.config;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public List<String> getFields() {
            return this.fields;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getHash() {
            return this.hash;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getShortTitle() {
            return this.shortTitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        public boolean getSkipOnBackwards() {
            return this.skipOnBackwards;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtype() {
            return this.subtype;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getType() {
            return "restriction";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.hash);
            parcel.writeString(this.subtype);
            parcel.writeStringList(this.fields);
            parcel.writeString(this.title);
            parcel.writeString(this.shortTitle);
            parcel.writeString(this.subtitle);
            parcel.writeInt(this.skipOnBackwards ? 1 : 0);
            this.config.writeToParcel(parcel, flags);
        }

        public Restriction(@k String str, @l String str2, @l String str3, @k List<String> list, @k String str4, @l String str5, @l String str6, boolean z12, @k RestrictionConfig restrictionConfig) {
            super(null);
            this.id = str;
            this.hash = str2;
            this.subtype = str3;
            this.fields = list;
            this.title = str4;
            this.shortTitle = str5;
            this.subtitle = str6;
            this.skipOnBackwards = z12;
            this.config = restrictionConfig;
        }
    }

    /* compiled from: CategoryPublishStep.kt */
    @K51.d
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001a¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Select;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep;", "", "id", "hash", "subtype", "", LocalPublishState.FIELDS, "title", "shortTitle", "subtitle", "", "skipOnBackwards", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getHash", "getSubtype", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "getTitle", "getShortTitle", "getSubtitle", "Z", "getSkipOnBackwards", "()Z", "getType", "type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Select extends CategoryPublishStep {

        @k
        public static final Parcelable.Creator<Select> CREATOR = new Creator();

        @c(LocalPublishState.FIELDS)
        @k
        private final List<String> fields;

        @c("hash")
        @l
        private final String hash;

        @c("id")
        @k
        private final String id;

        @c("shortTitle")
        @l
        private final String shortTitle;

        @c("skipOnBackwards")
        private final boolean skipOnBackwards;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("subtype")
        @l
        private final String subtype;

        @c("title")
        @k
        private final String title;

        /* compiled from: CategoryPublishStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Select> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Select createFromParcel(@k Parcel parcel) {
                return new Select(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Select[] newArray(int i12) {
                return new Select[i12];
            }
        }

        public /* synthetic */ Select(String str, String str2, String str3, List list, String str4, String str5, String str6, boolean z12, int i12, C42822w c42822w) {
            this(str, str2, str3, list, str4, (i12 & 32) != 0 ? null : str5, str6, z12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public List<String> getFields() {
            return this.fields;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getHash() {
            return this.hash;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getShortTitle() {
            return this.shortTitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        public boolean getSkipOnBackwards() {
            return this.skipOnBackwards;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtype() {
            return this.subtype;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getType() {
            return "select";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.hash);
            parcel.writeString(this.subtype);
            parcel.writeStringList(this.fields);
            parcel.writeString(this.title);
            parcel.writeString(this.shortTitle);
            parcel.writeString(this.subtitle);
            parcel.writeInt(this.skipOnBackwards ? 1 : 0);
        }

        public Select(@k String str, @l String str2, @l String str3, @k List<String> list, @k String str4, @l String str5, @l String str6, boolean z12) {
            super(null);
            this.id = str;
            this.hash = str2;
            this.subtype = str3;
            this.fields = list;
            this.title = str4;
            this.shortTitle = str5;
            this.subtitle = str6;
            this.skipOnBackwards = z12;
        }
    }

    /* compiled from: CategoryPublishStep.kt */
    @K51.d
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001a¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$SuggestCategory;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep;", "", "id", "hash", "subtype", "", LocalPublishState.FIELDS, "title", "shortTitle", "subtitle", "", "skipOnBackwards", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getHash", "getSubtype", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "getTitle", "getShortTitle", "getSubtitle", "Z", "getSkipOnBackwards", "()Z", "getType", "type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SuggestCategory extends CategoryPublishStep {

        @k
        public static final Parcelable.Creator<SuggestCategory> CREATOR = new Creator();

        @c(LocalPublishState.FIELDS)
        @k
        private final List<String> fields;

        @c("hash")
        @l
        private final String hash;

        @c("id")
        @k
        private final String id;

        @c("shortTitle")
        @l
        private final String shortTitle;

        @c("skipOnBackwards")
        private final boolean skipOnBackwards;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("subtype")
        @l
        private final String subtype;

        @c("title")
        @k
        private final String title;

        /* compiled from: CategoryPublishStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SuggestCategory> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SuggestCategory createFromParcel(@k Parcel parcel) {
                return new SuggestCategory(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SuggestCategory[] newArray(int i12) {
                return new SuggestCategory[i12];
            }
        }

        public /* synthetic */ SuggestCategory(String str, String str2, String str3, List list, String str4, String str5, String str6, boolean z12, int i12, C42822w c42822w) {
            this(str, str2, str3, list, str4, (i12 & 32) != 0 ? null : str5, str6, z12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public List<String> getFields() {
            return this.fields;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getHash() {
            return this.hash;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getShortTitle() {
            return this.shortTitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        public boolean getSkipOnBackwards() {
            return this.skipOnBackwards;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtype() {
            return this.subtype;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getType() {
            return "suggestCategory";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.hash);
            parcel.writeString(this.subtype);
            parcel.writeStringList(this.fields);
            parcel.writeString(this.title);
            parcel.writeString(this.shortTitle);
            parcel.writeString(this.subtitle);
            parcel.writeInt(this.skipOnBackwards ? 1 : 0);
        }

        public SuggestCategory(@k String str, @l String str2, @l String str3, @k List<String> list, @k String str4, @l String str5, @l String str6, boolean z12) {
            super(null);
            this.id = str;
            this.hash = str2;
            this.subtype = str3;
            this.fields = list;
            this.title = str4;
            this.shortTitle = str5;
            this.subtitle = str6;
            this.skipOnBackwards = z12;
        }
    }

    /* compiled from: CategoryPublishStep.kt */
    @K51.d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001dR\u0016\u00101\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Vin;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep;", "Lcom/avito/android/remote/model/category_parameters/ThemedStep;", "", "id", "hash", "subtype", "", LocalPublishState.FIELDS, "title", "shortTitle", "subtitle", "", "skipOnBackwards", "Lcom/avito/android/remote/model/category_parameters/VinConfig;", Navigation.CONFIG, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/category_parameters/VinConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getHash", "getSubtype", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "getTitle", "getShortTitle", "getSubtitle", "Z", "getSkipOnBackwards", "()Z", "Lcom/avito/android/remote/model/category_parameters/VinConfig;", "getConfig", "()Lcom/avito/android/remote/model/category_parameters/VinConfig;", "getType", "type", "Lcom/avito/android/remote/model/search/Theme;", "getTheme", "()Lcom/avito/android/remote/model/search/Theme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Vin extends CategoryPublishStep implements ThemedStep {

        @k
        public static final Parcelable.Creator<Vin> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @l
        private final VinConfig config;

        @c(LocalPublishState.FIELDS)
        @k
        private final List<String> fields;

        @c("hash")
        @l
        private final String hash;

        @c("id")
        @k
        private final String id;

        @c("shortTitle")
        @l
        private final String shortTitle;

        @c("skipOnBackwards")
        private final boolean skipOnBackwards;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("subtype")
        @l
        private final String subtype;

        @c("title")
        @k
        private final String title;

        /* compiled from: CategoryPublishStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Vin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Vin createFromParcel(@k Parcel parcel) {
                return new Vin(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : VinConfig.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Vin[] newArray(int i12) {
                return new Vin[i12];
            }
        }

        public /* synthetic */ Vin(String str, String str2, String str3, List list, String str4, String str5, String str6, boolean z12, VinConfig vinConfig, int i12, C42822w c42822w) {
            this(str, str2, str3, list, str4, (i12 & 32) != 0 ? null : str5, str6, z12, vinConfig);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final VinConfig getConfig() {
            return this.config;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public List<String> getFields() {
            return this.fields;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getHash() {
            return this.hash;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getShortTitle() {
            return this.shortTitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        public boolean getSkipOnBackwards() {
            return this.skipOnBackwards;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtype() {
            return this.subtype;
        }

        @Override // com.avito.android.remote.model.category_parameters.ThemedStep
        @l
        public Theme getTheme() {
            VinConfig vinConfig = this.config;
            if (vinConfig != null) {
                return vinConfig.getTheme();
            }
            return null;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getType() {
            return "vin";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.hash);
            parcel.writeString(this.subtype);
            parcel.writeStringList(this.fields);
            parcel.writeString(this.title);
            parcel.writeString(this.shortTitle);
            parcel.writeString(this.subtitle);
            parcel.writeInt(this.skipOnBackwards ? 1 : 0);
            VinConfig vinConfig = this.config;
            if (vinConfig == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                vinConfig.writeToParcel(parcel, flags);
            }
        }

        public Vin(@k String str, @l String str2, @l String str3, @k List<String> list, @k String str4, @l String str5, @l String str6, boolean z12, @l VinConfig vinConfig) {
            super(null);
            this.id = str;
            this.hash = str2;
            this.subtype = str3;
            this.fields = list;
            this.title = str4;
            this.shortTitle = str5;
            this.subtitle = str6;
            this.skipOnBackwards = z12;
            this.config = vinConfig;
        }
    }

    /* compiled from: CategoryPublishStep.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001:\u0001-Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001c¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Wizard;", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep;", "", "id", "hash", "subtype", "", LocalPublishState.FIELDS, "title", "shortTitle", "subtitle", "", "skipOnBackwards", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Wizard$Config;", Navigation.CONFIG, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Wizard$Config;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getHash", "getSubtype", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "getTitle", "getShortTitle", "getSubtitle", "Z", "getSkipOnBackwards", "()Z", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Wizard$Config;", "getConfig", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Wizard$Config;", "getType", "type", "Config", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class Wizard extends CategoryPublishStep {

        @k
        public static final Parcelable.Creator<Wizard> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @l
        @b(WizardConfigTypeAdapter.class)
        private final Config config;

        @c(LocalPublishState.FIELDS)
        @k
        private final List<String> fields;

        @c("hash")
        @l
        private final String hash;

        @c("id")
        @k
        private final String id;

        @c("shortTitle")
        @l
        private final String shortTitle;

        @c("skipOnBackwards")
        private final boolean skipOnBackwards;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("subtype")
        @l
        private final String subtype;

        @c("title")
        @k
        private final String title;

        /* compiled from: CategoryPublishStep.kt */
        @InterfaceC19823a
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Wizard$Config;", "Landroid/os/Parcelable;", "", "", "leavesIds", "Lcom/avito/android/remote/model/Navigation;", "leaves", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getLeavesIds", "()Ljava/util/List;", "getLeaves", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class Config implements Parcelable {

            @k
            public static final Parcelable.Creator<Config> CREATOR = new Creator();

            @l
            private final List<Navigation> leaves;

            @l
            private final List<String> leavesIds;

            /* compiled from: CategoryPublishStep.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i12);
                        int iC2 = 0;
                        while (iC2 != i12) {
                            iC2 = com.avito.android.actions_sheet.a.c(Navigation.CREATOR, parcel, arrayList2, iC2, 1);
                        }
                        arrayList = arrayList2;
                    }
                    return new Config(arrayListCreateStringArrayList, arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config[] newArray(int i12) {
                    return new Config[i12];
                }
            }

            public Config(@l List<String> list, @l List<Navigation> list2) {
                this.leavesIds = list;
                this.leaves = list2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final List<Navigation> getLeaves() {
                return this.leaves;
            }

            @l
            public final List<String> getLeavesIds() {
                return this.leavesIds;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeStringList(this.leavesIds);
                List<Navigation> list = this.leaves;
                if (list == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((Navigation) itA.next()).writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: CategoryPublishStep.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Wizard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Wizard createFromParcel(@k Parcel parcel) {
                return new Wizard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Config.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Wizard[] newArray(int i12) {
                return new Wizard[i12];
            }
        }

        public /* synthetic */ Wizard(String str, String str2, String str3, List list, String str4, String str5, String str6, boolean z12, Config config, int i12, C42822w c42822w) {
            this(str, str2, str3, list, str4, (i12 & 32) != 0 ? null : str5, str6, z12, config);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Config getConfig() {
            return this.config;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public List<String> getFields() {
            return this.fields;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getHash() {
            return this.hash;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getId() {
            return this.id;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getShortTitle() {
            return this.shortTitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        public boolean getSkipOnBackwards() {
            return this.skipOnBackwards;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @l
        public String getSubtype() {
            return this.subtype;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.category_parameters.CategoryPublishStep
        @k
        public String getType() {
            return "wizard";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.hash);
            parcel.writeString(this.subtype);
            parcel.writeStringList(this.fields);
            parcel.writeString(this.title);
            parcel.writeString(this.shortTitle);
            parcel.writeString(this.subtitle);
            parcel.writeInt(this.skipOnBackwards ? 1 : 0);
            Config config = this.config;
            if (config == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                config.writeToParcel(parcel, flags);
            }
        }

        public Wizard(@k String str, @l String str2, @l String str3, @k List<String> list, @k String str4, @l String str5, @l String str6, boolean z12, @l Config config) {
            super(null);
            this.id = str;
            this.hash = str2;
            this.subtype = str3;
            this.fields = list;
            this.title = str4;
            this.shortTitle = str5;
            this.subtitle = str6;
            this.skipOnBackwards = z12;
            this.config = config;
        }
    }

    public /* synthetic */ CategoryPublishStep(C42822w c42822w) {
        this();
    }

    public boolean equals(@l Object other) {
        return this == other || ((other instanceof CategoryPublishStep) && L.f(getId(), ((CategoryPublishStep) other).getId()));
    }

    @k
    public abstract List<String> getFields();

    @l
    public abstract String getHash();

    @k
    public abstract String getId();

    @l
    public abstract String getShortTitle();

    public abstract boolean getSkipOnBackwards();

    @l
    public abstract String getSubtitle();

    @l
    public abstract String getSubtype();

    @k
    public abstract String getTitle();

    @k
    public abstract String getType();

    public int hashCode() {
        return getId().hashCode();
    }

    @k
    public String toString() {
        return getId() + ':' + getTitle();
    }

    private CategoryPublishStep() {
    }
}
