package com.avito.android.cart_sheet_after_adding.ui;

import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.ComposeView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CartSheetAfterAddingDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.cart_sheet_after_adding.ui.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class RunnableC29345k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComposeView f115611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CartSheetAfterAddingDialogFragment f115612c;

    /* compiled from: CartSheetAfterAddingDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.cart_sheet_after_adding.ui.k$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CartSheetAfterAddingDialogFragment f115613l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CartSheetAfterAddingDialogFragment cartSheetAfterAddingDialogFragment) {
            super(2);
            this.f115613l = cartSheetAfterAddingDialogFragment;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(1593018707, new C29344j(this.f115613l), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    public RunnableC29345k(ComposeView composeView, CartSheetAfterAddingDialogFragment cartSheetAfterAddingDialogFragment) {
        this.f115611b = composeView;
        this.f115612c = cartSheetAfterAddingDialogFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f115611b.setContent(new C22096n(1233751502, new a(this.f115612c), true));
    }
}
