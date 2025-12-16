package com.avito.android.remote.model.messenger.attach_menu;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AttachMenu.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\t\u0007\b\t\n\u000b\f\r\u000e\u000fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem;", "Landroid/os/Parcelable;", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "Companion", "File", "Image", "Item", "Location", "Replies", "Support", "Video", "Voice", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$File;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Image;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Item;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Location;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Replies;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Support;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Video;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Voice;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class AttachMenuItem implements Parcelable {

    @k
    public static final String ENABLE_FOR_UNANSWERED = "enableForUnanswered";

    @k
    public static final String TITLE = "title";

    /* compiled from: AttachMenu.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0013¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$File;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem;", "", "title", "", "maxSizeBytes", "", AttachMenuItem.ENABLE_FOR_UNANSWERED, "", File.EXTENSIONS, "<init>", "(Ljava/lang/String;Ljava/lang/Long;ZLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "()Z", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/Long;ZLjava/util/List;)Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$File;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/lang/Long;", "getMaxSizeBytes", "Z", "getEnableForUnanswered", "Ljava/util/List;", "getExtensions", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class File extends AttachMenuItem {

        @k
        public static final String EXTENSIONS = "extensions";

        @k
        public static final String KEY = "file";

        @k
        public static final String MAX_SIZE_BYTES = "maxSizeBytes";

        @c(AttachMenuItem.ENABLE_FOR_UNANSWERED)
        private final boolean enableForUnanswered;

        @c(EXTENSIONS)
        @l
        private final List<String> extensions;

        @c("maxSizeBytes")
        @l
        private final Long maxSizeBytes;

        @c("title")
        @k
        private final String title;

        @k
        public static final Parcelable.Creator<File> CREATOR = new Creator();

        /* compiled from: AttachMenu.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<File> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final File createFromParcel(@k Parcel parcel) {
                return new File(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final File[] newArray(int i12) {
                return new File[i12];
            }
        }

        public File(@k String str, @l Long l12, boolean z12, @l List<String> list) {
            super(null);
            this.title = str;
            this.maxSizeBytes = l12;
            this.enableForUnanswered = z12;
            this.extensions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ File copy$default(File file, String str, Long l12, boolean z12, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = file.title;
            }
            if ((i12 & 2) != 0) {
                l12 = file.maxSizeBytes;
            }
            if ((i12 & 4) != 0) {
                z12 = file.enableForUnanswered;
            }
            if ((i12 & 8) != 0) {
                list = file.extensions;
            }
            return file.copy(str, l12, z12, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Long getMaxSizeBytes() {
            return this.maxSizeBytes;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getEnableForUnanswered() {
            return this.enableForUnanswered;
        }

        @l
        public final List<String> component4() {
            return this.extensions;
        }

        @k
        public final File copy(@k String title, @l Long maxSizeBytes, boolean enableForUnanswered, @l List<String> extensions) {
            return new File(title, maxSizeBytes, enableForUnanswered, extensions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof File)) {
                return false;
            }
            File file = (File) other;
            return L.f(this.title, file.title) && L.f(this.maxSizeBytes, file.maxSizeBytes) && this.enableForUnanswered == file.enableForUnanswered && L.f(this.extensions, file.extensions);
        }

        public final boolean getEnableForUnanswered() {
            return this.enableForUnanswered;
        }

        @l
        public final List<String> getExtensions() {
            return this.extensions;
        }

        @l
        public final Long getMaxSizeBytes() {
            return this.maxSizeBytes;
        }

        @Override // com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            Long l12 = this.maxSizeBytes;
            int i12 = r.i((iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.enableForUnanswered);
            List<String> list = this.extensions;
            return i12 + (list != null ? list.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("File(title=");
            sb2.append(this.title);
            sb2.append(", maxSizeBytes=");
            sb2.append(this.maxSizeBytes);
            sb2.append(", enableForUnanswered=");
            sb2.append(this.enableForUnanswered);
            sb2.append(", extensions=");
            return H.p(sb2, this.extensions, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            Long l12 = this.maxSizeBytes;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeInt(this.enableForUnanswered ? 1 : 0);
            parcel.writeStringList(this.extensions);
        }
    }

    /* compiled from: AttachMenu.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Image;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem;", "", "title", "", AttachMenuItem.ENABLE_FOR_UNANSWERED, "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Image;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Z", "getEnableForUnanswered", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Image extends AttachMenuItem {

        @k
        public static final String KEY = "image";

        @c(AttachMenuItem.ENABLE_FOR_UNANSWERED)
        private final boolean enableForUnanswered;

        @c("title")
        @k
        private final String title;

        @k
        public static final Parcelable.Creator<Image> CREATOR = new Creator();

        /* compiled from: AttachMenu.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Image> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Image createFromParcel(@k Parcel parcel) {
                return new Image(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Image[] newArray(int i12) {
                return new Image[i12];
            }
        }

        public Image(@k String str, boolean z12) {
            super(null);
            this.title = str;
            this.enableForUnanswered = z12;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = image.title;
            }
            if ((i12 & 2) != 0) {
                z12 = image.enableForUnanswered;
            }
            return image.copy(str, z12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnableForUnanswered() {
            return this.enableForUnanswered;
        }

        @k
        public final Image copy(@k String title, boolean enableForUnanswered) {
            return new Image(title, enableForUnanswered);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return L.f(this.title, image.title) && this.enableForUnanswered == image.enableForUnanswered;
        }

        public final boolean getEnableForUnanswered() {
            return this.enableForUnanswered;
        }

        @Override // com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enableForUnanswered) + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Image(title=");
            sb2.append(this.title);
            sb2.append(", enableForUnanswered=");
            return r.x(sb2, this.enableForUnanswered, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeInt(this.enableForUnanswered ? 1 : 0);
        }
    }

    /* compiled from: AttachMenu.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Item;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem;", "", "title", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Item;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Item extends AttachMenuItem {

        @k
        public static final String KEY = "item";

        @c("title")
        @k
        private final String title;

        @k
        public static final Parcelable.Creator<Item> CREATOR = new Creator();

        /* compiled from: AttachMenu.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Item createFromParcel(@k Parcel parcel) {
                return new Item(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Item[] newArray(int i12) {
                return new Item[i12];
            }
        }

        public Item(@k String str) {
            super(null);
            this.title = str;
        }

        public static /* synthetic */ Item copy$default(Item item, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = item.title;
            }
            return item.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final Item copy(@k String title) {
            return new Item(title);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Item) && L.f(this.title, ((Item) other).title);
        }

        @Override // com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("Item(title="), this.title, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
        }
    }

    /* compiled from: AttachMenu.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Location;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem;", "", "title", "", AttachMenuItem.ENABLE_FOR_UNANSWERED, "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Location;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Z", "getEnableForUnanswered", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Location extends AttachMenuItem {

        @k
        public static final String KEY = "location";

        @c(AttachMenuItem.ENABLE_FOR_UNANSWERED)
        private final boolean enableForUnanswered;

        @c("title")
        @k
        private final String title;

        @k
        public static final Parcelable.Creator<Location> CREATOR = new Creator();

        /* compiled from: AttachMenu.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Location> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Location createFromParcel(@k Parcel parcel) {
                return new Location(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Location[] newArray(int i12) {
                return new Location[i12];
            }
        }

        public Location(@k String str, boolean z12) {
            super(null);
            this.title = str;
            this.enableForUnanswered = z12;
        }

        public static /* synthetic */ Location copy$default(Location location, String str, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = location.title;
            }
            if ((i12 & 2) != 0) {
                z12 = location.enableForUnanswered;
            }
            return location.copy(str, z12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnableForUnanswered() {
            return this.enableForUnanswered;
        }

        @k
        public final Location copy(@k String title, boolean enableForUnanswered) {
            return new Location(title, enableForUnanswered);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Location)) {
                return false;
            }
            Location location = (Location) other;
            return L.f(this.title, location.title) && this.enableForUnanswered == location.enableForUnanswered;
        }

        public final boolean getEnableForUnanswered() {
            return this.enableForUnanswered;
        }

        @Override // com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enableForUnanswered) + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Location(title=");
            sb2.append(this.title);
            sb2.append(", enableForUnanswered=");
            return r.x(sb2, this.enableForUnanswered, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeInt(this.enableForUnanswered ? 1 : 0);
        }
    }

    /* compiled from: AttachMenu.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Replies;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem;", "", "title", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Replies;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Replies extends AttachMenuItem {

        @k
        public static final String DEFAULT_TITLE = "Быстрые ответы";

        @k
        public static final String KEY = "replies";

        @c("title")
        @k
        private final String title;

        @k
        public static final Parcelable.Creator<Replies> CREATOR = new Creator();

        /* compiled from: AttachMenu.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Replies> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Replies createFromParcel(@k Parcel parcel) {
                return new Replies(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Replies[] newArray(int i12) {
                return new Replies[i12];
            }
        }

        public Replies(@k String str) {
            super(null);
            this.title = str;
        }

        public static /* synthetic */ Replies copy$default(Replies replies, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = replies.title;
            }
            return replies.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final Replies copy(@k String title) {
            return new Replies(title);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Replies) && L.f(this.title, ((Replies) other).title);
        }

        @Override // com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("Replies(title="), this.title, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
        }
    }

    /* compiled from: AttachMenu.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Support;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem;", "", "title", "", AttachMenuItem.ENABLE_FOR_UNANSWERED, "message", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZLjava/lang/String;)Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Support;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Z", "getEnableForUnanswered", "getMessage", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Support extends AttachMenuItem {

        @k
        public static final String KEY = "support";

        @k
        public static final String MESSAGE = "message";

        @c(AttachMenuItem.ENABLE_FOR_UNANSWERED)
        private final boolean enableForUnanswered;

        @c("message")
        @k
        private final String message;

        @c("title")
        @k
        private final String title;

        @k
        public static final Parcelable.Creator<Support> CREATOR = new Creator();

        /* compiled from: AttachMenu.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Support> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Support createFromParcel(@k Parcel parcel) {
                return new Support(parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Support[] newArray(int i12) {
                return new Support[i12];
            }
        }

        public Support(@k String str, boolean z12, @k String str2) {
            super(null);
            this.title = str;
            this.enableForUnanswered = z12;
            this.message = str2;
        }

        public static /* synthetic */ Support copy$default(Support support, String str, boolean z12, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = support.title;
            }
            if ((i12 & 2) != 0) {
                z12 = support.enableForUnanswered;
            }
            if ((i12 & 4) != 0) {
                str2 = support.message;
            }
            return support.copy(str, z12, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnableForUnanswered() {
            return this.enableForUnanswered;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @k
        public final Support copy(@k String title, boolean enableForUnanswered, @k String message) {
            return new Support(title, enableForUnanswered, message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Support)) {
                return false;
            }
            Support support = (Support) other;
            return L.f(this.title, support.title) && this.enableForUnanswered == support.enableForUnanswered && L.f(this.message, support.message);
        }

        public final boolean getEnableForUnanswered() {
            return this.enableForUnanswered;
        }

        @k
        public final String getMessage() {
            return this.message;
        }

        @Override // com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.message.hashCode() + r.i(this.title.hashCode() * 31, 31, this.enableForUnanswered);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Support(title=");
            sb2.append(this.title);
            sb2.append(", enableForUnanswered=");
            sb2.append(this.enableForUnanswered);
            sb2.append(", message=");
            return C22026a.c(sb2, this.message, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeInt(this.enableForUnanswered ? 1 : 0);
            parcel.writeString(this.message);
        }
    }

    /* compiled from: AttachMenu.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001*B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b)\u0010\u0010¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Video;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem;", "", "title", "", AttachMenuItem.ENABLE_FOR_UNANSWERED, "", "maxSizeBytes", Video.MAX_DURATION_SEC, "<init>", "(Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/lang/Long;", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;)Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Video;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Z", "getEnableForUnanswered", "Ljava/lang/Long;", "getMaxSizeBytes", "getMaxDurationSec", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Video extends AttachMenuItem {

        @k
        public static final String KEY = "video";

        @k
        public static final String MAX_DURATION_SEC = "maxDurationSec";

        @k
        public static final String MAX_SIZE_BYTES = "maxSizeBytes";

        @c(AttachMenuItem.ENABLE_FOR_UNANSWERED)
        private final boolean enableForUnanswered;

        @c(MAX_DURATION_SEC)
        @l
        private final Long maxDurationSec;

        @c("maxSizeBytes")
        @l
        private final Long maxSizeBytes;

        @c("title")
        @k
        private final String title;

        @k
        public static final Parcelable.Creator<Video> CREATOR = new Creator();

        /* compiled from: AttachMenu.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Video> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Video createFromParcel(@k Parcel parcel) {
                return new Video(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Video[] newArray(int i12) {
                return new Video[i12];
            }
        }

        public Video(@k String str, boolean z12, @l Long l12, @l Long l13) {
            super(null);
            this.title = str;
            this.enableForUnanswered = z12;
            this.maxSizeBytes = l12;
            this.maxDurationSec = l13;
        }

        public static /* synthetic */ Video copy$default(Video video, String str, boolean z12, Long l12, Long l13, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = video.title;
            }
            if ((i12 & 2) != 0) {
                z12 = video.enableForUnanswered;
            }
            if ((i12 & 4) != 0) {
                l12 = video.maxSizeBytes;
            }
            if ((i12 & 8) != 0) {
                l13 = video.maxDurationSec;
            }
            return video.copy(str, z12, l12, l13);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnableForUnanswered() {
            return this.enableForUnanswered;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Long getMaxSizeBytes() {
            return this.maxSizeBytes;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Long getMaxDurationSec() {
            return this.maxDurationSec;
        }

        @k
        public final Video copy(@k String title, boolean enableForUnanswered, @l Long maxSizeBytes, @l Long maxDurationSec) {
            return new Video(title, enableForUnanswered, maxSizeBytes, maxDurationSec);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Video)) {
                return false;
            }
            Video video = (Video) other;
            return L.f(this.title, video.title) && this.enableForUnanswered == video.enableForUnanswered && L.f(this.maxSizeBytes, video.maxSizeBytes) && L.f(this.maxDurationSec, video.maxDurationSec);
        }

        public final boolean getEnableForUnanswered() {
            return this.enableForUnanswered;
        }

        @l
        public final Long getMaxDurationSec() {
            return this.maxDurationSec;
        }

        @l
        public final Long getMaxSizeBytes() {
            return this.maxSizeBytes;
        }

        @Override // com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int i12 = r.i(this.title.hashCode() * 31, 31, this.enableForUnanswered);
            Long l12 = this.maxSizeBytes;
            int iHashCode = (i12 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.maxDurationSec;
            return iHashCode + (l13 != null ? l13.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Video(title=");
            sb2.append(this.title);
            sb2.append(", enableForUnanswered=");
            sb2.append(this.enableForUnanswered);
            sb2.append(", maxSizeBytes=");
            sb2.append(this.maxSizeBytes);
            sb2.append(", maxDurationSec=");
            return m.m(sb2, this.maxDurationSec, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeInt(this.enableForUnanswered ? 1 : 0);
            Long l12 = this.maxSizeBytes;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            Long l13 = this.maxDurationSec;
            if (l13 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l13);
            }
        }
    }

    /* compiled from: AttachMenu.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Voice;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem;", "", "title", "", AttachMenuItem.ENABLE_FOR_UNANSWERED, "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Voice;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Z", "getEnableForUnanswered", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Voice extends AttachMenuItem {

        @k
        public static final String KEY = "voice";

        @c(AttachMenuItem.ENABLE_FOR_UNANSWERED)
        private final boolean enableForUnanswered;

        @c("title")
        @k
        private final String title;

        @k
        public static final Parcelable.Creator<Voice> CREATOR = new Creator();

        /* compiled from: AttachMenu.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Voice> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Voice createFromParcel(@k Parcel parcel) {
                return new Voice(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Voice[] newArray(int i12) {
                return new Voice[i12];
            }
        }

        public Voice(@k String str, boolean z12) {
            super(null);
            this.title = str;
            this.enableForUnanswered = z12;
        }

        public static /* synthetic */ Voice copy$default(Voice voice, String str, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = voice.title;
            }
            if ((i12 & 2) != 0) {
                z12 = voice.enableForUnanswered;
            }
            return voice.copy(str, z12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnableForUnanswered() {
            return this.enableForUnanswered;
        }

        @k
        public final Voice copy(@k String title, boolean enableForUnanswered) {
            return new Voice(title, enableForUnanswered);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Voice)) {
                return false;
            }
            Voice voice = (Voice) other;
            return L.f(this.title, voice.title) && this.enableForUnanswered == voice.enableForUnanswered;
        }

        public final boolean getEnableForUnanswered() {
            return this.enableForUnanswered;
        }

        @Override // com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem
        @k
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enableForUnanswered) + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Voice(title=");
            sb2.append(this.title);
            sb2.append(", enableForUnanswered=");
            return r.x(sb2, this.enableForUnanswered, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeInt(this.enableForUnanswered ? 1 : 0);
        }
    }

    public /* synthetic */ AttachMenuItem(C42822w c42822w) {
        this();
    }

    @k
    public abstract String getTitle();

    private AttachMenuItem() {
    }
}
