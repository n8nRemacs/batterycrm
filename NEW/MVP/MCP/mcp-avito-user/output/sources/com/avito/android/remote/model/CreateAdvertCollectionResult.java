package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateAdvertCollectionResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/CreateAdvertCollectionResult;", "Landroid/os/Parcelable;", "Created", "ValidationError", "Lcom/avito/android/remote/model/CreateAdvertCollectionResult$Created;", "Lcom/avito/android/remote/model/CreateAdvertCollectionResult$ValidationError;", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface CreateAdvertCollectionResult extends Parcelable {

    /* compiled from: CreateAdvertCollectionResult.kt */
    @d
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JD\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0015J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0015¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/CreateAdvertCollectionResult$Created;", "Lcom/avito/android/remote/model/CreateAdvertCollectionResult;", "", "id", "name", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/Image;", MessageSuggest.PREVIEW, "", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Image;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Image;I)Lcom/avito/android/remote/model/CreateAdvertCollectionResult$Created;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getName", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Lcom/avito/android/remote/model/Image;", "getPreview", "I", "getSize", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Created implements CreateAdvertCollectionResult {

        @k
        public static final Parcelable.Creator<Created> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deepLink;

        @c("id")
        @k
        private final String id;

        @c("name")
        @k
        private final String name;

        @c(MessageSuggest.PREVIEW)
        @l
        private final Image preview;

        @c("size")
        private final int size;

        /* compiled from: CreateAdvertCollectionResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Created> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Created createFromParcel(@k Parcel parcel) {
                return new Created(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Created.class.getClassLoader()), (Image) parcel.readParcelable(Created.class.getClassLoader()), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Created[] newArray(int i12) {
                return new Created[i12];
            }
        }

        public Created(@k String str, @k String str2, @k DeepLink deepLink, @l Image image, int i12) {
            this.id = str;
            this.name = str2;
            this.deepLink = deepLink;
            this.preview = image;
            this.size = i12;
        }

        public static /* synthetic */ Created copy$default(Created created, String str, String str2, DeepLink deepLink, Image image, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = created.id;
            }
            if ((i13 & 2) != 0) {
                str2 = created.name;
            }
            String str3 = str2;
            if ((i13 & 4) != 0) {
                deepLink = created.deepLink;
            }
            DeepLink deepLink2 = deepLink;
            if ((i13 & 8) != 0) {
                image = created.preview;
            }
            Image image2 = image;
            if ((i13 & 16) != 0) {
                i12 = created.size;
            }
            return created.copy(str, str3, deepLink2, image2, i12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Image getPreview() {
            return this.preview;
        }

        /* renamed from: component5, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        @k
        public final Created copy(@k String id2, @k String name, @k DeepLink deepLink, @l Image preview, int size) {
            return new Created(id2, name, deepLink, preview, size);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Created)) {
                return false;
            }
            Created created = (Created) other;
            return L.f(this.id, created.id) && L.f(this.name, created.name) && L.f(this.deepLink, created.deepLink) && L.f(this.preview, created.preview) && this.size == created.size;
        }

        @k
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @l
        public final Image getPreview() {
            return this.preview;
        }

        public final int getSize() {
            return this.size;
        }

        public int hashCode() {
            int iE2 = a.e(this.deepLink, H.d(this.id.hashCode() * 31, 31, this.name), 31);
            Image image = this.preview;
            return Integer.hashCode(this.size) + ((iE2 + (image == null ? 0 : image.hashCode())) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Created(id=");
            sb2.append(this.id);
            sb2.append(", name=");
            sb2.append(this.name);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", preview=");
            sb2.append(this.preview);
            sb2.append(", size=");
            return r.t(sb2, this.size, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.name);
            parcel.writeParcelable(this.deepLink, flags);
            parcel.writeParcelable(this.preview, flags);
            parcel.writeInt(this.size);
        }
    }

    /* compiled from: CreateAdvertCollectionResult.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/CreateAdvertCollectionResult$ValidationError;", "Lcom/avito/android/remote/model/CreateAdvertCollectionResult;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/CreateAdvertCollectionResult$ValidationError;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessage", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ValidationError implements CreateAdvertCollectionResult {

        @k
        public static final Parcelable.Creator<ValidationError> CREATOR = new Creator();

        @c("message")
        @k
        private final String message;

        /* compiled from: CreateAdvertCollectionResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ValidationError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ValidationError createFromParcel(@k Parcel parcel) {
                return new ValidationError(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ValidationError[] newArray(int i12) {
                return new ValidationError[i12];
            }
        }

        public ValidationError(@k String str) {
            this.message = str;
        }

        public static /* synthetic */ ValidationError copy$default(ValidationError validationError, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = validationError.message;
            }
            return validationError.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @k
        public final ValidationError copy(@k String message) {
            return new ValidationError(message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ValidationError) && L.f(this.message, ((ValidationError) other).message);
        }

        @k
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("ValidationError(message="), this.message, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.message);
        }
    }
}
