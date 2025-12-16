package com.avito.android.serp.adapter.snippet;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import java.util.List;
import jr.C42417b;
import jr.InterfaceC42416a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SnippetView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/snippet/i;", "LTV0/e;", "Ljr/a;", "b", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface i extends TV0.e, InterfaceC42416a {

    /* compiled from: SnippetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: SnippetView.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/snippet/i$b;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/snippet/i;", "Ljr/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.konveyor.adapter.b implements i, InterfaceC42416a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C42417b f272369b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Y41.l<? super Boolean, G0> f272370c;

        /* compiled from: SnippetView.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/serp/adapter/snippet/i$b$a", "Landroid/view/View$OnAttachStateChangeListener;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements View.OnAttachStateChangeListener {
            public a() {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(@k View view) {
                Y41.l<? super Boolean, G0> lVar = b.this.f272370c;
                if (lVar != null) {
                    lVar.invoke(Boolean.TRUE);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(@k View view) {
                Y41.l<? super Boolean, G0> lVar = b.this.f272370c;
                if (lVar != null) {
                    lVar.invoke(Boolean.FALSE);
                }
            }
        }

        public b(@k View view) {
            super(view);
            this.f272369b = new C42417b(view);
            view.addOnAttachStateChangeListener(new a());
        }

        @Override // jr.InterfaceC42416a
        public final void B7(@l Y41.a<G0> aVar) {
            this.f272369b.B7(aVar);
        }

        @Override // jr.InterfaceC42416a
        public final void G4(@l com.avito.android.image_loader.a aVar) {
            this.f272369b.G4(aVar);
        }

        @Override // jr.InterfaceC42416a
        public final void P2(@k CharSequence charSequence) {
            this.f272369b.P2(charSequence);
        }

        @Override // jr.InterfaceC42416a
        public final void h2(@k List<InterfaceC42416a.C11584a> list) {
            this.f272369b.h2(list);
        }

        @Override // com.avito.konveyor.adapter.b, TV0.e
        public final void j5() {
            this.f272370c = null;
            Iterator it = this.f272369b.f405834f.iterator();
            while (it.hasNext()) {
                ((TextView) it.next()).setOnClickListener(null);
            }
            B7(null);
        }

        @Override // jr.InterfaceC42416a
        public final void setCloseButtonVisible(boolean z12) {
            this.f272369b.setCloseButtonVisible(z12);
        }

        @Override // com.avito.android.serp.adapter.snippet.i
        public final void uX(@k Y41.l<? super Boolean, G0> lVar) {
            this.f272370c = lVar;
        }
    }

    void uX(@k Y41.l<? super Boolean, G0> lVar);
}
