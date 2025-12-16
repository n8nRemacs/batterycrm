package com.avito.android.recall_me.presentation;

import android.content.Context;
import android.content.Intent;
import com.avito.android.code_confirmation.code_confirmation.InterfaceC29390c;
import i.AbstractC41201a;
import kotlin.Metadata;
import zi0.InterfaceC50572b;

/* compiled from: RecallMeFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recall_me/presentation/f;", "Li/a;", "Lzi0/b$b;", "", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.recall_me.presentation.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34236f extends AbstractC41201a<InterfaceC50572b.C12968b, String> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecallMeFragment f251930b;

    public C34236f(RecallMeFragment recallMeFragment) {
        this.f251930b = recallMeFragment;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, InterfaceC50572b.C12968b c12968b) {
        InterfaceC50572b.C12968b c12968b2 = c12968b;
        InterfaceC29390c interfaceC29390c = this.f251930b.f251903p0;
        if (interfaceC29390c == null) {
            interfaceC29390c = null;
        }
        return interfaceC29390c.a(c12968b2.f444184a, c12968b2.f444185b);
    }

    @Override // i.AbstractC41201a
    public final String parseResult(int i12, Intent intent) {
        if (i12 != -1 || intent == null) {
            return null;
        }
        return intent.getStringExtra("recall_me_result_key");
    }
}
