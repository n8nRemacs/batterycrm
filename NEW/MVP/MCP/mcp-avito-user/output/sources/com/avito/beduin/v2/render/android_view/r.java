package com.avito.beduin.v2.render.android_view;

import android.view.View;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.android_view.s;
import kotlin.Metadata;

/* compiled from: ContainerComponentLifecycle.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/r;", "Lcom/avito/beduin/v2/engine/component/d;", "C", "", "Lcom/avito/beduin/v2/engine/component/i;", "componentState", "Lcom/avito/beduin/v2/engine/component/c;", "getComponentBaseState", "(Lcom/avito/beduin/v2/engine/component/i;)Lcom/avito/beduin/v2/engine/component/c;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface r<C extends InterfaceC36244d> {

    /* compiled from: ContainerComponentLifecycle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static InterfaceC36243c a(InterfaceC36249i interfaceC36249i) {
            Object state = interfaceC36249i.getState();
            if (state instanceof com.avito.beduin.v2.engine.component.n) {
                return a(((com.avito.beduin.v2.engine.component.n) state).c());
            }
            if (state instanceof InterfaceC36243c) {
                return (InterfaceC36243c) state;
            }
            return null;
        }
    }

    void i(@Y61.k C c12, @Y61.k View view, @Y61.k s.c<C> cVar);
}
