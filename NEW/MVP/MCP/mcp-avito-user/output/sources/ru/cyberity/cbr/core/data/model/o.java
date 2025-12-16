package ru.cyberity.cbr.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DocumentPickerResult.kt */
@K51.d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011Jb\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0011\u00109\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b8\u00103¨\u0006:"}, d2 = {"Lru/cyberity/cbr/core/data/model/o;", "Landroid/os/Parcelable;", "Ljava/io/File;", "document", "raw", "", "country", "type", "Lru/cyberity/cbr/core/data/model/IdentitySide;", "side", "", "sent", "Lru/cyberity/ml/badphotos/models/b;", "photoQualityResult", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/IdentitySide;ZLru/cyberity/ml/badphotos/models/b;)V", "toString", "()Ljava/lang/String;", "a", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/IdentitySide;ZLru/cyberity/ml/badphotos/models/b;)Lru/cyberity/cbr/core/data/model/o;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/io/File;", "i", "()Ljava/io/File;", "b", "k", "c", "Ljava/lang/String;", "h", "d", "n", "e", "Lru/cyberity/cbr/core/data/model/IdentitySide;", "m", "()Lru/cyberity/cbr/core/data/model/IdentitySide;", "f", "Z", "l", "()Z", "g", "Lru/cyberity/ml/badphotos/models/b;", "j", "()Lru/cyberity/ml/badphotos/models/b;", "o", "isEmpty", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class o implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final File document;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final File raw;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String country;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String type;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final IdentitySide side;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean sent;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final ru.cyberity.ml.badphotos.models.b photoQualityResult;

    /* compiled from: DocumentPickerResult.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o createFromParcel(@Y61.k Parcel parcel) {
            return new o((File) parcel.readSerializable(), (File) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : IdentitySide.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0 ? ru.cyberity.ml.badphotos.models.b.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o[] newArray(int i12) {
            return new o[i12];
        }
    }

    public o() {
        this(null, null, null, null, null, false, null, 127, null);
    }

    @Y61.k
    public final o a(@Y61.l File document, @Y61.l File raw, @Y61.l String country, @Y61.l String type, @Y61.l IdentitySide side, boolean sent, @Y61.l ru.cyberity.ml.badphotos.models.b photoQualityResult) {
        return new o(document, raw, country, type, side, sent, photoQualityResult);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof o)) {
            return false;
        }
        o oVar = (o) other;
        return L.f(this.document, oVar.document) && L.f(this.raw, oVar.raw) && L.f(this.country, oVar.country) && L.f(this.type, oVar.type) && this.side == oVar.side && this.sent == oVar.sent && L.f(this.photoQualityResult, oVar.photoQualityResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        File file = this.document;
        int iHashCode = (file == null ? 0 : file.hashCode()) * 31;
        File file2 = this.raw;
        int iHashCode2 = (iHashCode + (file2 == null ? 0 : file2.hashCode())) * 31;
        String str = this.country;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IdentitySide identitySide = this.side;
        int iHashCode5 = (iHashCode4 + (identitySide == null ? 0 : identitySide.hashCode())) * 31;
        boolean z12 = this.sent;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int i13 = (iHashCode5 + i12) * 31;
        ru.cyberity.ml.badphotos.models.b bVar = this.photoQualityResult;
        return i13 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final File getDocument() {
        return this.document;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final ru.cyberity.ml.badphotos.models.b getPhotoQualityResult() {
        return this.photoQualityResult;
    }

    @Y61.l
    /* renamed from: k, reason: from getter */
    public final File getRaw() {
        return this.raw;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getSent() {
        return this.sent;
    }

    @Y61.l
    /* renamed from: m, reason: from getter */
    public final IdentitySide getSide() {
        return this.side;
    }

    @Y61.l
    /* renamed from: n, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean o() {
        return this.document == null || this.raw == null;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("type=");
        sb2.append(this.type);
        sb2.append(", document=");
        File file = this.document;
        sb2.append(file != null ? file.getAbsolutePath() : null);
        sb2.append(", raw=");
        File file2 = this.raw;
        sb2.append(file2 != null ? file2.getAbsolutePath() : null);
        sb2.append(", side=");
        IdentitySide identitySide = this.side;
        sb2.append(identitySide != null ? identitySide.getValue() : null);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeSerializable(this.document);
        parcel.writeSerializable(this.raw);
        parcel.writeString(this.country);
        parcel.writeString(this.type);
        IdentitySide identitySide = this.side;
        if (identitySide == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(identitySide.name());
        }
        parcel.writeInt(this.sent ? 1 : 0);
        ru.cyberity.ml.badphotos.models.b bVar = this.photoQualityResult;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, flags);
        }
    }

    public o(@Y61.l File file, @Y61.l File file2, @Y61.l String str, @Y61.l String str2, @Y61.l IdentitySide identitySide, boolean z12, @Y61.l ru.cyberity.ml.badphotos.models.b bVar) {
        this.document = file;
        this.raw = file2;
        this.country = str;
        this.type = str2;
        this.side = identitySide;
        this.sent = z12;
        this.photoQualityResult = bVar;
    }

    public static /* synthetic */ o a(o oVar, File file, File file2, String str, String str2, IdentitySide identitySide, boolean z12, ru.cyberity.ml.badphotos.models.b bVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            file = oVar.document;
        }
        if ((i12 & 2) != 0) {
            file2 = oVar.raw;
        }
        File file3 = file2;
        if ((i12 & 4) != 0) {
            str = oVar.country;
        }
        String str3 = str;
        if ((i12 & 8) != 0) {
            str2 = oVar.type;
        }
        String str4 = str2;
        if ((i12 & 16) != 0) {
            identitySide = oVar.side;
        }
        IdentitySide identitySide2 = identitySide;
        if ((i12 & 32) != 0) {
            z12 = oVar.sent;
        }
        boolean z13 = z12;
        if ((i12 & 64) != 0) {
            bVar = oVar.photoQualityResult;
        }
        return oVar.a(file, file3, str3, str4, identitySide2, z13, bVar);
    }

    public /* synthetic */ o(File file, File file2, String str, String str2, IdentitySide identitySide, boolean z12, ru.cyberity.ml.badphotos.models.b bVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : file, (i12 & 2) != 0 ? null : file2, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : identitySide, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? null : bVar);
    }
}
