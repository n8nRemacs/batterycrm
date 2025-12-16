package com.avito.beduin.v2.render.android_view;

import android.os.Bundle;
import android.view.View;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.render.android_view.r;
import com.avito.beduin.v2.render.android_view.s;
import j.InterfaceC42153i;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ContainerComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0005*\u00020\u00042\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\b\u0012\u0004\u0012\u00028\u00020\u0007:\u0001\b¨\u0006\t"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/q;", "T", "Landroid/view/View;", "V", "Lcom/avito/beduin/v2/engine/component/d;", "C", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/render/android_view/r;", "a", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class q<T, V extends View, C extends InterfaceC36244d> extends AbstractC36333c<T, V> implements r<C> {

    /* compiled from: ContainerComponent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/q$a;", "", "<init>", "()V", "", "CHILDREN_STATE_KEY", "Ljava/lang/String;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public q() {
        this(null, 1, null);
    }

    @Override // com.avito.beduin.v2.render.android_view.r
    public final void i(@Y61.k C c12, @Y61.k View view, @Y61.k s.c<C> cVar) {
        InterfaceC36243c interfaceC36243cA = r.a.a(c12.getF335853a());
        if ((interfaceC36243cA == null || interfaceC36243cA.getF335436j()) && cVar.h(c12)) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    @InterfaceC42153i
    public final void q(@Y61.k View view, @Y61.k Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("container_children_state");
        if (bundle2 != null) {
            u().b(bundle2);
        }
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    @InterfaceC42153i
    @Y61.l
    public final Bundle r(@Y61.k V v12) {
        Bundle bundleH = u().H();
        if (bundleH == null) {
            return null;
        }
        Bundle bundle = new Bundle(1);
        bundle.putBundle("container_children_state", bundleH);
        return bundle;
    }

    @Y61.k
    public abstract C u();

    /* JADX WARN: Illegal instructions before constructor call */
    public q(PT0.a[] aVarArr, int i12, C42822w c42822w) {
        aVarArr = (i12 & 1) != 0 ? new PT0.a[0] : aVarArr;
        super((PT0.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }
}
