package com.avito.android.remote.model.category_parameters;

import X41.f;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: SuggestData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SuggestData;", "Landroid/os/Parcelable;", "", "", "query", ContextActionHandler.Link.URL, "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/util/List;", "getQuery", "()Ljava/util/List;", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes17.dex */
public final class SuggestData implements Parcelable {

    @f
    @k
    public static final Parcelable.Creator<SuggestData> CREATOR;

    @k
    private final List<String> query;

    @k
    private final String url;

    static {
        SuggestData$Companion$CREATOR$1 suggestData$Companion$CREATOR$1 = SuggestData$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(suggestData$Companion$CREATOR$1);
    }

    public SuggestData(@k List<String> list, @k String str) {
        this.query = list;
        this.url = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final List<String> getQuery() {
        return this.query;
    }

    @k
    public final String getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel dest, int flags) {
        dest.writeStringList(this.query);
        dest.writeString(this.url);
    }
}
