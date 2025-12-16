package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaCpoTeaser.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/CpoLogo;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", ContextActionHandler.Link.URL, "", "alt", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "copy", "(Landroid/net/Uri;Ljava/lang/String;)Lcom/avito/android/remote/model/autotekateaser/CpoLogo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/net/Uri;", "getUrl", "Ljava/lang/String;", "getAlt", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CpoLogo implements Parcelable {

    @k
    public static final Parcelable.Creator<CpoLogo> CREATOR = new Creator();

    @c("alt")
    @k
    private final String alt;

    @c(ContextActionHandler.Link.URL)
    @k
    private final Uri url;

    /* compiled from: AutotekaCpoTeaser.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CpoLogo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CpoLogo createFromParcel(@k Parcel parcel) {
            return new CpoLogo((Uri) parcel.readParcelable(CpoLogo.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CpoLogo[] newArray(int i12) {
            return new CpoLogo[i12];
        }
    }

    public CpoLogo(@k Uri uri, @k String str) {
        this.url = uri;
        this.alt = str;
    }

    public static /* synthetic */ CpoLogo copy$default(CpoLogo cpoLogo, Uri uri, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            uri = cpoLogo.url;
        }
        if ((i12 & 2) != 0) {
            str = cpoLogo.alt;
        }
        return cpoLogo.copy(uri, str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Uri getUrl() {
        return this.url;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getAlt() {
        return this.alt;
    }

    @k
    public final CpoLogo copy(@k Uri url, @k String alt) {
        return new CpoLogo(url, alt);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CpoLogo)) {
            return false;
        }
        CpoLogo cpoLogo = (CpoLogo) other;
        return L.f(this.url, cpoLogo.url) && L.f(this.alt, cpoLogo.alt);
    }

    @k
    public final String getAlt() {
        return this.alt;
    }

    @k
    public final Uri getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.alt.hashCode() + (this.url.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CpoLogo(url=");
        sb2.append(this.url);
        sb2.append(", alt=");
        return C22026a.c(sb2, this.alt, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.url, flags);
        parcel.writeString(this.alt);
    }
}
