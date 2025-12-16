package com.avito.android.profile.horizontal_scroll_widget;

import Y61.k;
import Y61.l;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HorizontalScrollViewExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b {

    /* compiled from: HorizontalScrollViewExtensions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f222327l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f222327l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f222327l.invoke();
            return G0.f406611a;
        }
    }

    public static final void a(@k HorizontalScrollView horizontalScrollView, @l String str, @k Y41.a<G0> aVar) {
        if (str == null) {
            D6.w(horizontalScrollView.f222313h);
            horizontalScrollView.setOnActionButtonClickListener(null);
        } else {
            D6.H(horizontalScrollView.f222313h);
            horizontalScrollView.setActionButtonText(str);
            horizontalScrollView.setOnActionButtonClickListener(new a(aVar));
        }
    }
}
