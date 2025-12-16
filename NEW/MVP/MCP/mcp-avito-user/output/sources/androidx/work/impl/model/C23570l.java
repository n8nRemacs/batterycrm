package androidx.work.impl.model;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.work.impl.model.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C23570l implements Y41.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C23573o f55874c;

    public /* synthetic */ C23570l(C23573o c23573o, int i12) {
        this.f55873b = i12;
        this.f55874c = c23573o;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        HashMap<String, ArrayList<String>> map = (HashMap) obj;
        switch (this.f55873b) {
            case 0:
                this.f55874c.c(map);
                break;
            default:
                this.f55874c.b(map);
                break;
        }
        return G0.f406611a;
    }
}
