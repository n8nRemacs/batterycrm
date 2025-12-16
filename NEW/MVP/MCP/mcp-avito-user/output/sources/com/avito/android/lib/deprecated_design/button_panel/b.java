package com.avito.android.lib.deprecated_design.button_panel;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import hw.InterfaceC41179d;
import iR.C41336a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ButtonPanel.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/button_panel/b;", "Lcom/avito/android/lib/deprecated_design/button_panel/a;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class b implements com.avito.android.lib.deprecated_design.button_panel.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f177876a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f177877b;

    /* compiled from: ButtonPanel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f177878l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f177878l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            C41336a.C11375a.a();
            this.f177878l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: ButtonPanel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.lib.deprecated_design.button_panel.b$b, reason: collision with other inner class name */
    public static final class C5242b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f177879l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5242b(Y41.a<G0> aVar) {
            super(0);
            this.f177879l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            C41336a.C11375a.a();
            this.f177879l.invoke();
            return G0.f406611a;
        }
    }

    public b(@k View view) {
        View viewFindViewById = view.findViewById(R.id.primary_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f177876a = new com.avito.android.lib.deprecated_design.button.c(viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.secondary_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f177877b = new com.avito.android.lib.deprecated_design.button.c(viewFindViewById2);
    }

    public final void a(@l Y41.a<G0> aVar) {
        this.f177876a.c(new a(aVar));
    }

    public final void b(@l Y41.a<G0> aVar) {
        this.f177877b.c(new C5242b(aVar));
    }
}
