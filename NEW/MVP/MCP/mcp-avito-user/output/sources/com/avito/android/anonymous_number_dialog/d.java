package com.avito.android.anonymous_number_dialog;

import androidx.fragment.app.DialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AnonymousNumberDialogHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class d extends N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f91275l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AnonymousNumberDialogLink f91276m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, AnonymousNumberDialogLink anonymousNumberDialogLink) {
        super(0);
        this.f91275l = eVar;
        this.f91276m = anonymousNumberDialogLink;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        e eVar = this.f91275l;
        AnonymousNumberDialogLink anonymousNumberDialogLink = this.f91276m;
        return eVar.f91279h.a(new AnonymousNumberDialogArguments(anonymousNumberDialogLink.f91269b, anonymousNumberDialogLink.f91270c, anonymousNumberDialogLink.f91271d, anonymousNumberDialogLink.f91272e, anonymousNumberDialogLink.f91273f));
    }
}
