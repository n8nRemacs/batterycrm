package androidx.work.impl.model;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class M implements Y41.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f55845c;

    public /* synthetic */ M(e0 e0Var, int i12) {
        this.f55844b = i12;
        this.f55845c = e0Var;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        HashMap<String, ArrayList<String>> map = (HashMap) obj;
        switch (this.f55844b) {
            case 0:
                this.f55845c.I(map);
                break;
            default:
                this.f55845c.H(map);
                break;
        }
        return G0.f406611a;
    }
}
