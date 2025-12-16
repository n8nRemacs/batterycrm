package HA;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectionUserInput.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHA/g;", "", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f6973a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f6974b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6975c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f6976d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UploadImage.ImageFromPhotoPicker f6977e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6978f;

    public g() {
        this(null, null, false, null, null, false, 63, null);
    }

    public static g a(g gVar, String str, String str2, boolean z12, Boolean bool, UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, int i12) {
        if ((i12 & 1) != 0) {
            str = gVar.f6973a;
        }
        String str3 = str;
        if ((i12 & 2) != 0) {
            str2 = gVar.f6974b;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            z12 = gVar.f6975c;
        }
        boolean z13 = z12;
        if ((i12 & 8) != 0) {
            bool = gVar.f6976d;
        }
        Boolean bool2 = bool;
        if ((i12 & 16) != 0) {
            imageFromPhotoPicker = gVar.f6977e;
        }
        UploadImage.ImageFromPhotoPicker imageFromPhotoPicker2 = imageFromPhotoPicker;
        boolean z14 = (i12 & 32) != 0 ? gVar.f6978f : true;
        gVar.getClass();
        return new g(str3, str4, z13, bool2, imageFromPhotoPicker2, z14);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f6973a, gVar.f6973a) && L.f(this.f6974b, gVar.f6974b) && this.f6975c == gVar.f6975c && L.f(this.f6976d, gVar.f6976d) && L.f(this.f6977e, gVar.f6977e) && this.f6978f == gVar.f6978f;
    }

    public final int hashCode() {
        int iHashCode = this.f6973a.hashCode() * 31;
        String str = this.f6974b;
        int i12 = r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f6975c);
        Boolean bool = this.f6976d;
        int iHashCode2 = (i12 + (bool == null ? 0 : bool.hashCode())) * 31;
        UploadImage.ImageFromPhotoPicker imageFromPhotoPicker = this.f6977e;
        return Boolean.hashCode(this.f6978f) + ((iHashCode2 + (imageFromPhotoPicker != null ? imageFromPhotoPicker.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionUserInput(name=");
        sb2.append(this.f6973a);
        sb2.append(", savedName=");
        sb2.append(this.f6974b);
        sb2.append(", isPublic=");
        sb2.append(this.f6975c);
        sb2.append(", savedIsPublic=");
        sb2.append(this.f6976d);
        sb2.append(", selectedImage=");
        sb2.append(this.f6977e);
        sb2.append(", imageWasChanged=");
        return r.x(sb2, this.f6978f, ')');
    }

    public g(@k String str, @l String str2, boolean z12, @l Boolean bool, @l UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, boolean z13) {
        this.f6973a = str;
        this.f6974b = str2;
        this.f6975c = z12;
        this.f6976d = bool;
        this.f6977e = imageFromPhotoPicker;
        this.f6978f = z13;
    }

    public /* synthetic */ g(String str, String str2, boolean z12, Boolean bool, UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? true : z12, (i12 & 8) != 0 ? null : bool, (i12 & 16) == 0 ? imageFromPhotoPicker : null, (i12 & 32) != 0 ? false : z13);
    }
}
