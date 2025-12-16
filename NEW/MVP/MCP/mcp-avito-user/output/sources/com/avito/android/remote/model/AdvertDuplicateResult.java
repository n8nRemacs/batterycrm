package com.avito.android.remote.model;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.o1;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import com.avito.android.util.J3;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AdvertDuplicateResult.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \"2\u00020\u0001:\u0001\"B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b!\u0010\u0018¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/AdvertDuplicateResult;", "Landroid/os/Parcelable;", "", "title", "description", "hint", "Lcom/avito/android/remote/model/SerpAdvert;", "item", "Lcom/avito/android/remote/model/Action;", "action", "skipActionTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/SerpAdvert;Lcom/avito/android/remote/model/Action;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "getHint", "Lcom/avito/android/remote/model/SerpAdvert;", "getItem", "()Lcom/avito/android/remote/model/SerpAdvert;", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "getSkipActionTitle", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertDuplicateResult implements Parcelable {

    @f
    @k
    public static final Parcelable.Creator<AdvertDuplicateResult> CREATOR;

    @c("action")
    @k
    private final Action action;

    @c("description")
    @k
    private final String description;

    @c("hint")
    @l
    private final String hint;

    @c("item")
    @k
    private final SerpAdvert item;

    @c("skipActionTitle")
    @k
    private final String skipActionTitle;

    @c("title")
    @k
    private final String title;

    static {
        AdvertDuplicateResult$Companion$CREATOR$1 advertDuplicateResult$Companion$CREATOR$1 = AdvertDuplicateResult$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(advertDuplicateResult$Companion$CREATOR$1);
    }

    public AdvertDuplicateResult(@k String str, @k String str2, @l String str3, @k SerpAdvert serpAdvert, @k Action action, @k String str4) {
        this.title = str;
        this.description = str2;
        this.hint = str3;
        this.item = serpAdvert;
        this.action = action;
        this.skipActionTitle = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final Action getAction() {
        return this.action;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getHint() {
        return this.hint;
    }

    @k
    public final SerpAdvert getItem() {
        return this.item;
    }

    @k
    public final String getSkipActionTitle() {
        return this.skipActionTitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.description);
        String str = this.hint;
        o1<ClassLoader, o1<String, Parcelable.Creator<?>>> o1Var = J3.f318636a;
        dest.writeValue(str);
        dest.writeParcelable(this.item, flags);
        dest.writeParcelable(this.action, flags);
        dest.writeString(this.skipActionTitle);
    }
}
