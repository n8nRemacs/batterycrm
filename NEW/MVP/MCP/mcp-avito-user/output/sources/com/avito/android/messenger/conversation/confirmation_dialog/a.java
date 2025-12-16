package com.avito.android.messenger.conversation.confirmation_dialog;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.util.g;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConfirmationDialogView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/confirmation_dialog/a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f189483a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.modal.a f189484b;

    /* compiled from: ConfirmationDialogView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.confirmation_dialog.a$a, reason: collision with other inner class name */
    public static final class C5586a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C5586a f189485l = new C5586a();

        public C5586a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: ConfirmationDialogView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<a.b, DialogInterface, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ActionConfirmation f189486l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f189487m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ a f189488n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ N f189489o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ActionConfirmation actionConfirmation, Y41.a<G0> aVar, a aVar2, Y41.a<G0> aVar3) {
            super(2);
            this.f189486l = actionConfirmation;
            this.f189487m = (N) aVar;
            this.f189488n = aVar2;
            this.f189489o = (N) aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            DialogInterface dialogInterface2 = dialogInterface;
            ActionConfirmation actionConfirmation = this.f189486l;
            bVar2.setTitle(actionConfirmation.getTitle());
            bVar2.setSubtitle(actionConfirmation.getMessage());
            bVar2.setButtonsOrientation(1);
            String confirmButtonText = actionConfirmation.getConfirmButtonText();
            ?? r32 = this.f189487m;
            a aVar = this.f189488n;
            bVar2.L3(confirmButtonText, new com.avito.android.messenger.conversation.confirmation_dialog.b(r32, dialogInterface2, aVar));
            bVar2.M3(actionConfirmation.getCancelButtonText(), new c(dialogInterface2, aVar));
            ?? r02 = this.f189489o;
            bVar2.b(new d(r02));
            bVar2.P3(new e(r02));
            return G0.f406611a;
        }
    }

    public a(@k Context context) {
        this.f189483a = context;
    }

    public final void a() {
        com.avito.android.lib.design.modal.a aVar = this.f189484b;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public final void b(@k ActionConfirmation actionConfirmation, @k Y41.a<G0> aVar) {
        c(actionConfirmation, aVar, C5586a.f189485l);
    }

    public final void c(@k ActionConfirmation actionConfirmation, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        a();
        com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, this.f189483a, new b(actionConfirmation, aVar, this, aVar2));
        this.f189484b = aVarC;
        g.a(aVarC);
    }
}
