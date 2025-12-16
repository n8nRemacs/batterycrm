package u21;

import Y61.k;
import android.view.View;
import com.yandex.div.core.dagger.z;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.C38273c1;
import com.yandex.div2.H;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DivExtensionController.kt */
@z
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lu21/a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: u21.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C48774a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<InterfaceC48776c> f439734a;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public C48774a(@k List<? extends InterfaceC48776c> list) {
        this.f439734a = list;
    }

    public final void a(@k C38029k c38029k, @k View view, @k H h12) {
        if (b(h12)) {
            for (InterfaceC48776c interfaceC48776c : this.f439734a) {
                if (interfaceC48776c.matches(h12)) {
                    interfaceC48776c.bindView(c38029k, view, h12);
                }
            }
        }
    }

    public final boolean b(H h12) {
        List<C38273c1> listP = h12.p();
        return (listP == null || listP.isEmpty() || this.f439734a.isEmpty()) ? false : true;
    }

    public final void c(@k C38029k c38029k, @k View view, @k H h12) {
        if (b(h12)) {
            for (InterfaceC48776c interfaceC48776c : this.f439734a) {
                if (interfaceC48776c.matches(h12)) {
                    interfaceC48776c.unbindView(c38029k, view, h12);
                }
            }
        }
    }
}
