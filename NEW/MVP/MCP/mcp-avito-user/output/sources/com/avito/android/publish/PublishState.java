package com.avito.android.publish;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.publish.PublishSession;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.CategoryModel;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.WizardParameter;
import com.avito.android.util.NotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.C43033p;

/* compiled from: PublishState.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/avito/android/publish/PublishState;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Navigation;", "rootNavigation", "navigation", "", "stepIndex", "", "Lcom/avito/android/publish/PublishState$StepState;", "stepStates", "", "activeFieldId", "", LocalPublishState.CHANGED_IDS, "<init>", "(Lcom/avito/android/remote/model/Navigation;Lcom/avito/android/remote/model/Navigation;ILjava/util/Map;Ljava/lang/String;Ljava/util/Set;)V", "Lcom/avito/android/remote/model/Navigation;", "i", "()Lcom/avito/android/remote/model/Navigation;", "r", "(Lcom/avito/android/remote/model/Navigation;)V", "g", "q", "I", "j", "()I", "u", "(I)V", "Ljava/util/Map;", "k", "()Ljava/util/Map;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "Ljava/util/Set;", "e", "()Ljava/util/Set;", "StepState", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes16.dex */
public final /* data */ class PublishState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PublishState> CREATOR = new a();

    @com.google.gson.annotations.c("activeFieldId")
    @Y61.l
    private String activeFieldId;

    @com.google.gson.annotations.c(LocalPublishState.CHANGED_IDS)
    @Y61.k
    private final Set<String> changedFieldIds;

    @com.google.gson.annotations.c("navigation")
    @Y61.k
    private Navigation navigation;

    @com.google.gson.annotations.c("rootNavigation")
    @Y61.k
    private Navigation rootNavigation;

    @com.google.gson.annotations.c("stepIndex")
    private int stepIndex;

    @com.google.gson.annotations.c("stepStates")
    @Y61.k
    private final Map<Integer, StepState> stepStates;

    /* compiled from: PublishState.kt */
    @androidx.compose.runtime.internal.P
    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\t\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/publish/PublishState$StepState;", "Landroid/os/Parcelable;", "", "type", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "CategoriesSuggestions", "a", "Imei", "Vin", "Wizard", "Lcom/avito/android/publish/PublishState$StepState$CategoriesSuggestions;", "Lcom/avito/android/publish/PublishState$StepState$Imei;", "Lcom/avito/android/publish/PublishState$StepState$Vin;", "Lcom/avito/android/publish/PublishState$StepState$Wizard;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class StepState implements Parcelable {
        public static final int $stable = 0;

        @com.google.gson.annotations.c("type")
        @Y61.k
        private final String type;

        /* compiled from: PublishState.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/avito/android/publish/PublishState$StepState$CategoriesSuggestions;", "Lcom/avito/android/publish/PublishState$StepState;", "Lcom/avito/android/publish/PublishState$StepState$a;", "Lcom/avito/android/remote/model/Navigation;", "previousNavigation", "Lcom/avito/android/remote/model/CategoryModel;", "chosenCategory", "", "Lcom/avito/android/remote/model/WizardParameter;", "suggests", "currentNavigation", "<init>", "(Lcom/avito/android/remote/model/Navigation;Lcom/avito/android/remote/model/CategoryModel;Ljava/util/List;Lcom/avito/android/remote/model/Navigation;)V", "Lcom/avito/android/remote/model/Navigation;", "c", "()Lcom/avito/android/remote/model/Navigation;", "a", "(Lcom/avito/android/remote/model/Navigation;)V", "Lcom/avito/android/remote/model/CategoryModel;", "f", "()Lcom/avito/android/remote/model/CategoryModel;", "h", "(Lcom/avito/android/remote/model/CategoryModel;)V", "Ljava/util/List;", "g", "()Ljava/util/List;", "i", "(Ljava/util/List;)V", "e", "d", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class CategoriesSuggestions extends StepState implements a {

            @Y61.k
            public static final Parcelable.Creator<CategoriesSuggestions> CREATOR = new a();

            @com.google.gson.annotations.c("chosenCategory")
            @Y61.l
            private CategoryModel chosenCategory;

            @com.google.gson.annotations.c("currentNavigation")
            @Y61.l
            private Navigation currentNavigation;

            @com.google.gson.annotations.c("previousNavigation")
            @Y61.l
            private Navigation previousNavigation;

            @com.google.gson.annotations.c("suggests")
            @Y61.k
            private List<WizardParameter> suggests;

            /* compiled from: PublishState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CategoriesSuggestions> {
                @Override // android.os.Parcelable.Creator
                public final CategoriesSuggestions createFromParcel(Parcel parcel) {
                    Navigation navigation2 = (Navigation) parcel.readParcelable(CategoriesSuggestions.class.getClassLoader());
                    CategoryModel categoryModel = (CategoryModel) parcel.readParcelable(CategoriesSuggestions.class.getClassLoader());
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(CategoriesSuggestions.class, parcel, arrayList, iL2, 1);
                    }
                    return new CategoriesSuggestions(navigation2, categoryModel, arrayList, (Navigation) parcel.readParcelable(CategoriesSuggestions.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final CategoriesSuggestions[] newArray(int i12) {
                    return new CategoriesSuggestions[i12];
                }
            }

            public CategoriesSuggestions() {
                this(null, null, null, null, 15, null);
            }

            @Override // com.avito.android.publish.PublishState.StepState.a
            public final void a(@Y61.l Navigation navigation2) {
                this.previousNavigation = navigation2;
            }

            @Override // com.avito.android.publish.PublishState.StepState.a
            @Y61.l
            /* renamed from: c, reason: from getter */
            public final Navigation getPreviousNavigation() {
                return this.previousNavigation;
            }

            @Override // com.avito.android.publish.PublishState.StepState.a
            public final void d() {
                this.currentNavigation = null;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.avito.android.publish.PublishState.StepState.a
            @Y61.l
            /* renamed from: e, reason: from getter */
            public final Navigation getCurrentNavigation() {
                return this.currentNavigation;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CategoriesSuggestions)) {
                    return false;
                }
                CategoriesSuggestions categoriesSuggestions = (CategoriesSuggestions) obj;
                return kotlin.jvm.internal.L.f(this.previousNavigation, categoriesSuggestions.previousNavigation) && kotlin.jvm.internal.L.f(this.chosenCategory, categoriesSuggestions.chosenCategory) && kotlin.jvm.internal.L.f(this.suggests, categoriesSuggestions.suggests) && kotlin.jvm.internal.L.f(this.currentNavigation, categoriesSuggestions.currentNavigation);
            }

            @Y61.l
            /* renamed from: f, reason: from getter */
            public final CategoryModel getChosenCategory() {
                return this.chosenCategory;
            }

            @Y61.k
            public final List<WizardParameter> g() {
                return this.suggests;
            }

            public final void h(@Y61.l CategoryModel categoryModel) {
                this.chosenCategory = categoryModel;
            }

            public final int hashCode() {
                Navigation navigation2 = this.previousNavigation;
                int iHashCode = (navigation2 == null ? 0 : navigation2.hashCode()) * 31;
                CategoryModel categoryModel = this.chosenCategory;
                int iE2 = androidx.compose.foundation.H.e((iHashCode + (categoryModel == null ? 0 : categoryModel.hashCode())) * 31, 31, this.suggests);
                Navigation navigation3 = this.currentNavigation;
                return iE2 + (navigation3 != null ? navigation3.hashCode() : 0);
            }

            public final void i(@Y61.k List<WizardParameter> list) {
                this.suggests = list;
            }

            @Y61.k
            public final String toString() {
                return "CategoriesSuggestions(previousNavigation=" + this.previousNavigation + ", chosenCategory=" + this.chosenCategory + ", suggests=" + this.suggests + ", currentNavigation=" + this.currentNavigation + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeParcelable(this.previousNavigation, i12);
                parcel.writeParcelable(this.chosenCategory, i12);
                Iterator itJ = com.akita.compose.theme.re23.style.C0.j(this.suggests, parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), i12);
                }
                parcel.writeParcelable(this.currentNavigation, i12);
            }

            public CategoriesSuggestions(@Y61.l Navigation navigation2, @Y61.l CategoryModel categoryModel, @Y61.k List<WizardParameter> list, @Y61.l Navigation navigation3) {
                super(PublishSession.StepType.f232014p.toString(), null);
                this.previousNavigation = navigation2;
                this.chosenCategory = categoryModel;
                this.suggests = list;
                this.currentNavigation = navigation3;
            }

            public CategoriesSuggestions(Navigation navigation2, CategoryModel categoryModel, List list, Navigation navigation3, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : navigation2, (i12 & 2) != 0 ? null : categoryModel, (i12 & 4) != 0 ? C42784z0.f406748b : list, (i12 & 8) != 0 ? null : navigation3);
            }
        }

        /* compiled from: PublishState.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/avito/android/publish/PublishState$StepState$Imei;", "Lcom/avito/android/publish/PublishState$StepState;", "", "recognizedImei", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Imei extends StepState {

            @Y61.k
            public static final Parcelable.Creator<Imei> CREATOR = new a();

            @com.google.gson.annotations.c("recognizedImei")
            @Y61.l
            private String recognizedImei;

            /* compiled from: PublishState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Imei> {
                @Override // android.os.Parcelable.Creator
                public final Imei createFromParcel(Parcel parcel) {
                    return new Imei(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Imei[] newArray(int i12) {
                    return new Imei[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Imei() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Imei) && kotlin.jvm.internal.L.f(this.recognizedImei, ((Imei) obj).recognizedImei);
            }

            @Y61.l
            /* renamed from: f, reason: from getter */
            public final String getRecognizedImei() {
                return this.recognizedImei;
            }

            public final void g(@Y61.l String str) {
                this.recognizedImei = str;
            }

            public final int hashCode() {
                String str = this.recognizedImei;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Imei(recognizedImei="), this.recognizedImei, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.recognizedImei);
            }

            public /* synthetic */ Imei(String str, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str);
            }

            public Imei(@Y61.l String str) {
                super(PublishSession.StepType.f232008j.toString(), null);
                this.recognizedImei = str;
            }
        }

        /* compiled from: PublishState.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/avito/android/publish/PublishState$StepState$Vin;", "Lcom/avito/android/publish/PublishState$StepState;", "", "recognizedVin", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Vin extends StepState {

            @Y61.k
            public static final Parcelable.Creator<Vin> CREATOR = new a();

            @com.google.gson.annotations.c("recognizedVin")
            @Y61.l
            private String recognizedVin;

            /* compiled from: PublishState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Vin> {
                @Override // android.os.Parcelable.Creator
                public final Vin createFromParcel(Parcel parcel) {
                    return new Vin(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Vin[] newArray(int i12) {
                    return new Vin[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Vin() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Vin) && kotlin.jvm.internal.L.f(this.recognizedVin, ((Vin) obj).recognizedVin);
            }

            @Y61.l
            /* renamed from: f, reason: from getter */
            public final String getRecognizedVin() {
                return this.recognizedVin;
            }

            public final void g(@Y61.l String str) {
                this.recognizedVin = str;
            }

            public final int hashCode() {
                String str = this.recognizedVin;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Vin(recognizedVin="), this.recognizedVin, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.recognizedVin);
            }

            public /* synthetic */ Vin(String str, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str);
            }

            public Vin(@Y61.l String str) {
                super(PublishSession.StepType.f232007i.toString(), null);
                this.recognizedVin = str;
            }
        }

        /* compiled from: PublishState.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/avito/android/publish/PublishState$StepState$Wizard;", "Lcom/avito/android/publish/PublishState$StepState;", "Lcom/avito/android/publish/PublishState$StepState$a;", "Lcom/avito/android/remote/model/Navigation;", "previousNavigation", "selectedNavigation", "currentNavigation", "<init>", "(Lcom/avito/android/remote/model/Navigation;Lcom/avito/android/remote/model/Navigation;Lcom/avito/android/remote/model/Navigation;)V", "Lcom/avito/android/remote/model/Navigation;", "c", "()Lcom/avito/android/remote/model/Navigation;", "a", "(Lcom/avito/android/remote/model/Navigation;)V", "f", "g", "e", "d", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Wizard extends StepState implements a {

            @Y61.k
            public static final Parcelable.Creator<Wizard> CREATOR = new a();

            @com.google.gson.annotations.c("currentNavigation")
            @Y61.l
            private Navigation currentNavigation;

            @com.google.gson.annotations.c("previousNavigation")
            @Y61.l
            private Navigation previousNavigation;

            @com.google.gson.annotations.c("selectedNavigation")
            @Y61.l
            private Navigation selectedNavigation;

            /* compiled from: PublishState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Wizard> {
                @Override // android.os.Parcelable.Creator
                public final Wizard createFromParcel(Parcel parcel) {
                    return new Wizard((Navigation) parcel.readParcelable(Wizard.class.getClassLoader()), (Navigation) parcel.readParcelable(Wizard.class.getClassLoader()), (Navigation) parcel.readParcelable(Wizard.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Wizard[] newArray(int i12) {
                    return new Wizard[i12];
                }
            }

            public Wizard() {
                this(null, null, null, 7, null);
            }

            @Override // com.avito.android.publish.PublishState.StepState.a
            public final void a(@Y61.l Navigation navigation2) {
                this.previousNavigation = navigation2;
            }

            @Override // com.avito.android.publish.PublishState.StepState.a
            @Y61.l
            /* renamed from: c, reason: from getter */
            public final Navigation getPreviousNavigation() {
                return this.previousNavigation;
            }

            @Override // com.avito.android.publish.PublishState.StepState.a
            public final void d() {
                this.currentNavigation = null;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.avito.android.publish.PublishState.StepState.a
            @Y61.l
            /* renamed from: e, reason: from getter */
            public final Navigation getCurrentNavigation() {
                return this.currentNavigation;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Wizard)) {
                    return false;
                }
                Wizard wizard = (Wizard) obj;
                return kotlin.jvm.internal.L.f(this.previousNavigation, wizard.previousNavigation) && kotlin.jvm.internal.L.f(this.selectedNavigation, wizard.selectedNavigation) && kotlin.jvm.internal.L.f(this.currentNavigation, wizard.currentNavigation);
            }

            @Y61.l
            /* renamed from: f, reason: from getter */
            public final Navigation getSelectedNavigation() {
                return this.selectedNavigation;
            }

            public final void g(@Y61.l Navigation navigation2) {
                this.selectedNavigation = navigation2;
            }

            public final int hashCode() {
                Navigation navigation2 = this.previousNavigation;
                int iHashCode = (navigation2 == null ? 0 : navigation2.hashCode()) * 31;
                Navigation navigation3 = this.selectedNavigation;
                int iHashCode2 = (iHashCode + (navigation3 == null ? 0 : navigation3.hashCode())) * 31;
                Navigation navigation4 = this.currentNavigation;
                return iHashCode2 + (navigation4 != null ? navigation4.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                return "Wizard(previousNavigation=" + this.previousNavigation + ", selectedNavigation=" + this.selectedNavigation + ", currentNavigation=" + this.currentNavigation + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeParcelable(this.previousNavigation, i12);
                parcel.writeParcelable(this.selectedNavigation, i12);
                parcel.writeParcelable(this.currentNavigation, i12);
            }

            public /* synthetic */ Wizard(Navigation navigation2, Navigation navigation3, Navigation navigation4, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : navigation2, (i12 & 2) != 0 ? null : navigation3, (i12 & 4) != 0 ? null : navigation4);
            }

            public Wizard(@Y61.l Navigation navigation2, @Y61.l Navigation navigation3, @Y61.l Navigation navigation4) {
                super(PublishSession.StepType.f232006h.toString(), null);
                this.previousNavigation = navigation2;
                this.selectedNavigation = navigation3;
                this.currentNavigation = navigation4;
            }
        }

        /* compiled from: PublishState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/PublishState$StepState$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface a {
            void a(@Y61.l Navigation navigation2);

            @Y61.l
            /* renamed from: c */
            Navigation getPreviousNavigation();

            void d();

            @Y61.l
            /* renamed from: e */
            Navigation getCurrentNavigation();
        }

        public /* synthetic */ StepState(String str, C42822w c42822w) {
            this(str);
        }

        @Y61.k
        public final String getType() {
            return this.type;
        }

        private StepState(String str) {
            this.type = str;
        }
    }

    /* compiled from: PublishState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PublishState> {
        @Override // android.os.Parcelable.Creator
        public final PublishState createFromParcel(Parcel parcel) {
            Navigation navigation2 = (Navigation) parcel.readParcelable(PublishState.class.getClassLoader());
            Navigation navigation3 = (Navigation) parcel.readParcelable(PublishState.class.getClassLoader());
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                linkedHashMap.put(Integer.valueOf(parcel.readInt()), parcel.readParcelable(PublishState.class.getClassLoader()));
            }
            String string = parcel.readString();
            int i15 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                linkedHashSet.add(parcel.readString());
            }
            return new PublishState(navigation2, navigation3, i12, linkedHashMap, string, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final PublishState[] newArray(int i12) {
            return new PublishState[i12];
        }
    }

    /* compiled from: Comparisons.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b((Integer) ((kotlin.Q) t12).f406619b, (Integer) ((kotlin.Q) t13).f406619b);
        }
    }

    /* compiled from: PublishState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "Lcom/avito/android/publish/PublishState$StepState;", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Map.Entry<? extends Integer, ? extends StepState>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f232029l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Map.Entry<? extends Integer, ? extends StepState> entry) {
            return Boolean.valueOf(entry.getValue() instanceof StepState.a);
        }
    }

    /* compiled from: PublishState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010&\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/avito/android/publish/PublishState$StepState;", "<name for destructuring parameter 0>", "Lkotlin/Q;", "invoke", "(Ljava/util/Map$Entry;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Map.Entry<? extends Integer, ? extends StepState>, kotlin.Q<? extends Integer, ? extends StepState>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f232030l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.Q<? extends Integer, ? extends StepState> invoke(Map.Entry<? extends Integer, ? extends StepState> entry) {
            Map.Entry<? extends Integer, ? extends StepState> entry2 = entry;
            int iIntValue = entry2.getKey().intValue();
            return new kotlin.Q<>(Integer.valueOf(iIntValue), entry2.getValue());
        }
    }

    public PublishState() {
        this(null, null, 0, null, null, null, 63, null);
    }

    @Y61.k
    public final PublishState c() {
        return new PublishState(this.rootNavigation, this.navigation, this.stepIndex, new LinkedHashMap(this.stepStates), this.activeFieldId, this.changedFieldIds);
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getActiveFieldId() {
        return this.activeFieldId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.k
    public final Set<String> e() {
        return this.changedFieldIds;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishState)) {
            return false;
        }
        PublishState publishState = (PublishState) obj;
        return kotlin.jvm.internal.L.f(this.rootNavigation, publishState.rootNavigation) && kotlin.jvm.internal.L.f(this.navigation, publishState.navigation) && this.stepIndex == publishState.stepIndex && kotlin.jvm.internal.L.f(this.stepStates, publishState.stepStates) && kotlin.jvm.internal.L.f(this.activeFieldId, publishState.activeFieldId) && kotlin.jvm.internal.L.f(this.changedFieldIds, publishState.changedFieldIds);
    }

    @Y61.l
    public final Navigation f(int i12) {
        Parcelable parcelable = this.stepStates.get(Integer.valueOf(i12));
        StepState.a aVar = parcelable instanceof StepState.a ? (StepState.a) parcelable : null;
        if (aVar != null) {
            return aVar.getCurrentNavigation();
        }
        return null;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final Navigation getNavigation() {
        return this.navigation;
    }

    @Y61.k
    public final Navigation h() {
        CategoryModel chosenCategory;
        Navigation navigation2;
        Parcelable parcelable = this.stepStates.get((Integer) C42745f0.W(this.stepStates.keySet()));
        StepState.a aVar = parcelable instanceof StepState.a ? (StepState.a) parcelable : null;
        StepState.CategoriesSuggestions categoriesSuggestions = aVar instanceof StepState.CategoriesSuggestions ? (StepState.CategoriesSuggestions) aVar : null;
        StepState.Wizard wizard = aVar instanceof StepState.Wizard ? (StepState.Wizard) aVar : null;
        if (categoriesSuggestions != null && (chosenCategory = categoriesSuggestions.getChosenCategory()) != null && (navigation2 = chosenCategory.getNavigation()) != null) {
            return navigation2;
        }
        Navigation selectedNavigation = wizard != null ? wizard.getSelectedNavigation() : null;
        if (selectedNavigation != null) {
            return selectedNavigation;
        }
        Navigation currentNavigation = aVar != null ? aVar.getCurrentNavigation() : null;
        return currentNavigation == null ? this.navigation : currentNavigation;
    }

    public final int hashCode() {
        int iC2 = AK.c.c(androidx.appcompat.app.r.e(this.stepIndex, (this.navigation.hashCode() + (this.rootNavigation.hashCode() * 31)) * 31, 31), 31, this.stepStates);
        String str = this.activeFieldId;
        return this.changedFieldIds.hashCode() + ((iC2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    /* renamed from: i, reason: from getter */
    public final Navigation getRootNavigation() {
        return this.rootNavigation;
    }

    /* renamed from: j, reason: from getter */
    public final int getStepIndex() {
        return this.stepIndex;
    }

    @Y61.k
    public final Map<Integer, StepState> k() {
        return this.stepStates;
    }

    public final StepState.CategoriesSuggestions l() throws NotFoundException {
        StepState imei;
        StepState stepState = this.stepStates.get(-1);
        boolean z12 = stepState instanceof StepState.CategoriesSuggestions;
        StepState stepState2 = stepState;
        if (!z12) {
            kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
            kotlin.reflect.d dVarB = n0Var.b(StepState.CategoriesSuggestions.class);
            if (dVarB.equals(n0Var.b(StepState.Wizard.class))) {
                imei = new StepState.Wizard(null, null, null, 7, null);
            } else if (dVarB.equals(n0Var.b(StepState.CategoriesSuggestions.class))) {
                imei = new StepState.CategoriesSuggestions(null, null, null, null, 15, null);
            } else {
                int i12 = 1;
                String str = null;
                if (dVarB.equals(n0Var.b(StepState.Vin.class))) {
                    imei = new StepState.Vin(str, i12, false ? 1 : 0);
                } else {
                    if (!dVarB.equals(n0Var.b(StepState.Imei.class))) {
                        throw new NotFoundException(n0Var.b(StepState.CategoriesSuggestions.class).toString(), (Throwable) null, 2, (C42822w) null);
                    }
                    imei = new StepState.Imei(false ? 1 : 0, i12, false ? 1 : 0);
                }
            }
            this.stepStates.put(-1, imei);
            stepState2 = (StepState.CategoriesSuggestions) imei;
        }
        return (StepState.CategoriesSuggestions) stepState2;
    }

    public final void m(@Y61.k CategoryModel categoryModel) throws NotFoundException {
        Navigation navigation2 = new Navigation(null, null, null, null, null, null, null, null, null, 511, null);
        this.rootNavigation = navigation2;
        this.navigation = navigation2;
        this.stepIndex = -1;
        this.stepStates.clear();
        StepState.CategoriesSuggestions categoriesSuggestionsL = l();
        s(categoriesSuggestionsL, -1, categoryModel);
        this.stepStates.put(-1, categoriesSuggestionsL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n() {
        Object obj;
        CategoryModel chosenCategory = l().getChosenCategory();
        if (chosenCategory == null) {
            return;
        }
        this.stepStates.remove(-1);
        Iterator<Object> it = new kotlin.sequences.f0(new kotlin.sequences.o0(C43033p.i(kotlin.collections.P0.b(this.stepStates), c.f232029l), d.f232030l), new b()).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            obj = next;
        } else {
            obj = null;
        }
        kotlin.Q q12 = (kotlin.Q) obj;
        if (q12 == null) {
            return;
        }
        int iIntValue = ((Number) q12.f406619b).intValue();
        Parcelable parcelable = (StepState) q12.f406620c;
        StepState.a aVar = (StepState.a) parcelable;
        aVar.a(chosenCategory.getRootNavigation());
        s(aVar, iIntValue, chosenCategory);
        this.stepStates.put(Integer.valueOf(iIntValue), parcelable);
    }

    public final void o(@Y61.l String str) {
        this.activeFieldId = str;
    }

    public final void p(int i12) {
        Parcelable parcelable = this.stepStates.get(Integer.valueOf(i12));
        StepState.a aVar = parcelable instanceof StepState.a ? (StepState.a) parcelable : null;
        if (aVar == null) {
            return;
        }
        aVar.d();
    }

    public final void q(@Y61.k Navigation navigation2) {
        this.navigation = navigation2;
    }

    public final void r(@Y61.k Navigation navigation2) {
        this.rootNavigation = navigation2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(com.avito.android.publish.PublishState.StepState.a r12, int r13, com.avito.android.remote.model.CategoryModel r14) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.PublishState.s(com.avito.android.publish.PublishState$StepState$a, int, com.avito.android.remote.model.CategoryModel):void");
    }

    public final void t(int i12, @Y61.k CategoryModel categoryModel) {
        Parcelable parcelable = this.stepStates.get(Integer.valueOf(i12));
        StepState.a aVar = parcelable instanceof StepState.a ? (StepState.a) parcelable : null;
        if (aVar != null) {
            s(aVar, i12, categoryModel);
        }
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublishState(rootNavigation=");
        sb2.append(this.rootNavigation);
        sb2.append(", navigation=");
        sb2.append(this.navigation);
        sb2.append(", stepIndex=");
        sb2.append(this.stepIndex);
        sb2.append(", stepStates=");
        sb2.append(this.stepStates);
        sb2.append(", activeFieldId=");
        sb2.append(this.activeFieldId);
        sb2.append(", changedFieldIds=");
        return AK.c.u(sb2, this.changedFieldIds, ')');
    }

    public final void u(int i12) {
        this.stepIndex = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.rootNavigation, i12);
        parcel.writeParcelable(this.navigation, i12);
        parcel.writeInt(this.stepIndex);
        Iterator itI = com.akita.compose.theme.re23.style.C0.i(parcel, this.stepStates);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeInt(((Number) entry.getKey()).intValue());
            parcel.writeParcelable((Parcelable) entry.getValue(), i12);
        }
        parcel.writeString(this.activeFieldId);
        Set<String> set = this.changedFieldIds;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
    }

    public PublishState(@Y61.k Navigation navigation2, @Y61.k Navigation navigation3, int i12, @Y61.k Map<Integer, StepState> map, @Y61.l String str, @Y61.k Set<String> set) {
        this.rootNavigation = navigation2;
        this.navigation = navigation3;
        this.stepIndex = i12;
        this.stepStates = map;
        this.activeFieldId = str;
        this.changedFieldIds = set;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PublishState(Navigation navigation2, Navigation navigation3, int i12, Map map, String str, Set set, int i13, C42822w c42822w) {
        Navigation navigation4 = (i13 & 1) != 0 ? new Navigation(null, null, null, null, null, null, null, null, null, 511, null) : navigation2;
        this(navigation4, (i13 & 2) != 0 ? navigation4 : navigation3, (i13 & 4) != 0 ? -1 : i12, (i13 & 8) != 0 ? new LinkedHashMap() : map, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? new LinkedHashSet() : set);
    }
}
