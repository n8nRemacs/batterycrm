package Vo0;

import Au.ViewOnClickListenerC13080b;
import Vo0.InterfaceC15701b;
import Vo0.InterfaceC15702c;
import Y41.l;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SbcFastChipsGroupView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"LVo0/i;", "LVo0/b;", "I", "LVo0/c;", "V", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i<I extends InterfaceC15701b, V extends InterfaceC15702c<I>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ViewGroup f17397a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15701b, G0> f17398b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p<I, ViewGroup, V> f17399c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final j f17400d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f17401e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public ArrayList f17402f;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@k ViewGroup viewGroup, @k l<? super InterfaceC15701b, G0> lVar, @k p<? super I, ? super ViewGroup, ? extends V> pVar, @k j jVar) {
        this.f17397a = viewGroup;
        this.f17398b = lVar;
        this.f17399c = pVar;
        this.f17400d = jVar;
        this.f17401e = new ArrayList();
    }

    public final void a(InterfaceC15701b interfaceC15701b, LinearLayout linearLayout) {
        V vInvoke = this.f17399c.invoke(interfaceC15701b, linearLayout);
        vInvoke.getF17396a().setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.5f));
        vInvoke.getF17396a().setOnClickListener(new ViewOnClickListenerC13080b(20, this, interfaceC15701b));
        this.f17401e.add(vInvoke);
        linearLayout.addView(vInvoke.getF17396a());
    }

    public final void b(@k ArrayList arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3 = this.f17402f;
        if (arrayList3 != null) {
            arrayList2 = new ArrayList(C42745f0.q(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((InterfaceC15701b) it.next()).getF16685b()));
            }
        } else {
            arrayList2 = null;
        }
        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Integer.valueOf(((InterfaceC15701b) it2.next()).getF16685b()));
        }
        boolean zF2 = L.f(arrayList2, arrayList4);
        ArrayList arrayList5 = this.f17401e;
        int i12 = 0;
        if (!zF2) {
            arrayList5.clear();
            ViewGroup viewGroup = this.f17397a;
            viewGroup.removeAllViews();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
            marginLayoutParams.setMargins(0, y6.b(6), 0, 0);
            viewGroup.setLayoutParams(marginLayoutParams);
            int size = arrayList.size() / 2;
            if (arrayList.size() % 2 != 0) {
                size++;
            }
            if (size >= 0) {
                int i13 = 0;
                while (true) {
                    LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
                    linearLayout.setOrientation(0);
                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    linearLayout.setPadding(0, this.f17400d.f17403a, 0, 0);
                    linearLayout.setWeightSum(1.0f);
                    linearLayout.setClipChildren(false);
                    linearLayout.setClipToPadding(false);
                    int i14 = i13 * 2;
                    if (arrayList.size() - 1 < i14) {
                        break;
                    }
                    a((InterfaceC15701b) arrayList.get(i14), linearLayout);
                    viewGroup.addView(linearLayout);
                    View view = new View(viewGroup.getContext());
                    view.setLayoutParams(new LinearLayout.LayoutParams(y6.b(12), -1));
                    linearLayout.addView(view);
                    int i15 = i14 + 1;
                    if (arrayList.size() - 1 < i15) {
                        break;
                    }
                    a((InterfaceC15701b) arrayList.get(i15), linearLayout);
                    if (i13 == size) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            int i16 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            InterfaceC15702c interfaceC15702c = (InterfaceC15702c) next;
            InterfaceC15701b interfaceC15701b = (InterfaceC15701b) arrayList.get(i12);
            interfaceC15702c.a(arrayList.get(i12));
            interfaceC15702c.getF17396a().setSelected(interfaceC15701b.getF16684a());
            i12 = i16;
        }
        this.f17402f = arrayList;
    }

    public /* synthetic */ i(ViewGroup viewGroup, l lVar, p pVar, j jVar, int i12, C42822w c42822w) {
        this(viewGroup, lVar, pVar, (i12 & 8) != 0 ? new j(y6.b(0)) : jVar);
    }
}
