package com.avito.android.str_booking.network.models.common;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Button.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017BG\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/avito/android/str_booking/network/models/common/ButtonAction;", "Landroid/os/Parcelable;", "", "", "content", ContextActionHandler.Link.URL, "Lcom/avito/android/str_booking/network/models/common/Prompt;", "prompt", "redirect", "href", "<init>", "(Ljava/util/Map;Ljava/lang/String;Lcom/avito/android/str_booking/network/models/common/Prompt;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Lcom/avito/android/str_booking/network/models/common/Prompt;", "e", "()Lcom/avito/android/str_booking/network/models/common/Prompt;", "f", "d", "a", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ButtonAction implements Parcelable {

    @k
    public static final Parcelable.Creator<ButtonAction> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f285860b;

    @c("content")
    @l
    private final Map<String, String> content;

    @c("href")
    @l
    private final String href;

    @c("prompt")
    @l
    private final Prompt prompt;

    @c("redirect")
    @l
    private final String redirect;

    @c(ContextActionHandler.Link.URL)
    @l
    private final String url;

    /* compiled from: Button.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_booking/network/models/common/ButtonAction$a;", "", "<init>", "()V", "", "ID_KEY", "Ljava/lang/String;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Button.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ButtonAction> {
        @Override // android.os.Parcelable.Creator
        public final ButtonAction createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ButtonAction(linkedHashMap, parcel.readString(), parcel.readInt() != 0 ? Prompt.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonAction[] newArray(int i12) {
            return new ButtonAction[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public ButtonAction(@l Map<String, String> map, @l String str, @l Prompt prompt, @l String str2, @l String str3) {
        this.content = map;
        this.url = str;
        this.prompt = prompt;
        this.redirect = str2;
        this.href = str3;
        this.f285860b = map != null ? map.get("id") : null;
    }

    @l
    public final Map<String, String> c() {
        return this.content;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getHref() {
        return this.href;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Prompt getPrompt() {
        return this.prompt;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonAction)) {
            return false;
        }
        ButtonAction buttonAction = (ButtonAction) obj;
        return L.f(this.content, buttonAction.content) && L.f(this.url, buttonAction.url) && L.f(this.prompt, buttonAction.prompt) && L.f(this.redirect, buttonAction.redirect) && L.f(this.href, buttonAction.href);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getRedirect() {
        return this.redirect;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        Map<String, String> map = this.content;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Prompt prompt = this.prompt;
        int iHashCode3 = (iHashCode2 + (prompt == null ? 0 : prompt.hashCode())) * 31;
        String str2 = this.redirect;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.href;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonAction(content=");
        sb2.append(this.content);
        sb2.append(", url=");
        sb2.append(this.url);
        sb2.append(", prompt=");
        sb2.append(this.prompt);
        sb2.append(", redirect=");
        sb2.append(this.redirect);
        sb2.append(", href=");
        return C22026a.c(sb2, this.href, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Map<String, String> map = this.content;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.url);
        Prompt prompt = this.prompt;
        if (prompt == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            prompt.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.redirect);
        parcel.writeString(this.href);
    }
}
