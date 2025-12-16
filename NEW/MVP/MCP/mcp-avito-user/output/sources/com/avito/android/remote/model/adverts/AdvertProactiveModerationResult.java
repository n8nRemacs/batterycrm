package com.avito.android.remote.model.adverts;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.AdvertDuplicateResult;
import com.avito.android.remote.model.CategoryModel;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertProactiveModerationResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/adverts/AdvertProactiveModerationResult;", "", "()V", "Duplicate", "Ok", "WrongCategory", "WrongCategorySuggest", "Lcom/avito/android/remote/model/adverts/AdvertProactiveModerationResult$Duplicate;", "Lcom/avito/android/remote/model/adverts/AdvertProactiveModerationResult$Ok;", "Lcom/avito/android/remote/model/adverts/AdvertProactiveModerationResult$WrongCategory;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class AdvertProactiveModerationResult {

    /* compiled from: AdvertProactiveModerationResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/adverts/AdvertProactiveModerationResult$Duplicate;", "Lcom/avito/android/remote/model/adverts/AdvertProactiveModerationResult;", "duplicateBody", "Lcom/avito/android/remote/model/AdvertDuplicateResult;", "(Lcom/avito/android/remote/model/AdvertDuplicateResult;)V", "getDuplicateBody", "()Lcom/avito/android/remote/model/AdvertDuplicateResult;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Duplicate extends AdvertProactiveModerationResult {

        @c("result")
        @k
        private final AdvertDuplicateResult duplicateBody;

        public Duplicate(@k AdvertDuplicateResult advertDuplicateResult) {
            super(null);
            this.duplicateBody = advertDuplicateResult;
        }

        @k
        public final AdvertDuplicateResult getDuplicateBody() {
            return this.duplicateBody;
        }
    }

    /* compiled from: AdvertProactiveModerationResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/model/adverts/AdvertProactiveModerationResult$Ok;", "Lcom/avito/android/remote/model/adverts/AdvertProactiveModerationResult;", "()V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok extends AdvertProactiveModerationResult {
        public Ok() {
            super(null);
        }
    }

    /* compiled from: AdvertProactiveModerationResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/adverts/AdvertProactiveModerationResult$WrongCategory;", "Lcom/avito/android/remote/model/adverts/AdvertProactiveModerationResult;", "wrongCategorySuggest", "Lcom/avito/android/remote/model/adverts/AdvertProactiveModerationResult$WrongCategorySuggest;", "(Lcom/avito/android/remote/model/adverts/AdvertProactiveModerationResult$WrongCategorySuggest;)V", "getWrongCategorySuggest", "()Lcom/avito/android/remote/model/adverts/AdvertProactiveModerationResult$WrongCategorySuggest;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WrongCategory extends AdvertProactiveModerationResult {

        @c("result")
        @k
        private final WrongCategorySuggest wrongCategorySuggest;

        public WrongCategory(@k WrongCategorySuggest wrongCategorySuggest) {
            super(null);
            this.wrongCategorySuggest = wrongCategorySuggest;
        }

        @k
        public final WrongCategorySuggest getWrongCategorySuggest() {
            return this.wrongCategorySuggest;
        }
    }

    /* compiled from: AdvertProactiveModerationResult.kt */
    @d
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/adverts/AdvertProactiveModerationResult$WrongCategorySuggest;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/CategoryModel;", "categories", "selectedCategory", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/CategoryModel;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getCategories", "()Ljava/util/List;", "Lcom/avito/android/remote/model/CategoryModel;", "getSelectedCategory", "()Lcom/avito/android/remote/model/CategoryModel;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WrongCategorySuggest implements Parcelable {

        @k
        public static final Parcelable.Creator<WrongCategorySuggest> CREATOR = new Creator();

        @c("list")
        @k
        private final List<CategoryModel> categories;

        @c("selectedCategory")
        @k
        private final CategoryModel selectedCategory;

        /* compiled from: AdvertProactiveModerationResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WrongCategorySuggest> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final WrongCategorySuggest createFromParcel(@k Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(WrongCategorySuggest.class, parcel, arrayList, iL2, 1);
                }
                return new WrongCategorySuggest(arrayList, (CategoryModel) parcel.readParcelable(WrongCategorySuggest.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final WrongCategorySuggest[] newArray(int i12) {
                return new WrongCategorySuggest[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WrongCategorySuggest(@k List<? extends CategoryModel> list, @k CategoryModel categoryModel) {
            this.categories = list;
            this.selectedCategory = categoryModel;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final List<CategoryModel> getCategories() {
            return this.categories;
        }

        @k
        public final CategoryModel getSelectedCategory() {
            return this.selectedCategory;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Iterator itJ = C0.j(this.categories, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
            parcel.writeParcelable(this.selectedCategory, flags);
        }
    }

    public /* synthetic */ AdvertProactiveModerationResult(C42822w c42822w) {
        this();
    }

    private AdvertProactiveModerationResult() {
    }
}
