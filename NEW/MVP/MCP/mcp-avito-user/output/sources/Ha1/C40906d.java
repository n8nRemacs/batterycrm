package ha1;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N0;

/* renamed from: ha1.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40906d extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.camera.i f397230l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40906d(ru.mts.biometry.sdk.feature.recognition.ui.camera.i iVar) {
        super(1);
        this.f397230l = iVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ru.mts.biometry.sdk.feature.recognition.ui.camera.i iVar = this.f397230l;
        w wVarI5 = iVar.i5();
        if (bitmap != null) {
            Context contextRequireContext = iVar.requireContext();
            int size = wVarI5.f397271L.f397252b.size() + 1;
            p pVar = wVarI5.f397271L;
            if (size >= pVar.f397251a) {
                N0 n02 = wVarI5.f397272M;
                if (n02 == null || !((AbstractC43075a) n02).isActive()) {
                    wVarI5.f397269J.f17823e = true;
                    wVarI5.f397272M = C43259k.d(androidx.view.N0.a(wVarI5), C43262l0.f411947c, null, new v(wVarI5, bitmap, contextRequireContext, null), 2);
                }
            } else {
                wVarI5.f397271L = new p(pVar.f397251a, C42745f0.i0(bitmap, pVar.f397252b));
            }
        }
        return G0.f406611a;
    }
}
