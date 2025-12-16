package com.avito.android.remote.model.text;

import Y61.k;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Attribute.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/text/Attribute;", "Landroid/os/Parcelable;", "()V", "name", "", "getName", "()Ljava/lang/String;", "title", "getTitle", "describeContents", "", "Lcom/avito/android/remote/model/text/BadgeAttribute;", "Lcom/avito/android/remote/model/text/ParametersAttribute;", "Lcom/avito/android/remote/model/text/SpacerAttribute;", "Lcom/avito/android/remote/model/text/TooltipAttribute;", "Lcom/avito/android/remote/model/text/UnknownAttribute;", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class Attribute implements Parcelable {
    public /* synthetic */ Attribute(C42822w c42822w) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public abstract String getName();

    @k
    public abstract String getTitle();

    private Attribute() {
    }
}
