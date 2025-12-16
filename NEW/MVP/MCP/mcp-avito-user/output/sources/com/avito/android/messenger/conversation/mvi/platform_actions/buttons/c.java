package com.avito.android.messenger.conversation.mvi.platform_actions.buttons;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.platform_actions.f;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ButtonsConfirmationDialogView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/buttons/c;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/buttons/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.messenger.conversation.mvi.platform_actions.buttons.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f193829a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f193830b = new com.jakewharton.rxrelay3.c();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f193831c = new com.jakewharton.rxrelay3.c();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f193832d = C42727D.b(LazyThreadSafetyMode.f406616d, new a());

    /* compiled from: ButtonsConfirmationDialogView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/confirmation_dialog/a;", "invoke", "()Lcom/avito/android/messenger/conversation/confirmation_dialog/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.android.messenger.conversation.confirmation_dialog.a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.messenger.conversation.confirmation_dialog.a invoke() {
            return new com.avito.android.messenger.conversation.confirmation_dialog.a(c.this.f193829a);
        }
    }

    /* compiled from: ButtonsConfirmationDialogView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ f.a f193835m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f.a aVar) {
            super(0);
            this.f193835m = aVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final G0 invoke() {
            c cVar = c.this;
            ((com.avito.android.messenger.conversation.confirmation_dialog.a) cVar.f193832d.getValue()).a();
            cVar.f193830b.accept(this.f193835m);
            return G0.f406611a;
        }
    }

    /* compiled from: ButtonsConfirmationDialogView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.buttons.c$c, reason: collision with other inner class name */
    public static final class C5731c extends N implements Y41.a<G0> {
        public C5731c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c cVar = c.this.f193831c;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    public c(@Y61.k Context context) {
        this.f193829a = context;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final void a(@Y61.l f.e eVar, @Y61.l f.e eVar2) {
        ?? r02 = this.f193832d;
        if (eVar == null) {
            if (L.f(eVar2, f.e.a.f193896a) || eVar2 == null) {
                ((com.avito.android.messenger.conversation.confirmation_dialog.a) r02.getValue()).a();
                return;
            } else {
                if (eVar2 instanceof f.e.b) {
                    f.e.b bVar = (f.e.b) eVar2;
                    b(bVar.f193898b, bVar.f193897a);
                    return;
                }
                return;
            }
        }
        f.e.a aVar = f.e.a.f193896a;
        if (eVar.equals(aVar)) {
            if (L.f(eVar2, aVar) || eVar2 == null || !(eVar2 instanceof f.e.b)) {
                return;
            }
            f.e.b bVar2 = (f.e.b) eVar2;
            b(bVar2.f193898b, bVar2.f193897a);
            return;
        }
        if (eVar instanceof f.e.b) {
            if (L.f(eVar2, aVar) || eVar2 == null) {
                ((com.avito.android.messenger.conversation.confirmation_dialog.a) r02.getValue()).a();
            } else {
                if (!(eVar2 instanceof f.e.b) || eVar.equals(eVar2)) {
                    return;
                }
                f.e.b bVar3 = (f.e.b) eVar2;
                b(bVar3.f193898b, bVar3.f193897a);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final void b(f.a aVar, f.d dVar) {
        ?? r02 = this.f193832d;
        ((com.avito.android.messenger.conversation.confirmation_dialog.a) r02.getValue()).a();
        ((com.avito.android.messenger.conversation.confirmation_dialog.a) r02.getValue()).c(new ActionConfirmation(dVar.f193892a, dVar.f193893b, dVar.f193894c, dVar.f193895d), new b(aVar), new C5731c());
    }
}
