package wa1;

import android.graphics.Bitmap;
import java.util.ArrayList;
import kotlin.jvm.internal.N;
import ya1.C50207c;

/* loaded from: classes9.dex */
public final class m extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f441606l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bitmap f441607m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f441608n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, Bitmap bitmap, ArrayList arrayList) {
        super(0);
        this.f441606l = pVar;
        this.f441607m = bitmap;
        this.f441608n = arrayList;
    }

    @Override // Y41.a
    public final Object invoke() {
        C50207c c50207c = this.f441606l.f441614a;
        return C50207c.c(this.f441607m, this.f441608n);
    }
}
