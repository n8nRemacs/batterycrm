package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaTeaserItemResponse.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserGallery;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/autotekateaser/UserData;", "userData", "Lcom/avito/android/remote/model/autotekateaser/MiniGallery;", "mini", "Lcom/avito/android/remote/model/autotekateaser/FullGallery;", "full", "<init>", "(Lcom/avito/android/remote/model/autotekateaser/UserData;Lcom/avito/android/remote/model/autotekateaser/MiniGallery;Lcom/avito/android/remote/model/autotekateaser/FullGallery;)V", "component1", "()Lcom/avito/android/remote/model/autotekateaser/UserData;", "component2", "()Lcom/avito/android/remote/model/autotekateaser/MiniGallery;", "component3", "()Lcom/avito/android/remote/model/autotekateaser/FullGallery;", "copy", "(Lcom/avito/android/remote/model/autotekateaser/UserData;Lcom/avito/android/remote/model/autotekateaser/MiniGallery;Lcom/avito/android/remote/model/autotekateaser/FullGallery;)Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserGallery;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/autotekateaser/UserData;", "getUserData", "Lcom/avito/android/remote/model/autotekateaser/MiniGallery;", "getMini", "Lcom/avito/android/remote/model/autotekateaser/FullGallery;", "getFull", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaTeaserGallery implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaTeaserGallery> CREATOR = new Creator();

    @c("full")
    @k
    private final FullGallery full;

    @c("mini")
    @k
    private final MiniGallery mini;

    @c("userData")
    @k
    private final UserData userData;

    /* compiled from: AutotekaTeaserItemResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutotekaTeaserGallery> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaTeaserGallery createFromParcel(@k Parcel parcel) {
            return new AutotekaTeaserGallery(UserData.CREATOR.createFromParcel(parcel), MiniGallery.CREATOR.createFromParcel(parcel), FullGallery.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaTeaserGallery[] newArray(int i12) {
            return new AutotekaTeaserGallery[i12];
        }
    }

    public AutotekaTeaserGallery(@k UserData userData, @k MiniGallery miniGallery, @k FullGallery fullGallery) {
        this.userData = userData;
        this.mini = miniGallery;
        this.full = fullGallery;
    }

    public static /* synthetic */ AutotekaTeaserGallery copy$default(AutotekaTeaserGallery autotekaTeaserGallery, UserData userData, MiniGallery miniGallery, FullGallery fullGallery, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            userData = autotekaTeaserGallery.userData;
        }
        if ((i12 & 2) != 0) {
            miniGallery = autotekaTeaserGallery.mini;
        }
        if ((i12 & 4) != 0) {
            fullGallery = autotekaTeaserGallery.full;
        }
        return autotekaTeaserGallery.copy(userData, miniGallery, fullGallery);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final UserData getUserData() {
        return this.userData;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final MiniGallery getMini() {
        return this.mini;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final FullGallery getFull() {
        return this.full;
    }

    @k
    public final AutotekaTeaserGallery copy(@k UserData userData, @k MiniGallery mini, @k FullGallery full) {
        return new AutotekaTeaserGallery(userData, mini, full);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotekaTeaserGallery)) {
            return false;
        }
        AutotekaTeaserGallery autotekaTeaserGallery = (AutotekaTeaserGallery) other;
        return L.f(this.userData, autotekaTeaserGallery.userData) && L.f(this.mini, autotekaTeaserGallery.mini) && L.f(this.full, autotekaTeaserGallery.full);
    }

    @k
    public final FullGallery getFull() {
        return this.full;
    }

    @k
    public final MiniGallery getMini() {
        return this.mini;
    }

    @k
    public final UserData getUserData() {
        return this.userData;
    }

    public int hashCode() {
        return this.full.hashCode() + ((this.mini.hashCode() + (this.userData.hashCode() * 31)) * 31);
    }

    @k
    public String toString() {
        return "AutotekaTeaserGallery(userData=" + this.userData + ", mini=" + this.mini + ", full=" + this.full + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.userData.writeToParcel(parcel, flags);
        this.mini.writeToParcel(parcel, flags);
        this.full.writeToParcel(parcel, flags);
    }
}
