package com.avito.android.publish.slots.network_stores_fake_door_slot;

import android.view.View;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: NetworkStoresFakeDoorSlotItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/network_stores_fake_door_slot/p;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/network_stores_fake_door_slot/n;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComposeView f244636b;

    /* compiled from: NetworkStoresFakeDoorSlotItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f244637l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar) {
            super(2);
            this.f244637l = hVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-905363417, new o(this.f244637l), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    static {
        int i12 = ComposeView.f41092l;
    }

    public p(@Y61.k View view) {
        super(view);
        View viewFindViewById = this.itemView.findViewById(R.id.network_stores_fake_door_compose_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        }
        this.f244636b = (ComposeView) viewFindViewById;
    }

    @Override // com.avito.android.publish.slots.network_stores_fake_door_slot.n
    public final void PW(@Y61.k h hVar) {
        this.f244636b.setContent(new C22096n(224571618, new a(hVar), true));
    }
}
