package Fc1;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.graphics.C22261k;
import androidx.compose.ui.graphics.InterfaceC22280q0;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;

/* loaded from: classes9.dex */
public final class V implements InterfaceC13784z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final V7 f5240a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C13724s2 f5241b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final L3 f5242c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<InterfaceC22280q0> f5243d;

    @Inject
    public V(@Y61.k V7 v72, @Y61.k C13724s2 c13724s2, @Y61.k L3 l32) {
        this.f5240a = v72;
        this.f5241b = c13724s2;
        this.f5242c = l32;
        int i12 = InterfaceC22280q0.f39746a;
        this.f5243d = C22126m3.g(O4.a());
    }

    @Override // Fc1.InterfaceC13784z
    @Y61.k
    public final InterfaceC22204y1<InterfaceC22280q0> a() {
        return this.f5243d;
    }

    @Override // Fc1.InterfaceC13784z
    public final void a(int i12, int i13, @Y61.k D4 d42) {
        C13724s2 c13724s2 = this.f5241b;
        ArrayList arrayList = c13724s2.f5813a;
        if (1 <= i13 && i13 < 101) {
            arrayList.add(Build.VERSION.SDK_INT >= 31 ? new C13573b3(i13) : new C13627h3(this.f5242c, i13));
        }
        if (1 <= i12 && i12 < 101) {
            arrayList.add(new C13564a3(i12, d42));
        }
        Bitmap bitmapA = this.f5240a.a();
        InterfaceC22204y1<InterfaceC22280q0> interfaceC22204y1 = this.f5243d;
        Iterator it = c13724s2.f5813a.iterator();
        while (it.hasNext()) {
            try {
                bitmapA = ((InterfaceC13590d2) it.next()).a(bitmapA);
            } catch (Exception unused) {
            }
        }
        ((C22082i3) interfaceC22204y1).setValue(new C22261k(bitmapA));
    }
}
