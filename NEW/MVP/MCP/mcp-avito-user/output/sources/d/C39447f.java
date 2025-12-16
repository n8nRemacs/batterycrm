package d;

import android.graphics.Color;
import gc1.C40660d;
import gc1.InterfaceC40658b;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Z;
import kotlin.collections.C42784z0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import sberid.sdk.ui.models.root.ELKRootTypes;

/* renamed from: d.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39447f {

    /* renamed from: a, reason: collision with root package name */
    public final D31.a f393121a;

    /* renamed from: b, reason: collision with root package name */
    public final Hc1.a f393122b;

    /* renamed from: c, reason: collision with root package name */
    public final G41.a f393123c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f393124d = new ConcurrentHashMap();

    public C39447f(D31.a aVar, Hc1.a aVar2, G41.a aVar3) {
        this.f393121a = aVar;
        this.f393122b = aVar2;
        this.f393123c = aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(C39447f c39447f, String str, gc1.f fVar, ELKRootTypes eLKRootTypes) {
        Object bVar;
        Object bVar2;
        gc1.e eVarA = fVar.getProperty();
        List<C40660d> listB = fVar.b();
        InterfaceC40658b.k kVar = new InterfaceC40658b.k(eVarA, str, null, null, listB != null ? hc1.b.a(listB) : C42784z0.f406748b, eLKRootTypes, 12, null);
        G41.a aVar = c39447f.f393123c;
        gc1.e eVar = kVar.f396573a;
        if (eVar != null) {
            G41.i iVar = (G41.i) aVar;
            N41.g gVar = (N41.g) iVar.f6332c.getValue();
            try {
                int i12 = Z.f406624c;
                bVar = Integer.valueOf(Color.parseColor(eVar.getThemeColorLight()));
            } catch (Throwable th2) {
                int i13 = Z.f406624c;
                bVar = new Z.b(th2);
            }
            if (bVar instanceof Z.b) {
                bVar = null;
            }
            Integer num = (Integer) bVar;
            try {
                bVar2 = Integer.valueOf(Color.parseColor(eVar.getThemeColorDark()));
            } catch (Throwable th3) {
                int i14 = Z.f406624c;
                bVar2 = new Z.b(th3);
            }
            if (bVar2 instanceof Z.b) {
                bVar2 = null;
            }
            Integer num2 = (Integer) bVar2;
            String partnerName = eVar.getPartnerName();
            if (partnerName == null) {
                partnerName = gVar.f11194a;
            }
            if (num == null) {
                num = gVar.f11195b;
            }
            if (num2 == null) {
                num2 = gVar.f11196c;
            }
            gVar.getClass();
            iVar.a(N41.g.a(gVar, partnerName, num, num2, 16));
        }
        G41.i iVar2 = (G41.i) aVar;
        C43259k.d((T) ((D31.g) iVar2.f6330a).f2880a.getValue(), null, null, new G41.d(iVar2, str == null ? "" : str, kVar, null), 3);
        if (str == null) {
            str = "";
        }
        iVar2.b(str, !kVar.c());
    }
}
