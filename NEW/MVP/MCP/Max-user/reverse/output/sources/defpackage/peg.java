package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
public final class peg extends u08 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qeg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ peg(qeg qegVar, int i) {
        super(0);
        this.a = i;
        this.b = qegVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        String strVersionName;
        switch (this.a) {
            case 0:
                qeg qegVar = this.b;
                String str = qegVar.a;
                seg segVarA = qegVar.a();
                if (segVarA == null || (strVersionName = segVarA.versionName()) == null) {
                    strVersionName = "NA";
                }
                seg segVarA2 = qegVar.a();
                String strBuildUuid = segVarA2 != null ? segVarA2.buildUuid() : null;
                seg segVarA3 = qegVar.a();
                return new meg(str, strVersionName, strBuildUuid, segVarA3 != null ? segVarA3.environment() : null);
            default:
                String str2 = this.b.a;
                try {
                    return nfi.e(str2);
                } catch (Exception unused) {
                    Log.e("Tracer", "Could not find manifest for library ".concat(str2));
                    return null;
                }
        }
    }
}
