package wa1;

import android.graphics.Bitmap;
import java.util.ArrayList;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class k extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f441601l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bitmap f441602m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f441603n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, Bitmap bitmap, ArrayList arrayList) {
        super(0);
        this.f441601l = pVar;
        this.f441602m = bitmap;
        this.f441603n = arrayList;
    }

    @Override // Y41.a
    public final Object invoke() {
        ArrayList arrayList = this.f441603n;
        this.f441601l.getClass();
        int iMax = Math.max(((int[]) arrayList.get(0))[0], ((int[]) arrayList.get(5))[0]);
        int iMin = Math.min(((int[]) arrayList.get(1))[0], ((int[]) arrayList.get(2))[0]);
        int iMax2 = Math.max(((int[]) arrayList.get(0))[1], ((int[]) arrayList.get(1))[1]);
        int i12 = iMin - iMax;
        float f12 = iMax;
        float f13 = i12;
        int i13 = (int) ((0.7f * f13) + f12);
        return Bitmap.createBitmap(this.f441602m, i13, iMax2, ((int) ((f13 * 0.9f) + f12)) - i13, Math.min(((int[]) arrayList.get(5))[1], ((int[]) arrayList.get(2))[1]) - iMax2);
    }
}
