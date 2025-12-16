package com.avito.android.auto_evidence_request.mvi;

import Ce.InterfaceC13295c;
import Y61.l;
import com.avito.android.auto_evidence_request.di.o;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutoEvidenceRequestBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_evidence_request/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "LCe/c;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements com.avito.android.arch.mvi.b<InterfaceC13295c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.auto_evidence_request.d f95257a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f95258b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f95259c;

    @Inject
    public c(@Y61.k com.avito.android.auto_evidence_request.d dVar, @Y61.k @o String str, boolean z12) {
        this.f95257a = dVar;
        this.f95258b = str;
        this.f95259c = z12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC13295c> a() {
        return this.f95259c ? C43175k.w() : this.f95257a.a(this.f95258b);
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
