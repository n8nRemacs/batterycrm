package com.avito.android.credits.web_handler.post_message;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RedirectPostMessage.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/credits/web_handler/post_message/RedirectPostMessage;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", ContextActionHandler.Link.URL, "", "closeScreen", "<init>", "(Landroid/net/Uri;Ljava/lang/Boolean;)V", "Landroid/net/Uri;", "d", "()Landroid/net/Uri;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RedirectPostMessage implements Parcelable {

    @k
    public static final Parcelable.Creator<RedirectPostMessage> CREATOR = new a();

    @c("closeScreen")
    @l
    private final Boolean closeScreen;

    @c(ContextActionHandler.Link.URL)
    @l
    private final Uri url;

    /* compiled from: RedirectPostMessage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RedirectPostMessage> {
        @Override // android.os.Parcelable.Creator
        public final RedirectPostMessage createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Uri uri = (Uri) parcel.readParcelable(RedirectPostMessage.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RedirectPostMessage(uri, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final RedirectPostMessage[] newArray(int i12) {
            return new RedirectPostMessage[i12];
        }
    }

    public RedirectPostMessage(@l Uri uri, @l Boolean bool) {
        this.url = uri;
        this.closeScreen = bool;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Boolean getCloseScreen() {
        return this.closeScreen;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Uri getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedirectPostMessage)) {
            return false;
        }
        RedirectPostMessage redirectPostMessage = (RedirectPostMessage) obj;
        return L.f(this.url, redirectPostMessage.url) && L.f(this.closeScreen, redirectPostMessage.closeScreen);
    }

    public final int hashCode() {
        Uri uri = this.url;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        Boolean bool = this.closeScreen;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RedirectPostMessage(url=");
        sb2.append(this.url);
        sb2.append(", closeScreen=");
        return C0.g(sb2, this.closeScreen, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.url, i12);
        Boolean bool = this.closeScreen;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
