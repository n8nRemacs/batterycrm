package NZ0;

import android.net.Uri;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.internal.mlkit_common.zzy;
import com.google.android.gms.internal.mlkit_common.zzz;
import j.N;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final String f11594a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f11595b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final Uri f11596c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11597d;

    /* compiled from: com.google.mlkit:common@@18.10.0 */
    public static class a {
    }

    public /* synthetic */ c(String str, String str2, Uri uri, boolean z12, i iVar) {
        this.f11594a = str;
        this.f11595b = str2;
        this.f11596c = uri;
        this.f11597d = z12;
    }

    public final boolean equals(@P Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C36727t.a(this.f11594a, cVar.f11594a) && C36727t.a(this.f11595b, cVar.f11595b) && C36727t.a(this.f11596c, cVar.f11596c) && this.f11597d == cVar.f11597d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11594a, this.f11595b, this.f11596c, Boolean.valueOf(this.f11597d)});
    }

    @N
    public final String toString() {
        zzy zzyVarZza = zzz.zza(this);
        zzyVarZza.zza("absoluteFilePath", this.f11594a);
        zzyVarZza.zza("assetFilePath", this.f11595b);
        zzyVarZza.zza(TooltipAttribute.PARAM_DEEP_LINK, this.f11596c);
        zzyVarZza.zzb("isManifestFile", this.f11597d);
        return zzyVarZza.toString();
    }
}
