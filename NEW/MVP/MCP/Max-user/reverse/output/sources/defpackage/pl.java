package defpackage;

import com.my.tracker.applifecycle.o.d;
import com.my.tracker.core.EngineCore;
import java.io.Serializable;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScopeException;

/* loaded from: classes2.dex */
public final /* synthetic */ class pl implements vl, EngineCore.EventPacker {
    public final /* synthetic */ Serializable X;
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Serializable o;

    public /* synthetic */ pl(d dVar, String str, String str2, String str3, String str4, String str5) {
        this.b = dVar;
        this.a = str;
        this.c = str2;
        this.d = str3;
        this.o = str4;
        this.X = str5;
    }

    @Override // defpackage.vl
    public tl d(tl tlVar) {
        tl tlVarC;
        nm nmVar = (nm) this.b;
        ql qlVar = (ql) this.c;
        ApiInvocationException apiInvocationException = (ApiInvocationException) this.d;
        uid uidVar = (uid) this.o;
        uid uidVar2 = (uid) this.X;
        pm pmVar = qlVar.c;
        String str = tlVar.c;
        if (fni.a(str, this.a) && str != null) {
            tlVar = new tl(tlVar.a, tlVar.b, null, null);
        }
        try {
            String str2 = tlVar.c;
            nm nmVar2 = nm.d;
            if (nmVar == nmVar2) {
                throw new ApiScopeException("No user for session", apiInvocationException);
            }
            nm nmVar3 = nm.c;
            if (nmVar != nmVar3 || str2 != null) {
                tlVarC = tlVar;
            } else if (tlVar.b != null) {
                pmVar.getClass();
                tlVarC = tlVar;
            } else {
                tlVarC = pmVar.c(tlVar);
            }
            String str3 = tlVarC.c;
            if (nmVar == nmVar2 && str3 == null) {
                uidVar.a = new ApiScopeException("Couldn't provide session", apiInvocationException);
                return tlVarC;
            }
            if (nmVar == nmVar3 && str3 == null) {
                uidVar.a = new ApiScopeException("Couldn't provide anonymous session", apiInvocationException);
                return tlVarC;
            }
            uidVar2.a = tlVarC;
            return tlVarC;
        } catch (Throwable th) {
            uidVar.a = th;
            return tlVar;
        }
    }

    @Override // com.my.tracker.core.EngineCore.EventPacker
    public byte[] invoke(EngineCore.InsertEventTools insertEventTools) {
        return ((d) this.b).a(this.a, (String) this.c, (String) this.d, (String) this.o, (String) this.X, insertEventTools);
    }

    public /* synthetic */ pl(String str, nm nmVar, ql qlVar, ApiInvocationException apiInvocationException, uid uidVar, uid uidVar2) {
        this.a = str;
        this.b = nmVar;
        this.c = qlVar;
        this.d = apiInvocationException;
        this.o = uidVar;
        this.X = uidVar2;
    }
}
