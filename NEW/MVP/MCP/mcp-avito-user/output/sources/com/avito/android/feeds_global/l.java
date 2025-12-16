package com.avito.android.feeds_global;

import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FeedsViewImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/feeds_global/l;", "Lcom/avito/android/feeds_global/j;", "Lcom/avito/konveyor/adapter/b;", "_avito_bx-content_widget_feeds-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    public final int f157926b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ComposeView f157927c;

    /* compiled from: FeedsViewImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f157928l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(2);
            this.f157928l = str;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, r.c(442873676, new k(this.f157928l), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    static {
        int i12 = ComposeView.f41092l;
    }

    public l(@Y61.k View view, int i12) {
        super(view);
        this.f157926b = i12;
        View viewFindViewById = view.findViewById(R.id.compose_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        }
        ComposeView composeView = (ComposeView) viewFindViewById;
        this.f157927c = composeView;
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
    }

    @Override // com.avito.android.feeds_global.j
    public final void n50(@Y61.k String str) {
        ComposeView composeView = this.f157927c;
        ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = this.f157926b;
        composeView.setLayoutParams(layoutParams);
        composeView.setContent(new C22096n(2025865009, new a(str), true));
    }
}
