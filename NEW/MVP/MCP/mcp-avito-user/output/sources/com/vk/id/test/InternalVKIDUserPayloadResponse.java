package com.vk.id.test;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import com.vk.id.common.InternalVKIDApi;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InternalVKIDOverrideApi.kt */
@P
@InternalVKIDApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/vk/id/test/InternalVKIDUserPayloadResponse;", "", "", "firstName", "lastName", "phone", "email", "avatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFirstName", "getLastName", "getPhone", "getEmail", "getAvatar", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InternalVKIDUserPayloadResponse {

    @c("avatar")
    @k
    private final String avatar;

    @c("email")
    @k
    private final String email;

    @c("first_name")
    @k
    private final String firstName;

    @c("last_name")
    @k
    private final String lastName;

    @c("phone")
    @k
    private final String phone;

    public InternalVKIDUserPayloadResponse(@k String str, @k String str2, @k String str3, @k String str4, @k String str5) {
        this.firstName = str;
        this.lastName = str2;
        this.phone = str3;
        this.email = str4;
        this.avatar = str5;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalVKIDUserPayloadResponse)) {
            return false;
        }
        InternalVKIDUserPayloadResponse internalVKIDUserPayloadResponse = (InternalVKIDUserPayloadResponse) other;
        return L.f(this.firstName, internalVKIDUserPayloadResponse.firstName) && L.f(this.lastName, internalVKIDUserPayloadResponse.lastName) && L.f(this.phone, internalVKIDUserPayloadResponse.phone) && L.f(this.email, internalVKIDUserPayloadResponse.email) && L.f(this.avatar, internalVKIDUserPayloadResponse.avatar);
    }

    public int hashCode() {
        return this.avatar.hashCode() + H.d(H.d(H.d(this.firstName.hashCode() * 31, 31, this.lastName), 31, this.phone), 31, this.email);
    }

    @k
    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.phone;
        String str4 = this.email;
        String str5 = this.avatar;
        StringBuilder sbB = C23088b.b("InternalVKIDUserPayloadResponse(firstName=", str, ", lastName=", str2, ", phone=");
        m.p(sbB, str3, ", email=", str4, ", avatar=");
        return AK.c.s(sbB, str5, ")");
    }
}
