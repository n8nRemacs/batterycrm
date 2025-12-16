package com.avito.android.recall_me.presentation;

import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import zi0.InterfaceC50572b;

/* compiled from: RecallMeFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzi0/b;", "it", "Lkotlin/G0;", "accept", "(Lzi0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.recall_me.presentation.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34237g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecallMeFragment f251931b;

    public C34237g(RecallMeFragment recallMeFragment) {
        this.f251931b = recallMeFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC50572b interfaceC50572b = (InterfaceC50572b) obj;
        boolean z12 = interfaceC50572b instanceof InterfaceC50572b.c;
        RecallMeFragment recallMeFragment = this.f251931b;
        if (!z12) {
            if (interfaceC50572b instanceof InterfaceC50572b.C12968b) {
                recallMeFragment.f251908u0.b(interfaceC50572b);
                return;
            }
            return;
        }
        ActivityC22955m activityC22955mL1 = recallMeFragment.l1();
        if (activityC22955mL1 != null) {
            Intent intent = new Intent();
            InterfaceC50572b.c cVar = (InterfaceC50572b.c) interfaceC50572b;
            intent.putExtra("recall_me_message", cVar.f444186a);
            intent.putExtra("recall_me_request_id", cVar.f444187b);
            G0 g02 = G0.f406611a;
            activityC22955mL1.setResult(-1, intent);
        }
        ActivityC22955m activityC22955mL12 = recallMeFragment.l1();
        if (activityC22955mL12 != null) {
            K2.c(activityC22955mL12);
        }
        ActivityC22955m activityC22955mL13 = recallMeFragment.l1();
        if (activityC22955mL13 != null) {
            activityC22955mL13.finish();
        }
    }
}
