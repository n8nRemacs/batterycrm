package com.avito.android.player.router;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.player.PlayerAnalyticsParameters;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.Image;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PlayerArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/router/PlayerArguments;", "Lcom/avito/android/util/OpenParams;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PlayerArguments implements OpenParams {

    @k
    public static final Parcelable.Creator<PlayerArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f220215b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f220216c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f220217d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f220218e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final TreeClickStreamParent f220219f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ScreenSource f220220g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Integer f220221h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final PlayerAnalyticsParameters f220222i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Image f220223j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Boolean f220224k;

    /* compiled from: PlayerArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PlayerArguments> {
        @Override // android.os.Parcelable.Creator
        public final PlayerArguments createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            TreeClickStreamParent treeClickStreamParent = (TreeClickStreamParent) parcel.readParcelable(PlayerArguments.class.getClassLoader());
            ScreenSource screenSource = (ScreenSource) parcel.readParcelable(PlayerArguments.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            PlayerAnalyticsParameters playerAnalyticsParameters = (PlayerAnalyticsParameters) parcel.readParcelable(PlayerArguments.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(PlayerArguments.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PlayerArguments(string, string2, string3, string4, treeClickStreamParent, screenSource, numValueOf, playerAnalyticsParameters, image, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PlayerArguments[] newArray(int i12) {
            return new PlayerArguments[i12];
        }
    }

    public PlayerArguments(@k String str, @l String str2, @l String str3, @l String str4, @l TreeClickStreamParent treeClickStreamParent, @k ScreenSource screenSource, @l Integer num, @l PlayerAnalyticsParameters playerAnalyticsParameters, @l Image image, @l Boolean bool) {
        this.f220215b = str;
        this.f220216c = str2;
        this.f220217d = str3;
        this.f220218e = str4;
        this.f220219f = treeClickStreamParent;
        this.f220220g = screenSource;
        this.f220221h = num;
        this.f220222i = playerAnalyticsParameters;
        this.f220223j = image;
        this.f220224k = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f220215b);
        parcel.writeString(this.f220216c);
        parcel.writeString(this.f220217d);
        parcel.writeString(this.f220218e);
        parcel.writeParcelable(this.f220219f, i12);
        parcel.writeParcelable(this.f220220g, i12);
        Integer num = this.f220221h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f220222i, i12);
        parcel.writeParcelable(this.f220223j, i12);
        Boolean bool = this.f220224k;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ PlayerArguments(String str, String str2, String str3, String str4, TreeClickStreamParent treeClickStreamParent, ScreenSource screenSource, Integer num, PlayerAnalyticsParameters playerAnalyticsParameters, Image image, Boolean bool, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, treeClickStreamParent, screenSource, num, playerAnalyticsParameters, (i12 & 256) != 0 ? null : image, (i12 & 512) != 0 ? null : bool);
    }
}
