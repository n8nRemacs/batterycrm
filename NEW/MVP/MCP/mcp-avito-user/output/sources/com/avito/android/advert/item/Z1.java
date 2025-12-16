package com.avito.android.advert.item;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import com.avito.android.util.p6;
import com.avito.android.util.q6;
import com.avito.beduin.v2.render.android_view.BeduinView;
import java.util.Iterator;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.collections.C42754k;
import kotlinx.coroutines.C43259k;

/* compiled from: AdvertDetailsView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Z1 {

    /* compiled from: AdvertDetailsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f72337b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l lVar) {
            this.f72337b = (kotlin.jvm.internal.N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return this.f72337b.equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f72337b;
        }

        public final int hashCode() {
            return this.f72337b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f72337b.invoke(obj);
        }
    }

    public static final void a(View view, long j12, kotlinx.coroutines.M m12, Y41.a aVar) {
        InterfaceC22983P interfaceC22983PA = androidx.view.V0.a(view);
        if (interfaceC22983PA != null) {
            C43259k.d(C22981N.a(interfaceC22983PA.getLifecycle()), m12, null, new Y1(j12, aVar, null), 2);
        }
    }

    public static final RecyclerView b(BeduinView beduinView) {
        C42754k c42754k = new C42754k();
        c42754k.addFirst(beduinView);
        while (!c42754k.isEmpty()) {
            View view = (View) c42754k.removeFirst();
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            if (view instanceof ViewGroup) {
                Iterator<View> it = new q6((ViewGroup) view).iterator();
                while (true) {
                    p6 p6Var = (p6) it;
                    if (p6Var.hasNext()) {
                        c42754k.addLast((View) p6Var.next());
                    }
                }
            }
        }
        return null;
    }
}
