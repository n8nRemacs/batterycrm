package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RelatedProducts.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/RelatedProducts;", "Landroid/os/Parcelable;", "ClassifiedItem", "TransactionalItem", "Lcom/avito/android/remote/model/RelatedProducts$ClassifiedItem;", "Lcom/avito/android/remote/model/RelatedProducts$TransactionalItem;", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RelatedProducts extends Parcelable {

    /* compiled from: RelatedProducts.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/RelatedProducts$ClassifiedItem;", "Lcom/avito/android/remote/model/RelatedProducts;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/RelatedProducts$ClassifiedItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClassifiedItem implements RelatedProducts {

        @k
        public static final Parcelable.Creator<ClassifiedItem> CREATOR = new Creator();

        @c(Constants.DEEPLINK)
        @k
        private final DeepLink deepLink;

        @c("title")
        @k
        private final AttributedText title;

        /* compiled from: RelatedProducts.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClassifiedItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ClassifiedItem createFromParcel(@k Parcel parcel) {
                return new ClassifiedItem((AttributedText) parcel.readParcelable(ClassifiedItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(ClassifiedItem.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ClassifiedItem[] newArray(int i12) {
                return new ClassifiedItem[i12];
            }
        }

        public ClassifiedItem(@k AttributedText attributedText, @k DeepLink deepLink) {
            this.title = attributedText;
            this.deepLink = deepLink;
        }

        public static /* synthetic */ ClassifiedItem copy$default(ClassifiedItem classifiedItem, AttributedText attributedText, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                attributedText = classifiedItem.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = classifiedItem.deepLink;
            }
            return classifiedItem.copy(attributedText, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final ClassifiedItem copy(@k AttributedText title, @k DeepLink deepLink) {
            return new ClassifiedItem(title, deepLink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClassifiedItem)) {
                return false;
            }
            ClassifiedItem classifiedItem = (ClassifiedItem) other;
            return L.f(this.title, classifiedItem.title) && L.f(this.deepLink, classifiedItem.deepLink);
        }

        @k
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final AttributedText getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.deepLink.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ClassifiedItem(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            return a.v(sb2, this.deepLink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.title, flags);
            parcel.writeParcelable(this.deepLink, flags);
        }
    }

    /* compiled from: RelatedProducts.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/RelatedProducts$TransactionalItem;", "Lcom/avito/android/remote/model/RelatedProducts;", "", "withComplementary", "", "context", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/avito/android/remote/model/RelatedProducts$TransactionalItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getWithComplementary", "Ljava/lang/String;", "getContext", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TransactionalItem implements RelatedProducts {

        @k
        public static final Parcelable.Creator<TransactionalItem> CREATOR = new Creator();

        @c("context")
        @l
        private final String context;

        @c("withComplementary")
        private final boolean withComplementary;

        /* compiled from: RelatedProducts.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TransactionalItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TransactionalItem createFromParcel(@k Parcel parcel) {
                return new TransactionalItem(parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TransactionalItem[] newArray(int i12) {
                return new TransactionalItem[i12];
            }
        }

        public TransactionalItem(boolean z12, @l String str) {
            this.withComplementary = z12;
            this.context = str;
        }

        public static /* synthetic */ TransactionalItem copy$default(TransactionalItem transactionalItem, boolean z12, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = transactionalItem.withComplementary;
            }
            if ((i12 & 2) != 0) {
                str = transactionalItem.context;
            }
            return transactionalItem.copy(z12, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getWithComplementary() {
            return this.withComplementary;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        @k
        public final TransactionalItem copy(boolean withComplementary, @l String context) {
            return new TransactionalItem(withComplementary, context);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransactionalItem)) {
                return false;
            }
            TransactionalItem transactionalItem = (TransactionalItem) other;
            return this.withComplementary == transactionalItem.withComplementary && L.f(this.context, transactionalItem.context);
        }

        @l
        public final String getContext() {
            return this.context;
        }

        public final boolean getWithComplementary() {
            return this.withComplementary;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.withComplementary) * 31;
            String str = this.context;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("TransactionalItem(withComplementary=");
            sb2.append(this.withComplementary);
            sb2.append(", context=");
            return C22026a.c(sb2, this.context, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.withComplementary ? 1 : 0);
            parcel.writeString(this.context);
        }
    }
}
