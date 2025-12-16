package NZ0;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.mlkit_common.zzy;
import com.google.android.gms.internal.mlkit_common.zzz;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import j.N;
import j.P;
import j.k0;
import java.util.Arrays;
import java.util.EnumMap;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public abstract class d {

    /* renamed from: c, reason: collision with root package name */
    @N
    @k0
    public static final EnumMap f11598c;

    /* renamed from: a, reason: collision with root package name */
    @P
    public final String f11599a;

    /* renamed from: b, reason: collision with root package name */
    public final ModelType f11600b;

    static {
        new EnumMap(BaseModel.class);
        f11598c = new EnumMap(BaseModel.class);
    }

    @RX0.a
    public d(@P String str) {
        ModelType modelType = ModelType.f362327d;
        C36729v.a("One of cloud model name and base model cannot be empty", !TextUtils.isEmpty(str));
        this.f11599a = str;
        this.f11600b = modelType;
    }

    @N
    @RX0.a
    public final String a() {
        String str = this.f11599a;
        return str != null ? str : "COM.GOOGLE.BASE_".concat(String.valueOf((String) f11598c.get(null)));
    }

    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return C36727t.a(this.f11599a, dVar.f11599a) && C36727t.a(null, null) && C36727t.a(this.f11600b, dVar.f11600b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11599a, null, this.f11600b});
    }

    @N
    public final String toString() {
        zzy zzyVarZzb = zzz.zzb("RemoteModel");
        zzyVarZzb.zza("modelName", this.f11599a);
        zzyVarZzb.zza("baseModel", null);
        zzyVarZzb.zza("modelType", this.f11600b);
        return zzyVarZzb.toString();
    }
}
