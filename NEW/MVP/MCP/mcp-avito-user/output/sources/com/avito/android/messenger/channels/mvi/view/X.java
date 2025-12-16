package com.avito.android.messenger.channels.mvi.view;

import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelsListView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class X implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f188720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f188721c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f188722d;

    /* compiled from: ChannelsListView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ H f188723l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(H h12) {
            super(0);
            this.f188723l = h12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c<G0> cVar = this.f188723l.f188655C;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    /* compiled from: ChannelsListView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ H f188724l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(H h12) {
            super(0);
            this.f188724l = h12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c<G0> cVar = this.f188724l.f188655C;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    public X(H h12, String str, String str2) {
        this.f188720b = h12;
        this.f188721c = str;
        this.f188722d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H h12 = this.f188720b;
        if (h12.f188663b.isAttachedToWindow() && h12.f188663b.isAttachedToWindow()) {
            if (!h12.f188666e) {
                h12.f188678q = com.avito.android.component.toast.b.b(h12.f188677p, this.f188721c, 0, this.f188722d, 0, new b(h12), Integer.MAX_VALUE, ToastBarPosition.f181044b, f.a.f125253a, null, 130826);
                return;
            }
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(this.f188721c);
            a aVar = new a(h12);
            h12.f188679r = com.avito.android.component.toast.c.b(cVar, h12.f188677p, printableTextF, null, Collections.singletonList(new c.a.C3719a(this.f188722d, true, null, aVar, 4, null)), null, null, Integer.MAX_VALUE, null, null, false, false, null, null, 4058);
        }
    }
}
