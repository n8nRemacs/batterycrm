package com.avito.android.str_booking.network.models.common;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Button.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/str_booking/network/models/common/Prompt;", "Landroid/os/Parcelable;", "", "approve", "cancel", "header", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;", "analytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/Map;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "f", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "a", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Prompt implements Parcelable {

    @k
    public static final Parcelable.Creator<Prompt> CREATOR;

    @c("analytics")
    @l
    private final Map<String, SuggestAnalyticsEvent> analytics;

    @c("approve")
    @l
    private final String approve;

    @c("cancel")
    @l
    private final String cancel;

    @c("description")
    @l
    private final AttributedText description;

    @c("header")
    @l
    private final String header;

    /* compiled from: Button.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/str_booking/network/models/common/Prompt$a;", "", "<init>", "()V", "", "APPROVE_KEY", "Ljava/lang/String;", "CANCEL_KEY", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Button.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Prompt> {
        @Override // android.os.Parcelable.Creator
        public final Prompt createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(Prompt.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = f.c(Prompt.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Prompt(string, string2, string3, attributedText, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Prompt[] newArray(int i12) {
            return new Prompt[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public Prompt(@l String str, @l String str2, @l String str3, @l AttributedText attributedText, @l Map<String, SuggestAnalyticsEvent> map) {
        this.approve = str;
        this.cancel = str2;
        this.header = str3;
        this.description = attributedText;
        this.analytics = map;
    }

    @l
    public final Map<String, SuggestAnalyticsEvent> c() {
        return this.analytics;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getApprove() {
        return this.approve;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getCancel() {
        return this.cancel;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Prompt)) {
            return false;
        }
        Prompt prompt = (Prompt) obj;
        return L.f(this.approve, prompt.approve) && L.f(this.cancel, prompt.cancel) && L.f(this.header, prompt.header) && L.f(this.description, prompt.description) && L.f(this.analytics, prompt.analytics);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    public final int hashCode() {
        String str = this.approve;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cancel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.header;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AttributedText attributedText = this.description;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Map<String, SuggestAnalyticsEvent> map = this.analytics;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Prompt(approve=");
        sb2.append(this.approve);
        sb2.append(", cancel=");
        sb2.append(this.cancel);
        sb2.append(", header=");
        sb2.append(this.header);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", analytics=");
        return r.w(sb2, this.analytics, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.approve);
        parcel.writeString(this.cancel);
        parcel.writeString(this.header);
        parcel.writeParcelable(this.description, i12);
        Map<String, SuggestAnalyticsEvent> map = this.analytics;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i12);
        }
    }
}
