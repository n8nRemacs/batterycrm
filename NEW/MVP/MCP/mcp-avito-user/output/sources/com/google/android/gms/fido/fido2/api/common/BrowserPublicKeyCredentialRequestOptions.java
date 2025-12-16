package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C23088b;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C36749c;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {

    @j.N
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new P();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final PublicKeyCredentialRequestOptions f349743b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    @SafeParcelable.c
    public final Uri f349744c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final byte[] f349745d;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class a {
    }

    @SafeParcelable.b
    public BrowserPublicKeyCredentialRequestOptions(@SafeParcelable.e @j.N PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, @SafeParcelable.e @j.N Uri uri, @SafeParcelable.e @j.P byte[] bArr) {
        C36729v.j(publicKeyCredentialRequestOptions);
        this.f349743b = publicKeyCredentialRequestOptions;
        C36729v.j(uri);
        boolean z12 = true;
        C36729v.a("origin scheme must be non-empty", uri.getScheme() != null);
        C36729v.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f349744c = uri;
        if (bArr != null && bArr.length != 32) {
            z12 = false;
        }
        C36729v.a("clientDataHash must be 32 bytes long", z12);
        this.f349745d = bArr;
    }

    public final boolean equals(@j.N Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        return C36727t.a(this.f349743b, browserPublicKeyCredentialRequestOptions.f349743b) && C36727t.a(this.f349744c, browserPublicKeyCredentialRequestOptions.f349744c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349743b, this.f349744c});
    }

    @j.N
    public final String toString() {
        String strValueOf = String.valueOf(this.f349743b);
        String strValueOf2 = String.valueOf(this.f349744c);
        return AK.c.s(C23088b.b("BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=", strValueOf, ", \n origin=", strValueOf2, ", \n clientDataHash="), C36749c.b(this.f349745d), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 2, this.f349743b, i12, false);
        TX0.a.i(parcel, 3, this.f349744c, i12, false);
        TX0.a.b(parcel, 4, this.f349745d, false);
        TX0.a.p(parcel, iO2);
    }
}
