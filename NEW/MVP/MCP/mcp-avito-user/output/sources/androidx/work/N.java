package androidx.work;

import android.content.Context;
import androidx.concurrent.futures.b;
import androidx.view.C23038g0;
import com.my.target.AbstractC37822y0;
import com.my.target.W0;
import e11.A0;
import e11.C39901r0;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class N implements b.c, W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f55390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55391c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f55392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f55393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f55394f;

    public /* synthetic */ N(androidx.work.impl.utils.taskexecutor.a aVar, C23540d c23540d, String str, Y41.a aVar2, C23038g0 c23038g0) {
        this.f55391c = aVar;
        this.f55392d = c23540d;
        this.f55390b = str;
        this.f55393e = aVar2;
        this.f55394f = c23038g0;
    }

    @Override // androidx.concurrent.futures.b.c
    public Object d(b.a aVar) {
        ((androidx.work.impl.utils.taskexecutor.a) this.f55391c).execute(new Ba1.n((C23540d) this.f55392d, this.f55390b, (Y41.a) this.f55393e, (C23038g0) this.f55394f, aVar, 1));
        return G0.f406611a;
    }

    public /* synthetic */ N(AbstractC37822y0.a aVar, String str, C39901r0 c39901r0, Context context, A0 a02) {
        this.f55391c = aVar;
        this.f55390b = str;
        this.f55392d = c39901r0;
        this.f55393e = context;
        this.f55394f = a02;
    }
}
