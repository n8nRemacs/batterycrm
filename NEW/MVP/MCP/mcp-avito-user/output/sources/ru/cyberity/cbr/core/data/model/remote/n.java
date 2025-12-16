package ru.cyberity.cbr.core.data.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RemoteConfig.kt */
@K51.d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010\u000b¨\u0006!"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/n;", "Landroid/os/Parcelable;", "", "", "placeHolders", "regex", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "a", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "(Ljava/util/List;Ljava/lang/String;)Lru/cyberity/cbr/core/data/model/remote/n;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "c", "Ljava/lang/String;", "d", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class n implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final List<String> placeHolders;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String regex;

    /* compiled from: RemoteConfig.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n createFromParcel(@Y61.k Parcel parcel) {
            return new n(parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n[] newArray(int i12) {
            return new n[i12];
        }
    }

    public n(@Y61.l List<String> list, @Y61.l String str) {
        this.placeHolders = list;
        this.regex = str;
    }

    @Y61.l
    public final List<String> a() {
        return this.placeHolders;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getRegex() {
        return this.regex;
    }

    @Y61.l
    public final List<String> c() {
        return this.placeHolders;
    }

    @Y61.l
    public final String d() {
        return this.regex;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof n)) {
            return false;
        }
        n nVar = (n) other;
        return L.f(this.placeHolders, nVar.placeHolders) && L.f(this.regex, nVar.regex);
    }

    public int hashCode() {
        List<String> list = this.placeHolders;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.regex;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TinInfo(placeHolders=");
        sb2.append(this.placeHolders);
        sb2.append(", regex=");
        return C22026a.c(sb2, this.regex, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeStringList(this.placeHolders);
        parcel.writeString(this.regex);
    }

    @Y61.k
    public final n a(@Y61.l List<String> placeHolders, @Y61.l String regex) {
        return new n(placeHolders, regex);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n a(n nVar, List list, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = nVar.placeHolders;
        }
        if ((i12 & 2) != 0) {
            str = nVar.regex;
        }
        return nVar.a(list, str);
    }
}
