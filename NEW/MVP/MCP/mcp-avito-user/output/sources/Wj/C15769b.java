package Wj;

import Y61.k;
import Zj.b;
import androidx.fragment.app.Fragment;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.google.common.collect.H1;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TabStubFragmentFactoryImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWj/b;", "LZj/b;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wj.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15769b implements Zj.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final H1 f18022a;

    @Inject
    public C15769b(@k H1 h12) {
        this.f18022a = h12;
    }

    @Override // Zj.b
    @k
    public final Fragment a(@k NavigationTabSetItem navigationTabSetItem) {
        Object next;
        Iterator<E> it = this.f18022a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((f) next).getType(), navigationTabSetItem)) {
                break;
            }
        }
        if (next != null) {
            return ((f) next).b();
        }
        throw new IllegalStateException(("No TabStubFragmentTypedFactory for tab " + navigationTabSetItem).toString());
    }

    @Override // Zj.b
    @k
    public final b.a b(@k NavigationTabSetItem navigationTabSetItem) {
        Object next;
        Iterator<E> it = this.f18022a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((f) next).getType(), navigationTabSetItem)) {
                break;
            }
        }
        if (next != null) {
            return ((f) next).a();
        }
        throw new IllegalStateException(("No TabStubFragmentFactory.Data for tab " + navigationTabSetItem).toString());
    }
}
