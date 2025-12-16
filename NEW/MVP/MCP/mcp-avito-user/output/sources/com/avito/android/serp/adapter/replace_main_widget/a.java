package com.avito.android.serp.adapter.replace_main_widget;

import Em0.InterfaceC13505a;
import Em0.InterfaceC13506b;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReplaceMainItemViewHolder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/replace_main_widget/a;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f270677b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13505a f270678c;

    /* compiled from: ReplaceMainItemViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.replace_main_widget.a$a, reason: collision with other inner class name */
    public static final class C8066a extends N implements Y41.a<G0> {
        public C8066a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y41.a<G0> aVar = a.this.f270677b;
            if (aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    public a(@Y61.k View view, @Y61.k InterfaceC13506b interfaceC13506b) {
        super(view);
        ViewGroup viewGroup = (ViewGroup) view;
        com.avito.android.replace_main.widget.g gVarA = interfaceC13506b.a(new InterfaceC13506b.a(viewGroup.getContext(), new C8066a()));
        this.f270678c = gVarA;
        viewGroup.addView(gVarA.f254692d);
    }
}
