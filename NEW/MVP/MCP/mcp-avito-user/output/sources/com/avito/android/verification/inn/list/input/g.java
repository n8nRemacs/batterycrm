package com.avito.android.verification.inn.list.input;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InputItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/inn/list/input/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Input f324054b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ComponentContainer f324055c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.l<? super String, G0> f324056d;

    /* compiled from: InputItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            g gVar = g.this;
            Y41.l<? super String, G0> lVar = gVar.f324056d;
            if (lVar != null) {
                lVar.invoke(String.valueOf(gVar.f324054b.m53getText()));
            }
            return G0.f406611a;
        }
    }

    public g(@k View view) {
        super(view);
        Input input = (Input) view.findViewById(R.id.verification_item_input);
        this.f324054b = input;
        this.f324055c = (ComponentContainer) view.findViewById(R.id.verification_item_input_container);
        n.c(input, new a());
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f324056d = null;
    }
}
