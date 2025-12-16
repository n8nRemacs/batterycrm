package com.vk.id.internal.api.dto;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VKIDUserInfoPayload.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/vk/id/internal/api/dto/VKIDUserInfoPayload;", "", "", "firstName", "lastName", "phone", "avatar", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFirstName", "getLastName", "getPhone", "getAvatar", "getEmail", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class VKIDUserInfoPayload {

    @k
    private final String avatar;

    @k
    private final String email;

    @k
    private final String firstName;

    @k
    private final String lastName;

    @k
    private final String phone;

    public VKIDUserInfoPayload(@k String str, @k String str2, @k String str3, @k String str4, @k String str5) {
        this.firstName = str;
        this.lastName = str2;
        this.phone = str3;
        this.avatar = str4;
        this.email = str5;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VKIDUserInfoPayload)) {
            return false;
        }
        VKIDUserInfoPayload vKIDUserInfoPayload = (VKIDUserInfoPayload) other;
        return L.f(this.firstName, vKIDUserInfoPayload.firstName) && L.f(this.lastName, vKIDUserInfoPayload.lastName) && L.f(this.phone, vKIDUserInfoPayload.phone) && L.f(this.avatar, vKIDUserInfoPayload.avatar) && L.f(this.email, vKIDUserInfoPayload.email);
    }

    @k
    public final String getAvatar() {
        return this.avatar;
    }

    @k
    public final String getEmail() {
        return this.email;
    }

    @k
    public final String getFirstName() {
        return this.firstName;
    }

    @k
    public final String getLastName() {
        return this.lastName;
    }

    @k
    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        return this.email.hashCode() + H.d(H.d(H.d(this.firstName.hashCode() * 31, 31, this.lastName), 31, this.phone), 31, this.avatar);
    }

    @k
    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.phone;
        String str4 = this.avatar;
        String str5 = this.email;
        StringBuilder sbB = C23088b.b("VKIDUserInfoPayload(firstName=", str, ", lastName=", str2, ", phone=");
        m.p(sbB, str3, ", avatar=", str4, ", email=");
        return c.s(sbB, str5, ")");
    }
}
