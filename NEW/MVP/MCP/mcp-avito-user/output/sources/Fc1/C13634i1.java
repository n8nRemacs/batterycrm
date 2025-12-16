package Fc1;

import Fc1.C13602e5;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.i1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13634i1 extends kotlin.jvm.internal.N implements Y41.l<List<? extends Uri>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C13615g0 f5573l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H3 f5574m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13634i1(C13615g0 c13615g0, H3 h32) {
        super(1);
        this.f5573l = c13615g0;
        this.f5574m = h32;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(List<? extends Uri> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            Bitmap bitmapDecodeStream = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(this.f5574m.b().getContentResolver().openInputStream((Uri) it.next()));
            } catch (FileNotFoundException unused) {
            }
            if (bitmapDecodeStream != null) {
                arrayList.add(bitmapDecodeStream);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C13602e5.a.a((Bitmap) it2.next()));
        }
        int i12 = C13615g0.f5512s;
        C13615g0 c13615g0 = this.f5573l;
        c13615g0.d().addAll(arrayList2);
        c13615g0.f5784b.a(c13615g0.d());
        InterfaceC13642j0 interfaceC13642j0 = c13615g0.f5792j;
        (interfaceC13642j0 != null ? interfaceC13642j0 : null).a(c13615g0);
        return kotlin.G0.f406611a;
    }
}
