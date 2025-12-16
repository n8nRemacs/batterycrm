package wa1;

import android.graphics.Bitmap;
import java.util.ArrayList;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class i extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f441596l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bitmap f441597m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f441598n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, Bitmap bitmap, ArrayList arrayList) {
        super(0);
        this.f441596l = pVar;
        this.f441597m = bitmap;
        this.f441598n = arrayList;
    }

    @Override // Y41.a
    public final Object invoke() {
        ArrayList arrayList = this.f441598n;
        this.f441596l.getClass();
        int iMax = Math.max(((int[]) arrayList.get(0))[0], ((int[]) arrayList.get(5))[0]);
        int iMin = Math.min(((int[]) arrayList.get(1))[0], ((int[]) arrayList.get(2))[0]);
        int iMax2 = Math.max(((int[]) arrayList.get(0))[1], ((int[]) arrayList.get(1))[1]);
        return Bitmap.createBitmap(this.f441597m, iMax, iMax2, ((int) (((iMin - iMax) * 0.2f) + iMax)) - iMax, Math.min(((int[]) arrayList.get(5))[1], ((int[]) arrayList.get(2))[1]) - iMax2);
    }
}
