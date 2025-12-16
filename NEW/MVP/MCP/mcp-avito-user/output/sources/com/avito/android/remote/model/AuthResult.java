package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuthResult.kt */
@InterfaceC19823a
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/AuthResult;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Session;", "session", "Lcom/avito/android/remote/model/Profile;", "profile", "", "message", "Lcom/avito/android/deep_linking/links/DeepLink;", "postAuthAction", "<init>", "(Lcom/avito/android/remote/model/Session;Lcom/avito/android/remote/model/Profile;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/remote/model/Session;", "component2", "()Lcom/avito/android/remote/model/Profile;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/remote/model/Session;Lcom/avito/android/remote/model/Profile;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/AuthResult;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Session;", "getSession", "Lcom/avito/android/remote/model/Profile;", "getProfile", "Ljava/lang/String;", "getMessage", "Lcom/avito/android/deep_linking/links/DeepLink;", "getPostAuthAction", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AuthResult implements Parcelable {

    @k
    public static final Parcelable.Creator<AuthResult> CREATOR = new Creator();

    @l
    private final String message;

    @l
    private final DeepLink postAuthAction;

    @k
    private final Profile profile;

    @k
    private final Session session;

    /* compiled from: AuthResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AuthResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AuthResult createFromParcel(@k Parcel parcel) {
            return new AuthResult(Session.CREATOR.createFromParcel(parcel), Profile.CREATOR.createFromParcel(parcel), parcel.readString(), (DeepLink) parcel.readParcelable(AuthResult.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AuthResult[] newArray(int i12) {
            return new AuthResult[i12];
        }
    }

    public AuthResult(@k Session session, @k Profile profile, @l String str, @l DeepLink deepLink) {
        this.session = session;
        this.profile = profile;
        this.message = str;
        this.postAuthAction = deepLink;
    }

    public static /* synthetic */ AuthResult copy$default(AuthResult authResult, Session session, Profile profile, String str, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            session = authResult.session;
        }
        if ((i12 & 2) != 0) {
            profile = authResult.profile;
        }
        if ((i12 & 4) != 0) {
            str = authResult.message;
        }
        if ((i12 & 8) != 0) {
            deepLink = authResult.postAuthAction;
        }
        return authResult.copy(session, profile, str, deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Session getSession() {
        return this.session;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Profile getProfile() {
        return this.profile;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeepLink getPostAuthAction() {
        return this.postAuthAction;
    }

    @k
    public final AuthResult copy(@k Session session, @k Profile profile, @l String message, @l DeepLink postAuthAction) {
        return new AuthResult(session, profile, message, postAuthAction);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthResult)) {
            return false;
        }
        AuthResult authResult = (AuthResult) other;
        return L.f(this.session, authResult.session) && L.f(this.profile, authResult.profile) && L.f(this.message, authResult.message) && L.f(this.postAuthAction, authResult.postAuthAction);
    }

    @l
    public final String getMessage() {
        return this.message;
    }

    @l
    public final DeepLink getPostAuthAction() {
        return this.postAuthAction;
    }

    @k
    public final Profile getProfile() {
        return this.profile;
    }

    @k
    public final Session getSession() {
        return this.session;
    }

    public int hashCode() {
        int iHashCode = (this.profile.hashCode() + (this.session.hashCode() * 31)) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.postAuthAction;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AuthResult(session=");
        sb2.append(this.session);
        sb2.append(", profile=");
        sb2.append(this.profile);
        sb2.append(", message=");
        sb2.append(this.message);
        sb2.append(", postAuthAction=");
        return a.v(sb2, this.postAuthAction, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.session.writeToParcel(parcel, flags);
        this.profile.writeToParcel(parcel, flags);
        parcel.writeString(this.message);
        parcel.writeParcelable(this.postAuthAction, flags);
    }
}
